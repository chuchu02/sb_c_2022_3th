package com.kth.exam.demo1.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Article {
	private int id;
	private String title;
	private String body;
}
