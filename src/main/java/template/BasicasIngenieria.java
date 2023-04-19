/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template;

/**
 *
 * @author sg701-02
 */
public abstract class BasicasIngenieria {
    
    //Declarar metodo con algoritmo principal para mostrar las asignaturas basicas en ingenieria
    public void mosstrarMalla(){
        //asignaturas comunes
        cursoMatematicas();
        cursoCalculo();
        cursoFisica();
        
        //Asignaturas especiales
        cursosEspecifico();
    }

    private void cursoMatematicas() {
        System.out.println("Basica Ingenieria: curso de matematicas");
    }

    private void cursoCalculo() {
        System.out.println("Basica Ingenieria: curso de calculo");
    }

    private void cursoFisica() {
        System.out.println("Basica Ingenieria: curso de fisica");
    }

    public abstract void  cursosEspecifico();
        
    
}
