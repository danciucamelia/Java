/*1. Scrieți o clasă Methods in care să aveți 3 metode: o metodă cu număr variabil de parametri de tip intreg, care returnează media aritmetică
 *  a parametrilor; o altă metodă în care să definiți un tablou unidimensional de n numere de tip double 
 *  (n fiind parametrul metodei și care va fi citit în main() de la tastatură), elementele acestuia vor primi valori generate aleator 
 *  și metoda va returna acest tablou; o metodă statică ce primește ca parametru un tablou de caractere, convertește caracterele respective 
 *  în majuscule și formează din acest șir un obiect String, pe care îl returnează. Din metoda main(), definită intr-o altă clasă,
 *   apelați metodele clasei Methods și afișați rezultatele pe ecran (valorile de apel pentru prima metodă și șirul de caractere cu 
 *   care se apelează a 3-a metodă se vor defini în main()).*/
package lab4;
import java.util.Scanner;

public class Methods_02 {
 Scanner scan=new Scanner(System.in);
        float media(int n,int nr,int s)
        {
                s=0;
                for(int i=1;i<=n;i++)
                {
                        s=s+nr;
                }
                        return s/n;
        }
        
     double[] tablou(double nr[],int n)
        {
                for(int i=0;i<n;i++)
                {
                        System.out.println("Introduceti elementul n["+i+"]:");
                    //scan.nextLine();
                        nr[i]=Math.random();
                        //scan.close();
                   
                }
                 return nr;
                
        }
     String tablou_caractere(String s,int n)
     {
             s="data de azi este 23.03.2023";
             
            return s.toUpperCase();
            
     }
     
        
}



//Methods_02.java:
package lab4;
import java.util.Scanner;

public class problema_1 {
Methods_02 ob=new Methods_02();
Scanner scan=new Scanner(System.in);
int nr;

System.out.println("introduceti numarul de numere intregi:");
nr=scan.nextLine();
ob.media(n,nr,s);

}




