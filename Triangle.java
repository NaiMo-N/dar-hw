public class Triangle {
    int a, b, c;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int perimeter() {
        return a + b + c;
    }

    public double area() {
        double semiPerimeter = perimeter()/2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("perimeter: " + triangle.perimeter());
        System.out.println("area: " + triangle.area());
    }
}
