package com.example.enterprise.dto;

import lombok.Data;

public @Data
class Expense {
    private int incomeID;
    private int amount;
    private String note;
}
