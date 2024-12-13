package carneLeopardo;

public class CarneLeopardoSistema{
	
	private String[] cpfs = new String[99]; // Array com os cps's.
	private String[] contribuintes = new String[99]; // Array com os contribuintes.
	private int[] tabelaTributos = new int[59]; // Array com os tributos.
	private int indiceContribuintes = 0; // Indice de controle dos Arrays referente aos contribuintes.
	private int indiceTributos = 0; // Indice de controle dos Arrays referente aos tributos
	
	// Verifica o CPF recebido já foi cadastrado.
	private boolean verificarCpf(String cpf) {
		boolean verificador = false;
		for (int i = 0; i != indiceContribuintes; i++) {
			if (cpfs[i].equals(cpf)) {
				verificador = true;
			} else {
				verificador = false;
			}
		}
		return verificador;
	}
	// Forma a String que será armazenada com os dados do contribuinte.
	private String formataContribuintes(String cpf, String nome, String contato) {
		String representacaoContribuinte = "| Contribuinte: " + nome + " - CPF: " + cpf + " - Contato: " + contato;   
		return representacaoContribuinte;
	}
	
	/**
	 * Cadastra o contribuinte dentro do banco de dados.
	 * 
	 * @param cpf
	 * @param nome
	 * @param contato
	 * @return cpf Se o cadastro tiver sido concluido
	 */
	public String cadastrarContribuinte(String cpf, String nome, String contato) {
		if (verificarCpf(cpf)) {
			throw new IllegalArgumentException("Contribuinte já cadastrado!");
		} else {
			cpfs[indiceContribuintes] = cpf;
			contribuintes[indiceContribuintes] = formataContribuintes(cpf, nome, contato);
			indiceContribuintes += 1;
			return cpf;
		}
	}
	
	/**
	 * 
	 * @return O Array com todos os contribuintes.
	 */
	public String[] listarContribuintes() {
		return contribuintes;
	}
	
	private boolean verificarCodigoTributo(int codigoTributo) {
		boolean verificador = false;
		for (int i = 0; i != indiceTributos; i++) {
			if (tabelaTributos[i] == codigoTributo) {
				verificador = true;
			}
		}
		return verificador;
	}
	
	public int cadastrarTributo(int codigoTributo, String descricao, double valor, int ano) {
		if (codigoTributo > 60 || codigoTributo < 1){
			throw new IndexOutOfBoundsException("A faixa disponível para códigos tributários é de 1 a 60!");
		}
		if(verificarCodigoTributo(codigoTributo)) {
			throw new IllegalArgumentException("O código já está sendo utilizado por outro tributo!");
		}
		
		return ;
	}
}