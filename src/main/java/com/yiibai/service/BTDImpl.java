package com.yiibai.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.yiibai.entities.Book;
import com.yiibai.entities.BookType;
import com.yiibai.mapping.BookDAO;
import com.yiibai.mapping.BookTypeDAO;

public class BTDImpl{

	@Autowired  
    private BookTypeDAO bookTypeDAO;
	
	@Autowired  
    private BookDAO bookDAO;  

    public List<BookType> getAllBookTypes() {
        return bookTypeDAO.getAllBookTypes();
    }
    
    public BookType getBookTypeById(int id) {
        return bookTypeDAO.getBookTypeById(id);
    }
    
    public int addBookType(BookType bookType) {
		return bookTypeDAO.addBookType(bookType);
	}

    public int updateBookType(BookType bookType) {
		return bookTypeDAO.updateBookType(bookType);
	}
    
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }
    
    public List<Book> getBooksByIds(List<Integer> ids){
    	return bookDAO.getBooksByIds(ids);
    }
    
    @Transactional
    public void batchAddBook(List<Book> books){
    	bookDAO.batchAddBook(books);
    	return;
    }
}