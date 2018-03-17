package com.example.logonpf.configuracaopersonagem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.AdapterView
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_personagem.*

class PersonagemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personagem)

        sbForca.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tvForca.setText(progress.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })

        spClasses.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?,
                                        view: View?,
                                        position: Int,
                                        id: Long) {

                val tipoPersonagem = TipoPersonagemEnum.from(position)
                when (tipoPersonagem) {
                    TipoPersonagemEnum.ANAO -> trocarImagem(R.drawable.anao)
                    TipoPersonagemEnum.GUERREIRO -> trocarImagem(R.drawable.guerreiro)
                    TipoPersonagemEnum.ORC -> trocarImagem(R.drawable.orc)
                    TipoPersonagemEnum.MAGO -> trocarImagem(R.drawable.mago)
                }

            }
        })
    }

    fun trocarImagem(idImagem: Int) {
        ivClasse.setImageDrawable(ContextCompat.getDrawable (
                this, idImagem
        ))
    }
}
