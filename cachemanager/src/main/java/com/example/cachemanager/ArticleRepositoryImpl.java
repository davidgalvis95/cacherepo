package com.example.cachemanager;

import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.jeasy.random.EasyRandom;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;


@Repository
@Slf4j
public class ArticleRepositoryImpl
      implements ArticleRepository
{
    EasyRandom easy  = new EasyRandom();

    @Override
    public void save( final Article article )
    {
        log.info( "repo save is called" );
    }


    @Override
    public Article get( final Long articleId )
    {
        log.info( "repo get is called" );
        return buildArticle(articleId);
    }


    @Override
    public void remove( final Long articleId )
    {
        log.info( "repo remove is called" );
    }


    @Override
    public Article updateLikes( final Long articleId,
                                final int likes )
    {
        log.info( "repo update is called" );
        var article = this.get( articleId );
        article.setLikes( likes );
        return article;
    }

    Article buildArticle( Long articleId){
        return Article.builder()
               .articleId( articleId )
               .content( "fkhdsjhfds" )
               .likes( 12 )
               .build();
    }
}
