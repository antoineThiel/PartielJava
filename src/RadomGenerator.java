import java.util.List;
import java.util.Random;

public class RadomGenerator {


    public RadomGenerator() {
    }

    public int run(List<Integer> list)
    {
        Random randomIndex = new Random();
        return list.get(randomIndex.nextInt()% list.size());
    }
}
