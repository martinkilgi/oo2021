public class kodutoo {
    public static double[] trenn(double raskus) {
        double[] protsendid = new double[6];
        //double[] protsendid = {1.0, 0.9, 0.85, 0.8, 0.75, 0.7};
        protsendid[0] = raskus;
        protsendid[1] = (raskus*0.9);
        protsendid[2] = (raskus*0.85);
        protsendid[3] = (raskus*0.8);
        protsendid[4] = (raskus*0.75);
        protsendid[5] = (raskus*0.70);
        return protsendid;
    }
    public static void main(String[] arg) {
        double[] tulemused = trenn(115);
        String[] kordused = {"1 korduse.", "3 kordust.", "5 kordust.", "8 kordust.", "10 kordust.", "12 kordust."};
        for(int i=0; i<5; i++) {
            System.out.println("Raskusega "+tulemused[i]+" kilogrammi peaksid tegema "+kordused[i]);
        }
    }
}