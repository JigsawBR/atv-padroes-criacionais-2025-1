package br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Arqueiros.Humano;

import java.util.Objects;

public class ArmaArqueiroHumanoSingleton {

    private static ArmaArqueiroHumano instance;

    private ArmaArqueiroHumanoSingleton(){}


    public static ArmaArqueiroHumano getInstance(){
        synchronized (ArmaArqueiroHumano.class){
            if(Objects.isNull(instance)){
                instance = new ArmaArqueiroHumano();
            }
        }

        return instance;
    }
}