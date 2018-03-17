package com.example.logonpf.configuracaopersonagem

/**
 * Created by logonrm on 16/03/2018.
 */

enum class TipoPersonagemEnum (val id: Int) {
    ANAO(0),
    ELFO(1),
    ORC(2),
    GUERREIRO(3),
    MAGO(4);

companion object {

    fun from(findValue: Int): TipoPersonagemEnum =
            TipoPersonagemEnum.values().first { it.id == findValue}
}

}
