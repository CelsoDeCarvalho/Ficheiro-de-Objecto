package com.mz.sidraTech.view;

import java.util.Scanner;

/**
 *
 * @author De Carvalho
 */
public class InitialPage {
    
    Scanner leitor;
    
    private void menu(){
        leitor=new Scanner(System.in);
        int choice;
        do{
            System.out.println("-----------------------------------");
            System.out.println("|          Books Manager          |");
            System.out.println("-----------------------------------");
            System.out.println("[1] LIST\n[2] ADD\n[3] UPDATE\n[4] DELETE\n[0] QUIT");
            System.out.print("=>");
            choice=leitor.nextInt();

            switch(choice){
                case 1:break;
                case 2:break;
                case 3:break;
                case 4:break;
                case 0:System.exit(0);break;
                default:System.err.println("Invalid choice");
            }
        }while(choice!=0);
    }
    
    public InitialPage(){
        menu();
    }
    
    public static void main(String[] args) {
        new InitialPage();
    }
    
}
