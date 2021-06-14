

package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;



public class Controladora {
 
    public void agregarAlumno(String dni, String nombre, String apellido, Date fecha){
        Alumno alu = new Alumno();
        ControladoraPersistencia controlPer = new ControladoraPersistencia();
       
        
        alu.setDni(dni);
        alu.setNombre(nombre);
        alu.setApellido(apellido);
        alu.setFechaNac(fecha);
                
        
        controlPer.crearAlumno(alu);
    }
    
    
}
