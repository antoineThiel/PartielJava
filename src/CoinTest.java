import org.junit.Assert;
import org.junit.Test;
public class CoinTest {

    @Test
    public void RandomFace(){
        Coin coin = new Coin();
        int face = coin.roll();
        Assert.assertTrue(face>0 && face <=2);
    }
}
