/*Danciu Camelia, gr 2123, lab 9 pb 1
 * 2. Scrieti o aplicatie Java in care un fir de executie genereaza 30 numere aleatoare intre 0 si 30 si un alt fir de executie afiseaza
 *  aria cercului cu raza generata de primul fir de executie, daca aceasta raza este divizibila cu 3.*/
package exercitiu;
import java.util.Random;

public class Test {
	static Random rand=new Random();
	
public void generare()
{
	int x[]=new int[30];
	for(int i=0;i<30;i++)
	{
		x[i]=rand.nextInt(31);
	}
	
	for(int i=0;i<30;i++)
	{
		if(x[i]%3==0)
	System.out.println("Aria cercului cu raza "+x[i]+"este:"+(3.14*x[i]*x[i]));
		
	}
}

public static void main(String[] args)
{
	Test t=new Test();
	t.generare();
}
}
