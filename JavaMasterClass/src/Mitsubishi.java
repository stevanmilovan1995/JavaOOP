public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public void startEngine(){
        System.out.println(super.getName() + " engine is starting.");
    }

    public void accelerate(){
        System.out.println(super.getName() + " car is accelerating");
    }

    public void brake(){
        System.out.println(super.getName() + " car is braking.");
    }


}
