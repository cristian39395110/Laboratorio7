/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import Modelo.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class Logica {
  private static  ArrayList<Materia> materias=new ArrayList();
  private  static ArrayList<Alumno> alumnos=new ArrayList();

    public Logica() {
    }

    public static ArrayList<Materia> getMaterias() {
        return materias;
    }

    public static void setMaterias(Materia materiasa) {
        materias.add(materiasa);
    }

    public static ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public static  void setAlumnos(Alumno alumnoso) {
        alumnos.add(alumnoso);
    }
    public static void cargaDatos(String nombre,String materia )
    {boolean ver=false;
    int i=0;
    int j=0;
    while(i<alumnos.size()&& !ver)
    {
      if ((alumnos.get(i).getApellido()+" "+alumnos.get(i).getNombre()).equals(nombre))
      {
          while (j<materias.size()&& !ver)
          {
             if(materias.get(j).getNombre().equals(materia))
             {
              alumnos.get(i).agregarMateria(materias.get(j));
              ver=true;
                 JOptionPane.showMessageDialog(null, "Inscripcion Exitosa");
             }
             j++;
          }
      }
    i++;
   }
    
    
    
    }
  
  
  
    
}
