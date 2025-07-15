package br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Magos;

import br.edu.ifpb.ads.padroes.atv1.rpg.Armaduras.ArmaduraFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Magos.Elfo.ArmaMagoElfoSingleton;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Personagem;

public class MagoElfo extends Personagem {

    public MagoElfo(String nome) {

        super(nome,"Elfo", "Mago", 4,20,14, 70,180,
                ArmaMagoElfoSingleton.getInstance(),
                ArmaduraFactory.getInstance("Mago","Elfo"),
                new String[]{"Magia da Natureza", "Teleporte"});

    }
}
