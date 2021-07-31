/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mz.sidraTech.view;

import com.mz.sidraTech.file.ReadFile;
import com.mz.sidraTech.file.SaveFile;
import com.mz.sidraTech.helper.DataConverter;
import com.mz.sidraTech.model.Book;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author De Carvalho
 */
public class RegistrationPage {

    Scanner input_reader;
    private Book book;
    private List<Book> books;

    public void form() {
        input_reader = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("|        Books Registration        |");
        System.out.println("-----------------------------------");

        System.out.print("ENTER AUTHOR NAME: ");
        String author_name = input_reader.nextLine();

        System.out.print("ENTER BOOK TITLE: ");
        String book_title = input_reader.nextLine();

        System.out.print("ENTER A MANUFACURED BOOK DATE: ");
        String book_date_mft = input_reader.nextLine();

        System.out.print("ENTER BOOK TOTAL PAGE NUMBER: ");
        int total_page = input_reader.nextInt();

        LocalDate date = new DataConverter().stringToDate(book_date_mft);

        book = new Book(author_name, book_title, date, total_page);

        books = new ArrayList();

        if (ReadFile.fileExist()) 
            books = ReadFile.readBooks();
        

        books.add(book);
        SaveFile.saveBooks(books);

    }

    public RegistrationPage() {
        form();
    }

}
