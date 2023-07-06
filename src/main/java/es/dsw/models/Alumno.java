package es.dsw.models;

public class Alumno {

	private int IdAlumno;
	private String Nif;
	private String Nom, Apell;
	private int Edad;
	
	public Alumno() {
		this.IdAlumno = -1;
		this.Nif = "";
		this.Nom = "";
		this.Apell = "";
		this.Edad = -1;
	}
	
	public Alumno(String nom, String apell, int edad) {
		this.IdAlumno = -1;
		this.Nif = "";
		this.Nom = nom;
		this.Apell = apell;
		this.Edad = edad;
	}
	
	public Alumno(int idalumno, String nif, String nom, String apell, int edad) {
		this.IdAlumno = idalumno;
		this.Nif = nif;
		this.Nom = nom;
		this.Apell = apell;
		this.Edad = edad;
	}

	public int getIdAlumno() {
		return IdAlumno;
	}

	public String getNif() {
		return Nif;
	}

	public String getNom() {
		return Nom;
	}

	public String getApell() {
		return Apell;
	}

	public int getEdad() {
		return Edad;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public void setApell(String apell) {
		Apell = apell;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}
	
}

