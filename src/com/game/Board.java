package com.game;

import java.util.InputMismatchException;
import java.util.Scanner;

class Board {
    private int boardSize;
    private String[] boardColumns = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
            "Q", "R", "S", "T"};
    private int[] boardRows = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    Pawn[][] fields;
    private Scanner scanner;

    Board(int n) throws GameException {
        scanner = new Scanner(System.in);
        boardSize = validateInput(n);
        fields = new Pawn[boardSize][boardSize];
        setBoard();
    }

    private void setBoard() {
        for(int i = 0; i < boardSize;i++){
            for(int j = 0; j < boardSize;j++){
                 if(i % 2 == 0 && j % 2 != 0) {
                    fields[i][j] = new Pawn();
                } else if(i % 2 != 0 && j % 2 == 0) {
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

    private int validateInput(int size) {
        int inputSize = 0;
        while(size < 10 || size > 20) {
            System.out.print("Choose the board size: ");

            try {
                System.out.println(inputSize);
                inputSize = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("You must enter a number.");
                continue;
            }

            if(inputSize >= 10 && inputSize <= 20) break;
            else {
                System.out.println("You need to provide a value between 10 and 20.");
                continue;
            }
        }

        return inputSize;
    }



    @Override
    public String toString() {
        for(int i = 0; i < boardSize;i++){
            System.out.print("\t" + boardColumns[i]);
        }
        System.out.println();
        for(int col = 0; col < fields.length;col++){
            System.out.print(boardRows[col] + "\t");
            for(int row = 0; row < fields[col].length; row++){
            }
            System.out.println();
        }
        return "";
    }
}
