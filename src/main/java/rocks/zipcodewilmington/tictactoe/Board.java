package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }
//public boolean checkColumn(String letter){
//    for (int i =0; i < 3; i++){
//        if (this.matrix[i][0] == x.charAt(0) && this.matrix[i][1]
//    }
//
public boolean isInFavorOfX(){

        return checkRow('X') || checkColumn('X');
    }


    //******************************************************************************************************
    public Boolean checkRow(Character letter) {
        for (int i = 0; i < 3; i++) {
            if (this.matrix[i][0] == letter && this.matrix[i][1] == letter && this.matrix[i][2] == letter) {

                return true;
            }
        }
        return false;

    }

    public Boolean checkColumn(Character letter) {
        for (int i = 0; i < 3; i++) {
            if (this.matrix[0][i] == letter && this.matrix[1][i] == letter && this.matrix[2][i] == letter) {
                return true;
            }

        }
        return false;
    }

    public Boolean checkDiagonal(Character letter) {
//        this.board = new Board(new Character[][]{
//                {'O', ' ', 'X'},   [00] [11] [22]
//                {' ', 'O', 'X'},
//                {' ', ' ', 'O'}
//

        for (int i = 0; i < 3; i++) {
            if (this.matrix[i][0] == letter && this.matrix[i][1] == letter && this.matrix[i][2] == letter) {

                return true;
            }
        }
        return false;

    }



        //*************************************************************************************************
        public Boolean isInFavorOfO () {
            return checkRow('O') || checkColumn('O');
        }

        public Boolean isTie () {
            return isInFavorOfO() == isInFavorOfX();
            //false == false
            //both return false
        }

        public String getWinner () {
            if (isInFavorOfO()){
                return "O";
             }else if(isInFavorOfX()) {
                    return "X";
                }else
                {
                    return "";
                }
            }
        }

