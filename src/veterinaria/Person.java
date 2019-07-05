/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Person {
   private String nombre;
   private String id;
   private ArrayList<Pet>pets;
    public Person(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.pets=new ArrayList<>();
    }
   
   public void showPets(){
       
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

}
