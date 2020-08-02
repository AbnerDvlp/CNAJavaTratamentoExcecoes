package excecoes;

public class LimiteSaque extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LimiteSaque(String msg) {
		super(msg);
	}
}
