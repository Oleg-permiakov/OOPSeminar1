import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HotDrink b1 = new HotDrink("вода", 20, 1, 95);
        HotDrink b2 = new HotDrink("чай", 50, 2, 60);
        HotDrink b3 = new HotDrink("кофе", 100, 3, 70);
        HotDrink b4 = new HotDrink("кофе", 100, 1, 80);
        HotDrink b5 = new HotDrink("какао", 90, 5, 85);

        HotDrincsAuto vendingMachine = new HotDrincsAuto(new ArrayList<>());
        vendingMachine.addHotDrink(b1);
        vendingMachine.addHotDrink(b2);
        vendingMachine.addHotDrink(b3);
        vendingMachine.addHotDrink(b4);
        vendingMachine.addHotDrink(b5);
        // System.out.println(vendingMachine.getProduct("20", 5));
        // System.out.println(vendingMachine.getProduct("20", 100));
       for (HotDrink b : vendingMachine.gethotDrink()) {
           System.out.println(b);
       }
    }

}