/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyFinalAtencionResto.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import proyFinalAtencionResto.AccesoADatos.MeseroData;
import proyFinalAtencionResto.AccesoADatos.PedidoData;
import proyFinalAtencionResto.Entidades.Mesero;
import proyFinalAtencionResto.Entidades.Pedido;

/**
 *
 * @author Asus
 */
public class ListaPedidosMesero extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form ListaPedidosMesero
     */
    public ListaPedidosMesero() {
        initComponents();
        cargarCombo();
        armarCabecera();
//        cargarDatos(jcbMesero.getSelectedItem().getIdMesero);
        cargarDatos(1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbMesero = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMesero = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Pedidos de meseros");

        jtMesero.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtMesero);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Mesero> jcbMesero;
    private javax.swing.JTable jtMesero;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        jcbMesero.removeAllItems();
        MeseroData md = new MeseroData();
        List<Mesero> meseros = new ArrayList<>();
        meseros = md.listaDeMeseros();
        for (Mesero mesero: meseros) {
            jcbMesero.addItem(mesero);
        }
    }
    
    private void armarCabecera() {
        modelo.addColumn("Pedido");
        modelo.addColumn("Mesa");
        modelo.addColumn("Mesero");
        modelo.addColumn("Fecha");
        modelo.addColumn("Importe");
        modelo.addColumn("Cobrado");
        jtMesero.setModel(modelo);
    }
    
    private void cargarDatos(int idMesero) {
        PedidoData pd = new PedidoData();
        List<Pedido> pedidos = new ArrayList<>();
        pedidos = pd.listarPedidosPorIdMesero(idMesero);
        for (Pedido pedido: pedidos) {
            modelo.addRow(new Object[]{pedido.getIdPedido(), pedido.getIdMesa(), pedido.getFechaHora(), pedido.getImporte(), pedido.isCobrado()});
        }
    }

}