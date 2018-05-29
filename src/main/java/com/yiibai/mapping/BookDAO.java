package com.yiibai.mapping;

import java.util.List;

import com.yiibai.entities.Book;

/**
 * 图书数据访问接口
 *
 */
public interface BookDAO {
	/*
	 * 获得所有图书类型
	 */
	public List<Book> getAllBooks();
	
}
