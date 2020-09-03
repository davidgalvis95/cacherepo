package com.example.cachemanager;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith( JUnit4.class)
public class CachingArticlesServiceTest
{

    ArticleRepository a = new ArticleRepositoryImpl();
    CachingArticlesService cachingArticlesService = new CachingArticlesService(a);
    private Article newArt;

    @Before
    public void setUp(){

        newArt = Article.builder()
               .articleId( 1L )
               .content( "fkhdsjhfds" )
               .likes( 12 )
               .build();
    }

    @Test
    public void getArticle()
    {
        Article article = cachingArticlesService.getArticle( 1L );
        assertEquals( article.getContent(), newArt.getContent() );
        assertEquals( article.getLikes(), 12 );
        assertEquals( article.getArticleId(), 1 );
    }


    @Test
    public void removeArticle()
    {
    }


    @Test
    public void saveArticle()
    {
    }


    @Test
    public void updateLikes()
    {
    }
}