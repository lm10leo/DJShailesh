package com.e.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {


    EditText edusername,edpassword;
    TextView signUp;
    Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginact);

        edusername=findViewById(R.id.edusername);
        edpassword=findViewById(R.id.edpassword);
        signUp=findViewById(R.id.txtSignUp);
        btnLogIn=findViewById(R.id.btnLogIn);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle=new Bundle();
                bundle.putString("callFrom","Done");

                Intent intent=new Intent(LoginActivity.this,RegistrationActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,DeshboardActivity.class) ;
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
              //  intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });
    }
}
