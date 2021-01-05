/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mz.sidraTech.controller;

import com.mz.sidraTech.model.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author celso
 */
public class ReadFile {
    
    
    public static List<Usuario> lerUsuarios(){
        List<Usuario> usuarios=new ArrayList();
        File file=new File("Usuarios.dat");
        try{
            ObjectInputStream leitor=new ObjectInputStream(new FileInputStream(file));
            usuarios=(ArrayList<Usuario>)leitor.readObject();
            leitor.close();
        }catch(IOException|ClassNotFoundException e){
            System.out.println("Impossivel acessar o directorio");
        }
        return usuarios;
    }
    
}
