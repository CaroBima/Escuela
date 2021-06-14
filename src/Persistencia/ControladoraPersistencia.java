
package Persistencia;

import Logica.Alumno;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    //creo objeto
    AlumnoJpaController aluJPA = new AlumnoJpaController();
    
    //metodo para agregar un alumno en la bd
    public void crearAlumno(Alumno alu){
        try {
            aluJPA.create(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo para eliminar a un alumno de la bd
    public void eliminarAlumno (Alumno alu){
        String id;
        id = alu.getDni();
        try {
            aluJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo para modificar a un alumno de la bd
    public void modificarAlumno (Alumno alu){
        try {
            aluJPA.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void leerUnAlumno (Alumno alu){
        String id;
        id = alu.getDni();
        Alumno alum = new Alumno();
        alum = aluJPA.findAlumno(id);
        System.out.println("Alumno dni: " + alum.getDni() + ", " + alum.getNombre() + " " + alum.getApellido() + " ");
    
    }
    
    public List leerTodosLosAlumnos(){
        List <Alumno> listaPersona = new ArrayList<Alumno>();
        listaPersona = aluJPA.findAlumnoEntities();
        return listaPersona;
    }
}
