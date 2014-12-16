package com.github.elkouhen.bll.blo.impl;

import lombok.extern.log4j.Log4j;

import org.apache.camel.Body;
import org.springframework.stereotype.Service;

import com.github.elkouhen.bll.blo.TransactionBlo;
import com.github.elkouhen.il.data.Transaction;

@Service
@Log4j
public class TransactionBloImpl implements TransactionBlo {

	public void save(@Body Transaction transaction) {
		log.debug(transaction);
	}
}
