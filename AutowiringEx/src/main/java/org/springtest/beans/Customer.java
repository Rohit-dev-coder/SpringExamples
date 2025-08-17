package org.springtest.beans;

public class Customer {
    private String name;
    private Account account;
    private Address address;

    // Constructor with no parameters
    public Customer() {
    }


    public Customer(Account acc) {
        this.account = acc;
        System.out.println("Constructor called with Account: " + acc.getAccountNumber());
    }

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
        System.out.println("Customer constructor called: " + name + ", Account Number: " + account.getAccountNumber());
    }

    public Customer(String name, Account account, Address address) {
        this.name = name;
        this.account = account;
        this.address = address;
        System.out.println("Customer constructor called: " + name + ", Account Number: " + account.getAccountNumber() +
                ", Address: " + address);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', accountNumber=" + account.getAccountNumber() +
                ", balance=" + account.getBalance() + "}";
    }
}
