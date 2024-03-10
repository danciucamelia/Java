/*Danciu Camelia , gr 2123, lab 4, pb 6
 * 6. Definiți un șir unidimensional de valori de tip char, având numărul mai mic sau cel mult egal cu un n citit de la tastatură.
 *  Fiecare valoare conține valori alfa-numerice generate aleator. Transformați șirul de caractere într-un obiect de tip String.
 *   Afișați valoarea inițială și apoi valoarea obținută prin înlocuirea fiecărui caracter numeric cu ‘*’.*/
package pb6;
import java.util.Scanner;
import java.util.Random;
public class test {
        static Scanner scan=new Scanner(System.in);
        static Random rand= new Random();
public static void main(String[] args)
{
        int n;
        System.out.println("Introduceti n:");
        n=scan.nextInt();
        String[] sir=new String[n];
        for(int i=0;i<n;i++)
        {
                sir[i]= rand.toString();
                //sir[i]=rand.
        }
        System.out.println("Sirul este:");
        for(int i=0;i<n;i++)
        {
                //sir[i]= rand.toString();
                System.out.print(sir[i]);
        }
        for(int i=0;i<n;i++)
        {
                //sir[i]= rand.toString();
                sir[i]="*";
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
                System.out.print(sir[i]);
        }
        
}
}
