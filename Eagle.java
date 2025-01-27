public class Eagle extends Bird implements Fly {

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
     * takes off, must be on ground
     */
    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off into the air.%n", this.getName());
        }
    }

    /**
     * ascend
     * @param meters altitude increase
     * @return altitude
     */
    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude += meters;
            System.out.printf("%s is now at : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    /**
     * descend
     * @param meters altitude decrease
     * @return altitude
     */
    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude -= meters;
            System.out.printf("%s is now at : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }


    /**
     * land, must be at surface level
     */
    @Override
    public void land() {
        if (this.flying && this.altitude < 10) {
            System.out.printf("%s lands.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }
    }
}
