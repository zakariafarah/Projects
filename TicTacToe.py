# Game loop
def playGame():
    while game_still_going:
     displayBoard()
     takeTurn()

# Board Setup    
def displayBoard():
     
 print (board[0] + "|" + board[1] + "|" + board[2])
 print (board[3] + "|" + board[4] + "|" + board[5])
 print (board[6] + "|" + board[7] + "|" + board[8])

# Handles each step of the game     
def takeTurn():
 
        
    print(current_player,'s turn')
    print ('1 | 2 | 3')
    print ('4 | 5 | 6')
    print ('7 | 8 | 9')
    pos = int(input('enter board position from 1-9'))
    pos = pos-1
    
    board[pos] = current_player
    check_rows()
    check_columns()
    check_diagonals()
    check_for_tie()
    flip_player()
    

# check board position is valid



         
# check rows
def check_rows():
  # Set global variables
  global game_still_going
  # Check if any of the rows have all the same value (and is not empty)
  row_1 = board[0] == board[1] == board[2] != "-"
  row_2 = board[3] == board[4] == board[5] != "-"
  row_3 = board[6] == board[7] == board[8] != "-"
  # If any row does have a match, flag that there is a win
  if row_1 or row_2 or row_3:
    game_still_going = False
  


# Check the columns for a win
def check_columns():
  # Set global variables
  global game_still_going
  # Check if any of the columns have all the same value (and is not empty)
  column_1 = board[0] == board[3] == board[6] != "-"
  column_2 = board[1] == board[4] == board[7] != "-"
  column_3 = board[2] == board[5] == board[8] != "-"
  # If any row does have a match, flag that there is a win
  if column_1 or column_2 or column_3:
    game_still_going = False
  


# Check the diagonals for a win
def check_diagonals():
  # Set global variables
  global game_still_going
  # Check if any of the columns have all the same value (and is not empty)
  diagonal_1 = board[0] == board[4] == board[8] != "-"
  diagonal_2 = board[2] == board[4] == board[6] != "-"
  # If any row does have a match, flag that there is a win
  if diagonal_1 or diagonal_2:
    game_still_going = False
  


# Check if there is a tie
def check_for_tie():
  # Set global variables
  global game_still_going
  global winner_tie
  # If board is full
  if "-" not in board:
    game_still_going = False
    winner_tie = True
  # Else there is no tie
  


# Flip the current player from X to O, or O to X
def flip_player():
  # Global variables we need
  global current_player
  # If the current player was X, make it O
  if current_player == Player_X:
    current_player = Player_O
  # Or if the current player was O, make it X
  elif current_player == Player_O:
    current_player = Player_X


# Display Winner of the game
def displayWinner():
    global winner
    if current_player == Player_O:
     winner = Player_X
    # Or if the current player was O, make it X
    if current_player == Player_X:
     winner = Player_O

    print('Winner is Player', winner)
    
def displayNoWinner():
    
     print('Game ends in a Tie')

#Global Variables 
    
board = [ '-','-','-', '-','-','-','-','-','-']
pos = ' '
Player_X = 'X' 
Player_O = 'O'
current_player = Player_X
game_still_going = True
winner = ''
winner_tie = False

playGame()
displayBoard()

if winner_tie == True:
  displayNoWinner()
else:
    displayWinner()



