/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoborderlayout;

import javax.swing.JFrame;

/**
 *
 * @author Alumno
 */
public class DemoBorderLayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoBorderLayout marcoBorderLayout = new MarcoBorderLayout();       
        marcoBorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        marcoBorderLayout.setSize(300, 200);      
        marcoBorderLayout.setVisible(true);
    }   
}
