/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mz.sidraTech.view;

import com.mz.sidraTech.helper.DataConverter;
import com.mz.sidraTech.model.Book;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author De Carvalho
 */
public class RegistrationPage {
    
    Scanner input_reader;
    private Book book;
    
    public void form(){
        input_reader=new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("|        Books Registration        |");
        System.out.println("-----------------------------------");
        
        System.out.println("ENTER AUTHOR NAME: ");
        String author_name=input_reader.next();
        
        System.out.println("ENTER BOOK TITLE: ");
        String book_title=input_reader.next();
        
        System.out.println("ENTER A MANUFACURED BOOK DATE: ");
        String book_date_mft=input_reader.next();
        
        System.out.println("ENTER BOOK TOTAL PAGE NUMBER: ");
        int total_page=input_reader.nextInt();
        
        LocalDate date=new DataConverter().stringToDate(book_date_mft);
        
        book=new Book(author_name, book_title, date, total_page);
    }

    public RegistrationPage() {
        form();
    }
      
}
