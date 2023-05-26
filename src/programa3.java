public class programa3 {
    public static void main(String[] args) {
        int x1 = 25;
      int y1 = 37;
      int suma = dvigubaSuma( x1, y1 );
        System.out.println("suma = " + suma);
      int a1 = -200;
      int b1 = 100;
      int suma1 = dvigubaSuma1( a1, b1);
        System.out.println("suma1 = " + suma1);
    }
    public static int dvigubaSuma(int x, int y) {
        return 2 * ( x + y );
    }
    public static int dvigubaSuma1(int a, int b) {
        return  2 * ( a + b );
    }
}
