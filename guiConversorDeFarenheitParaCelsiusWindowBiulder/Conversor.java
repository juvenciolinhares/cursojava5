package guiConversorDeFarenheitParaCelsiusWindowBiulder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField valor;
	private JTextField Resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		setTitle("Converso de Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 219);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton converter = new JButton("Converter");
		converter.setFont(new Font("Tahoma", Font.PLAIN, 26));
		converter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double fahrenheit = Double.parseDouble (valor.getText());//receber o valor digitado no campo de texto e converter em double
				double celsius = (fahrenheit - 32)/ 1.8;
				Resultado.setText(celsius + "ºC");//atribui a resultado o resultado da conversao
			}catch(Exception erro) {};
			}
		});
		contentPane.add(converter, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Fahrenheit:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblNewLabel);
		
		valor = new JTextField();
		valor.setHorizontalAlignment(SwingConstants.CENTER);
		valor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(valor);
		valor.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Celsius:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblNewLabel_1);
		
		Resultado = new JTextField();
		Resultado.setHorizontalAlignment(SwingConstants.CENTER);
		Resultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Resultado.setText("");
		panel.add(Resultado);
		Resultado.setColumns(10);
	}

}
/*analise do código construido pelo windowbuilder:
 * a classe extendendo JFrame
 * atributos da janela sendo inicalizados no construtor da classe
 * além da aba codigo fonte, tem a aba design que apresenta a janela e as opções para montar/construir a janela
 * 
 * sobre o design:
 * no canto superior esquerdo temos a estruta da interface() contentPane
 * abaixo as propriedades do componente editado nesse momento
 * lista de controles(palette): container, layouts, components(controles), swing actions
 * 
 * sobre a interface gráfica:
 * 1- utiliza 2 tipos de layouts: borbderLayout(ao sul o bota converter)
 * 2- mudo o nome do botao em proprieties-> text
 * 3-mudo a fonte em proprieties-> font
 * 4- coloco o container JPainel ao centro e aplico o gridLayout pra definir um numero de celulas(matriz)
 * 5- depois de adicionado o gridlayout vou em proprieties/Layouts e configuro linhas, colunas e espaçamentos 
 * 6-adicão dos elementos: 
 * -JLabel(fahrenheit)
 * -JtextField pra escrever a temperatura
 * -JLabel(Celsius)
 * -JtextField pra escrever a temperatura
 * 7- alteração dos tamanhos de fontes
 * 8- centralizar: horizontal... center
 * 9-titulo da janela: clica sobre a janela, vai em título e define
 * 
 *  
 *  fazer o calculo(logica)de conversao:
 * 1- dar dois cliques no bota converter, ele abre o código que manipula o botao
 * 2- o eclipse nos leva para o código do botão, dentro do escopo de actionPerformed podemos executar a conversao
 * 3- caso eu queria, posso fazer a lógica dentro de um try catch
 * 
 * 
 * 
 */
