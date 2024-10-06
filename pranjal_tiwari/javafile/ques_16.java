package javafile;
import java.util.*;

public class ques_16 {
    
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector_arr = new Vector<>();

        // Add elements to the Vector using addElement()
        vector_arr.addElement("JAVA");
        vector_arr.addElement("DBMS");
        vector_arr.addElement("DS");
        vector_arr.addElement("OS");
        vector_arr.addElement("CN");

        
        System.out.println("vector_arr after adding elements = " + vector_arr);

        System.out.println("Element at index 2 = " + vector_arr.elementAt(2));
       
        System.out.println("Element removed = "+  vector_arr.removeElement("CN"));
        
        System.out.println("Size of the vector_arr: " + vector_arr.size());

        System.out.println("vector_arr =   " + vector_arr);
    }
}

    

