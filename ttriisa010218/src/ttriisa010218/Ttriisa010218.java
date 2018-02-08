/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttriisa010218;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zeus
 */

public class Ttriisa010218 {

    /**
     * @param args the command line arguments
     */
    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }

    public static void soojusHindamine(int temperatuur) {
        if (isBetween(temperatuur, -999, 18)) {
            System.out.println("Toas on külm");
        } else if (isBetween(temperatuur, 19, 24)) {
            System.out.println("Toas on normaalne temperatuur");
        } else {
            System.out.println("Toas on palav");
        }
    }
     

    public static void main(String[] args) {
        List<Pall> pallid = new ArrayList<Pall>();
        pallid.add(new Pall(3,5));
        pallid.add(new Pall(3,5));
        pallid.add(new Pall(2, 5, 2));
        pallid.add(new Pall(3,5));
        Pall suurimPall = new Pall();
        for(Pall p:pallid) {
            System.out.println(p);
            if(p.getR() > suurimPall.getR()) {
                suurimPall = p;
            }
        }
        System.out.println("Suurim pall on "+suurimPall);
        /*
        Pall[] pallid= new Pall[3];
        int suurimIndex = 0;
        double suurim = 0;
        pallid[0]= new Pall(3,5,1);
        pallid[1]= new Pall(4,6,1);
        pallid[2]= new Pall(-10,8,1);
        for (int i = 0; i < pallid.length; i++) {
            System.out.println(pallid[i]);
            if(pallid[i].kaugusNullist() > suurim) {
                suurim = pallid[i].kaugusNullist();
                suurimIndex = i;
            }
        }
        System.out.println("kaugeim pall on "+pallid[suurimIndex]);
        */
       /* Pall p1 =new Pall(0, 0, 1);
        Pall p2 =new Pall(0, 5, 4);
        Pall p2 =new Pall(0, 5, 4);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p2.kaugusNullist());
        System.out.println(p2.kaugusPallist(p1));
        System.out.println(p2.collision(p1));*/
    }
    
}
