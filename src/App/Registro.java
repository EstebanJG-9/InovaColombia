/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import javax.swing.ButtonGroup;

/**
 *
 *juan esteban gomez pachon 
 *innova colombia 
 *Estructura de datos 
 *juanesteban.gomez2002@gmail.com
 */
public class Registro extends javax.swing.JFrame {

   
    ButtonGroup btnGr ;
    public Registro() {
        initComponents();
        setIconImage(getIconImage());// agrega a la interfaz el icono 
        this.setLocationRelativeTo(null);
        
        this.getContentPane().setBackground(Color.white);
        txtcod.setVisible(false);
        //this.getContentPane().setBackground(Color.red);
        jPanel1.setBackground(Color.white);
        tablaregistro.setBackground(Color.white);
         // se crea  los botones
        // para que me agrege con .add masculino , femenino 
        
        btnGr = new ButtonGroup();
        btnGr.add(rbmasculino);
        btnGr.add(rbfemenino);
        cargartabla();
        // se ejecutara para cargar la tabla siempre que inicie el programa
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaregistro = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbmasculino = new javax.swing.JRadioButton();
        rbfemenino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtcargo = new javax.swing.JTextField();
        txtdepartamento = new javax.swing.JTextField();
        txtciudad = new javax.swing.JTextField();
        txtzona = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btoguardar = new javax.swing.JButton();
        btomodificar = new javax.swing.JButton();
        btoeliminar = new javax.swing.JButton();
        txtcod = new javax.swing.JTextField();
        btosalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen1.png"))); // NOI18N

        tablaregistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Nombre", "CC", "Sexo", "Cargo", "DPTO", "Ciudad", "Zona", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaregistroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaregistro);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nombre ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Cargo ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Sexo ");

        rbmasculino.setText("Masculino");

        rbfemenino.setText("Femenino");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("DPTO ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Ciudad ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Zona ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Fecha ");

        txtnombre.setBorder(null);

        txtcargo.setBorder(null);

        txtdepartamento.setBorder(null);

        txtciudad.setBorder(null);

        txtzona.setBorder(null);

        txtfecha.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("CC ");

        txtcedula.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1)
                                .addComponent(txtcedula, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbmasculino)
                            .addComponent(rbfemenino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtzona, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel9)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbmasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbfemenino)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(2, 2, 2)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtzona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btoguardar.setText("Guardar");
        btoguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoguardarActionPerformed(evt);
            }
        });

        btomodificar.setText("Modificar");
        btomodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btomodificarActionPerformed(evt);
            }
        });

        btoeliminar.setText("Eliminar");
        btoeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoeliminarActionPerformed(evt);
            }
        });

        btosalir.setText("Salir");
        btosalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btosalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btoguardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btomodificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btoeliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btosalir)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btoguardar)
                            .addComponent(btomodificar)
                            .addComponent(btoeliminar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btosalir)
                        .addGap(60, 60, 60))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      @Override
      // se usa Image y TOolkit para indicar donde esta la imagen  para agregarla ala interfaz de icono 
    public Image getIconImage(){
        Image retValue= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/imagen2.png"));
        return retValue;
        
    }
    // boton de guardar el registro 
    private void btoguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoguardarActionPerformed
    
        
       //int codigo = Integer.parseInt(txtcodigo.getText());
       String nombre = txtnombre.getText();
       int cedula = Integer.parseInt(txtcedula.getText());
       String cargo = txtcargo.getText();
       String DPTO = txtdepartamento.getText();
       String ciudad = txtciudad.getText();
       String zona = txtzona.getText();
       String fecha = txtfecha.getText();
       String sexo;
       
          if(rbmasculino.isSelected()== true){
           sexo="M";
           
       }
       else if(rbfemenino.isSelected()== true){
           
           sexo= "F";
           
       }
       
       else{
           sexo= "M";
           
           
       }
          
           try{
           Connection con =  Conexion.getConexion();
           PreparedStatement ps = con.prepareStatement("INSERT INTO registro (nombre,cedula,sexo,cargo,DPTO,ciudad,zona,fecha,activo) VALUES(?,?,?,?,?,?,?,?,?)");
           
         
           ps.setString(1, nombre);
           ps.setInt(2, cedula);
           ps.setString(3, sexo);
           ps.setString(4, cargo);
           ps.setString(5, DPTO);
           ps.setString(6, ciudad);
           ps.setString(7, zona);
           ps.setString(8, fecha);
           ps.setInt(9, 1);
           
            // ps.execute udate // se guardan
           ps.executeUpdate();
           // se guarda el registro de todo los datos en la intefaz
           // y se agrega el metodo limpiar para borrar todo al precionarlo
           JOptionPane.showMessageDialog(null, "Registro guardado");
          // archivo1();// base de datos .txt
         
           // se agrega el metodo para cargar la tabla
           cargartabla();
           
       }catch(SQLException e){
           // si no se cumplen todos los datos ingresados dara una excepcion con sqlException
           // y un mensaje por pantalla 
           
            JOptionPane.showMessageDialog(null, e.toString());
            
       }
        
    }//GEN-LAST:event_btoguardarActionPerformed

    private void btomodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btomodificarActionPerformed
       
        // boton modificar la tabla 
        // modifica , codigo , nombre,cedula,cargo,DPTO,ciudad ,zona,fecha,sexo, de la tabla 
      int cod = Integer.parseInt(txtcod.getText());
       String nombre = txtnombre.getText();
       int cedula = Integer.parseInt(txtcedula.getText());
       String cargo = txtcargo.getText();
       String DPTO = txtdepartamento.getText();
       String ciudad = txtciudad.getText();
       String zona = txtzona.getText();
       String fecha = txtfecha.getText();
       String sexo;
       
          if(rbmasculino.isSelected()== true){
           sexo="M";
           
       }
       else if(rbfemenino.isSelected()== true){
           
           sexo= "F";
           
       }
       
       else{
           sexo= "M";
           
           
       }
          
         // se crea un try catch para  
       // se conecta a la tabla registro de la base de datos sql serverd
       //preparedstatment se insertan dichos datos a la base de datos 
       try{
           Connection con =  Conexion.getConexion();// conexion a  la clase conexion y a la base de datos InnovaColombia
          // PreparedStatement ps = con.prepareStatement("UPDATE alumnos SET matricula=?,nombre=?,edad=?,sexo=?,email=? WHERE id=?");
          
          PreparedStatement ps = con.prepareStatement("UPDATE registro SET nombre=?,cedula=?,sexo=?,cargo=?,DPTO=?,ciudad=?,zona=?,fecha=? WHERE cod =? ");
           
         
           ps.setString(1, nombre);
           ps.setInt(2, cedula);
           ps.setString(3, sexo);
           ps.setString(4, cargo);
           ps.setString(5, DPTO);
           ps.setString(6, ciudad);
           ps.setString(7, zona);
           ps.setString(8, fecha);
           ps.setInt(9, cod);
           
           
            // ps.execute udate // se guardan
           ps.executeUpdate();
           // se guarda el registro de todo los datos en la intefaz
           // y se agrega el metodo limpiar para borrar todo al precionarlo
           JOptionPane.showMessageDialog(null, "Registro modificado");
           //limpiar();
           // se agrega el metodo para cargar la tabla
           cargartabla();
       }catch(SQLException e){
           // si no se cumplen todos los datos ingresados dara una excepcion con sqlException
           // y un mensaje por pantalla 
           
            JOptionPane.showMessageDialog(null, e.toString());
            
       }
    }//GEN-LAST:event_btomodificarActionPerformed

    private void btoeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoeliminarActionPerformed
     // boton eliminar 
     //  String nombre = txtnombre.getText();
     //   int codigo = Integer.parseInt(txtcodigo.getText());
      
      int cod =Integer.parseInt(txtcod.getText()); 
        try{
           Connection con =  Conexion.getConexion();
           PreparedStatement ps = con.prepareStatement("UPDATE  registro SET activo=0 WHERE cod=?  ");
           
          
            ps.setInt(1, cod);
            // ps.execute udate // se guardan
           ps.executeUpdate();
           // se guarda el registro de todo los datos en la intefaz
           // y se agrega el metodo limpiar para borrar todo al precionarlo
           JOptionPane.showMessageDialog(null, "Registro Eliminado");
           //limpiar();
           // se agrega el metodo para cargar la tabla
           cargartabla();
           limpiar();
       }catch(SQLException e){
           // si no se cumplen todos los datos ingresados dara una excepcion con sqlException
           // y un mensaje por pantalla 
           
            JOptionPane.showMessageDialog(null, e.toString());
            
       }
       
        
        
        
        
    }//GEN-LAST:event_btoeliminarActionPerformed

    private void tablaregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaregistroMouseClicked
        // clic al tocar la tabla para guardar los datos 
               try{
        // dectetacra fila que el usuario esta selecionando 
        int fila =tablaregistro.getSelectedRow();  // getselectrow me muestra lo que el usuario seleciona con el mause
        int cod = Integer.parseInt(tablaregistro.getValueAt(fila, 0).toString());  // parseo  para las filas
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
           // llamamos de nuevo la tabla alumnos 
           // selecionamos los datos  para mostralos en la interzas
            ps = con.prepareStatement("SELECT nombre,cedula,sexo,cargo,DPTO,ciudad,zona,fecha FROM registro  WHERE cod=? ");
          // guardar
          // rellena datos en la columna
            ps.setInt(1, cod);
            rs = ps.executeQuery();
           
            while(rs.next()){
                
                 txtcod.setText(String.valueOf(cod));
                txtnombre.setText(rs.getString("nombre"));
                txtcedula.setText(rs.getString("cedula"));
                txtcargo.setText(rs.getString("cargo"));
                txtdepartamento.setText(rs.getString("DPTO"));
                txtciudad.setText(rs.getString("ciudad"));
                txtzona.setText(rs.getString("zona"));
                txtfecha.setText(rs.getString("fecha"));
                // si es masuclino la eleccion 
                if(rs.getString("sexo").equals("M")){
                    rbmasculino.setSelected(true);
                  // si es femenino la eleccion se usa un . equals para comparar 
                }else if (rs.getString("sexo").equals("F"))
                    rbfemenino.setSelected(true);
            }

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
    }//GEN-LAST:event_tablaregistroMouseClicked
   /// boton salir cierra la interzas
    private void btosalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btosalirActionPerformed
      // parametro para cerrar la interfaz
     dispose();      
    }//GEN-LAST:event_btosalirActionPerformed

//    private void limpiar(){
//       txtcodigo.setText("");
//       txtnombre.setText("");
//       txtcedula.setText("");
//       txtcargo.setText("");
//       txtdepartamento.setText("");
//       txtciudad.setText("");
//       txtzona.setText("");
//       txtfecha.setText("");
//       // con el boton se limpiaran todos los datos btnGr
//       btnGr.clearSelection();
//   
//   }
//    // me permite mostrar los datos en la tabla de registro
   private void limpiar(){
       txtcod.setText("");
       txtnombre.setText("");
       txtcedula.setText("");
       txtcargo.setText("");
       txtdepartamento.setText("");
       txtciudad.setText("");
       txtzona.setText("");
       txtzona.setText("");
       txtfecha.setText("");
       // con el boton se limpiaran todos los datos btnGr
       btnGr.clearSelection();
       // se selecionn y se borras
   }
   private void cargartabla(){
        // toma el diseño agregado del formulario de la tabla de la interfaz
       DefaultTableModel modelotabla =  (DefaultTableModel) tablaregistro.getModel();
       // siempre que se ejecute borra la filas de la tabla
       modelotabla.setRowCount(0);
       PreparedStatement ps;
       // se importa el preparedstatment
       //  resultset 
       // resultsetmetadata 
       // todos son de sql server y  se le agrega una variable 
       ResultSet  rs;
       ResultSetMetaData rsmd;
       int columna;
       
       // cambiar el tamaño de la tabla 
       //codigo 10
       //nombre 100
       //cedula 50
       //sexo   30
       //cargo  30
       //DPTO   50
       //ciudad 50
       //zona   50
       //fecha  50
       int[]ancho= {12,55,50,30,30,50,50,50,50};
       // con siclo for es para que vaya asignando a cada columna el tamaño
       for(int j = 0;j< tablaregistro.getColumnCount();j++){ // el incremento de la tabla y poscion asignada 
           tablaregistro.getColumnModel().getColumn(j).setPreferredWidth(ancho[j]);// se decala el array 
       }
       
       
       try{
           // usamos un try catch para llamar a la  base de datos
           // la conectamos con connetion  con
      
           Connection con = Conexion.getConexion();
           // llamamos de nuevo la tabla alumnos 
           // selecionamos los datos  para mostralos en la interzas
          ps = con.prepareStatement("SELECT cod ,nombre,cedula,sexo,cargo,DPTO,ciudad,zona,fecha FROM registro WHERE activo=1 ");
          // guardar
          // rellena datos en la columna
          rs= ps.executeQuery();// si todo se ingresa bien no abra una excepcion 
          rsmd= rs.getMetaData();
          columna= rsmd.getColumnCount();
          
          // se crea un siclo while
          while(rs.next()){
              // se crea fia con un metodo object con las columas
              
              Object[] fila = new Object[columna];
              // se crea un siclo for con int indice mayor a oclumas 
              for(int indice = 0;indice<columna;indice++){
                  // y el indice vas ser mas el 1 
                  fila[indice]= rs.getObject(indice +1);
                  
                  
              }
              // me agrega la fila 
              modelotabla.addRow(fila);
              
              
          }
          
          
           // si no e cumple el error sera una exception de sql 
       } catch(SQLException e){
           JOptionPane.showMessageDialog(null, e.toString());
           
       }
   }
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoeliminar;
    private javax.swing.JButton btoguardar;
    private javax.swing.JButton btomodificar;
    private javax.swing.JButton btosalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JRadioButton rbfemenino;
    private javax.swing.JRadioButton rbmasculino;
    private javax.swing.JTable tablaregistro;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtdepartamento;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtzona;
    // End of variables declaration//GEN-END:variables
}
