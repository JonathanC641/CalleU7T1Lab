import java.util.*;
public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory  = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory(){
        return inventory;
    }

    public void addCar(Car car){
        inventory.add(car);
    }

    public boolean swap(int spot1, int spot2){
        if(spot1 < inventory.size() && spot2< inventory.size()){
            Car car1 = inventory.get(spot1);
            Car car2 = inventory.get(spot2);
            inventory.set(spot1,car2);
            inventory.set(spot2,car1);
            return true;
        }
        return false;

    }


}
