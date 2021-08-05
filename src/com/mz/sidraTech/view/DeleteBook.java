/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mz.sidraTech.view;

import com.mz.sidraTech.file.ReadFile;
import com.mz.sidraTech.file.SaveFile;
import com.mz.sidraTech.model.Book;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author De Carvalho
 */
public class DeleteBook {
    
    Scanner input_reader;

    public DeleteBook(){
        list();
    }

    List<Book> list_book;
    
    public void list(){
        input_reader=new Scanner(System.in);
        int choice;
        list_book=ReadFile.readBooks();
        
        System.out.println("-----------------------------------");
        System.out.println("|            Books List            |");
        System.out.println("-----------------------------------\n\n\n");
         
        
        for(int i=0;i<list_book.size();i++){
            System.out.println("["+(1+i)+"]----------------------------------- \n"+list_book.get(i));
            System.out.println("-----------------------------------\n\n");
        }
        
        System.out.println("SELECT A POSITION BOOK TO DELETE IT/ 0 TO QUIT");
        System.out.print("=> ");
        choice=input_reader.nextInt();
        
        
        try{
            list_book.remove(choice-1);
             System.out.println("LIVRO0 APAGADO COM SUCESSO");
            SaveFile.saveBooks(list_book);
        }catch(Exception e){
            System.err.println(e+" IMPOSSIVEL APAGAR O LIVRO0");
        }
        
        
    }
}
