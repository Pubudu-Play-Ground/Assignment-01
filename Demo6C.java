public class Demo6C {
    public static void main(String[] args) {
        String city1 = "Los Angeles";
        String state1 = "California";
        
        String city2 = "New York";
        String state2 = "New York";

        int population1 = 3966936;
        int population2 = 8336817;

        String yellow = "\033[33m";
        String white = "\033[0m";
        String green = "\033[32m";
        String purple = "\033[35m";

        System.out.println("\033[33m+"+"-".repeat(15)+"+"+"-".repeat(12)+"+"+"-".repeat(12)+"+");
        System.out.printf("|%4$s%1$-15s%5$s|%4$s%2$-12s%5$s|%4$s%3$12s%5$s|\n","CITY","STATE","POPULATION",white,yellow,purple);
        System.out.println("\033[33m+"+"-".repeat(15)+"+"+"-".repeat(12)+"+"+"-".repeat(12)+"+");
        System.out.printf("|%4$s%1$-15s%5$s|%4$s%2$-12s%5$s|%6$s%3$,12d%5$s|\n",city1,state1,population1,white,yellow,purple);
        System.out.printf("|%4$s%1$-15s%5$s|%4$s%2$-12s%5$s|%6$s%3$,12d%5$s|\n",city2,state2,population2,white,yellow,purple);
        System.out.println("\033[33m+"+"-".repeat(15)+"+"+"-".repeat(12)+"+"+"-".repeat(12)+"+");
        
    }

}
