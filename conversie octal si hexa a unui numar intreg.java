/*4. Scrieti o aplicatie Java care defineste o valoare intreaga si apoi afiseaza reprezentarea ei binară, 
 * octală și hexazecimală. Scrieți metode de conversie a valorii citite în diferite baze de numeratie.
*/
package tema1;

public class Methods {
        void binar(int n){
                

 System.out.println(Integer.toBinaryString(n)); 
}
        void octal(int n)
        {
                System.out.println(Integer.toOctalString(n));
        }
        void hexa(int n) {
                System.out.println(Integer.toHexString(n));
        }
}
