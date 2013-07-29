
import gui.mainMenu;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
        
        // TODO code application logic here
    }
}
