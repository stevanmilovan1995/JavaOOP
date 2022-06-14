public class Car {
    private boolean engine;
    private  int cylinders;
    private String name;
    private int wheels ;

    public Car( int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public void startEngine(){
        System.out.println(this.name + " engine is starting.");
    }

    public void accelerate(){
        System.out.println(this.name + " car is accelerating");
    }

    public void brake(){
        System.out.println(this.name + " car is braking.");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
