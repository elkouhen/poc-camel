package com.github.elkouhen.bll.blo;

import com.github.elkouhen.il.data.Book;
import com.github.elkouhen.il.data.Transaction;

public interface BookBlo {

	public void update(Book book);

	public Transaction buy(String id, int amount);

}
