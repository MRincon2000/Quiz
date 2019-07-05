/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package veterinaria;
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.lang.IllegalArgumentException;
/**
 *
 * @author Estudiante
 */
public class Starter {

    private ArrayList<Person>persons;

    public Starter() {
    this.persons= new ArrayList<>();
    }
 
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vet v= new Vet();
       Starter c= new Starter();
      for(int z=0;z<1000;z++){
       System.out.println("Bienvenido. Que desea hacer?");
        System.out.println("1.Leer archivo de datos");
        System.out.println("2.Eliminar una mascota");
        System.out.println("3.Listar mascota por tipo");
        System.out.println("4.Listar todas las mascotas");
        System.out.println("5.Exportar cambios y cerrar programa");
      Scanner lectura= new
                Scanner(System.in);
      int u=lectura.nextInt();
      if(u<=0 || u>5){
          System.out.println("Comando no valido");
      }
      else{
      switch(u){
          case 1:
            try{
      c.readPets(v);
      }catch(FileNotFoundException o){
          System.out.println("No se encuentra el archivo");
      }   
      break;
          case 2:
           
              System.out.println("Ingrese el ID");
              String ID=lectura.next();
              v.removePet(ID);
              break;
          case 3:
              System.out.println("Ingrese el tipo de mascotas");
              String tipo= lectura.next();
              v.showPetsByType(tipo);
              break;
          case 4:
              v.showPets();
              break;
          case 5:
              c.manageVet(v);
              break;
      }
      }      
    }
}
public void readPets(Vet v) throws FileNotFoundException{
    
        File entrada= new File("pets.txt");
    
        Scanner imput= new Scanner(entrada);  
      for(int j=0;j<5;j++){ 
        String y=imput.next();
         
        if (y.equals("Dog")){
           boolean w=false;
            Dog s=new Dog(imput.next(),imput.next(),imput.next(),imput.next());
           Person t = new Person(imput.next(),imput.next());
            for(int u=0;u<v.getPets().size();u++){
                if(v.getPets().get(u).getId().equals(s.getId())){
                    w=true;
                }
            }
            
            if(w==true){
              try{
                throw new IllegalArgumentException("Error: entrada no valida");
              }catch(IllegalArgumentException err){
                  System.out.println(err.getMessage());
              }
            }
            else{
            v.getPets().add(s);
          
          boolean q=false;
          String x=t.getNombre();
          String love="";

          for(int k=0;k< this.persons.size();k++){
            love= this.persons.get(k).getNombre();
              if(love.equals(x)){
                  q=true;
                   for(int d=0;d< this.persons.get(k).getPets().size();d++){
                 if(s.getName()==this.persons.get(k).getPets().get(d).getName()){
                   this.persons.get(k).getPets().remove(d);
                 }
               
              }
                  this.persons.get(k).getPets().add(s);
              }
          }
          if(q==false){
    t.getPets().add(s);
           this.persons.add(t);  
          }
            }
 
          }
          else if (y.equals("Cat")){
            boolean w=false;
            Cat s=new Cat(imput.next(),imput.next(),imput.next(),imput.nextBoolean());
           Person t = new Person(imput.next(),imput.next());
            for(int u=0;u<v.getPets().size();u++){
                if(v.getPets().get(u).getId().equals(s.getId())){
                    w=true;
                }
            }
            
            if(w==true){
            try{
                throw new IllegalArgumentException("Error: entrada no valida");
              }catch(IllegalArgumentException err){
                  System.out.println(err.getMessage());
              }
            }
            else{
            v.getPets().add(s);
          
          boolean q=false;
          String x=t.getNombre();
          String love="";

          for(int k=0;k< this.persons.size();k++){
            love= this.persons.get(k).getNombre();
              if(love.equals(x)){
                  q=true;
                   for(int d=0;d< this.persons.get(k).getPets().size();d++){
                 if(s.getName()==this.persons.get(k).getPets().get(d).getName()){
                   this.persons.get(k).getPets().remove(d);
                 }
               
              }
                  this.persons.get(k).getPets().add(s);
              }
          }
          if(q==false){
    t.getPets().add(s);
           this.persons.add(t);  
          }
            }

        }
        else if(y.equals("Hamster")){
 boolean w=false;
            Hamster s=new Hamster(imput.next(),imput.next(),imput.next(),imput.nextDouble());
                      Person t = new Person(imput.next(),imput.next());
            for(int u=0;u<v.getPets().size();u++){
                if(v.getPets().get(u).getId().equals(s.getId())){
                    w=true;
                }
            }
            
            if(w==true){
          try{
                throw new IllegalArgumentException("Error: entrada no valida");
              }catch(IllegalArgumentException err){
                  System.out.println(err.getMessage());
              }
            }
            else{
            v.getPets().add(s);
          
          boolean q=false;
          String x=t.getNombre();
          String love="";

          for(int k=0;k< this.persons.size();k++){
            love= this.persons.get(k).getNombre();
              if(love.equals(x)){
                  q=true;
                   for(int d=0;d< this.persons.get(k).getPets().size();d++){
                 if(s.getName()==this.persons.get(k).getPets().get(d).getName()){
                   this.persons.get(k).getPets().remove(d);
                 }
               
              }
                  this.persons.get(k).getPets().add(s);
              }
          }
          if(q==false){
    t.getPets().add(s);
           this.persons.add(t);  
          }
            }

            }
        }
    }

    public void manageVet(Vet v){
        File petso=new File("petso.txt");
     try{
        PrintStream output=new PrintStream(petso);
          for(int h=0;h<v.getPets().size();h++){
        if(v.getPets().get(h) instanceof Dog){
            output.println("Dog"+" "+v.getPets().get(h).getName()+" "+v.getPets().get(h).getId()+" "+v.getPets().get(h).getHairColor());
        }
        if(v.getPets().get(h) instanceof Cat){
            output.println("Cat"+" "+v.getPets().get(h).getName()+" "+v.getPets().get(h).getId()+" "+v.getPets().get(h).getHairColor());
        }
        if(v.getPets().get(h) instanceof Hamster){
            output.println("Hamster"+" "+v.getPets().get(h).getName()+" "+v.getPets().get(h).getId()+" "+v.getPets().get(h).getHairColor());
        }
    }
        }
    catch( FileNotFoundException x){
            System.out.println("No se puedo crear el archivo");
    }
 System.exit(0);
}
            public static void esperar(int segundos){
        try {
            Thread.sleep(segundos * 1000);
         } catch (Exception e) {
            System.out.println(e);
         }
    }
}