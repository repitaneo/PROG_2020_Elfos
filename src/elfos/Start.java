package elfos;

public class Start {

	public static void main(String[] args) {
		
		
		Robot iRobot = new Robot();
		iRobot.setNombre("iRobot");
		iRobot.setPuntosVida(150);
		
		Robot wall_e = new Robot();
		wall_e.setNombre("Wall-e");
		wall_e.setPuntosVida(150);
		
		
		System.out.println(iRobot);
		System.out.println(wall_e);
		
		
	}

}
