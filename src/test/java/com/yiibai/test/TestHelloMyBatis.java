package com.yiibai.test;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiibai.entities.Book;
import com.yiibai.entities.BookType;
import com.yiibai.service.BTDImpl;

public class TestHelloMyBatis {
	ApplicationContext ctx;
	
	@Before
	public void setUp() throws Exception {
		ctx=new ClassPathXmlApplicationContext("helloMybatis-servlet.xml");
	}

	
    @Test
    public void testSelectAll() {
        //获得bean
        BTDImpl bTDImpl=ctx.getBean("bTDImpl",BTDImpl.class);
        //访问数据库
        List<BookType> booktypes=bTDImpl.getAllBookTypes();
        for (BookType bookType : booktypes) {
            /*if(bookType.getBooks() !=null && !bookType.getBooks().isEmpty()){
            	for (Book book : bookType.getBooks()) {
					System.out.println(book.getBookName());
				}
            }*/
        	System.out.println(bookType.getTypeName());
        }
        assertNotNull(booktypes);
    }
    
    @Test
    public void testSelectOne() {
        //获得bean
        BTDImpl bTDImpl=ctx.getBean("bTDImpl",BTDImpl.class);
        BookType bookType = bTDImpl.getBookTypeById(1);
        System.out.println(bookType);
    }
    
    @Test
    public void testInsert() {
        //获得bean
        BTDImpl bTDImpl=ctx.getBean("bTDImpl",BTDImpl.class);
        BookType po = new BookType();
        po.setTypeName("生物");
        bTDImpl.addBookType(po);
        System.out.println(po.getId());
    }
    
    @Test
    public void testUpdate() {
        //获得bean
        BTDImpl bTDImpl=ctx.getBean("bTDImpl",BTDImpl.class);
        BookType po = new BookType();
        po.setTypeName("地理");
        po.setId(7);
        int num = bTDImpl.updateBookType(po);
        System.out.println(num);
    }
    
    @Test
    public void testGetAllBooks() {
        //获得bean
        BTDImpl bTDImpl=ctx.getBean("bTDImpl",BTDImpl.class);
        List<Book> list = bTDImpl.getAllBooks();
        for (Book book : list) {
			System.out.println(book.getBookName() + "--" +book.getBookTypeName());
		}
    }
    
    @Test
    public void testGetBooksByIds() {
        //获得bean
        BTDImpl bTDImpl=ctx.getBean("bTDImpl",BTDImpl.class);
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(2);
        ids.add(3);
        List<Book> list = bTDImpl.getBooksByIds(ids);
        for (Book book : list) {
			System.out.println(book.getBookName() + "--" +book.getBookTypeName());
		}
    }
    
    @Test
    public void testBatchAddBook() {
        //获得bean
        BTDImpl bTDImpl=ctx.getBean("bTDImpl",BTDImpl.class);
        List<Book> books = new ArrayList<Book>();
        Book book1 = new Book();
        book1.setBookName("C++");
        book1.setBookType(1);
        Book book2 = new Book();
        book2.setBookName("java程序设计");
        book2.setBookType(1);
        books.add(book1);
        books.add(book2);
        bTDImpl.batchAddBook(books);
        System.out.println("testBatchAddBook end");
    }
    
    @Test
    public void testSelectBookIf() {
        //获得bean
        BTDImpl bTDImpl=ctx.getBean("bTDImpl",BTDImpl.class);
        Book book1 = new Book();
        book1.setId(8);
        book1.setBookType(1);
       
        List<Book> list = bTDImpl.getBookIf(book1);
        System.out.println("list size:" + list.size());
        System.out.println("testSelectBookIf end");
    }
}