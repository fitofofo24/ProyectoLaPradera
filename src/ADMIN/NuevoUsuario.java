/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo
 */
public final class NuevoUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form NuevoUsuario
     */
    public NuevoUsuario() {
        initComponents();
        txt_nombre.requestFocus();

        setLocation(400, 40);
        limpiar();
        txt_email.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apelldio = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmb_perfil = new javax.swing.JComboBox();
        txt_contraseña = new javax.swing.JTextField();
        opc_email = new javax.swing.JCheckBox();
        btn_guardar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Nuevo Usuario");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS USUARIO"));

        jLabel1.setText("NOMBRE / USUARIO");

        jLabel2.setText("APELLIDOS");

        jLabel3.setText("DNI");

        jLabel4.setText("TELÉFONO");

        jLabel5.setText("DIRECCIÓN");

        jLabel6.setText("E- MAIL");

        jLabel7.setText("PASSWORD");

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_apelldio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apelldioActionPerformed(evt);
            }
        });
        txt_apelldio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apelldioKeyTyped(evt);
            }
        });

        txt_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dniActionPerformed(evt);
            }
        });
        txt_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dniKeyTyped(evt);
            }
        });

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        txt_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_direccionKeyTyped(evt);
            }
        });

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jLabel8.setText("PERFIL");

        cmb_perfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Cajero", "Mozo" }));
        cmb_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_perfilActionPerformed(evt);
            }
        });

        txt_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseñaActionPerformed(evt);
            }
        });

        opc_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc_emailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opc_email))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                        .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_apelldio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(21, 21, 21)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(txt_telefono))))
                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_apelldio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(opc_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cmb_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        comprobar();

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        if (txt_nombre.getText().trim().length() != 0) {
            txt_nombre.transferFocus();
        } else {
            JOptionPane.showMessageDialog(this, "SE REQUIERE CAMPO NOMBRE");

        }
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_apelldioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apelldioActionPerformed
        if (txt_apelldio.getText().trim().length() != 0) {
            txt_apelldio.transferFocus();

        } else {
            JOptionPane.showMessageDialog(this, "SE REQUIERE CAMPO APELLIDOS");

        }
    }//GEN-LAST:event_txt_apelldioActionPerformed

    private void txt_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dniActionPerformed
        if (txt_dni.getText().trim().length() != 0) {
            if (txt_dni.getText().trim().length() < 8) {
                JOptionPane.showMessageDialog(null, "EL DNI ES INCORRECTO");
                txt_dni.requestFocus();
            } else {
                txt_dni.transferFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "SE REQUIERE CAMPO DNI");
            txt_dni.requestFocus();
        }

    }//GEN-LAST:event_txt_dniActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        int tecla = (int) evt.getKeyChar();
        if (tecla > 47 && tecla < 58) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(this, "INGRESE SOLO LETRAS");
            txt_nombre.requestFocus();
            //txt_nombre.requestFocus();
        } else {

        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_apelldioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apelldioKeyTyped
        int tecla = (int) evt.getKeyChar();
        if (tecla > 47 && tecla < 58) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(this, "INGRESE SOLO LETRAS");
            txt_apelldio.requestFocus();
            //txt_apelldio.requestFocus();
        } else {

        }
    }//GEN-LAST:event_txt_apelldioKeyTyped

    private void txt_dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniKeyTyped
        int tecla = (int) evt.getKeyChar();
        if (tecla > 64 && tecla < 91 || tecla > 96 && tecla < 123) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(this, "INGRESE SOLO NUMEROS");
            txt_dni.requestFocus();

        } else {
            if (txt_dni.getText().trim().length() == 8) {
                evt.consume();

            }
        }
    }//GEN-LAST:event_txt_dniKeyTyped

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        if (txt_telefono.getText().trim().length() != 0) {
            if (txt_telefono.getText().trim().length() < 8) {
                JOptionPane.showMessageDialog(null, "EL DNI ES INCORRECTO");
                txt_telefono.requestFocus();
            } else {
                txt_telefono.transferFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "SE REQUIERE CAMPO DNI");
            txt_telefono.requestFocus();
        }
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        int tecla = (int) evt.getKeyChar();
        if (tecla > 64 && tecla < 91 || tecla > 96 && tecla < 123) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(this, "INGRESE SOLO NUMEROS");
            txt_telefono.requestFocus();

        } else {
            if (txt_telefono.getText().trim().length() == 9) {
                evt.consume();

            }
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        if (txt_direccion.getText().trim().length() != 0) {
            txt_direccion.transferFocus();
        } else {
            JOptionPane.showMessageDialog(this, "SE REQUIERE CAMPO DIRECCION");
            txt_direccion.requestFocus();

        }
    }//GEN-LAST:event_txt_direccionActionPerformed

    public void validarCheck() {
        if (opc_email.isSelected()) {
            txt_email.setEnabled(true);
        } else {
            txt_email.setEnabled(false);
        }
    }
    private void txt_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_direccionKeyTyped

    }//GEN-LAST:event_txt_direccionKeyTyped

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed

    }//GEN-LAST:event_txt_emailActionPerformed

    private void opc_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc_emailActionPerformed
        validarCheck();
        txt_email.requestFocus();
    }//GEN-LAST:event_opc_emailActionPerformed

    private void txt_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseñaActionPerformed
        if (txt_contraseña.getText().trim().length() != 0) {
            txt_contraseña.transferFocus();

        } else {
            JOptionPane.showMessageDialog(null, "SE REQUIERE UNA CONTRASEÑA");
        }
    }//GEN-LAST:event_txt_contraseñaActionPerformed

    private void cmb_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_perfilActionPerformed

        txt_contraseña.requestFocus();
    }//GEN-LAST:event_cmb_perfilActionPerformed

    public void comprobar() {
        if (txt_nombre.getText().trim().length() == 0 || txt_apelldio.getText().trim().length() == 0 || txt_dni.getText().trim().length() == 0 || txt_telefono.getText().trim().length() == 0 || txt_direccion.getText().trim().length() == 0 || txt_contraseña.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "SE REQUIERE COMPLETAR CAMPO(s) VACIO(s)");
        } else {
            String nombre = txt_nombre.getText();
            String ape = txt_apelldio.getText();
            int dni = Integer.parseInt(txt_dni.getText());
            int tel = Integer.parseInt(txt_telefono.getText());
            String dir = txt_direccion.getText();
            String email = txt_email.getText();
            String perfil = cmb_perfil.getSelectedItem().toString();
            String pass = txt_contraseña.getText();

            Conexion c = new Conexion();
            Connection con = c.conectar();
            String sql = "INSERT INTO tusuario(`nom_usu`, `apellidos`, `dni`, `telefono`, `direccion`, `email`, `pass_usu`, `perfil`)"
                    + "VALUES ('" + nombre + "','" + ape + "'," + dni + "," + tel + ",'" + dir + "','" + email + "','" + pass + "','" + perfil + "')";
            try {
                Statement st = con.createStatement();
                int res = st.executeUpdate(sql);

                if (res > 0) {
                    int seleccion = JOptionPane.showOptionDialog(btn_guardar, "Usuario registrado, ¿desea registrar otro usuario?", "showOptionDialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No", "Cancelar"}, "Si");
                    if (seleccion == 0) {
                        limpiar();
                    } else if (seleccion == 1) {
                        this.dispose();
                    }
                }
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

        }
    }

    public void limpiar() {
        txt_nombre.setText("");
        txt_apelldio.setText("");
        txt_dni.setText("");
        txt_telefono.setText("");
        txt_direccion.setText("");
        txt_email.setText("");
        txt_contraseña.setText("");
        txt_nombre.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox cmb_perfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox opc_email;
    private javax.swing.JTextField txt_apelldio;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
