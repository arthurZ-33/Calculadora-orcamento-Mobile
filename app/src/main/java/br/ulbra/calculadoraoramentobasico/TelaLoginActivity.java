package br.ulbra.calculadoraoramentobasico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TelaLoginActivity extends AppCompatActivity {
    Button btnLog, btnTelaCad;
    EditText edtxtEmailLog, edtxtSenhaLog;
    DbHelper db;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new DbHelper(this);

        btnLog = (Button) findViewById(R.id.btnLog);
        btnTelaCad = (Button) findViewById(R.id.btnTelaCad);
        edtxtEmailLog = (EditText) findViewById(R.id.edtxtEmailLog);
        edtxtSenhaLog = (EditText) findViewById(R.id.edtxSenhaLog);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtxtEmailLog.getText().toString();
                String senha = edtxtSenhaLog.getText().toString();

                if (email.isEmpty()) {
                    Toast.makeText(TelaLoginActivity.this, "usuário não inserido", Toast.LENGTH_SHORT).show();
                } else if (senha.isEmpty()) {
                    Toast.makeText(TelaLoginActivity.this, "Senha não inserida", Toast.LENGTH_SHORT).show();
                } else {
                    String res = db.validarLogin(email, senha);
                    if (res.equals("OK")) {
                        Toast.makeText(TelaLoginActivity.this, "Login feito com sucesso", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(TelaLoginActivity.this, CalcularOrcamentoActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(TelaLoginActivity.this, "Email ou senha incorreto", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btnTelaCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaLoginActivity.this, TelaCadastrarActivity.class);
                startActivity(intent);
                finish();
                
            }
        });

    }
}