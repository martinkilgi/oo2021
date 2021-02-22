public class Proov2 {
    public static void main(String[] arg) {
        LiikuvObjekt o1 = new LiikuvObjekt(4, 3, 2, 1);
        LiikuvObjekt o2 = new LiikuvObjekt(6, 6, 0, 0);
        //LiikuvObjekt varav = new LiikuvObjekt(10, 10, 0, 0);
        System.out.println(o1+" "+o2);
        o1.liigu();
        o2.liigu();
        System.out.println(o1+" "+o2);

        Pall p1 = new Pall(5, 5, 1, 1, 0.8);
        p1.liigu(1);
        System.out.println(p1);
        p1.liigu(1);
        System.out.println(p1);

        System.out.println(o1);
        System.out.println(p1);
        System.out.println(p1.kaugus(o1));


        //Uus osa
        Varav v1 = new Varav(15, 15);
        Mangija m1 = new Mangija(7, 7, 1, 1, 0.5);

        //m1.liigu(4);

        m1.looPalli(p1);
        m1.looPalli(p1);
        m1.looPalli(p1);

        System.out.println(p1);
        System.out.println(m1);
        System.out.println(v1);

        System.out.println(v1.kasPunkt(p1));

        //Pooleli
        //v1.kasPunkt(p1);
    }
}