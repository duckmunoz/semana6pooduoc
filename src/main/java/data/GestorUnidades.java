package data;

import model.CentroCultivo;
import model.PlantaProceso;
import java.util.ArrayList;
import java.util.List;

//Clase que gestiona las unidades operativas
public class GestorUnidades {
    private List<CentroCultivo> centros = new ArrayList<>();
    private List<PlantaProceso> plantas = new ArrayList<>();

    //Constructor de la clase GestorUnidades
    public GestorUnidades() {
        centros.add(new CentroCultivo("Cultivos Vallejo", "Talca", "1000"));
        centros.add(new CentroCultivo("Cultivos Tongo", "Coronel", "3000"));

        plantas.add(new PlantaProceso("Planta Tapioca", "Hualpen", "5000"));
        plantas.add(new PlantaProceso("Procesos Santiago", "Huechuraba", "2000"));
    }

    //Metodos que retornan los centros y las plantas
    public List<CentroCultivo> getCentros() {
        return centros;
    }

    public List<PlantaProceso> getPlantas() {
        return plantas;
    }
}

