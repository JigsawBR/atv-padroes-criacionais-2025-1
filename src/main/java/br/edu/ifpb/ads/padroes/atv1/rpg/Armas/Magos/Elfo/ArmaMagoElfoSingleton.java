package br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Magos.Elfo;

import java.util.Objects;

public class ArmaMagoElfoSingleton {
    private static ArmaMagoElfo instance;

    private ArmaMagoElfoSingleton(){}


    public static ArmaMagoElfo getInstance(){
        synchronized (ArmaMagoElfo.class){
            if(Objects.isNull(instance)){
                instance = new ArmaMagoElfo();
            }
        }

        return instance;
    }
}
