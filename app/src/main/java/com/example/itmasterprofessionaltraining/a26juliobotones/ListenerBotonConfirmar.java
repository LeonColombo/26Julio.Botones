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


        Intent abrir = new Intent(this.context, MainPrueba.class);
        context.startActivity(abrir);
    }
}
