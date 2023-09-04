public class Main {
    public static float fractionsSum(int num) {
        float sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += (1 / (float)(i * i));
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.printf("%.16f\n", fractionsSum(2));
        System.out.printf("%.16f\n", fractionsSum(3));
        System.out.printf("%.16f\n", fractionsSum(5));
        System.out.printf("%.16f\n", fractionsSum(7));
        System.out.printf("%.16f\n", fractionsSum(10));
    }
}