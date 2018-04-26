/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
package FramePackage;

import java.io.*;
import sun.audio.*;
import GamePackage.SimonSays;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import sun.applet.Main;

public class ssFrame extends javax.swing.JFrame {

    /**
     * Creates new form ssFrame
     */
    public ssFrame() {
        initComponents();
    }

    SimonSays ssGame = new SimonSays();

    List<Integer> inputOrder = new ArrayList<Integer>();

    ActionListener taskPerformer;

    int delay = 0;
    int x = 0;
    int color = 0;
    int flip = 0;
    int score = 0;

    String url = "/MainPackage/audioFile.wav";

    public static synchronized void playSound(final String url) {
        new Thread(new Runnable() {
            // The wrapper thread is unnecessary, unless it blocks on the
            // Clip finishing; see comments.
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                            //"/MainPackage/audioFile.wav"
                            Main.class.getResourceAsStream(url));
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        redButton = new javax.swing.JButton();
        yellowButton = new javax.swing.JButton();
        greenButton = new javax.swing.JButton();
        blueButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scoreValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Simon Says");
        setResizable(false);

        redButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg"))); // NOI18N
        redButton.setEnabled(false);
        redButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redButtonActionPerformed(evt);
            }
        });

        yellowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg"))); // NOI18N
        yellowButton.setEnabled(false);
        yellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowButtonActionPerformed(evt);
            }
        });

        greenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/green_back.jpg"))); // NOI18N
        greenButton.setEnabled(false);
        greenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenButtonActionPerformed(evt);
            }
        });

        blueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg"))); // NOI18N
        blueButton.setEnabled(false);
        blueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Toppan Bunkyu Gothic", 3, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Simon Says");
        titleLabel.setToolTipText("");

        playButton.setFont(new java.awt.Font("Toppan Bunkyu Midashi Gothic", 3, 13)); // NOI18N
        playButton.setText("Play");
        playButton.setToolTipText("");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Score:");

        scoreValue.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(greenButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(yellowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(blueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(scoreValue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yellowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(scoreValue))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redButtonActionPerformed
        // TODO add your handling code here:
        playSound(url);

        inputOrder.add(1);
        if (ssGame.isMatch(inputOrder)) {
            redButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/purple_back.jpg")));
            ssGame.addOrder();

            for (int x = 0; x < ssGame.size(); x++) {
                ssGame.play().get(x);
                toggleCard();
            }

            score++;
            scoreValue.setText("" + score);
        } else {
            //end game
            JOptionPane.showMessageDialog(rootPane, "You lose");

            //restart buttons
            playButton.setEnabled(true);
            redButton.setEnabled(false);
            blueButton.setEnabled(false);
            greenButton.setEnabled(false);
            yellowButton.setEnabled(false);
        }
    }//GEN-LAST:event_redButtonActionPerformed

    private void yellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowButtonActionPerformed
        // TODO add your handling code here:
        playSound(url);

        inputOrder.add(2);
        if (ssGame.isMatch(inputOrder)) {
            yellowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/purple_back.jpg")));
            ssGame.addOrder();

            for (int x = 0; x < ssGame.size(); x++) {
                ssGame.play().get(x);
                toggleCard();
            }

            score++;
            scoreValue.setText("" + score);
        } else {
            //end game
            JOptionPane.showMessageDialog(rootPane, "You lose");

            //restart buttons
            playButton.setEnabled(true);
            redButton.setEnabled(false);
            blueButton.setEnabled(false);
            greenButton.setEnabled(false);
            yellowButton.setEnabled(false);
        }
    }//GEN-LAST:event_yellowButtonActionPerformed

    private void greenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenButtonActionPerformed
        // TODO add your handling code here:
        playSound(url);

        inputOrder.add(3);
        if (ssGame.isMatch(inputOrder)) {
            greenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/purple_back.jpg")));
            ssGame.addOrder();

            for (int x = 0; x < ssGame.size(); x++) {
                ssGame.play().get(x);
                toggleCard();
            }

            score++;
            scoreValue.setText("" + score);
        } else {
            //end game
            JOptionPane.showMessageDialog(rootPane, "You lose");

            //restart buttons
            playButton.setEnabled(true);
            redButton.setEnabled(false);
            blueButton.setEnabled(false);
            greenButton.setEnabled(false);
            yellowButton.setEnabled(false);
        }
    }//GEN-LAST:event_greenButtonActionPerformed

    private void blueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueButtonActionPerformed
        // TODO add your handling code here:
        playSound(url);

        inputOrder.add(4);
        if (ssGame.isMatch(inputOrder)) {
            blueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/purple_back.jpg")));
            ssGame.addOrder();

            for (int x = 0; x < ssGame.size(); x++) {
                ssGame.play().get(x);
                toggleCard();
            }

            score++;
            scoreValue.setText("" + score);
        } else {
            //end game
            JOptionPane.showMessageDialog(rootPane, "You lose");

            //restart buttons
            playButton.setEnabled(true);
            redButton.setEnabled(false);
            blueButton.setEnabled(false);
            greenButton.setEnabled(false);
            yellowButton.setEnabled(false);
        }
    }//GEN-LAST:event_blueButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // TODO add your handling code here:
        //enable buttons
        redButton.setEnabled(true);
        blueButton.setEnabled(true);
        yellowButton.setEnabled(true);
        greenButton.setEnabled(true);

        //reset game
        ssGame = new SimonSays();
        inputOrder.clear();
        score = 0;
        scoreValue.setText("" + score);

        playButton.setEnabled(false);

        String difficulty = difficultyFrame.getDifficulty();

        switch (difficulty) {
            case "easy":
                delay = 500;
                break;
            case "medium":
                delay = 300;
                break;
            case "hard":
                delay = 200;
                break;
        }
        ssGame.addOrder();

        color = ssGame.play().get(0);

        //taskPerformer = toggleCard();
        toggleCard();

        playButton.setEnabled(false);

    }//GEN-LAST:event_playButtonActionPerformed

    public void toggleCard() {
        taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //...Perform a task...
                switch (flip) {
                    case 0:
                        switch (color) {
                            case 1:
                                redButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/gray_back.jpg")));
                                break;
                            case 2:
                                yellowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/gray_back.jpg")));
                                break;
                            case 3:
                                greenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/gray_back.jpg")));
                                break;
                            case 4:
                                blueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/gray_back.jpg")));
                                break;
                            default:
                                break;
                        }
                        flip++;
                        break;
                    case 1:
                        redButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
                        yellowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
                        greenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/green_back.jpg")));
                        blueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg")));
                        break;
                    default:
                        flip = 0;
                        break;
                }//switch 1 

            }//action performed

        };
        new javax.swing.Timer(delay, taskPerformer)
                .start();

        delay = delay * 2;
    }

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
            java.util.logging.Logger.getLogger(ssFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ssFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ssFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ssFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ssFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blueButton;
    private javax.swing.JButton greenButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton playButton;
    private javax.swing.JButton redButton;
    private javax.swing.JLabel scoreValue;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton yellowButton;
    // End of variables declaration//GEN-END:variables
}
