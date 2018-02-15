/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttriisa010218;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author zeus
 */
public class Massiivid {

    public static int[] arvudPiirid(int[] arvud) {
        if(arvud == null) {
            throw new RuntimeException("parameetri väärtus null");
        }
        if(arvud.length == 0) {
            throw new RuntimeException("parameetriks tühi massiiv");
        }
        int[] vastus = new int[2];
        vastus[0] = vastus[1] = arvud[0];
        
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        for(int arv: arvud) {
            if(arv>max) {
                max = arv;
            }
            if (arv<min) {
                min = arv;
            }
        }
        vastus[0] = (int) min;
        vastus[1] = (int) max;
        return vastus;
    }
    
    public static int arvudSumma(int[] arvud) {
        return IntStream.of(arvud).sum();
    }
    
    public static float arvudKeskmine(int[] arvud) {
        return arvudSumma(arvud) / (float) arvud.length;
    }
    
    public static void main(String[] arg) {
        int[] pikkused = {176, 163, 158, 171, 169};
        System.out.println("Kokku: "+pikkused.length);
        System.out.println(pikkused[0]+" "+pikkused[pikkused.length-1]);
        int sum, sum2;
        sum = 0;
        sum2 = 0;
        for(int i=0; i<pikkused.length; i++) {
            System.out.println(pikkused[i]);
            sum += pikkused[i];
        }
        System.out.println("pikkuste summa1 on "+sum);
        for(int pikkus: pikkused){sum2+=pikkus;}
        System.out.println("pikkuste summa2 on "+sum2);
        System.out.println("pikkuste summa3 on "+Arrays.stream(pikkused).sum());
        System.out.println("pikkuste summa4 on "+arvudSumma(pikkused));
        System.out.println("pikkuste piirid on "+Arrays.toString(arvudPiirid(pikkused)));
       
    }
}
