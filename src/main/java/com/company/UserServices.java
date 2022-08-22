package com.company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserServices<T extends Account, User> {
    public static final Logger LOGGER = LogManager.getLogger(UserServices.class);

    public void printAllUsers(List<com.company.User> users) {
        LOGGER.info("All users~~~~~~");
        List<String> names = new ArrayList<>();
        for (com.company.User user : users) {
            names.add(user.getUserName() );
        }
        Collections.sort(names);
        for (String name : names) {
            LOGGER.info(name);
        }
    }

    public void printAllAccounts(List<com.company.User> users) {
        LOGGER.info("~~~~~~All accounts~~~~~~");
        for (com.company.User user : users) {
            List<Account> accounts = user.getAccountList();
            for (com.company.Account account : accounts){
                LOGGER.info(account);
            }
        }
    }

    public Double printTax(com.company.User user) {
        Double totalSum = 0.0;
        for (Account account:  user.getAccountList()) {
            totalSum = totalSum + account.getSum();
        }
        return totalSum * 0.05;
    }
}