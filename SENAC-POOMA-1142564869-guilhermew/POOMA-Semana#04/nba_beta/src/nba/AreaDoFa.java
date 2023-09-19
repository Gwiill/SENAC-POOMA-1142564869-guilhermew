package nba;

import java.util.ArrayList;
import java.util.List;

public class AreaDoFa {
    private String time;
    private List<String> produtos;
    private String aovivo;
    private List<String> campeonatos;
    private String nome;

   
    public AreaDoFa(String time, String nome) {
        this.time = time;
        this.nome = nome;
        this.produtos = new ArrayList<>();
        this.aovivo = aovivo;
        this.campeonatos = new ArrayList<>();
    }

    
    public void adicionarTime(String time) {
        
        System.out.println("Time adicionado com sucesso!");
    }
}