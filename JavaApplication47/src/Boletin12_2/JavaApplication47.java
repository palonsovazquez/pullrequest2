/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin12_2;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
class Ejercicio { 
 public static void main (String [] args) { 
 Clase1 obj1= new Clase1(5,4); // crea un objeto Clase 1 con los valores para p1 =5 y p2 = 4;
 System.out.print(obj1.modificar(4)+" "); // muestra el valor modificado de p2 el cual seria 9 y devuelve 8( el valor modificado de p1) por lo que acaba mostrando 9 y 8;
 Clase1 obj2= new Clase1(5,4); 
 System.out.print(obj2.modificar(5)+" "); // muestra el valor modificado de p2 el cual seria 10 y devuelve 8( el valor modificado de p1) por lo que acaba mostrando 10 y 9;
 obj2=obj1; //asigna el objeto 1 al objeto 2 por lo que p1 vale 9 y p2 vale 8
 System.out.println(obj2.modificar(5)+" "); // muestra el valor modificado de p2 el cual seria 14 y devuelve 8( el valor modificado de p1) por lo que acaba mostrando 14 y 13;
 }//fin main 
} 