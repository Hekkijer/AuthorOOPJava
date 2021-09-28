/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authoroopjava;

/**
 *
 * @author user
 */
public class Author {
    
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    private String name;
    private String surname;
    private int age;
    
    public Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
 
    
    @Override
    public String toString() {
        return "Author{" + "\n"
                + " name: " + ANSI_RED + name + "," + ANSI_RESET + "\n"
                + " surname: " + ANSI_RED + surname + "," + ANSI_RESET + "\n"
                + " age: " + ANSI_RED +  age + "," + ANSI_RESET + "\n"
                +"}" + "\n"
                + "\n";
    }
    
    
        
    }

