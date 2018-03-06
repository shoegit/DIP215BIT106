/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture8;

/**
 *
 * @author ngsm
 */
public class Library {
    
    public static void main(String[] args)
    {
        Book b1 = new Book();
        System.out.println("b1 is " + b1.toString());
        
        b1.setTitle("Java is my favourite subject");
        b1.setTitle("");
        
        System.out.println("Title changed to " + b1.getTitle());
        
        Book b2 = new Book("Python","KCH", 34.50);
        System.out.println("b2 is " + b2.toString());
    }
}
