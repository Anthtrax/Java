package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
		private String nombre;
		private String apellido;
		private String cedula;
		private ArrayList<Nota> notas;
		public Estudiante() {
			notas = new ArrayList<>();
		}

		public Estudiante(String cedula, String nombre, String apellido) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.cedula = cedula;

		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getCedula() {
			return cedula;
		}

		public void setCedula(String cedula) {
			this.cedula = cedula;
		}

		public ArrayList<Nota> getNotas() {
			return notas;
		}

		public void setNotas(ArrayList<Nota> notas) {
			this.notas = notas;
		}

		public void agregarNota(Nota nueva) {
			ArrayList<Nota> n = new ArrayList<Nota>();
			Materia materia = nueva.getMateria();
			Nota n1 = null;
			Materia m1 = null;
			if (nueva.getNota() >= 0 && nueva.getNota() <= 10) {
				for (int i = 0; i < n.size(); i++) {
					n1 = n.get(i);
					m1 = n1.getMateria();
					if (m1.getCodigo() != materia.getCodigo()) {
					}
					n.add(nueva);
					System.out.println("NOTA AGREGADA.");
				}
			} else {
				System.out.println("ERROR: LA NOTA DEBE ESTAR ENTRE 0-10");
			}

		}

		public void moificarNota(String codigo, double nueva) {
			ArrayList<Nota> n = new ArrayList<Nota>();
			Nota n1 = null;
			Materia m1 = null;
			for (int i = 0; i < n.size(); i++) {
				n1 = n.get(i);
				m1 = n1.getMateria();
				if (codigo.equals(m1.getCodigo())) {
					if (nueva >= 0 && nueva <= 10) {
						n1.setNota(nueva);
					}
				} else {
					System.out.println("No encontró el codigo");
				}
			}
		}

		public double calcularPromedioNotasEstudiante() {
			ArrayList<Nota> n1 = new ArrayList<Nota>();
			double promedio = 0.0;
			Nota n = null;
			int numero = 0;
			double suma = 0.0;
			for (int i = 0; i < n1.size(); i++) {
				suma = suma + n.getNota();
				numero = numero + n1.size();
			}
			promedio = suma / numero;
			return promedio;
		}

		public void mostrar() {
			ArrayList<Nota> n2 = new ArrayList<Nota>();
			Nota n1 = null;
			Materia m3 = null;
			for (int i = 0; i < n2.size(); i++) {
				n1 = n2.get(i);
				m3 = n1.getMateria();

				System.out.println("Estudiante[nombre: " + nombre + ", apellido: " + apellido + ", cedula: " + cedula
						+ m3.toString() + ", codigo de la materia: " + m3.getNombre() + ", calificacion: "
						+ n1.getNota() + "]");
			}
		}

	}
