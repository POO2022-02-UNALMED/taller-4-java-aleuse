package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        //cedula = 3;
    }
    
    //Crear el constructor para persona cuando no se pasan parámetros
    Persona(){
    	this.cedula = 0;
    	totalPersonas++;
    }
    
    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.cedula = 1; //Inicializar cédula en 1 si no se da un valor específico
		this.nombre = nombre;
        totalPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
