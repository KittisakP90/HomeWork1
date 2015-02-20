/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kittiporn.homework1;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
        
       
        
        
        
        
        
        
        
        
        
        
        JFrame frame = new JFrame("Result");
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        
        frame.setBounds(0, 0, 300, 200);
        BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
        frame.setLayout(boxLayout);
        
        label1.setText("You input : "+input);
        label2.setText("Number is : "+number);
        label3.setText("String is : "+concath);
        
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.setVisible(true);
    }
                 
}
