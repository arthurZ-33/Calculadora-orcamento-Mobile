package br.ulbra.calculadoraoramentobasico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnMainTelaCad;
    private Button btnMainTelaLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincula os botões ao layout
        btnMainTelaCad = findViewById(R.id.btnMainTelaCad);
        btnMainTelaLog = findViewById(R.id.btnMainTelaLog);

        // Verifica se os botões existem no layout (evita NullPointerException)
        if (btnMainTelaCad == null || btnMainTelaLog == null) {
            Toast.makeText(this, "Erro: IDs dos botões não encontrados no layout.", Toast.LENGTH_LONG).show();
            return; // evita que o app continue e feche
        }

        // Botão para tela de cadastro
        btnMainTelaCad.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(MainActivity.this, TelaCadastrarActivity.class);
                startActivity(intent);
                // finish(); // opcional — use se quiser fechar a MainActivity
            } catch (Exception e) {
                Toast.makeText(MainActivity.this, "Erro ao abrir tela de cadastro.", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            }
        });

        // Botão para tela de login
        btnMainTelaLog.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(MainActivity.this, TelaLoginActivity.class);
                startActivity(intent);
                // finish(); // opcional
            } catch (Exception e) {
                Toast.makeText(MainActivity.this, "Erro ao abrir tela de login.", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            }
        });
    }
}
