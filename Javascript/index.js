

let car = new Car("AMS38", new Account("Andres Herrera", "AMS38"))
car.passenger = 4;
car.printDataCar();

let uberX = new UberX("AW456", new Account("Carmela Carreño", "ANDA765"), "Chevrolet", "Spark")
uberX.passenger = 4;
uberX.printDataCar();

const datos = document.querySelector('#data')
const datos2 = document.querySelector('#data2')
const datos3 = document.querySelector('#lista')

datos.append("Driver : " + car.driver.name) 
datos2.append("license : " + car.driver.document)
console.log(car.driver.name)

var user = new User("DarkCainDs Romero","F7C1L1", "diego-platzi.org", "123456")
user.printDataUser();
datos3.append(`Name: ${user.name} license: ${user.document} email: ${user.email} password: ${user.password}`)


