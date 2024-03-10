//Danciu Camelia, gr 2123
/*5. Scrieti o aplicatie Java in care cititi de la tastatura mai multe numere intregi si verificati daca sunt numere prime. 
 * Numarul de valori citite este preluat de la tastatura sau din linia de comanda.
*/
import java.util.Scanner;

public class lab2
{
@SuppressWarnings("resource")
public static void main(String[] args)
{

Scanner scan=new Scanner(System.in);
int n,nr,k=0;
System.out.println("Introduceti numarul de numere:");
n=scan.nextInt();

System.out.println("Introduceti numerele:");
for (int i=1;i<=n; i++)
       
        {
              System.out.println("n:");
              nr=scan.nextInt();
              for(int j=1;j<=nr;j++)
              {
                      if(nr%j==0) k++;
              }
              if(k==2 || nr==2) System.out.println("Numarul este prim");
              else System.out.println("Numarul NU este prim");
              k=0;
        }

}
}
