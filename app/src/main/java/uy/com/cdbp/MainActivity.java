package uy.com.cdbp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agregarFAB(){
        FloatingActionButton miFAB = (FloatingActionButton) findViewById(R.id.fabMyFAB);
        miFAB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });
    }


    public void irFormulario(View view) {
        Button btn = (Button) findViewById(R.id.myButton);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (MainActivity.this, Formulario.class);
                startActivity(intent);
            }
        });
    }
}