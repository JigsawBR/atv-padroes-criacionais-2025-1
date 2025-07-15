package br.edu.ifpb.ads.padroes.atv1.rpg.Armaduras;

public class ArmaduraFactory {

    private ArmaduraFactory(){}

    public static Armadura getInstance(String classe, String raca){
        if (classe.equals("Guerreiro") ) {
            switch (raca) {
                case "Humano" -> {
                    return new ArmaduraGuerreiroHumano();
                }
                case "Elfo" -> {
                    return new ArmaduraGuerreiroElfo();
                }
                case "Orc" -> {
                    return new ArmaduraGuerreiroOrc();
                }
            }
        }

        else if (classe.equals("Arqueiro") ) {
            switch (raca) {
                case "Humano" -> {
                    return new ArmaduraArqueiroHumano();
                }
                case "Elfo" -> {
                    return new ArmaduraArqueiroElfo();
                }
                case "Orc" -> {
                    return new ArmaduraArqueiroOrc();
                }
            }
        }

        else if (classe.equals("Mago") ) {
            switch (raca) {
                case "Humano" -> {
                    return new ArmaduraMagoHumano();
                }
                case "Elfo" -> {
                    return new ArmaduraMagoElfo();
                }
                case "Orc" -> {
                    return new ArmaduraMagoOrc();
                }
            }
        }

        return null;

    }
}
