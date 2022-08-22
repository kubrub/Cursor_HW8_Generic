package com.company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        UserServices userService = new UserServices<>();
        List<Account> rostykAccountList = new ArrayList<>();
        rostykAccountList.add(new DebitAccount("first", 5000));
        rostykAccountList.add(new CreditAccount(1, 135));
        rostykAccountList.add(new CreditAccount(2, 20000));
        User rostyk = new User("Rostyk", rostykAccountList);

        List<Account> accountListUser1 = new ArrayList<>();
        accountListUser1.add(new DebitAccount("asf", 45646));
        accountListUser1.add(new CreditAccount(234, 1234));
        User orest = new User("Orest", accountListUser1);

        List<Account> sashaAccountList = new ArrayList<>();
        sashaAccountList.add(new DebitAccount("ysf453", 9821));
        sashaAccountList.add(new CreditAccount(678, 975));
        sashaAccountList.add(new DebitAccount("R235", 198331));
        sashaAccountList.add( new DebitAccount("R236", 43543));
        sashaAccountList.add(new DebitAccount("R237", 535));
        User sasha = new User("Sasha", sashaAccountList);
        users.add(rostyk);
        users.add(orest);
        users.add(sasha);

        userService.printAllUsers(users);
        userService.printAllAccounts(users);

        LOGGER.info("Total tax for account - " + userService.printTax(orest));
    }
}