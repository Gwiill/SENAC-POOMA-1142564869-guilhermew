
package nba;

import java.util.ArrayList;
import java.util.List;

public class Feed {
    private String noticia;
    private String time;
    private String aovivo;
    private List<String> campeonatos;

    
    public Feed(String noticia, String time) {
        this.noticia = noticia;
        this.time = time;
        this.aovivo = aovivo;
        this.campeonatos = new ArrayList<>();
    }

    
    public void adicionarNoticia(String noticia) {
        
        System.out.println("Notícia adicionada com sucesso!");
    }

    public void adicionarCampeonato(String campeonato) {
        
        System.out.println("Campeonato adicionado com sucesso!");
    }
}
