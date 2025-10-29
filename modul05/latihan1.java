/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040104.modul05;

import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class latihan1 {
    
    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable (){
            public void run() {
                JFrame frame = new JFrame("INI BINGKAI");
                frame.setSize(400,300);
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
