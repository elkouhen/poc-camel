package com.mycompany.elkouhen.bll.blo.impl;

import com.mycompany.elkouhen.bll.blo.BookBlo;
import com.mycompany.elkouhen.bll.blo.TransactionBlo;
import com.mycompany.elkouhen.il.data.Book;
import com.mycompany.elkouhen.il.data.Transaction;
import lombok.extern.log4j.Log4j;
import org.apache.camel.Body;
import org.apache.camel.Header;
import org.apache.camel.Produce;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;

@Service
@Log4j
public class BookBloImpl implements BookBlo {

    @Produce(uri = "direct:transactionBlo")
    private TransactionBlo transactionBlo;

    private ArrayList<Book> list = new ArrayList<Book>();

    @PostConstruct
    public void init() {
        list.add(Book.builder().id("id1").title("book1").build());
        list.add(Book.builder().id("id2").title("book2").build());
        list.add(Book.builder().id("id3").title("book3").build());
    }

    public Collection<Book> list() {

        return list;
    }

    public Book findById(@Header("id") String id) {
        for (Book book : list()) {
            if (book.getId().equals(id)) {
                return book;
            }
        }

        return null;
    }

    public void update(@Body Book book) {
        log.info(book);
    }

    public Transaction buy(@Header("id") String id, @Header("amount") int amount) {

        Book book = findById(id);

        Transaction transaction = new Transaction();

        book.setTransaction(transaction);

        update(book);

        transactionBlo.save(transaction);

        return transaction;
    }
}
