for i in range(2, 8, 2):
    print(i)

    temperature = 65


while temperature < 80:
        print("it's still a nice dy")
        if temperature < 70:
            temperature = temperature + 5
        elif temperature > 75:
            break
        else:
            temperature = temperature + 3
    
num = 100

while num > 0:
    for i in range(100, 0, -25):
        num = num - i
print(num)

for i in range(10):
    if i == 3:
        continue
    print(i)
