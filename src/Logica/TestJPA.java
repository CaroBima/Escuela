
package Logica;
import Persistencia.ControladoraPersistencia;
import java.util.Date;

public class TestJPA {
    public static void main(String[] args) {
       
        Alumno alumno = new Alumno("3", "Maria", "Perez", new Date("09/10/2020"));
        
        ControladoraPersistencia control = new ControladoraPersistencia();
        control.crearAlumno(alumno);
        
    }

        
}
