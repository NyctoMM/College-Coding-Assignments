f = open("my-name.txt", "rt")
file1_contents = f.read()

print(f.read())
print(file1_contents)

print("./subdir/my-fav-hobby.txt")
for line in f:
    print(line) #prints every line in ben.txt

f = open("my-name.txt", "w")
f.write("My name is Benjamin")
f.close()
