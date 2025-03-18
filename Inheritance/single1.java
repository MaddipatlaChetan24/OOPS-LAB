class Person:
    def __init__(self, name, age, address):
        self.name = name
        self.age = age
        self.address = address

    def display_info(self):
        return f"Name: {self.name}, Age: {self.age}, Address: {self.address}"

class Student extends Person:
    def __init__(self, name, age, address, student_id, grades):
        super().__init__(name, age, address)
        self.student_id = student_id
        self.grades = grades  # Dictionary of course grades

    def calculate_gpa(self):
        total_points = 0
        for grade in self.grades.values():
            if grade == 'A': total_points += 4
            elif grade == 'B': total_points += 3
            elif grade == 'C': total_points += 2
            elif grade == 'D': total_points += 1
        return total_points / len(self.grades)

    def display_info(self):
        person_info = super().display_info()
        return f"{person_info}, Student ID: {self.student_id}, GPA: {self.calculate_gpa()}"


student = Student("John Doe", 21, "1234 Elm St", "S1001", {"Math": "A", "Science": "B", "History": "A"})
print(student.display_info())
