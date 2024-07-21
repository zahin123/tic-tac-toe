/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeactivity.example.tttgame.phase1;

/**
 *
 * @author nudratsaber
 */

public class TTTGame {
    
    private ComputerPlayer[] players = new ComputerPlayer[2];
    private Board board;
    
    private String[] marks = {"X", "O"};
    private String name = "TicTacToe";
    
    private int gameRowSize = 3;
    private int gameColSize = 3;
    private int gameScoreToWin = 3;
    
    private int currentPlayerIndex = -1;
    
    public TTTGame() {
        setPlayers();
        setBoard();
    }
    
    private void setBoard() {
        this.board = new Board(gameRowSize, gameColSize, "TTTGame");
    }
    
    private void setPlayers() {
        for(int i = 0; i < players.length; i++) {
            ComputerPlayer p = new ComputerPlayer("player" + i + 1, marks[i]);
            players[i] = p;
        }
    }
    /**
     * 1- start the game message
     * 2- select the current player index
     * 3- player should select row and col to place the mark
     * 4- board should check if the box is available and if so place the mark otherwise repeat the process
     * 5- then print the board
     * 6- repeat the steps for the other player until one player win or board is full
     */
    
    public void start() {
        System.out.println("game started ... ");
        do {
            switchPlayer();
            while(!board.makeMove(players[this.currentPlayerIndex].getMark(),
                    players[this.currentPlayerIndex].randomNumber(gameRowSize),
                    players[this.currentPlayerIndex].randomNumber(gameColSize)));
            board.print();
            
        }while(!gameOver());
          if(isWinner()==true){
              System.out.println("player " +players[this.currentPlayerIndex].getMark()+" won");
          }
          else{
              System.out.println("no one won");
          }
    }
 
    private void switchPlayer() {
        // do this if(currentPlayerIndex == -1)
            if(currentPlayerIndex == -1)
            currentPlayerIndex = 0;
        else if(currentPlayerIndex == 0)
            currentPlayerIndex = 1;
        else if(currentPlayerIndex == 1)
            currentPlayerIndex = 0;
    }

 private boolean isWinner() {
            if(board.getMark(0,0) == board.getMark(0,1) && board.getMark(0,1) ==
board.getMark(0,2)   && board.getMark(0,0) != "-" ||
                           board.getMark(1,0) == board.getMark(1,1) &&
board.getMark(1,1) == board.getMark(1,2)  && board.getMark(1,0) != "-"||
                           board.getMark(2,0) == board.getMark(2,1) &&
board.getMark(2,1) == board.getMark(2,2)  && board.getMark(2,0) != "-"||
                           board.getMark(0,0) == board.getMark(1,0) &&
board.getMark(1,0) == board.getMark(2,0)  && board.getMark(0,0) != "-"||
                           board.getMark(0,1) == board.getMark(1,1) &&
board.getMark(1,1) == board.getMark(2,1)  && board.getMark(0,1) != "-"||
                           board.getMark(0,2) == board.getMark(1,2) &&
board.getMark(1,2) == board.getMark(2,2)  && board.getMark(0,2) != "-"||
                           board.getMark(0,0) == board.getMark(1,1) &&
board.getMark(1,1) == board.getMark(2,2)  && board.getMark(0,0) != "-"||
                           board.getMark(0,2) == board.getMark(1,1) &&
board.getMark(1,1) == board.getMark(2,0)  && board.getMark(0,2) != "-"
) {
                  return true;
            }
            return false;
      }
 private boolean gameOver() {
                if(isWinner()) {
                      
                      return true;
                }
                else if (board.isFull()) {
                 return true;
                 }
else {
                       return false;
                }


 }}