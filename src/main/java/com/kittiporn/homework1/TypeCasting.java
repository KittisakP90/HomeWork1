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
public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Plese input number : ");
        Scanner scan = new Scanner(System.in);
        float number = scan.nextFloat();
        
        if(number - (int)number == 0){
            System.out.println((int)number);
        }
        else{
            System.out.println(number);
        }
        
    }
    
}
