/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software_taekwondo;

public class AdminAlumno extends javax.swing.JFrame {

    public AdminAlumno() {
        initComponents();
        this.setLocation(350,50);
        opcadminalumno.add(Ver_alumno);
        opcadminalumno.add(Act_Alumno);
        opcadminalumno.add(Crear_Alumno);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcadminalumno = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Ver_alumno = new javax.swing.JRadioButton();
        Act_Alumno = new javax.swing.JRadioButton();
        Crear_Alumno = new javax.swing.JRadioButton();
        Aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Administrar Alumnos");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/software_taekwondo/LOGO.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Por favor seleccione una opción y haga clic en aceptar");

        Ver_alumno.setBackground(new java.awt.Color(153, 204, 255));
        Ver_alumno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Ver_alumno.setText("Ver Alumno");

        Act_Alumno.setBackground(new java.awt.Color(153, 204, 255));
        Act_Alumno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Act_Alumno.setText("Actualizar Alumno");

        Crear_Alumno.setBackground(new java.awt.Color(153, 204, 255));
        Crear_Alumno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Crear_Alumno.setText("Crear Alumno");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ver_alumno)
                            .addComponent(jLabel3)
                            .addComponent(Act_Alumno)
                            .addComponent(Crear_Alumno)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(Aceptar)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(Ver_alumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Act_Alumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Crear_Alumno)
                .addGap(42, 42, 42)
                .addComponent(Aceptar)
                .addGap(0, 53, Short.MAX_VALUE))
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
        if(Ver_alumno.isSelected())
        {
            setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerAlumnos().setVisible(true);
            }
        });
        }else
             {
                 if(Act_Alumno.isSelected())
                 {
                     setVisible(false);
                   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar_Alumno().setVisible(true);
            }
        });  
                 }else
                 {
                     if(Crear_Alumno.isSelected())
                     {
                         setVisible(false);
                        java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                         new Crear_Alumnos().setVisible(true);
                                }
                            }); 
                     }
                 }
             }
    }//GEN-LAST:event_AceptarActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAlumno().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JRadioButton Act_Alumno;
    private javax.swing.JRadioButton Crear_Alumno;
    private javax.swing.JRadioButton Ver_alumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup opcadminalumno;
    // End of variables declaration//GEN-END:variables
}
