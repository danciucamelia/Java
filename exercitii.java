
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
        String sir;
        int n;
        System.out.println("Datele primului obiect instantiat:");
        System.out.println("\tIntroduceti numele:");
        sir=scan.nextLine();
        System.out.println("\tIntroduceti numarul de aparitii:");
        n=scan.nextInt();
        
        
        
        Test t=new Test(sir,n);
        
        
        System.out.println("Se afiseaza "+sir+" de "+n+" ori:");
        t.run(); 
        
        
}
}





//_____________________________________________________________










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










//_____________________________________________________________





/*Danciu Camelia, gr 2123, lab 9 pb 2
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













//_____________________________________________________________





/*Danciu Camelia, grupa 2123, lab 9,pb 5
 * 5. Scrieți o aplicație Java ce calculează cel mai mare divizor comun a două numere mari (>100.000).
 *  Aplicația va citi de la tastatură în mod continuu perechi de câte două numere și va lansa în execuție câte un thread pentru 
 *  fiecare pereche citită. Rezultatele vor fi afișate în consolă în momentul finalizării metodei de calcul a cmmdc.*/
package wert;

import java.math.BigInteger;
import java.util.Scanner;

public class Test{
    private static final Object lock = new Object();
    private static BigInteger cmmdc = BigInteger.ZERO;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Introduceti doua numere mari (>100.000):");
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();

            CMMDCThread cmmdcThread = new CMMDCThread(a, b);
            cmmdcThread.start();

            try {
                cmmdcThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock) {
                System.out.println("CMMDC(" + a + ", " + b + ") = " + cmmdc);
                cmmdc = BigInteger.ZERO;
            }
        }
    }

    private static class CMMDCThread extends Thread {
        private BigInteger a;
        private BigInteger b;

        public CMMDCThread(BigInteger a, BigInteger b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            BigInteger r;
            BigInteger aa = a;
            BigInteger bb = b;

            while (!bb.equals(BigInteger.ZERO)) {
                r = aa.mod(bb);
                aa = bb;
                bb = r;
            }

            synchronized (lock) {
                if (aa.compareTo(cmmdc) > 0) {
                    cmmdc = aa;
                }
            }
        }
    }
}














//_____________________________________________________________







/*Danciu Camelia, grupa 2123, lab 9,pb 6
 * 6. Scrieti o aplicatie Java in care un fir de executie scrie informatie intr-un fisier,
 *  iar celalalt citeste informatia din acelasi fisier 
 * si o afiseaza pe ecran. Realizati sincronizarea firelor de executie.*/
package wert;
import java.io.*;

public class Test {
    private static final String fisier = "test.txt";

    public static void main(String[] args) {
        Thread scrie = new Thread(() -> {
            try {
                FileWriter fileWriter = new FileWriter(fisier);
                synchronized (fileWriter) {
                    fileWriter.write("Data de azi este: 07/05/2023\n");
                }
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread citire = new Thread(() -> {
            try {
                FileReader fileReader = new FileReader(fisier);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                synchronized (bufferedReader) {
                    String linie;
                    while ((linie = bufferedReader.readLine()) != null) {
                        System.out.println(linie);
                    }
                }
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        scrie.start();
        citire.start();

        try {
            scrie.join();
            citire.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
