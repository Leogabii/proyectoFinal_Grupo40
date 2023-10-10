/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyFinalAtencionResto.Vistas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyFinalAtencionResto.Entidades.Mesero;
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
    /**
     * Creates new form AltaPedido
     */
    public BajaPedido() {
        initComponents();
         this.setSize(1150, 650);
         this.setLocation(5,5);
        armarCabecera();
        jlFecha.setText("Fecha: " + fechaDeHoy());
//        jlHora.setText(horaActual());
        cargarComboBoxMesero();
        deshabilitaBotones();
        
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
        jTextField3 = new javax.swing.JTextField();
        jpanelDeAbajjo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtItems = new javax.swing.JTable();
        jbGrabar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 0));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("BAJA DE PEDIDOS");

        jpanelDeArriba.setBackground(new java.awt.Color(255, 0, 0));
        jpanelDeArriba.setAutoscrolls(true);

        jlFecha.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jlFecha.setText("Fecha:");

        jTextField3.setText("jTextField3");

        javax.swing.GroupLayout jpanelDeArribaLayout = new javax.swing.GroupLayout(jpanelDeArriba);
        jpanelDeArriba.setLayout(jpanelDeArribaLayout);
        jpanelDeArribaLayout.setHorizontalGroup(
            jpanelDeArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelDeArribaLayout.createSequentialGroup()
                .addGap(124, 421, Short.MAX_VALUE)
                .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jpanelDeArribaLayout.setVerticalGroup(
            jpanelDeArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelDeArribaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelDeArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
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
        jScrollPane1.setViewportView(jtItems);

        jbGrabar.setText("Eliminar");
        jbGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGrabarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel6.setText("Datos del pedido a eliminar:");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField4");

        jTextField6.setText("jTextField4");

        javax.swing.GroupLayout jpanelDeAbajjoLayout = new javax.swing.GroupLayout(jpanelDeAbajjo);
        jpanelDeAbajjo.setLayout(jpanelDeAbajjoLayout);
        jpanelDeAbajjoLayout.setHorizontalGroup(
            jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelDeAbajjoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelDeAbajjoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jpanelDeAbajjoLayout.createSequentialGroup()
                        .addGap(22, 454, Short.MAX_VALUE)
                        .addComponent(jbGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
            .addGroup(jpanelDeAbajjoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelDeAbajjoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(69, 69, 69)
                        .addGroup(jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpanelDeAbajjoLayout.setVerticalGroup(
            jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelDeAbajjoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jpanelDeAbajjoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
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

    private void jbGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGrabarActionPerformed
        //recorre la tabla y lo guarda en un arrayList y lo pasa a pedidoProductoData para actualizar la bd
        Producto producto=null;
        for (int i=0; i<jtItems.getRowCount();i++){
            producto = new Producto();
            producto.setIdProducto((Integer) (jtItems.getValueAt(i, 1)));
            producto.setStock((Integer) (jtItems.getValueAt(i, 0)));
//            System.out.println((Integer) (jtItems.getValueAt(i, 1)));
//            System.out.println((Integer) (jtItems.getValueAt(i, 0)));
//            System.out.println("----------------------------------");
            productosPedidos.add(producto);
        }
//        jlHora.setText(horaActual());
        registrarPedido(proximoNroPedido(),nroMesa,nroMozo,fechaDeHoy(),total,productosPedidos);
        resetear();
        JOptionPane.showMessageDialog(this, "Su pedido ha sido Registrado a las:" + horaActual());
        
//        for (int i = 0; i < productosPedidos.size(); i++) {
//            
//            
//            
//            System.out.println(productosPedidos.get(i).getStock());
//            System.out.println("");
//            System.out.println(productosPedidos.get(i).getIdProducto());
//        }
//        
        
        
        
    }//GEN-LAST:event_jbGrabarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton jbGrabar;
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
        
        CabeceraTablaPedidos[] tope = CabeceraTablaPedidos.values();
        for (int i=0;i<tope.length;i++){
            modelo.addColumn(tope[i]);
            
        }
        
        jtItems.setModel(modelo);
        
        
        
    }

    private void borrarFilas(){
        
        int fila=jtItems.getRowCount()-1;
        for (; fila>=0; fila--) {
            modelo.removeRow(fila);
        }
        
   
        
        
    }

 private String fechaDeHoy(){

        Date fecha = new Date();

        SimpleDateFormat formato =  new SimpleDateFormat("dd-MM-yyyy");
     
        
        return (formato.format(fecha).toString());
                
           
    }

 private void deshabilitaBotones(){
     
//     jlAtendido.setText("Atendido por:  ");
//     jbAnular.setEnabled(false);
//     jtCantidad.setText("");
//     jtCantidad.setEnabled(false);
//     jcbProducto.setEnabled(false);
//     jbAgregar.setEnabled(false);
//     jbAnularItem.setEnabled(false);
//     jbGrabar.setEnabled(false);
     
 }
 private void habilitaBotones(){
     
//     jlAtendido.setText("Atendido por:  " + mesero.getNombre() + ", " + mesero.getApellido());
//     jbAnular.setEnabled(true);
//     jtCantidad.setText("");
//     jtCantidad.setEnabled(true);
//     jcbProducto.setEnabled(true);
//     jbAgregar.setEnabled(true);
//     jbAnularItem.setEnabled(false);
//     jbGrabar.setEnabled(false);
//     jcbMesa.setEnabled(false);
//     jcbLegajo.setEnabled(false);
//     jbAceptar.setEnabled(false);
 }

 

//private int mesaElegida(){
//    Integer eligio = Integer.parseInt(jcbMesa.getSelectedItem().toString());
//    return eligio;
//}
//        
//private int legajoMeseroElegido(){
//    Integer eligio = (Integer) jcbLegajo.getSelectedItem();
//    return eligio;
//}


private boolean estadoDeLaMesa(int nroMesa){
    boolean estado=true;
    return estado;
    
}


private void  modificoEstadoActual(int nroMesa,boolean estado){
    
    
}

private boolean consultaMozodeLaMeza(int nroMesa, int nroMozo){
    if ((nroMesa==3)&(nroMozo==2)){
    return true;
}else{
    return false;  
        }
}


private void cargarComboBoxProducto(){
  producto=new Producto();
  producto.setIdProducto(1);
  producto.setNombreProducto("Hamburguesa");
  producto.setStock(100);
  producto.setPrecio(699.99);
  
  Producto producto1=new Producto();
  producto1.setIdProducto(2);
  producto1.setNombreProducto("Pizza");
  producto1.setStock(100);
  producto1.setPrecio(1699.99);
  
//  jcbProducto.addItem(producto);
//  jcbProducto.addItem(producto1);
// 
  
//    List<Alumno> alumnos = aluData.listarAlumnos();
//     for (Alumno alu : alumnos){
//        jcbAlumno.addItem(alu);
//     }
}


 private void registrarPedido(int NroPedido, int nroMesa, int nroMozo,String fechaDeHoy,double total,ArrayList<Producto> productosPedidos){
     //envia a DATA los datos actualizar las tablas
     /*
     carga tabla pedidoProducto
     carga tabla pedidos
     actualiza tabla mesa
     
     */

}


        
 
 private void resetear(){
     //borra todo para empezar otra vez a cargar pedido
     borrarFilas();
     deshabilitaBotones();
//     jcbProducto.setEnabled(false);
//     jtCantidad.setText("");
//     jbAgregar.setEnabled(false);
//     jbAceptar.setEnabled(true);
//     jcbMesa.setEnabled(true);
//     jcbLegajo.setEnabled(true);
     subtotal=0;
     total=0;
//           jlSubtotal.setText("   Subtotal: $ ");
//       jlIVA.setText("     IVA 21%  " );
//       jlTotal.setText("TOTAL  A ABONAR $ ");
//       jcbLegajo.setSelectedIndex(0);
//       jcbMesa.setSelectedIndex(0);
 }
        
       private int proximoNroPedido(){
            // consulta a la bd el ultimo nro de pedido y me suma uno
           return 1 + 1;
        }

       
       private String horaActual(){
     LocalDateTime locaDate = LocalDateTime.now();
    int hours  = locaDate.getHour();    
    int minutes = locaDate.getMinute();
    int seconds = locaDate.getSecond();
    return (""+hours+" : "+minutes+" : "+seconds+"");
//      System.out.println("Hora actual : " + hours  + ":"+ minutes +":"+seconds); 
       }
       
       
}
