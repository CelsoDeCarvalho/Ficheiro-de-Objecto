package com.mz.sidraTech.file;

import com.mz.sidraTech.model.Book;
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
    
    
    public static List<Book> readBooks(){
        List<Book> books=new ArrayList();
        File file=new File("books.dat");
        try{
            try (ObjectInputStream leitor = new ObjectInputStream(new FileInputStream(file))) {
                books=(ArrayList<Book>)leitor.readObject();
            }
        }catch(IOException|ClassNotFoundException e){
            System.err.println(e+" IMPOSSIVEL LER OS LIVROS");
        }
        return books;
    }
    
    public static boolean fileExist(){
        File file=new File("books.dat");
        return file.exists();
    }
    
}
