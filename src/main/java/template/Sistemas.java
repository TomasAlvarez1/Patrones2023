/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template;

/**
 *
 * @author sg701-02
 */
public class Sistemas extends BasicasIngenieria {

    @Override
    public void cursosEspecifico() {
        System.out.println("Curso especifico de sistemas");
        cursoCiencienciasComputacion();
        cursoPatrones();
    }

    private void cursoCiencienciasComputacion() {
        System.out.println("Especificas Ingenieria sistemas: ciencias de la computacion");
    }

    private void cursoPatrones() {
        System.out.println("Especificas Ingenieria sistemas: Patrones");
    }
    
}
