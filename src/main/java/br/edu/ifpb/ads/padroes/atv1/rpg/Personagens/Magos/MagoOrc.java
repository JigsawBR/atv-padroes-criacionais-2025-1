package br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Magos;

import br.edu.ifpb.ads.padroes.atv1.rpg.Armaduras.ArmaduraFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Magos.Orc.ArmaMagoOrcSingleton;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Personagem;

public class MagoOrc extends Personagem {

    public MagoOrc(String nome) {

        super(nome,"Orc", "Mago", 10,14,6, 100,120,
                ArmaMagoOrcSingleton.getInstance(),
                ArmaduraFactory.getInstance("Mago","Orc"),
                new String[]{"Magia Sombria", "Invocação"});

    }

}