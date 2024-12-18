public class StarTriangle {
    int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    public String starMaker(){
        for(int i=1; i<=width; i++){
            for(int j=0; j<i; j++){
                System.out.print("[*]");
            }
            System.out.println();
        }
        return null;
    }

    @Override
    public String toString() {
        return starMaker();
    }

    public static void main(String[] args) {
        StarTriangle small = new StarTriangle(6);
        System.out.println(small.starMaker());
    }
}
