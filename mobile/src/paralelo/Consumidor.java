package paralelo;

public class Consumidor extends Ent {
	
	public Consumidor(String nome, IBuffer bufferShared) {
		super(nome, bufferShared);
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				this.bufferShared.ler(this);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
