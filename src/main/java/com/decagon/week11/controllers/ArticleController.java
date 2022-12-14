package com.decagon.week11.controllers;

import com.decagon.week11.entities.Article;
import com.decagon.week11.services.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("article")
public class ArticleController {


    private final ArticleService articleService;

    @PostMapping("/api/v1/article")
    public String addArticle(@RequestParam("title") String t, @RequestParam("desc") String desc){
        articleService.addArticle(t,desc);
        return  "Added Successfully";
    }


    @GetMapping("/api/v1/list")
    public List<Article> getArticles(){
        return articleService.getArticles();
    }
}
