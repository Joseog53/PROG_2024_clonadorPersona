package main;

import java.util.List;

import persona.ClonadorPersona;
import persona.Persona;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClonadorPersona cp=new ClonadorPersona("Jose");
		
		List<Persona>personas=cp.generarClones();
		System.out.println(personas);
		
	
	
	}

}
