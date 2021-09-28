/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authoroopjava;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Book {
    
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    private String title;
    private Author[] authors;
    
    public Book(String title, Author[] autors){
        this. title = title;
        this.authors = autors;
    }
    
    @Override
    public String toString() {
        return "Book{" + "\n"
                + " title: " + ANSI_GREEN + title + "," + ANSI_RESET + "\n"
                + " authors: " + Arrays.toString(this.authors) + "," + "\n"
                + "}" + "\n"
                + "=======================================" + "\n";
    }
}
