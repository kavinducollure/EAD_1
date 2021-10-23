package com.example.unibank.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Account {
    @Id
    private Integer accId;
    private String accType;
    private Double balance;
    private Date createDate;
    @ManyToOne
    private User accHolder;

    @Override
    public String toString() {
        return "Account{" +
                "accId=" + accId +
                ", accType='" + accType + '\'' +
                ", balance=" + balance +
                ", createDate=" + createDate +
                ", accHolder=" + accHolder +
                '}';
    }

    public Account(Integer accId, String accType, Double balance, Date createDate, User accHolder) {
        this.accId = accId;
        this.accType = accType;
        this.balance = balance;
        this.createDate = createDate;
        this.accHolder = accHolder;
    }

    public Account() {

    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(User accHolder) {
        this.accHolder = accHolder;
    }
}
