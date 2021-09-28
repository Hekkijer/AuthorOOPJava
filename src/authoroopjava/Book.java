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
    private String title;
    private Author[] authors;
    
    public Book(String title, Author[] autors){
        this. title = title;
        this.authors = autors;
    }
    
    @Override
    public String toString() {
        return "Book{" + "\n"
                + " title: " + title + "," + "\n"
                + " authors: " + Arrays.toString(this.authors) + "," + "\n"
                + "}";
    }
}
