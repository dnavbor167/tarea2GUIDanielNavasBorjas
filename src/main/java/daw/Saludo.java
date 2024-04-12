/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author daniel
 */
// Se implementa la interfaz
public class Saludo extends JPanel {

    // Se implementa la interfaz
    private JButton botonSaludar, botonDespedir;
    private JTextArea texto;
    
    public Saludo() {
        initComponents();
    }
    
    private void initComponents() {
        
        botonSaludar = new JButton("Daniel");
        botonDespedir = new JButton("Navas Borjas");
        texto = new JTextArea(1, 25);
        texto.setBackground(Color.ORANGE);
        
        this.setLayout(new FlowLayout());
        
        this.add(botonSaludar);
        this.add(texto);

        // Se le indica al objeto boton que escuche eventos tipo click
        // y se pasa como argumento una referencia de tipo ActionListener
        // En este caso se pasa this que es el panel sobre el 
        // que está el botón y que implementa la interfaz ActionListener
        // Clase anónima (sin nombre) anidada (dentro de un método)
        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonSaludarActionPerformed(e);
            }
            
        });

        // Añadimos el botón al panel
        this.add(botonDespedir);
        // Controlador del evento
        //botonDespedir.addActionListener(this);
        botonDespedir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonDespedirActionPerformed(e);
            }
        });
        
    }
    
    private void botonDespedirActionPerformed(ActionEvent e) {
        texto.setText("Navas Borjas");
        texto.setBackground(Color.green);
    }
    
    private void botonSaludarActionPerformed(ActionEvent e) {
        texto.setText("Daniel");
        texto.setBackground(Color.white);
    }
    
}
