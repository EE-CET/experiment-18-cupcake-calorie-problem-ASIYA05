public class Cupcake {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] cal = new int[n];

        for (int i = 0; i < n; i++) {
            cal[i] = sc.nextInt();
        }

        java.util.Arrays.sort(cal);

        long miles = 0;
        int power = 0;

        for (int i = n - 1; i >= 0; i--) {
            miles += (long) cal[i] * (1L << power);
            power++;
        }

        System.out.println(miles);
    }
}
