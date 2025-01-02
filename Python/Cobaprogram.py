class Car:
    def __init__(self, make, model, year, color):
        self.make = make
        self.model = model
        self.year = year
        self.color = color

    def start_engine(self):
        return f"The {self.year} {self.make} {self.model}'s engine is now running."

    def drive(self):
        return f"The {self.color} {self.make} {self.model} is now driving."

# Membuat objek dari kelas Car
my_car = Car("Toyota", "Corolla", 2021, "blue")

# Menggunakan metode objek
print(my_car.start_engine())
print(my_car.drive())
