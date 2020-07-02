import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Coin {
    private List<Integer> face = new ArrayList<>();

    public Coin()
    {
        this.face.add(1);
        this.face.add(2);
    }

    public int roll()
    {
        Random random = new Random();
        int nb = random.nextInt(2);
        return (face.get(nb));
    }

    @Override
    public String toString() {
        return "Coin{" +
                "face=" + face +
                '}';
    }
}
