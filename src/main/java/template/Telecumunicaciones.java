/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template;

/**
 *
 * @author sg701-02
 */
public class Telecumunicaciones extends BasicasIngenieria {
    

    @Override
    public void cursosEspecifico() {
        System.out.println("Curso especifico de Telecomunicaciones");
        cursoSenelesCircuitos();
    cursoCircuitosRadioElectricos();
    }

    private void cursoSenelesCircuitos() {
        System.out.println("Telecomunicaciones especidico: senales y Circuitos");
    }

    private void cursoCircuitosRadioElectricos() {
        System.out.println("Telecomunicaciones especidico: Circuitos radio electricos");
    }
}
