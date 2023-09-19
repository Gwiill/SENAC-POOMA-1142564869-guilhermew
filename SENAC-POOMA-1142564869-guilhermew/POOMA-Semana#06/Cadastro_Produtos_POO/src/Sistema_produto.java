import javax.swing.*;
import java.util.ArrayList;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}

class Sistema {
    private ArrayList<Produto> produtos;

    public Sistema() {
        produtos = new ArrayList<>();
    }

    public void incluirProduto() {
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
        Produto produto = new Produto(nome, preco);
        produtos.add(produto);
        JOptionPane.showMessageDialog(null, "Produto incluído com sucesso.");
    }

    public void consultarProduto() {
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null, "Produto encontrado:\n" + produto);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Produto não encontrado.");
    }

    public void excluirProduto() {
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        Produto produtoParaExcluir = null;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtoParaExcluir = produto;
                break;
            }
        }

        if (produtoParaExcluir != null) {
            produtos.remove(produtoParaExcluir);
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado.");
        }
    }

    public void alterarProduto() {
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        double novoPreco = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo preço do produto:"));
        boolean produtoEncontrado = false;

        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setPreco(novoPreco);
                JOptionPane.showMessageDialog(null, "Preço do produto alterado com sucesso.");
                produtoEncontrado = true;
                break;
            }
        }

        if (!produtoEncontrado) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado.");
        }
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado.");
        } else {
            StringBuilder lista = new StringBuilder("Lista de Produtos:\n");
            for (Produto produto : produtos) {
                lista.append(produto).append("\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }
}
