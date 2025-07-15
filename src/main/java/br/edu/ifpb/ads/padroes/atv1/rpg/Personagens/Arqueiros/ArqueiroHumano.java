package br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Arqueiros;

import br.edu.ifpb.ads.padroes.atv1.rpg.Armaduras.ArmaduraFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Arqueiros.Humano.ArmaArqueiroHumanoSingleton;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Personagem;

public class ArqueiroHumano extends Personagem {

    public ArqueiroHumano(String nome) {

        super(nome,"Humano", "Arqueiro", 10,12,16, 100,70,
                ArmaArqueiroHumanoSingleton.getInstance(),
                ArmaduraFactory.getInstance("Arqueiro","Humano"),
                new String[]{"Tiro Certeiro", "Chuva de Flechas"});

    }

}
