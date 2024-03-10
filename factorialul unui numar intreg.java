
//Danciu Camelia, gr 2123
/*2. Scrieti o aplicatie Java in care se citeste de la tastatura o valoare intreaga si se afiseaza 
factorialul numarului citit.
*/
import java.util.Scanner;

public class lab1
{
public static void main(String[] args)
{

Scanner scan=new Scanner(System.in);
int n,factorial=1;
System.out.println("Introduceti numarul n:");
n=scan.nextInt();
for(int i=1;i<=n;i++)
{factorial=factorial*i;
        
}
System.out.println("Factorialul numarului n este:"+factorial);
}
}
