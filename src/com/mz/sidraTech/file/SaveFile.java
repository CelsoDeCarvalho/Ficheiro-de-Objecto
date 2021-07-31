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
    
    public static void saveBooks(List<Book> books){
        File file=new File("books.dat");
        try{
            file.delete();
            file.createNewFile();
            try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(file))) {
                escritor.writeObject(books);
            }
            
        }catch(IOException e){
            System.err.println(e+" IMPOSSIVEL GRAVAR OS LIVROS");
        }finally{
            
        }
        
    }
    
}
