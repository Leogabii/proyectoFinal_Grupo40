/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyFinalAtencionResto.Vistas;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyFinalAtencionResto.AccesoADatos.PedidoData;
import proyFinalAtencionResto.AccesoADatos.PedidoProductoData;
import proyFinalAtencionResto.Entidades.Mesero;
import proyFinalAtencionResto.Entidades.Pedido;
import proyFinalAtencionResto.Entidades.Producto;

/**
 *
 * @author eduardo
 */
public class BajaPedido extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel(){
    @Override
    public boolean isCellEditable(int fila, int columna){
        if ((columna==1) & (columna==2)){
            return true;
        }else{
            return false;
        }
    }
};
    private ArrayList<Producto> productosPedidos = new ArrayList();
    private Mesero mesero = null;
    private Producto producto=null;
    private int nroMesa;
    private int nroMozo;
    private final double IVA = 0.21; 
    private double subtotal=0;
    private double total=0;
    private PedidoData pedidoData = new PedidoData();
    private PedidoProductoData pedidoproductoData = new PedidoProductoData();
    private String fechaABuscar;
    private  int pedidoSeleccionado;
    /**
     * Creates new form AltaPedido
     */
    public BajaPedido() {
        initComponents();
         this.setSize(1150, 650);
         this.setLocation(5,5);
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

        jpanelDeArriba = new javax.swing.JPanel();
        jlFecha = new javax.swing.JLabel();
        jFecha = new com.toedter.calendar.JDateChooser();
        jbBuscar = new javax.swing.JButton();
        jpanelDeAbajjo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtItems = new javax.swing.JTable();
        jEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 0));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("BAJA DE PEDIDOS");

        jpanelDeArriba.setBackground(new java.awt.Color(255, 0, 0));
        jpanelDeArriba.setAutoscrolls(true);

        jlFecha.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jlFecha.setText("Fecha:");

        jFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jFechaPropertyChange(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelDeArribaLayout = new javax.swing.GroupLayout(jpanelDeArriba);
        jpanelDeArriba.setLayout(jpanelDeArribaLayout);
        jpanelDeArribaLayout.setHorizontalGroup(
            jpanelDeArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelDeArribaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jbBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelDeArribaLayout.setVerticalGroup(
            jpanelDeArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelDeArribaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jpanelDeArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelDeArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jpanelDeAbajjo.setBackground(new java.awt.Color(0, 204, 51));
        jpanelDeAbajjo.setAutoscrolls(true);

        jtItems.setModel(new javax.swing.table.DefaultTableModel(
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
        jtItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtItems);

        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("haga click con el mouse para elegir el pedido a eliminar , luego presione el boton eliminar --->");

        javax.swing.GroupLayout jpanelDeAbajjoLayout = new javax.swing.GroupLayout(jpanelDeAbajjo);
        jpanelDeAbajjo.setLayout(jpanelDeAbajjoLayout);
        jpanelDeAbajjoLayout.setHorizontalGroup(
            jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelDeAbajjoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelDeAbajjoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelDeAbajjoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanelDeAbajjoLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))))
        );
        jpanelDeAbajjoLayout.setVerticalGroup(
            jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelDeAbajjoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelDeArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jpanelDeAbajjo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelDeArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelDeAbajjo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
                 try {
            
            int filaSeleccionada = jtItems.getSelectedRow();
            if(filaSeleccionada!=-1){
            pedidoproductoData.eliminaPedidoProducto(pedidoSeleccionado);
            pedidoData.eliminaPedido(pedidoSeleccionado);
            modelo.removeRow(filaSeleccionada);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jFechaPropertyChange
           
        if(jFecha.getDate()!=null){
            LocalDateTime fechanueva = jFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            fechaABuscar= fechanueva.format(dtf);
        }
    }//GEN-LAST:event_jFechaPropertyChange

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        borrarFilas();
        cargarTablaPedidos(fechaABuscar);
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtItemsMouseClicked
       int filaSeleccionada = jtItems.getSelectedRow();
         if(filaSeleccionada!=-1){
            pedidoSeleccionado=(Integer) jtItems.getValueAt(filaSeleccionada, 0);
    }//GEN-LAST:event_jtItemsMouseClicked
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jEliminar;
    private com.toedter.calendar.JDateChooser jFecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JPanel jpanelDeAbajjo;
    private javax.swing.JPanel jpanelDeArriba;
    private javax.swing.JTable jtItems;
    // End of variables declaration//GEN-END:variables

private void cargarComboBoxMesero(){
  mesero=new Mesero();
  mesero.setIdMesero(1);
  mesero.setNombre("Donald");
  mesero.setApellido("Trump");
  mesero.setDni(17656789);
  mesero.setDomicilio("Lacarra 2345");
  mesero.setLocalidad("Avellaneda");
  mesero.setTelefono("011 4566 - 7889");
  mesero.setProvincia("Buenos Aires");
  Mesero mesero1=new Mesero();
  mesero1.setIdMesero(2);
  mesero1.setNombre("Marcelo");
  mesero1.setApellido("Tinelli");
  mesero1.setDni(17656789);
  mesero1.setDomicilio("Lacarra 2345");
  mesero1.setLocalidad("Avellaneda");
  mesero1.setTelefono("011 4566 - 7889");
  mesero1.setProvincia("Buenos Aires");
//  jcbLegajo.addItem(mesero.getIdMesero());
//  jcbLegajo.addItem(mesero1.getIdMesero());
// 
  
//    List<Alumno> alumnos = aluData.listarAlumnos();
//     for (Alumno alu : alumnos){
//        jcbAlumno.addItem(alu);
//     }
}

 private void armarCabecera(){
        
        CabeceraTablaBajaPedido[] tope = CabeceraTablaBajaPedido.values();
      
        for (int i=0;i<tope.length;i++){
            modelo.addColumn(tope[i]);
            
        }
        
        jtItems.setModel(modelo);
        
        
        
    }
 
 
 
 
 //**** cargar la tabla *******
 
    private void cargarTablaPedidos(String fechaRecibida){
        List<Pedido> pedidos = new ArrayList();
        pedidos=pedidoData.listarPedido(fechaRecibida);
        for (Pedido ped : pedidos) {
        Object vector[]= new Object[4];
                vector[0]=ped.getIdPedido();
                vector[1]=ped.getIdMesero();
                vector[2]=ped.getIdMesa();
                vector[3]=ped.getImporte();
                modelo.addRow(vector);
        }
        
    }
 
 
 

    private void borrarFilas(){
        
        int fila=jtItems.getRowCount()-1;
        for (; fila>=0; fila--) {
            modelo.removeRow(fila);
        }
        
   
        
        
    }

       
}
