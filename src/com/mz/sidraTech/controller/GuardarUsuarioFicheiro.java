/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mz.sidraTech.controller;

import com.mz.sidraTech.model.Usuario;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author celso
 */
public class GuardarUsuarioFicheiro {
    
    public static void guardar_lista_usuarios(List<Usuario> usuarios){
        File arquivo=new File("Usuarios.dat");
        try{
            arquivo.delete();
            arquivo.createNewFile();
            ObjectOutputStream escritor_objecto=new ObjectOutputStream(new FileOutputStream(arquivo));
            escritor_objecto.writeObject(usuarios);
            escritor_objecto.close();
            
        }catch(IOException e){
            System.err.println("IMPOSSIVEL GRAVAR FICHEIRO");
        }
        
    }
    
}
