package fabricagrafos;

import agregadorarcos.AgregadorArcosConPeso;
import basicos.Arco;
import basicos.Nodo;

public class FabricaGrafosNoDirigidosConPeso extends FabricaGrafos {
	
	public FabricaGrafosNoDirigidosConPeso() {
		setAgregadorArcos(new AgregadorArcosConPeso());
	}

	@Override
	public Arco createArco(Nodo nodo1, Nodo nodo2) {
		return null;
	}

	@Override
	public Arco createArco(Nodo nodo1, Nodo nodo2, int peso) {
		Arco arco = getAgregadorArcos().addArco(nodo1, nodo2, peso);
		arco.setConPeso(true);
		arco.setDirigido(false);
		return arco;
	}
}