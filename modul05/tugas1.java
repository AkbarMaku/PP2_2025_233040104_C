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
public class tugas1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("INI BINGKAI");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            JLabel label = new JLabel("Hawo", SwingConstants.CENTER);

            // Tombol-tombol
            JButton buttonSouth = new JButton("Klik");
            JButton buttonNorth = new JButton("Utara");
            JButton buttonWest = new JButton("Barat");
            JButton buttonEast = new JButton("Timur");
            JButton buttonCenter = new JButton("Tengah");

            // Aksi tombol SOUTH (sudah ada)
            buttonSouth.addActionListener(e -> {
                label.setText("Yeay dari Selatan!");
            });

            // Aksi tombol lainnya
            buttonNorth.addActionListener(e -> {
                label.setText("Halo dari Utara!");
            });

            buttonWest.addActionListener(e -> {
                label.setText("Kamu menekan tombol Barat!");
            });

            buttonEast.addActionListener(e -> {
                label.setText("Kamu menekan tombol Timur!");
            });

            buttonCenter.addActionListener(e -> {
                label.setText("Ini tombol Tengah!");
            });

            // Menambahkan komponen ke frame
            frame.add(label, BorderLayout.NORTH);
            frame.add(buttonSouth, BorderLayout.SOUTH);
            frame.add(buttonWest, BorderLayout.WEST);
            frame.add(buttonEast, BorderLayout.EAST);
            frame.add(buttonCenter, BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }
}
