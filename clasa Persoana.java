/*Danciu Camelia, gr 2123, lab 4,pb 4
4. Scrieți o clasă Java numită Persoană cu atributele private: nume (String), latitudine și longitudine (float).
 *  Clasa conține un constructor explicit fără parametri care inițializează numele cu null și latitudinea și longitudinea cu 0.
 *   Metoda finalize() va fi implementată pentru a afișa un mesaj la distrugerea obiectelor. Atributele clasei se pot modifica 
 *   prin metodele mutator specifice setNume(), setLatitudine() și setLongitudine(). Atributele vor fi returnate prin metode accesor specifice.
 *    Instanțiați n obiecte, citiți și setati valorile atributelor, apoi afișați datele tuturor obiectelor.*/

package pb4;

import java.util.Scanner;

public class Persoana {
        private static String nume;
        private static float latitudine, longitudine;
        static Scanner scan = new Scanner(System.in);

        Persoana() {
                System.out.println("Constructor");
                nume = null;
                latitudine = 0;
                longitudine = 0;
        }

        public void finalize() {
                System.out.println("Destructor");
                System.gc();
        }

        public void setNume(String nume) {
                System.out.println("Introduceti numele persoanei:");
                nume = scan.next();
        }

        public String getNume() {
                return nume;
        }

        public void setLat(float latitudine) {
                System.out.println("introduceti latitudinea:");
                latitudine = scan.nextFloat();
        }

        public float getLat() {
                return latitudine;
        }

        public void setLong(float longitudine) {
                
                System.out.println("introduceti longitudinea:");
                longitudine = scan.nextFloat();
        }

        public float getLong() {
                return longitudine;
        }

        public static void main(String[] args) {
                int n;
                System.out.println("Introduceti numarul de obiecte:");
                n = scan.nextInt();
                Persoana[] obj = new Persoana[n];

                for (int i = 0; i < n; i++) {
                        System.out.println("Definiti obiectul cu numarul " + (i+1));

                        obj[i].setNume(nume);
                        obj[i].setLat(latitudine);
                        obj[i].setLong(longitudine);
                }

                for (int i = 0; i < n; i++) {
                        System.out.println("Obiectul cu numarul " + i + "este:");
                        System.out.println("\tNume:" + obj[i].getNume());
                        System.out.println("\tLatitudine:" + obj[i].getLat());
                        System.out.println("\tLongitudine:" + obj[i].getLong());

                }
        }
}




