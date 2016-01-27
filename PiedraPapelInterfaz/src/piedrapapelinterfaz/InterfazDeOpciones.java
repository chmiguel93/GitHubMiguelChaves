                        /*******************************************************************************
                         *                                                                             *
                         *                    UNIVERSIDAD DE CUNDINAMARCA                              *
                         *                             EXT CHIA                                        *
                         *                    Desarrollador: Miguel Chaves                             *   
                         *                    Semestre  VIII                                           *
                         *                    Inteligencia Artificial                                  *
                         *                                                                             *
                         * Este programa que permmite jugar piedra papel o tijera de una forma especial*
                         * estas son las reglas:                                                       *
                         *                                                                             *
                         * Las tijeras cortan el papel, el papel cubre a la piedra, la piedra aplasta  * 
                         * al lagarto, el lagarto envenena a Spock, Spock destroza las tijeras, las    *
                         * tijeras decapitan al lagarto, el lagarto  come el papel, el papel refuta a  *
                         * Spock, Spock vaporiza la piedra, y, como es habitual la piedra aplasta las  * 
                         * tijeras.                                                                    *
                         *                                                                             *
                         *******************************************************************************/

package piedrapapelinterfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class InterfazDeOpciones extends javax.swing.JFrame {
    

    public InterfazDeOpciones() {
        initComponents();
        this.setLocation(300,040);// Seleccionamos la ubiccion en la que aparecera la ventana del programa
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Tijeras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        Papel = new javax.swing.JButton();
        Piedra = new javax.swing.JButton();
        Lagarto = new javax.swing.JButton();
        Spock = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Tijeras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/scissors.jpg"))); // NOI18N
        Tijeras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tijeras.setBorderPainted(false);
        Tijeras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tijeras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TijerasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Resultado:");
        jLabel3.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Limpiar Resultado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Resultado.setEditable(false);
        Resultado.setBackground(new java.awt.Color(102, 153, 255));
        Resultado.setColumns(15);
        Resultado.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Resultado.setRows(2);
        Resultado.setAutoscrolls(false);
        Resultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(Resultado);

        Papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Paper.jpg"))); // NOI18N
        Papel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Papel.setBorderPainted(false);
        Papel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Papel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PapelActionPerformed(evt);
            }
        });

        Piedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rock.jpg"))); // NOI18N
        Piedra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Piedra.setBorderPainted(false);
        Piedra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Piedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiedraActionPerformed(evt);
            }
        });

        Lagarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lizzard.jpg"))); // NOI18N
        Lagarto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lagarto.setBorderPainted(false);
        Lagarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LagartoActionPerformed(evt);
            }
        });

        Spock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Spock.jpg"))); // NOI18N
        Spock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Piedra, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Papel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Tijeras, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lagarto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(Spock)
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Piedra, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Tijeras, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Papel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lagarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Spock, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Piedra, Papel, Tijera, Lagarto o Spock");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Desarrollado Por: Miguel Angel Chaves     Codigo 561210209");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Universidad4.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TijerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TijerasActionPerformed
    int p = (int)Math.round(Math.random()*5); //se multiplica por 5 ya que deseamos tener valores entre 1 y 5 y no valores entre 0 y 1
    // es necesario hacer casting para redodear el math.random, ya que esta funcion nos retorna un valor double y necesitamos un entero
    
    if(p == 0)  //como no necesitamos tener en cuenta el 0, cava vez que en la función anterior el valor aleatorio sea 0 quedara en un 1 
    {
        p = p+1;
    }    
    
        switch (p) 
            {
                case 1:  
                    Resultado.setText("Usted escogio tijeras al igual que el pc. \nSe ha producido un empate");
                break;

                case 2:  
                    Resultado.setText("Usted escogio tijeras, el pc escogio papel.\nGanador: Usuario");

                break;

                case 3:  
                    Resultado.setText("Usted escogio tijeras, el Pc escogio piedra.\nGanador: PC");


                break;

                case 4:  
                    Resultado.setText("Usted escogio tijeras, el Pc escogio lagarto.\nGanador: Usuario");


                break;

                case 5:  
                    Resultado.setText("Usted escogio tijeras, el Pc escogio spock.\nGanador: PC");

                break;    
            }        
    }//GEN-LAST:event_TijerasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Resultado.setText(" ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PapelActionPerformed
    int p = (int)Math.round(Math.random()*5); //se multiplica por 5 ya que deseamos tener valores entre 1 y 5 y no valores entre 0 y 1
    // es necesario hacer casting para redodear el math.random, ya que esta funcion nos retorna un valor double y necesitamos un entero
    
    if(p == 0)  //como no necesitamos tener en cuenta el 0, cava vez que en la función anterior el valor aleatorio sea 0 quedara en un 1 
    {
        p = p+1;
    }    
        switch (p) 
            {
                case 1:  
                    Resultado.setText("Usted escogio papel, el Pc escogio tijeras.\nGanador: PC");
                break;

                case 2:  
                    Resultado.setText("Usted escogio papel al igual que el pc. \nSe ha producido un empate");
                break;

                case 3:  
                    Resultado.setText("Usted escogio papel, el Pc escogio piedra.\nGanador: Usuario");
                break;
                    
                case 4:  
                    Resultado.setText("Usted escogio papel, el Pc escogio lagarto.\nGanador: PC");
                break;
                    
                case 5:  
                    Resultado.setText("Usted escogio papel, el Pc escogio spock.\nGanador: Usuario");
                break;    
            }
    }//GEN-LAST:event_PapelActionPerformed

    private void PiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiedraActionPerformed
        int p = (int)Math.round(Math.random()*5); //se multiplica por 5 ya que deseamos tener valores entre 1 y 5 y no valores entre 0 y 1
    // es necesario hacer casting para redodear el math.random, ya que esta funcion nos retorna un valor double y necesitamos un entero
    
    if(p == 0)  //como no necesitamos tener en cuenta el 0, cava vez que en la función anterior el valor aleatorio sea 0 quedara en un 1 
    {
        p = p+1;
    }    
        switch (p) 
            {
                case 1:  
                    Resultado.setText("Usted escogio piedra, el Pc escogio tijeras.\nGanador: Usuario");
                break;

                case 2:  
                    Resultado.setText("Usted escogio piedra, el Pc escogio papel. \nGanador: PC");
                break;

                case 3:  
                    Resultado.setText("Usted escogio piedra, al igual que el pc. \nSe ha producido un empate");
                break;
                    
                case 4:  
                    Resultado.setText("Usted escogio piedra, el Pc escogio lagarto.\nGanador: Usuario");
                break;
                    
                case 5:  
                    Resultado.setText("Usted escogio piedra, el Pc escogio spock.\nGanador: PC");
                break;    
            }
    }//GEN-LAST:event_PiedraActionPerformed

    private void LagartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LagartoActionPerformed
     int p = (int)Math.round(Math.random()*5); //se multiplica por 5 ya que deseamos tener valores entre 1 y 5 y no valores entre 0 y 1
    // es necesario hacer casting para redodear el math.random, ya que esta funcion nos retorna un valor double y necesitamos un entero
    
    if(p == 0)  //como no necesitamos tener en cuenta el 0, cava vez que en la función anterior el valor aleatorio sea 0 quedara en un 1 
    {
        p = p+1;
    }    
        switch (p) 
            {
                case 1:  
                    Resultado.setText("Usted escogio Lagarto, el Pc escogio tijeras.\nGanador: PC");
                break;

                case 2:  
                    Resultado.setText("Usted escogio Lagarto, el Pc escogio papel. \nGanador: Usuario");
                break;

                case 3:  
                    Resultado.setText("Usted escogio Lagarto, el Pc escogio piedra.\nGanador: PC");
                break;
                    
                case 4:  
                    Resultado.setText("Usted escogio Lagarto, al igual que el pc.\nSe ha producido un empate");
                break;
                    
                case 5:  
                    Resultado.setText("Usted escogio Lagarto, el Pc escogio Spock.\nGanador: Usuario");
                break;    
            }
    }//GEN-LAST:event_LagartoActionPerformed

    private void SpockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpockActionPerformed
    int p = (int)Math.round(Math.random()*5); //se multiplica por 5 ya que deseamos tener valores entre 1 y 5 y no valores entre 0 y 1
    // es necesario hacer casting para redodear el math.random, ya que esta funcion nos retorna un valor double y necesitamos un entero
    
    if(p == 0)  //como no necesitamos tener en cuenta el 0, cava vez que en la función anterior el valor aleatorio sea 0 quedara en un 1 
    {
        p = p+1;
    }    
        switch (p) 
            {
                case 1:  
                    Resultado.setText("Usted escogio Spock, el Pc escogio tijeras.\nGanador: Usuario");
                break;

                case 2:  
                    Resultado.setText("Usted escogio Spock, el Pc escogio papel. \nGanador: Pc");
                break;

                case 3:  
                    Resultado.setText("Usted escogio Spock, el Pc escogio piedra.\nGanador: Usuario");
                break;
                    
                case 4:  
                    Resultado.setText("Usted escogio Spock, el Pc escogio lagarto. \nGanador: Pc ");
                break;
                    
                case 5:  
                    Resultado.setText("Usted escogio Spock, al igual que el pc.\nSe ha producido un empate");
                break;    
            }
    }//GEN-LAST:event_SpockActionPerformed

    
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
            java.util.logging.Logger.getLogger(InterfazDeOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazDeOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazDeOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazDeOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazDeOpciones().setVisible(true);
                JOptionPane.showMessageDialog(null,"Para escojer una opción, haga click en la imagen deseada ");
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lagarto;
    private javax.swing.JButton Papel;
    private javax.swing.JButton Piedra;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JButton Spock;
    private javax.swing.JButton Tijeras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
