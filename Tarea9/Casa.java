/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;
import java.util.Scanner;
/**
 *
 * @author FERNANDA
 */
public class Casa {
static int opcion,opcion2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Afuera();
    }
     public static void Afuera(){
        System.out.println("Estás afuera.\n¿Quieres entrar?");
        System.out.println("1. Sí \n2. No");
        Scanner scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
        scanner.nextLine();
        
        if(opcion == 1){
            Sala();
        } else {
            System.out.println("Adiós."); 
        }
    }
      public static void Sala(){
        System.out.println("Estás adentro, en la sala.\n¿Quieres salir?");
        System.out.println("1. Sí \n2. No");
        Scanner scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
        scanner.nextLine();
        
        if(opcion == 1){
            Afuera();
        }else if(opcion==2){
            System.out.println("¿A donde quieres ir?");
            System.out.println("1.Baño \n2. Cuarto\n3. Cocina");
            Scanner scanner2 = new Scanner(System.in);
            opcion2 = scanner2.nextInt();
            scanner2.nextLine();
         switch(opcion2){
             case 1: Baño(); 
             break;
             case 2:Cuarto();
             break;
             case 3:Cocina();
             break;
         }
      }
    }
       public static void Cuarto(){
        System.out.println("Estás en el cuarto.\n¿Quieres volver a la sala?");
        System.out.println("1. Sí \n2. No");
        Scanner scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
        scanner.nextLine();
       
        if(opcion == 1){
            Sala();
        }
    }
          public static void Baño(){
        System.out.println("Estas en el Baño. \n¿Quieres volver a la sala?");
        System.out.println("1. Si \n2. No");
        Scanner scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
        scanner.nextLine();
        
        if(opcion == 1){
            Sala();
        }
    }
             public static void Cocina(){
        System.out.println("Estás en la cocina.\n¿Quieres volver a la sala?");
        System.out.println("1. Si \n2. No");
        Scanner scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
        scanner.nextLine();
        
        if(opcion == 1){
            Sala();
        }
    }
}
