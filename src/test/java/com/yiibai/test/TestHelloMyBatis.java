package com.yiibai.test;

import static org.junit.Assert.assertNotNull;

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
            System.out.println(bookType);
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
}