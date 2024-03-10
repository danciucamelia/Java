//Danciu Camelia-Maria, gr 2123, lab 3, pb 3
/*3. Pornind de la problema precedenta, copiati primele 3 caractere din sir intr-un alt tablou si afisati rezultatul obtinut
 *  (folositi metoda arraycopy() din clasa System).*/
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
                l=s.length();
                String tablou[]=new String[l];
                String tablou2[]=new String[3];
                
                for(int i=0;i<l;i++)
                        tablou[i]=s.substring(i,i+1);
                        
                for(int i=0;i<l;i++)
                {
                        if(tablou[i].contains("a")) k++;
                }
                System.arraycopy(tablou, 0, tablou2, 0,3);
                
                
                System.out.println("Caracterul 'a' apare in tabloul de caractere de: "+k+" ori.");
                System.out.println("Cel de-al doilea tablou este:");
                for (int i = 0; i < tablou2.length; i++)
                    System.out.print(tablou2[i]);
        }
