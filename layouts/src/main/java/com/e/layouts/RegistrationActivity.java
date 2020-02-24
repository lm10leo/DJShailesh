package com.e.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {
    Bundle bundle=null;
    Button signUp;
    EditText edtFirstName,edtMiddleName,edtLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouts);
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null)
        {
            Toast.makeText(this, ""+bundle.getString("callFrom"), Toast.LENGTH_LONG).show();
        }
        signUp=findViewById(R.id.txtSignUp);
        edtFirstName=findViewById(R.id.edtFirstName);
        edtMiddleName=findViewById(R.id.edtMiddleName);
        edtLastName=findViewById(R.id.edtLastName);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
