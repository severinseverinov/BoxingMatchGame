public class Main {
    public static void main(String[] args) {
        double FighterOneChance= Math.random() * 100,FighterTwoChance= Math.random() * 100;
        int chance=0;

        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 50);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 50);
        Ring r = new Ring(marc,alex , 90 , 100);
        if (FighterOneChance > FighterTwoChance) {
            chance=1;
        }else {chance=2;}

        r.run(chance);
    }
}
