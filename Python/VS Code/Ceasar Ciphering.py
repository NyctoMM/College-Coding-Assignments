alphabet = 'abcdefghijklmnopqrstuvwxyz'
key = 0 #defaults to zero
#0 = a, etc etc
oldMessage = ''
newMessage = ''


#character = input('Please enter a character: ')
message = input('Please enter a message: ')
key = int(input('Please enter a key number: '))

for character in message:
    if character in alphabet:
        position = alphabet.find(character) #Outputs int
        newPosition = (position + key) % 26
        newCharacter = alphabet[newPosition]
        #print("The new character is:", newCharacter) #New Character Position 
        newMessage += newCharacter #Completing the message4
    else:
        newMessage += character

print('The final encoding is:', newMessage)
#print(position) #First position
#print(newPosition) #Second position

temp = input('Shall I decyrpt the message? ')
if (temp == 'yes') or (temp == 'y'):
    for character in newMessage:
        if character in alphabet:
            position = alphabet.find(character)
            newPosition = (position - key) % 26
            newCharacter = alphabet[newPosition]
            oldMessage += newCharacter
        else:
            oldMessage += character
print('The final decoding is:', oldMessage)


##DEBUGGING MATERIAL

#print(alphabet[0])
#print(alphabet[6])
#print(alphabet[19])