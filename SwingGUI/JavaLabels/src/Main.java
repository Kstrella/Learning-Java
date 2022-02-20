
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinestrella
 */
public class Main {
    
    //Jlabel = a GUI display area for a string of text,an image,or both
    
    public static void main(String[] args){
        
        ImageIcon image = new ImageIcon("pika.jpg");
        
        //make a boarder for pic 
        Border border = BorderFactory.createLineBorder(Color.green,3);
        
        //create label
        JLabel label = new JLabel();
        label.setText("do you even code m8?");//sets txt of label
        label.setIcon(image);//sets image icon!
        
        
        //to move txt around
        //JLabel.center,.top,.bottom,.left,or .right of image iconr
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        
        //set txt color
        label.setForeground(new Color(0x00FF00));
        //txt font and size
        label.setFont(new Font("MV Boli",Font.PLAIN,15));
        //set icon txt gap
        label.setIconTextGap(30);
        //color of background
        label.setBackground(Color.black);
        //making color visible
        label.setOpaque(true);
        
        //making boarder visible
        label.setBorder(border);
        //set verticsl position of icon and txt
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        //sets x,y,z for label within frame 
       // label.setBounds(100, 100, 250, 250);
        
        
        
        
        
        //basic frame 
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        
        //sets layout of the pic and txt (label)
        //frame.setLayout(null);
        
        frame.setVisible(true);
        frame.add(label); //add albel to frame
        
        //resizes size of frame to accomodate components
        frame.pack();
    }
}
