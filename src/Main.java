public class Main {
    public static void main(String[] args) {
        Knucklebones kuncle = new Knucklebones();
        Coin coin = new Coin();
        Dice dice = new Dice();
        System.out.println(kuncle.toString());
        System.out.println(coin.toString());
        System.out.println(dice.toString());
        System.out.println(dice.roll());
        System.out.println(coin.roll());
        System.out.println(kuncle.toss());
    }
}
