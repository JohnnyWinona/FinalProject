/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramePackage;

import GamePackage.MemoryMatch;
import MainPackage.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mmFrame extends javax.swing.JFrame {

    /**
     * Creates new form mmDesktop
     */
    public mmFrame() {
        initComponents();
    }

    private final int EASY_MATCHES = 2;
    private final int MED_MATCHES = 3;
    private final int HARD_MATCHES = 4;

    MemoryMatch mmGame = new MemoryMatch();

    List<Card> cards = new ArrayList<Card>();

    Card firstCard;
    Card secondCard;

    String difficulty;

    int cardSelectionCount;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        easyButton = new javax.swing.JButton();
        mediumButton = new javax.swing.JButton();
        hardButton = new javax.swing.JButton();
        easyCard1 = new javax.swing.JToggleButton();
        easyCard2 = new javax.swing.JToggleButton();
        easyCard3 = new javax.swing.JToggleButton();
        easyCard4 = new javax.swing.JToggleButton();
        medCard5 = new javax.swing.JToggleButton();
        medCard6 = new javax.swing.JToggleButton();
        hardCard7 = new javax.swing.JToggleButton();
        hardCard8 = new javax.swing.JToggleButton();
        newGameButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Memory Match");
        setResizable(false);

        easyButton.setText("Easy");
        easyButton.setEnabled(false);
        easyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyButtonActionPerformed(evt);
            }
        });

        mediumButton.setText("Medium");
        mediumButton.setEnabled(false);
        mediumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumButtonActionPerformed(evt);
            }
        });

        hardButton.setText("Hard");
        hardButton.setEnabled(false);
        hardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardButtonActionPerformed(evt);
            }
        });

        easyCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg"))); // NOI18N
        easyCard1.setEnabled(false);
        easyCard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyCard1ActionPerformed(evt);
            }
        });

        easyCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg"))); // NOI18N
        easyCard2.setEnabled(false);
        easyCard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyCard2ActionPerformed(evt);
            }
        });

        easyCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg"))); // NOI18N
        easyCard3.setEnabled(false);
        easyCard3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyCard3ActionPerformed(evt);
            }
        });

        easyCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg"))); // NOI18N
        easyCard4.setEnabled(false);
        easyCard4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyCard4ActionPerformed(evt);
            }
        });

        medCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg"))); // NOI18N
        medCard5.setEnabled(false);
        medCard5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medCard5ActionPerformed(evt);
            }
        });

        medCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg"))); // NOI18N
        medCard6.setEnabled(false);
        medCard6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medCard6ActionPerformed(evt);
            }
        });

        hardCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg"))); // NOI18N
        hardCard7.setEnabled(false);
        hardCard7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardCard7ActionPerformed(evt);
            }
        });

        hardCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg"))); // NOI18N
        hardCard8.setEnabled(false);
        hardCard8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardCard8ActionPerformed(evt);
            }
        });

        newGameButton.setText("New Game");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(easyCard1)
                    .addComponent(easyCard3))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(easyCard4)
                    .addComponent(easyCard2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(medCard6)
                        .addGap(18, 18, 18)
                        .addComponent(hardCard8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(medCard5)
                        .addGap(18, 18, 18)
                        .addComponent(hardCard7)))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(newGameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(easyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mediumButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hardButton)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {easyButton, hardButton, mediumButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(easyCard2)
                    .addComponent(medCard5)
                    .addComponent(hardCard7)
                    .addComponent(easyCard1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(easyCard4)
                    .addComponent(easyCard3)
                    .addComponent(medCard6)
                    .addComponent(hardCard8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(easyButton)
                    .addComponent(mediumButton)
                    .addComponent(hardButton)
                    .addComponent(newGameButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void easyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyButtonActionPerformed
        // TODO add your handling code here:
        //generate cards
        mmGame.generateMemoryMatch("easy");

        //assign cards
        cards = mmGame.getCards();

        Collections.shuffle(cards);

        //show cards faces
        easyCard1.setIcon(cards.get(0).getCardImage());
        easyCard2.setIcon(cards.get(1).getCardImage());
        easyCard3.setIcon(cards.get(2).getCardImage());
        easyCard4.setIcon(cards.get(3).getCardImage());

        /*
        try {
            Thread.sleep(1000);

            //easy cards
            easyCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg")));
            easyCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg")));
            easyCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg")));
            easyCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg")));
         */
        easyCard1.setEnabled(true);
        easyCard2.setEnabled(true);
        easyCard3.setEnabled(true);
        easyCard4.setEnabled(true);
        /*
            //not easy cards
            medCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/gray_back.jpg")));
            medCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/gray_back.jpg")));
            hardCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/gray_back.jpg")));
            hardCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/gray_back.jpg")));
            medCard5.setEnabled(false);
            medCard6.setEnabled(false);
            hardCard7.setEnabled(false);
            hardCard8.setEnabled(false);

            easyButton.setEnabled(false);
            mediumButton.setEnabled(false);
            hardButton.setEnabled(false);

        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
         */
    }//GEN-LAST:event_easyButtonActionPerformed

    private void mediumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumButtonActionPerformed
        // TODO add your handling code here:
        //med cards
        easyCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
        easyCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
        easyCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
        easyCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
        medCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
        medCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
        easyCard1.setEnabled(true);
        easyCard2.setEnabled(true);
        easyCard3.setEnabled(true);
        easyCard4.setEnabled(true);
        medCard5.setEnabled(true);
        medCard6.setEnabled(true);

        //not med cards
        hardCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/gray_back.jpg")));
        hardCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/gray_back.jpg")));
        hardCard7.setEnabled(false);
        hardCard8.setEnabled(false);

        easyButton.setEnabled(false);
        mediumButton.setEnabled(false);
        hardButton.setEnabled(false);

        difficulty = "medium";

        //generate cards
        mmGame.generateMemoryMatch(difficulty);

        //assign cards
        cards = mmGame.getCards();

        Collections.shuffle(cards);
    }//GEN-LAST:event_mediumButtonActionPerformed

    private void hardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardButtonActionPerformed
        // TODO add your handling code here:
        //hard cards
        easyCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        easyCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        easyCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        easyCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        medCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        medCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        hardCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        hardCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        easyCard1.setEnabled(true);
        easyCard2.setEnabled(true);
        easyCard3.setEnabled(true);
        easyCard4.setEnabled(true);
        medCard5.setEnabled(true);
        medCard6.setEnabled(true);
        hardCard7.setEnabled(true);
        hardCard8.setEnabled(true);

        easyButton.setEnabled(false);
        mediumButton.setEnabled(false);
        hardButton.setEnabled(false);

        difficulty = "hard";

        //generate cards
        mmGame.generateMemoryMatch(difficulty);

        //assign cards
        cards = mmGame.getCards();

        Collections.shuffle(cards);
    }//GEN-LAST:event_hardButtonActionPerformed

    private void easyCard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyCard1ActionPerformed
        // TODO add your handling code here:

        easyCard1.setIcon(cards.get(0).getCardImage());

        easyCard1.setSelected(false);

        boolean flag;

        do {

            flag = false;

            switch (cardSelectionCount) {
                case 0: //no cards selected
                    firstCard = cards.get(0);
                    //increment selection counter
                    cardSelectionCount++;
                    break;
                case 1: //one card selected
                    secondCard = cards.get(0);
                    //increment selection counter
                    cardSelectionCount++;
                    flag = true;
                case 2: //redo switch after resetting selection counter
                    flag = true;

                    //check if match
                    if (mmGame.isMatch(firstCard, secondCard)) {
                        easyCard1.setSelected(true);
                    } else {
                        //reset selections
                        switch (difficulty) {
                            case "easy":
                                changeCardEasy();
                                break;
                            case "medium":
                                changeCardMedium();
                                break;
                            case "hard":
                                changeCardHard();
                                break;
                        }
                    }
                    //reset selection counter
                    cardSelectionCount = 0;
                    break;
            }
        } while (flag);
    }//GEN-LAST:event_easyCard1ActionPerformed

    private void easyCard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyCard2ActionPerformed
        // TODO add your handling code here:

        easyCard2.setIcon(cards.get(1).getCardImage());

        easyCard2.setSelected(false);

        boolean flag;

        do {

            flag = false;

            switch (cardSelectionCount) {
                case 0: //no cards selected
                    firstCard = cards.get(1);
                    break;
                case 1: //one card selected
                    secondCard = cards.get(1);
                    break;
                case 2: //redo switch after resetting selection counter
                    flag = true;

                    //check if match
                    if (mmGame.isMatch(firstCard, secondCard)) {
                        easyCard2.setSelected(true);
                    } else {
                        //reset selections
                        switch (difficulty) {
                            case "easy":
                                changeCardEasy();
                                break;
                            case "medium":
                                changeCardMedium();
                                break;
                            case "hard":
                                changeCardHard();
                                break;
                        }
                    }
                    //reset selection counter
                    cardSelectionCount = 0;
                    break;
            }
        } while (flag);

        //increment selection counter
        cardSelectionCount++;
    }//GEN-LAST:event_easyCard2ActionPerformed

    private void easyCard3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyCard3ActionPerformed
        // TODO add your handling code here:

        easyCard3.setIcon(cards.get(2).getCardImage());

        easyCard3.setSelected(false);

        boolean flag;

        do {

            flag = false;

            switch (cardSelectionCount) {
                case 0: //no cards selected
                    firstCard = cards.get(2);
                    break;
                case 1: //one card selected
                    secondCard = cards.get(2);
                    break;
                case 2: //redo switch after resetting selection counter
                    flag = true;

                    //check if match
                    if (mmGame.isMatch(firstCard, secondCard)) {
                        easyCard3.setSelected(true);
                    } else {
                        //reset selections
                        switch (difficulty) {
                            case "easy":
                                changeCardEasy();
                                break;
                            case "medium":
                                changeCardMedium();
                                break;
                            case "hard":
                                changeCardHard();
                                break;
                        }
                    }
                    //reset selection counter
                    cardSelectionCount = 0;
                    break;
            }
        } while (flag);

        //increment selection counter
        cardSelectionCount++;
    }//GEN-LAST:event_easyCard3ActionPerformed

    private void easyCard4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyCard4ActionPerformed
        // TODO add your handling code here:

        easyCard4.setIcon(cards.get(3).getCardImage());

        easyCard4.setSelected(false);

        boolean flag;

        do {

            flag = false;

            switch (cardSelectionCount) {
                case 0: //no cards selected
                    firstCard = cards.get(3);
                    break;
                case 1: //one card selected
                    secondCard = cards.get(3);
                    break;
                case 2: //redo switch after resetting selection counter
                    flag = true;

                    //check if match
                    if (mmGame.isMatch(firstCard, secondCard)) {
                        easyCard4.setSelected(true);
                    } else {
                        //reset selections
                        switch (difficulty) {
                            case "easy":
                                changeCardEasy();
                                break;
                            case "medium":
                                changeCardMedium();
                                break;
                            case "hard":
                                changeCardHard();
                                break;
                        }
                    }
                    //reset selection counter
                    cardSelectionCount = 0;
                    break;
            }
        } while (flag);

        //increment selection counter
        cardSelectionCount++;
    }//GEN-LAST:event_easyCard4ActionPerformed

    private void medCard5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medCard5ActionPerformed
        // TODO add your handling code here:

        medCard5.setIcon(cards.get(4).getCardImage());

        medCard5.setSelected(false);

        boolean flag;

        do {

            flag = false;

            switch (cardSelectionCount) {
                case 0: //no cards selected
                    firstCard = cards.get(4);
                    break;
                case 1: //one card selected
                    secondCard = cards.get(4);
                    break;
                case 2: //redo switch after resetting selection counter
                    flag = true;

                    //check if match
                    if (mmGame.isMatch(firstCard, secondCard)) {
                        medCard5.setSelected(true);
                    } else {
                        //reset selections
                        switch (difficulty) {
                            case "easy":
                                changeCardEasy();
                                break;
                            case "medium":
                                changeCardMedium();
                                break;
                            case "hard":
                                changeCardHard();
                                break;
                        }
                    }
                    //reset selection counter
                    cardSelectionCount = 0;
                    break;
            }
        } while (flag);

        //increment selection counter
        cardSelectionCount++;
    }//GEN-LAST:event_medCard5ActionPerformed

    private void medCard6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medCard6ActionPerformed
        // TODO add your handling code here:

        medCard6.setIcon(cards.get(5).getCardImage());

        medCard6.setSelected(false);

        boolean flag;

        do {

            flag = false;

            switch (cardSelectionCount) {
                case 0: //no cards selected
                    firstCard = cards.get(5);
                    break;
                case 1: //one card selected
                    secondCard = cards.get(5);
                    break;
                case 2: //redo switch after resetting selection counter
                    flag = true;

                    //check if match
                    if (mmGame.isMatch(firstCard, secondCard)) {
                        medCard6.setSelected(true);
                    } else {
                        //reset selections
                        switch (difficulty) {
                            case "easy":
                                changeCardEasy();
                                break;
                            case "medium":
                                changeCardMedium();
                                break;
                            case "hard":
                                changeCardHard();
                                break;
                        }
                    }
                    //reset selection counter
                    cardSelectionCount = 0;
                    break;
            }
        } while (flag);

        //increment selection counter
        cardSelectionCount++;
    }//GEN-LAST:event_medCard6ActionPerformed

    private void hardCard7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardCard7ActionPerformed
        // TODO add your handling code here:

        hardCard7.setIcon(cards.get(6).getCardImage());

        hardCard7.setSelected(false);

        boolean flag;

        do {

            flag = false;

            switch (cardSelectionCount) {
                case 0: //no cards selected
                    firstCard = cards.get(6);
                    break;
                case 1: //one card selected
                    secondCard = cards.get(6);
                    break;
                case 2: //redo switch after resetting selection counter
                    flag = true;

                    //check if match
                    if (mmGame.isMatch(firstCard, secondCard)) {
                        hardCard7.setSelected(true);
                    } else {
                        //reset selections
                        switch (difficulty) {
                            case "easy":
                                changeCardEasy();
                                break;
                            case "medium":
                                changeCardMedium();
                                break;
                            case "hard":
                                changeCardHard();
                                break;
                        }
                    }
                    //reset selection counter
                    cardSelectionCount = 0;
                    break;
            }
        } while (flag);

        //increment selection counter
        cardSelectionCount++;
    }//GEN-LAST:event_hardCard7ActionPerformed

    private void hardCard8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardCard8ActionPerformed
        // TODO add your handling code here:

        hardCard8.setIcon(cards.get(7).getCardImage());

        hardCard8.setSelected(false);

        boolean flag;

        do {

            flag = false;

            switch (cardSelectionCount) {
                case 0: //no cards selected
                    firstCard = cards.get(7);
                    break;
                case 1: //one card selected
                    secondCard = cards.get(7);
                    break;
                case 2: //redo switch after resetting selection counter
                    flag = true;

                    //check if match
                    if (mmGame.isMatch(firstCard, secondCard)) {
                        hardCard8.setSelected(true);
                    } else {
                        //reset selections
                        switch (difficulty) {
                            case "easy":
                                changeCardEasy();
                                break;
                            case "medium":
                                changeCardMedium();
                                break;
                            case "hard":
                                changeCardHard();
                                break;
                        }
                    }
                    //reset selection counter
                    cardSelectionCount = 0;
                    break;
            }
        } while (flag);

        //increment selection counter
        cardSelectionCount++;
    }//GEN-LAST:event_hardCard8ActionPerformed

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        // TODO add your handling code here:
        //reset game and cards
        mmGame = new MemoryMatch();
        cardSelectionCount = 0;

        //disable cards
        easyCard1.setEnabled(false);
        easyCard2.setEnabled(false);
        easyCard3.setEnabled(false);
        easyCard4.setEnabled(false);
        medCard5.setEnabled(false);
        medCard6.setEnabled(false);
        hardCard7.setEnabled(false);
        hardCard8.setEnabled(false);

        //enable buttons
        easyButton.setEnabled(true);
        mediumButton.setEnabled(true);
        hardButton.setEnabled(true);

        //reset toggle buttons
        easyCard1.setSelected(false);
        easyCard2.setSelected(false);
        easyCard3.setSelected(false);
        easyCard4.setSelected(false);
        medCard5.setSelected(false);
        medCard6.setSelected(false);
        hardCard7.setSelected(false);
        hardCard8.setSelected(false);
    }//GEN-LAST:event_newGameButtonActionPerformed

    public void changeCardEasy() {
        //gray out other cards
        easyCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg")));
        easyCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg")));
        easyCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg")));
        easyCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg")));
        medCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg")));
        medCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg")));
        hardCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg")));
        hardCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/blue_back.jpg")));
    }

    public void changeCardMedium() {
        //gray out other cards
        easyCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
        easyCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
        easyCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
        easyCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
        medCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
        medCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
        hardCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
        hardCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/yellow_back.jpg")));
    }

    public void changeCardHard() {
        //gray out other cards
        easyCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        easyCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        easyCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        easyCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        medCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        medCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        hardCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
        hardCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cards/red_back.jpg")));
    }

    public void checkCompletion(String difficulty, int matchesCurrent) {

        switch (difficulty) {
            case "easy":
                if (matchesCurrent == EASY_MATCHES) {

                }
                break;
            case "medium":
                if (matchesCurrent == MED_MATCHES) {

                }
                break;
            case "hard":
                if (matchesCurrent == HARD_MATCHES) {

                }
                break;
        }

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
            java.util.logging.Logger.getLogger(mmFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mmFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mmFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mmFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mmFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton easyButton;
    private javax.swing.JToggleButton easyCard1;
    private javax.swing.JToggleButton easyCard2;
    private javax.swing.JToggleButton easyCard3;
    private javax.swing.JToggleButton easyCard4;
    private javax.swing.JButton hardButton;
    private javax.swing.JToggleButton hardCard7;
    private javax.swing.JToggleButton hardCard8;
    private javax.swing.JToggleButton medCard5;
    private javax.swing.JToggleButton medCard6;
    private javax.swing.JButton mediumButton;
    private javax.swing.JButton newGameButton;
    // End of variables declaration//GEN-END:variables
}
