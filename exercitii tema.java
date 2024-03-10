
/*Danciu Camelia-Maria, grupa 2123,lab 5,pb 1'
1’. În loc de o interfață care conține toate metodele menționate anterior, să se implementeze 4 interfețe funcționale, câte una pentru fiecare metodă.
Interfețele vor fi implementate în cadrul unei singure clase. Instanțiați clasa și verificați operațiile implementate.*/
package lab5;

import java.util.Scanner;
class test {
    public static void main(String... args) {
            Scanner scan=new Scanner(System.in);
            double a,b;
            System.out.println("introduceti a:");
            a=scan.nextDouble();
            System.out.println("introduceti b:");
            b=scan.nextDouble();
            

            interfata ob1 = new interfata();
            System.out.println("Adunarea parametrilor da rezultatul:" + ob1.adunare(a,b));
            System.out.println("Scaderea parametrilor da rezultatul:" + ob1.scadere(a,b));
            System.out.println("Inmultirea parametrilor da rezultatul:" + ob1.inmultire(a,b));
            System.out.println("Impartirea parametrilor da rezultatul:" + ob1.impartire(a,b));
            ob1.radical(a,b);
            ob1.putere(a,b);

    }
}


package lab5;

import java.util.Scanner;

interface Interfata1 {

        public double adunare(double a, double b); 
}

interface Interfata2 {

    public double scadere(double a, double b);
}

interface Interfata3 {

    public double inmultire(double a, double b);
}

interface Interfata4 {
        
    public double impartire(double a, double b);
}

interface Interfata5 {

    public double radical(double a, double b);

}

interface Interfata6 {

    public double putere(double a, double b);

}

public class interfata implements Interfata1,Interfata2,Interfata3,Interfata4,Interfata5,Interfata6 {

        public double adunare(double a, double b) {

                return a + b;
        }

        public double scadere(double a, double b) {

                return a - b;
        }

        public double inmultire(double a, double b) {

                return a * b;

        }

        public double impartire(double a, double b) {

                return a / b;
        }

        public double radical(double a, double b) {
                System.out.println("Radical din a este:" + Math.sqrt(a) + "iar din b este:" + Math.sqrt(b));
                return 0;
        }

        public double putere(double a, double b) {
                double s = 1;
                for (int i = 1; i < b; i++)
                        s = a * a;
                System.out.println("Numarul a ridicat la puterea b este:" + s);
                return 0;
        }



}













//_________________________________________________________________________________________________


/*Danciu Camelia-Maria, grupa 2123, lab 5, pb 2
 * 2. Definiți o interfață denumită FormaGeometrica care are 2 metode care primesc ca parametru o valoare integer și returnează o valoare 
 * double reprezentînd aria, respectiv perimetrul unei forme geometrice echilaterale.
Implementați interfața în 3 clase distincte pentru forme concrete de tip pătrat, triunghi echilateral și hexagon regulat.
Se preiau datele pentru un număr N de forme geometrice de fiecare tip.
Să se calculeze aria și perimetrul total al formelor geometrice, ținând cont că acestea nu se suprapun.*/
package temaa;
import java.util.Scanner;
public class pb3 {
        static Scanner scan=new Scanner(System.in);
        public static void main(String[] args)
        {
                Patrat patrat=new Patrat();
                Triunghi triunghi=new Triunghi();
                Hexagon hexagon=new Hexagon();
                
                int N;
                System.out.println("Introduceti numarul de forme geometrice de fiecare tip:");
                N=scan.nextInt();
                int[] l=new int[N];
                System.out.println("Introduceti valorile laturilor pentru cele N cazuri:");
                for(int i=0;i<N;i++)
                {
                        l[i]=scan.nextInt();
                }
                for(int i=0;i<N;i++)
                {
                        System.out.println("Aria triunghiului cu latura"+l[i]+"este:"+triunghi.aria(l[i]));
                        System.out.println("Aria patratului cu latura"+l[i]+"este:"+patrat.aria(l[i]));
                        System.out.println("Aria hexagonului cu latura"+l[i]+"este:"+hexagon.aria(l[i]));
                        System.out.println();
                        System.out.println("\tPerimetrul triunghiului cu latura"+l[i]+"este:"+triunghi.perimetru(l[i]));
                        System.out.println("\tPerimetrul patratului cu latura"+l[i]+"este:"+patrat.perimetru(l[i]));
                        System.out.println("\tPerimetrul hexagonului cu latura"+l[i]+"este:"+hexagon.perimetru(l[i]));
                        System.out.println();
                }
                
        }
}






//FormaGeometrica.java


package temaa;

interface FormaGeometrica {
public double perimetru(int n);
public double aria(int n);

}



//Patrat.java

package temaa;

public class Patrat implements FormaGeometrica {
        
                public double perimetru(int n) {
                        return 4*n;
        }
                
                public double aria(int n) {
                        return n*n;
                }
}



//Triunghi.java

package temaa;

public class Triunghi implements FormaGeometrica {
        
        public double perimetru(int n) {
                return 3*n;
}
        
        public double aria(int n) {
                double h;
                h=Math.sqrt(n*n-(n/2)*(n/2));
                return (h*n)/2;
        }
}


//Hexagon.java

package temaa;

public class Hexagon implements FormaGeometrica {

        public double perimetru(int n) {
                return 6*n;
}
        
        public double aria(int n) {
                double h;
                h=Math.sqrt(n*n-(n/2)*(n/2));
                return 3*(h*n);
        }
}






















//____________________________________________________________________________________________
//FiguraSpatiala.java

package figurine;

/*Danciu Camelia-Maria, grupa 2123, lab 5, pb 3
 * A. Scrieți clasa abstractă FiguraSpatiala, stocată în fișierul FiguraSpatiala.java, cu următoarele componente:
- o variabilă denumire de tip String
- o metodă abstractă aria()
- o metodă toString() care returnează numele formei geometrice*/
 
abstract class FiguraSpatiala {
String denumire;
 abstract double aria();
public String toString()
{
        return denumire;
};

}


//Cilindru.java

package figurine;
import java.util.Scanner;

/*C. Analog se implementează clasele Cub si Cilindru, derivate de asemenea din clasa de bază FiguraSpatiala.
 *  Un cub este definit de variabila proprie latura în timp ce un cilindru are drept atribute raza_bazei și inaltimea.*/
class Cilindru extends FiguraSpatiala {
        Scanner scan=new Scanner(System.in);
double raza_bazei,pi=3.14;
int h;

double aria(){
         double pi=3.14;
                return pi*raza_bazei*raza_bazei*h;
        }

@Override
public String toString()
{
        return "cilindru";
};
public void setRaza_bazei(double raza_bazei)
{
        System.out.println("Introcuceti valoarea razei:");
        raza_bazei=scan.nextDouble();
}
public double getRaza_bazei(double raza_bazei)
{
        return raza_bazei;
}

}


//Cub.java

package figurine;

/*C. Analog se implementează clasele Cub si Cilindru, derivate de asemenea din clasa de bază FiguraSpatiala.
 *  Un cub este definit de variabila proprie latura în timp ce un cilindru are drept atribute raza_bazei și inaltimea.*/
import java.util.Scanner;
class Cub extends FiguraSpatiala {
        Scanner scan=new Scanner(System.in);
        
 int latura;
        double aria() {
                return latura*latura*latura;
        
        }
        @Override
        public String toString()
        {
                return "cub";
        };
        public void setLatura(int latura)
        {
                System.out.println("Introcuceti valoarea laturii:");
                latura=scan.nextInt();
        }
        public int getLatura(int latura)
        {
                return latura;
        }

}


//Vopsea.java

package figurine;
/*D. Fișierul Vopsea.java conține o interfață al carei unic membru este o constantă de tip float numită vopseaPeUnitateaDeSuprafata.*/
interface Vopsea {
float vopseaPeUnitateDeSuprafata=1;

}


//Sfera.java

package figurine;

/*B. Fișierul Sfera.java conține clasa Sfera derivată din FiguraSpatiala.
 *  O sferă are raza drept atribut privat întreg și implementează corpul metodei abstracte mostenite aria().*/
import java.util.Scanner;
class Sfera extends FiguraSpatiala{
        Scanner scan=new Scanner(System.in);
        private int raza;

 String denumire;
 double aria(){
         double pi=3.14;
                return 4*pi*raza*raza;
                
        }
 @Override
public String toString()
{
        return "sfera";
};
        
public void setRaza(int raza)
{
        System.out.println("Introcuceti valoarea razei:");
        raza=scan.nextInt();
}
public int getRaza(int raza)
{
        return raza;
}
}


//Vopsitorie.java

package figurine;

/*E. Fișierul Vopsitorie.java implementează interfața Vopsea și conține un program care calculează cantitatea
 *  de vopsea necesară acoperirii diferitelor  forme create.*/
public class Vopsitorie implements Vopsea {
        Sfera sfera=new Sfera();
        Cub cub=new Cub();
    Cilindru cilindru=new Cilindru();
        public void v() {
                
System.out.println("Vopseaua necesara vopsirii sferei este:"+vopseaPeUnitateDeSuprafata*sfera.aria());
System.out.println("Vopseaua necesara vopsirii cubului este:"+vopseaPeUnitateDeSuprafata*cub.aria());
System.out.println("Vopseaua necesara vopsirii cilindrului este:"+cilindru.aria()*vopseaPeUnitateDeSuprafata);
        }
}




















//__________________________________________________________________________________________________


/*Danciu Camelia-Maria, grupa 2123, lab 5, pb 4
 
 * 4. Considerați clasa Fractie care are 2 atribute integer și protected a si b pentru numărător și numitor și câte o metodă accesor
 *  și mutator pentru fiecare din atributele clasei. Definiți un constructor explicit fără parametri care inițializează
 *   a cu 0 si b cu 1, și un constructor explicit cu 2 parametri.*/

/*Implementați o metodă numită simplifica() care simplifică fracția curentă și modifică valorile numărătorului și
 *  numitorului stocate în clasă. Simplificarea se bazează pe metoda int cmmdc(int,int) care determină și returnează
 *   cel mai mare divizor comun al valorilor primite ca parametri folosind algoritmul de împărțiri succesive.*/

/*Suprascrieți metoda toString() pentru a returna ca String reprezentarea fracției (“a/b”).*/
/*În metoda main() instanțiați N obiecte de tip Fractie fără parametri.
 *  Setați atributele obiectelor cu date citite de la tastatură. Afișați atributele obiectelor.
 *   Simplificați fracțiile și afișați rezultatele.*/
package laboratorr;
import java.util.Scanner;
public class Fractie {
protected static int a;
protected static int b;
static Scanner scan=new Scanner(System.in);
Fractie()
{
        a=0;
        b=1;
        System.out.println("Constructor fara parametri");
}

Fractie(int a, int b)
{
        System.out.println("Constructor cu parametri");
        
}


public String toString(int a,int b)
{
        return a+"/"+b;
}

public void setA(int a)
{
        System.out.println("a=");
        a=scan.nextInt();
}

public int getA()
{
        return a;
}

public void setB(int b)
{
        System.out.println("b=");
        b=scan.nextInt();
}

public int getB()
{
        return b;
}

public int cmmdc(int a, int b)
{    int c;
        while(a != b) {
        if(a > b) a = a - b;
        else b = b - a;
    }
        c=a;
        return c;
}

public void simplifica()
{
        a=a/cmmdc(a,b);
        b=b/cmmdc(a,b);
}

public static void main(String[] args)
{
        int N,s;
        System.out.println("Introduceti numarul de obiecte:");
        N=scan.nextInt();
        Fractie obj[]= new Fractie[N];
        
        for(int i=0; i<N; i++)
        {
                System.out.println("Introduceti datele pentru fractia cu numarul "+(i+1));
                s=scan.nextInt();
                obj[i].setA(s);
                s=scan.nextInt();
                obj[i].setB(s);
        }
        for(int i=0;i<N;i++)
        {
                System.out.println("Fractia cu numarul"+i+"are rezultatul:"+"toString(a,b)");
                obj[i].simplifica();
                System.out.println("Fractia simplificata cu numarul"+i+"are rezultatul:"+"toString(a,b)");
        }
        
}

}




//_________________________________________________________________________
/*Definiți clasa FractieExtinsa, derivată din Fractie, care va avea un constructor cu parametri
 *  (care apelează constructorul din clasa de bază). Clasa va suprascrie metoda int cmmdc(int,int)
 *   și va calcula rezultatul pe baza unui algoritm de scăderi succesive. Clasa conține o metodă care 
 *   returnează true/false dacă fracția este supraunitară sau nu.*/
package laboratorr;

class FractieExtinsa extends Fractie {
FractieExtinsa(int a,int b)
{
        System.out.println("Constructor fara parametri");
        
}
@Override
public int cmmdc(int a, int b)
{    int c;
        while(a != b) {
        if(a > b) a = a - b;
        else b = b - a;
    }
        c=a;
        return c;
}

boolean  met() {
        if(a/b>1) return true;
        else return false;
}
}




