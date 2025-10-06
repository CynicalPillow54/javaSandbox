package OutputToConsole;

public class MakingDecisions {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        System.out.printf("Numbers to compare are %d and %d\n", num1, num2);

        if (num1 > num2) {
            System.out.printf("Biggest number is %d\n", num1);
        }
        else if (num2 > num1) {
            System.out.printf("Biggest number is %d\n", num2);
        }
        else {
            System.out.println("Numbers are equal");
        }
    }
}
