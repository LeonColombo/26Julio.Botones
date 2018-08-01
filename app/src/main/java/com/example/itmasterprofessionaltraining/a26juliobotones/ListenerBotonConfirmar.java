package com.example.itmasterprofessionaltraining.a26juliobotones;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class ListenerBotonConfirmar implements View.OnClickListener {
    private MainActivity context;

    public ListenerBotonConfirmar(Activity context) {
        this.context = (MainActivity) context;
    }




    @Override
    public void onClick(View view) {


        Intent abrir = new Intent(this.context, MainConfirmar.class);
        abrir.putExtra("NOMBRE", this.context.getEditText1().getText().toString());
        abrir.putExtra("APELLIDO", this.context.getEditText2().getText().toString());
        abrir.putExtra("EMAIL", this.context.getEditText3().getText().toString());

        context.startActivity(abrir);



    }
}
