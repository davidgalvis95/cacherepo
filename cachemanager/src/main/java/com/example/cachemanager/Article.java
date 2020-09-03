package com.example.cachemanager;

import lombok.Builder;


@Builder
public class Article
{
    private Long articleId;
    private String content;
    private int likes;


    public Long getArticleId()
    {
        return articleId;
    }


    public void setArticleId( final Long articleId )
    {
        this.articleId = articleId;
    }


    public String getContent()
    {
        return content;
    }


    public void setContent( final String content )
    {
        this.content = content;
    }


    public int getLikes()
    {
        return likes;
    }


    public void setLikes( final int likes )
    {
        this.likes = likes;
    }
}
