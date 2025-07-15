package br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Guerreiros.Elfo;

import java.util.Objects;

public class ArmaGuerreiroElfoSingleton {

    private static ArmaGuerreiroElfo instance;

    private ArmaGuerreiroElfoSingleton(){}


    public static ArmaGuerreiroElfo getInstance(){
        synchronized (ArmaGuerreiroElfo.class){
            if(Objects.isNull(instance)){
                instance = new ArmaGuerreiroElfo();
            }
        }

        return instance;
    }

}