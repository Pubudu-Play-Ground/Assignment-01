public class Demo6D {
    public static void main(String[] args) {
        String item1 = "Apples";
        int quan1 = 5; 
        
        String item2 = "Orange";
        int quan2 = 10;

        double price1 =0.99;
        double price2 =1.49;

        String yellow = "\033[33m";
        String white = "\033[0m";
        String whitebold = "\033[0;1m";
        String green = "\033[32m";
        String purple = "\033[35m";
        String blue = "\033[36m";

        System.out.println("\033[33m+"+"-".repeat(15)+"+"+"-".repeat(12)+"+"+"-".repeat(12)+"+");
        System.out.printf("|%4$s%1$-15s%5$s|%4$s%2$12s%5$s|%4$s%3$12s%5$s|\n","ITEM","QUANTITY","PRICE",whitebold,yellow,purple);
        System.out.println("\033[33m+"+"-".repeat(15)+"+"+"-".repeat(12)+"+"+"-".repeat(12)+"+");

        System.out.printf("|%4$s%1$-15s%5$s|%8$s%2$12d%5$s|%7$s%9$s%6$s%3$11.2f%5$s|\n",item1,quan1,price1,white,yellow,purple,green,blue,"$");
        System.out.printf("|%4$s%1$-15s%5$s|%8$s%2$12d%5$s|%7$s%9$s%6$s%3$11.2f%5$s|\n",item2,quan2,price2,white,yellow,purple,green,blue,"$");


        System.out.println("\033[33m+"+"-".repeat(15)+"+"+"-".repeat(12)+"+"+"-".repeat(12)+"+");
        
    }
}
