package uy.com.cdbp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ContactoConfirmacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmacion_contacto);

        TextView infoEnviada = (TextView) findViewById(R.id.detalleContacto);
        TextView fechaNacimiento = (TextView) findViewById(R.id.detalleFechaNacimiento);
        TextView telefono = (TextView) findViewById(R.id.detalleTelefono);
        TextView mail = (TextView) findViewById(R.id.detalleMail);
        TextView comentario = (TextView) findViewById(R.id.detalleComentario);
        Bundle bundle = getIntent().getExtras();

        String datos  = bundle.getString("DatosDeContacto");
        String fecha = bundle.getString("FechaNacimiento");
        String telefone = bundle.getString("Telefono");
        String correo = bundle.getString("Mail");
        String detallesContacto = bundle.getString("Comentario");


        infoEnviada.setText(datos);
        fechaNacimiento.setText(fecha);
        telefono.setText(telefone);
        mail.setText(correo);
        comentario.setText(detallesContacto);

    }


    public void irEditarContactoFormulario(View view) {
        Button btn = (Button) findViewById(R.id.buttonEdiatrDatos);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Intent intent = new Intent (ContactoConfirmacion.this, Formulario.class);
                finish();
            }
        });
    }




}