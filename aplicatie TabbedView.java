/*3. Implementați o aplicație de tip TabbedView care afișează în fiecare panou grafic:
- o zonă de desenare
- componente pentru selectarea tipului de font, a mărimii de font și a culorii textului
- componente pentru alegerea unei forme geometrice (dintr-un set predefinit) și a mărimii laturii / razei (după caz)*/
package llab10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabbedApp extends JFrame {
    private JTabbedPane tabbedPane;

    public TabbedApp() {
        setTitle("Aplicație TabbedView");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane = new JTabbedPane();

        // Tabul 1
        JPanel tab1 = new JPanel();
        tab1.setLayout(new BorderLayout());

        // Adaugă zona de desenare în Tabul 1
        DrawingArea drawingArea1 = new DrawingArea();
        drawingArea1.setSize(200,200);
        tab1.add(drawingArea1, BorderLayout.SOUTH);

        // Adaugă componente pentru font în Tabul 1
        JLabel fontLabel1 = new JLabel("Font:");
      //  fontLabel1.setSize(200,200);
        tab1.add(fontLabel1, BorderLayout.NORTH);

        JComboBox<String> fontCombo1 = new JComboBox<>(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
        tab1.add(fontCombo1, BorderLayout.NORTH);

        // Adaugă componente pentru mărimea fontului în Tabul 1
        JLabel sizeLabel1 = new JLabel("Size:");
        sizeLabel1.setSize(getPreferredSize());
        tab1.add(sizeLabel1, BorderLayout.SOUTH);

        JTextField sizeTextField1 = new JTextField();
        tab1.add(sizeTextField1, BorderLayout.EAST);

        // Adaugă componente pentru culoarea textului în Tabul 1
        JLabel colorLabel1 = new JLabel("Color:");
        tab1.add(colorLabel1, BorderLayout.CENTER);

        JComboBox<String> colorCombo1 = new JComboBox<>(new String[]{"red", "green", "blue"});
        tab1.add(colorCombo1, BorderLayout.CENTER);

        tabbedPane.addTab("Tab 1", tab1);

        // Tabul 2 (similar Tabului 1)
        JPanel tab2 = new JPanel();
        tab2.setLayout(new BorderLayout());

        DrawingArea drawingArea2 = new DrawingArea();
        tab2.add(drawingArea2, BorderLayout.CENTER);

        JLabel fontLabel2 = new JLabel("Font:");
        tab2.add(fontLabel2, BorderLayout.NORTH);

        JComboBox<String> fontCombo2 = new JComboBox<>(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
        tab2.add(fontCombo2, BorderLayout.WEST);

        JLabel sizeLabel2 = new JLabel("Size:");
        tab2.add(sizeLabel2, BorderLayout.SOUTH);

        JTextField sizeTextField2 = new JTextField();
       // sizeTextField2.setMinimumSize(getMinimumSize());
        tab2.add(sizeTextField2, BorderLayout.SOUTH);

        JLabel colorLabel2 = new JLabel("Color:");
        tab2.add(colorLabel2, BorderLayout.CENTER);

        JComboBox<String> colorCombo2 = new JComboBox<>(new String[]{"red", "green", "blue"});
        tab2.add(colorCombo2, BorderLayout.CENTER);

        tabbedPane.addTab("Tab 2", tab2);

        add(tabbedPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TabbedApp();
            }
        });
    }

    private class DrawingArea extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.fillOval(50, 50, 50, 50); 
            
            
        }
    }
}
