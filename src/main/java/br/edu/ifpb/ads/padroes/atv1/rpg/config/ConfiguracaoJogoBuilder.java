package br.edu.ifpb.ads.padroes.atv1.rpg.config;

public class ConfiguracaoJogoBuilder {

    private ConfiguracaoJogo configuracaoJogo;

    private ConfiguracaoJogoBuilder(){
        configuracaoJogo = new ConfiguracaoJogo();
    }

    public static ConfiguracaoJogoBuilder builder(){
        return new ConfiguracaoJogoBuilder();
    }

    public ConfiguracaoJogo build(){
        return this.configuracaoJogo;
    }

    public ConfiguracaoJogoBuilder nivelDificuldade(int nivelDificuldade){
        this.configuracaoJogo.setNivelDificuldade(nivelDificuldade);
        return this;
    }
}
