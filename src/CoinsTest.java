import static org.junit.jupiter.api.Assertions.*;

class CoinSplitterTest
{

    @org.junit.jupiter.api.Test void findMaxValueDynTest()
    {
        UtopiaCoins coins = new UtopiaCoins();
        assertEquals(3, coins.BruteForceCoinsRecursiveHistory(15));
        assertEquals(3, coins.BruteForceCoinsRecursiveHistory(30));
        assertEquals(4, coins.BruteForceCoinsRecursiveHistory(43));
        assertEquals(247, coins.BruteForceCoinsRecursiveHistory(5407));

    }
}