package com.example.cachemanager;

import org.jeasy.random.EasyRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CachePut;



@Service
@CacheConfig( cacheNames={ "articles"})
public class CachingArticlesService implements ArticlesService
{

    //@Autowired
    ArticleRepository repo;


    @Autowired
    public CachingArticlesService( final ArticleRepository repo )
    {
        this.repo = repo;
    }


    EasyRandom easy = new EasyRandom();


    @Override
    @Cacheable("articles")
    public Article getArticle( Long articleId ) {

        Article article = repo.get(articleId);
        return article;
    }

    @Override
    @CacheEvict("articles")
    public void removeArticle( Long articleId ) {
        repo.remove( articleId );
    }

    @Override
    @Cacheable("articles")
    public void saveArticle( Article article ) {
        repo.save( article );
    }

    @Override
    @CachePut("articles")
    public Article updateLikes( Long articleId,
                                int likes ) {
        Article article = repo.updateLikes( articleId, likes );

        return article;
    }
}

