package com.th1.services;

import com.th1.domain.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl {

    private Map<Integer, Book> bookMap;

    public BookServiceImpl(){
        loadBooks();
    }

    public List<Book>bookList(){
        return new ArrayList<>(bookMap.values());
    }

    public Book getBook(Integer id){
        return bookMap.get(id);
    }

    private void loadBooks() {

    }
}
