
/*Danciu Camelia, grupa 2123, lab 10, pb 1
 * 1. Scrieți o aplicație de tip Frame în care afișați într-un Panel numele vostru și grupa din care faceți parte.
 *  Textul va fi de culoare albastră și centrat atât pe orizontală, cât și pe verticală, ținând cont de dimensiunea panelului.*/
package llab10;
import javax.swing.*;
import java.awt.*;

public class Test extends JFrame{
        
        public Test() {
                super("Laboratorul 10");
                setSize(500,450);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLocationRelativeTo(null);
                JPanel panel= new JPanel()
                                {
                        public void paintComponent(Graphics g)
                        {
                                super.paintComponent(g);
                                g.setColor(Color.pink);
                                Font font=new Font("Times New Roman",Font.ITALIC, 25);
                                g.setFont(font);
                                FontMetrics m=g.getFontMetrics(font);
                                String text="Danciu Camelia, Grupa 2123";
                                int a=(getWidth()-m.stringWidth(text))/2;
                                int b=(getHeight()-m.getHeight())/2+m.getAscent();
                                g.drawString(text, a, b);
                                
                                
                        }
                                };
                                add(panel);
                                setVisible(true);
                
        }
        
        public static void main(String[] args)
        {
                new Test();
        }

}

















//____________________________________________________________






/*Danciu Camelia, gr 2123, lab 10, pb 2
 * 2. Scrieți o aplicație de tip Frame care va desena într-un Canvas un cerc de culoare roșie tangent la dimensiunea cea mai mică (înălțime, lățime)
 *  a componentei Canvas.*/
package llab10;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.Scanner;

public class Test extends Canvas {
static Scanner scan=new Scanner(System.in);
    public void paint(Graphics g) {
        int latime = getWidth();
        int inaltime = getHeight();
        int raza = Math.min(latime, inaltime) / 2;

        g.setColor(Color.RED);
        g.fillOval((latime / 2) - raza, (inaltime / 2) - raza, raza * 2, raza * 2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Problema 2, lab 10");
        Canvas canvas = new Test();
int x, y;
System.out.println("Introduceti dimensiunile ferestrei:");
System.out.println("\tLatimea ferestrei canvas:");
x=scan.nextInt();
System.out.println("\tInaltimea ferestrei canvas:");
y=scan.nextInt();
        
        frame.setSize(x,y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}












//____________________________________________________________






/*Danciu Camelia, grupa 2123, lab 10, pb 3
 * 3. Scrieți o aplicație de tip Frame ce afișează o imagine stocată local sub care este afișat și numele fișierului din care provine,
 *  cu un font stabilit în prealabil și o culoare creată printr-o combinație de trei valori întregi
 *   (reprezentând cantitățile de roșu, verde și albastru).*/
package llab10;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test {

    public static void main(String[] args) throws IOException {
        // Încarcă imaginea din fișier
        File file = new File("img.png");
        Image image = ImageIO.read(file);

        // Creează un label pentru a afișa imaginea
        ImageIcon imageIcon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(imageIcon);

        // Creează un label pentru a afișa numele fișierului
        String filename = file.getName();
        JLabel filenameLabel = new JLabel(filename);
        filenameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        filenameLabel.setForeground(new Color(200, 100, 50)); // culoarea personalizată

        // Creează un frame și adaugă label-urile în acesta
        JFrame frame = new JFrame("Imagine");
        frame.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        frame.add(imageLabel,constraints);

        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.PAGE_START;
        frame.add(filenameLabel,constraints);

        frame.pack();
        frame.setVisible(true);
    }
}












//____________________________________________________________





/*Danciu Camelia, grupa 2123, lab 10, pb 4
 * 4. Scrieți o aplicație de tip Frame ce afișează o miră de televiziune.
 *  Mira va conține minim 10 nivele de gri și culorile de bază: roșu, verde, albastru, galben, cyan și magenta.
 *   Mira va acoperi întreaga dimensiune a componentei în care se face desenarea.*/
package llab10;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Test extends JFrame{
public Test()
{
        
        super("Laboratorul 10");
    setSize(600,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    JPanel panel= new JPanel()
                    {
        public void paintComponent(Graphics g) {
        
                for(int i=0;i<600;i+=60)
                {
                        g.setColor(Color.magenta);
                        g.drawRect(i, 0, 10, 600);
                        g.fillRect(i, 0, 10, 600);
                }


                for(int i=10;i<600;i+=60)
                {
                        g.setColor(Color.gray);
                        g.drawRect(i, 0, 10, 600);
                        g.fillRect(i, 0, 10, 600);
                }
                for(int i=20;i<600;i+=60)
                {
                        g.setColor(Color.green);
                        g.drawRect(i, 0, 10, 600);
                        g.fillRect(i, 0, 10, 600);
                }
                for(int i=30;i<600;i+=60)
                {
                        g.setColor(Color.yellow);
                        g.drawRect(i, 0, 10, 600);
                        g.fillRect(i, 0, 10, 600);
                }
                for(int i=40;i<600;i+=60)
                {
                        g.setColor(Color.blue);
                        g.drawRect(i, 0, 10, 600);
                        g.fillRect(i, 0, 10, 600);
                }
                for(int i=50;i<600;i+=60)
                {
                        g.setColor(Color.red);
                        g.drawRect(i, 0, 10, 600);
                        g.fillRect(i, 0, 10, 600);
                }
                
                
}
                    };
    add(panel);
        setVisible(true);
}
        public static void main(String[] args)
        {
                new Test();
}}














//____________________________________________________________








/*Danciu Camelia, gr 2123, lab 10, pb 5
 * 5. Scrieți o aplicație Java de tip Frame care desenează un cerc colorat în toate culorile posibile.
 *  Se va începe cu culoarea roșie, tranzițiile dintre culori trebuie să fie line,
 *   iar cercul este redesenat pe măsură ce culorile sunt generate.*/
package llab10;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Frame;


public class Test extends javax.swing.JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    public Test() {
        setSize(WIDTH, HEIGHT);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        int x = 100;
        int y = 100;
      int d=250;
        
      //  for( d=250;d<300;d+=40)
         for(int r=255;r>0;r--)
          for(int gg=0;gg<255;gg++)
         for(int b=0;b<255;b++)
                                 
        {
                
                  Color color = new Color(r, gg, b);
            g.setColor(color);
            g.fillOval(x, y, d, d);
          
                }
         
        
    
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    

    public static void main(String[] args) {
        new Test();
    }
}
