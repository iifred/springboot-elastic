package com.springboot.elastic.repository;

import com.springboot.elastic.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookRepository extends ElasticsearchRepository<Book, Integer> {
    List<Book> findBookByBookNameFalse(String name);
}
