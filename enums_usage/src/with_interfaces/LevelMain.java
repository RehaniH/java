package with_interfaces;

public class LevelMain {

	public static void main(String[] args) {

		Level high = Level.valueOf("HIGH");
		System.out.println(high);
		
		//Level newLevel = Level.valueOf("NEW"); exception
		
		high.setArrangement();
		System.out.println(high.getLevelMap());
		System.out.println(high.getLevelSet());
	}

}
