public class Calculate {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        int result = 0;
        for (int i = 0; i < y; i++) {
            result += x;
        }
        return result;
    }

    public static int power(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public static int div(int x, int y) {
        int count = 0;
        while (x >= y) {
            x -= y;
            count++;
        }
        return count;
    }

    public static double divide(int x, int y) {
        if (y == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) x / y;
    }

    public static int mod(int x, int y) {
        while (x >= y) {
            x -= y;
        }
        return x;
    }
}