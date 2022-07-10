package com.kth.exam.demo1.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kth.exam.demo1.service.ArticleService;
import com.kth.exam.demo1.vo.Article;

@Controller
public class UsrArticleController {
	private ArticleService articleService;
	
	public UsrArticleController(ArticleService articleService) {
		this.articleService  = articleService;
	}

	@RequestMapping("usr/article/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		return articleService.getArticles();
	}
	
	@RequestMapping("usr/article/getArticle")
	@ResponseBody
	public Article getArticle(int id) {
		return articleService.getArticle(id);
	}
}
