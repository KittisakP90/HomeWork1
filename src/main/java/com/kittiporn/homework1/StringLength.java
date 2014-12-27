/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kittiporn.homework1;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import java.util.Scanner;

/**
 *
 * @author Best
 */
public class StringLength {
    public static void main(String[] args) {
    String input;
    Scanner scan = new Scanner(System.in);
        System.out.println("Plese input message");
    input = scan.nextLine();
        System.out.println("Total word : "+input.length());
    
    
    }
    
}
