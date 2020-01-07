import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * A class modelling a tic-tac-toe (noughts and crosses, Xs and Os) game.
 * 
 * 
 * 
 * @author Zakaria Farah
 * @version March 29, 2019
 */

public class TicTacToe implements ActionListener
{
   /** Constants **/
   public static final String PLAYER_X = "X"; // player using "X"
   public static final String PLAYER_O = "O"; // player using "O"
   public static final String EMPTY = " ";  // empty cell
   public static final String TIE = "T"; // game ended in a tie
 
   /** Game Strings Integers **/
   private String player;           // current player (PLAYER_X or PLAYER_O)
   private String winner;           // winner: PLAYER_X, PLAYER_O, TIE, EMPTY = in progress
   private int numFreeSquares;      // number of squares still free   
   private JButton board[][];       // 3x3 array of buttons representing the board
   private JLabel label;            // label describing the current state of the game
   
   /* The new menu item */
   private JMenuItem newItem;
   
   /* The quit menu item */
   private JMenuItem quitItem;
   
   /* A JTextField displays the current value of the counter. */
   private JTextField tictactoeDisplay;   
   
   /** 
    * Constructs a new Tic-Tac-Toe board.
    */
   public TicTacToe()
   {
      
      //Initialize the tic tac toe board
      board = new JButton[3][3];
      
      //Initialize the Frame
      JFrame frame = new JFrame("Tic Tac Toe");
      
      //Create a container to hold the menubar, board, and label
      Container contentPane = frame.getContentPane();
      contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
      
      //Create a menu bar and add it to the frame
      JMenuBar menubar = new JMenuBar();
      frame.setJMenuBar(menubar);
      
      //Create a menu called Game
      JMenu gameMenu = new JMenu("Game");
      menubar.add(gameMenu);
      
      //Create a menu option "New" and add it to Game
      newItem = new JMenuItem("New");
      gameMenu.add(newItem);
      
      //Create a menu option "Quit" and add it to Game
      quitItem = new JMenuItem("Quit");
      gameMenu.add(quitItem);
      
      // allow use of shortcuts
      final int SHORTCUT_MASK = Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(); // to save typing
      newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, SHORTCUT_MASK));   // shortcut for newItem (Ctrl-N)
      quitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));  // shortcut for quitItem (Ctrl-Q)
      
      //Add listeners for Quit and New
      quitItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                System.exit(0); // quit
            }
        }
      );
       
      newItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                clearBoard();
            }
        }
      );
      
      //Create Panel to hold the game board
      JPanel boardPanel = new JPanel();
      boardPanel.setLayout(new GridLayout(3, 3));

      //Initialize an array containing all nine spots on the board and add it to contentPane
      for (int i = 0; i < 3; i++) {
          for(int j = 0; j < 3; j++) {
              board[i][j] = new JButton(" "); 
              board[i][j].setFont(new Font("Monospaced", Font.PLAIN, 40));
              boardPanel.add(board[i][j]);
              board[i][j].addActionListener(this);
            }

      }
      contentPane.add(boardPanel);
      
      //Initialize label to indicate game state and add it to contentPane
      label = new JLabel("Game in Progress: X's turn");
      contentPane.add(label);
      
      //Set the board
      clearBoard();
      
      //Complete the frame
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // exit when we hit the "X"
      frame.pack(); // pack everthing into our frame
      frame.setResizable(false); // we can' resize it
      frame.setVisible(true); // it's visible
      
   }

   /**
    * Sets everything up for a new game.  Marks all squares in the Tic Tac Toe board as empty,
    * and indicates no winner yet, 9 free squares and the current player is player X.
    */
   private void clearBoard()
   {
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            board[i][j].setText(EMPTY);
            board[i][j].setEnabled(true);
         }
      }
      winner = EMPTY;
      numFreeSquares = 9;
      player = PLAYER_X;     // Player X always has the first turn.
      label.setText("Game in Progress: X's turn");
   }
   
   /**
    * Returns true if filling the given square gives us a winner, and false
    * otherwise.
    *
    * @param int row of square just set
    * @param int col of square just set
    * 
    * @return true if we have a winner, false otherwise
    */
   private boolean haveWinner(int row, int col) 
   {
       // unless at least 5 squares have been filled, we don't need to go any further
       // (the earliest we can have a winner is after player X's 3rd move).

       if (numFreeSquares>4) return false;

       // Note: We don't need to check all rows, columns, and diagonals, only those
       // that contain the latest filled square.  We know that we have a winner 
       // if all 3 squares are the same, as they can't all be blank (as the latest
       // filled square is one of them).

       // check row "row"
       if ( board[row][0].getText().equals(board[row][1].getText()) &&
            board[row][0].getText().equals(board[row][2].getText())) return true;
       
       // check column "col"
       if ( board[0][col].getText().equals(board[1][col].getText()) &&
            board[0][col].getText().equals(board[2][col].getText())) return true;

       // if row=col check one diagonal
       if (row==col)
          if ( board[0][0].getText().equals(board[1][1].getText()) &&
               board[0][0].getText().equals(board[2][2].getText())) return true;

       // if row=2-col check other diagonal
       if (row==2-col)
          if ( board[0][2].getText().equals(board[1][1].getText()) &&
               board[0][2].getText().equals(board[2][0].getText())) return true;

       // no winner yet
       return false;
   }
   
   /** Action listener checks if and what button was pressed. Disables board button if it was pressed.
    * Checks if there's a winner. If not, changes to other player.
    */
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource(); // get the action
        
        // see if it's a JButton
        if (o instanceof JButton) {
            
            JButton button = (JButton)o;
            
            for (int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if (button == board[i][j]) {
                        board[i][j].setText(player);
                        board[i][j].setEnabled(false);
                        
                        numFreeSquares--; // decrement number of free squares
                        
                        // see if the game is over
                        if (haveWinner(i,j)) {
                            winner = player; //current player wins
                            winner();
                            return;
                        }
                        else if (numFreeSquares==0) {
                            winner = TIE; // board is full so it's a tie
                            winner();
                            return;
                        }
                         
                        // change to other player (this won't do anything if game has ended)
                        if (player==PLAYER_X) 
                            player=PLAYER_O;
                        else 
                            player=PLAYER_X;
                        
                        //Change label to current player
                        label.setText("Game in Progress: " + player + "'s turn");
                    }
                }
            }
        }        
   }
   
   /** Sets the board and changes the label based on the winner.
    * disables all of the game buttons. Indicates the winner or
    * that the game is a tie.
    */
   private void winner()
   {
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j].setEnabled(false);
            }
        }
        if (winner == TIE) {
            label.setText("Game Over: Tie!");
        }
        else {  
            label.setText("Game Over: " + player + " wins!");
        }
    }
}

    

            
       