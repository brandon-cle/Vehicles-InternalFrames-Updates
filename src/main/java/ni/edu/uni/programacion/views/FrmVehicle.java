/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import ni.edu.uni.programacion.controllers.PnlVehicleController;
import ni.edu.uni.programacion.controllers.PnlViewVehicleController;
import ni.edu.uni.programacion.views.InternalFrames.IFNew;
import ni.edu.uni.programacion.views.InternalFrames.IFView;
import ni.edu.uni.programacion.views.panels.PnlVehicle;
import ni.edu.uni.programacion.views.panels.PnlViewVehicle;

/**
 *
 * @author Sistemas-05
 */
public class FrmVehicle extends javax.swing.JFrame {
    private PnlVehicle pnlVehicle;
    private PnlVehicleController pnlVehicleController;
    
    private PnlViewVehicle pnlViewVehicle;
    private PnlViewVehicleController pnlViewVehicleController;
    //
    public static IFNew ifn;
    public static IFView ifv;
    public static boolean x;
    
    //
    /**
     * Creates new form FrmVehicle
     */
    public FrmVehicle() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeskContent = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuiNew = new javax.swing.JMenuItem();
        mnuiView = new javax.swing.JMenuItem();
        Separator = new javax.swing.JPopupMenu.Separator();
        mnuiExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DeskContent.setBackground(new java.awt.Color(51, 51, 51));
        DeskContent.setName(""); // NOI18N

        javax.swing.GroupLayout DeskContentLayout = new javax.swing.GroupLayout(DeskContent);
        DeskContent.setLayout(DeskContentLayout);
        DeskContentLayout.setHorizontalGroup(
            DeskContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );
        DeskContentLayout.setVerticalGroup(
            DeskContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        mnuiNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuiNew.setText("New");
        mnuiNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiNewActionPerformed(evt);
            }
        });
        jMenu1.add(mnuiNew);

        mnuiView.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuiView.setText("View vehicle list");
        mnuiView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiViewActionPerformed(evt);
            }
        });
        jMenu1.add(mnuiView);
        jMenu1.add(Separator);

        mnuiExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuiExit.setText("Exit");
        mnuiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuiExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskContent)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskContent)
        );

        setSize(new java.awt.Dimension(471, 440));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void turningon()
    {
        if(ifn == null)
        {
            mnuiNew.setEnabled(true);
        }
        else{
            mnuiNew.setEnabled(false);
        }
        
        if(ifv == null)
        {
            mnuiView.setEnabled(true);
        }
        else{
            mnuiView.setEnabled(false);
        }
    }
    private void mnuiNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiNewActionPerformed
        
            
        if(ifn == null)
        {
            mnuiNew.setEnabled(false);
            ifn = new IFNew();
            pnlVehicle = new PnlVehicle();
            ifn.addComponent(pnlVehicle);
            this.DeskContent.add(ifn);
            //
            try {
                pnlVehicleController = new PnlVehicleController(pnlVehicle);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FrmVehicle.class.getName()).log(Level.SEVERE, null, ex);
            }
            Dimension DeskContentSize = DeskContent.getSize();
            Dimension IFNew = ifn.getSize();
            ifn.setLocation((DeskContentSize.width - IFNew.width)/2,(DeskContentSize.height - IFNew.height)/2);
            //x,y
           ifn.show();
        }else
        {
            JOptionPane.showMessageDialog(null, "the window is already opened");
            
        }
    }//GEN-LAST:event_mnuiNewActionPerformed

    private void mnuiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuiExitActionPerformed

    private void mnuiViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiViewActionPerformed
        
            
        if(ifv == null)
        {
            ifv = new IFView();
            pnlViewVehicle = new PnlViewVehicle();
            pnlViewVehicleController = new PnlViewVehicleController(pnlViewVehicle);
            ifv.addComponent(pnlViewVehicle);
            this.DeskContent.add(ifv);
            //
            Dimension DeskContentSize = DeskContent.getSize();
            Dimension IFView = ifv.getSize();
            ifv.setLocation((DeskContentSize.width - IFView.width)/2,(DeskContentSize.height - IFView.height)/2);
            //x,y
           ifv.show();
        }
        
    }//GEN-LAST:event_mnuiViewActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane DeskContent;
    private javax.swing.JPopupMenu.Separator Separator;
    public static javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuiExit;
    public static javax.swing.JMenuItem mnuiNew;
    private javax.swing.JMenuItem mnuiView;
    // End of variables declaration//GEN-END:variables
}
