public class Proov1 {
    public static void main(String[] arg) {
        Vektor v1 = new Vektor(5, 4);
        Vektor v2 = new Vektor(9, 2);
        System.out.println(v1.x);
        System.out.println(v1.korruta(0.5).y);
        v1.liidaJuurde(v2.korruta(0.5));
        System.out.println(v1.x);


    }
}