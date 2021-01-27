from Professor import Professor
from Enrol import Enrol

class Course:
    def __init__(self, code, name, max, min, professor):
        self.code = code
        self.name = name
        self.min = min
        self.max = max
        self.professor = professor
        self.professors = []
        self.enrollments = []

def add_professor(self,professor):
    self.professors.append(professor)

def remove_professor(self,professor):
    self.professors.remove(professor)

def add_enrollments(self, enroll):
    self.enrollments.append(enroll)


def check_enrollments(self, max):
    if len(enrollments) == self.max:
        raise Error ("course is full")

def isCancelled(self):
    if len(enrollments) < self.min:
        raise Error ("Course is Cancelled")
