package GuiJComboBoxEAlbumDeFotos;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame/* 1-extends... */ implements ItemListener {

	/* 6-Definir o ComboBox */
	JComboBox<String> combo;
	/* 7-Exibir as imagens */
	JLabel label;
	/* 8-array para trazer imagens do album */ /* 9-gravar imagens em algum lugar */
	ImageIcon[] imagens = {
			/* 10-criar imagens */
			new ImageIcon(getClass().getResource("fotos/01.jpg")),
			new ImageIcon(getClass().getResource("fotos/02.jpg")),
			new ImageIcon(getClass().getResource("fotos/03.jpg")),
			new ImageIcon(getClass().getResource("fotos/04.jpg"))
			};

	/* 2-Construir o construtor */
	public ControleCombo() {
		/* 4-chamar o construtor de JFrame e dar um nome */
		super("Album de Fotos");
		/* 11-recuperar o container */
		Container c = getContentPane();

		/* 12-colocar combo e imagem no container */
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif", Font.PLAIN, 26));/* 13-fonte */

		/* 14-adicão de outros itens */
		//obs: a sequencia dos itens é a mesma das imagens em imageIcon
		combo.addItem("Familia");
		combo.addItem("praia");
		combo.addItem("bebê");
		combo.addItem("cachorro");
		/* 17- tratar/criar os eventos do combobox,definir o ouvinte(itemListener) do evento */
		combo.addItemListener(this);//18- implementar no construtor a interface: ItemListener, implementa o itemStateChanged e coloca o this no paramentro dessa mesma linha addItemListener(this);
		

		/* 16-Inicializar o label com uma das imagens do array */
		label = new JLabel(imagens[0]);

		/* 15-adicionar esse combo ao container */
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);

		/* 5-definir encerramento, dimensoes e visibilidade */
		setSize(300, 530);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		/* 3-Inicializar dentro do main */
		new ControleCombo();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		/* 19-executar operação quando o combo for alterado: */
		//se esse evento tiver sido selecionado: recupero o label da janela e redefino o icone de label
		if(e.getStateChange() == ItemEvent.SELECTED) {
			
			label.setIcon(imagens[combo.getSelectedIndex()]);
			
		}
	}

}
