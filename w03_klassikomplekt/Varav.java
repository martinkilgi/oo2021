import java.lang.Math;

public class Varav {
    LiikuvObjekt sobj;
    double skoor;

    public Varav(double x, double y) {
        sobj = new LiikuvObjekt(x, y);

    }
    public double pindala(double x, double y) {
        double vaartus = x*y;
        return vaartus;
    }
    public String kasPunkt (LiikuvObjekt obj) {
        Vektor palliAsukoht = obj.asukoht;
        Vektor varavaAsukoht = this.sobj.asukoht;
        double dx = varavaAsukoht.x - palliAsukoht.x;
        double dy = varavaAsukoht.y - palliAsukoht.y;
        String tulemus = "";
        if(Math.abs(dx) <= 3 && Math.abs(dy) <= 3) {
             tulemus = "Lisandus üks punkt";
             skoor += 1;
        } else {
             tulemus = "Pall ei ole väravas, seega punkti ei tule";
        }
        return tulemus;
    }

    //Pooleli
    public double kysiSkoori(double skoor) {
        String score = System.out.println("Skoor: "+skoor);
        return score;
    }
}
   