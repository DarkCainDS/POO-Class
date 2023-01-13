public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }
    void printDataCar() {
        System.out.println("Licence " + license + " Driver Name " + driver.name + " Passanger: " + passenger);
    }

    public Integer getPassenger(){
        return passenger;
    }
    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("El auto debe tener Cuatro asientos");
        }
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public Account getDriver() {
        return driver;
    }
    public void setDriver(Account driver) {
        this.driver = driver;
    }
    
}
