
/*Danciu Camelia, gr 2123, lab. 8, pb. 3
3. Se citesc de la tastatură date formatate sub forma DD/MM/YYYY.
 Să se afișeze sub forma DD luna YYYY, unde luna este forma expandată a MM și de asemenea să se afișeze și dacă anul este bisect.
 Programul se oprește prin apăsarea tastei X sau x.
 Puteti folosi si clasa DateFormatSymbols pentru conversia lunii.*/


package llab8;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        @SuppressWarnings("resource")
                Scanner scan = new Scanner(System.in);
        String x = "";

        while (!input.equalsIgnoreCase("x")) {
            System.out.print("Introduceti o data (DD/MM/YYYY) sau X pentru a opri programul: ");
            x = scan.nextLine();

            if (x.equalsIgnoreCase("x")) {
                break;
            }

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date data = format.parse(x);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(data);

            int zi = calendar.get(Calendar.DAY_OF_MONTH);
            int luna = calendar.get(Calendar.MONTH) + 1;
            int an = calendar.get(Calendar.YEAR);

            String numeLuna = new DateFormatSymbols().getMonths()[luna - 1];

            System.out.println(zi + " " + numeLuna + " " + an);

            if (AnBisect(an)) {
                System.out.println(an + " este an bisect.");
            } else {
                System.out.println(an + " nu este an bisect.");
            }
        }
    }

    private static boolean AnBisect(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }
}














//_______________________________________________________________________


/*Danciu Camelia, gr 2123, lab. 8, pb. 3
3. Se citesc de la tastatură date formatate sub forma DD/MM/YYYY.
 Să se afișeze sub forma DD luna YYYY, unde luna este forma expandată a MM și de asemenea să se afișeze și dacă anul este bisect.
 Programul se oprește prin apăsarea tastei X sau x.
 Puteti folosi si clasa DateFormatSymbols pentru conversia lunii.*/


package llab8;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        @SuppressWarnings("resource")
                Scanner scan = new Scanner(System.in);
        String x = "";

        while (!input.equalsIgnoreCase("x")) {
            System.out.print("Introduceti o data (DD/MM/YYYY) sau X pentru a opri programul: ");
            x = scan.nextLine();

            if (x.equalsIgnoreCase("x")) {
                break;
            }

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date data = format.parse(x);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(data);

            int zi = calendar.get(Calendar.DAY_OF_MONTH);
            int luna = calendar.get(Calendar.MONTH) + 1;
            int an = calendar.get(Calendar.YEAR);

            String numeLuna = new DateFormatSymbols().getMonths()[luna - 1];

            System.out.println(zi + " " + numeLuna + " " + an);

            if (AnBisect(an)) {
                System.out.println(an + " este an bisect.");
            } else {
                System.out.println(an + " nu este an bisect.");
            }
        }
    }

    private static boolean AnBisect(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }
}












//______________________________________________________________________________







/*Danciu Camelia, gr 2123, lab8, pb 5
5. Scrieți o aplicație Java ce citește un set de fișiere text ce conțin informațiile studenților din anul curent. 
 * Fișierele sunt stocate pe sistemul local cu denumirea An_y_Grupa_xxxx.txt .
 *  Să se agregheze informația din aceste fișiere folosind SequenceInputStream și să se genereze un nou fișier 
 *  ce conține toți studenții din anul curent ordonați alfabetic.*/
package llab8;
import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        try {
            String directoryPath = "C:\\Users\\danci\\OneDrive\\Desktop\\lab3\\New Folder"; 
     
            String fiesire = "iesire.txt"; 

       
            List<FileInputStream> fintrare = new ArrayList<>();

            
            File[] files = new File(directoryPath).listFiles((dir, name) -> name.startsWith( "An_2_Grupa_"));

          
            for (File file : files) {
                fintrare.add(new FileInputStream(file));
            }

            
            SequenceInputStream fin2 = new SequenceInputStream(Collections.enumeration(fintrare));

           
            Scanner scan = new Scanner(fin2);

          
            TreeSet<String> studenti = new TreeSet<>();
            
            
            while (scan.hasNextLine()) {
                studenti.add(scan.nextLine());
            }

            
            PrintWriter scrie = new PrintWriter(fiesire);
            for (String student : studenti) {
                scrie.println(student);
            }
            scrie.close();

            System.out.println("Datele au fost ordonate si scrise in fisierul de iesire!");
            
        } catch (IOException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }

}







//______________________________________________________________________________










/*Danciu Camelia, gr 2123, lab 8, pb 7
 * 7. Să se scrie o aplicație Java care permite serializarea și deserializarea obiectelor care reprezintă un șir de valori int .
 *  Se populează un obiect cu date introduse de tastatură, se ordonează valorile și se scrie obiectul într-un fișier.
 *   Să se citească fișierul și să se afișeze valorile din obiectul reconstruit.*/
package pb7;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;  
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class Test {
public static void main(String[] args)
{
        Scanner scan=new Scanner(System.in);
        int n;
        
        System.out.println("Introduceti dimensiunea sirului de valori intregi:");
        n=scan.nextInt();
        int tab[]=new int[n];
        
        System.out.println("Introduceti valorile sirului:");
        
        for(int i=0;i<n;i++)        
        {
                System.out.println("x["+i+1+"]:");
                tab[i]=scan.nextInt();
        }
        
        Obiect obj=new Obiect(tab,n);
        
        
        try {  
              FileOutputStream fos = new FileOutputStream("text.txt");  
              ObjectOutputStream oos = new ObjectOutputStream(fos);  
              oos.writeObject(obj);  
              oos.close();  
              fos.close();  
              System.out.println("Obiectul a fost salvat!");  
            } catch (IOException e) {  
              e.printStackTrace();  
            }  
        System.out.println("S-a realizat serializarea obiectlui");
        
        System.out.println("Apasa ENTER pt. deserializare");
        try{System.in.read ();}catch(IOException e){}
        
        try {  
               FileInputStream fintrare = new FileInputStream("text.txt");  
               ObjectInputStream objss = new ObjectInputStream(fintrare);  
               obj = (Obiect) objss.readObject();  
               fintrare.close();  
               objss.close();  
             } catch (IOException e) {  
               e.printStackTrace();  
               return;  
             } catch (ClassNotFoundException c){  
               System.out.println("Clasa Obiect nu a fost Gasita!");  
               c.printStackTrace();  
               return;  
             }
        System.out.println("S-a realizat deserializarea");
}
}



//Obiect.java:

package pb7;
import java.io.Serializable;

public class Obiect implements Serializable{

        public int tab[];
        public int dim;
        
        
        
        Obiect(int a[],int b)
        {
                this.tab=a;
                this.dim=b;
        }
}

