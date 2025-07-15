package br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Arqueiros;

import br.edu.ifpb.ads.padroes.atv1.rpg.Armaduras.ArmaduraFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Arqueiros.Elfo.ArmaArqueiroElfoSingleton;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Personagem;

public class ArqueiroElfo extends Personagem {

    public ArqueiroElfo(String nome) {

        super(nome,"Elfo", "Arqueiro", 8,16,20, 90,100,
                ArmaArqueiroElfoSingleton.getInstance(),
                ArmaduraFactory.getInstance("Arqueiro","Elfo"),
                new String[]{"Tiro Múltiplo", "Camuflagem"});

    }

}
