/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package template;

/**
 *
 * @author sg701-02
 */
public class TemplateMetodoExt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Referencia de objetos a la clase abstracta 
        BasicasIngenieria cursos;
        
        //Instanciar sobre la subclase 
        cursos = new Sistemas();
        cursos.mosstrarMalla();
        
        //Instanciar sobre subclases
        cursos = new Telecumunicaciones();
        cursos.mosstrarMalla();
    }
    
}
