
package software_taekwondo;

import javax.swing.JOptionPane;

public class Actualizar_Alumno extends javax.swing.JFrame 
{
    //Declaración de las variables
    public int intIdPersona;
    private String strNombre1Persona;
    private String strNombre2Persona;
    private String strApellido1Persona;
    private String strApellido2Persona;
    private int intTipoPersona;
    private int intGradoPersona;
    
    private persona per = new persona();
    private persona[]vectpersona = per.CrudListaPersona();
    int opcAlumnos;
    public Actualizar_Alumno() 
    {
        initComponents();
        this.setLocation(350,50);
        for(int b=0;b<vectpersona.length;b++)
        {
            ComboPersonas.addItem            
                    (
                    vectpersona[b].getintIdPersona()+" "
                    +vectpersona[b].getstrNombre1Persona()+" "
                    +vectpersona[b].getstrNombre2Persona()+" "
                    +vectpersona[b].getstrApellido1Persona()+" "
                    +vectpersona[b].getstrApellido2Persona()+" "
                    +vectpersona[b].getintTipoPersona()+" "
                    +vectpersona[b].getintGradoPersona()+" "
                    );
        }//fin del for
 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Lable = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboPersonas = new javax.swing.JComboBox();
        Iniciar = new javax.swing.JButton();
        InfoMostrada = new javax.swing.JTextField();
        Volver_Alumno = new javax.swing.JButton();
        Volver_Administrador = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Reiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Actualizar Alumno");

        Lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/software_taekwondo/LOGO.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Seleccione el alumno que desea actualizar luego haga clic en iniciar");

        ComboPersonas.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        ComboPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPersonasActionPerformed(evt);
            }
        });

        Iniciar.setText("Iniciar");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
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
        jLabel4.setText("Si los datos son correctos clic en guardar sino en reiniciar");

        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Volver_Alumno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Volver_Administrador))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(InfoMostrada, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(ComboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(Iniciar)))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Lable)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(ComboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Iniciar)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(InfoMostrada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(Reiniciar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver_Alumno)
                    .addComponent(Volver_Administrador))
                .addGap(20, 20, 20))
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

    private void ComboPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPersonasActionPerformed
    opcAlumnos= ComboPersonas.getSelectedIndex();
    per = vectpersona[ComboPersonas.getSelectedIndex()];
    per.getstrNombre1Persona();
    vectpersona[ComboPersonas.getSelectedIndex()].getstrApellido1Persona();
    }//GEN-LAST:event_ComboPersonasActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
//     if (opcAlumnos==0)
//     {
//      JOptionPane.showMessageDialog(null,"escogio luis");
//     }  
        
       intIdPersona = vectpersona[ComboPersonas.getSelectedIndex()].getintIdPersona();
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

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        //Este boton permite borrar la informacion diligenciada y volver a llenarla

        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar_Alumno().setVisible(true);
            }
        });
    }//GEN-LAST:event_ReiniciarActionPerformed

 
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
            java.util.logging.Logger.getLogger(Actualizar_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar_Alumno().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboPersonas;
    private javax.swing.JTextField InfoMostrada;
    private javax.swing.JButton Iniciar;
    private javax.swing.JLabel Lable;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JButton Volver_Administrador;
    private javax.swing.JButton Volver_Alumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
