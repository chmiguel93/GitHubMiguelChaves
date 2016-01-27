
package software_taekwondo;

import javax.swing.JOptionPane;

public class Crear_Alumnos extends javax.swing.JFrame {
//Declaración de las variables
    public int intIdPersona;
    private String strNombre1Persona;
    private String strNombre2Persona;
    private String strApellido1Persona;
    private String strApellido2Persona;
    private int intTipoPersona;
    private int intGradoPersona;

    public Crear_Alumnos() {
        initComponents();
        this.setLocation(350,50);
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        InfoMostrada = new javax.swing.JTextField();
        Reiniciar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Volver_Alumno = new javax.swing.JButton();
        Volver_Administrador = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Iniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Crear Alumno");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/software_taekwondo/LOGO.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Si los datos son correctos clic en guardar sino en reiniciar");

        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Volver_Alumno.setText("Volver a administrar alumnos");
        Volver_Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_AlumnoActionPerformed(evt);
            }
        });

        Volver_Administrador.setText("Volver a perfil administrador");
        Volver_Administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_AdministradorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Si desea crear un nuevo Alumno por favor haga clic en iniciar");

        Iniciar.setText("Iniciar");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InfoMostrada, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Volver_Alumno))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(Volver_Administrador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(Guardar)
                                        .addGap(100, 100, 100)
                                        .addComponent(Reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(Iniciar)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(191, 191, 191))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(Iniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(InfoMostrada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Reiniciar))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver_Alumno)
                    .addComponent(Volver_Administrador))
                .addGap(25, 25, 25))
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

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
  //Este boton permite borrar la informacion diligenciada y volver a llenarla      
        
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_Alumnos().setVisible(true);
            }
        });
    }//GEN-LAST:event_ReiniciarActionPerformed

    private void Volver_AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_AlumnoActionPerformed
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAlumno().setVisible(true);
            }
        });
    }//GEN-LAST:event_Volver_AlumnoActionPerformed

    private void Volver_AdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_AdministradorActionPerformed
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }//GEN-LAST:event_Volver_AdministradorActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed

       intIdPersona = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el id del nuevo Alumno"));
       strNombre1Persona = JOptionPane.showInputDialog("Por favor ingrese el primer nombre del nuevo Alumno");
       strNombre2Persona = JOptionPane.showInputDialog("Por favor ingrese el Segundo nombre del nuevo Alumno  (Opcional)");
       strApellido1Persona = JOptionPane.showInputDialog("Por favor ingrese el primer apellido del nuevo Alumno");
       strApellido2Persona = JOptionPane.showInputDialog("Por favor ingrese el Segundo nombre del nuevo Alumno  (Opcional)");
       intTipoPersona =1; //el tipo de dato es 1 ya que es un alumno 
       intGradoPersona = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el grado del nuevo Alumno"));
       InfoMostrada.setText
               (
               ""+intIdPersona+" "+
               ""+strNombre1Persona+" "+
               ""+strNombre2Persona+" "+
               ""+strApellido1Persona+" "+
               ""+strApellido2Persona+" "+
               ""+intTipoPersona+" "+
               ""+intGradoPersona+" "
               );
     
    }//GEN-LAST:event_IniciarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        persona perinsert = new persona(intIdPersona, strNombre1Persona , strNombre2Persona, strApellido1Persona, strApellido2Persona, intTipoPersona, intGradoPersona);
        perinsert.CrudInsert();
        JOptionPane.showMessageDialog(null,"Nuevo alumno creado con exito");
    }//GEN-LAST:event_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Crear_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_Alumnos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField InfoMostrada;
    private javax.swing.JButton Iniciar;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JButton Volver_Administrador;
    private javax.swing.JButton Volver_Alumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
