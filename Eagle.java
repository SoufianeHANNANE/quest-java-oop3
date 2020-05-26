public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

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
	
	
	
    /**
     * takeoff, must be on ground
     */
    @Override
    public void takeOff() {
		if (!this.flying && this.altitude == 0) {
			this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
		}
	}
	
	/**
    * ascend
    * @param meters altitudes increas 
    * @return altitude
    */
	@Override
    public int ascend(int meters){ 
		if(this.flying){
			this.altitude = this.altitude + meters;
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
			
		}
		return this.altitude;
	}
	
	
    /**
     * Eagle glides, must be in the air
     */
    @Override
    public void glide() {
		System.out.printf("It glides into the air.%n");
	}
	
	
    /**
     * descend
     * @param meters altitudes decrease
     * @return altitude
     */
	@Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
	}
	
    /**
     * lands on the ground, must be low
     */
    @Override
    public void land() {
        if (this.flying && this.altitude <= 1) {
            System.out.printf("%s lands on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't lands.%n", this.getName());
        }
	}

	
	
}
