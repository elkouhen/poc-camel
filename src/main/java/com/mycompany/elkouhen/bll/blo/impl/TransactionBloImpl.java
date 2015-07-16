package com.mycompany.elkouhen.bll.blo.impl;

import com.mycompany.elkouhen.bll.blo.TransactionBlo;
import com.mycompany.elkouhen.il.data.Transaction;
import lombok.extern.log4j.Log4j;
import org.apache.camel.Body;
import org.springframework.stereotype.Service;

@Service
@Log4j
public class TransactionBloImpl implements TransactionBlo {

    public void save(@Body Transaction transaction) {
        log.debug(transaction);
    }
}
