package com.zetcode;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ShootingMissilesEx extends JFrame {

    public ShootingMissilesEx() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setSize(4000, 3000);
        setResizable(true);
        
        setTitle("Platformer");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                ShootingMissilesEx ex = new ShootingMissilesEx();
                ex.setVisible(true);
            }
        });
    }
}
