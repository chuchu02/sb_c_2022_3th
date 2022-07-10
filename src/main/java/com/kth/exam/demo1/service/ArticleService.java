package com.kth.exam.demo1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kth.exam.demo1.vo.Article;
import com.kth.exam.demo1.Repository.ArticleRepository;

@Service
public class ArticleService {
	private ArticleRepository articleRepository;
	
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
		makeTestData();
	}

	private void makeTestData() {
		for(int i = 1; i <= 10; i++) {
			String title = "제목 " + i;
			String body = " 내용 " + i;
			writeArticle(title, body);
		}
	}
	
	public void writeArticle(String title, String body) {
		articleRepository.writeArticle(title, body);
	}

	public List<Article> getArticles() {
		return articleRepository.getArticles();
	}

	public Article getArticle(int id) {
		return articleRepository.getArticle(id);
	}

	public void delete(int id) {
		articleRepository.delete(id);
	}
}
