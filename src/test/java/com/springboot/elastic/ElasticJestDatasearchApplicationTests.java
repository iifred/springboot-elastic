package com.springboot.elastic;

import com.springboot.elastic.bean.Book;
import com.springboot.elastic.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ElasticJestDatasearchApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Test
    void contextLoads() {
//        新增
//        Book book = new Book();
//        book.setAuthor("吴承恩");
//        book.setBookName("西游记");
//        book.setId(1);
//        bookRepository.index(bookRepository);
//        查询
        List<Book> list = bookRepository.findBookByBookNameEquals("西");
        for (Book item:
             list) {
            System.out.println(item);
        }
    }

}
