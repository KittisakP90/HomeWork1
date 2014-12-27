/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kittiporn.homework1;

import java.util.Scanner;

/**
 *
 * @author Best
 */
public class StringNumberAndCharacter {
      public static void main(String[] args) {
        String concath = "",number = "";
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.print("input Sting : ");
        input = scan.nextLine();
        
       for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(Character.isDigit(c)){
                number = number+c;
            }
            else{
                concath = concath+c;
            }
        }
        System.out.println("String = "+concath);
        System.out.println("Number = "+number);
    }
            
}
