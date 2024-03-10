//Danciu Camelia-Maria, gr 2123, lab 3, pb 5
/*5. Implementati algoritmii cunoscuti de ordonare a sirurilor numerice (bubble sort, insertion sort, quick sort, etc.) 
 * si aplicati-i asupra unui sir de valori intregi citite de la tastatura.*/

//pb1.java:

package tema1;
import java.util.Scanner; 
//import java.util.Arrays; 
public class pb1 {
        public static void main(String[] args) {
                Methods obj=new Methods();
                @SuppressWarnings("resource")
                Scanner scan=new Scanner(System.in);
        int nr;
        
        System.out.println("Introduceti numarul de valori:");
        nr=scan.nextInt();
        
        int n[]=new int[nr];
        for(int i=0;i<nr;i++)
        {
                System.out.println("n["+i+"]:");
                n[i]=scan.nextInt();
        }
        for(int i=0;i<nr;i++)
                System.out.print(n[i]);
        System.out.print("\nSortarea utilizand bubblesort este:");
        obj.bubblesort(n, nr);
        
        for(int i=0;i<nr;i++)
        System.out.print(n[i]);
                
        System.out.print("\nSortarea utilizand metoda insertiei este:");
        obj.insertion(n, nr);
        for(int i=0;i<nr;i++)
                System.out.print(n[i]);
                
        }

}

//Methods.java:


package tema1;

public class Methods {
        void bubblesort(int n[],int nr) {
                int s=0;
                for(int i=0;i<nr;i++)
                {for (int j=i;j<nr;j++)
                        if(n[i]>n[j]) {s=n[i];n[i]=n[j]; n[j]=s;}
                }
        }
        
        void insertion(int n[],int nr){
                int k=0;
                for(int i=0;i<nr;i++)
                {
                        //if(n[i]>n[i+1]) swap(n[i],n[i+1]); //{k=n[i]; n[i]=n[i+1]; n[i+1]=k;}
                        while(n[i]>n[i+1])
                        {
                                k=n[i]; n[i]=n[i+1]; n[i+1]=k;
                        }
                }
                }
        
}

