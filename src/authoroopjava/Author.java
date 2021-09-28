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
                + " name: " + name + ","+ "\n"
                + " surname: " + surname + "," + "\n"
                + " age: " + age + "," + "\n"
                +"}";
    }
    
    
        
    }

