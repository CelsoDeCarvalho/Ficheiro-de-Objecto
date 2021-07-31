/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mz.sidraTech.view;

import com.mz.sidraTech.file.ReadFile;
import java.util.Scanner;

/**
 *
 * @author De Carvalho
 */
public class ListPage {
    
    Scanner input_reader;

    public ListPage() {
        list();
    }
    
    public void list(){
        input_reader=new Scanner(System.in);
        int choice;
        
        System.out.println("-----------------------------------");
        System.out.println("|            Books List            |");
        System.out.println("-----------------------------------\n\n\n");
         
        
        for(int i=0;i<ReadFile.readBooks().size();i++){
            System.out.println("["+(1+i)+"]----------------------------------- \n"+ReadFile.readBooks().get(i));
            System.out.println("-----------------------------------\n\n");
        }
        
        System.out.println("SELECT A BOOK/ 0 TO QUIT");
        System.out.print("=> ");
        choice=input_reader.nextInt();
        
    }
    
}
