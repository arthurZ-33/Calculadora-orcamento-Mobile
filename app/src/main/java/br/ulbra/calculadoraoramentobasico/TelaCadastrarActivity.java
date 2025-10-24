package br.ulbra.calculadoraoramentobasico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TelaCadastrarActivity extends AppCompatActivity {
    EditText edtxtEmailCad, edtxtSenhaCad;
    Button btnCad, btnTelaLog;
    DbHelper db;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

         db = new DbHelper(this);

        edtxtEmailCad = (EditText) findViewById(R.id.edtxtEmailCad);
        edtxtSenhaCad = (EditText) findViewById(R.id.edtxtSenhaCad);
        btnCad = (Button) findViewById(R.id.btnCad);
        btnTelaLog = (Button) findViewById(R.id.btnTelaLog);


        btnCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtxtEmailCad.getText().toString();
                String senha = edtxtSenhaCad.getText().toString();


                if(email.isEmpty()){
                    Toast.makeText(TelaCadastrarActivity.this, "Insira o seu email", Toast.LENGTH_SHORT).show();
                } else if (senha.isEmpty()) {
                    Toast.makeText(TelaCadastrarActivity.this, "Insira a sua senha", Toast.LENGTH_SHORT).show();
                }else if(senha.length() < 6){
                    Toast.makeText(TelaCadastrarActivity.this, "A senha deve ter mais de 6 caracteres!", Toast.LENGTH_SHORT).show();
                } else {
                    Long res =db.criarUsuario(email, senha);
                    if(res > 0){
                        Intent intent = new Intent(TelaCadastrarActivity.this ,CalcularOrcamentoActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(TelaCadastrarActivity.this, "Erro no cadastro email ja existente ou senha inválida", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        btnTelaLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaCadastrarActivity.this, TelaLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
