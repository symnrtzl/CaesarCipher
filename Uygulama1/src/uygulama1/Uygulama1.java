
package uygulama1;

import java.awt.Color;
import javax.swing.JFrame;


public class Uygulama1 extends JFrame{

    
    
    public static void main(String[] args) {
        UygualamaArayuz a= new UygualamaArayuz();
        a.getContentPane().setBackground(new Color(153,153,153));
        //Visible=true yaparak Frame i görünür hale getirdik.
        a.setVisible(true);
        
    }
    
}
