import java.util.Random;

public class LoadedDice extends Dice{

    public LoadedDice() {
        Random random = new Random();
        this.faces = 3+random.nextInt(20-3);
        for (int i = 0; i<this.faces; i++)
        {
            faceValues.add(1+random.nextInt(1000-1));
        }
    }

    @Override
    public int roll() {
        Random random = new Random();
        int nb = 1+random.nextInt(this.faces-1);
        //set change that it will be this index
        //return this if chosen else return another random
        return 1;
    }
}
