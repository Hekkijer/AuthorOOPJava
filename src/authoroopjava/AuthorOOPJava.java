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
public class AuthorOOPJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author johnDoe = new Author("John", "Doe", 23);
        Author samantaWhilles = new Author("Samanta", "Whilles", 48);
        Author richardJohns = new Author("Richard", "Johns", 25);
        
        Author[] aliceInWonderlandAuthors = {johnDoe, samantaWhilles, richardJohns};
        // 1s
        Book aliceInWonderland = new Book("Alice in Wonderland", aliceInWonderlandAuthors);
        
        Author[] tomSawyerAuthors = {johnDoe};
        // 2nd
        Book tomSawyer = new Book("Tom Sawyer", tomSawyerAuthors);
        
        Author[] matrixAuthors = {samantaWhilles};
        // 3rd
        Book matrix = new Book("Matrix", matrixAuthors);
        
        Author[] theHeroAuthors = {richardJohns};
        // 4th
        Book theHero = new Book("The Hero", theHeroAuthors);
        
        Author[] funnyCircleAuthors = {johnDoe, richardJohns};
        // 5th
        Book funnyCircle = new Book("Funny Circle", funnyCircleAuthors);
        
        Book[] books = {aliceInWonderland, tomSawyer, matrix, theHero, funnyCircle};
        
        System.out.println(Arrays.toString(books));
        
        
    }
    
}
