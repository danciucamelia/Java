
//Danciu Camelia-Maria, gr 2123, lab 3, pb 1
/*1. Scrieti o aplicatie Java in care cititi o valoare intreaga. In cazul in care valoarea intreaga este cuprinsa intre 1-12 sa se afiseze
 *  luna corespunzatoare. Considerati cazul in care valoarea introdusa este un sir de caractere si daca aceasta corespunde unei luni din an
 *   afisati valoarea numerica a lunii.*/
package tema1;
import java.util.Scanner; 
@SuppressWarnings("unused")
public class pb1 {
        public static void main(String[ ] args) {
                @SuppressWarnings("resource")
                Scanner scan=new Scanner(System.in);
                int n;                
                System.out.println("Introduceti un numar intreg: ");
                n=scan.nextInt(); 
                if(n>=1 && n<=12)
                {
                        if(n==1) System.out.println("Luna corespunzatoare numarului introdus este: ianuarie");
                        if(n==2) System.out.println("Luna corespunzatoare numarului introdus este: februarie");
                        if(n==3) System.out.println("Luna corespunzatoare numarului introdus este: martie");
                        if(n==4) System.out.println("Luna corespunzatoare numarului introdus este: aprilie");
                        if(n==5) System.out.println("Luna corespunzatoare numarului introdus este: mai");
                        if(n==6) System.out.println("Luna corespunzatoare numarului introdus este: iunie");
                        if(n==7) System.out.println("Luna corespunzatoare numarului introdus este: iulie");
                        if(n==8) System.out.println("Luna corespunzatoare numarului introdus este: august");
                        if(n==9) System.out.println("Luna corespunzatoare numarului introdus este: septembrie");
                        if(n==10) System.out.println("Luna corespunzatoare numarului introdus este: octombrie");
                        if(n==11) System.out.println("Luna corespunzatoare numarului introdus este: noiembrie");
                        if(n==12) System.out.println("Luna corespunzatoare numarului introdus este: decembrie");
                        
                }
                else System.out.println("Numarul introdus nu corespunde unei luni din an");
                String s;
                System.out.println("\nIntroduceti un sir de caractere:");
                //s=scan.nextLine(); 
                s=scan.next();
                //System.out.println(s);
                        if(s.equals("ianuarie")) System.out.println("Numarul corespunzator lunii introduse este: 1");
                        if(s.equals("februarie")) System.out.println("Numarul corespunzator lunii introduse este: 2");
                        if(s.equals("martie")) System.out.println("Numarul corespunzator lunii introduse este: 3");
                        if(s.equals("aprilie")) System.out.println("Numarul corespunzator lunii introduse este: 4");
                        if(s.equals("mai")) System.out.println("Numarul corespunzator lunii introduse este: 5");
                        if(s.equals("iunie")) System.out.println("Numarul corespunzator lunii introduse este: 6");
                        if(s.equals("iulie")) System.out.println("Numarul corespunzator lunii introduse este: 7");
                        if(s.equals("august")) System.out.println("Numarul corespunzator lunii introduse este: 8");
                        if(s.equals("septembrie")) System.out.println("Numarul corespunzator lunii introduse este: 9");
                        if(s.equals("octombrie")) System.out.println("Numarul corespunzator lunii introduse este: 10");
                        if(s.equals("noiembrie")) System.out.println("Numarul corespunzator lunii introduse este: 11");
                        if(s.equals("decembrie")) System.out.println("Numarul corespunzator lunii introduse este: 12");
                        
                        else System.out.println("Sirul de caractere introdus nu corespunde unei luni din an");
        }


}




