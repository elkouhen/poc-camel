package com.mycompany.elkouhen.resources.api;

import com.mycompany.elkouhen.il.data.Book;
import com.mycompany.elkouhen.il.data.Transaction;

public interface BookResource {

    void save(Book book);

    Transaction buy(String id);
}
