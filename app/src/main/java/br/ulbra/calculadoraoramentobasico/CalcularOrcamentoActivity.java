package br.ulbra.calculadoraoramentobasico;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalcularOrcamentoActivity extends AppCompatActivity {
    EditText edtxtReceitas, edtxtDespesas;
    Button btnCalcular, btnLimparCampos;
    TextView txtvSaldo, txtvLimiteDespesa, txtvIdealPoupanca;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_calcular_orcamento);

        edtxtReceitas = (EditText) findViewById(R.id.edtxtReceitas);
        edtxtDespesas = (EditText) findViewById(R.id.edtxtDespesas);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnLimparCampos = (Button) findViewById(R.id.btnLimparCampos);
        txtvSaldo = (TextView) findViewById(R.id.txtvSaldo);
        txtvLimiteDespesa = (TextView) findViewById(R.id.txtvLimiteDespesa);
        txtvIdealPoupanca = (TextView) findViewById(R.id.txtvIdealPoupanca);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sReceita = edtxtReceitas.getText().toString();
                String sDespesa = edtxtDespesas.getText().toString();

                if (sReceita.isEmpty() || sDespesa.isEmpty()) {
                    txtvSaldo.setText("Ei! Insira todos os dados!");
                    return;
                }


                double receita = Double.parseDouble(sReceita);
                double despesa = Double.parseDouble(sDespesa);


                double limiteDespesas70 = receita * 0.70;
                double idealPoupanca30 = receita * 0.30;
                double saldo = receita - despesa;


                if (saldo < 0) {
                    txtvSaldo.setText(String.format("O seu SALDO é: R$ %.2f. Totalizando um DÉFICIT.", saldo));
                } else {
                    txtvSaldo.setText(String.format("O seu SALDO é: R$ %.2f. Totalizando um SUPERÁVIT!", saldo));
                }

                String analise;


                if (despesa <= limiteDespesas70) {
                    double excedente = limiteDespesas70 - despesa;
                    analise = String.format("Você está no caminho 70/30! \nSuas despesas (R$ %.2f) estão"
                                    + " ABAIXO do limite (R$ %.2f). \nPode poupar um extra de R$ %.2f!",// <-- E AQUI!
                            despesa, limiteDespesas70, idealPoupanca30 + excedente);
                } else {
                    double estouro = despesa - limiteDespesas70;
                    analise = String.format("FAIL! Suas despesas (R$ %.2f) \nESTOURARAM o limite de 70%% (R$ %.2f) em R$ %.2f. \nReajuste seu *budget*, mortal.",
                            despesa, limiteDespesas70, estouro);
                }
// ...




                txtvLimiteDespesa.setText(analise);

                txtvIdealPoupanca.setText(String.format("Meta de Poupança (30%%): R$ %.2f", idealPoupanca30));

            }
        });

        btnLimparCampos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtxtReceitas.setText("");
                edtxtDespesas.setText("");
                txtvSaldo.setText("Aguardando cálculos...");
                txtvLimiteDespesa.setText("Limite 70%: -");
                txtvIdealPoupanca.setText("Meta 30%: -");
            }
        });
    }
}