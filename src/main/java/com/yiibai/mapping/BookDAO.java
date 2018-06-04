package com.yiibai.mapping;

import java.util.List;

import com.yiibai.entities.Book;

/**
 * 图书数据访问接口
 *
 */
public interface BookDAO {

	public List<Book> getAllBooks();
	
	public List<Book> getBooksByIds(List<Integer> ids);
	
	public void batchAddBook(List<Book> list);
	
	public List<Book> selectBookIf(Book book);
	
}
