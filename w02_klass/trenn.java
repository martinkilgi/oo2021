import java.util.*;
public class trenn {
    Hashtable<String, Double> harjutused = new Hashtable<String, Double>();
    public Set kysiHarjutuseNimed() {
        return harjutused.keySet();
    }
    public Hashtable<String, Double> kysiHarjutused() {
        return harjutused;
    }

    public void lisaHarjutus(String harjutus, Double raskus){
        if(harjutused.containsKey(harjutus)){
            throw new RuntimeException(harjutus+" on juba lisatud");
        }
        harjutused.put(harjutus, raskus);
    }

    // public trenn test(String nimi, double koef, int raskus) {
    //     trenn uus = new trenn();
    //     this.harjutuseNimi = nimi;
    //     this.koef = koef;
    //     this.raskus = raskus;
    //     //int[] kordused = new int[mitukordust];
    //     //int[] erinevadRaskused = new int[raskused];
    // }

    public void muudaAndmeid (String harjutus, Double muudetavRaskus) {
        harjutused.put(harjutus, muudetavRaskus);
    }

    public double pohiKolmikuSumma () {
        double harjutusteSumma = 0;
        String[] kolmSuurt = {"Jõutõmme", "Kükk", "Rinnalt surumine"};
        for(int i = 0; i < 3; i++) {
            harjutusteSumma += harjutused.get(kolmSuurt[i]);
        }
        return harjutusteSumma;
    }

    public double[] showOlympic() {
        double kukk = harjutused.get("Kükk");
        double joutomme = harjutused.get("Jõutõmme");
        double[] snatch_CnJ = {kukk*0.66, kukk*0.8};
        return snatch_CnJ;
    }
}
