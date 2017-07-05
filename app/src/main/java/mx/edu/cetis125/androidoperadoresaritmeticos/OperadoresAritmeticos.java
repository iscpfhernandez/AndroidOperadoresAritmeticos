package mx.edu.cetis125.androidoperadoresaritmeticos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OperadoresAritmeticos extends AppCompatActivity {

    // Declaración de variables, objetos y vistas
    Button btSuma;
    EditText edValor1, edValor2;
    TextView tvValorResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operadores_aritmeticos);

        // Inicializar las vistas
        btSuma = (Button) findViewById(R.id.btSuma);
        edValor1 = (EditText) findViewById(R.id.edValor1);
        edValor2 = (EditText) findViewById(R.id.edValor2);
        tvValorResultado = (TextView) findViewById(R.id.tvValorResultado);

        // proceso del botón suma
        btSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Declaración de variables
                double v1, v2, suma;

                // Toma los valores del layout ( sus vistas), las convierte a tipo real (double) y
                // coloca su valor en las variables correspondientes
                v1 = Double.parseDouble(edValor1.getText().toString());
                v2 = Double.parseDouble(edValor2.getText().toString());

                // realiza la operación de suma
                suma = v1 + v2;

                // muestra el resultado en la vista del resultado
                tvValorResultado.setText("  " + suma);
            }
        });
        // fin del proceso del botón suma

    }
}
