package uy.com.cdbp.presentador;

import android.content.Context;

import uy.com.cdbp.modelo.ConstructorMascotas;
import uy.com.cdbp.modelo.Mascota;
import uy.com.cdbp.fragment.IRecyclerViewMascota;

import java.util.ArrayList;

public class RecyclerViewFragmentPresentador implements IRecyclerViewFragmentPresentador {

    private IRecyclerViewMascota iRecyclerViewMascota;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresentador(IRecyclerViewMascota iRecyclerViewMascota, Context context) {
        this.iRecyclerViewMascota = iRecyclerViewMascota;
        this.context = context;
        obtenerMascotasBaseDatos();
    }

    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        this.mostrarMascotaRecyclerView();
    }

    @Override
    public void mostrarMascotaRecyclerView() {
        iRecyclerViewMascota.inicializarAdaptador(iRecyclerViewMascota.crearAdaptador(mascotas));
        iRecyclerViewMascota.generarLinearLayoutVertical();
    }
}
