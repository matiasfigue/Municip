package com.example.darpa.municip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class correos  extends AppCompatActivity implements View.OnClickListener {

    //Declaring EditText
    //private EditText editTextEmailapk;
    private static String destintatarioCorreo = "apk@municipalidadnancagua.cl";
    //private EditText editTextSubject;

    private static  String Desde = "Enviado desde apk";
    private EditText editTextMessage;

    //Send button
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correos);


        ///aqui get number



        //////

        //Initializing the views
        //editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        //editTextSubject = (EditText) findViewById(R.id.editTextSubject);
        editTextMessage = (EditText) findViewById(R.id.editTextMessage);

        buttonSend = (Button) findViewById(R.id.buttonSend);

        //Adding click listener
        buttonSend.setOnClickListener(this);
    }


    private void sendEmail() {
        //Getting content for email
        //String email = editTextEmail.getText().toString().trim();
        String email = destintatarioCorreo;

        //String subject = editTextSubject.getText().toString().trim();

        String subject = Desde;
        String message = editTextMessage.getText().toString().trim();

        //Creating SendMail object
        SendMail sm = new SendMail(this, email, subject, message);

        //Executing sendmail to send email
        sm.execute();
        editTextMessage.getText().clear();//limpia el texto
    }

    @Override
    public void onClick(View v) {
        sendEmail();
    }
}
