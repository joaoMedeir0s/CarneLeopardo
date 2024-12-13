package carneLeopardo;

public class Main {
	public static void main(String[] args) {
		CarneLeopardoSistema sistema = new CarneLeopardoSistema();
		String cpf = "08882098435";
		String nome = "joao";
		String contato = "83998469565";
		
		sistema.cadastrarContribuinte(cpf, nome, contato);
		for (int i = 0; i != (sistema.listarContribuintes()).length; i++) {
			if (sistema.listarContribuintes()[i] == null) {
				break;
			}
			System.out.println(sistema.listarContribuintes()[i]);
			
		}
//		sistema.cadastrarContribuinte(cpf, "carlos", "454");
		sistema.listarContribuintes();
		sistema.cadastrarContribuinte("918", "carlos", "454");
		for (int i = 0; i != (sistema.listarContribuintes()).length; i++) {
			if (sistema.listarContribuintes()[i] == null) {
				break;
			}
			System.out.println(sistema.listarContribuintes()[i]);
		
		}
	}
}
