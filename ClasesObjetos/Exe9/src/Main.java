
class vehicle {
    int speed = 0;
    int numgear;
    int gear = 0;

    vehicle(int numgear){
        this.numgear = numgear;

    }

    void throttle (int increase){
        this.speed += increase;

    }

    void brake (int decrease) {
        this.speed -= decrease;
    }

    void gearup (){
        if (gear != numgear){
            gear++;
        }
    }

    void geardown (){
        if (gear > 0){
            gear--;
        }
    }

    String getInfo (){
        return "Speed: " + speed + "\n Gear: " + gear;
    }

}

public class Main {
    public static void main(String[] args) {
        vehicle car1 = new vehicle(5);

        car1.gearup();
        car1.throttle(50);
        System.out.println(car1.getInfo());
        System.out.println();
        car1.gearup();
        car1.throttle(40);
        System.out.println(car1.getInfo());
        System.out.println();
        car1.brake(50);
        car1.throttle(150);
        car1.gearup();
        car1.gearup();
        car1.gearup();
        car1.gearup();
        System.out.println(car1.getInfo());
        System.out.println();
        car1.brake(30);
        car1.geardown();
        System.out.println(car1.getInfo());



    }
}