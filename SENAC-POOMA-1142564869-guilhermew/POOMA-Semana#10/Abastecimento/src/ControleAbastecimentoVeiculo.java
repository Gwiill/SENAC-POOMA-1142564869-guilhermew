import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ControleAbastecimentoVeiculo extends JFrame {
    private JTextField txtPlaca, txtModelo, txtPosto, txtNome, txtLocalizacao, txtValorLitro, txtTipoCombustivel, txtQuantidade, txtData;
    private List<Abastecimento> abastecimentos = new ArrayList<>();
    private JTextArea txtArea;

    public ControleAbastecimentoVeiculo() {
        setTitle("Controle de Abastecimento de Veículo");
        setLayout(new FlowLayout());

        JLabel lblPlaca = new JLabel("Placa:");
        txtPlaca = new JTextField(10);
        add(lblPlaca);
        add(txtPlaca);

        JLabel lblModelo = new JLabel("Modelo:");
        txtModelo = new JTextField(10);
        add(lblModelo);
        add(txtModelo);

        JLabel lblPosto = new JLabel("Posto:");
        txtPosto = new JTextField(10);
        add(lblPosto);
        add(txtPosto);

        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField(10);
        add(lblNome);
        add(txtNome);

        JLabel lblLocalizacao = new JLabel("Localização:");
        txtLocalizacao = new JTextField(10);
        add(lblLocalizacao);
        add(txtLocalizacao);

        JLabel lblValorLitro = new JLabel("Valor do Litro:");
        txtValorLitro = new JTextField(10);
        add(lblValorLitro);
        add(txtValorLitro);

        JLabel lblTipoCombustivel = new JLabel("Tipo de Combustível:");
        txtTipoCombustivel = new JTextField(10);
        add(lblTipoCombustivel);
        add(txtTipoCombustivel);

        JLabel lblQuantidade = new JLabel("Quantidade Abastecida:");
        txtQuantidade = new JTextField(10);
        add(lblQuantidade);
        add(txtQuantidade);

        JLabel lblData = new JLabel("Data de Abastecimento:");
        txtData = new JTextField(10);
        add(lblData);
        add(txtData);

        JButton btnRegistrar = new JButton("Registrar Abastecimento");
        add(btnRegistrar);
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarAbastecimento();
            }
        });

        txtArea = new JTextArea(10, 40);
        add(txtArea);

        JButton btnListar = new JButton("Listar Abastecimentos");
        add(btnListar);
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarAbastecimentos();
            }
        });

        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void registrarAbastecimento() {
        String placa = txtPlaca.getText();
        String modelo = txtModelo.getText();
        String posto = txtPosto.getText();
        String nome = txtNome.getText();
        String localizacao = txtLocalizacao.getText();
        double valorLitro = Double.parseDouble(txtValorLitro.getText());
        String tipoCombustivel = txtTipoCombustivel.getText();
        double quantidade = Double.parseDouble(txtQuantidade.getText());
        String data = txtData.getText();

        Abastecimento abastecimento = new Abastecimento(placa, modelo, posto, nome, localizacao, valorLitro, tipoCombustivel, quantidade, data);
        abastecimentos.add(abastecimento);

        txtArea.append("Abastecimento registrado:\n" + abastecimento.toString() + "\n");
    }

    private void listarAbastecimentos() {
        txtArea.setText("");
        for (Abastecimento abastecimento : abastecimentos) {
            txtArea.append(abastecimento.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ControleAbastecimentoVeiculo();
            }
        });
    }
}

class Abastecimento {
    private String placa, modelo, posto, nome, localizacao, tipoCombustivel, data;
    private double valorLitro, quantidade;

    public Abastecimento(String placa, String modelo, String posto, String nome, String localizacao,
                         double valorLitro, String tipoCombustivel, double quantidade, String data) {
        this.placa = placa;
        this.modelo = modelo;
        this.posto = posto;
        this.nome = nome;
        this.localizacao = localizacao;
        this.valorLitro = valorLitro;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidade = quantidade;
        this.data = data;
    }

    public double calcularMediaKmPorLitro() {
        double autonomia = 30.0; // Autonomia do veículo em Km por litro
    double quilometrosPercorridos = quantidade * autonomia;
    return quilometrosPercorridos / quantidade;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Modelo: " + modelo + ", Posto: " + posto +
                ", Nome: " + nome + ", Localização: " + localizacao + ", Valor do Litro: " + valorLitro +
                ", Tipo de Combustível: " + tipoCombustivel + ", Quantidade Abastecida: " + quantidade +
                ", Data de Abastecimento: " + data + ", Média de Km por Litro: " + calcularMediaKmPorLitro();
    }
}
