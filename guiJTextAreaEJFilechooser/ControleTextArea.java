package guiJTextAreaEJFilechooser;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleTextArea extends JFrame implements ActionListener {

	// 1-editor de texto como atributo da classe para ficar visivel nos escopos.
	JTextArea texto;

	public ControleTextArea() {
		super("Editor de Textos");

		// 1.1- controle de texto JTextArea:
		texto = new JTextArea();
		// 2- adicionar barras de rolagem:
		JScrollPane scroll = new JScrollPane(texto);// sempre vamos utilizar JTextArea junto com JScrollPanne

		// 3- definição de uma fonte:
		texto.setFont(new Font("serif", Font.PLAIN, 26));

		// 6-criar um botao para abrir um texto do computador na minha textarea:
		JButton botao = new JButton("Abrir arquivo");//texto do botao
		botao.setFont(new Font("serif", Font.PLAIN, 26));// informar fonte
		botao.addActionListener(this);// criar um Listener(com implementação de classe) no construtor

		// 4- adicionar ao container da janela esse campo de texto
		Container c = getContentPane();

		// 5- adicionar o campo de textos com barras de rolagem
		c.add(BorderLayout.CENTER, scroll);
		// 8- colocar o botao no container
		c.add(BorderLayout.SOUTH, botao);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ControleTextArea();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 7-metodo que recupea um arquivo do computaor e apresenta dentro do textarea.
		JFileChooser c = new JFileChooser(); // "escolhedor" de arquivos
		c.showOpenDialog(this);
		// 9- recuperar/retornar um arqvuio pelo FileChooser:
		File file = c.getSelectedFile();
		// 10-tratamento de exceçoes para arquivos que nao consigam ser carregados:
		try {
			// 11- operação de carregamento do arquivo:
			Path path = Paths.get(file.getAbsolutePath());
			// 12- converte o array de bytes em uma string pra colocar no editor de texto
			String retorno = new String(Files.readAllBytes(path));
			//13- acessar o editor de texto e definir o texto:
			texto.setText(retorno);

		} catch (Exception erro) {
			JOptionPane.showMessageDialog(this, "Nao conseguimos carregar seu arquivo");
		}

	}

}
