package br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Arqueiros.Elfo;

import java.util.Objects;

public class ArmaArqueiroElfoSingleton {

    private static ArmaArqueiroElfo instance;

    private ArmaArqueiroElfoSingleton(){}


    public static ArmaArqueiroElfo getInstance(){
        synchronized (ArmaArqueiroElfo.class){
            if(Objects.isNull(instance)){
                instance = new ArmaArqueiroElfo();
            }
        }

        return instance;
    }
}