package com.kth.exam.demo1.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.kth.exam.demo1.vo.Article;

@Component
public class ArticleRepository {

	private List<Article> articles;
	private int lastId;
	
	public ArticleRepository() {
		articles = new ArrayList<>();
		lastId = 0;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void writeArticle(String title, String body) {
		int id = lastId + 1;
		Article article = new Article(id, title, body);
		articles.add(article);
		
		lastId = id;
	}

	public Article getArticle(int id) {
		for (Article article : articles) {
			if(article.getId() == id) {
				return article;
			}
		}
		return null;
	}

}
