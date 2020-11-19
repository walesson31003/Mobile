package paralelo;

public abstract class Ent implements Runnable {
	
	protected String nome;
	protected IBuffer bufferShared;
	
	public Ent(String nome, IBuffer bufferShared2) {
		this.bufferShared = (IBuffer) bufferShared2;
		this.nome = nome;		
	}
	
	
	public String getNome() {
		return this.nome;
	}

	@Override
	public abstract void run();
	
	@Override
	public String toString() {
		return this.getClass().getName() + " " + this.nome;
	}
}
