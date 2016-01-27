 /******************************************************************************
 *                    UNIVERSIDAD DE CUNDINAMARCA                              *
 *                             EXT CHIA                                        *
 *                    Empresa M&D software                                     *
 *                    Desarrolladores: Miguel Chaves                           *   
 *                                   : Deisy Peña                              *
 *                                   : Camilo Urrea                            *
 *                    Semestre  VII                                            *
 *                    Ingenieria de software 2                                 *
 *                    Nombre del proyecto: Taekwondo Management                *
 *                                                                             *
 *  Este formulario permite escoger varias opciones para administrar alumnos   *
 *  profesores o grupos                                                        *
 ******************************************************************************/

package software_taekwondo;

public class Administrador extends javax.swing.JFrame {

    public Administrador() {
        initComponents();
        this.setLocation(350,50);
        OpcAdmin.add(AdminAlumnos);//agregamos el radio botton AdminAlumnos a el grupo de botones OpcAdmin para que solo sea posible escojer una opcion
        OpcAdmin.add(AdminProfesor);
        OpcAdmin.add(AdminGrupo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        OpcAdmin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AdminAlumnos = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        AdminProfesor = new javax.swing.JRadioButton();
        AdminGrupo = new javax.swing.JRadioButton();
        Aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/software_taekwondo/LOGO.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Por favor seleccione una opción y haga clic en aceptar");

        AdminAlumnos.setBackground(new java.awt.Color(153, 204, 255));
        AdminAlumnos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AdminAlumnos.setText("Administrar Alumnos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Administrador");

        AdminProfesor.setBackground(new java.awt.Color(153, 204, 255));
        AdminProfesor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AdminProfesor.setText("Administrar Profesores");

        AdminGrupo.setBackground(new java.awt.Color(153, 204, 255));
        AdminGrupo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AdminGrupo.setText("Administrar Grupos");

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
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdminAlumnos)
                            .addComponent(jLabel1)
                            .addComponent(AdminProfesor)
                            .addComponent(AdminGrupo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(Aceptar)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(AdminAlumnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdminProfesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdminGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Aceptar)
                .addGap(39, 39, 39))
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
        if(AdminAlumnos.isSelected())
        {
            setVisible(false);//cuando se de click en el boton continuar este formulario quedara no visible
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAlumno().setVisible(true);
            }
         });
        }else
        {
         if(AdminProfesor.isSelected())
         {
              setVisible(false);//cuando se de click en el boton continuar este formulario quedara no visible
               java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new AdminProfesor().setVisible(true);
            }
         });
         }else
            {
                if(AdminGrupo.isSelected())
                {
                   setVisible(false);//cuando se de click en el boton continuar este formulario quedara no visible
               java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new AdminGrupo().setVisible(true);
            }
         }); 
                }
            }
        }
    }//GEN-LAST:event_AceptarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JRadioButton AdminAlumnos;
    private javax.swing.JRadioButton AdminGrupo;
    private javax.swing.JRadioButton AdminProfesor;
    private javax.swing.ButtonGroup OpcAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
