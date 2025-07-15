package br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Guerreiros;

import br.edu.ifpb.ads.padroes.atv1.rpg.Armaduras.ArmaduraFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Guerreiros.Elfo.ArmaGuerreiroElfoSingleton;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Personagem;

public class GuerreiroElfo extends Personagem {

    public GuerreiroElfo(String nome) {

        super(nome,"Elfo", "Guerreiro", 12,14,16, 100,60,
                ArmaGuerreiroElfoSingleton.getInstance(),
                ArmaduraFactory.getInstance("Guerreiro","Elfo"),
                new String[]{"Dança das Lâminas", "Agilidade Élfica"});

    }

}
