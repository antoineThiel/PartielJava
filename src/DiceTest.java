import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DiceTest {
    @Test
    public void nbreFace()
    {
        Dice dice = new Dice();
        Assert.assertTrue(dice.getFaces() >=3 && dice.getFaces() <=20);
    }

    @Test
    public void testRoll()
    {
        Dice dice = new Dice();
        int random = dice.roll();
        List<Integer> facesValues = dice.getFaceValues();
        Assert.assertTrue(facesValues.contains(random));
    }
}
