package com.coffeemenu;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {' ', ' ', 'X'}
        };

        // Print the board
        System.out.println("Tic-Tac-Toe Board:");
        for (int i = 0; i < board.length; i++) { // Rows
            for (int j = 0; j < board[i].length; j++) { // Columns
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
