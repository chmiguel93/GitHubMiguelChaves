/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software_taekwondo;


public class AdminProfesor extends javax.swing.JFrame {

    public AdminProfesor() {
        initComponents();
        this.setLocation(350,50);
        OpcAdminProfesor.add(Ver_profesor);
        OpcAdminProfesor.add(Act_Profesor);
        OpcAdminProfesor.add(Crear_Profesor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpcAdminProfesor = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Ver_profesor = new javax.swing.JRadioButton();
        Act_Profesor = new javax.swing.JRadioButton();
        Crear_Profesor = new javax.swing.JRadioButton();
        Aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Administrar Profesores");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/software_taekwondo/LOGO.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Por favor seleccione una opción y haga clic en aceptar");

        Ver_profesor.setBackground(new java.awt.Color(153, 204, 255));
        Ver_profesor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ver_profesor.setText("Ver Profesor");

        Act_Profesor.setBackground(new java.awt.Color(153, 204, 255));
        Act_Profesor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Act_Profesor.setText("Actualizar profesor");

        Crear_Profesor.setBackground(new java.awt.Color(153, 204, 255));
        Crear_Profesor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Crear_Profesor.setText("Crear Profesor");

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Crear_Profesor)
                    .addComponent(Act_Profesor)
                    .addComponent(Ver_profesor)
                    .addComponent(jLabel3))
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(Aceptar)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(Ver_profesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Act_Profesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Crear_Profesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(Aceptar)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if(Ver_profesor.isSelected())
        {
            setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerProfesor().setVisible(true);
            }
        });
        }else
             {
                 if(Act_Profesor.isSelected())
                 {
                     setVisible(false);
                   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar_Profesor().setVisible(true);
            }
        });  
                 }else
                 {
                     if(Crear_Profesor.isSelected())
                     {
                         setVisible(false);
                        java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                         new Crear_Profesor().setVisible(true);
                                }
                            }); 
                     }
                 }
             }
    }//GEN-LAST:event_AceptarActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminProfesor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JRadioButton Act_Profesor;
    private javax.swing.JRadioButton Crear_Profesor;
    private javax.swing.ButtonGroup OpcAdminProfesor;
    private javax.swing.JRadioButton Ver_profesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
