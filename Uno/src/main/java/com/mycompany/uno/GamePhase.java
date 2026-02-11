package com.mycompany.uno;

import com.mycompany.uno.Game.InvalidPlayerTurnException;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author aemre
 */
public class GamePhase extends javax.swing.JFrame {
    
    private SavingPlayers addPlayers = new SavingPlayers();
    ArrayList <String> names1 = new ArrayList<>();
    String[] pnames;
    Game game;
    ArrayList<JButton> buttonOfCards = new ArrayList<JButton>();
    ArrayList<String> namesOfCard;
    Window tab;
    
    public GamePhase(){
    }
    
    public GamePhase(ArrayList<String> playerIds) {
        initComponents();
        names1 = playerIds;
        pnames = names1.toArray(new String[names1.size()]);
        game = new Game(pnames);
        populateArrayList();
        game.start(game);
        setPidName();
        cardButtonOnTop.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Masaüstü\\images\\PNGs\\small\\" + game.cardOnTopImage()));
        setIconsofButtons();
        
    }   

    public void setIconsofButtons() {
        String list = game.getHandOnPlayer(game.getCurrentPlayer()).stream().map(Object::toString).collect(Collectors.joining(","));
        String[] cardNames = list.split(",");
        namesOfCard = new ArrayList<>(Arrays.asList(cardNames));
        for(int i = 0; i < namesOfCard.size(); i++){
            buttonOfCards.get(i).setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Masaüstü\\images\\PNGs\\small\\" + namesOfCard.get(i) + ".png"));
        }
        
        for (int i = namesOfCard.size(); i < buttonOfCards.size(); i++){
            buttonOfCards.get(i).setIcon(null); //sets all teh card icons to null
        }
    }
        
                
        public void setName(String currentPlayer){
            pidNameLabel.setText(currentPlayer + "s Cards");    
        }    
        
        public void setPidName(){
            String currentPlayer = game.getCurrentPlayer();
            pidNameLabel.setText(currentPlayer + "s Cards");
        }

    public void populateArrayList(){
         buttonOfCards.add(jButton1);
         buttonOfCards.add(jButton2);
         buttonOfCards.add(jButton3);
         buttonOfCards.add(jButton4);
         buttonOfCards.add(jButton5);
         buttonOfCards.add(jButton6);
         buttonOfCards.add(jButton7);
         buttonOfCards.add(jButton8);
         buttonOfCards.add(jButton9);
         buttonOfCards.add(jButton10);
         buttonOfCards.add(jButton11);
         buttonOfCards.add(jButton12);
         buttonOfCards.add(jButton13);
         buttonOfCards.add(jButton14);
         buttonOfCards.add(jButton15);
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        pidNameLabel = new javax.swing.JLabel();
        downCard = new javax.swing.JButton();
        cardButtonOnTop = new javax.swing.JButton();
        drawCardButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Uno");
        setSize(new java.awt.Dimension(1928, 1086));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1928, 1086));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(0, 255, 204));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setForeground(new java.awt.Color(0, 255, 204));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setForeground(new java.awt.Color(0, 255, 204));
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setForeground(new java.awt.Color(0, 255, 204));
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setForeground(new java.awt.Color(0, 255, 204));
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setForeground(new java.awt.Color(0, 255, 204));
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setForeground(new java.awt.Color(0, 255, 204));
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 102, 102));
        jButton8.setForeground(new java.awt.Color(0, 255, 204));
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 102, 102));
        jButton10.setForeground(new java.awt.Color(0, 255, 204));
        jButton10.setBorderPainted(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 102, 102));
        jButton9.setForeground(new java.awt.Color(0, 255, 204));
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 102, 102));
        jButton12.setForeground(new java.awt.Color(0, 255, 204));
        jButton12.setBorderPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 102, 102));
        jButton11.setForeground(new java.awt.Color(0, 255, 204));
        jButton11.setBorderPainted(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 102, 102));
        jButton13.setForeground(new java.awt.Color(0, 255, 204));
        jButton13.setBorderPainted(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 102, 102));
        jButton14.setForeground(new java.awt.Color(0, 255, 204));
        jButton14.setBorderPainted(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 102, 102));
        jButton15.setForeground(new java.awt.Color(0, 255, 204));
        jButton15.setBorderPainted(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        pidNameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        pidNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        pidNameLabel.setText("beldag's cards");

        downCard.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Masaüstü\\images\\PNGs\\small\\card_back.png")); // NOI18N
        downCard.setText("jButton16");
        downCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downCardActionPerformed(evt);
            }
        });

        cardButtonOnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardButtonOnTopActionPerformed(evt);
            }
        });

        drawCardButton.setBackground(new java.awt.Color(0, 102, 102));
        drawCardButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        drawCardButton.setForeground(new java.awt.Color(0, 0, 0));
        drawCardButton.setText("Draw Card");
        drawCardButton.setBorder(null);
        drawCardButton.setBorderPainted(false);
        drawCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawCardButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pidNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(downCard, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(cardButtonOnTop, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)))
                        .addComponent(drawCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(downCard, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardButtonOnTop, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(202, 202, 202)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pidNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drawCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(301, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1934, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drawCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawCardButtonActionPerformed
        JLabel message = new JLabel(game.getCurrentPlayer() + " drew a card! ");
        message.setFont(new Font("Arial", Font.BOLD, 48));
        JOptionPane.showMessageDialog(null,message);
        try {
            game.submitDraw(game.getCurrentPlayer());
        }
        catch (InvalidPlayerTurnException ex) {
            Logger.getLogger(GamePhase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.setName(game.getCurrentPlayer());
        this.setIconsofButtons();
    }//GEN-LAST:event_drawCardButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(namesOfCard.get(0)!= null){
            int index = 0;
            String cardId = namesOfCard.get(0);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(namesOfCard.get(1)!= null){
            int index = 1;
            String cardId = namesOfCard.get(1);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(namesOfCard.get(2)!= null){
            int index = 2;
            String cardId = namesOfCard.get(2);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton3ActionPerformed
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(namesOfCard.get(3)!= null){
            int index = 3;
            String cardId = namesOfCard.get(3);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton4ActionPerformed
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(namesOfCard.get(4)!= null){
            int index = 4;
            String cardId = namesOfCard.get(4);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton5ActionPerformed
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(namesOfCard.get(5)!= null){
            int index = 5;
            String cardId = namesOfCard.get(5);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton6ActionPerformed
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(namesOfCard.get(6)!= null){
            int index = 6;
            String cardId = namesOfCard.get(6);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton7ActionPerformed
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(namesOfCard.get(7)!= null){
            int index = 7;
            String cardId = namesOfCard.get(7);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(namesOfCard.get(8)!= null){
            int index = 8;
            String cardId = namesOfCard.get(8);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(namesOfCard.get(9)!= null){
            int index = 9;
            String cardId = namesOfCard.get(9);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(namesOfCard.get(10)!= null){
            int index = 10;
            String cardId = namesOfCard.get(10);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(namesOfCard.get(11)!= null){
            int index = 11;
            String cardId = namesOfCard.get(11);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(namesOfCard.get(12)!= null){
            int index = 12;
            String cardId = namesOfCard.get(12);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if(namesOfCard.get(13)!= null){
            int index = 13;
            String cardId = namesOfCard.get(13);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(namesOfCard.get(14)!= null){
            int index = 14;
            String cardId = namesOfCard.get(14);
            tab = new Window(cardId, game, index, buttonOfCards, this, cardButtonOnTop);
            tab.setBounds(750,40,700,800);
            tab.setVisible(true);
            tab.setResizable(false);
            tab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void downCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downCardActionPerformed

    private void cardButtonOnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardButtonOnTopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardButtonOnTopActionPerformed

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
            java.util.logging.Logger.getLogger(GamePhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePhase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cardButtonOnTop;
    private javax.swing.JButton downCard;
    private javax.swing.JButton drawCardButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pidNameLabel;
    // End of variables declaration//GEN-END:variables
}
