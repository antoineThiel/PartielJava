import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Knucklebones {
    private List<Integer> faces = new ArrayList<>();

    public Knucklebones()
    {
        this.faces.add(1);
        this.faces.add(3);
        this.faces.add(4);
        this.faces.add(6);
    }

    @Override
    public String toString() {
        return "Knucklebones{" +
                "faces=" + faces +
                '}';
    }
    public int toss()
    {
        Random random = new Random();
        int nb = random.nextInt(4-1);
        return faces.get(nb);
    }

    public List<Integer> getFaces()
    {
        return this.faces;
    }
}
