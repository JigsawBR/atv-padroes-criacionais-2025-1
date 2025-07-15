package br.edu.ifpb.ads.padroes.atv1.rpg.Personagens;

import br.edu.ifpb.ads.padroes.atv1.rpg.Armaduras.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Arma;

public class PersonagemEspecial extends br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Personagem {

    public PersonagemEspecial(String nome) {

        super(nome + " o Lendário","Humano", "Guerreiro", 18,10,12, 140,40,
                new Arma("Excalibur", 35, "Espada"),
                new Armadura("Armadura do Rei", 30, "Pesada"),
                new String[]{"Investida", "Bloqueio", "Liderança"});

    }
}