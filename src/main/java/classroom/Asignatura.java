package classroom;

public class Asignatura {

    String nombre;
    //String n = nombre;   esta variable no se utilizaba
    //int codigoInterno;	
    double codigoInterno;	//cambiar el tipo de dato a double
    int codigoExterno;
    Tipo tipo;

    Asignatura() {
        this("Sin nombre",Tipo.FUNDAMENTACION);
        //this(0);
    }
    
    //Asignatura(int codigoInterno, Tipo tipo) {
    Asignatura(double codigoInterno, Tipo tipo) {
        this("Sin nombre", codigoInterno, 0, tipo);
    }

    Asignatura(int codigoExterno,Tipo tipo) {
        this("Sin nombre", 0, codigoExterno, tipo);
    }

    Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0, tipo);
    }

    Asignatura(String nombre, double codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    void cambiarDatos(double codigoInterno, int codigoExterno, String nombre, Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    //Camibar el tipo de dato de codigoInterno a double
    void cambiarDatos(double codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    //public void setCodigoInterno(int codigoInterno) {
        //this.codigoInterno = codigoInterno;
    //}
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
}
