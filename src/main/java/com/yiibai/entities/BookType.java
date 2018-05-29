package com.yiibai.entities;

import java.util.List;

/**
 * 图书类型
 *
 */
public class BookType {
	/**
	 * 编号
	 */
	private int id;
	/**
	 * 类型名
	 */
	private String typeName;
	
	private List<Book> books;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return this.getId()+"\t"+this.getTypeName();
	}
}
