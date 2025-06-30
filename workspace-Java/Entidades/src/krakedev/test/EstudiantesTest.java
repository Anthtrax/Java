package krakedev.test;

import krakedev.entidades.Estudiante;
import krakedev.entidades.Materia;
import krakedev.entidades.Nota;

public class EstudiantesTest {
public static void main(String[] args) {
	 Estudiante estudiante = new Estudiante("1234567890", "Estefan", "Ramírez");
	 Estudiante estudiante2 = new Estudiante("1234567890", "Luis", "Perez");
	 Materia ciencias= new Materia("3", "Ciencias");
	 Materia matematicas= new Materia("2", "Matematicas");
	 
	 Nota nuevaNota = new Nota(ciencias,9.0);
	 Nota nuevaNota2 = new Nota(ciencias, 9.0);
	 Nota nuevaNota3 = new Nota(matematicas,2.0);
	 Nota nuevaNota4 = new Nota(matematicas,-8.0);
   
     estudiante.agregarNota(nuevaNota);
     estudiante.agregarNota(nuevaNota2);
     estudiante.agregarNota(nuevaNota3);
     estudiante.agregarNota(nuevaNota4);
     
     estudiante.moificarNota("3", 10.00);

     estudiante.moificarNota("3", -1);
     System.out.println( estudiante.calcularPromedioNotasEstudiante());
     
     
     estudiante.mostrar();
     
     
}
}
