package TDD.Bank_Account;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTDDTest {
    @Test
    public void depositMoneyTest(){
        AccountTDD myAccount = new AccountTDD();
        myAccount.deposit(3000);
        int balance = myAccount.getBalance();
        assertEquals(3000, balance);
    }
    @Test
    public void negativeDepositShouldNotWorkTest(){
        AccountTDD myAccount = new AccountTDD();
        myAccount.deposit(10000);
        assertEquals(10000, myAccount.getBalance());
        myAccount.deposit(-5000);
        assertEquals(10000, myAccount.getBalance());
    }
    @Test
    public void withdrawMoneyTest(){
        AccountTDD myAccount = new AccountTDD();
        myAccount.deposit(25000);
        assertEquals(25000, myAccount.getBalance());
        myAccount.withdraw(30000);
        assertEquals(25000, myAccount.getBalance());
    }
}