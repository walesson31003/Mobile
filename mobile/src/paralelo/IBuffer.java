package paralelo;

public interface IBuffer {
	
	public void escrever(Produtor Escreve, int valor) throws InterruptedException;
		
	public int ler(Consumidor Le) throws InterruptedException;

}
