import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;

public class DiagonalsOfSquare {
    public double getDiagonal(double a) {
        return Math.sqrt(2) * a;
    }

    public double getPerimeter(double a) {
        return 4 * a;
    }

    public double getArea(double a) {
        return a * a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        DiagonalsOfSquare d = new DiagonalsOfSquare();
        System.out.println("length of diagonal: "+d.getDiagonal(a));
        System.out.println("perimeter of diagonal: "+d.getPerimeter(a));
        System.out.println("area of diagonal: "+d.getArea(a));
    }
}
