
/*Danciu Camelia, grupa 2123, lab 11, pb 1
 * 1. Implementați o aplicație Java care folosește GridLayout pentru aranjarea în pagină a componentelor unei aplicații de 
calcul (TextField pt. intrare/ieșire, butoane pentru numere, operații matematice, ștergerea ecranului, etc.).*/
package lab11pb1;

import javax.swing.*;
import java.awt.*;

public class Test {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        JTextField textField = new JTextField();
        panel.add(textField);

        String[] buttonLabels = {"7", "8", "9", "+", "C",
                                 "4", "5", "6", "-", "/",
                                 "1", "2", "3", "*", "=",
                                 "0", ".", "(", ")"};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            panel.add(button);
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}






