package com.retailer_backend.retailer_backend.model;

import java.time.LocalDate;

public class Transactions {

  
    private Integer transactionId;
    private Double purchaseAmount;
    private LocalDate date;


    public Transactions(Integer transactionId, Double purchaseAmount, LocalDate date) {
        this.transactionId = transactionId;
        this.purchaseAmount = purchaseAmount;
        this.date = date;
    }


    public Integer getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }
    public Double getPurchaseAmount() {
        return purchaseAmount;
    }
    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    

    
}
