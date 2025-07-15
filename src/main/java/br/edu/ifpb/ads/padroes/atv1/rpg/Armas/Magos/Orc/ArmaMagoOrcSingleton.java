package br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Magos.Orc;

import java.util.Objects;

public class ArmaMagoOrcSingleton {
    private static ArmaMagoOrc instance;

    private ArmaMagoOrcSingleton(){}


    public static ArmaMagoOrc getInstance(){
        synchronized (ArmaMagoOrc.class){
            if(Objects.isNull(instance)){
                instance = new ArmaMagoOrc();
            }
        }

        return instance;
    }
}