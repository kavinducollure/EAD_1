package com.example.unibank.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String accHolderName;
    private String accHolderID;
    private String accHolderAddress;
    private String accHolderMobile;
    @OneToMany(mappedBy = "accHolder")
    private List<Account> bankAcc;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", accHolderName='" + accHolderName + '\'' +
                ", accHolderID='" + accHolderID + '\'' +
                ", accHolderAddress='" + accHolderAddress + '\'' +
                ", accHolderMobile='" + accHolderMobile + '\'' +
                ", bankAcc=" + bankAcc +
                '}';
    }

    public User(String accHolderName, String accHolderID, String accHolderAddress, String accHolderMobile) {

        this.accHolderName = accHolderName;
        this.accHolderID = accHolderID;
        this.accHolderAddress = accHolderAddress;
        this.accHolderMobile = accHolderMobile;
    }

    public User() {

    }

    public void setUserId(Integer accHolderId) {
        this.userId = accHolderId;
    }

    public Integer getUserId() {
        return userId;
    }


    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getAccHolderID() {
        return accHolderID;
    }

    public void setAccHolderID(String accHolderID) {
        this.accHolderID = accHolderID;
    }

    public String getAccHolderAddress() {
        return accHolderAddress;
    }

    public void setAccHolderAddress(String accHolderAddress) {
        this.accHolderAddress = accHolderAddress;
    }

    public String getAccHolderMobile() {
        return accHolderMobile;
    }

    public void setAccHolderMobile(String accHolderMobile) {
        this.accHolderMobile = accHolderMobile;
    }

    public List<Account> getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(List<Account> bankAcc) {
        this.bankAcc = bankAcc;
    }
}
