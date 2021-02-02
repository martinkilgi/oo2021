public class Funktsioonid1{
    public static double taksosoit(double km) {
        double istumine = 3;
        double summa = istumine+km*0.8;
        return summa;
    }
    public static String temperatuurihinnang(int t) {
        if(t<18) {return "külm";}
        return "soe";
    }
    public static double ringiPindala(double r) {
        return Math.PI*r*r;
    }
    public static void main(String[] arg) {
        System.out.println(ringiPindala(5));
        if(arg.length==1) {
            System.out.println(temperatuurihinnang(Integer.parseInt(arg[0])));
        }
        System.out.println(taksosoit(23));
    }
}