/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.views.InternalFrames;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JComponent;

/**
 *
 * @author Usuario
 */
public class IFView extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFNew
     */
    public IFView() {
        setPreferredSize(new Dimension(700, 500));
        setMaximumSize(new Dimension(700, 500));
        setMinimumSize(new Dimension(700, 500));
        setMaximizable(true);
        initComponents();
    }
    
    public void addComponent(JComponent component){
        pnlContent.removeAll();
        pnlContent.add(component, BorderLayout.CENTER);
        
        validate();
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        pnlContent.setBackground(new java.awt.Color(102, 102, 102));
        pnlContent.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}