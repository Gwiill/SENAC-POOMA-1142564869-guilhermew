
package nba;

import java.util.ArrayList;
import java.util.List;

public class Produtos {
    private List<String> camisetas;
    private List<String> acessorios;
    private List<String> tenis;
    private String time;

    // Construtor
    public Produtos(String time) {
        this.time = time;
        this.camisetas = new ArrayList<>();
        this.acessorios = new ArrayList<>();
        this.tenis = new ArrayList<>();
    }

    // Operação para buscar produtos
    public void buscar() {
        // Implemente a lógica para buscar produtos aqui
        System.out.println("Produtos buscados com sucesso!");
    }
}
