#PYTHON NOTES FILE#
#instead of { }, we use : to start a while or for loop, and we use tabs to show that they are within the loop
value = 1
while value == 1:
    print("5")
    value = value + 1

# indices:           0   1   2   3   4   5   6   7   8   9  10  11
#                    h   e   l   l   o       w   o   r   l   d   !
# negative indices: -12 -11 -10 -9  -8  -7  -6  -5  -4  -3  -2  -1
my_string = "hello world!"

print ("my_string[1:3] is " + my_string[1:3])
print ("my_string[1:] is " + my_string[1:])
print ("my_string[:3] is " + my_string[:3])

print (my_string[3:5] + my_string[2] + my_string[5:9] + my_string[-2:]) 



"string".strip() #Strips extra spces off of both sides
"string".upper() #Also Lower)

#r, a, w, x Read, Append, Write, Create for files
#Read: Opens a file for reading
#Append: Opens a file for appending
#Write: Opens a file for writing, Overwrits any existing content
#Create: Creates a file

#Text: t Default valule, text mode
#Binary: B binary mode

f = open ("ben.txt", "rt")
file1_contents = f.read()

print(f.read())
print(file1_contents)

print("./subdir/I like to game!.txt")
for line in f:
    print(line) #prints every line in ben.txt

f = open("ben.txt", "w")
f.write("My name is Benjamin")
f.close()
