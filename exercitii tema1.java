
/*Danciu Camelia, grupa 2123, lab 6, pb1
 * 1. Scrieti un program Java care defineste un sir de valori de tip double care vor fi citite de la tastatura.
 *  Tratati exceptia data de accesarea unui element cu index negativ sau mai mare decat indexul ultimului element din sir 
 *  (ArrayIndexOutOfBoundsException). Afisati un mesaj corespunzator in momentul detectarii exceptiei.
 *  Considerati o matrice (cu numar de coloane fix pentru fiecare linie) si tratati exceptia posibil a aparea.
 *   Considerati si cazul in care matricea are numar diferit de coloane la fiecare linie.*/

package tema6;
import java.util.Scanner;

public class test {

        
        public static void main(String[] args)
        {
                test obj=new test();

                 int n;
                
                @SuppressWarnings("resource")
                Scanner scan=new Scanner(System.in);
                
                System.out.println("Introduceti numarul de valori ale sirului:");
                n=scan.nextInt();
                 double[] s= new double[n];
                        
                        //n=s.length;
                        System.out.println("Introduceti valorile sirului:");
                        for(int i=0;i<s.length;i++)
                        {
                                System.out.println("s["+(i+1)+"]=");
                                s[i]=scan.nextDouble();
                        }
                        
                        int index;
                        System.out.println("Introduceti un index:");
                        index=scan.nextInt();
                        for(int i=0;i<n;i++)
                        {
                                boolean ok=true;
                                try { obj.metodaPericuloasa(index,n);
                                        
                                }
                                catch(ArrayIndexOutOfBoundsException e){
                                        ok=false;
                                        System.out.println("Metoda periculoasa");
                                        
                                }
                                if(ok) System.out.println("Indexul introdus e corect.");
                        }
                
                        int l,c,i,j;
                        
                        System.out.println("Introduceti datele pentru matrice:");
                        
                        System.out.println("\tIntroduceti numarul de coloane:");
                        c=scan.nextInt();
                        System.out.println("\tIntroduceti numarul de linii:");
                        l=scan.nextInt();
                        double[][] m=new double[l][c];
                        
                        for(i=0;i<m.length;i++)
                        for(j=0;j<m.length;j++)
                        
                                {System.out.println("m["+(i+1)+"]["+(j+1)+"]=");
                        m[i][j]=scan.nextDouble();
                        }
                        
                        int in1, in2;
                System.out.println("Introduceti 2 indexuri:");
                in1=scan.nextInt();
                in2=scan.nextInt();
                
                        
                for( i=0;i<l;i++)
                        for(j=0;i<c;j++)
                {
                        boolean ok=true;
                        try { obj.metodaPericuloasa(in1,l);
                        obj.metodaPericuloasa(in2, c);
                                
                        }
                        catch(ArrayIndexOutOfBoundsException e){
                                ok=false;
                                System.out.println("Metoda periculoasa");
                                
                        }
                        if(ok) System.out.println("Indexul introdus e corect.");
                }
                
        }
        
        
        public void metodaPericuloasa(int x,int m) throws ArrayIndexOutOfBoundsException{

                if(x<0 || x>m)
                        System.out.println("Indexul nu este potrivit!");
                //break;
                
        }
        
}















//_____________________________________________________________________________

/*Danciu Camelia, gr 2123, lab 6, pb2
 * 2. Scrieți o aplicație Java care, în cadrul metodei main( ), conține o secvență de cod care poate să lanseze excepții
 *  de tip ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException, NumberFormatException și altele pe 
 *  care considerați că e util să le testați. Afișați în cadrul blocurilor catch mesajul generat de aceste excepții. 
 *  În blocul finally, afișați mesajul ”Am prins sau nu excepții”.*/

 package l6;
import java.util.Scanner;

public class Test {
        static Scanner scan=new Scanner(System.in);
        public void media(int n, Scanner scan) throws ArithmeticException,ArrayIndexOutOfBoundsException,NumberFormatException{

                int values[] = new int[3];
                int s = 0;
                for(int i=0; i<n; i++){
                        values[i] = Integer.parseInt(scan.nextLine());
                }

                for(int i=0; i<n; i++){
                        s += values[i];
                }

                System.out.println("Media este: "+s/n);
        }
        
        

        public static void main(String[] args)
        {
                Test obj=new Test();
                int n;
                System.out.println("Cate valori adunam? ");
                n = Integer.parseInt(scan.nextLine());
                
                try {
                        obj.media(n,scan);
                        
                } 
                catch(ArithmeticException e) {
                        System.out.println("Eroare calcul");
                }
                catch (NumberFormatException e) {
                        System.out.println("Valoare introdusa in format incorect");
                }
                catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Prea multe valori");
                } 
                finally {
                        System.out.println("Rulare Finally.");
                }
        }
                
        }


















//____________________________________________________________________________


/*Danciu Camelia, gr 2123, lab 6, pb3
 3. Definiți un pachet care declară interfața Int1 (2 variabile întregi și o metodă numita sum( ) care returnează suma a doi întregi).
 În pachet mai există clasa Class1 (2 variabile protected de tip double, constructor, metode accesor și mutator pentru variabilele
  din clasă). În alt fișier sursă se adaugă în același pachet o nouă interfață numită Int2 (2 variabile de tip double și o metodă 
  numită product( ) care returnează produsul a două valori de tip double).
Într-un fișier sursă distinct, importați tot ce conține pachetul definit anterior și definiți o clasă numită Class2 care
 este derivată din Class1 și care implementează ambele interfețe Int1 și Int2. Instanțiați Class2 și aplicați metodele
  disponibile pentru a calcula suma și produsul unor variabile citite de la tastatură.*/

 package l6;
import java.util.Scanner;

public class Test {
        static int x,y;
   static double a,b;
static Scanner scan=new Scanner(System.in);
        public static void main(String[] args)
        {
                
Test obj=new Test();
Class1 ob1=new Class1();
Class2 ob=new Class2();

System.out.println("Introduceti cele 2 valori intregi:");
System.out.println("x="); x=scan.nextInt();
System.out.println("y="); y=scan.nextInt();
System.out.println("Introduceti cele 2 valori double:");
System.out.println("a="); a=scan.nextDouble();
System.out.println("b="); b=scan.nextDouble();
ob1.setA(a);
ob1.setB(b);
System.out.println("Suma numerelor intregi este:"+ob.sum(x, y));
System.out.println("Produsul numerelor double este:"+ob.product(a,b));


        }
}



//Int1.java:

package l6;

public interface Int1 {
int a=0,b=0;

public int sum(int a, int b );

}



//Int2.java:

package l6;

public interface Int2 {
double  x=0,y=0;
public double product(double x, double y);
}



//Class1.java:

package l6;

public class Class1 {

protected double a, b;

Class1()
{
        System.out.println("Constructor");
}


public void setA(double x)
{
        this.a=x;
}
public double getA()
{
        return a;
}
public void setB(double y)
{
        this.a=y;
}
public double getB()
{
        return b;
}


}



//Class2.java:

package l6;

 public class Class2 extends Class1{
        
                int a=0,b=0;
                double  x=0,y=0;
                public int sum(int a, int b )
                {
                        return a+b;
                }

                public double product(double x, double y)
                {
                        return x*y;
                        }
        

}













//_____________________________________________________________________________


/*Danciu Camelia, gr 2123, lab 6, pb 4
 * 4. Creați o clasă derivată din Exception, numită SuperExceptie. O a doua clasă ExceptieMaiMica este derivată din SuperExceptie.
 *  În constructorii claselor afisați un mesaj ce indică excepția generată. În cadrul unei alte clase creați o metodă a( )
 *  ce semnalizeaza (aruncă) o excepție de tip ExceptieMaiMica și o metodă b( ) ce semnalizeaza o excepție de tip SuperExceptie.
În cadrul metodei main( ) apelați aceste metode și încercați să determinați tipul de excepție semnalizată, precum și dacă blocul 
catch aferent tipului de exceptie ExceptieMaiMica poate prinde o SuperExcepție.*/
package tema;
import java.lang.Throwable;
@SuppressWarnings("serial")
public class Exception extends Throwable{
        static Exception obj= new Exception();
        public void a() throws ExceptieMaiMica 
         {
                 System.out.println("arunca ExceptieMaiMica");
         }
         
         public void b() throws SuperExceptie{
                
                 System.out.println("arunca SuperExceptie");
         }
        
        public static void main(String[] args) throws Throwable
        {
        
                System.out.println("Inceput program");
                try {
                        obj.a();
                }
         catch(ExceptieMaiMica e) {
                         System.out.println("arunca ExceptieMaiMica");
                                                throw e;
                }
        
                 try {
                                obj.b();
                        }catch(SuperExceptie e) {
                                 System.out.println("arunca SuperExceptie");
                                                        throw e;
                        }
        
        }
        
}





//ExceptieMaiMica.java:

package tema;

//import java.lang.Throwable;
@SuppressWarnings("serial")
public class ExceptieMaiMica extends SuperExceptie {

        ExceptieMaiMica()
        {
                System.out.println("Constructor ExceptieMaiMica");
                
        }
}




//SuperExceptie.java:

package tema;
//import java.lang.Throwable;
@SuppressWarnings("serial")
public class SuperExceptie extends Exception{

        SuperExceptie()
        {
                System.out.println("Constructor SuperExceptie");
                
        }
}













//_________________________________________________________________________________



/*Danciu Camelia, gr 2123, lab 6, pb 5
 * 5. Scrieți o aplicație ce verifică dacă 3 puncte aleatoare formează un triunghi obtuzunghic.
 *  Dacă nu este îndeplinită condiția, se aruncă o excepție specifică: TriunghiAscutitunghic, TriunghiDreptunghic.
 *   Dacă cele 3 puncte se află pe aceeași dreaptă sau dacă segmentele pe care le determină nu pot forma un triunghi, 
 *   se aruncă o excepție TriunghiImposibil, iar în blocul catch aferent, se afișează un mesaj corespunzător și se aruncă
 *    o excepție de tip RuntimeException.*/
package tem;
import java.util.Scanner;
public class Test {
        
        public static void drept(double l1, double l2, double l3) throws TriunghiDreptunghic {
        if(l1>l2 && l1>l3)
        {
                if(l2*l2+l3*l3==l1*l1) System.out.println("Triunghi dreptunghic");
        }
        else if(l2>l1 && l2>l3)
        {
                if(l1*l1+l3*l3==l2*l2) System.out.println("Triunghi dreptunghic");
        }
        else if(l3>l1 && l3>l2)
        {
                if(l1*l1+l2*l2==l3*l3) System.out.println("Triunghi dreptunghic");
        }
        }
        
        public static void obt(double l1, double l2, double l3) throws TriunghiObtuzunghic
        {
        if(l1>l2 && l1>l3)
        {
                if(l2*l2+l3*l3<l1*l1) System.out.println("Triunghi obtuzunghic");
        }
        else if(l2>l1 && l2>l3)
        {
                if(l1*l1+l3*l3<l2*l2) System.out.println("Triunghi obtuzunghic");
        }
        else if(l3>l1 && l3>l2)
        {
                if(l1*l1+l2*l2<l3*l3) System.out.println("Triunghi obtuzunghic");
        }
        }
        
        public static void asc(double l1, double l2, double l3) throws TriunghiAscutitunghic
        {
        if(l1>l2 && l1>l3)
        {
                if(l2*l2+l3*l3>l1*l1) System.out.println("Triunghi ascutitunghic");
        }
        else if(l2>l1 && l2>l3)
        {
                if(l1*l1+l3*l3>l2*l2) System.out.println("Triunghi ascutitunghic");
        }
        else if(l3>l1 && l3>l2)
        {
                if(l1*l1+l2*l2>l3*l3) System.out.println("Triunghi ascutitunghic");
        }
        }
        
        static int x1,x2,x3;
        static int y1,y2,y3;
        static Scanner scan=new Scanner(System.in);
        Test(int a, int b)
        {
                System.out.println("Constructor cu parametrii");
        }
        public Test() {
                // TODO Auto-generated constructor stub
        }
        public static void main(String[] args)
        {
                
                System.out.println("Introduceti coordonatele celor 3 puncte:");
                
                System.out.println("\tIntroduceti abscisa primului punct:");
                x1=scan.nextInt();
                System.out.println("\tIntroduceti ordonata primului punct:");
                y1=scan.nextInt();
                //Test pct1=new Test(x1,y1);
                
                System.out.println("\tIntroduceti abscisa celui de-al doilea punct:");
                x2=scan.nextInt();
                System.out.println("\tIntroduceti ordonata celui de-al doilea punct:");
                y2=scan.nextInt();
                //Test pct2=new Test(x2,y2);
                
                System.out.println("\tIntroduceti abscisa celui de-al treilea punct:");
                x3=scan.nextInt();
                System.out.println("\tIntroduceti ordonata celui de-al treilea punct:");
                y3=scan.nextInt();
                //Test pct3=new Test(x3,y3);
                Test obj=new Test();
                
                double l1,l2,l3;
                l1=Math.sqrt((x2*x2-x1*x1)-(y2*y2-y1*y1));
                l2=Math.sqrt((x3*x3-x1*x1)-(y3*y3-y1*y1));
                l3=Math.sqrt((x2*x2-x3*x3)-(y2*y2-y3*y3));
                
                try {
                        obt(l1,l2,l3);
                }
                catch(TriunghiObtuzunghic e) {
                        System.out.println("Triunghiul este obtuzunghic");
                }
                finally {
                        System.out.println("Finally va fi rulat oricum.");
                }
                try {
                        asc(l1,l2,l3);
                }
                catch(TriunghiAscutitunghic e) {
                        System.out.println("Triunghiul este obtuzunghic");
                }
                finally {
                        System.out.println("Finally va fi rulat oricum.");
                }
                        
                try {
                        drept(l1,l2,l3);
                }
                catch(TriunghiDreptunghic e) {
                        System.out.println("Triunghiul este obtuzunghic");
                }
                finally {
                        System.out.println("Finally va fi rulat oricum.");
                }
        }
        
}






//TriunghiDreptunghic.java

package tem;
//java.lang.Throwable;
public class TriunghiDreptunghic extends Throwable {

        public void drept(double l1, double l2, double l3) 
        {System.out.println("triunghi dreptunghic");
        }
}




//TriunghiObtuzunghic.java

package tem;
//java.lang.Throwable;
public class TriunghiObtuzunghic extends Throwable {
        public void obt(double l1, double l2, double l3)
        {
                System.out.println("Triunghi obtuzunghic");
        }

}


//TriunghiAscutitunghic.java

package tem;

public class TriunghiAscutitunghic extends Throwable {

        public void asc(double l1, double l2, double l3)
        {
         System.out.println("Triunghi ascutitunghic");
        }
        
}
