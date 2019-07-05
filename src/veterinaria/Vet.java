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
public class Vet {
private ArrayList <Pet>pets;
    public Vet() {
        this.pets= new ArrayList<>();
    }
    public void removePet(String ID){
        for(int i=0;i<this.pets.size();i++){
            if(this.pets.get(i).getId().equals(ID)){
                this.pets.remove(i);
            }
        }
    } 
    public void showPetsByType(String type){
      String a="Dog";
      String b="Cat";
      String c="Hamster";
        if(type.equals(a)){
        for(int y=0;y<this.pets.size();y++){
            if(this.pets.get(y) instanceof Dog){
                System.out.println(this.pets.get(y).getName()+"  "+this.pets.get(y).getId());
            }
        }
        }
        if(type.equals(b)){
        for(int y=0;y<this.pets.size();y++){
            if(this.pets.get(y) instanceof Cat){
                System.out.println(this.pets.get(y).getName()+"  "+this.pets.get(y).getId());
            }
        }
        }
        if(type.equals(c)){
        for(int y=0;y<this.pets.size();y++){
            if(this.pets.get(y) instanceof Hamster){
                System.out.println(this.pets.get(y).getName()+"  "+this.pets.get(y).getId());
            }
        }
        }
    }
    public void showPets(){
        for (int j=0;j<this.pets.size();j++){
            System.out.println(this.pets.get(j).getName()+"  "+this.pets.get(j).getId());
        }
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }
    
}
