package com.github.elkouhen.resources.api;

import com.github.elkouhen.il.data.Book;
import com.github.elkouhen.il.data.Transaction;

public interface BookResource {

	void save(Book book); 
	
	Transaction buy(String id);
}
