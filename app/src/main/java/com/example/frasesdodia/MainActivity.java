package com.example.frasesdodia;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn_nova_frase;
    private TextView texto_nova_frase;
    private List<String> frases = new ArrayList<String>() {
        {
            add("Ser feliz sem motivo é a mais autêntica forma de felicidade.");
            add("Saber encontrar a alegria na alegria dos outros, é o segredo da felicidade.");
            add("A amizade desenvolve a felicidade e reduz o sofrimento, duplicando a nossa alegria e dividindo a nossa dor.");
            add("Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer.");
            add("A verdadeira motivação vem de realização, desenvolvimento pessoal, satisfação no trabalho e reconhecimento.");
            add("Frases Inteligentes Cerca de 360 frases Inteligentes Tente mover o mundo – o primeiro passo será mover a si mesmo.");
            add("Quando vires um homem bom, tenta imitá-lo; quando vires um homem mau, examina-te a ti mesmo.");
            add("Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.");
            add("Não deixe que as pessoas te façam desistir daquilo que você mais quer na vida. Acredite. Lute. Conquiste. E acima de tudo, seja feliz!");
            add("Evite desencorajar-se: mantenha ocupações e faça do otimismo a maneira de viver. Isso restaura a fé em si.");
            add("O otimismo é a fé em ação. Nada se pode levar a efeito sem otimismo.");
            add("A descoberta consiste em ver o que todos viram e em pensar no que ninguém pensou.");
            add("O progresso do homem não é mais do que uma descoberta gradual de que as suas perguntas não têm significado.");
            add("Há pessoas que amam o poder, e outras que têm o poder de amar.");
            add("Ideal seria que todas as pessoas soubessem amar, o tanto que sabem fingir.");
            add("Supere seus demônios com uma coisa chamada amor.");
            add("Faça amor e não guerra! Pois não precisamos de problemas. O que precisamos é de amor.");
            add("Daria tudo que sei pela metade do que ignoro.");
            add("Isto é um sonho, bem sei, mas quero continuar a sonhar.");
            add("Só sei que nada sei, e o fato de saber isso, me coloca em vantagem sobre aqueles que acham que sabem alguma coisa.");
            add("Para conhecermos os amigos é necessário passar pelo sucesso e pela desgraça. No sucesso, verificamos a quantidade e, na desgraça, a qualidade.");
            add("Exige muito de ti e espera pouco dos outros. Assim, evitarás muitos aborrecimentos.");
            add("Não espere por uma crise para descobrir o que é importante em sua vida.");
            add("E aqueles que foram vistos dançando foram julgados insanos por aqueles que não podiam escutar a música.");
            add("Quem quiser vencer na vida deve fazer como os seus sábios: mesmo com a alma partida, ter um sorriso nos lábios.");
            add("É mais fácil obter o que se deseja com um sorriso do que à ponta da espada.");
            add("O sorriso enriquece os recebedores sem empobrecer os doadores.");
            add("Pouca coisa é necessária para transformar inteiramente uma vida: amor no coração e sorriso nos lábios.");
            add("Mesmo depois de conhecer vários e novos sorrisos, o dele ainda é o meu preferido.");
            add("Não preciso me drogar para ser um gênio Não preciso ser um gênio para ser humano Mas preciso do seu sorriso para ser feliz.");
            add("Toda mulher leva um sorriso no rosto e mil segredos no coração.");
            add("É erro vulgar confundir o desejar com o querer. O desejo mede os obstáculos; a vontade vence-os.");
            add("Se meus olhos mostrassem a minha alma, todos, ao me verem sorrir, chorariam comigo.");
            add("Creio no riso e nas lágrimas como antídotos contra o ódio e o terror.");
            add("Quem quer vencer um obstáculo deve armar-se da força do leão e da prudência da serpente.");
            add("A força do desejo da carne facilmente vence as barreiras morais do homem insatisfeito.");
            add("O desejo vence o medo, atropela inconvenientes e aplana dificuldades.");
            add("Quanto maiores são as dificuldades a vencer, maior será a satisfação.");
            add("Muitos homens devem a grandeza da sua vida aos obstáculos que tiveram que vencer.");
            add("Ninguém pode vencer por você, acredite, só você pode derrubar os obstáculos que surgem no seu caminho.");
            add("Nenhum obstáculo será tão grande se sua vontade de vencer for maior.");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        this.btn_nova_frase = findViewById(R.id.btn_nova_frase_id);
        this.texto_nova_frase = findViewById(R.id.texto_frase_id);

        this.btn_nova_frase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int numero = random.nextInt(frases.size());
                texto_nova_frase.setText(frases.get(numero));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
