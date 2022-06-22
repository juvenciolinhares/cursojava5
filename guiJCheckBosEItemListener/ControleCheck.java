package guiJCheckBosEItemListener;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck /*1*/ extends JFrame {
	
	JTextField texto;/*11-declarar JTextFild como atributo da classe*/
	JCheckBox bold, italic;/*16-declarar JCheckBox como atributo da classe*/
	
	/*2*/public ControleCheck() {
		/*4*/super();
		
		texto = new JTextField("Veja a fonte mudar", 12);/*9*/
		texto.setFont (new Font("Serif", Font.PLAIN, 26));/*10-definir tamanho da fonte*/
		
		
		/*6*/ Container c = getContentPane();
		
		/*8-flowLayout-alterar as dimensoes do campo de texto*/
		c.setLayout(new FlowLayout());
		c.add(texto);
		
		/*12-definir tamanho da fonte*/
		bold = new JCheckBox("Bold");
		
		/*13-definir uma interface ouvinte(LIsteners)*/
		bold.addItemListener(new CheckListener());/*15-atribuir a cada um dos checkbox um checkListener*/
		italic = new JCheckBox("Italic");
		italic.addItemListener(new CheckListener());/*15-atribuir a cada um dos checkbox um checkListener*/
		
		/*7-criar caixinhas para alterar a fonte mais na frente*/
		c.add(bold);
		c.add(italic); 
		
		
		/*5*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
		
			
	}
	
	/*14-Criar uma classe interna que manipule os eventos criados pelos Listeners*/
	class CheckListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			/*17-Modificar fontes do texto:*/
			if(bold.isSelected() && italic.isSelected()) {
				texto.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 26));
			}else if(bold.isSelected()) {
				texto.setFont(new Font("Serif", Font.BOLD,26));
			}else if(italic.isSelected()) {
				texto.setFont(new Font("Serif", Font.ITALIC, 26));
			}else {
				texto.setFont(new Font("Serif", Font.PLAIN, 26));
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		/*3*/	new ControleCheck();
		

	}

}

/*1-extends jframe
 * 2-criar o método construtor
 * 3- iniciar a classe no main
 * 4- chamar o metodo construtor pai(JFrame)
 * 5- definir tamanho, metodo de encerramento e tornar visivel
 */

