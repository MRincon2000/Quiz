/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package veterinaria;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    public static void readPets(Vet v){
        File entrada= new File("pets.txt");
       try{
        Scanner imput= new Scanner(entrada);
       
        if(imput.hasNext()){
        if (imput.next()=="Dog"){
           
            Dog s=new Dog(imput.next(),imput.next(),imput.next(),imput.next());
           Person a = new Person(imput.next(),imput.next());
        }
        if (imput.next()=="Cat"){
            Cat s= new Cat(imput.next(),imput.next(),imput.next(),imput.nextBoolean());
            Person a = new Person(imput.next(),imput.next());
        }
        if (imput.next()=="Hamster"){
            Hamster s= new Hamster(imput.next(),imput.next(),imput.next(),imput.nextDouble());
        }
        }
       
       }catch(FileNotFoundException e){
                System.out.println("no se encuentra el archivo");
                }
    }
    public static void manageVet(Vet v, String action){
        
    }
}
