package com.pk.client;
import java.util.List;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.Book;
import com.pk.model.BookLibrary;

public class ClientTest {
    public static void main(String[] args) {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	BookLibrary bookLibrary = context.getBean("bookLibrary",BookLibrary.class);
    	List<Book> allBook = bookLibrary.getAllBook();
    	for (Book book : allBook) {
			System.out.println(book.getBookId()+"\t"+book.getBookName());
		}
        context.close();
	}
}
