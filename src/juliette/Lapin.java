package juliette;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juliette
 */
public class Lapin {
    
    private String nom;
    private int age;

    public Lapin(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    public String getNom (){
        return nom;
    }
    
    public int getAge (){
        return age;
    }
    
    public void setNom (String name){
        nom = name;
    }
    
    public void setAge (int Age){
        age = Age;
    }

    public void crier (){
        System.out.println("HAAAAA");
    }  

}
