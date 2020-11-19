package paralelo;

import java.util.LinkedList; 

public class Produtor extends Ent {
	
	private static LinkedList<Integer> dados;
	
		super(nome, bufferShared);
	}

	public static void setDados(LinkedList<Integer> dados) {
		Produtor.dados = dados;
	}

	public void run() {
		while (dados.size() > 0) {
			int dado = dados.removeFirst();
			try {
				this.bufferShared.escrever(this, dado);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}