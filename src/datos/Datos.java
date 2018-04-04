/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Brenda
 */
public class Datos {
    String nombre;
    String apellido;
    String nacionalidad;
    int fecha_de_nacimiento;
    int edad;
    int carnet;
    
    public Datos(String nombre, String apellido, String nacionalidad, int fecha_de_nacimiento, int edad, int carnet){
    this.nombre = nombre;
    this.apellido = apellido;
    this.nacionalidad = nacionalidad;
    this.fecha_de_nacimiento = fecha_de_nacimiento;
    this.edad = edad;
    this.carnet = carnet;
    }
    
    public void imprimir(){
            System.out.println( "    DATOS" + "\n" + nombre + "\n " + apellido + "\n " + nacionalidad + "\n "  + "Fecha de nacimiento: " + fecha_de_nacimiento + "\n" + " Edad: " + edad + "\n" + " Carnet: " + carnet);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Datos n;
        n = new Datos(" Nombre: Brenda Marcela","Apellido: Guerrero Diaz","Nacionalidad: Salvadorena",1998,19,24317);
        n.imprimir();
    }
    
}
