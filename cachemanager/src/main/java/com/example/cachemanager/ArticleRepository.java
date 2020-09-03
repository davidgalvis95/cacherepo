package com.example.cachemanager;


public interface ArticleRepository
{
    void save(Article article);

    Article get(Long articleId);

    void remove(Long articleId);

    Article updateLikes( Long articleId,
                         int likes );

}
