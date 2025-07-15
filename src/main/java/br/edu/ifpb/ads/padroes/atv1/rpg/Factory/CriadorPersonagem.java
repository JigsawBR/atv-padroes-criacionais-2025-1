package br.edu.ifpb.ads.padroes.atv1.rpg.Factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Armaduras.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Factory.CriaPersonagemFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Arqueiros.ArqueiroElfo;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Arqueiros.ArqueiroHumano;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Arqueiros.ArqueiroOrc;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Guerreiros.GuerreiroElfo;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Guerreiros.GuerreiroHumano;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Guerreiros.GuerreiroOrc;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Magos.MagoElfo;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Magos.MagoHumano;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Magos.MagoOrc;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.PersonagemEspecial;

public class CriadorPersonagem  implements CriaPersonagemFactory {

    @Override
    public GuerreiroHumano criaGuerreiroHumano(String nome) {
        return new GuerreiroHumano(nome);
    }

    @Override
    public GuerreiroOrc criaGuerreiroOrc(String nome) {
        return new GuerreiroOrc(nome);
    }

    @Override
    public GuerreiroElfo criaGuerreiroElfo(String nome) {
        return new GuerreiroElfo(nome);
    }

    @Override
    public ArqueiroHumano criaArqueiroHumano(String nome) {
        return new ArqueiroHumano(nome);
    }

    @Override
    public ArqueiroOrc criaArqueiroOrc(String nome) {
        return new ArqueiroOrc(nome);
    }

    @Override
    public ArqueiroElfo criaArqueiroElfo(String nome) {
        return new ArqueiroElfo(nome);
    }

    @Override
    public MagoHumano criaMagoHumano(String nome) {
        return new MagoHumano(nome);
    }

    @Override
    public MagoOrc criaMagoOrc(String nome) {
        return new MagoOrc(nome);
    }

    @Override
    public MagoElfo criaMagoElfo(String nome) {
        return new MagoElfo(nome);
    }

    @Override
    public PersonagemEspecial criaPersonagemEspecial(String nome) {
        return new PersonagemEspecial(nome);
    }

}