package ui;

import data.GestorUnidades;
import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

//Clase principal
public class Main {
    public static void main (String[] args){
        GestorUnidades gestor = new GestorUnidades();

        //Saludo
        System.out.println("+++++Bienvenido a la base de datos Salmontt++++");
        System.out.println("++++++++++++++Unidades Operativas++++++++++++++\n");

        //Mostrar informacion por pantalla
        System.out.println("==============Centros de cultivo==============");
        for (CentroCultivo centro : gestor.getCentros()){
            centro.mostrarDatos();
            System.out.println();
        }

        System.out.println("==============Plantas de proceso==============");
        for (PlantaProceso planta : gestor.getPlantas()){
            planta.mostrarDatos();
            System.out.println();
        }


    }
}
