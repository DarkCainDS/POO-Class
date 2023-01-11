from car import Car
from account import Account

if __name__ == "__main__":
    print("Hi Hackerman")
    car = Car("DYH011", Account("Carmela Carreño", "DYH011"))

    print(vars(car))
    print(vars(car.driver))

    car2 = Car("LVF058", Account("Mateo Toro", "LVF058"))

    print(vars(car2))
    print(vars(car2.driver))