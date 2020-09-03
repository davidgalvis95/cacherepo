package com.example.cachemanager;

public interface ArticlesService
{
    Article getArticle( Long articleId );

    void removeArticle( Long articleId );

    void saveArticle( Article article );

    Article updateLikes( Long articleId,
                         int likes );
}
