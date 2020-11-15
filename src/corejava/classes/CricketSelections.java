package corejava.classes;

import corejava.pojo.Cricketer;

public class CricketSelections {

	public static void main(String[] args) {

		Cricketer viratKohli = new Cricketer("Kohli",Cricketer.BATSMAN, 59.3d, 166.25d, 248);
		Cricketer rohitSharma = new Cricketer("Rohit",Cricketer.BATSMAN, 49.3d, 63.38d, 224);
		
		/* here, we have overridden the equals method of object class in cricketer class this has to be done when 
		 * we want to compare two real time objects in java */
		viratKohli.equals(rohitSharma);
		rohitSharma.equals(viratKohli);
		
	}

}
