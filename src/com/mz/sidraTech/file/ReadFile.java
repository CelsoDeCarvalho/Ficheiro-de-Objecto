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
    
    
    public static List<Book> lerUsuarios(){
        List<Book> usuarios=new ArrayList();
        File file=new File("Usuarios.dat");
        try{
            ObjectInputStream leitor=new ObjectInputStream(new FileInputStream(file));
            usuarios=(ArrayList<Book>)leitor.readObject();
            leitor.close();
        }catch(IOException|ClassNotFoundException e){
            System.out.println("Impossivel acessar o directorio");
        }
        return usuarios;
    }
    
}
