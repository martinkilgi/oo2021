import java.lang.Math;

public class Mangija {
    LiikuvObjekt lobj;

    public Mangija(double x, double y, double dx, double dy) {
        lobj = new LiikuvObjekt(x, y, dx, dy);
    }
    public void looPalli(Pall obj) {
        Vektor palliKoht = obj.lobj.asukoht;
        Vektor mangijaKoht = this.lobj.asukoht;
        double dx = palliKoht.x - mangijaKoht.x;
        double dy = palliKoht.y - mangijaKoht.y;
        if(Math.abs(dx) <= 3 && Math.abs(dy) <= 3) {
            obj.liigu(5);
            //loogiOtsus = "Mängija lõi palli!";
       }
    }
    public String toString() {
        return "Mängija "+lobj;
    }
}