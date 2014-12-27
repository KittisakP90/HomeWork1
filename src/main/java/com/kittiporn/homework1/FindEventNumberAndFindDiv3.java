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
public class FindEventNumberAndFindDiv3 {
    public static void main(String[] args) {
        int n,sum = 0,count = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Plese input number of n");
        n = scan.nextInt();
        
        for(int i = 1 ; i <= n ; i++){
            if(i % 2 == 0){
                System.out.println("Event Result = "+i);
            }
            if(i % 3 == 0){
               sum++; 
            }
        }
         System.out.println("Number of div 3 = 0 have : "+sum);
         
    }
   
            
}
    

