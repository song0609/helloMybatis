package com.yiibai.mapping;

import java.util.List;

import com.yiibai.entities.BookType;

/**
 * 图书类型数据访问接口
 *
 */
public interface BookTypeDAO {
	/*
	 * 获得所有图书类型
	 */
	public List<BookType> getAllBookTypes();
	
	public BookType getBookTypeById(int id);
	
	public int addBookType(BookType bookType);
	
	public int updateBookType(BookType bookType);
}
