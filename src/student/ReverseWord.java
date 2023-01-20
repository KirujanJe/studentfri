/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author kiruj
 */

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args){
        System.out.println("Enter a word");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        char[] MyLetters = new char[word.length()]; // takes input and makes an array of string's length
        
        for(int i = 0;  i<MyLetters.length; i++){
            MyLetters[i]=word.charAt(i); //stores each character of the word  into the array
            System.out.print(MyLetters[i]);
        }// end of for loop
        
        System.out.println ( );
        System.out.print("printing in reverse: "); 
        System.out.println ( );
        
        for (int i = MyLetters.length-1; i >=0; i--){
            System.out.print(MyLetters[i]);
        }// end of reverse for loop
       
    } //end of main
} //end of class


    //Scanner sc = new Scanner(System.in);
    //System.out.println("Enter a word please: ");
    //String str = sc.nextLine();
    //System.out.println("You have entered: " + str);
