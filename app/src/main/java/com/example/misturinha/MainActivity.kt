package com.example.misturinha

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.misturinha.R
import com.bumptech.glide.Glide



class MainActivity : AppCompatActivity() {
    private val mistruraDrogas = mapOf(
        "LSD" to mapOf(
            "LSD" to "Você selecionou a mesma droga duas vezes, refaça!",
            "Cogumelo" to "Mistura, se divirta parceiro.",
            "DMT" to "Mistura segura, se divirta parceiro.",
            "Maconha" to "Cuidado: LSD e Maconha podem causar efeitos indesejados, vai com CALMA doidão!",
            "Ketamina" to "Mistura segura, se divirta parceiro.",
            "Anfetamina" to "Cuidado: LSD e Anfetamina podem causar efeitos indesejados, vai com CALMA doidão!",
            "MDMA" to "Cuidado: LSD e MDMA podem causar efeitos indesejados, vai com CALMA doidão!",
            "Cocaína" to "Mistura perigosa: LSD e Cocaína não devem ser combinados, quer morrer lokão?.",
            "Álcool" to "Baixo risco, não exagere muito doidão",
            "Opioides" to "Sem informações, testa ai nóia.",
            "Benzodiazepina" to "Baixo risco, não exagere muito doidão",
            "ISRS" to "Baixo Risco, não exagere muito doidão"
        ),
        "Cogumelo" to mapOf(
            "LSD" to "Mistura segura, se divirta parceiro.",
            "Cogumelo" to "Você selecionou a mesma droga duas vezes, refaça!",
            "DMT" to "Mistura segura, se divirta parceiro.",
            "Maconha" to "Cuidado: Cogumelo e Maconha podem causar efeitos indesejados, vai com CALMA doidão!",
            "Ketamina" to "Mistura segura, se divirta parceiro.",
            "Anfetamina" to "Cuidado: Cogumelo e Anfetamina podem causar efeitos indesejados, vai com CALMA doidão!",
            "MDMA" to "Mistura segura, se divirta parceiro.",
            "Cocaína" to "Cuidado: Cogumelo e Cocaína podem causar efeitos indesejados, vai com CALMA doidão!",
            "Álcool" to "Baixo risco, não exagere muito doidão",
            "Opioides" to "Sem informações, testa ai nóia.",
            "Benzodiazepina" to "Baixo risco, não exagere muito doidão",
            "ISRS" to "Baixo risco, não exagere muito doidão"
        ),
        "DMT" to mapOf(
            "LSD" to "Mistura segura, se divirta parceiro.",
            "Cogumelo" to "Mistura segura, se divirta parceiro.",
            "DMT" to "Você selecionou a mesma droga duas vezes, refaça!",
            "Maconha" to "Cuidado: DMT e Maconha podem causar efeitos indesejados, vai com CALMA doidão!",
            "Ketamina" to "Mistura segura, se divirta parceiro.",
            "Anfetamina" to "Cuidado: DMT e Anfetamina podem causar efeitos indesejados, vai com CALMA doidão!",
            "MDMA" to "Mistura segura, se divirta parceiro.",
            "Cocaína" to "Cuidado: DMT e Cocaína podem causar efeitos indesejados, vai com CALMA doidão!",
            "Álcool" to "Baixo Risco, não exagere muito doidão",
            "Opioides" to "Sem informações, testa ai nóia.",
            "Benzodiazepina" to "Baixo Risco, não exagere muito doidão",
            "ISRS" to "Baixo Risco, não exagere muito doidão"
        ),
        "Maconha" to mapOf(
            "LSD" to "Cuidado: LSD e Maconha podem causar efeitos indesejados, vai com CALMA doidão!",
            "Cogumelo" to "Cuidado: Cogumelo e Maconha podem causar efeitos indesejados, vai com CALMA doidão!",
            "DMT" to "Cuidado: DMT e Maconha podem causar efeitos indesejados, vai com CALMA doidão!",
            "Maconha" to "Você selecionou a mesma droga duas vezes, refaça!",
            "Ketamina" to "Mistura segura, se divirta parceiro.",
            "Anfetamina" to "Cuidado: Maconha e Anfetamina podem causar efeitos indesejados, vai com CALMA doidão!",
            "MDMA" to "Mistura segura, se divirta parceiro.",
            "Cocaína" to "Cuidado: Maconha e Cocaína podem causar efeitos indesejados, vai com CALMA doidão!",
            "Álcool" to "Baixo Risco, não exagere muito doidão",
            "Opioides" to "Sem informações, testa ai nóia.",
            "Benzodiazepina" to "Baixo Risco, não exagere muito doidão",
            "ISRS" to "Baixo Risco, não exagere muito doidão"
        ),
        "Ketamina" to mapOf(
            "LSD" to "Mistura segura, se divirta parceiro.",
            "Cogumelo" to "Mistura segura, se divirta parceiro.",
            "DMT" to "Mistura segura, se divirta parceiro.",
            "Maconha" to "Mistura segura, se divirta parceiro.",
            "Ketamina" to "Você selecionou a mesma droga duas vezes, refaça!",
            "Anfetamina" to "Cuidado: Ketamina e Anfetamina podem causar efeitos indesejados, vai com CALMA doidão!",
            "MDMA" to "Mistura segura, se divirta parceiro.",
            "Cocaína" to "Cuidado: Ketamina e Cocaína podem causar efeitos indesejados, vai com CALMA doidão!",
            "Álcool" to "Mistura perigosa: Ketamina e Álcool não devem ser combinados, quer morrer lokão?",
            "Opioides" to "Mistura perigosa: Ketamina e Opioides não devem ser combinados,quer morrer lokão?",
            "Benzodiazepina" to "Cuidado: Ketamina e Benzodiazepina podem causar efeitos indesejados, vai com CALMA doidão!",
            "ISRS" to "Sem informações, testa ai nóia."
        ),
        "Anfetamina" to mapOf(
            "LSD" to "Cuidado: LSD e Anfetamina podem causar efeitos indesejados, vai com CALMA doidão!",
            "Cogumelo" to "Cuidado: Cogumelo e Anfetamina podem causar efeitos indesejados, vai com CALMA doidão!",
            "DMT" to "Cuidado: DMT e Anfetamina podem causar efeitos indesejados, vai com CALMA doidão!",
            "Maconha" to "Cuidado: Maconha e Anfetamina podem causar efeitos indesejados, vai com CALMA doidão!",
            "Ketamina" to "Cuidado: Ketamina e Anfetamina podem causar efeitos indesejados,vai com CALMA doidão!",
            "Anfetamina" to "Você selecionou a mesma droga duas vezes, refaça!",
            "MDMA" to "Mistura segura, se divirta parceiro.",
            "Cocaína" to "Cuidado: Anfetamina e Cocaína podem causar efeitos indesejados, vai com CALMA doidão!",
            "Álcool" to "Cuidado: Anfetamina e Álcool podem causar efeitos indesejados, vai com CALMA doidão!",
            "Opioides" to "Sem informações, testa ai nóia.",
            "Benzodiazepina" to "Baixo Risco, não exagere muito doidão",
            "ISRS" to "Sem informaçãoes, testa ai nóia."
        ),
        "MDMA" to mapOf(
            "LSD" to "Cuidado: LSD e MDMA podem causar efeitos indesejados, vai com CALMA doidão!",
            "Cogumelo" to "Cuidado: Cogumelo e MDMA podem causar efeitos indesejados, vai com CALMA doidão!",
            "DMT" to "Cuidado: DMT e MDMA podem causar efeitos indesejados, vai com CALMA doidão!",
            "Maconha" to "Cuidado: Maconha e MDMA podem causar efeitos indesejados, vai com CALMA doidão!",
            "Ketamina" to "Cuidado: Ketamina e MDMA podem causar efeitos indesejados, vai com CALMA doidão!",
            "Anfetamina" to "Cuidado: Anfetamina e MDMA podem causar efeitos indesejados, vai com CALMA doidão!",
            "MDMA" to "Você selecionou a mesma droga duas vezes, refaça!",
            "Cocaína" to "Mistura perigosa: MDMA e Cocaína não devem ser combinados,quer morrer lokão?",
            "Álcool" to "Cuidado: MDMA e Álcool podem causar efeitos indesejados, vai com CALMA doidão!",
            "Opioides" to "Sem informações, testa ai nóia.",
            "Benzodiazepina" to "Sem informações, testa ai nóia.",
            "ISRS" to "Sem informações, testa ai nóia."
        ),
        "Cocaína" to mapOf(
            "LSD" to "Cuidado: Cocaína e LSD podem causar efeitos indesejados, vai com CALMA doidão!",
            "Cogumelo" to "Cuidado: Cocaína e Cogumelo podem causar efeitos indesejados, vai com CALMA doidão!",
            "DMT" to "Cuidado: Cocaína e DMT podem causar efeitos indesejados, vai com CALMA doidão!",
            "Maconha" to "Cuidado: Maconha e Cocaína podem causar efeitos indesejados, vai com CALMA doidão!",
            "Ketamina" to "Cuidado: Ketamina e Cocaína podem causar efeitos indesejados, vai com CALMA doidão!",
            "Anfetamina" to "Cuidado: Cocaína e Anfetamina podem causar efeitos indesejados,vai com CALMA doidão!",
            "MDMA" to "Cuidado: Cocaína e MDMA podem causar efeitos indesejados, vai com CALMA doidão!",
            "Cocaína" to "Você selecionou a mesma droga duas vezes, refaça!",
            "Álcool" to "Mistura perigosa: Cocaína e Álcool não devem ser combinados,quer morrer lokão?",
            "Opioides" to "Cuidado: Cocaína e Opioides podem causar efeitos indesejados, vai com CALMA doidão!",
            "Benzodiazepina" to "Mistura perigosa: Cocaína e Benzodiazepina não devem ser combinados,quer morrer lokão?",
            "ISRS" to "Baixo Risco."
        ),
        "Álcool" to mapOf(
            "LSD" to "Baixo Risco, não exagere muito doidão.",
            "Cogumelo" to "Baixo Risco, não exagere muito doidão",
            "DMT" to "Baixo Risco, não exagere muito doidão",
            "Maconha" to "Mistura segura, se divirta parceiro",
            "Ketamina" to "Mistura perigosa: Álcool e Ketamina não devem ser combinados,quer morrer lokão?",
            "Anfetamina" to "Cuidado: Anfetamina e Álcool podem causar efeitos indesejados, vai com CALMA doidão!",
            "MDMA" to "Cuidado: MDMA e Álcool podem causar efeitos indesejados, vai com CALMA doidão!",
            "Cocaína" to "Mistura perigosa: Cocaína e Álcool não devem ser combinados,quer morrer lokão?",
            "Álcool" to "Você selecionou a mesma droga duas vezes, refaça!",
            "Opioides" to "Mistura perigosa: Álcool e Opioiodes não devem ser combinados,quer morrer lokão?",
            "Benzodiazepina" to "Mistura perigosa: Álcool e Benzodiazepina não devem ser combinados,quer morrer lokão?",
            "ISRS" to "Cuidado: Álcool e ISRS podem causar efeitos indesejados, vai com CALMA doidão!"
        ),
        "Opioides" to mapOf(
            "LSD" to "Sem Informações, testa ai nóia.",
            "Cogumelo" to "Sem Informações, testa ai nóia.",
            "DMT" to "Sem Informações, testa ai nóia.",
            "Maconha" to "Mistura segura, se divirta parceiro",
            "Ketamina" to "Mistura perigosa: Opioiodes e Ketamina não devem ser combinados,quer morrer lokão?",
            "Anfetamina" to "Cuidado: Opioides e Anfetaminas podem causar efeitos indesejados,vai com CALMA doidão!",
            "MDMA" to "Mistura perigosa: Opioiodes e MDMA não devem ser combinados,quer morrer lokão?",
            "Cocaína" to "Mistura perigosa: Opioiodes e Cocaína não devem ser combinados,quer morrer lokão?",
            "Álcool" to "Mistura perigosa: Opioiodes e Álcool não devem ser combinados,quer morrer lokão?",
            "Opioides" to "Você selecionou a mesma droga duas vezes, refaça!",
            "Benzodiazepina" to "Mistura perigosa: Opioiodes e Benzodiazepina não devem ser combinados,quer morrer lokão?",
            "ISRS" to "Sem informações, testa ai nóia."
        ),
        "Benzodiazepina" to mapOf(
            "LSD" to "Baixo Risco, não exagere muito doidão",
            "Cogumelo" to "Baixo Risco, não exagere muito doidão",
            "DMT" to "Baixo Risco, não exagere muito doidão",
            "Maconha" to "Baixo Risco, não exagere muito doidão",
            "Ketamina" to "Cuidado: Opioides e Anfetaminas podem causar efeitos indesejados, vai com CALMA doidão!",
            "Anfetamina" to "Baixo Risco, não exagere muito doidão",
            "MDMA" to "Baixo Risco, não exagere muito doidão",
            "Cocaína" to "Baixo Risco, não exagere muito doidão",
            "Álcool" to "Mistura perigosa: Benzodiazepina e Álcool não devem ser combinados,quer morrer lokão?",
            "Opioides" to "Mistura perigosa: Benzodiazepina e Opioides não devem ser combinados, quer morrer lokão?",
            "Benzodiazepina" to "Você selecionou a mesma droga duas vezes, refaça!",
            "ISRS" to "Sem informações, testa ai nóia."
        ),
        "ISRS" to mapOf(
            "LSD" to "Baixo Risco, não exagere muito doidão",
            "Cogumelo" to "Baixo Risco, não exagere muito doidão",
            "DMT" to "Baixo Risco, não exagere muito doidão",
            "Maconha" to "Mistura segura, se divirta parceiro",
            "Ketamina" to "Sem informações, testa ai nóia.",
            "Anfetamina" to "Sem informações, testa ai nóia.",
            "MDMA" to "Baixo Risco, não exagere muito doidão",
            "Cocaína" to "Sem informações, testa ai nóia.",
            "Álcool" to "Cuidado: ISRS e Álcool podem causar efeitos indesejados,vai com CALMA doidão!",
            "Opioides" to "Sem informações, testa ai nóia.",
            "Benzodiazepina" to "Sem informações, testa ai nóia.",
            "ISRS" to "Você selecionou a mesma droga duas vezes!"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // chamando os spiners
        val spinnerDroga1: Spinner = findViewById(R.id.opcaoUm)
        val spinnerDroga2: Spinner = findViewById(R.id.opcaoDois)
        val buttonCheck: Button = findViewById(R.id.botaoMistura)

        // Configurando o listener para o botão de misturar
        buttonCheck.setOnClickListener {
            val droga1 = spinnerDroga1.selectedItem.toString()
            val droga2 = spinnerDroga2.selectedItem.toString()

            // Verificando a mistura e obtendo o resultado
            val result = checandoMistura(droga1, droga2)
            val imageResId = resultadoImagem(result)

            // Abrindo a tela Ladob e passando os dados
            val intent = Intent(this, Ladob::class.java).apply {
                putExtra("result", result)
                putExtra("imageResId", imageResId)
            }
            startActivity(intent)
        }
    }

    private fun checandoMistura(droga1: String, droga2: String): String {
        // Busca a combinação na tabela
        return mistruraDrogas[droga1]?.get(droga2) ?: "NADA"
    }


    private fun resultadoImagem(result: String): Int {
        return when {
            result.contains("perigosa", ignoreCase = true) -> R.raw.caixao // quer morrer lokao
            result.contains("Cuidado", ignoreCase = true) -> R.drawable.atencao // vai com calma doidao
            result.contains("mesma droga", ignoreCase = true) -> R.drawable.atencao
            result.contains("Baixo Risco", ignoreCase = true) -> R.drawable.baixorisco
            result.contains("Mistura segura", ignoreCase = true) -> R.drawable.seguro
            result.contains("Sem info", ignoreCase = true) -> R.drawable.opinar //testa ai noia
            else -> 0
        }
    }
}
