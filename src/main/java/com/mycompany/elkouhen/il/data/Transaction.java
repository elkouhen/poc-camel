package com.mycompany.elkouhen.il.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    String id;

    int amount;
}
