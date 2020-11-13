/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mz.sidraTech.lista;

import com.mz.sidraTech.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author celso
 */
public class ListaUsuarios {
    
    public static List<Usuario> usuarios=new ArrayList<>();
    
    public String registar_usuario(Usuario usuario){
        usuarios.add(usuario);
        return usuario.getNome()+" FOI REGISTADO AO BANCO";
    }
    
    public void apagar_usuario(){
        
    }
}
