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

    @Override
    public void takeOff() {
        if (!this.flying) {
            this.flying = true;
            System.out.println(this.getName() + "has successfully take off and is now flying");
        }

    }

    @Override
    public void land() {
        if (this.flying && (this.altitude <= 1)) {
            this.flying = false;
            System.out.println(this.getName() + " has land on the floor");
        }
    }

    @Override
    public void ascend(int meters) {
        if (this.flying) {
            this.altitude = this.altitude + meters;
            System.out.println(this.getName() + " is now flying at " + this.altitude);
        }
    }

    @Override
    public void descend(int meters) {
        if (this.flying) {
            this.altitude = this.altitude - meters;
            System.out.println(this.getName() + " is now flying at " + this.altitude);
        }
    }

    @Override
    public void glide() {
        if (this.flying) {
            System.out.println("the bird is chilling in the air");
        }
    }

}
