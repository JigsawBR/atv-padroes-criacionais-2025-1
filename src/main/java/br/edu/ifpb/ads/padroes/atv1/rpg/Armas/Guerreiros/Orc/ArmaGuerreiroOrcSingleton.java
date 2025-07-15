package br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Guerreiros.Orc;

import java.util.Objects;

public class ArmaGuerreiroOrcSingleton {

    private static ArmaGuerreiroOrc instance;


    public static ArmaGuerreiroOrc getInstance(){
        synchronized (ArmaGuerreiroOrc.class){
            if(Objects.isNull(instance)){
                instance = new ArmaGuerreiroOrc();
            }
        }

        return instance;
    }
}