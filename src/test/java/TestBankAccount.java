package test.java;

import main.java.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBankAccount {
    BankAccount account = new BankAccount();
    @Test
    void testDepositIntoAccount(){
        account.deposit(100);
        assertEquals(100,account.getBalance(),"1");
    }
    @Test
    void testWithdrawFromAccountWithSufficientFunds(){
        account.deposit(100);
        account.withdraw(50);
        assertEquals(50,account.getBalance(),"2");
    }
    @Test
    void testWithdrawFromAccountExceedingBalance(){
        account.deposit(100);
        assertThrows(IllegalArgumentException.class,()->{
            account.withdraw(150);
        });
    }
    @Test
    void testDepositNegativeAmount(){
        assertThrows(IllegalArgumentException.class,()->{
            account.deposit(-150);
        });
    }
    @Test
    void testWithdrawNegativeAmount(){
        assertThrows(IllegalArgumentException.class,()->{
            account.withdraw(-150);
        });
    }


}
