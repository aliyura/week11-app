package com.decagon.week11.services;

import com.decagon.week11.entities.Article;
import com.decagon.week11.repositories.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ArticleService {

    private  final ArticleRepository repository;

    public String addArticle(String title, String description) {

        Article article = new Article();
        article.setTitle(title);
        article.setDescription(description);

        repository.save(article);

        return "Articled saved successfully";
    }

    public List<Article> getArticles(){
        return  repository.findAll();
    }
}
