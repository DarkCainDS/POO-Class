from car import Car
from account import Account
from UberX import UberX
from User import User

if __name__ == "__main__":
    print("Hi Hackerman")
    car = Car("DYH011", Account("Carmela Carreño", "DYH011"))

    print(vars(car))
    print(vars(car.driver))

    car2 = Car("LVF058", Account("Mateo Toro", "LVF058"))

    print(vars(car2))
    print(vars(car2.driver))
    print("--------------------------------------------------------------------")

    print("uberX")
    uberX = UberX("KLO365", Account("Diego Romero", "KLO365"), "Haoujue" , "Ka-150")
    print(vars(uberX))
    print(vars(uberX.driver))

    print("User")
    user = User ("mariana valle", "F7C1L1")
    print(vars(user))