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
public class Clase1 {
    int p1,p2; // variables restringidas enteras.
 public Clase1 (int i, int j){ 
 p1=i; // las variables de clase p1 y p2 toman los valores i y j respectivamente
 p2=j; 
 } 
 public int modificar(int i){ 
 p1=p1+i; // aumenta p1 en el valor del parametro i
 p2=p2+i; // aumenta p2 en el valor del parametro i
 System.out.print(p2+" "); // imprime p2 y un espacio
 return p1; //devuelve p1
 }
}
