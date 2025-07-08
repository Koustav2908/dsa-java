public class Factorial {

    static int fact(int num) {
        if (num == 1)
            return num;
        else
            return num * fact(num - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        int factorial = fact(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}