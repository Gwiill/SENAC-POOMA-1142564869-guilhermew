package nba;

public class TelaDeLogin {
    private String email;
    private String nome;
    private int idade;
    private String time;

    public TelaDeLogin(String email, String nome, int idade, String time) {
        this.email = email;
        this.nome = nome;
        this.idade = idade;
        this.time = time;
    }

    public void cadastrarUsuario() {
        
        System.out.println("Usuário cadastrado com sucesso!");
    }

    
    public String getEmail() {
        return email;
    }

    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTime() {
        return time;
    }
}
