import static org.junit.jupiter.api.Assertions.*;

class QueenTest
{
    @org.junit.jupiter.api.Test void nQueensFindMax()
    {
        Queens nqf = new Queens(4);
        assertEquals(4, nqf.getCurrentMax());

        System.out.println("-------------------------------");
        Queens nqf2 = new Queens(3);
        assertEquals(2, nqf2.getCurrentMax());

        System.out.println("-------------------------------");
        Queens nqf3 = new Queens(5);
        assertEquals(5, nqf3.getCurrentMax());




    }
}