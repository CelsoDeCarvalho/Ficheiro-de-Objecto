/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mz.sidraTech.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author celso
 */
public class Book implements Comparable<Book>,Serializable{
    
    private String author;
    private String title;
    private LocalDate manufactured_date;
    private int total_pages;

    public Book(String author, String title, LocalDate manufactured_date, int total_pages) {
        this.author = author;
        this.title = title;
        this.manufactured_date = manufactured_date;
        this.total_pages = total_pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getManufactured_date() {
        return manufactured_date;
    }

    public void setManufactured_date(LocalDate manufactured_date) {
        this.manufactured_date = manufactured_date;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    @Override
    public String toString() {
        return  "AUTHOR: " + author + "\nTITLE: " + title + "\nMANUFACTURED DATE: " + manufactured_date + "\nTOTAL PAGES: " + total_pages;
    }
    
    

    @Override
    public int compareTo(Book arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
