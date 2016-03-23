/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetinfo;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;

/**
 *
 * @author onlyj_000
 */
public class ProjetInfo {

    public static void openFile(ActionEvent e){
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI test = new GUI();
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(test);
        frame.pack();
        frame.setVisible(true);
        // TODO code application logic here
    }
    
}
