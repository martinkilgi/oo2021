import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

public class proovikt {

    public static double aritmk(double arv1, double arv2, double arv3) {
        double summa = 0;
        double keskmine = 0;
        summa = arv1 + arv2 + arv3;
        keskmine = summa / 3;
        
        return keskmine;
    }

    public static double[] libisevk(double[] arvud) {
        double[] tulemused = new double[arvud.length - 2];
        for(int i = 0; i<arvud.length-2; i++) {
            tulemused[i] = (arvud[i]+ arvud[i+1] + arvud[i+2])/3;
        }
        return tulemused;
    }

    public static int[] andmedListi()throws Exception {
        BufferedReader sisse=new BufferedReader(new FileReader("arvud2.txt"));
        int[] andmed = new int[10];
        for(int i = 0; i<8; i++) {
            andmed[i] = Integer.parseInt(sisse.readLine());

        }
        return andmed;
    }

    public static void main(String[] arg)throws Exception {
        double[] testlist = {1, 3, 5, 7, 8, 4, 2};
        double[] proov = libisevk(testlist);
        System.out.println("Kolme numbri aritmeetiline keskmine: "+aritmk(1, 2, 3));
        System.out.println("----------------------------");
        System.out.println("Massiivi libiseva keskmise väärtused: ");
        for(int i = 0; i<proov.length; i++) {
            System.out.println(proov[i]);
        }

        //BufferedReader sisse=new BufferedReader(new FileReader("arvud2.txt"));
        //String rida1=sisse.readLine();
        int[] graafikalist = andmedListi();
        System.out.println(graafikalist.length);

        BufferedImage pilt=new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
		Graphics g = pilt.createGraphics();
        g.setColor(Color.RED);
        int lugeja = 0;
        for(int x = 0; x < graafikalist.length; x++) {
            lugeja+=1;
            g.drawRect(lugeja, graafikalist[x], 1, 1);
        }
        ImageIO.write(pilt, "png", new File("pilt2.png"));
      
        
    }
}