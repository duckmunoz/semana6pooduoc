package model;

//Subclase llamada PlantaProceso que hereda de la clase UnidadOperativa
public class PlantaProceso extends UnidadOperativa {

    private String capacidadProceso;

    //Constructor de la clase PlantaProceso
    public PlantaProceso(String nombre, String comuna, String capacidadProceso){
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    //Metodo que muestra los datos de la PlantaProceso
    @Override
    public void mostrarDatos(){
        System.out.println("---Datos de la Planta de Proceso: " + getNombre() + "---");
        super.mostrarDatos();
        System.out.println("Capacidad de proceso: " +capacidadProceso);
    }
}
