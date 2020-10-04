package uy.com.cdbp.modelo;

import android.content.ContentValues;
import android.content.Context;

import uy.com.cdbp.R;
import uy.com.cdbp.database.BaseDatos;
import uy.com.cdbp.database.ConstantesBaseDatos;

import java.util.ArrayList;

public class ConstructorMascotas {

    private static final int LIKE = 1;
    private Context context;
    private ArrayList<Mascota> mascotas;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){
        /*mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.gato_perro,"Gato Y Perro","5"));
        mascotas.add(new Mascota(R.drawable.peludo,"Peludo","2"));
        mascotas.add(new Mascota(R.drawable.labradores,"Labradores","5"));
        mascotas.add(new Mascota(R.drawable.perrote,"Perrote","8"));
        mascotas.add(new Mascota(R.drawable.labrador_adulto,"Labrador Adulto","12"));
        mascotas.add(new Mascota(R.drawable.gato,"Gato","5"));
        mascotas.add(new Mascota(R.drawable.manchado,"Manchado","7"));
        mascotas.add(new Mascota(R.drawable.pitbull,"Pitbull","1"));
        mascotas.add(new Mascota(R.drawable.leon,"León","8"));
        return mascotas;*/

        BaseDatos db = new BaseDatos(context);
        insertarTresMascotas(db);
        return db.obtenerTodasMacotas();
    }

    public ArrayList<Mascota> obtenerFavorita(){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerTodasMacotasFavoritas();
    }

    public ArrayList<Mascota> obtenerPerfil(){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerPerfil();
    }

    public void insertarTresMascotas(BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE, "Aves");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.pajarraco);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE, "Cuernos");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.cuernos);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE, "Caballos Raros");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.caballorayado);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE, "Aves");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.pajarraco);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE, "Cuernos");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.cuernos);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE, "Caballos Raros");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.caballorayado);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE, "Aves");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.pajarraco);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE, "Cuernos");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.cuernos);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_NOMBRE, "Caballos Raros");
        contentValues.put(ConstantesBaseDatos.TABLA_MASCOTAS_FOTO, R.drawable.caballorayado);
        db.insertarMascota(contentValues);


    }

    public void darLikeMascota (Mascota mascota) {
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_LIKES_MASCOTAS_ID_MASCOTA, mascota.getId());
        contentValues.put(ConstantesBaseDatos.TABLA_LIKES_MASCOTAS_NUMERO_LIKES, LIKE);
        db.insertarLikesMascota(contentValues);
    }

    public int obtenerLikesMascota (Mascota mascota) {
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesMascotas(mascota);
    }

}
