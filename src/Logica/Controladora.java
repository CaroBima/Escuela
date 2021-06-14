package Logica;

import Igu.AlumnoForm;
import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Controladora {
 
    public void agregarAlumno(String dni, String nombre, String apellido, Date fecha){
        Alumno alu = new Alumno();
        ControladoraPersistencia controlPer = new ControladoraPersistencia();
       
        //obtengo los datos pasados por parametro desde la IGU
        alu.setDni(dni);
        alu.setNombre(nombre);
        alu.setApellido(apellido);
        alu.setFechaNac(fecha);
                
        //guardo los datos en la base de datos a traves de la clase controladora de persistencia
        controlPer.crearAlumno(alu);
    }
    
    
    public List cargarLista(){
        ControladoraPersistencia controlPer = new ControladoraPersistencia();
        List<Alumno> lista = new ArrayList<Alumno>();
        lista = controlPer.leerTodosLosAlumnos();
        return lista;
    }
}
