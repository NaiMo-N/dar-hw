public class Average {

    public static void getAverage(int a, int b, int c) {
        double average = (a + b + c) / 3;
        System.out.println(average);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 0;
        getAverage(a, b, c);
    }
}
