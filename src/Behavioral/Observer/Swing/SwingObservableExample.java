package Behavioral.Observer.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * An example app to Swing's implementation of the observer pattern.
 *
 * The app displays a button that posses a question. Event listeners are added to the button which prints a response.
 */
public class SwingObservableExample {
    JFrame frame;

    public static void main(String[] args){
        SwingObservableExample example = new SwingObservableExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

//         With lambdas
//        button.addActionListener(event -> System.out.println("Do it!"));
//        button.addActionListener(event -> System.out.println("Don't do it! You might regret it."));

        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}