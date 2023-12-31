/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyFinalAtencionResto.Vistas;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyFinalAtencionResto.AccesoADatos.MesaData;
import proyFinalAtencionResto.AccesoADatos.MeseroData;
import proyFinalAtencionResto.AccesoADatos.PedidoData;
import proyFinalAtencionResto.Entidades.Mesa;
import proyFinalAtencionResto.Entidades.Mesero;
import proyFinalAtencionResto.Entidades.Pedido;

/**
 *
 * @author Asus
 */
public class ListaPedidosMesaFecha extends javax.swing.JInternalFrame {

    
    DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form ListaPedidosMesaFecha
     */
    public ListaPedidosMesaFecha() throws SQLException {
        initComponents();
        cargarCombo();
        armarCabecera();
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
        jcbMesa = new javax.swing.JComboBox<>();
        jdcFecha1 = new com.toedter.calendar.JDateChooser();
        jdcFecha2 = new com.toedter.calendar.JDateChooser();
        jbCargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedidos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("LISTA DE PEDIDOS POR MESA Y FECHA");

        jbCargar.setText("Cargar");
        jbCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarActionPerformed(evt);
            }
        });

        jtPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtPedidos);

        jButton1.setText("Nueva consulta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Mesa");

        jLabel2.setText("Fecha1");

        jLabel3.setText("Fecha2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(363, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jdcFecha2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                        .addComponent(jdcFecha1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbCargar))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(59, 59, 59)
                            .addComponent(jButton2)
                            .addGap(73, 73, 73)))
                    .addContainerGap(59, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(324, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jcbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jdcFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jdcFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(38, 38, 38)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarActionPerformed
        // TODO add your handling code here:
        if (jdcFecha1.getDate() != null && jdcFecha2 != null) {
            LocalDate localdate1 = jdcFecha1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate localdate2 = jdcFecha2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String fecha1 = localdate1.getYear()+""+"-"+localdate1.getMonthValue()+""+"-"+localdate1.getDayOfMonth()+"";
            String fecha2 = localdate2.getYear()+""+"-"+localdate2.getMonthValue()+""+"-"+localdate2.getDayOfMonth()+"";
            PedidoData pd = new PedidoData();
            List<Pedido> pedidos = new ArrayList<>();
            Mesa mesa = (Mesa) jcbMesa.getSelectedItem();
            pedidos = pd.listarPedidosDeMesaPorFecha(mesa.getIdMesa(), fecha1, fecha2);
            for (Pedido pedido: pedidos) {
                modelo.addRow(new Object[]{pedido.getIdPedido(), pedido.getIdMesa(), pedido.getIdMesero(), pedido.getFecha_hora(), pedido.getImporte(), pedido.isCobrado()});
            }
            jbCargar.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "Error. Seleccione una fecha de inicio y otra de finalización.");
        }
    }//GEN-LAST:event_jbCargarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < jtPedidos.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
        jbCargar.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCargar;
    private javax.swing.JComboBox<Mesa> jcbMesa;
    private com.toedter.calendar.JDateChooser jdcFecha1;
    private com.toedter.calendar.JDateChooser jdcFecha2;
    private javax.swing.JTable jtPedidos;
    // End of variables declaration//GEN-END:variables

private void cargarCombo() throws SQLException {
        MesaData ms = new MesaData();
        List<Mesa> mesas = new ArrayList<>();
        mesas = ms.listadoDeMesas();
        for (Mesa mesa: mesas) {
            jcbMesa.addItem(mesa);
        }
    }
    
    private void armarCabecera() {
        modelo.addColumn("Pedido");
        modelo.addColumn("Mesa");
        modelo.addColumn("mesero");
        modelo.addColumn("Fecha");
        modelo.addColumn("Importe");
        modelo.addColumn("Cobrado");
        jtPedidos.setModel(modelo);
    }

}
