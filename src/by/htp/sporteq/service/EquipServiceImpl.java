package by.htp.sporteq.service;

import java.util.ArrayList;
import java.util.List;

import by.htp.sporteq.entity.Equipment;

public class EquipServiceImpl implements EquipService{

	@Override
	public List<Equipment> list() {
		List<Equipment> equip = new ArrayList<>();
		equip.add(new Equipment("eq1", 25));
		equip.add(new Equipment("eq2", 35));
		equip.add(new Equipment("eq3", 45));
		return equip;
	}

}
