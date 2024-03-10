
/*Danciu Camelia, grupa 2123, lab 11, pb 2
 * 2. Implementați o aplicație Java care folosește GridBagLayout pentru aranjarea în pagină a componentelor unei aplicații de calcul
 *  (TextField pt. intrare/ieșire, butoane pentru numere, operații matematice, ștergerea ecranului, etc.).
 * */
package llab10;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Test {

        public static void main(String[] args) {
                // Create and set up a frame window
                JFrame.setDefaultLookAndFeelDecorated(true);
                JFrame frame = new JFrame("Calculator");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Define the panel to hold the components
                JPanel panel = new JPanel();
                GridBagLayout layout = new GridBagLayout();
                panel.setLayout(layout);
                GridBagConstraints gbc = new GridBagConstraints();
                JTextField textField = new JTextField(gbc.gridwidth*4);
      panel.add(textField);

                // Put constraints on different buttons
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.gridx = 0;
                gbc.gridy = 1;
                panel.add(new JButton("7"), gbc);

                gbc.gridx = 1;
                gbc.gridy = 1;
                panel.add(new JButton("8"), gbc);
                
                
                gbc.gridx = 2;
                gbc.gridy = 1;
                panel.add(new JButton("9"), gbc);

                gbc.gridx = 3;
                gbc.gridy = 1;
                panel.add(new JButton("C"), gbc);
                
                
                gbc.gridx = 0;
                gbc.gridy = 2;
                panel.add(new JButton("4"), gbc);

                gbc.gridx = 1;
                gbc.gridy = 2;
                panel.add(new JButton("5"), gbc);
                
                
                gbc.gridx = 2;
                gbc.gridy = 2;
                panel.add(new JButton("6"), gbc);

                gbc.gridx = 3;
                gbc.gridy = 2;
                panel.add(new JButton("/"), gbc);
                
                
                gbc.gridx = 0;
                gbc.gridy = 3;
                panel.add(new JButton("1"), gbc);

                gbc.gridx = 1;
                gbc.gridy = 3;
                panel.add(new JButton("2"), gbc);
                
                
                gbc.gridx = 2;
                gbc.gridy = 3;
                panel.add(new JButton("3"), gbc);

                gbc.gridx = 3;
                gbc.gridy = 3;
                panel.add(new JButton("*"), gbc);
                
                gbc.gridx = 0;
                gbc.gridy = 4;
                panel.add(new JButton("+"), gbc);

                gbc.gridx = 1;
                gbc.gridy = 4;
                panel.add(new JButton("0"), gbc);
                
                
                gbc.gridx = 2;
                gbc.gridy = 4;
                panel.add(new JButton("."), gbc);
                
                

                gbc.gridx = 3;
                gbc.gridy = 4;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.gridheight=4;
                gbc.gridwidth = 2;
                panel.add(new JButton("="), gbc);

                frame.add(panel);

                // show the window                
                frame.pack();
                frame.setVisible(true);

        }
}
