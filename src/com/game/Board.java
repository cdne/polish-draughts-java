package com.game;

class Board {
    private int boardSize;
    Pawn[][] fields;

    Board(int n) {
        setBoardSize(n);
        fields = new Pawn[boardSize][boardSize];
        setBoard();
    }

    void setBoardSize(int size) {
        boardSize = size;
    }

    void setBoard() {
        for(int i = 0; i < boardSize;i++){
            for(int j = 0; j < boardSize;j++){
                if(j % 2 == 0) {
                    fields[i][j] = new Pawn();
                }
                System.out.print(fields[i][j] + " ");
            }
            System.out.println();
        }
    }

    //todo add validation for size n (will be user input). Must be between 10 and 20

    void removePawn() {

    }

    void movePawn() {

    }
}
