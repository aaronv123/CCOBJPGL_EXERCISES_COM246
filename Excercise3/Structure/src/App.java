import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println();

        //multiple
        Hybrid Hybrid1 = new Hybrid();
        Hybrid1.fillgas();
        Hybrid1.chargebattery();
        
        //polymorphic
        HybridVehicle car1 = new HybridSedan();
        car1.carName = "Hybrid Sedan (2023 toyota corolla)";
        
        HybridVehicle car2 = new HybridPickup();
        car2.carName = "Hybrid Pickup (2025 toyota tundra)";
        
        //array
        ArrayList<HybridVehicle> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        
        for (HybridVehicle car : cars) {
               car.getCarName();
        }

        Carwash cw = new Carwash();

        cw.Carwash1(car1);
        cw.Carwash1(car2);

        System.out.println();
    }
}
