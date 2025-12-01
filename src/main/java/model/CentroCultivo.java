package model;

//Subclase llamada CentroCultivo que hereda de la clase UnidadOperativa
public class CentroCultivo extends UnidadOperativa {

    private String toneladasProduccion;

    //Constructor de la clase CentroCultivo
    public CentroCultivo(String nombre, String comuna, String toneladasProduccion){
        super(nombre, comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    //Metodo que muestra los datos del CentroCultivo
    @Override
    public void mostrarDatos(){
        System.out.println("---Datos del Centro Cultivo: " + getNombre() + "---");
        super.mostrarDatos();
        System.out.println("Toneladas producidas: " +toneladasProduccion);
    }

}
