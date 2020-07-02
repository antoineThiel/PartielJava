import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {

    protected int faces;
    protected List<Integer> faceValues = new ArrayList<>();

    public Dice() {
        Random random = new Random();
        this.faces = 3+random.nextInt(20-3);
        for (int i = 0; i<this.faces; i++)
        {
            faceValues.add(1+random.nextInt(1000-1));
        }
    }

    @Override
    public String toString() {
        return "Dice{" +
                "faces=" + faces +
                ", faceValues=" + faceValues +
                '}';
    }

    public int roll() {
        Random random = new Random();
        int nb = 1+random.nextInt(this.faces-1);
        return faceValues.get(nb);
    }

    public int getFaces()
    {
        return this.faces;
    }

    public List<Integer> getFaceValues()
    {
        return this.faceValues;
    }
}
