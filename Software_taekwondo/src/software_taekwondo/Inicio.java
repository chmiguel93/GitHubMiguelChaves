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
 * El software esta diseñado para llevar de manera ordenada el control de la   * 
 * información de los estudiantes, profesores y grupos de una academia de      *
 * taekwondo.                                                                  *
 ******************************************************************************/
package software_taekwondo;

/**
 *
 * @author miguel
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setLocation(350,50);//aca ponemos donde queremos que aparesca la ventana ubicada en nuestra pantalla del pc
        //el 350 indica el punto en X mientras que el 50 indica el punto en Y
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Logo_empresa = new javax.swing.JLabel();
        Logo_Udec = new javax.swing.JLabel();
        Logo_software = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        Continuar = new javax.swing.JButton();
        Logo_udec = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(153, 204, 255));
        Fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Fondo.setMaximumSize(new java.awt.Dimension(816, 633));

        Logo_empresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/software_taekwondo/M&D Software Logo.png"))); // NOI18N

        Logo_software.setIcon(new javax.swing.ImageIcon(getClass().getResource("/software_taekwondo/LOGO.png"))); // NOI18N

        Descripcion.setColumns(20);
        Descripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Descripcion.setRows(2);
        Descripcion.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                DescripcionAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(Descripcion);

        Continuar.setText("Continuar");
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });

        Logo_udec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/software_taekwondo/Logo Universidad.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Desarrolladores:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Miguel Chaves       Deisy Peña      Camilo Urrea");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Universidad de cundinamarca");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("VII Semestre Nocturno");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Ingenieria de software II");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Diciembre 5 de 2013");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Logo_software, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(Continuar))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(9, 9, 9))))))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(Logo_udec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Logo_Udec, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Logo_Udec))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo_udec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(2, 2, 2)
                .addComponent(Logo_software, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(Continuar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DescripcionAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_DescripcionAncestorAdded
        Descripcion.setText("El software esta diseñado para llevar de manera ordenada el control de la información de los estudiantes,\nprofesores y grupos de una academia de taekwondo.");
    }//GEN-LAST:event_DescripcionAncestorAdded

    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
       setVisible(false);//cuando se de click en el boton continuar este formulario quedara no visible
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Usuarios().setVisible(true);
            }
         });// las lineas anteriores nos permiten ejecutar el formulario llamado Menu_Usuarios
    }//GEN-LAST:event_ContinuarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continuar;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Logo_Udec;
    private javax.swing.JLabel Logo_empresa;
    private javax.swing.JLabel Logo_software;
    private javax.swing.JLabel Logo_udec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
