package br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Guerreiros;

import br.edu.ifpb.ads.padroes.atv1.rpg.Armaduras.ArmaduraFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Guerreiros.Humanos.ArmaGuerreiroHumanoSingleton;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Personagem;

public class GuerreiroHumano extends Personagem {


    public GuerreiroHumano(String nome) {

        super(nome,"Humano", "Guerreiro", 15,8,10, 120,30,
                ArmaGuerreiroHumanoSingleton.getInstance(),
                ArmaduraFactory.getInstance("Guerreiro","Humano"),
                new String[]{"Investida", "Bloqueio"});

    }

}
