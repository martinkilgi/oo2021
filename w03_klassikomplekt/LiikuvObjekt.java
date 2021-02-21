public class LiikuvObjekt{
    Vektor asukoht;
    Vektor kiirus;
    public LiikuvObjekt(double x, double y, double dx, double dy) {
        asukoht = new Vektor(x, y);
        kiirus = new Vektor (dx, dy);
    }
    public LiikuvObjekt(double x, double y) {
        this(x, y, 0, 0);
    }
    public void liigu(double sek) {
        asukoht.liidaJuurde(kiirus.korruta(sek));
    }
    public void liigu() {
        liigu(1);
    }
    public String toString() {
        return asukoht.toString()+"-"+kiirus.toString();
    }

}