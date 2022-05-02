import java.util.ArrayList;
import java.util.HashMap;

public class UtopiaCoins {
    public HashMap<Integer,Integer> map;
    static int[] possiblecoins;

    public UtopiaCoins(){
        map = new HashMap<>();
        possiblecoins = new int[]{1, 7, 10, 22};
    }
    public int BruteForceCoinsRecursiveHistory(int coins)
    {
        int min = coins;
        if(map.containsKey(min))
        {
            return map.get(min);
        }
        for(int val : possiblecoins)
        {
            if(coins-val >= 0)
            {
                if(coins == val)
                {
                    return 1;
                }else {
                    int requiredcoins = BruteForceCoinsRecursiveHistory(coins-val)+1;
                    if(requiredcoins <= min)
                    {
                        min = requiredcoins;
                    }
                }
            }
        }
        map.put(coins,min);
        return min;
    }
}
class Main{
    public static void main(String[] args) {
        UtopiaCoins utopiaCoins = new UtopiaCoins();
        System.out.println(utopiaCoins.BruteForceCoinsRecursiveHistory(5));
    }
}
