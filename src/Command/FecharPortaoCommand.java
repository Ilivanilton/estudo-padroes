package Command;

public class FecharPortaoCommand implements Command {

	private PortaoAutomatico receptor;

	public FecharPortaoCommand(PortaoAutomatico portaoAutomatico) {
		this.receptor = portaoAutomatico;
	}

	@Override
	public void execute() {
		this.receptor.fechar();

	}

}
