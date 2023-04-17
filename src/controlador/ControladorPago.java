/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Sistema.Sistema_DatosProductos;
import Sistema.Sistema_DatosUsuarios;   
import javax.swing.JOptionPane;
import modelo.compras.CarritoCompra;
import modelo.compras.Pago;
import modelo.usuario.Cliente;
import vista.vistaCarrito;
import vista.vistaPago;
import vista.vistaProductos;

/**  HOLA XD
 *
 * @author luigg cambios
 */
public class ControladorPago {
    vistaPago vista;
    CarritoCompra carrito;
    Cliente conectado;
    
    public ControladorPago(CarritoCompra carrito, int[] cantidadesAdquirirProdSeleccionado) {
        vista = new vistaPago();
        this.carrito = carrito;
        
        vista.btnCompletarPago.addActionListener((al)->{
            String numTarjeta = vista.txtNumTarjeta.getText();
            String clave = vista.txtClave.getText();
            String direccion = vista.txtDireccion.getText();
            
           
            if(!validarTarjeta(numTarjeta) || !validarClave(clave) || !validarDirección(direccion)){
                JOptionPane.showMessageDialog(vista, "Ingrese el formato correcto, intentelo nuevamente");
                return;
            }
            
            int confirmacion = JOptionPane.showConfirmDialog(vista, "¿Esta seguro de realizar la compra?","Confirmacion de compra",0);
            if(confirmacion != 0){
                return;
            }
            
            conectado = (Cliente) Sistema_DatosUsuarios.conectado;
            conectado.setPago(numTarjeta, clave, direccion);

            for(int i = 0; i < carrito.cantidadDeProductos(); i++){
                carrito.getProducto(i).ventaProducto(cantidadesAdquirirProdSeleccionado[i]);
                System.out.print(cantidadesAdquirirProdSeleccionado[i]);
            }
            JOptionPane.showMessageDialog(vista, "¡Gracias por comprar en SuperMarket!");
            volverAProductos();
        });
        
        vista.btnRegresar.addActionListener((as)->{
            regresar();
        });
        
    }
    
    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
        try{
            vista.txtDireccion.setText(conectado.getPago().getDireccionPago());
            vista.txtNumTarjeta.setText(conectado.getPago().getNroTarjeta());
        }catch(NullPointerException ne){
            
        }
        
    }
    
    private void volverAProductos(){
        vista.dispose();
        vistaProductos vSiguiente = new vistaProductos();
        Sistema_DatosProductos dProductos = new Sistema_DatosProductos();
        ControladorProductos cSiguiente = new ControladorProductos(vSiguiente, dProductos);
        cSiguiente.iniciar();
    }
    
    private void regresar(){
        vista.dispose();
        vistaCarrito vCarrito = new vistaCarrito();
        ControladorCarrito cCarrito = new ControladorCarrito(vCarrito, carrito);
        cCarrito.iniciar();
    }
    
    public boolean validarTarjeta(String dato){
        return dato.matches("[0-9]{16}");
    }
    
    public boolean validarClave(String dato){
        return dato.matches("[0-9]{3}");
    }
    
    public boolean validarDirección(String dato){
        return dato.matches("[a-zA-Z]{1,50}");
    }
}
