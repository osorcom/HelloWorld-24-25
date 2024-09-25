public class Persona {

private String nombre;
private int edad;
private String sexo;

public Persona(String nombre, int edad, String sexo){
	this.nombre = nombre;
	this.edad = edad;
	this.sexo = sexo;
}

public String getSexo(){return this.sexo;}

}