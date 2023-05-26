public class programa1 {
    public static void main(String[] args) {

        double a1 = 17.35;
        double b1 = 18;
        double c1 = 20.47;
        double d1 = 16.37;
        double perimetras = apskaiciuotiPerimetra(a1,b1,c1,d1);
        System.out.println("perimetras = " + perimetras);
    }
    public static double apskaiciuotiPerimetra(double a, double b, double c, double d) {
        return  a * b * c * d;
    }
}
