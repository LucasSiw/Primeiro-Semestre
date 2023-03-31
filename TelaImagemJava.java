package Teste;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaImagemJava extends JFrame {
    public TelaImagemJava() {
        setTitle("Minha Janela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um painel para adicionar componentes
        JPanel painel = new JPanel();

        // Cria um rótulo para exibir a imagem
        JLabel rotulo = new JLabel();

        // Carrega a imagem a partir de um arquivo
        ImageIcon imagem = new ImageIcon("C:\\\\Usuario\\\\Lucas Siewert\\\\Downloads\\\\pingu.jpg");

        // Define a imagem do rótulo
        rotulo.setIcon(imagem);

        // Adiciona o rótulo ao painel
        painel.add(rotulo);

        // Adiciona o painel à janela
        add(painel);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        TelaImagemJava tela = new TelaImagemJava();
    }
}
