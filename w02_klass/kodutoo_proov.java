public class kodutoo_proov {
    public static void main(String[] arg) {
        trenn joutreening = new trenn();
        joutreening.lisaHarjutus("Jõutõmme", 200.0);
        joutreening.lisaHarjutus("Kükk", 160.0);
        joutreening.lisaHarjutus("Rinnalt surumine", 140.0);
        joutreening.lisaHarjutus("Õlapress", 90.0);
        joutreening.muudaAndmeid("Kükk", 180.0);
        double[] snatch_CnJ = joutreening.showOlympic();
        System.out.println("Kolme põhiharjutuse summa: "+joutreening.pohiKolmikuSumma());
        System.out.println("Peaksid jõudma rebida(Snatch): "+snatch_CnJ[0]+" kg");
        System.out.println("Peaksid jõudma tõugata(Clean&Jerk): "+snatch_CnJ[1]+" kg");
        System.out.println(joutreening.kysiHarjutuseNimed());
        System.out.println(joutreening.kysiHarjutused());
        
    }
}

