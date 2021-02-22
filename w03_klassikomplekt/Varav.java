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
    public double kasPunkt (Pall obj) {
        Vektor palliAsukoht = obj.lobj.asukoht;
        Vektor varavaAsukoht = this.sobj.asukoht;
        double dx = varavaAsukoht.x - palliAsukoht.x;
        double dy = varavaAsukoht.y - palliAsukoht.y;
        if(Math.abs(dx) <= 3 && Math.abs(dy) <= 3) {
             System.out.println("Lisandus üks punkt");
             skoor += 1;
        } else {
            System.out.println("Pall ei ole väravas, punkti ei tule!");
        }
        System.out.println("Skoor: "+skoor);
        return skoor;
    }

    public String toString() {
        return "Värav "+sobj;
    }

    //Pooleli
    // public double kysiSkoori(double skoor) {
    //     String score = System.out.println("Skoor: "+skoor);
    //     return score;
    // }
}
   