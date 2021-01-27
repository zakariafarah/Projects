

class Address:
    def __init__(self, city, country, postal_code, street, state):
        self.city = city
        self.country = country
        self.postal_code = postal_code
        self.street = street
        self.state = state




address = Address("Ottawa", "Canada", "K2M 0G8", "Parkdale", "Ontario")

print(address.city)
print(address.country)