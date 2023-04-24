/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio7;

/**
 *
 * @author Ruben
 */
public class Laboratorio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Materia mater1=new Materia(1,"Ingles I",1);
         Materia mater2=new Materia(2,"Matematica I",1);
         Materia mater3=new Materia(3,"Laboratorio I",1);
         
         Alumno alum1=new Alumno(1001,"Lopez","Martin");
        Alumno alum2=new Alumno(1002,"Martines","Brenda");
        
        alum1.agregarMateria(mater1);
        alum1.agregarMateria(mater2);
        alum1.agregarMateria(mater3);
         alum2.agregarMateria(mater1);
        alum2.agregarMateria(mater2);
        alum2.agregarMateria(mater3);
        System.out.println("la cantidad de materias que esta haciendo Lopes es: "+alum1.cantidadMaterias());
        System.out.println("la cantidad de materias que esta haciendo Martinez es: "+alum2.cantidadMaterias());
        alum1.agregarMateria(mater1);
         System.out.println("la cantidad de materias que esta haciendo Lopes es: "+alum1.cantidadMaterias());
    }
}
/*
En el método main de una clase de nombre Colegio:
a) Crear las materias:
i. Ingles I de primer año.
ii. Matemáticas de primer año.
iii. Laboratorio 1 de primer año
b) Crear 2 alumnos.
a. López Martin con legajo 1001.
b. Martínez Brenda con legajo 1002.
c) Inscribir a López en las 3 materias.
d) Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.
e) Visualizar la cantidad de materias a las que está inscripto cada alumno.

*/