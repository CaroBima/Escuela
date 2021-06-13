
package Logica;
import Igu.AlumnoForm;
import Persistencia.ControladoraPersistencia;
import java.util.Date;

public class TestJPA {
    public static void main(String[] args) {
      
        AlumnoForm formulario = new  AlumnoForm();
        formulario.setVisible(true);
        //formulario.setLocationByPlatform(true);
        formulario.setLocationRelativeTo(null); //
        /*
        //para probar si permite guardar y borrar los datos de la bd
        Alumno alumno2 = new Alumno("1", "Carolina", "Machiato", new Date("09/10/2015"));
        Alumno alumno1 = new Alumno("2", "Alejandra", "Kornell", new Date("09/10/2005"));
        Alumno alumno = new Alumno("3", "Maria", "Perez", new Date("09/10/2020"));
        
        ControladoraPersistencia control = new ControladoraPersistencia();
        control.crearAlumno(alumno);
        control.crearAlumno(alumno1);
        control.crearAlumno(alumno2);
        
        control.eliminarAlumno(alumno1);
       
        //modificar al alumno
        alumno = new Alumno("3", "Maria", "Perez Compan", new Date("09/10/2020"));
        control.modificarAlumno(alumno);
        
        control.leerUnAlumno(alumno);
        */
    }

        
}
