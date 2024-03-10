//Danciu Camelia-Maria, gr 2123, lab 3, pb 6
/*6. Scrieti un program Java care genereaza 2 valori aleatoare si efectueaza asupra lor cateva operatii matematice.*/
package tema1;
import java.util.Random;
import java.util.Scanner; 
import java.math.*;
//import java.util.Arrays; 
public class pb1 {
        public static void main(String[] args) {
                int x,y;
        Random rand=new Random();
        x=rand.nextInt();
        y=rand.nextInt();
        System.out.println("Suma numerelor este:"+(x+y));
        System.out.println("Diferenta numerelor este:"+(x-y));
        System.out.println("Produsul numerelor este:"+(x*y));
        System.out.println("Media aritmetica a numerelor este:"+(x+y)/2);
        if(x>0 && y>0) 
                {
                System.out.println("Radical din x este:"+Math.sqrt(x)+" ,iar din y este:"+Math.sqrt(y));
                System.out.println("Media geometrica a numerelor este:"+Math.sqrt(x*y));
                }
        

}
        }
