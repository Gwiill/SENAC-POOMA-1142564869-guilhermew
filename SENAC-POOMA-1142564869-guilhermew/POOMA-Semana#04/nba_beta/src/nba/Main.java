package nba;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        TelaDeLogin telaDeLogin = cadastrarUsuarioViaJOptionPane();

        AreaDoFa areaDoFa = new AreaDoFa("Time Favorito", "Nome do Fã");
        areaDoFa.adicionarTime("Novo Time");

        Feed feed = new Feed("Notícia importante", "Time Favorito");
        feed.adicionarNoticia("Outra notícia");
        feed.adicionarCampeonato("Campeonato X");

        Produtos produtos = new Produtos("Time Favorito");
        produtos.buscar();

        
        System.out.println("Informações do Usuário:");
        System.out.println("Email: " + telaDeLogin.getEmail());
        System.out.println("Nome: " + telaDeLogin.getNome());
        System.out.println("Idade: " + telaDeLogin.getIdade());
        System.out.println("Time: " + telaDeLogin.getTime());
    }

    public static TelaDeLogin cadastrarUsuarioViaJOptionPane() {
        String email = JOptionPane.showInputDialog("Digite o email:");
        String nome = JOptionPane.showInputDialog("Digite o nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
        String time = JOptionPane.showInputDialog("Digite o time:");

        TelaDeLogin telaDeLogin = new TelaDeLogin(email, nome, idade, time);
        telaDeLogin.cadastrarUsuario();

        return telaDeLogin;
    }
}
