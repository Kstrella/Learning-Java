
import java.awt.GridLayout;
import javax.swing.JButton;
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

    public static void main(String[] args) {
        //Layout Manager = Defines the natural layout for components with a container
        //Grid Layout = places components in a grid of cells
        //each component takes all available space within its cell
        //and each cell is the same size

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        //grid layout the 2 arguments sets hor and ver spacing betweenn componenets by pixel
        frame.setLayout(new GridLayout(3, 3, 10, 10));
        // add buttons anaonymous buttons
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

    }

}
