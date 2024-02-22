package sn.esmt.scolarite;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText emailtxt;
    private EditText passwordtxt;
    private Button loginbt;
    //public ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailtxt = (EditText) findViewById(R.id.emailtxt);
        passwordtxt=(EditText) findViewById(R.id.passwordtxt);
        loginbt=(Button) findViewById(R.id.loginbt);

        loginbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}