package Visitor;

import java.util.ArrayList;
import java.util.List;

class Loja {

	private List<Equipamento> eqList = new ArrayList<Equipamento>();
    
	void addEquipamento(Equipamento e) {
		eqList.add(e);
	}
	
	public List<Equipamento> getEquipamentoList() {
		return eqList;
	}
}