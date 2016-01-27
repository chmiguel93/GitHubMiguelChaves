/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software_taekwondo;

public class AdminGrupo extends javax.swing.JFrame {

    public AdminGrupo() {
        initComponents();
        this.setLocation(350,50);
        OpcAdminGrupo.add(VerGrupo);
        OpcAdminGrupo.add(ActGrupo);
        OpcAdminGrupo.add(CrearGrupo);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpcAdminGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        VerGrupo = new javax.swing.JRadioButton();
        ActGrupo = new javax.swing.JRadioButton();
        CrearGrupo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Administrar Grupos");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/software_taekwondo/LOGO.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Por favor seleccione una opción y haga clic en aceptar");

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        VerGrupo.setBackground(new java.awt.Color(153, 204, 255));
        VerGrupo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        VerGrupo.setText("ver Grupo");

        ActGrupo.setBackground(new java.awt.Color(153, 204, 255));
        ActGrupo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ActGrupo.setText("Actualizar Grupo");

        CrearGrupo.setBackground(new java.awt.Color(153, 204, 255));
        CrearGrupo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CrearGrupo.setText("Crear Grupo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CrearGrupo)
                    .addComponent(ActGrupo)
                    .addComponent(VerGrupo)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(85, 85, 85))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(211, 211, 211)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(Aceptar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(VerGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ActGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CrearGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Aceptar)
                .addGap(33, 33, 33))
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
        if(VerGrupo.isSelected())
        {
            setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new VerGrupo().setVisible(true);
                }
            });
        }else
        {
            if(ActGrupo.isSelected())
            {
                setVisible(false);
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Actualizar_Grupo().setVisible(true);
                    }
                });
            }else
            {
                if(CrearGrupo.isSelected())
                {
                    setVisible(false);
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new Crear_Grupo().setVisible(true);
                        }
                    });
                }
            }
        }
    }//GEN-LAST:event_AceptarActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGrupo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JRadioButton ActGrupo;
    private javax.swing.JRadioButton CrearGrupo;
    private javax.swing.ButtonGroup OpcAdminGrupo;
    private javax.swing.JRadioButton VerGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
