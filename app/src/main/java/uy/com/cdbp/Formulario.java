package uy.com.cdbp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Formulario extends AppCompatActivity {

    EditText editTextDate;
    Calendar myCalendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);

        editTextDate = findViewById(R.id.editTextDate);
        editTextDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(Formulario.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
    }

    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            actualizarInput();
        }

    };

    private void actualizarInput() {
        String formatoDeFecha = "dd/MM/yy";
        SimpleDateFormat sdf = new SimpleDateFormat(formatoDeFecha, Locale.US);
        editTextDate.setText(sdf.format(myCalendar.getTime()));
    }

    public void irContactoConfirmacion(View view) {
        Button btn = (Button) findViewById(R.id.button_siguiente);
        final EditText personName = (EditText) findViewById(R.id.editTextTextPersonName);
        final EditText fechaNacimiento = (EditText) findViewById(R.id.editTextDate);
        final EditText mail = (EditText) findViewById(R.id.editTextTextEmailAddress);
        final EditText comentario = (EditText) findViewById(R.id.editTextTextMultiLine2);
        @SuppressLint("WrongViewCast") final EditText telefono = (EditText) findViewById(R.id.editTextPhone);



        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (Formulario.this, ContactoConfirmacion.class);
                intent.putExtra("DatosDeContacto", personName.getText().toString());
                intent.putExtra("FechaNacimiento", fechaNacimiento.getText().toString());
                intent.putExtra("Telefono", telefono.getText().toString());
                intent.putExtra("Mail", mail.getText().toString());
                intent.putExtra("Comentario", comentario.getText().toString());
                startActivity(intent);
            }
        });
    }
}