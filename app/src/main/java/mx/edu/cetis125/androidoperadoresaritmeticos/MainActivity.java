package mx.edu.cetis125.androidoperadoresaritmeticos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Declaracion de variables y objetos, vista
    Button btIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inicializacion de vistas
        btIngresar = (Button) findViewById(R.id.btIngresar);

        // definición código del botón
        btIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, OperadoresAritmeticos.class);
                startActivity(i);
                // la instrucción finish(), cierra la actividad actual eliminándola de memoria
                finish();
            }
        });
        //fin de definición de código del botón
    }
}
