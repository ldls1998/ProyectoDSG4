/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuario;

import Sistema.Sistema_DatosUsuarios;

/**
 *
 * @author luigg
 */
public class FactoryAdministrador implements IFactoryUsuario{

    @Override
    public IUsuario crearUsuario(String... datosUsuario) throws Exception{
        if(datosUsuario.length != 2){
            throw new Exception("Error al ingresar datos de administrador");
        }
        
        String usuario = datosUsuario[0];
        String contraseña = datosUsuario[1];

        IUsuario admin = new Administrador(usuario, contraseña);

        Sistema_DatosUsuarios.admins.add(admin);
        
        return admin;
    }

}
