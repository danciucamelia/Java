/*Danciu Camelia, gr 2123, lab 4, pb 3
 * 3. Scrieți o clasă Java care modelează o matrice de valori întregi. Atât dimensiunile matricii cât și tabloul bidimensional de elemente
 *  sunt atribute private în clasă, accesate prin intermediul unor metode publice setter și getter. Includeți în clasă metode de afișare 
 *  a matricii, de calcul și retur a numărului de grupuri de elemente (9 valori învecinate), care nu diferă cu mai mult de 5% față de un anumit prag.*/
package pb3;

import java.util.Scanner;

public class Matrice {
        private static int m;
        private static int n;
        private static int[][] matrice = new int[100][100];
        //int prag=5;
        int i,j;
        static Scanner scan = new Scanner(System.in);

public static void main(String[] args) {
        Matrice obj=new Matrice();

        System.out.println("introduceti numarul de linii:");
        n=scan.nextInt();
        System.out.println("introduceti numarul de coloane:");
        m=scan.nextInt();
        
        obj.setM(m);
        obj.setN(n);
        obj.setMatrice(m, n);
        obj.getMatrice();
        }

        @SuppressWarnings("static-access")
        public void setN(int n) {
                this.n=n;

        }

        public int getN() {
                return n;
        }

        @SuppressWarnings("static-access")
        public void setM(int m) {
                this.m = m;
        }

        public int getM() {
                return m;
        }

        @SuppressWarnings("static-access")
        public void setMatrice(int m, int n) {
                for ( i = 0; i < n; i++) {
                        for ( j = 0; j < m; j++)
//System.out.println("M["+i+"]"+"["+j+"]=");
                                matrice[i][j] = scan.nextInt();

                }
        }

        public void getMatrice() {
                int i, j;
                System.out.println("Matricea este:");
                for (i = 0; i < n; i++) {
                        for (j = 0; j < m; j++)
                                System.out.print( matrice[i][j]+" ");
System.out.println();
                }

        }
        
}





