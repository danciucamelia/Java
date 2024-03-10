
//Danciu Camelia, gr 2123
/*4. Scrieti o aplicatie Java in care cititi de la tastatura un numar intreg si afisati toti divizorii numarului citit.
*/
import java.util.Scanner;

public class lab2
{
@SuppressWarnings("resource")
public static void main(String[] args)
{

Scanner scan=new Scanner(System.in);
int n;
System.out.println("Introduceti numarul n:");
n=scan.nextInt();

System.out.println("Divizorii numarului n sunt:");
for (int i=1;i<=n; i++)
       
        {
                if(n%i==0)
                        System.out.println( i);
        }

}
}
