import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KnuclesBonesTest {

    @Test
    public void KnuclesValues()
    {
        Knucklebones knucle = new Knucklebones();
        List<Integer> list = knucle.getFaces();
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(4);
        expected.add(6);
        for (int i = 0; i<list.size(); i++)
        {
            Assert.assertTrue(list.contains(expected.get(i)));
        }
    }

    @Test
    public void KnucleToss()
    {
        Knucklebones knucle = new Knucklebones();
        List<Integer> list = knucle.getFaces();
        int random = knucle.toss();
        Assert.assertTrue(list.contains(random));
    }
}
