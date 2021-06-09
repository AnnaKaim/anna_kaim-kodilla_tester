package com.kodilla.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTestSuite {

    CashMachine[] cashMachines = new CashMachine[]{};


    @Test
    public void shouldCalculateCAverageOfDepositTransactions() {
        Bank bank = new Bank ("mBank", cashMachines);
        bank.addDepositTransaction(1000);
        bank.addDepositTransaction(300);
        bank.addDepositTransaction(150);
        bank.addDepositTransaction(100);
        bank.addDepositTransaction(-100);
        double depositAverage = bank.getDepositsAverage();
        assertEquals(387.5, depositAverage, 0.01);
    }

    @Test
    public void shouldCalculateAverageOfWithdrawalTransactions() {
        Bank bank = new Bank ("mBank", cashMachines);
        bank.addWithdrawalTransaction(-50);
        bank.addWithdrawalTransaction(-300);
        bank.addWithdrawalTransaction(-150);
        bank.addWithdrawalTransaction(-100);
        bank.addWithdrawalTransaction(100);
        double withdrawalsAverage = bank.getWithdrawalsAverage();
        assertEquals(-150, withdrawalsAverage, 0.01);
    }

    @Test
    public void shouldCalculateGlobalSum() {
        Bank bank = new Bank("mBank", cashMachines);
        bank.addWithdrawalTransaction(-100);
        bank.addDepositTransaction(1000);
        bank.addDepositTransaction(500);
        bank.addWithdrawalTransaction(-700);
        double globalSum = bank.getGlobalTransactionsSum();
        assertEquals(700, globalSum, 0.01);
    }


    @Test
    public void shouldReturnGlobalSumEqualsZeroIfArrayIsEmpty() {
        Bank bank = new Bank("mBank", cashMachines);
        assertEquals(0, bank.getGlobalTransactionsSum(), 0.0001);

    }



     /*

    @Test
    public void shouldReturnCountOfDepositTransactions() {
        Bank bank = new Bank("mBank", cashMachines);
        bank.addDepositTransaction(100);
        bank.addWithdrawalTransaction(-200);
        bank.addDepositTransaction(50);
        bank.addDepositTransaction(250);
        bank.addDepositTransaction(250);

        assertEquals(4, bank.getCountOfDepositTransactions(), 0.0001);
    }

    @Test
    public void shouldReturnCountOfWithdrawalTransactions() {
        Bank bank = new Bank("mBank", cashMachines);
        bank.addWithdrawalTransaction(-150);
        bank.addWithdrawalTransaction(-50);
        bank.addDepositTransaction(300);
        bank.addWithdrawalTransaction(-100);
    }
    assertEquals(3, bank.getCountOfWithdrawalTransactions(), 0.0001);

     */


}
