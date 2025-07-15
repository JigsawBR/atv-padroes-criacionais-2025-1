package br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Magos;

import br.edu.ifpb.ads.padroes.atv1.rpg.Armaduras.ArmaduraFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Magos.Humano.ArmaMagoHumanoSingleton;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Personagem;

public class MagoHumano extends Personagem {

    public MagoHumano(String nome) {

        super(nome,"Humano", "Mago", 6,18,8, 80,150,
                ArmaMagoHumanoSingleton.getInstance(),
                ArmaduraFactory.getInstance("Mago","Humano"),
                new String[]{"Bola de Fogo", "Cura"});

    }

}
