//Danciu Camelia-Maria, gr 2123, lab 3, pb 2
/*2. Cititi un sir de caractere de la intrarea standard. Transformati sirul intr-un tablou de caractere. 
 * Cautati in acest tablou un caracter specificat in program. Afisati numarul de aparitii.*/
package tema1;
import java.util.Scanner; 
//import java.util.Arrays; 
public class pb1 {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner scan= new Scanner(System.in);
                int k=0,l=0;
                String s;
                
                System.out.println("Introduceti sirul de caractere:");
                s=scan.nextLine();
                System.out.println(s);
                String tablou[]=new String[s.length()];
                l=s.length();
                for(int i=0;i<l;i++)
                        tablou[i]=s.substring(i,i+1);
                        
                for(int i=0;i<l;i++)
                {
                        if(tablou[i].contains("a")) k++;
                }
                
                
                System.out.println("Caracterul 'a' apare in tabloul de caractere de: "+k+" ori.");
        }


}
