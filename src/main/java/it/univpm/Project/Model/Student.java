package it.univpm.Project.Model;

import java.util.HashMap;
import java.util.Vector;

public class Student {
    private int id;
    private String name;
    private Vector<String> corsi = new Vector<>();
    public Student(Integer id, String name, String corso){
        this.id = id;
        this.name = name;
        corsi.add(corso);
    }


}
