public class Pall {
    LiikuvObjekt lobj;
    double aeglustuskoef;

    public Pall(double x, double y, double dx, double dy, double akoef) {
        lobj = new LiikuvObjekt(x, y, dx, dy);
        aeglustuskoef = akoef;
    }
    public void liigu(double sek) {
        lobj.liigu(sek);
        lobj.kiirus = lobj.kiirus.korruta(Math.pow(aeglustuskoef, sek));
    }
    public double kaugus(LiikuvObjekt obj) {
        Vektor asukoht1 = this.lobj.asukoht;
        Vektor asukoht2 = obj.asukoht;
        double dx = asukoht1.x - asukoht2.x;
        double dy = asukoht1.y - asukoht2.y;
        double vahemaa = Math.sqrt(dy*dy + dx*dx);
        return vahemaa;
    }
    public String toString() {
        return "Pall "+aeglustuskoef+" "+lobj;
    }

}