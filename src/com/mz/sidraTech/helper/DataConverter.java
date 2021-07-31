/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mz.sidraTech.helper;

import java.time.LocalDate;

/**
 *
 * @author De Carvalho
 */
public class DataConverter {
    
    public LocalDate stringToDate(String string_date){
        LocalDate date= LocalDate.parse(string_date);
        return date;
    }
}
