package com.entities;

import java.util.Date;

public class Todo {
	private String title;
	private String content;
	private Date addedDate;
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Todo(String title, String content, Date addedDate) {
		super();
		this.title = title;
		this.content = content;
		this.addedDate = addedDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	@Override
	public String toString() {
		return "Todo [title=" + title + ", content=" + content + ", addedDate=" + addedDate + "]";
	}
	
	
}
