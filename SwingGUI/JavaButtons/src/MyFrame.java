
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kevst
 */




import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	MyFrame(){
		//sets icon for button(NEED FOR APP)
		ImageIcon icon = new ImageIcon("pika.jpg");
                //this pic pops up when we block button
		ImageIcon icon2 = new ImageIcon("pika.jpg");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		 //how to make button
		button = new JButton();
                 //this takes x,y,width and height
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
                //sets button txt
		button.setText("I'm a button!");
		
		button.setFocusable(false);
		button.setIcon(icon);
                //to put icon on right of txt
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
                //sets how close txt is
		button.setIconTextGap(-5);
                //color of icon
		button.setForeground(Color.cyan);
                //background icon color
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
                //this shows button
		this.add(button);
		this.add(label);
	}

         //this listens for events
	@Override
	public void actionPerformed(ActionEvent e) {
            //to see if event that occurs is our button
		if(e.getSource()==button) {
			System.out.println("poo");
			button.setEnabled(false);
			label.setVisible(true);
		}	
	}
}