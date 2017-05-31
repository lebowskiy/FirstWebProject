package by.htp.sporteq.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import by.htp.sporteq.entity.Equipment;

public interface EquipDAO {
	Map<Equipment, Map<String, String>> showEquip(String equipClass);
	Map<String, String> getCharacteristics(Connection conn, int equipID) throws SQLException;
}
