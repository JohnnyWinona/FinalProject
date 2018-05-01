/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
package FramePackage;

import GamePackage.Blackjack;
import MainPackage.Card;
import MainPackage.Menu;
import java.util.*;
import javax.swing.ImageIcon;

public class bjFrame extends javax.swing.JFrame {

    /**
     * Creates new form bjFrame
     */
    public bjFrame() {
        initComponents();
    }

    //create black jack game object
    Blackjack bjGame = new Blackjack();

    //hand lists
    List<Card> houseHand = new ArrayList<>();
    List<Card> oneHand = new ArrayList<>();
    List<Card> twoHand = new ArrayList<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        onePanel = new javax.swing.JPanel();
        oneLabel = new javax.swing.JLabel();
        one1Label = new javax.swing.JLabel();
        one3Label = new javax.swing.JLabel();
        one4Label = new javax.swing.JLabel();
        one5Label = new javax.swing.JLabel();
        one2Label = new javax.swing.JLabel();
        oneStandButton = new javax.swing.JButton();
        oneHitButton = new javax.swing.JButton();
        oneSumLabel = new javax.swing.JLabel();
        oneSumField = new javax.swing.JTextField();
        twoPanel = new javax.swing.JPanel();
        twoLabel = new javax.swing.JLabel();
        two1Label = new javax.swing.JLabel();
        two2Label = new javax.swing.JLabel();
        two3Label = new javax.swing.JLabel();
        two4Label = new javax.swing.JLabel();
        two5Label = new javax.swing.JLabel();
        twoStandButton = new javax.swing.JButton();
        twoHitButton = new javax.swing.JButton();
        twoSumLabel = new javax.swing.JLabel();
        twoSumField = new javax.swing.JTextField();
        housePanel = new javax.swing.JPanel();
        houseLabel = new javax.swing.JLabel();
        house1Label = new javax.swing.JLabel();
        house2Label = new javax.swing.JLabel();
        house3Label = new javax.swing.JLabel();
        house4Label = new javax.swing.JLabel();
        house5Label = new javax.swing.JLabel();
        dealButton = new javax.swing.JButton();
        checkWinnerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Blackjack");

        onePanel.setBackground(new java.awt.Color(0, 102, 0));

        oneLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        oneLabel.setForeground(new java.awt.Color(255, 255, 255));
        oneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oneLabel.setText("Player One");

        one1Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        one3Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        one4Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        one5Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        one2Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        oneStandButton.setText("Stand");
        oneStandButton.setEnabled(false);
        oneStandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneStandButtonActionPerformed(evt);
            }
        });

        oneHitButton.setText("Hit");
        oneHitButton.setEnabled(false);
        oneHitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneHitButtonActionPerformed(evt);
            }
        });

        oneSumLabel.setForeground(new java.awt.Color(255, 255, 255));
        oneSumLabel.setText("Sum: ");

        oneSumField.setText("<SUM>");

        javax.swing.GroupLayout onePanelLayout = new javax.swing.GroupLayout(onePanel);
        onePanel.setLayout(onePanelLayout);
        onePanelLayout.setHorizontalGroup(
            onePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(onePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(onePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(one1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(one2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(one3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(one4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(one5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(oneSumLabel)
                        .addGap(18, 18, 18)
                        .addGroup(onePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oneSumField)
                            .addComponent(oneStandButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oneHitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        onePanelLayout.setVerticalGroup(
            onePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(onePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(one1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(one4Label, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(one5Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(one2Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addGroup(onePanelLayout.createSequentialGroup()
                        .addGroup(onePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneSumLabel)
                            .addComponent(oneSumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oneHitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oneStandButton))
                    .addComponent(one3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        twoPanel.setBackground(new java.awt.Color(0, 102, 0));

        twoLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        twoLabel.setForeground(new java.awt.Color(255, 255, 255));
        twoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twoLabel.setText("Player Two");

        two1Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        two2Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        two3Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        two4Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        two5Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        twoStandButton.setText("Stand");
        twoStandButton.setEnabled(false);
        twoStandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoStandButtonActionPerformed(evt);
            }
        });

        twoHitButton.setText("Hit");
        twoHitButton.setEnabled(false);
        twoHitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoHitButtonActionPerformed(evt);
            }
        });

        twoSumLabel.setForeground(new java.awt.Color(255, 255, 255));
        twoSumLabel.setText("Sum: ");

        twoSumField.setText("<SUM>");

        javax.swing.GroupLayout twoPanelLayout = new javax.swing.GroupLayout(twoPanel);
        twoPanel.setLayout(twoPanelLayout);
        twoPanelLayout.setHorizontalGroup(
            twoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(twoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(twoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(twoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(twoPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(two1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(two2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(two3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(two4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(two5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(twoSumLabel)
                        .addGap(18, 18, 18)
                        .addGroup(twoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(twoHitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(twoSumField)
                            .addComponent(twoStandButton, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                .addContainerGap())
        );
        twoPanelLayout.setVerticalGroup(
            twoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(twoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(twoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(twoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(two1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(two3Label, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(two4Label, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(two5Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(two2Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addGroup(twoPanelLayout.createSequentialGroup()
                        .addGroup(twoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twoSumLabel)
                            .addComponent(twoSumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(twoHitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoStandButton)))
                .addContainerGap())
        );

        housePanel.setBackground(new java.awt.Color(0, 102, 0));

        houseLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        houseLabel.setForeground(new java.awt.Color(255, 255, 255));
        houseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        houseLabel.setText("House Hand");

        house1Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        house2Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        house3Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        house4Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        house5Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));

        javax.swing.GroupLayout housePanelLayout = new javax.swing.GroupLayout(housePanel);
        housePanel.setLayout(housePanelLayout);
        housePanelLayout.setHorizontalGroup(
            housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(housePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(housePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(house1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(house2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(house3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(house4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(house5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(housePanelLayout.createSequentialGroup()
                        .addComponent(houseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        housePanelLayout.setVerticalGroup(
            housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(housePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(houseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(house1Label, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(house2Label, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(house4Label, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(house5Label, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(house3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        dealButton.setText("Deal");
        dealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealButtonActionPerformed(evt);
            }
        });

        checkWinnerButton.setText("Check Winner");
        checkWinnerButton.setEnabled(false);
        checkWinnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkWinnerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(housePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkWinnerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(dealButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(twoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(dealButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkWinnerButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(housePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(twoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Deal Button
     *
     * @require The user clicks the deal button.
     * @ensure Hands are drawn for the house and two players.
     */
    private void dealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealButtonActionPerformed
        // TODO add your handling code here:
        Blackjack bjGame = new Blackjack();

        oneHitButton.setEnabled(true);
        oneStandButton.setEnabled(true);
        dealButton.setEnabled(false);

        houseHand.clear();
        oneHand.clear();
        twoHand.clear();

        try {
            one1Label.setIcon(null);
            one2Label.setIcon(null);
            one3Label.setIcon(null);
            one4Label.setIcon(null);
            one5Label.setIcon(null);

            two1Label.setIcon(null);
            two2Label.setIcon(null);
            two3Label.setIcon(null);
            two4Label.setIcon(null);
            two5Label.setIcon(null);

            house1Label.setIcon(null);
            house2Label.setIcon(null);
            house3Label.setIcon(null);
            house4Label.setIcon(null);
            house5Label.setIcon(null);
        } catch (Exception e) {
        }

        houseHand = bjGame.generateHand();
        oneHand = bjGame.generateHand();
        twoHand = bjGame.generateHand();

        oneSumField.setText("" + bjGame.getSum(oneHand));
        twoSumField.setText("" + bjGame.getSum(twoHand));

        one1Label.setIcon(oneHand.get(0).getCardImage());
        one2Label.setIcon(oneHand.get(1).getCardImage());

        two1Label.setIcon(twoHand.get(0).getCardImage());
        two2Label.setIcon(twoHand.get(1).getCardImage());

        house1Label.setIcon(houseHand.get(0).getCardImage());
        ImageIcon image = new ImageIcon(getClass().getResource("/cards/red_back.jpg"));
        house2Label.setIcon(image);

    }//GEN-LAST:event_dealButtonActionPerformed
    /**
     * Check Winner Button
     *
     * @require The user clicks the check winner button.
     * @ensure Hands are compared against the house to determine winner.
     */
    private void checkWinnerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkWinnerButtonActionPerformed
        // TODO add your handling code here:
        while (bjGame.getSum(houseHand) <= 17) {
            houseHand.add(bjGame.hit());
        }
        try {
            house2Label.setIcon(houseHand.get(1).getCardImage());
            house3Label.setIcon(houseHand.get(2).getCardImage());
            house4Label.setIcon(houseHand.get(3).getCardImage());
            house5Label.setIcon(houseHand.get(4).getCardImage());
        } catch (Exception e) {
        }

        //stats only apply to the first hand
        switch (bjGame.checkWinner(oneHand, houseHand)) {
            case 1:
                oneSumField.setText("WINNER: " + bjGame.getSum(oneHand));
                int bjWinsTemp = Menu.player.getBjWins();
                bjWinsTemp++;
                Menu.player.setBjWins(bjWinsTemp);
                //increment funds
                Menu.player.setFunds(Menu.player.getFunds() + 15);
                break;
            case 0:
                oneSumField.setText("TIE: " + bjGame.getSum(oneHand));
                //increment funds
                Menu.player.setFunds(Menu.player.getFunds() + 10);
                break;
            case -1:
                oneSumField.setText("LOSER: " + bjGame.getSum(oneHand));
                int bjLossesTemp = Menu.player.getBjLosses();
                bjLossesTemp++;
                Menu.player.setBjLosses(bjLossesTemp);
                //increment funds
                Menu.player.setFunds(Menu.player.getFunds() + 5);
                break;
            default:
                oneSumField.setText("BROKE: " + bjGame.getSum(oneHand));
                break;
        }
        switch (bjGame.checkWinner(twoHand, houseHand)) {
            case 1:
                twoSumField.setText("WINNER: " + bjGame.getSum(twoHand));
                break;
            case 0:
                twoSumField.setText("TIE: " + bjGame.getSum(twoHand));
                break;
            case -1:
                twoSumField.setText("LOSER: " + bjGame.getSum(twoHand));
                break;
            default:
                twoSumField.setText("BROKE: " + bjGame.getSum(twoHand));
                break;
        }

        checkWinnerButton.setEnabled(false);
        dealButton.setEnabled(true);
    }//GEN-LAST:event_checkWinnerButtonActionPerformed
    /**
     * One Hit Button
     *
     * @require The user clicks the one hit button.
     * @ensure The first hand is hit.
     */
    private void oneHitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneHitButtonActionPerformed
        // TODO add your handling code here:
        oneHand.add(bjGame.hit());
        try {
            one3Label.setIcon(oneHand.get(2).getCardImage());
            one4Label.setIcon(oneHand.get(3).getCardImage());
            one5Label.setIcon(oneHand.get(4).getCardImage());
        } catch (Exception e) {
        }
        if (bjGame.getSum(oneHand) > 21) {
            oneHitButton.setEnabled(false);
            oneSumField.setText("BUST: " + bjGame.getSum(oneHand));
        } else {
            oneSumField.setText("" + bjGame.getSum(oneHand));
        }
    }//GEN-LAST:event_oneHitButtonActionPerformed
    /**
     * One Stand Button
     *
     * @require The user clicks the one stand button.
     * @ensure The first hand stands.
     */
    private void oneStandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneStandButtonActionPerformed
        // TODO add your handling code here:
        twoHitButton.setEnabled(true);
        twoStandButton.setEnabled(true);
        oneStandButton.setEnabled(false);
        oneHitButton.setEnabled(false);
    }//GEN-LAST:event_oneStandButtonActionPerformed
    /**
     * Two Hit Button
     *
     * @require The user clicks the two hit button.
     * @ensure The second hand is hit.
     */
    private void twoHitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoHitButtonActionPerformed
        // TODO add your handling code here:
        twoHand.add(bjGame.hit());
        try {
            two3Label.setIcon(twoHand.get(2).getCardImage());
            two4Label.setIcon(twoHand.get(3).getCardImage());
            two5Label.setIcon(twoHand.get(4).getCardImage());
        } catch (Exception e) {
        }
        if (bjGame.getSum(twoHand) > 21) {
            twoHitButton.setEnabled(false);
            twoSumField.setText("BUST: " + bjGame.getSum(twoHand));
        } else {

            twoSumField.setText("" + bjGame.getSum(twoHand));
        }
    }//GEN-LAST:event_twoHitButtonActionPerformed
    /**
     * Two Stand Button
     *
     * @require The user clicks the two stand button.
     * @ensure The second hand stands.
     */
    private void twoStandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoStandButtonActionPerformed
        // TODO add your handling code here:
        twoHitButton.setEnabled(false);
        twoStandButton.setEnabled(false);
        checkWinnerButton.setEnabled(true);

    }//GEN-LAST:event_twoStandButtonActionPerformed

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
            java.util.logging.Logger.getLogger(bjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new bjFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkWinnerButton;
    private javax.swing.JButton dealButton;
    private javax.swing.JLabel house1Label;
    private javax.swing.JLabel house2Label;
    private javax.swing.JLabel house3Label;
    private javax.swing.JLabel house4Label;
    private javax.swing.JLabel house5Label;
    private javax.swing.JLabel houseLabel;
    private javax.swing.JPanel housePanel;
    private javax.swing.JLabel one1Label;
    private javax.swing.JLabel one2Label;
    private javax.swing.JLabel one3Label;
    private javax.swing.JLabel one4Label;
    private javax.swing.JLabel one5Label;
    private javax.swing.JButton oneHitButton;
    private javax.swing.JLabel oneLabel;
    private javax.swing.JPanel onePanel;
    private javax.swing.JButton oneStandButton;
    private javax.swing.JTextField oneSumField;
    private javax.swing.JLabel oneSumLabel;
    private javax.swing.JLabel two1Label;
    private javax.swing.JLabel two2Label;
    private javax.swing.JLabel two3Label;
    private javax.swing.JLabel two4Label;
    private javax.swing.JLabel two5Label;
    private javax.swing.JButton twoHitButton;
    private javax.swing.JLabel twoLabel;
    private javax.swing.JPanel twoPanel;
    private javax.swing.JButton twoStandButton;
    private javax.swing.JTextField twoSumField;
    private javax.swing.JLabel twoSumLabel;
    // End of variables declaration//GEN-END:variables
}
