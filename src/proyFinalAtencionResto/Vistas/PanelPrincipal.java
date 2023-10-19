/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyFinalAtencionResto.Vistas;

/**
 *
 * @author eduardo
 */
public class PanelPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PanelPrincipal
     */
    public PanelPrincipal() {
        initComponents();
        this.setTitle("SISTEMA GESTION COMERCIAL - MODULO PEDIDOS");
        this.setSize(1200, 720);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmAlta = new javax.swing.JMenuItem();
        jmModificar = new javax.swing.JMenuItem();
        jmBaja = new javax.swing.JMenuItem();
        jmConsulta = new javax.swing.JMenuItem();
        jmGestionProductos = new javax.swing.JMenu();
        jmGProductosAlta = new javax.swing.JMenuItem();
        jmGProductosBaja = new javax.swing.JMenuItem();
        jmGProductosModificacion = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmCobrarPedido = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 204));

        escritorio.setBackground(new java.awt.Color(51, 255, 204));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        escritorio.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton1)
                .addContainerGap(1445, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButton1)
                .addContainerGap(641, Short.MAX_VALUE))
        );

        jMenu1.setText("Gestion Pedidos");

        jmAlta.setText("Alta");
        jmAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAltaActionPerformed(evt);
            }
        });
        jMenu1.add(jmAlta);

        jmModificar.setText("Modificacion");
        jmModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmModificarActionPerformed(evt);
            }
        });
        jMenu1.add(jmModificar);

        jmBaja.setText("Baja");
        jmBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBajaActionPerformed(evt);
            }
        });
        jMenu1.add(jmBaja);

        jmConsulta.setText("Consulta");
        jmConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultaActionPerformed(evt);
            }
        });
        jMenu1.add(jmConsulta);

        jMenuBar1.add(jMenu1);

        jmGestionProductos.setText("Gestion Productos");
        jmGestionProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGestionProductosActionPerformed(evt);
            }
        });

        jmGProductosAlta.setText("Alta");
        jmGProductosAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGProductosAltaActionPerformed(evt);
            }
        });
        jmGestionProductos.add(jmGProductosAlta);

        jmGProductosBaja.setText("Baja");
        jmGestionProductos.add(jmGProductosBaja);

        jmGProductosModificacion.setText("Modificacion");
        jmGestionProductos.add(jmGProductosModificacion);

        jMenuBar1.add(jmGestionProductos);

        jMenu4.setText("Gestion Cobranzas");

        jmCobrarPedido.setText("Cobrar Pedido");
        jmCobrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCobrarPedidoActionPerformed(evt);
            }
        });
        jMenu4.add(jmCobrarPedido);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Listados");

        jMenuItem1.setText("Lista de pedidos por mesero");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Lista de pedidos por fecha");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jmSalir.add(jMenuItem5);

        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBajaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BajaPedido bajaPedido= new BajaPedido();
        bajaPedido.setVisible(true);
        escritorio.add(bajaPedido);
        escritorio.moveToFront(bajaPedido);
    }//GEN-LAST:event_jmBajaActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jmAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAltaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AltaPedido altaPedido= new AltaPedido();
        altaPedido.setVisible(true);
        escritorio.add(altaPedido);
        escritorio.moveToFront(altaPedido);
    }//GEN-LAST:event_jmAltaActionPerformed

    private void jmModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmModificarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ModificarPedido modificarPedido= new ModificarPedido();
        modificarPedido.setVisible(true);
        escritorio.add(modificarPedido);
        escritorio.moveToFront(modificarPedido);
    }//GEN-LAST:event_jmModificarActionPerformed

    private void jmConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultasdePedidos consultaPedido= new ConsultasdePedidos();
        consultaPedido.setVisible(true);
        escritorio.add(consultaPedido);
        escritorio.moveToFront(consultaPedido);
    }//GEN-LAST:event_jmConsultaActionPerformed

    private void jmGProductosAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGProductosAltaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AltaProducto altaProducto = new AltaProducto();
        altaProducto.setVisible(true);
        escritorio.add(altaProducto);
        escritorio.moveToFront(altaProducto);
        
    }//GEN-LAST:event_jmGProductosAltaActionPerformed

    private void jmGestionProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGestionProductosActionPerformed
        // TODO add your handling code here:
//        escritorio.removeAll();
//        escritorio.repaint();
//        GestionProductos x = new GestionProductos();
//        x.setVisible(true);
//        escritorio.add(x);
//        escritorio.moveToFront(x);
    }//GEN-LAST:event_jmGestionProductosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       escritorio.removeAll();
       escritorio.repaint();
      GestionProductos x = new GestionProductos();
       x.setSize(1100,613);
       x.setVisible(true);
       escritorio.add(x);
        escritorio.moveToFront(x);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ListaPedidosMesero x = new ListaPedidosMesero();
        x.setSize(1100,613);
        x.setVisible(true);
        escritorio.add(x);
        escritorio.moveToFront(x);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmCobrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCobrarPedidoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        CobranzaDePedido x = new CobranzaDePedido();
        x.setSize(1100,613);
        x.setVisible(true);
        escritorio.add(x);
        escritorio.moveToFront(x);
    }//GEN-LAST:event_jmCobrarPedidoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        PedidosPorFecha x = new PedidosPorFecha();
        x.setSize(1100,613);
        x.setVisible(true);
        escritorio.add(x);
        escritorio.moveToFront(x);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jmAlta;
    private javax.swing.JMenuItem jmBaja;
    private javax.swing.JMenuItem jmCobrarPedido;
    private javax.swing.JMenuItem jmConsulta;
    private javax.swing.JMenuItem jmGProductosAlta;
    private javax.swing.JMenuItem jmGProductosBaja;
    private javax.swing.JMenuItem jmGProductosModificacion;
    private javax.swing.JMenu jmGestionProductos;
    private javax.swing.JMenuItem jmModificar;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}
