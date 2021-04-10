
package facultades.gui;

import java.util.ArrayList;
import java.util.List;
import facultades.dataManager.DataManager;
import facultades.tdu.type.Vertex;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TF1 = new javax.swing.JTextField();
        TF2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Punto Inicial");

        jLabel2.setText("Punto Final");

        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Ruta");

        jLabel5.setText("jLabel5");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facultades/gui/ciclopista.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        TF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF1ActionPerformed(evt);
            }
        });

        TF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF2ActionPerformed(evt);
            }
        });

        jTextField1.setText("*Anexo de Filosofia, Estadio Tapatio, Ciencias PyS");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane2.setViewportView(TextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)
                        .addGap(176, 176, 176)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(TF1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(TF2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(159, 159, 159))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 435, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 435, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TF1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TF2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(662, 662, 662)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 404, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 378, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF1ActionPerformed

    private void TF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                DataManager dataManager = new DataManager();

        dataManager.graph1.addVertex("Anexo de Filosofia");
        dataManager.graph1.addVertex("Estadio");
        dataManager.graph1.addVertex("Arquitectura");
        dataManager.graph1.addVertex("Filosofia y Letras");
        dataManager.graph1.addVertex("Derecho");
        dataManager.graph1.addVertex("Ingenieria");
        dataManager.graph1.addVertex("Medicina");
        dataManager.graph1.addVertex("Quimica");
        dataManager.graph1.addVertex("Anexo de Ingenieria");
        dataManager.graph1.addVertex("Estadio Tapatio");
        dataManager.graph1.addVertex("Ciencias");
        dataManager.graph1.addVertex("Ciencias PyS");

        dataManager.graph1.addEdge("Anexo de Filosofia", "Estadio", 1600);
        dataManager.graph1.addEdge("Anexo de Filosofia", "Arquitectura", 2000);
        dataManager.graph1.addEdge("Estadio", "Arquitectura", 400);
        dataManager.graph1.addEdge("Arquitectura", "Filosofia y Letras", 750);
        dataManager.graph1.addEdge("Arquitectura", "Ingenieria", 500);
        dataManager.graph1.addEdge("Filosofia y Letras", "Derecho", 220);
        dataManager.graph1.addEdge("Derecho", "Ingenieria", 600);
        dataManager.graph1.addEdge("Derecho", "Medicina", 1200);
        dataManager.graph1.addEdge("Derecho", "Medicina", 900);
        dataManager.graph1.addEdge("Ingenieria", "Anexo de Ingenieria", 650);
        dataManager.graph1.addEdge("Medicina", "Quimica", 850);
        dataManager.graph1.addEdge("Quimica", "Anexo de Ingenieria", 500);
        dataManager.graph1.addEdge("Quimica", "Ciencias", 800);
        dataManager.graph1.addEdge("Quimica", "Estadio Tapatio", 900);
        dataManager.graph1.addEdge("Anexo de Ingenieria", "Estadio Tapatio", 650);
        dataManager.graph1.addEdge("Anexo de Ingenieria", "Ciencias", 400);
        dataManager.graph1.addEdge("Estadio Tapatio", "Ciencias", 850);
        dataManager.graph1.addEdge("Ciencias", "Ciencias PyS", 825);

        System.out.print(dataManager.graph1.toString());

        List<Vertex> route1 = new ArrayList<>();

        String s= TF1.getText();
        String r= TF2.getText();
        
        dataManager.graph1.findBestRoute(s, r, route1);

        System.out.print("\n******************");


        String z="";
        
        for (int i = 0; i < route1.size(); i++) {
            z = z + route1.get(i).getName()+ "->";
            System.out.print(route1.get(i).getName() + " -> ");
        }
        TextArea.setText(z);
         
        
        System.out.print("\n\n");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ventana().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TF1;
    private javax.swing.JTextField TF2;
    private javax.swing.JTextArea TextArea;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
