from Person import Person
from Address import Address
from Course import Course
class Student:
    def __init__(self, first, last, dob, number, Address, status):
        self.first = first
        self.last = last
        self.dob = dob
        self.number = number
        self.Address = Address
        self.status = status
        self.grades = []
        self.courses = []


def numCourses():
    return len(courses)

def status(status):
    if status == "domestic":
        print("This student is a domestic")
    elif status == "international":
        print("This student is an international")


def is_on_probation(grades):
    total = 0
    for grade in grades:
        total+= grade
    average = total /len(grades)
    if average < 60:
        print("You are on probation, please seek academic assistance")


def is_part_time(self):
    return len(self.courses) < 2


def scholarship():
    total = 0
    for grade in grades:
        total += grade
    average = total / len(grades)
    if average > 90:
        print("Congratulations, you have been awarded a scholarship")



grades = [40,40,40]
is_on_probation(grades)



