/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Sequence {
    public static void main(String[] args) {
        System.out.println("******* SEQUINTIAL SEARCH *****"+"\n" );
        String data[] = {"Galileo" ,"Archimedes","Alkhawarizmi","Aljabar" , "Wildan Fahrezi" , "Tesla" }; 
        String key;
       
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukan data yang akan dicari: ");
        key = input.nextLine();
            
        
        System.out.println("Isi Data adalah");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
            System.out.println("");
            System.out.println("");
         for(int i = 0; i < data.length; i++){
            if(key.equalsIgnoreCase(data[i])){
                System.out.println("Data "+key+" berada pada index ke "+i);
                break;
            }
        }
        System.out.print("\n");
        System.out.println("Wildan Rezi");
    }
}
