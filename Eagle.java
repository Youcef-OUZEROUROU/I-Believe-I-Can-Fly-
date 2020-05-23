public class Eagle extends Bird implements Fly  {

    private boolean flying;
    private int altitude;

    public void setAltitude (int altitude) {
    	this.altitude = altitude;
    }
    
    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
    @Override
    public void takOff() {
    	System.out.println("TakeOff");
    }
    
    @Override
    public int ascend (int meters) {
    	System.out.println(this.getName() + " Gain d'altitude "+ meters);
    	this.setAltitude(getAltitude() +meters);
    	System.out.println("A hauteur de" +this.getAltitude());
		return this.getAltitude();
    }
    
    @Override
    public int decend (int meters) {
    	System.out.println(this.getName() +"Perte d'altitude" +  meters);
    	this.setAltitude(getAltitude() + meters);
    	if (this.getAltitude()<meters) {
    		System.out.println("A hauteur de" + this.getAltitude());
    		System.out.println("je peut pas decendre plus");
    	}else {
    		this.setAltitude(this.getAltitude() - meters);
        	System.out.println("A hauteur de " + this.getAltitude());
    	}
    	
    	return this.getAltitude();
    }
    
    @Override
	public void land () {
        System.out.println("Atterrir");
        this.setAltitude(0);
	}

    @Override
	public void glid() {
        System.out.println("glides into the air");
	}
}
