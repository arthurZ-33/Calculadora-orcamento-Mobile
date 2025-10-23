package br.ulbra.calculadoraoramentobasico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnMainTelaCad,btnMainTelaLog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMainTelaCad = (Button) findViewById(R.id.btnMainTelaCad);
        btnMainTelaLog = (Button) findViewById(R.id.btnMainTelaLog);

        btnMainTelaCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TelaCadastrarActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnMainTelaLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TelaLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}