package System;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class eWalletTest {
    private eWallet wallet;

    @Before
    public void setUp() {
        wallet = new eWallet();
    }

    @Test
    public void testDeposit() {
        wallet.setBalance(100);
        wallet.deposit(50);
        assertEquals("Depósito de 50 deve aumentar o saldo para 150", 150, wallet.getBalance());
    }

    @Test
    public void testWithdraw() {
        wallet.setBalance(100);
        wallet.withdraw(50);
        assertEquals("Retirada de 50 deve diminuir o saldo para 50", 50, wallet.getBalance());
    }

    @Test
    public void testGetBalance() {
        wallet.setBalance(100);
        assertEquals("O saldo deve ser 100", 100, wallet.getBalance());
    }

    @Test
    public void testSetBalanceWithParameter() {
        wallet.setBalance(200);
        assertEquals("O saldo deve ser definido como 200", 200, wallet.getBalance());
    }
}