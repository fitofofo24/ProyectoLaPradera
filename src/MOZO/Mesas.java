/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOZO;

/**
 *
 * @author Adolfo
 */
public class Mesas extends javax.swing.JFrame {

    int est;
    
    public Mesas() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_10 = new javax.swing.JButton();
        btn_11 = new javax.swing.JButton();
        btn_12 = new javax.swing.JButton();
        btn_13 = new javax.swing.JButton();
        btn_14 = new javax.swing.JButton();
        btn_15 = new javax.swing.JButton();
        btn_16 = new javax.swing.JButton();
        btn_17 = new javax.swing.JButton();
        btn_18 = new javax.swing.JButton();
        btn_19 = new javax.swing.JButton();
        btn_20 = new javax.swing.JButton();
        btn_21 = new javax.swing.JButton();
        btn_22 = new javax.swing.JButton();
        btn_23 = new javax.swing.JButton();
        btn_24 = new javax.swing.JButton();
        btn_25 = new javax.swing.JButton();
        btn_26 = new javax.swing.JButton();
        btn_27 = new javax.swing.JButton();
        btn_28 = new javax.swing.JButton();
        btn_29 = new javax.swing.JButton();
        btn_30 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_estado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_10.setText("10");
        btn_10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_10ActionPerformed(evt);
            }
        });

        btn_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_11.setText("11");
        btn_11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_11ActionPerformed(evt);
            }
        });

        btn_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_12.setText("12");
        btn_12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_12ActionPerformed(evt);
            }
        });

        btn_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_13.setText("13");
        btn_13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_13ActionPerformed(evt);
            }
        });

        btn_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_14.setText("14");
        btn_14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_14ActionPerformed(evt);
            }
        });

        btn_15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_15.setText("15");
        btn_15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_15ActionPerformed(evt);
            }
        });

        btn_16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_16.setText("16");
        btn_16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_16ActionPerformed(evt);
            }
        });

        btn_17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_17.setText("17");
        btn_17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_17ActionPerformed(evt);
            }
        });

        btn_18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_18.setText("18");
        btn_18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_18ActionPerformed(evt);
            }
        });

        btn_19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_19.setText("19");
        btn_19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_19ActionPerformed(evt);
            }
        });

        btn_20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_20.setText("20");
        btn_20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_20ActionPerformed(evt);
            }
        });

        btn_21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_21.setText("21");
        btn_21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_21ActionPerformed(evt);
            }
        });

        btn_22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_22.setText("22");
        btn_22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_22ActionPerformed(evt);
            }
        });

        btn_23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_23.setText("23");
        btn_23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_23ActionPerformed(evt);
            }
        });

        btn_24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_24.setText("24");
        btn_24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_24ActionPerformed(evt);
            }
        });

        btn_25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_25.setText("25");
        btn_25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_25ActionPerformed(evt);
            }
        });

        btn_26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_26.setText("26");
        btn_26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_26ActionPerformed(evt);
            }
        });

        btn_27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_27.setText("27");
        btn_27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_27ActionPerformed(evt);
            }
        });

        btn_28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_28.setText("28");
        btn_28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_28ActionPerformed(evt);
            }
        });

        btn_29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_29.setText("29");
        btn_29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_29ActionPerformed(evt);
            }
        });

        btn_30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mesa.png"))); // NOI18N
        btn_30.setText("30");
        btn_30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_30ActionPerformed(evt);
            }
        });

        jLabel1.setText("ESTADO:");

        lbl_estado.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_estado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_28, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_estado))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_1.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_2.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_3.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_4.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_5.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_6.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
       Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_7.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_8.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_9.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_10ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_10.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_10ActionPerformed

    private void btn_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_11ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_11.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_11ActionPerformed

    private void btn_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_12ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_12.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_12ActionPerformed

    private void btn_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_13ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_13.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_13ActionPerformed

    private void btn_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_14ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_14.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_14ActionPerformed

    private void btn_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_15ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_15.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_15ActionPerformed

    private void btn_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_16ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_16.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_16ActionPerformed

    private void btn_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_17ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_17.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_17ActionPerformed

    private void btn_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_18ActionPerformed
       Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_18.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_18ActionPerformed

    private void btn_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_19ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_19.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_19ActionPerformed

    private void btn_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_20ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_20.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_20ActionPerformed

    private void btn_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_21ActionPerformed
       Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_21.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_21ActionPerformed

    private void btn_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_22ActionPerformed
       Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_22.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_22ActionPerformed

    private void btn_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_23ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_23.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_23ActionPerformed

    private void btn_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_24ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_24.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_24ActionPerformed

    private void btn_25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_25ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_25.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_25ActionPerformed

    private void btn_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_26ActionPerformed
       Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_26.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_26ActionPerformed

    private void btn_27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_27ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_27.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_27ActionPerformed

    private void btn_28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_28ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_28.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_28ActionPerformed

    private void btn_29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_29ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_29.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_29ActionPerformed

    private void btn_30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_30ActionPerformed
        Pedidos pe = new Pedidos();
        Pedidos.lbl_mesa.setText(btn_30.getText());
        pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_30ActionPerformed

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
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_1;
    public javax.swing.JButton btn_10;
    public javax.swing.JButton btn_11;
    public javax.swing.JButton btn_12;
    public javax.swing.JButton btn_13;
    public javax.swing.JButton btn_14;
    public javax.swing.JButton btn_15;
    public javax.swing.JButton btn_16;
    public javax.swing.JButton btn_17;
    public javax.swing.JButton btn_18;
    public javax.swing.JButton btn_19;
    public javax.swing.JButton btn_2;
    public javax.swing.JButton btn_20;
    public javax.swing.JButton btn_21;
    public javax.swing.JButton btn_22;
    public javax.swing.JButton btn_23;
    public javax.swing.JButton btn_24;
    public javax.swing.JButton btn_25;
    public javax.swing.JButton btn_26;
    public javax.swing.JButton btn_27;
    public javax.swing.JButton btn_28;
    public javax.swing.JButton btn_29;
    public javax.swing.JButton btn_3;
    public javax.swing.JButton btn_30;
    public javax.swing.JButton btn_4;
    public javax.swing.JButton btn_5;
    public javax.swing.JButton btn_6;
    public javax.swing.JButton btn_7;
    public javax.swing.JButton btn_8;
    public javax.swing.JButton btn_9;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel lbl_estado;
    // End of variables declaration//GEN-END:variables
}
