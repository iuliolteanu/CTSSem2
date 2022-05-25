package agentie;

import test.dubluri.PachetDummy;

import java.util.ArrayList;
import java.util.List;

public class AgentieTurism {

	private List<IPachetTuristic> pacheteTuristice;
	
	public AgentieTurism() {
		pacheteTuristice=new ArrayList<>();
	}

	public int getNrPacheteTuristice(){
		return pacheteTuristice.size();
	}
	
	public void adaugaPachet(IPachetTuristic pachet) {
		pacheteTuristice.add(pachet);
	}
	
	public double calculareSumaTotalaPachete() {
		double suma=0;
		for(IPachetTuristic pachet:pacheteTuristice) {
			suma+=pachet.getPret();
		}
		
		return suma;
	}
}
