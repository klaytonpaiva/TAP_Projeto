package br.com.fornelos.view;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class principal extends JFrame{
	private JMenuBar BarraMenu = null;
	private JMenu menuCadastro = null;
	private JMenu menuPedido = null;
	private JMenu menuContasaReceber = null;
	private JMenu menuContasaPagar = null;
	private JMenu menuRelatorios = null;
	private JMenuItem menuPessoa = null;
	private JMenuItem menuSair = null;
	public principal() {
		super();
		// TODO Auto-generated constructor stub
		initialize();
	}
	private void initialize(){
		this.setTitle("Varejo");
		this.setJMenuBar(getBarraMenu());
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(900,600);
		this.setVisible(true);
	}
	private JMenuBar getBarraMenu() {
		if (BarraMenu == null){
			BarraMenu = new JMenuBar();
			BarraMenu.add(getMenuCadastro());
			BarraMenu.add(getMenuPedido());
			BarraMenu.add(getMenuContasaReceber());
			BarraMenu.add(getMenuContasaPagar());
			
		}
		return BarraMenu;
	}
	private JMenu getMenuCadastro() {
		if (menuCadastro == null){
			menuCadastro = new JMenu();
			menuCadastro.setText("Cadastro");
			menuCadastro.add(getMenuPessoa());
			menuCadastro.add(getMenuSair());
			
		}
		return menuCadastro;
	}
	
	private JMenu getMenuPedido() {
		if (menuPedido == null){
			menuPedido = new JMenu();
			menuPedido.setText("Pedido");
			menuPedido.add(getMenuSair());
		
			
		}
		return menuPedido;
	}
	
	private JMenu getMenuContasaReceber() {
		if (menuContasaReceber == null){
			menuContasaReceber = new JMenu();
			menuContasaReceber.setText("Contas a Receber");
						
		}
		return menuContasaReceber;
	}
	
	private JMenu getMenuContasaPagar() {
		if (menuContasaPagar == null){
			menuContasaPagar = new JMenu();
			menuContasaPagar.setText("Contas a Pagar");
						
		}
		return menuContasaPagar;
	}
	
	private JMenuItem getMenuSair() {
		if (menuSair == null){
			menuSair = new JMenuItem();
			menuSair.setText("Sair");
		}
		return menuSair;
	}
	
	private JMenuItem getMenuPessoa() {
		if (menuPessoa == null){
			menuPessoa = new JMenuItem();
			menuPessoa.setText("Pessoa");
		}
		return menuPessoa;
	}
	
	
}