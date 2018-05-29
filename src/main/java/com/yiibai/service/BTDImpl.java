package com.yiibai.service;


import java.util.List;

import com.yiibai.entities.Book;
import com.yiibai.entities.BookType;
import com.yiibai.mapping.BookDAO;
import com.yiibai.mapping.BookTypeDAO;
import org.springframework.beans.factory.annotation.Autowired;

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
}