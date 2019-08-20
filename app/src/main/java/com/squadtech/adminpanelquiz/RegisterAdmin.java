package com.squadtech.adminpanelquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterAdmin extends AppCompatActivity {


    private EditText eName , eEmail , ePass , ePhone ;

    private TextView txtAlreadyAcnt;
    private Button confirmBtn;
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_admin);

        eName = (EditText)findViewById(R.id.RegName);
        eEmail = (EditText)findViewById(R.id.RegEmail);
        ePass = (EditText)findViewById(R.id.RegPass);
        ePhone = (EditText)findViewById(R.id.RegPhone);


        //Button and Check box


        confirmBtn = (Button) findViewById(R.id.RegBtn);
        checkBox = (CheckBox) findViewById(R.id.Regchkbox);

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sName = eName.getText().toString();
                String sEmail = eEmail.getText().toString();
                String sPass = ePass.getText().toString();
                String sPhone = ePhone.getText().toString();

                if (TextUtils.isEmpty(sName)&&TextUtils.isEmpty(sEmail)&&TextUtils.isEmpty(sPass)&&TextUtils.isEmpty(sPhone)){

                    Exception exception = null;
                    Toast.makeText(RegisterAdmin.this, "error "+ exception.getMessage() , Toast.LENGTH_SHORT).show();
                }
                else {
                    RegisterAccount();
                }
            }
        });

    }

    private void RegisterAccount() {
    }
}
