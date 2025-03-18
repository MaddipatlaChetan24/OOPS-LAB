class Employee:
    def __init__(self, name, employee_id, position, salary):
        self.name = name
        self.employee_id = employee_id
        self.position = position
        self.salary = salary

    def display_info(self):
        return f"Employee Name: {self.name}, ID: {self.employee_id}, Position: {self.position}, Salary: {self.salary}"

class Manager extends Employee:
    def __init__(self, name, employee_id, position, salary, department):
        super().__init__(name, employee_id, position, salary)
        self.department = department
        self.projects = []  # List of projects the manager is overseeing
        self.teams = {}  # Dictionary of teams assigned to the manager

    def assign_project(self, project_name, team_name):
        self.projects.append(project_name)
        if team_name not in self.teams:
            self.teams[team_name] = []
        self.teams[team_name].append(project_name)

    def display_info(self):
        employee_info = super().display_info()
        return f"{employee_info}, Department: {self.department}, Projects: {', '.join(self.projects)}"

    def display_teams(self):
        for team, projects in self.teams.items():
            print(f"Team {team} is handling the following projects: {', '.join(projects)}")

manager = Manager("Alice", "M1001", "IT Manager", 80000, "IT")
manager.assign_project("Website Revamp", "Team A")
manager.assign_project("Mobile App Development", "Team B")
manager.assign_project("Cloud Migration", "Team A")

print(manager.display_info())
manager.display_teams()
