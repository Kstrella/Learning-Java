
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kevst
 */
///THIS WILL HELP WITH THE JAVA APP COMPLETELY
public class Main {

    public static void main(String[] args) {

        //Layout Manager = defines the natural layout for components withion a container
        //Flow Layout = places components in a row, sized at their preferd size
        //if the horizontal space in the container is too small,
        //the  FlowLayout class uses the next available row
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        // frame.setVisible(true);
        //flow layout (leading means leading left corner,trailing is right corner,center is default,you can also pass horizontal and vertical
        //                                                hor,vert
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        //JButton button1 = new JButton();
        //shortcut on adding a JButton
        /*
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
         */
        //add panel
        frame.add(panel);
        //set visible at end so it spawns fater
        frame.setVisible(true);

    }

}
