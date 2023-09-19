import javax.swing.JOptionPane;

public class Produto_Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        while (true) {
            String opcao = JOptionPane.showInputDialog("Selecione uma opção:\n" +
                    "1 - Inclusão de produtos\n" +
                    "2 - Consulta um determinado produto\n" +
                    "3 - Excluir um determinado produto\n" +
                    "4 - Alterar um determinado produto\n" +
                    "5 - Listar todos os produtos\n" +
                    "0 - Sair");

            switch (opcao) {
                case "1":
                    sistema.incluirProduto();
                    break;

                case "2":
                    sistema.consultarProduto();
                    break;

                case "3":
                    sistema.excluirProduto();
                    break;

                case "4":
                    sistema.alterarProduto();
                    break;

                case "5":
                    sistema.listarProdutos();
                    break;

                case "0":
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
    }
}