class Main {
    public static void main(String[] args){
        System.out.println("Hi world");
        Car car = new Car("DYH011", new Account("Carmela carreño", "DYH011") );

        car.printDataCar();
        Car car2 = new Car("LVF058", new Account("Mateo Toro", "LVF058"));

        car2.passenger = 3;
        System.out.println("Car 2 Licence: " + car2. license);
        car2.printDataCar();
        System.out.println("initialize");
        System.out.println("Car...");

        System.out.println("Uberx....");
        UberX uberx = new UberX("AND001", new Account("Maria Loyola", "AND002"), "Haojue", "150");
        uberx.printDataCar();
        uberx.setPassenger(3);
        System.out.println(uberx.brand + " " + uberx.model);
    }
}