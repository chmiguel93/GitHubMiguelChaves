/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimiento;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;//importamos esta clase para restringir el numero de decimales que apareceran en la pantalla al imprimir un mensaje

/**
 *
 * @author miguel
 */
public class combustible extends javax.swing.JFrame {

    /**
     * Creates new form combustible
     */
     public String StringMarca;//en esta variable guardaremos la marca del vehiculo que le usuario ingresara
     public int intModelo;
     //en las siguientes variables guardamos el valor y la cantidad de gasolina, las definimos como double ya que nos dara una mayor exactitud cunado veamos cuantos galones tiene un vehiculo
     double doubleGasolina;
     double doubleGalones;
    public combustible() {
        initComponents();
        this.setLocation(350,000);
         //se asigna cada radio button a un group botton en este caso se llama 
        //intOpcGas
        intOpcGas.add(Extra);
        intOpcGas.add(Acpm);
        intOpcGas.add(Corriente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        intOpcGas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Gasolina = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        Corriente = new javax.swing.JRadioButton();
        Acpm = new javax.swing.JRadioButton();
        Extra = new javax.swing.JRadioButton();
        Aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        consultar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Rendimiento = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Combustible");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese la cantidad de dinero  en pesos sin puntos ni comas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(" que gastó en gasolina para su automovil");

        Gasolina.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        Gasolina.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                GasolinaFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("escoja el tipo de gasolina que utilizó para su vehiculo y a continuación click en aceptar");

        Corriente.setText("Corriente");

        Acpm.setText("Acpm");

        Extra.setText("Extra");

        Aceptar.setText("Aceptar");
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        resultado.setEditable(false);
        resultado.setBackground(new java.awt.Color(153, 204, 255));
        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane1.setViewportView(resultado);

        jLabel5.setText("Click en consultar para realizar una nueva consulta");

        consultar.setText("Consultar");
        consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mantenimiento/gasolina terminada.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");

        Rendimiento.setText("Rendimiento");
        Rendimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rendimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RendimientoActionPerformed(evt);
            }
        });

        jLabel7.setText("Click en Rendimiento para saber cuantos kilometros recorrera");

        jLabel8.setText("el vehiculo con esta cantidad de galones.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(329, 329, 329))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Gasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Corriente)
                        .addGap(311, 311, 311)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Aceptar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Acpm, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Extra, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1))
                                        .addGap(110, 110, 110)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))))
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(238, 238, 238))))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(Rendimiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(consultar)
                .addGap(187, 187, 187))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(Gasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Corriente)
                    .addComponent(Acpm)
                    .addComponent(Extra))
                .addGap(43, 43, 43)
                .addComponent(Aceptar)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(consultar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(Rendimiento)
                        .addGap(44, 44, 44))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if(Corriente.isSelected())
        {
            doubleGalones=doubleGasolina/8751;//8751 es el precio actual de la gasolina corriente en bogota, dividimos el nuemro ingresado por el usuario enter el valor y tenemos la cantidad de galoes que ingresaron, luego guardamos el resultado en intGalones
             DecimalFormat df = new DecimalFormat("0.000");// creamos una variable de la clase DecimalFormat para restringir la catidad de decimales que deseamos imprmir en pantalla, en este caso seran solo tres decimales  
            resultado.setText("MARCA: "+StringMarca+"\n\n"+"MODELO:  "+intModelo+"\n\n"+"La cantidad de gasolina que ingreso en su vehiculo\nes: "+df.format(doubleGalones)+" galones de gasolina");         
        //cuaado utilizamos esta linea de codigo--->df.format(doubleGalones); estamos asigandole la restriccion de decimales a la variable doubleGalones para que no imprima todos los decimaes completos 
        }else
            {
             if(Acpm.isSelected())
            {
                doubleGalones=doubleGasolina/8472;//8751 es el precio actual de la gasolina corriente en bogota, dividimos el nuemro ingresado por el usuario enter el valor y tenemos la cantidad de galoes que ingresaron, luego guardamos el resultado en intGalones
                DecimalFormat df = new DecimalFormat("0.000");// creamos una variable de la clase DecimalFormat para restringir la catidad de decimales que deseamos imprmir en pantalla, en este caso seran solo tres decimales  
                resultado.setText("MARCA: "+StringMarca+"\n\n"+"MODELO:  "+intModelo+"\n\n"+"La cantidad de gasolina que ingreso en su vehiculo\nes: "+df.format(doubleGalones)+" galones de gasolina");         
                //cuaado utilizamos esta linea de codigo--->df.format(doubleGalones); estamos asigandole la restriccion de decimales a la variable doubleGalones para que no imprima todos los decimaes completos 
            }else
                {
                 if(Extra.isSelected())
                    {
                        doubleGalones=doubleGasolina/10391;//8751 es el precio actual de la gasolina corriente en bogota, dividimos el nuemro ingresado por el usuario enter el valor y tenemos la cantidad de galoes que ingresaron, luego guardamos el resultado en intGalones
                        DecimalFormat df = new DecimalFormat("0.000");// creamos una variable de la clase DecimalFormat para restringir la catidad de decimales que deseamos imprmir en pantalla, en este caso seran solo tres decimales  
                        resultado.setText("MARCA: "+StringMarca+"\n\n"+"MODELO:  "+intModelo+"\n\n"+"La cantidad de gasolina que ingreso en su vehiculo\nes: "+df.format(doubleGalones)+" galones de gasolina");         
                        //cuaado utilizamos esta linea de codigo--->df.format(doubleGalones); estamos asigandole la restriccion de decimales a la variable doubleGalones para que no imprima todos los decimaes completos 
                    }else
                        {
                          JOptionPane.showMessageDialog(this, TipoVehiculo.getmensaje());//imprime el srtring del mensaje creado anteriormente si no se cumple ninguna condiccion anterior
                        }
                }
            }
    }//GEN-LAST:event_AceptarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoVehiculo().setVisible(true);
            }
        });
    }//GEN-LAST:event_consultarActionPerformed

    private void RendimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RendimientoActionPerformed
        //ESte boton nos permitira ir al formulario donde nos dara una opcion 
        //para saber el kilometraje recorrido con la cantidad de galones previamente
        //hallada
        //al igual que en el formulario Automovil y camioneta generamos una instancia 
//        en el formulario que vamos a llamar con los metodos requeridos para usar 
//        las variables de un formulario a otro
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                 setVisible(false);
                 Galones_Carro gc = new Galones_Carro();
                 gc.getgalones(doubleGalones);
                 gc.getmarca(StringMarca);
                 gc.getmodelo(intModelo);
                 gc.setVisible(true);
            }
        });// TODO add your handling code here:
    }//GEN-LAST:event_RendimientoActionPerformed

    private void GasolinaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GasolinaFocusLost
        try{ 
          doubleGasolina=Integer.parseInt(this.Gasolina.getText());
         }catch(Exception a)
         {
         JOptionPane.showMessageDialog(this, Automovil.getmjsNumero());
         }
    }//GEN-LAST:event_GasolinaFocusLost
    //A continuacion crearemos los metodos cada uno con un argumento el cual nos permitira obtener el valor que el 
    //usuario ingreso en el formulario Automovil
    
    public void getmarca(String marca)
    {
       StringMarca=marca;
    }
    public void getmodelo(int modelo)
    {
       intModelo=modelo;
    }
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
            java.util.logging.Logger.getLogger(combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new combustible().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JRadioButton Acpm;
    private javax.swing.JRadioButton Corriente;
    private javax.swing.JRadioButton Extra;
    private javax.swing.JFormattedTextField Gasolina;
    private javax.swing.JButton Rendimiento;
    private javax.swing.JButton consultar;
    private javax.swing.ButtonGroup intOpcGas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultado;
    // End of variables declaration//GEN-END:variables
}