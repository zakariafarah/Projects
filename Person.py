from Address import Address



class Person:
    def __init__(self, first, last, dob, number,Address):
        self.first = first
        self.last = last
        self.dob = dob
        self.number = number
        self.Address = Address


person = Person("Mark", "Andrew", "032098", "613-406-8799", Address("Ottawa" ,"Canada", "K2M 0G8", "Parkdale", "Ontario"))
adr = Address("Ottawa" ,"Canada", "K2M 0G8", "Parkdale", "Ontario")
print (adr.state)
print(person.Address.postal_code)

print(person.dob)


