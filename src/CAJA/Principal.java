/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAJA;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adolfo
 */
public final class Principal extends javax.swing.JInternalFrame {
    DefaultTableModel model;
    DefaultListModel lista;
    
    public Principal() {
        initComponents();
        setLocation(250,100);
        lista = new DefaultListModel();
        llenar();
        
        String[] cabecera = {"MESA N°","MOZO","PEDIDO","P.UNITARIO","CANTIDAD","SUB TOTAL"};
        model = new DefaultTableModel(cabecera, WIDTH);
        tbl_pedidos.setModel(model);
        
    }

   public void llenar(){
       
        String datos[]= new String[4];
        Conexion cn = new Conexion();
        Connection cc = cn.conectar();
        String sql = "SELECT idpedido FROM tpedido ORDER BY idpedido";
        try {
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0]= rs.getString(1);
                lista.addElement("Pedido N°: "+datos[0]);
                lst_mesas_a_cobrar.setModel(lista);
            }            
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pedidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_mesas_a_cobrar = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lbl_prueba = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Caja");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de Pedido"));

        tbl_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_pedidos);

        jLabel1.setText("TOTAL A PAGAR");

        lbl_total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_total.setText(".....");

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.setText("Cobrar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jButton7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de pedidos"));

        lst_mesas_a_cobrar.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lst_mesas_a_cobrar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lst_mesas_a_cobrarValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lst_mesas_a_cobrar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jButton1.setText("Menú del día ");

        jButton6.setText("SALIR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        lbl_prueba.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_prueba)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)
                        .addGap(181, 181, 181)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(lbl_prueba)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lst_mesas_a_cobrarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lst_mesas_a_cobrarValueChanged
        while(model.getRowCount()>0)model.removeRow(0);
        int ind = lst_mesas_a_cobrar.getSelectedIndex()+1;
        String datos[] = new String[6];
        Conexion con = new Conexion();
        Connection cc = con.conectar();
        String sql = "SELECT num_mesa, nom_mozo, nom_plato_beb, prec_uni,cantidad,sub_total FROM tmesa INNER JOIN tmozo ON tmesa.idmozo = tmozo.idmozo\n" +
                        "INNER JOIN tpedido ON tpedido.idmesa = tmesa.idmesa\n" +
                        "INNER JOIN tdetallepedido ON tdetallepedido.idpedido = tpedido.idpedido\n" +
                        "INNER JOIN tplato_bebida ON tplato_bebida.idplato_bebida = tdetallepedido.idplato_bebida where tpedido.idpedido='"+ind+"'";
        try {
            Statement st = cc.createStatement();
            ResultSet rs  = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("num_mesa");
                datos[1] = rs.getString("nom_mozo");
                datos[2] = rs.getString("nom_plato_beb");
                datos[3] = rs.getString("prec_uni");
                datos[4] = rs.getString("cantidad");
                datos[5] = rs.getString("sub_total");
                model.addRow(datos);
                tbl_pedidos.setModel(model);
                lbl_prueba.setText(""+ind);
            }
            lbl_total.setText("S/. "+montoTotal());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, ""+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_lst_mesas_a_cobrarValueChanged

    public int montoTotal(){
        int ind = lst_mesas_a_cobrar.getSelectedIndex() + 1;
        String sql = "SELECT SUM(tdetallepedido.sub_total) from tplato_bebida \n"
                + "INNER JOIN tdetallepedido ON tplato_bebida.idplato_bebida=tdetallepedido.idplato_bebida\n"
                + "INNER JOIN tpedido ON tpedido.idpedido = tdetallepedido.idpedido\n"
                + "WHERE tpedido.idpedido = " + ind + "";
        int total = 0;
        Conexion cc = new Conexion();
        Connection con = cc.conectar();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                total = rs.getInt(1);
            }
        } catch (Exception e) {
        }

        return total;
    }
    
    
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_prueba;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JList lst_mesas_a_cobrar;
    private javax.swing.JTable tbl_pedidos;
    // End of variables declaration//GEN-END:variables
}
