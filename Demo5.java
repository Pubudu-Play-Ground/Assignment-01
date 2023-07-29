public class Demo5 {
    public static void main(String[] args) {
        int num1 = 978;
        int num2 = 3;
        int num3 = 16;
        int num4 = 1484100;

        String A = "\033[0m";

        System.out.printf("\033[31m%d%5$s-\033[32m%d%5$s-\033[33m%d%5$s-\033[34m%d",num1,num2,num3,num4,A);
    }
}
