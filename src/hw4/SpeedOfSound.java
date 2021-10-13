//Perrfection Petrekin 10/26/19
//Class: SpeedOfSound
//Purpose: This class determines the amount of time it will take sound to travel through particular mediums.

package hw4;

public class SpeedOfSound {
	private float distance; //constructor
	
	public void setDistance(float d){ //mutator
		distance = d;
	}
	public float getSpeedInAir(){ //accessor
		return distance/1100;
	}
	public float getSpeedInWater(){ //accessor
		return distance/4900;
	}
	public float getSpeedInSteel(){ //accessor
		return distance/16400;
	}
}

/*  UML
 *  -------------------------------------
 *  SpeedOfSound
 *  -------------------------------------
 *  -distance : float 
 *  -------------------------------------
 *  +setDistance(d:float) : void
 *  +getSpeedInAir() : float
 *  +getSpeedInWater() : float
 *  +getSpeedInSteel() : float
 *  -------------------------------------
*/