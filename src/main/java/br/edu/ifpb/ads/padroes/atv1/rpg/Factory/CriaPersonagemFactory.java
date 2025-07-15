package br.edu.ifpb.ads.padroes.atv1.rpg.Factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Arqueiros.ArqueiroElfo;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Arqueiros.ArqueiroHumano;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Arqueiros.ArqueiroOrc;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Guerreiros.GuerreiroElfo;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Guerreiros.GuerreiroHumano;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Guerreiros.GuerreiroOrc;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Magos.MagoElfo;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Magos.MagoHumano;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagens.Magos.MagoOrc;

public interface  CriaPersonagemFactory {

    GuerreiroHumano criaGuerreiroHumano(String nome);

    GuerreiroOrc criaGuerreiroOrc(String nome);

    GuerreiroElfo criaGuerreiroElfo(String nome);

    ArqueiroHumano criaArqueiroHumano(String nome);

    ArqueiroOrc criaArqueiroOrc(String nome);

    ArqueiroElfo criaArqueiroElfo(String nome);

    MagoHumano criaMagoHumano(String nome);

    MagoOrc criaMagoOrc(String nome);

    MagoElfo criaMagoElfo(String nome);

    PersonagemEspecial criaPersonagemEspecial(String nome);
}