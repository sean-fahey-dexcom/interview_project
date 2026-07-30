#!/usr/bin/env python3

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def greet(self):
        if not hasattr(self, 'name') or not hasattr(self, 'age'):
            return "Sorry, I can't answer your question."

        return f"Hello, my name is {self.name} and I am {self.age} years old."


class Alien(Person):
    def __init__(self, planet):
        self.planet = planet

    def communicate(self):
        return f"Hello, I am from planet {self.planet}."


def main():
    alice = Person("Alice", 20)
    xenon = Alien("Xenon")

    print(alice.greet())
    print(alice.age)

    print(xenon.communicate())
    print(xenon.greet())


if __name__ == "__main__":
    main()
