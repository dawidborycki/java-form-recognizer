package com.ai.formrecognizer;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "recognitionResults")
public class RecognitionResult {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "receiptFileName")
    private String receiptFileName;

    @Column(name = "merchantName")
    private String merchantName;

    @Column(name = "transactionDate")
    private LocalDate transactionDate;

    @Column(name = "total")
    private double total;

    public String getReceiptFileName() {
        return receiptFileName;
    }

    public void setReceiptFileName(String receiptFileName) {
        this.receiptFileName = receiptFileName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String toString() {
        return String.format("Merchant name: %s\nTransaction date: %s\nTotal:%.2f", 
            getMerchantName(), getTransactionDate(), getTotal());
    }
}