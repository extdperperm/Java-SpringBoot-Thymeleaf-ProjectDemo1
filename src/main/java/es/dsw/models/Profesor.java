package es.dsw.models;

import java.util.ArrayList;

public class Profesor {
	private int IdProfesor;
	private String Nif;
	private String Nom, Apell;
	private int Edad;
	private ArrayList<Alumno> ListaAlumnos;
	
	private boolean FlagError;
	private String msgError;
	
	public Profesor() {
		this.IdProfesor = -1;
		this.Nif = "";
		this.Nom = "";
		this.Apell = "";
		this.Edad = 0;
		this.FlagError = false;
		this.msgError="";
		this.ListaAlumnos = new ArrayList<Alumno>();
	}

	public Profesor(String nom, String apell, int edad) {
		FlagError = false;
		msgError = "";
		
		this.IdProfesor = -1;
		this.Nif = "";
		this.Nom = nom;
		this.Apell = apell;
		this.Edad = edad;
		this.ListaAlumnos = new ArrayList<Alumno>();
		
		if ((this.Nom.trim() == "") ||
		    (this.Apell.trim() == "") ||
		    (this.Edad < 0)) {
			FlagError = true;
			msgError = "Error: Datos faltantes.";
		} 
			
	}
	
	public Profesor(int idprofesor, String nif, String nom, String apell, int edad) {
		FlagError = false;
		msgError = "";
		
		this.IdProfesor = idprofesor;
		this.Nif = nif;
		this.Nom = nom;
		this.Apell = apell;
		this.Edad = edad;
		this.ListaAlumnos = new ArrayList<Alumno>();
		
		if ((this.Nom.trim() == "") ||
		    (this.Apell.trim() == "") ||
		    (this.Edad < 0)) {
			FlagError = true;
			msgError = "Error: Datos faltantes.";
		} 
			
	}
	
	public boolean isFlagError() {
		return FlagError;
	}

	public String getMsgError() {
		return msgError;
	}

	public int getIdProfesor() {
		return IdProfesor;
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
	
	public String getIndicadorNomError() {

			if (this.Nom.trim() == "") {
				return "style=\"color: red;\"";
			} else return "style=\"color: black;\"";

	}
	
	public String getIndicadorApellError() {

			if (this.Apell.trim() == "") {
				return "style=\"color: red;\"";
			} else return "style=\"color: black;\"";

	}
	
	public String getIndicadorEdadError() {

			if (this.Edad < 0) {
				return "style=\"color: red;\"";
			} else return "style=\"color: black;\"";

	}
	
	public void setListaAlumnos(Alumno objAlumno) {
		this.ListaAlumnos.add(objAlumno);
		return;
	}
	
	public ArrayList<Alumno> getListaAlumnos() {
		
		return this.ListaAlumnos;
	}

}

