package com.example.itmasterprofessionaltraining.a26juliobotones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainConfirmar extends AppCompatActivity {
    MainConfirmar context;
    TextView texto1, texto2;

    //  abrir.putExtra("NOMBRE", this.context.getEditText1().getText());
    //        abrir.putExtra("APELLIDO", this.context.getEditText2().getText());
    //        abrir.putExtra("EMAIL", this.context.getEditText3().getText());//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_prueba);

        Bundle b = new Bundle();
        b = getIntent().getExtras();

        String nombre = b.getString("NOMBRE");
        String apellido = b.getString("APELLIDO");
        String email = b.getString("EMAIL");


        texto1 = findViewById(R.id.texto1);
        texto2 = findViewById(R.id.texto2);

        texto1.setText(nombre + "  " + apellido);
        texto2.setText(email);





    }
}
