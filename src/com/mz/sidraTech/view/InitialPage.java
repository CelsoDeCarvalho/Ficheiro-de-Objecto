package com.mz.sidraTech.view;

import java.util.Scanner;

/**
 *
 * @author De Carvalho
 */
public class InitialPage {
    
    Scanner input_reader;
    
    private void menu()throws InterruptedException{
        input_reader=new Scanner(System.in);
        int choice;
        do{
            System.out.println("-----------------------------------");
            System.out.println("|          Books Manager          |");
            System.out.println("-----------------------------------");
            System.out.println("[1] LIST\n[2] ADD\n[3] UPDATE\n[4] DELETE\n[0] QUIT");
            System.out.print("=> ");
            choice=input_reader.nextInt();

            switch(choice){
                case 1:new ListBook(); break;
                case 2:new RegistrationBook(); break;
                case 3: break;
                case 4:new DeleteBook(); break;
                case 0:{
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.println("  SYSTEM TERMINATED");
                    
                    System.exit(0);
                }break;
                default:System.err.println("Invalid choice");
            }
        }while(choice!=0);
    }
    
    public InitialPage() throws InterruptedException{
        menu();
    }
    
    public static void main(String[] args) {
        try{
            new InitialPage();
        }catch(InterruptedException ie){
            
        }
    }
    
}
