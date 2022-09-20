package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void depositMoneyTest(){
        //given that we have an account
        Account ahneekaAccount = new Account();
        //we deposit 5000
        ahneekaAccount.deposit(5000);
        //check that balance = 5000
        assertEquals(5000, ahneekaAccount.getBalance());

    }

    @Test
    public void depositNegativeMoneyAmount(){
        // given that we have an account
        Account ahneekaAccount = new Account();
        //we deposit -5000
        ahneekaAccount.deposit(-5000);
        //check balance = -5000
        assertEquals(0, ahneekaAccount.getBalance());

    }
}