/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyFinalAtencionResto.Vistas;

/**
 *
 * @author li_ig
 */
public class GestionProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionProductos
     */
    public GestionProductos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritoriogdp = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jbAlta = new javax.swing.JButton();
        jbBaja = new javax.swing.JButton();
        jbModificacion = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximizable(true);
        setResizable(true);

        escritoriogdp.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bienvenido/a a la Gestion de Productos");

        jbAlta.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jbAlta.setText("Alta");
        jbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaActionPerformed(evt);
            }
        });

        jbBaja.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jbBaja.setText("Baja");

        jbModificacion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jbModificacion.setText("Modificacion");

        escritoriogdp.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritoriogdp.setLayer(jbAlta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritoriogdp.setLayer(jbBaja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritoriogdp.setLayer(jbModificacion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritoriogdpLayout = new javax.swing.GroupLayout(escritoriogdp);
        escritoriogdp.setLayout(escritoriogdpLayout);
        escritoriogdpLayout.setHorizontalGroup(
            escritoriogdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritoriogdpLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(escritoriogdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritoriogdpLayout.createSequentialGroup()
                        .addComponent(jbAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jbModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        escritoriogdpLayout.setVerticalGroup(
            escritoriogdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritoriogdpLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(escritoriogdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritoriogdp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritoriogdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed
        // TODO add your handling code here:
     escritoriogdp.removeAll();
     escritoriogdp.repaint();
     AltaProducto altaProducto = new AltaProducto();
     altaProducto.setVisible(true);
     escritoriogdp.add(altaProducto);
     escritoriogdp.moveToFront(altaProducto);
    }//GEN-LAST:event_jbAltaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritoriogdp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbAlta;
    private javax.swing.JButton jbBaja;
    private javax.swing.JButton jbModificacion;
    // End of variables declaration//GEN-END:variables
}