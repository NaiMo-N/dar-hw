public class Rectangle {
    int height;
    int width;

    Rectangle(int h, int w) {
        height = h;
        width = w;
    }

    public int returnArea() {
        return height * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 14);
        Rectangle rectangle2 = new Rectangle(5, 9);
        System.out.println(rectangle.returnArea());
        System.out.println(rectangle2.returnArea());
    }
}
