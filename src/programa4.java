public class programa4 {
    public static void main(String[] args) {
        String s1 = "penktadienis";
        String s1Pakartotinai = zodisTrisKartus(s1);
        System.out.println("s1Pakartotinai = " + s1Pakartotinai);
    }
    public static String zodisTrisKartus(String zodis) {
        return zodis + " " + zodis + " " +zodis;
    }
}
