package com.kodilla.homework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(-200);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(100, transactions[0]);
        assertEquals(-200, transactions[1]);
    }

    @Test
    public void shouldCalculateSumOfCashMachineTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(-200);
        cashMachine.add(50);

        assertEquals(-50, cashMachine.getSumOfTransactions());
    }

    @Test
    public void shouldReturnSumEqualsZeroIfArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getSumOfTransactions(), 0.0001);
    }

    @Test
    public void shouldReturnCountOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(-200);
        cashMachine.add(50);
        cashMachine.add(50);
        assertEquals(4, cashMachine.getCountOfTransactions());

    }

    @Test
    public void shouldCalculateAverageOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(3000);
        cashMachine.add(-350);
        cashMachine.add(-500);
        cashMachine.add(100);
        assertEquals(562.5, cashMachine.getAverageOfTransactions(), 0.01);
    }

}
