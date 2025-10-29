/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040104.modul05;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class latihan4 {
    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable (){
            public void run() {
                JFrame frame = new JFrame("INI BINGKAI");
                frame.setSize(400,300);
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                
                frame.setLayout(new BorderLayout());
                
                JLabel label = new JLabel("Hawo");
                JButton button = new JButton("Klik");
                
                button.addActionListener(e -> {
                   label.setText("Yeay"); 
                });
                
                frame.add(label, BorderLayout.NORTH);
                frame.add(button, BorderLayout.SOUTH);
                frame.add(new JButton("Selatan"), BorderLayout.WEST);
                frame.add(new JButton("Timur"), BorderLayout.EAST);
                frame.add(new JButton("Tengah"), BorderLayout.CENTER);
                
                frame.setVisible(true);
            }
        });
    }
}
