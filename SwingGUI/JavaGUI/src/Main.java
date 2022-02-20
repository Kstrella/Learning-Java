
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevst
 */
public class Main {
    
    public static void main (String[] args)
    {
        /*
        //All below can be done in a parent class for the frame
        /////////////////////////////////////////////////////////////
       /// JFrame = a GUI windo to add components to
        
        JFrame frame = new JFrame();
        
        frame.setTitle("JFrame title goes here");
        
        
        //closes application when you exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //This doesnt let us resize the window
        frame.setResizable(false);
        
        //this sets the x and y demension
        frame.setSize(420,420); 
        
        //this makes the frame visible
        frame.setVisible(true);
        
        
        //this changes icon of frame
        ImageIcon image = new ImageIcon("Pika.jpg"); 
        //changes it to the custom pic
        frame.setIconImage(image.getImage());
        ////////////////////////////////////////////////////////////////
        
        //how to change background color of frame
        //frame.getContentPane().setBackground(Color.green);
        //has some pre set color but you can make a custom one        
        ///////////////////////////////////////////////red,green,blue 255 is max
        frame.getContentPane().setBackground(new Color(123,50,250));
//rgb values or hex color values(0x123456)(number parts is what you change
       */
        
        MyFrame myFrame = new MyFrame();
    }
    
}
