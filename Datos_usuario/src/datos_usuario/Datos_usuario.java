
package datos_usuario;

import java.util.Scanner;

public class Datos_usuario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nombre;
        String apellido;
        String edad; 
        String hobbie;
        String editor_pref;
        String sistema_oper;
        
        System.out.println("Ingresar su nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingresar su apellido: ");
        apellido = teclado.nextLine();
        System.out.println("Ingresar su edad: ");
        edad = teclado.nextLine();
        System.out.println("Ingresar su hobbie: ");
        hobbie = teclado.nextLine();
        System.out.println("Ingresar su editor de código favorito: ");
        editor_pref = teclado.nextLine();
        System.out.println("Ingresar el sistema operativo que usa: ");
        sistema_oper = teclado.nextLine();
        
        System.out.println("Su nombre es " + nombre + ", su applido es " + apellido + " y su edad es " + edad + " años.");
        System.out.println("Su hobbie es " + hobbie + "y su editor de código preferido es " + editor_pref);
        System.out.println("Usted tiene el siguiente sistema operativo " + sistema_oper);
    }
    
}
