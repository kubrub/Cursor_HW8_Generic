package com.company;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<Account> accounts = new ArrayList<>();

    public User(String userName, List<Account> accountList) {
        this.userName = userName;
        this.accounts = accountList;
    }

    public String getUserName() {
        return userName;
    }

    public List<Account> getAccountList() {
        return accounts;
    }
}
