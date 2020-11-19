package DataAbstrata;

public class HorarioSegundo {
	
	private int segundo;
	
	      
	void setSegundo(int s) {
		if(s >= 0 && s <= 86399) {
			this.segundo = (int) s;
		}
	}
	
	int getSegundo() {
		return segundo%3600%60%60;
	} 
	  
	int getHora() {
		return segundo/3600;
	}
	
	int getMinuto() {
		return segundo%3600/60;
	}
	
}