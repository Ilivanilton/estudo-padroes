package Command;

public class MainTeste {
	
	//client
	public static void main(String[] args) {
		/*
		 * 				input
		 */
		// Receptor
		PortaoAutomatico portaoAutomatico = new PortaoAutomatico();
		// CommandConcret
		Command abrirPortao = new AbrirPortaoCommand(portaoAutomatico);
		Command fecharPortao = new FecharPortaoCommand(portaoAutomatico);
		// invoker
		ControleRemoto controleRemoto = new ControleRemoto();
		
		/*
		 * 				logica
		 */
		controleRemoto.setCommad(abrirPortao);
		//controleRemoto.setCommad(fecharPortao);
		
		/*
		 * 				out
		 */
		controleRemoto.executeComando();

	}
	
	

}
