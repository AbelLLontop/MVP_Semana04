/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.table.DefaultTableModel;
import presentador.PRegistro;

/**
 *
 * @author ABEL
 */
public class VRegistro_Swing extends javax.swing.JFrame implements VRegistro{

    private PRegistro p_registro;

    public VRegistro_Swing() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        input_nombre = new javax.swing.JTextField();
        input_nota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_quitar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        input_codigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        input_promedioTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        input_mejorAlumno_nombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        input_mejorAlumno_nota = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(780, 417));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(27, 53, 71));
        jPanel2.setForeground(new java.awt.Color(22, 63, 83));

        jLabel1.setBackground(new java.awt.Color(247, 247, 247));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Semana04 - MVP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(683, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 780, 20));

        jPanel3.setBackground(new java.awt.Color(27, 53, 71));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(247, 247, 247));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("REGISTRO DE NOTAS");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_nombre.setBackground(new java.awt.Color(238, 238, 238));
        input_nombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        input_nombre.setForeground(new java.awt.Color(19, 19, 19));
        input_nombre.setText("jTextField1");
        input_nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
        jPanel4.add(input_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 244, -1));

        input_nota.setBackground(new java.awt.Color(238, 238, 238));
        input_nota.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        input_nota.setForeground(new java.awt.Color(19, 19, 19));
        input_nota.setText("jTextField1");
        input_nota.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
        jPanel4.add(input_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, -1));

        jLabel4.setBackground(new java.awt.Color(227, 58, 141));
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(9, 9, 9));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Código");
        jLabel4.setAlignmentY(0.0F);
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel5.setBackground(new java.awt.Color(227, 58, 141));
        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(9, 9, 9));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre");
        jLabel5.setAlignmentY(0.0F);
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        btn_quitar.setBackground(new java.awt.Color(168, 56, 56));
        btn_quitar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_quitar.setForeground(new java.awt.Color(247, 247, 247));
        btn_quitar.setText("Quitar");
        btn_quitar.setAlignmentY(0.0F);
        btn_quitar.setBorder(null);
        btn_quitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_quitar.setFocusPainted(false);
        btn_quitar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(btn_quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 100, 40));

        btn_agregar.setBackground(new java.awt.Color(124, 168, 57));
        btn_agregar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(247, 247, 247));
        btn_agregar.setText("Añadir");
        btn_agregar.setAlignmentY(0.0F);
        btn_agregar.setBorder(null);
        btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar.setFocusPainted(false);
        btn_agregar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 40));

        input_codigo.setBackground(new java.awt.Color(238, 238, 238));
        input_codigo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        input_codigo.setForeground(new java.awt.Color(19, 19, 19));
        input_codigo.setText("jTextField1");
        input_codigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
        jPanel4.add(input_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 94, -1));

        jLabel6.setBackground(new java.awt.Color(227, 58, 141));
        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(9, 9, 9));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nota");
        jLabel6.setAlignmentY(0.0F);
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jSeparator1.setBackground(new java.awt.Color(230, 230, 230));
        jSeparator1.setForeground(new java.awt.Color(229, 229, 229));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 320, 290));

        tabla.setBackground(new java.awt.Color(251, 251, 251));
        tabla.setForeground(new java.awt.Color(25, 25, 25));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setGridColor(new java.awt.Color(55, 55, 55));
        jScrollPane1.setViewportView(tabla);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 440, 250));

        input_promedioTotal.setBackground(new java.awt.Color(238, 238, 238));
        input_promedioTotal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        input_promedioTotal.setForeground(new java.awt.Color(19, 19, 19));
        input_promedioTotal.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
        jPanel5.add(input_promedioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 100, 40));

        jLabel3.setBackground(new java.awt.Color(227, 58, 141));
        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(9, 9, 9));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nota");
        jLabel3.setAlignmentY(0.0F);
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, 10));

        jLabel7.setBackground(new java.awt.Color(227, 58, 141));
        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(9, 9, 9));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Promedio del Curso");
        jLabel7.setAlignmentY(0.0F);
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, 20));

        jLabel8.setBackground(new java.awt.Color(227, 58, 141));
        jLabel8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(9, 9, 9));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nombre");
        jLabel8.setAlignmentY(0.0F);
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, 10));

        input_mejorAlumno_nombre.setBackground(new java.awt.Color(238, 238, 238));
        input_mejorAlumno_nombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        input_mejorAlumno_nombre.setForeground(new java.awt.Color(19, 19, 19));
        input_mejorAlumno_nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
        jPanel5.add(input_mejorAlumno_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 170, 30));

        jLabel9.setBackground(new java.awt.Color(227, 58, 141));
        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(9, 9, 9));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Mejor Alumno");
        jLabel9.setAlignmentY(0.0F);
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, 20));

        input_mejorAlumno_nota.setBackground(new java.awt.Color(238, 238, 238));
        input_mejorAlumno_nota.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        input_mejorAlumno_nota.setForeground(new java.awt.Color(19, 19, 19));
        input_mejorAlumno_nota.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
        jPanel5.add(input_mejorAlumno_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 70, 30));

        jSeparator2.setBackground(new java.awt.Color(230, 230, 230));
        jSeparator2.setForeground(new java.awt.Color(229, 229, 229));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 18, 60));

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("MENSAJE: Error de sintaxis");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 250, 60));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 780, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
       p_registro.agregar();
    }//GEN-LAST:event_btn_agregarActionPerformed

    /**
     * @param args the command line arguments
     */
 public void iniciar() {
       pack();
       setLocationRelativeTo(null);
       setVisible(true);
       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_quitar;
    private javax.swing.JTextField input_codigo;
    private javax.swing.JTextField input_mejorAlumno_nombre;
    private javax.swing.JTextField input_mejorAlumno_nota;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JTextField input_nota;
    private javax.swing.JTextField input_promedioTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setPresentador(PRegistro p_registro) {
        this.p_registro = p_registro;
    }

    @Override
    public String getIngresoCodigo() {
  
        String codigo = input_codigo.getText();
        return codigo;
    }

    @Override
    public String getIngresoNombre() {
        String nombre = input_nombre.getText();
        return nombre;
    }

    @Override
    public double getIngresoNota() {
        double nota = Double.parseDouble(input_nota.getText());
        return nota;
    }

    @Override
    public String getCodeActualTableSeleccionada() {
       // int positionElemento = tabla.getSelectedRow();
        return null;
    }

    @Override
    public void showSalidaBestAlumno(String nombre, double nota) {
        input_mejorAlumno_nombre.setText(nombre);
        input_mejorAlumno_nota.setText(Double.toString(nota));    
    }

    @Override
    public void showPromedioCurso(double promedio) {
        input_promedioTotal.setText(Double.toString(promedio));
    }

    @Override
    public void showAllNotas(String[] cabecera, Object[][] contenido) {
        this.tabla.setModel(new DefaultTableModel(contenido, cabecera));
    }
}
