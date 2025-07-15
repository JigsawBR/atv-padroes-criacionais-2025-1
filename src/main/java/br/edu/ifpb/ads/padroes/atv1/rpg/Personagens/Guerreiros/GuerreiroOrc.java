package br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Guerreiros;

import br.edu.ifpb.ads.padroes.atv1.rpg.Armaduras.ArmaduraFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Guerreiros.Orc.ArmaGuerreiroOrcSingleton;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Personagem;

public class GuerreiroOrc extends Personagem {

    public GuerreiroOrc(String nome) {

        super(nome,"Orc", "Guerreiro", 20,6,8, 150,20,
                ArmaGuerreiroOrcSingleton.getInstance(),
                ArmaduraFactory.getInstance("Guerreiro","Orc"),
                new String[]{"Fúria", "Pancada Devastadora"});

    }

}
