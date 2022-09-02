package classroom;

public class Grupo {

    Persona[] estudiantes;
    Persona profesor;
    Asignatura asignatura;
    //final int codigo = 0;	Se deja sin valor inicial a la constante para que luego se puede inicializar
    final int codigo;
    String horario;

    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
    	//this(personas, profesor, asignatura, codigo, horario);
    	Persona[] personas = new Persona[cantidadEstudiantes];
    	this.estudiantes = personas;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
        
    }

    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        //Inicializar el valor de código en 
    	this.codigo = 0;
		this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
    }

    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
    
    void cambiarEstudiante(int indice, Persona estudiante) {
        estudiantes[indice] = estudiante;
    }
}
