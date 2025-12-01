package model;

//Clase padre
public class UnidadOperativa {

    private String nombre;

    private String comuna;

    //Constructor de la clase UnidadOperativa: inicializa los atributos
    public UnidadOperativa(String nombre, String comuna){
        this.nombre = nombre;
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "UnidadOperativa{" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getComuna() {
        return comuna;
    }

    //Metodo que muestra los datos de la UnidadOperativa
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre + "\nComuna: " + this.comuna);
    }
}
