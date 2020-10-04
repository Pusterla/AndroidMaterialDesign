package uy.com.cdbp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import uy.com.cdbp.adapter.MascotaAdaptador;
import uy.com.cdbp.modelo.ConstructorMascotas;
import uy.com.cdbp.modelo.Mascota;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    public RecyclerView listaMascotas;
    private ConstructorMascotas constructorMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascotas_favoritas);
        setToolBar();
        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotaFav);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }
    public void setToolBar(){
        Toolbar appBar = findViewById(R.id.appBar);
        setSupportActionBar(appBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    public void inicializarAdaptador () {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas () {
        mascotas = new ArrayList<Mascota>();
        constructorMascotas = new ConstructorMascotas(getApplication());
        mascotas = constructorMascotas.obtenerFavorita();
    }
}