package Week2;

import java.util.*;

/*
*This is application that implements tic toc game. I used 2D arrays
* Algorithm:
* 1. it is a player and computer playing
* 2. player have X and computer has O
* 3. Player choose position for beginning and the rest if position is taken, it becomes invalid
* 4. if one of win condition met the game stops
*  */
public class LearnArrays {
    //global variables for storing positions
    static ArrayList<Integer> playerPositions = new ArrayList<>();
    static ArrayList<Integer> computerPositions = new ArrayList<>();

    public static void main(String[] args) {
        //declare variable as char to keep the game board
        char[][] board = {
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
        };

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your position (1-9):");
            int playerPos = sc.nextInt();
            while (playerPositions.contains(playerPos) || computerPositions.contains(playerPos)){
                System.out.println("Player: Position taken!!! Enter valid positions");
                playerPos = sc.nextInt();
            }

            placePiece(board,playerPos,"player");

            String result = checkWinner();
            if(result.length() > 0) {
                System.out.println("Final board result: \n " + result);
                printBoard(board);
                break;
            }

            Random rand = new Random();
            int computerPos = rand.nextInt(9) +1;
            while (computerPositions.contains(computerPos) || playerPositions.contains(computerPos)){
                // System.out.println("Computer: Position taken!!! Enter valid positions");
                computerPos = rand.nextInt(9) + 1;
            }

            placePiece(board,computerPos,"computer");
            result = checkWinner();
            if(result.length() > 0) {
                System.out.println("Final board result: \n " + result);
                printBoard(board);
                break;
            }

            printBoard(board);
        }
    }
    //method for printing the board
    public static void printBoard(char[][] board){
        //use for each loop to loop into the rows of the game board and print
        for (char[] row : board) {
            //use for each loop to loop into the columns of the game board and print
            for(char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

    }
    //method for replacing pieces
    public static void placePiece(char[][] board, int pos, String user){

        char symbol = ' ';

        if(user.equals("player")){
            symbol = 'X';
            playerPositions.add(pos);
        } else if (user.equals("computer")) {
            symbol = 'O';
            computerPositions.add(pos);
        }
        switch (pos){
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][2] = symbol;
                break;
            case 3:
                board[0][4] = symbol;
                break;
            case 4:
                board[2][0] = symbol;
                break;
            case 5:
                board[2][2] = symbol;
                break;
            case 6:
                board[2][4] = symbol;
                break;
            case 7:
                board[4][0] = symbol;
                break;
            case 8:
                board[4][2] = symbol;
                break;
            case 9:
                board[4][4] = symbol;
                break;
            default:
                break;

        }
    }
    //method for checking win condition
    public static String checkWinner(){

        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List bottomRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);

        List<List> winCondition = new ArrayList<List>();
        winCondition.add(topRow);
        winCondition.add(midRow);
        winCondition.add(bottomRow);
        winCondition.add(leftCol);
        winCondition.add(midCol);
        winCondition.add(rightCol);
        winCondition.add(cross1);
        winCondition.add(cross2);

        for(List l : winCondition) {
            if(playerPositions.containsAll(l)) {
                return "Congratulations you won";
            } else if (computerPositions.containsAll(l)) {
                return "You lost";
            } else if (playerPositions.size() + computerPositions.size() == 9) {
                return "CAT!";

            }
        }
        return  "";
    }
}
