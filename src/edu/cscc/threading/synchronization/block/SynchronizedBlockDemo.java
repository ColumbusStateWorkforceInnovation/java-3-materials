package edu.cscc.threading.synchronization.block;

import edu.cscc.threading.raceconditions.Account;

public class SynchronizedBlockDemo {

    public static void main(String[] args) {
        Account account = new Account(1000);
        System.out.println("Starting balance is: " + account.getBalance());

        AccountWithdrawer accountWithdrawer = new AccountWithdrawer(account);
        AccountWithdrawer accountWithdrawer2 = new AccountWithdrawer(account);

        accountWithdrawer.start();
        accountWithdrawer2.start();
    }
}
