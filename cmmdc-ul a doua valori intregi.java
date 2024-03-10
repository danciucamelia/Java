//Danciu Camelia, gr 2123
/*3. Scrieti o aplicatie Java in care se citesc de la tastatura 2 valori intregi si se afiseaza cmmdc-ul valorilor.
*/
import java.util.Scanner;

public class lab2
{
@SuppressWarnings("resource")
public static void main(String[] args)
{

Scanner scan=new Scanner(System.in);
int n,m,c=0;
System.out.println("Introduceti numarul n:");
n=scan.nextInt();
System.out.println("Introduceti numarul m:");
m=scan.nextInt();
for (int i=1;i<=n; i++)
        for(int j=1;j<=m;j++)
        {
                if(i==j && m%j==0 && n%i==0)
                        {c=i; 
                break;}
        }
System.out.println("Cmmdc-ul numerelor este:"+ c);
}
}
