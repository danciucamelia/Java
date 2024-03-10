/*Danciu Camelia, gr 2123, lab 9, pb 1
 * 1. Să se creeze o aplicație Java în cadrul căreia există o clasă ce implementează interfața Runnable.
 *  Constructorul clasei permite definirea unui nume asociat fiecărui obiect instanțiat din clasa respectivă și de asemenea clasa are un atribut
 *  static ce contorizează numărul de obiecte instanțiate.
 *  Metoda run( ) a clasei va afișa numele obiectului de un număr de ori egal cu valoarea contorului și cu o întârziere de 1000 msec între afișări.*/
package labbbbbb;
import java.util.Scanner;

public class Test implements Runnable{
	static Scanner scan=new Scanner(System.in);
	String nume;
	static int nr;
	Test(String nume,int x)
	{
		this.nume=nume;
		this.nr=x;
	}
	public void run()
	{
		for(int i=0;i<nr;i++)
			try{
				System.out.println("\t\t"+nume);
				Thread.sleep(1000);
				}
				catch(InterruptedException ex){break;}
		
		//System.out.println(nume);
		}
	

	
public static void main(String[] args)
{
	
	Test obj[]=new Test[4];
	
	obj[0]=new Test("Ana",6);
	obj[1]=new Test("Andreea",4);
	obj[2]=new Test("Elena",3);
	obj[3]=new Test("Alexandra",5);
	
	for(int i=0;i<4;i++)
	{
	
	obj[i].run();
	
	}
	
	
}
}

