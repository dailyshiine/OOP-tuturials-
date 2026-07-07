public class Main {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine("LG");
        washingMachine.displayBrand();
        washingMachine.turnOn();
        washingMachine.operate();
        washingMachine.turnOff();

        System.out.println();

        Appliance fridge = new Refrigerator("Panasonic");
        fridge.displayBrand();
        fridge.turnOn();
        fridge.operate();
        fridge.turnOff();
    }
    
}