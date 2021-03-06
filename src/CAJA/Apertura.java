
package CAJA;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo
 */
public final class Apertura extends javax.swing.JInternalFrame implements Runnable{
    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;

    /**
     * Creates new form Apertura
     */
    public Apertura() {
        initComponents();        
        setLocation(400, 200);        
        java.util.Date fecha = new java.util.Date();
        lbl_fecha.setText(fecha.toString());
        calcular();
        h1 = new Thread(this);
        h1.start();
        setVisible(true);
        
    }
    
    public void calcular() {
        calendario = new GregorianCalendar();
        java.util.Date fechaHoraActual = new java.util.Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    public String obtener_hora() {
        String hora = "";
        calcular();
        hora = (this.hora + ":" + minutos + ":" + segundos + " " + ampm);
        return hora;
    }

    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcular();
            lbl_hora.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
    
    public void registrarApertura(){
        double a = Double.parseDouble(txt_apertura.getText());       
        String sql = "INSERT INTO tflujo_caja(monto_ini) VALUES ('"+a+"')";
        Conexion con = new Conexion();
        Connection cn = con.conectar();
        try {
            Statement st = cn.createStatement();
            int rs = st.executeUpdate(sql);
            if (rs>0) {
                JOptionPane.showMessageDialog(null, "Apertura registrada"); 
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Error de conexion");
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_hora = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();
        txt_apertura = new javax.swing.JTextField();
        btn_abrir = new javax.swing.JButton();
        lbl_salir = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_hora.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hora.setText("Hora:xx:xx");
        getContentPane().add(lbl_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        lbl_fecha.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fecha.setText("Fecha:xx/xx/xx");
        getContentPane().add(lbl_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));
        getContentPane().add(txt_apertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 190, 30));

        btn_abrir.setText("Abrir caja");
        btn_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        lbl_salir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_salir.setForeground(new java.awt.Color(255, 255, 255));
        lbl_salir.setText("Salir");
        lbl_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_salirMouseClicked(evt);
            }
        });
        lbl_salir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl_salirKeyPressed(evt);
            }
        });
        getContentPane().add(lbl_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 40, 20));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/abrirCaja.png"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirActionPerformed
        registrarApertura();
    }//GEN-LAST:event_btn_abrirActionPerformed

    private void lbl_salirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_salirKeyPressed
        
    }//GEN-LAST:event_lbl_salirKeyPressed

    private void lbl_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseClicked
        this.dispose();
    }//GEN-LAST:event_lbl_salirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrir;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_salir;
    private javax.swing.JTextField txt_apertura;
    // End of variables declaration//GEN-END:variables
}
