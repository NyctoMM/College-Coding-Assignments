from random import randint
player = input('rock (r), paper (p) or scissors (s)? ')
if player == 'r':
    playerArt = "O"
elif player == 's':
    playerArt = '>8'
else:
    playerArt = '___'

print(playerArt, 'vs', end=' ')

chosen = randint(1,3)
#print(chosen)
if chosen == 1:
    computer = 'r'
elif chosen == 2:
    computer = 'p'
else:
    computer = 's'
#print(computer)

if computer == 'r':
    print("O")
elif computer == 's':
    print('>8')
else:
    print('___')

if player == computer:
    print('DRAW!')
elif player == 'r' and computer == 's':
    print('Player wins!')
elif player == 'r' and computer == 'p':
    print('Computer wins!')
elif player == 's' and computer == 'p':
    print('Player wins!')
elif player == 's' and computer == 'r':
    print('Computer wins!')
elif player == 'p' and computer == 'r':
    print('Player wins!')
elif player == 'p' and computer == 's':
    print('Computer wins!')


