package uy.com.cdbp.fragment;

import uy.com.cdbp.adapter.MascotaAdaptador;
import uy.com.cdbp.modelo.Mascota;

import java.util.ArrayList;

public interface IRecyclerViewMascota {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptador(MascotaAdaptador adaptador);

}
