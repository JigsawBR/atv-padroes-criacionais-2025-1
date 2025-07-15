package br.edu.ifpb.ads.padroes.atv1.rpg.Armas.Magos.Humano;

import java.util.Objects;

public class ArmaMagoHumanoSingleton {
    private static ArmaMagoHumano instance;

    private ArmaMagoHumanoSingleton(){}


    public static ArmaMagoHumano getInstance(){
        synchronized (ArmaMagoHumano.class){
            if(Objects.isNull(instance)){
                instance = new ArmaMagoHumano();
            }
        }

        return instance;
    }
}
