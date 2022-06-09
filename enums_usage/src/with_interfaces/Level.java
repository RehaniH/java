package with_interfaces;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
/*
 * enums could implement interfaces but cannot extend classes
 */
public enum Level implements Arrangement{
	HIGH(3), MEDIUM(2), LOW(1);
	
	private int number;
	private EnumSet<Level> enumSet;
	
	Level(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public void setArrangement() {

		enumSet = EnumSet.of(HIGH, MEDIUM);
		System.out.println(enumSet);
	}

	@Override
	public Set<Level> getLevelSet() {
		return this.enumSet;
	}

	@Override
	public Map<Level, String> getLevelMap() {
		EnumMap<Level, String> enumMap = new EnumMap<Level, String>(Level.class);
		enumMap.put(HIGH, "highest level");
		enumMap.put(MEDIUM, "mid level");
		enumMap.put(LOW, "low level");
		return enumMap;
	}

}
