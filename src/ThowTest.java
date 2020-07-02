import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ThowTest {

    @Test
    public void ThrowFacesCoin()
    {
        Throw jet = new Throw(5,0);
        List<Integer> allFaces = jet.getFaces();
        for (int i =0; i<allFaces.size(); i++)
        {
            Assert.assertTrue(allFaces.get(i) > 0 && allFaces.get(i) < 3);
        }
    }

    @Test
    public void ThrowFacesDice()
    {
        Throw jet = new Throw(0,5);
        List<Integer> allFaces = jet.getFaces();
        for (int i =0; i<allFaces.size(); i++)
        {
            Assert.assertTrue(allFaces.get(i) > 0 && allFaces.get(i) < 1000);
        }
    }

    @Test
    public void ThrowParamValues()
    {
        Throw jet = new Throw(-1, 0);
        jet.setFacesCoin();
        Assert.assertEquals(1, jet.getFaces().size());

        Throw jet2 = new Throw(0, 20);
        jet.setFacesDice();
        Assert.assertEquals(5, jet.getFaces().size());
    }
}
