from random import randint
player = input('Water (w), Fire (f) or Earth (e)? ')
if player == 'w':
    playerArt = "VVVVV"
elif player == 'f':
    playerArt = '^-^-^'
else:
    playerArt = '__|__'

print(playerArt, 'vs', end=' ')

chosen = randint(1,3)
#print(chosen)
if chosen == 1:
    computer = 'w'
elif chosen == 2:
    computer = 'f'
else:
    computer = 'e'
#print(computer)

if computer == 'r':
    print("VVVVV")
elif computer == 's':
    print('^-^-^')
else:
    print('__|__')

if player == computer:
    print('DRAW!')
elif player == 'w' and computer == 'f':
    print('Player wins!')
elif player == 'w' and computer == 'e':
    print('Computer wins!')
elif player == 'f' and computer == 'e':
    print('Player wins!')
elif player == 'f' and computer == 'w':
    print('Computer wins!')
elif player == 'e' and computer == 'w':
    print('Player wins!')
elif player == 'e' and computer == 'f':
    print('Computer wins!')