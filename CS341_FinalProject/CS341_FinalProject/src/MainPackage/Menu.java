package MainPackage;

import FramePackage.bjFrame;
import FramePackage.mmFrame;
import FramePackage.ssFrame;

/**
 * Course: CS341 Data Structures Date: April 2018 Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        memoryButton = new javax.swing.JButton();
        bjButton = new javax.swing.JButton();
        slapjackButton = new javax.swing.JButton();
        ssButton = new javax.swing.JButton();
        optionLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        createPlayerButton = new javax.swing.JButton();
        selectUserButton = new javax.swing.JButton();
        playerStatsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");

        memoryButton.setText("Memory Match");
        memoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryButtonActionPerformed(evt);
            }
        });

        bjButton.setText("Blackjack");
        bjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bjButtonActionPerformed(evt);
            }
        });

        slapjackButton.setText("Slapjack");
        slapjackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slapjackButtonActionPerformed(evt);
            }
        });

        ssButton.setText("Simon Says");
        ssButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssButtonActionPerformed(evt);
            }
        });

        optionLabel.setText("Game Options:");

        jLabel1.setText("Other Options:");

        createPlayerButton.setText("Create Player");
        createPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlayerButtonActionPerformed(evt);
            }
        });

        selectUserButton.setText("Select User");
        selectUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectUserButtonActionPerformed(evt);
            }
        });

        playerStatsButton.setText("Player Stats");
        playerStatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerStatsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optionLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(memoryButton)
                                    .addComponent(slapjackButton))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ssButton)
                                    .addComponent(bjButton))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(createPlayerButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectUserButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerStatsButton))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bjButton, createPlayerButton, memoryButton, playerStatsButton, selectUserButton, slapjackButton, ssButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(optionLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memoryButton)
                    .addComponent(bjButton))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slapjackButton)
                    .addComponent(ssButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createPlayerButton)
                    .addComponent(selectUserButton)
                    .addComponent(playerStatsButton))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bjButton, memoryButton, slapjackButton, ssButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bjButtonActionPerformed
        // TODO add your handling code here:
        bjFrame bj = new bjFrame();
        bj.setVisible(true);
    }//GEN-LAST:event_bjButtonActionPerformed

    private void memoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryButtonActionPerformed
        // TODO add your handling code here:
        mmFrame mm = new mmFrame();
        mm.setVisible(true);
    }//GEN-LAST:event_memoryButtonActionPerformed

    private void slapjackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slapjackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slapjackButtonActionPerformed

    private void ssButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssButtonActionPerformed
        // TODO add your handling code here:
        ssFrame ss = new ssFrame();
        ss.setVisible(true);
    }//GEN-LAST:event_ssButtonActionPerformed

    private void createPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlayerButtonActionPerformed
        // TODO add your handling code here:
        Player player = new Player();
    }//GEN-LAST:event_createPlayerButtonActionPerformed

    private void selectUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectUserButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectUserButtonActionPerformed

    private void playerStatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerStatsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerStatsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Deck deck = new Deck();

        deck.shuffleDeck();

        //System.out.print(deck.toString());

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bjButton;
    private javax.swing.JButton createPlayerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton memoryButton;
    private javax.swing.JLabel optionLabel;
    private javax.swing.JButton playerStatsButton;
    private javax.swing.JButton selectUserButton;
    private javax.swing.JButton slapjackButton;
    private javax.swing.JButton ssButton;
    // End of variables declaration//GEN-END:variables
}
