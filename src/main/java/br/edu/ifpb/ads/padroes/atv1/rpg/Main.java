package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Guerreiros.GuerreiroOrc;

import br.edu.ifpb.ads.padroes.atv1.rpg.Factory.CriadorPersonagem;

public class Main {

    public static void main(String[] args) {

        CriadorPersonagem factory = new CriadorPersonagem();
        GuerreiroOrc personagem = factory.criaGuerreiroOrc("Josualdo");
        System.out.println(personagem);

    }
}