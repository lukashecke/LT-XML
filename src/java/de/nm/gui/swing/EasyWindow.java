package de.nm.gui.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EasyWindow extends JFrame {

    public static void main(String[] args) {
        new EasyWindow();
    }

    private JLabel label;

    public EasyWindow() {
        super();

        setTitle("Easy Window");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        label = new JLabel("Dies ist ein Test",JLabel.CENTER);
        JButton redButton = new JButton("rot");
        JButton yellowButton = new JButton("gelb");
        JButton exitButton = new JButton("Ende");

        container.add(label, BorderLayout.CENTER);
        container.add(redButton, BorderLayout.WEST);
        container.add(yellowButton, BorderLayout.EAST);
        container.add(exitButton, BorderLayout.SOUTH);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        });
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.RED);
            }
        });
        yellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.YELLOW);
            }
        });

        setSize(400,100);
        setVisible(true);
    }


    private void exit() {
        System.exit(0);
    }
}
