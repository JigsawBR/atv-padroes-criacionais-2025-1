package br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Guerreiros.Humanos;

import java.util.Objects;

public class ArmaGuerreiroHumanoSingleton {

    private static ArmaGuerreiroHumano instance;

    private ArmaGuerreiroHumanoSingleton(){}


    public static ArmaGuerreiroHumano getInstance(){
        synchronized (ArmaGuerreiroHumano.class){
            if(Objects.isNull(instance)){
                instance = new ArmaGuerreiroHumano();
            }
        }

        return instance;
    }
}
