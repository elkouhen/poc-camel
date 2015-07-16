package com.mycompany.elkouhen.bll.blo;

import com.mycompany.elkouhen.il.data.Book;
import com.mycompany.elkouhen.il.data.Transaction;

public interface BookBlo {

    public void update(Book book);

    public Transaction buy(String id, int amount);

}
