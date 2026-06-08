package br.alvaro.factoryCriacional;

public abstract class LegacyLogger implements Logger {
    
    void log(String level, String text){
        System.out.println("[" + level + "] " + text);
    }

}
