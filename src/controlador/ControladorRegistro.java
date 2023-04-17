/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Sistema.Sistema_DatosUsuarios;
import javax.swing.JOptionPane;
import modelo.usuario.FactoryCliente;
import vista.vistaLogin;
import vista.vistaRegistro;

/**
 *
 * @author OSCAR
 */
public class ControladorRegistro {

    private vistaRegistro vista;

    public ControladorRegistro(vistaRegistro vista, Sistema_DatosUsuarios sistemaUsuario) {
        this.vista = vista;
        this.vista.btnRegistrar.addActionListener(e -> {
            String nombre = vista.txtNombre.getText();
            String apellido = vista.txtApellido.getText();
            String user = vista.txtUsuario.getText();
            String contraseña = vista.txtContraseña.getText();
            String correo = vista.txtCorreo.getText();
            String direccion = vista.txtDireccion.getText();
            String telefono = vista.txtTelefono.getText();

            if (datosVacios(nombre, apellido, user, contraseña, correo, direccion, telefono) || !validarNombre(nombre) || !validarApellido(apellido) || !validarTelefono(telefono)){
                JOptionPane.showMessageDialog(vista, "Utilize el formato correcto, intentelo nuevamente");
                return;
            }

            if (!sistemaUsuario.validarDatos(user)) {
                JOptionPane.showMessageDialog(vista, "El usuario ya existe, intentelo nuevamente");
                return;
            }
            try {
                FactoryCliente factoryCliente = new FactoryCliente();
                factoryCliente.crearUsuario(nombre, apellido, user, contraseña, direccion, telefono, correo);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(vista, "Cuenta creada correctamente");
            vista.dispose();
            vistaLogin abrir = new vistaLogin();
            Sistema_DatosUsuarios s = new Sistema_DatosUsuarios();
            ControladorLogin cabrir = new ControladorLogin(abrir, s);
            cabrir.iniciar();

        });

        this.vista.btnVolver.addActionListener(e -> {
            vista.dispose();
            vistaLogin abrir = new vistaLogin();
            Sistema_DatosUsuarios s = new Sistema_DatosUsuarios();
            ControladorLogin cAbrir = new ControladorLogin(abrir, s);
            cAbrir.iniciar();
        });

    }

    private boolean datosVacios(String nombre, String apellido, String user, String contraseña,
                                String correo, String direccion, String telefono){

        String campo = "";
        if (contraseña.isEmpty()){
            campo = "contraseña";
        }
        if (correo.isEmpty()){
            campo = "correo";
        }
        if (direccion.isEmpty()){
            campo = "direccion";
        }
        if (telefono.isEmpty()){
            campo = "telefono";
        }
        if (nombre.isEmpty()){
            campo = "nombre";
        }
        if (apellido.isEmpty()){
            campo = "apellido";
        }
        if (user.isEmpty()){
            campo = "usuario";
        }

        if(!campo.isEmpty()){
            JOptionPane.showMessageDialog(vista, "Campo " + campo + " vacio, ingrese sus datos nuevamente");
            return true;
        }else{
            return false;
        }

    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    public boolean validarTelefono(String dato){ //YA
        return dato.matches("[0-9]{9}");
    }
    
    public boolean validarApellido(String dato){ //YA
        return dato.matches("[a-zA-Z]{1,50}");
    }
    
    public boolean validarNombre(String dato){ //YA
        return dato.matches("[a-zA-Z]{1,50}");
    }
    
    

}
