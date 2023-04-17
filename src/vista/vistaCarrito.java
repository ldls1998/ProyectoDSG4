/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.ImageIcon;

/**
 *
 * @author OSCAR
 */
public class vistaCarrito extends javax.swing.JFrame {

    /**
     * Creates new form jfrLogin
     */
    public vistaCarrito() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        this.setLocationRelativeTo(this);
    }

    public static void main(String[] args) {
        vistaCarrito v = new vistaCarrito();
        v.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panCredencial = new javax.swing.JPanel();
        lblNom = new javax.swing.JLabel();
        lblCant = new javax.swing.JLabel();
        lblPre = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtPrecioTotal = new javax.swing.JTextField();
        spinnerCantidad = new javax.swing.JSpinner();
        lblOferta = new javax.swing.JLabel();
        tablaProducto = new javax.swing.JScrollPane();
        tblProd = new javax.swing.JTable();
        lblTipo1 = new javax.swing.JLabel();
        txtPrecioProd = new javax.swing.JTextField();
        lblNom1 = new javax.swing.JLabel();
        lblNom2 = new javax.swing.JLabel();
        panBotones = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panTitulo.setBackground(new java.awt.Color(255, 255, 255));
        panTitulo.setPreferredSize(new java.awt.Dimension(700, 100));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblTitulo.setText("Carrito de compras");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo2_.jpg"))); // NOI18N

        javax.swing.GroupLayout panTituloLayout = new javax.swing.GroupLayout(panTitulo);
        panTitulo.setLayout(panTituloLayout);
        panTituloLayout.setHorizontalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTituloLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        panTituloLayout.setVerticalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo)
                    .addComponent(jLabel1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(panTitulo, java.awt.BorderLayout.PAGE_START);

        panCredencial.setBackground(new java.awt.Color(255, 255, 255));
        panCredencial.setEnabled(false);
        panCredencial.setPreferredSize(new java.awt.Dimension(700, 500));

        lblNom.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNom.setText("<html><h2>Producto Seleccionado</h2></html>");

        lblCant.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCant.setText("Cantidad");

        lblPre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPre.setText("Precio Total:");

        lblTipo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTipo.setText("Tipo:");

        txtNom.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNom.setEnabled(false);

        txtTipo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTipo.setEnabled(false);

        txtPrecioTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPrecioTotal.setEnabled(false);

        spinnerCantidad.setModel(new javax.swing.SpinnerNumberModel());
        spinnerCantidad.setEditor(new javax.swing.JSpinner.NumberEditor(spinnerCantidad, ""));
        spinnerCantidad.setFocusable(false);

        lblOferta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblOferta.setText("!Oferta!");

        tblProd.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProducto.setViewportView(tblProd);

        lblTipo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTipo1.setText("Precio del producto:");

        txtPrecioProd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPrecioProd.setEnabled(false);

        lblNom1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNom1.setText("<html><h1>Productos</h1></html>");

        lblNom2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNom2.setText("Nombre");

        javax.swing.GroupLayout panCredencialLayout = new javax.swing.GroupLayout(panCredencial);
        panCredencial.setLayout(panCredencialLayout);
        panCredencialLayout.setHorizontalGroup(
            panCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCredencialLayout.createSequentialGroup()
                .addGroup(panCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCredencialLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblCant, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(lblPre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCredencialLayout.createSequentialGroup()
                        .addGroup(panCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panCredencialLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblTipo)
                                        .addComponent(txtNom)
                                        .addComponent(lblNom)
                                        .addComponent(txtTipo)
                                        .addComponent(lblTipo1)
                                        .addComponent(txtPrecioProd))
                                    .addComponent(lblNom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panCredencialLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(lblOferta)))
                        .addGroup(panCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panCredencialLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(tablaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCredencialLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panCredencialLayout.setVerticalGroup(
            panCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCredencialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCredencialLayout.createSequentialGroup()
                        .addComponent(lblOferta)
                        .addGap(34, 34, 34)
                        .addComponent(lblNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lblNom2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(lblTipo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCredencialLayout.createSequentialGroup()
                        .addComponent(lblNom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tablaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spinnerCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPre)))
                .addGap(20, 20, 20))
        );

        jScrollPane1.setViewportView(panCredencial);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panBotones.setBackground(new java.awt.Color(255, 255, 255));
        panBotones.setPreferredSize(new java.awt.Dimension(700, 100));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRegresar_.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnComprar.setBackground(new java.awt.Color(0, 0, 250));
        btnComprar.setForeground(new java.awt.Color(250, 250, 250));
        btnComprar.setText("Comprar");

        javax.swing.GroupLayout panBotonesLayout = new javax.swing.GroupLayout(panBotones);
        panBotones.setLayout(panBotonesLayout);
        panBotonesLayout.setHorizontalGroup(
            panBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotonesLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        panBotonesLayout.setVerticalGroup(
            panBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotonesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(panBotones, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnComprar;
    public javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNom1;
    private javax.swing.JLabel lblNom2;
    public javax.swing.JLabel lblOferta;
    private javax.swing.JLabel lblPre;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipo1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panBotones;
    public javax.swing.JPanel panCredencial;
    private javax.swing.JPanel panTitulo;
    public javax.swing.JSpinner spinnerCantidad;
    public javax.swing.JScrollPane tablaProducto;
    public javax.swing.JTable tblProd;
    public javax.swing.JTextField txtNom;
    public javax.swing.JTextField txtPrecioProd;
    public javax.swing.JTextField txtPrecioTotal;
    public javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
