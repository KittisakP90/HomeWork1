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
public class Grade {
    public static void main(String[] args) {
        int grade,result;
        float tmp;
        System.out.println("Plese input Grade 0 - 100 only : ");
        Scanner scan = new Scanner(System.in);
        grade = scan.nextInt();
        tmp = (((int)((float)grade / 50 )) * 5);
        result = (int) tmp;
    switch(result){
        case 0:
            System.out.println("F");
            break;
        case 5:
            System.out.println("D");
            break;
        case 6:
            System.out.println("C");
            break;
        case 7:
            System.out.println("B");
            break;
        case 8:
            System.out.println("A");
            break;
        default:
            System.out.println("A");
    }
        
    }
    
}
