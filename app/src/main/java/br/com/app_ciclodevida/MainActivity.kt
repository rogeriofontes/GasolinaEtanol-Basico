package br.com.app_ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //val gasolinaEdt = findViewById<EditText>(R.id.gasolinaEdt)
    //val etanolEdt = findViewById<EditText>(R.id.etanolEdt)
    //val calcularBtn = findViewById<Button>(R.id.calcularBtn)
    ///val resultadoTv = findViewById<TextView>(R.id.resultadoTv)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Estou no onCreate", Toast.LENGTH_LONG).show()

        //var nomeTv = findViewById<TextView>(R.id.nomeTv)

        //nomeTv.text = "Estou colocando uma frase qualquer"



        calcularBtn.setOnClickListener {
            var valorGasolinaEdt = gasolinaEdt.text.toString()
            var valorEtanolEdt = etanolEdt.text.toString()

            if (valorGasolinaEdt.trim().isNotEmpty() && valorEtanolEdt.trim().isNotEmpty()) {

                //TODO = 1 - pegar o valor da gasolina
                val valorGasolina: Double = valorGasolinaEdt.toDouble()
                //TODO = 2 - pegar o valor do Etanol

                val valorEtanol: Double = valorEtanolEdt.toDouble()
                //TODO = 3 - calcular se é melhor usar Etanol ou Gasolina


                /*btnCalcular.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            dfasdfsd
                    }
                }*/

                getMedia(valorEtanol, valorGasolina)

            } else {
                Toast.makeText(
                    this,
                    "É necessário digitar os valores dos combustíveis",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }


    }

    private fun getMedia(valorEtanol: Double, valorGasolina: Double) {
        var valorMedia = valorEtanol / valorGasolina
        if (valorMedia < 0.7) {
            resultadoTv.text = "Nesse caso é melhor colocar Etanol"
            Log.i("MainActivity", "Nesse caso é melhor colocar Etanol")
        } else {
            resultadoTv.text = "Nesse caso é melhor colocar Gasolina"
            Log.i("MainActivity", "Nesse caso é melhor colocar Gasolina")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("onStart", "Estou no onStart")
        //TODO - alguma tarefa - acessar webserve
        Toast.makeText(this, "Estou no onStart", Toast.LENGTH_LONG).show()
    }


    override fun onResume() {
        super.onResume()
        Log.i("onStart", "Estou no onResume")
        //TODO - alguma tarefa - atualiza os dados do banco de dados
        Toast.makeText(this, "Estou no onResume", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("onStart", "Estou no onPause")
        //TODO - alguma tarefa - salvei os dados alterados pelo usario
        Toast.makeText(this, "Estou no onPause", Toast.LENGTH_LONG).show()
    }


    override fun onStop() {
        super.onStop()
        Log.i("onStop", "Estou no onStop")
        //TODO - alguma tarefa
        Toast.makeText(this, "Estou no onStop", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("onRestart", "Estou no onRestart")
        //TODO - alguma tarefa
        Toast.makeText(this, "Estou no onRestart", Toast.LENGTH_LONG).show()
        //--> onStart()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("onDestroy", "Estou no onDestroy")
        //TODO - alguma tarefa
        Toast.makeText(this, "Estou no onDestroy", Toast.LENGTH_LONG).show()
    }


}