
/*Danciu Camelia.gr 2123, lab 7
 * 1. Creați o interfață denumită Generator<T> cu singura metodă next(T var). 
 * Implementați interfața pentru a permite generarea valorilor următoare în cazul aplicării asupra unor variabile de tipuri de date concrete (Integer, Character, etc.).
 *  Instanțierea clasei se va face în cadrul metodei main( ), care va fi poziționată într-o clasă distinctă.*/
package laborator9;
import java.util.Random;
import java.util.Scanner;
public class Test {

static Random random=new Random();
static Scanner scan=new Scanner(System.in);
public class Main {
    public static void main(String[] args) {
            int n;
            System.out.println("introduceti numarul de numere intregi");
            n=scan.nextInt();
        Generator<Integer> intreg = new IntGenerator();
     for(int i=0;i<n;i++)
     {
             intreg.next(random.nextInt());
     }
       
        
        Generator<Character> caracter = new CharGenerator();
        caracter.next('x');
        caracter.next('y');
        caracter.next('z');
        
        Generator<String> string = new StringGenerator();
        string.next("Labo7");
        string.next("Labora7");
        string.next("Laborator7");
    }
}        
}




//Generator.java:

package laborator9;
public interface Generator<T> {
    void next(T var);
}



//IntGenerator.java:

package laborator9;

class IntGenerator implements Generator<Integer> {
    public void next(Integer var) {
        System.out.println(var);
    }
}


//CharGenerator.java:

package laborator9;

class CharGenerator implements Generator<Character> {
    public void next(Character var) {
        System.out.println(var);
    }
}



//StringGenerator.java:

package laborator9;

class StringGenerator implements Generator<String> {
    public void next(String var) {
        System.out.println(var);
    }
}
