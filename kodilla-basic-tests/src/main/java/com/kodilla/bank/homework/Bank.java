package com.kodilla.bank.homework;

public class Bank {
    public static void main(String[] args) {

    }

    private String name;
    private CashMachine[] cashMachines;


    private CashMachine deposit;
    private CashMachine withdrawal;

    public Bank(String name, CashMachine[] cashMachines) {
        this.name = name;
        this.cashMachines = cashMachines;
        this.deposit = new CashMachine();
        this.withdrawal = new CashMachine();
    }

    public void addDepositTransaction(int transaction) {
        if (transaction > 0) {
            this.deposit.add(transaction);
        }
    }

    public void addWithdrawalTransaction(int transaction) {
        if (transaction < 0) {
            this.withdrawal.add(transaction);
        }
    }

    public double getDepositsAverage() {
        return this.deposit.getAverageOfTransactions();
    }

    public double getWithdrawalsAverage() {
        return this.withdrawal.getAverageOfTransactions();
    }

    public double getGlobalTransactionsSum() {
        double sum = this.deposit.getSumOfTransactions() + this.withdrawal.getSumOfTransactions();
        return sum;
    }

/*

    public int getCountOfDepositTransactions() {

    }

    public int getCountOfWithdrawalTransactions() {

    }

*/

}
