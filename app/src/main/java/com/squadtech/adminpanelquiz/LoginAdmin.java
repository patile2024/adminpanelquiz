package com.squadtech.adminpanelquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginAdmin extends AppCompatActivity {

    
    private Button LoginBtn;
    private EditText eEmail, ePass;
    private TextView txtNoAcount;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
        
        
        LoginBtn = (Button)findViewById(R.id.LoginBtn);
        eEmail = (EditText)findViewById(R.id.LoginEmail);
        ePass = (EditText)findViewById(R.id.LoginPass);
        txtNoAcount = (TextView) findViewById(R.id.txtNoAccount);
        
        

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String sEmail= eEmail.getText().toString();
                String sPass= ePass.getText().toString();

                if (!TextUtils.isEmpty(sEmail) && !TextUtils.isEmpty(sPass)){
                    LoginAccount();    
                }
                else if (TextUtils.isEmpty(sEmail) || TextUtils.isEmpty(sPass)){
                    
                    ePass.setError("Check the Field");
                    eEmail.setError("Check the Field");
                }
                else {
                    Exception exception = null;
                    Log.e("error" , exception.getMessage());
                }
                
            }
        });
    }

    private void LoginAccount() {
    }
}
