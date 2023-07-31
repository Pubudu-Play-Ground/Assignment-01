public class Demo6B {
    public static void main(String[] args) {
        String name1 = "Alice";
        String name2 = "Bob";
        int age1 = 24;
        int age2 = 30;

        System.out.println("\033[34m+"+"-".repeat(11)+"+"+"-".repeat(4)+"+");

        System.out.printf("|\033[31;1m %-10s\033[34m|\033[31;1m%4s\033[34m|\n","NAME","AGE");

        System.out.println("+"+"-".repeat(11)+"+"+"-".repeat(4)+"+");
        System.out.printf("| \033[0m%-10s\033[34m|\033[35m%4s\033[34m|\n",name1,age1);
        System.out.printf("| \033[0m%-10s\033[34m|\033[35m%4s\033[34m|\n",name2,age2);
        System.out.println("+"+"-".repeat(11)+"+"+"-".repeat(4)+"+");
    }
}
