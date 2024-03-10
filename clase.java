/*Danciu Camelia-Maria, grupa 2123, lab4, pb 2
 * 2. Definiți o clasă X care va avea ca atribute un șir de caractere privat, un obiect de tip String cu specificatorul protected și un întreg fără specificator 
 * de acces. Clasa va conține un constructor explicit cu parametri, care va inițializa atributele, metode accesor și mutator pentru câmpurile care nu pot fi 
 * accesate din afara clasei și va redefini metoda finalize() moștenită din clasa Object, care va afișa un mesaj corespunzător.
În metoda main(), plasată în altă clasă, creați un obiect din clasa X, afișați valorile atributelor, apoi pregătiți obiectul pentru a fi eliminat de garbage
 collector. Creați apoi un nou obiect X, modificați valorile atributelor și afișați pe ecran valorile acestora.*/

//Y.java:
package laborator4;

public class Y {
public static void main(String[] args) {
        
        X obj= new X(null,null, 0);

        
        
        System.out.println("\nPrimul obiect creat are urmatoarele date:");
        System.out.println("\tNumarul intreg introdus:"+obj.getInt());
        System.out.println("\tPrimul sir introdus:"+obj.getS());
        System.out.println("\tCel de-al doilea sir introdus:"+obj.getSir());
        
        System.gc();
        
        X obj1= new X(null,null,0);
        obj1.setInt(2);
        obj1.setS("Laborator IS");
        obj1.setSir("Semestrul II");
        System.out.println("\nAl doilea obiect creat are urmatoarele date:");
        System.out.println("\tNumarul intreg introdus:"+obj1.getInt());
        System.out.println("\tPrimul sir introdus:"+obj1.getS());
        System.out.println("\tCel de-al doilea sir introdus:"+obj1.getSir());
}
}


//X.java:

/*2. Definiți o clasă X care va avea ca atribute un șir de caractere privat, un obiect de tip String cu specificatorul protected și un întreg fără specificator de acces.
 *  Clasa va conține un constructor explicit cu parametri, care va inițializa atributele, metode accesor și mutator pentru câmpurile care nu pot fi accesate 
 *  din afara clasei și va redefini metoda finalize() moștenită din clasa Object, care va afișa un mesaj corespunzător.
În metoda main(), plasată în altă clasă, creați un obiect din clasa X, afișați valorile atributelor, apoi pregătiți obiectul pentru a fi eliminat de garbage collector.
 Creați apoi un nou obiect X, modificați valorile atributelor și afișați pe ecran valorile acestora.*/
package laborator4;
import java.util.Scanner;
public class X {
private String s="Grupa 2123";
protected String sir=new String("Laborator 4");
int nr=8;


X(String s,String sir, int nr)
{
        System.out.println("Constructor");
        } 
        

public void setS(String s) {
        this.s=s;
}
public String getS() {
        return s;
}

public void setSir(String sir) {
        this.sir=sir;
}
public String getSir() {
        return sir;
}

public void setInt(int nr) {
        this.nr=nr;
}
public int getInt() {
        return nr;
}

public class Object {
        public void finalize()
        {
                System.out.println("Pseudo-destructor");
        }
}


}
