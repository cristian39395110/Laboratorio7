/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio7;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ruben
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
     private HashMap<Integer, Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashMap<Integer, Materia>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m)
    { if (!materias.containsKey(m.getIdmateria()))
    {
    materias.put(m.getIdmateria(),m);   
    }
    else
    {System.out.println("Ya esta inscripto a:  "+m.getNombre());   }
    }
    public int  cantidadMaterias()
    {
       return materias.size();
    
    }
}
