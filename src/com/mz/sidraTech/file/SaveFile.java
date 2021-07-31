/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mz.sidraTech.file;

import com.mz.sidraTech.model.Book;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author celso
 */
public class SaveFile {
    
    public static void guardarListaUsuarios(List<Book> usuarios){
        File arquivo=new File("Usuarios.dat");
        try{
            arquivo.delete();
            arquivo.createNewFile();
            ObjectOutputStream escritor=new ObjectOutputStream(new FileOutputStream(arquivo));
            escritor.writeObject(usuarios);
            escritor.close();
            
        }catch(IOException e){
            System.err.println("IMPOSSIVEL GRAVAR FICHEIRO");
        }
        
    }
    
}
