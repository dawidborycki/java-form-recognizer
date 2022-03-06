package com.ai.formrecognizer;
import org.springframework.data.annotation.Id;
import java.util.Date;
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
    private Date transactionDate;

    @Column(name = "total")
    private float total;

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

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}