package br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Arqueiros.Orc;

import java.util.Objects;

public class ArmaArqueiroOrcSingleton {
    private static ArmaArqueiroOrc instance;

    private ArmaArqueiroOrcSingleton(){}


    public static ArmaArqueiroOrc getInstance(){
        synchronized (ArmaArqueiroOrc.class){
            if(Objects.isNull(instance)){
                instance = new ArmaArqueiroOrc();
            }
        }

        return instance;
    }
}
