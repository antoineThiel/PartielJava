import java.util.ArrayList;
import java.util.List;

public class Throw {
    private List<Coin> lCoin = new ArrayList<>();
    private List<Dice> lDice = new ArrayList<>();
    private List<Integer> faces = new ArrayList<>();

    public Throw(Integer coinnbre, Integer dicenbre) {
        coinnbre = checkParam(coinnbre);
        dicenbre = checkParam(dicenbre);
        for (int i = 0; i< coinnbre; i++)
        {
            Coin coin = new Coin();
            lCoin.add(coin);
        }
        for (int i= 0; i<dicenbre; i++)
        {
            Dice dice = new Dice();
            lDice.add(dice);
        }
    }

    public void setFacesCoin() {
        for (Coin coin : lCoin) {
            this.faces.add(coin.roll());
        }
    }

    public void setFacesDice()
    {
        for (Dice dice : lDice)
        {
            this.faces.add(dice.roll());
        }
    }

    public List<Integer> getFaces() {
        return faces;
    }

    public int checkParam(Integer param)
    {
        if (param == 0)
            return 0;
        else if (param > 5)
        {
            return 5;
        }
        else if (param <1)
        {
            return 1;
        }
        return param;
    }

}
