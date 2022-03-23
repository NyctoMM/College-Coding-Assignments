from turtle import *
from random import randint

speed(10)
penup()
goto(-140, 140)

for step in range(15):
    write(step, align='center')
    right(90)
    forward(10)
    pendown()

    for i in range(7):
        forward(10)
        penup()
        forward(10)
        pendown()
        
    forward(10)
    penup()
    backward(160)
    left(90)
    forward(20)

Sliver = Turtle()
Sliver.color('cyan')
Sliver.shape('turtle')
Sliver.penup()
Sliver.goto(-160, 100)
Sliver.pendown()
Sliver.right(72 * 5)

Crimson = Turtle()
Crimson.color('red')
Crimson.shape('turtle')
Crimson.penup()
Crimson.goto(-160, 70)
Crimson.pendown()
Crimson.left(72 * 5)

Harrison = Turtle()
Harrison.color('darkorchid')
Harrison.shape('turtle')
Harrison.penup()
Harrison.goto(-160, 40)
Harrison.pendown()
Harrison.right(72 * 5)

Ristriel = Turtle()
Ristriel.color('yellow')
Ristriel.shape('turtle')
Ristriel.penup()
Ristriel.goto(-160, 10)
Ristriel.pendown()
Ristriel.left(72 * 5)

for turn in range(100):
    Sliver.forward(randint(1,5))
    Crimson.forward(randint(1,5))
    Harrison.forward(randint(1,5))
    Ristriel.forward(randint(1,5))