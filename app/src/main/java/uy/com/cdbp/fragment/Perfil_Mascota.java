package uy.com.cdbp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import uy.com.cdbp.R;
import uy.com.cdbp.adapter.PerfilAdaptador;
import uy.com.cdbp.modelo.ConstructorMascotas;
import uy.com.cdbp.modelo.Mascota;

import java.util.ArrayList;

public class Perfil_Mascota extends Fragment {

    ArrayList<Mascota> mascotas;
    public RecyclerView listaMascotas;
    TextView tvNombrePerfil;
    private ConstructorMascotas constructorMascotas;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_perfil__mascota, container,false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvPerfilMascota);
        tvNombrePerfil = (TextView) v.findViewById(R.id.tvNombrePerfil);

        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        glm.setOrientation(GridLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(glm);
        inicializarListaMascotas();
        inicializarAdaptador();

        //tvNombrePerfil.setText(mascotas.get(2).getNombreMascota());
        tvNombrePerfil.setText("Gato Y Perro");

        return v;
    }
    public void inicializarAdaptador () {
        PerfilAdaptador adaptador = new PerfilAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas () {
        mascotas = new ArrayList<Mascota>();
        constructorMascotas = new ConstructorMascotas(getContext());
        mascotas = constructorMascotas.obtenerPerfil();
    }
}