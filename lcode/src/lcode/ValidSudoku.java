package lcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 36. Valid Sudoku
 * @author smeng
 *
 */

//Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
//
//The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


public class ValidSudoku {
	
	public static boolean isValidSudoku(char[][] board) {
		Set<String> set = new HashSet<String>();
		for(int i=0; i<board.length; ++i) {
			for(int j=0; j<board[0].length; ++j) {
				if(board[i][j]!='.') {
					String s = "("+board[i][j]+")";
					if(!set.add(s+i) || !set.add(j+s) || !set.add(i/3+s+j/3)) {
						return false;
					}
				}
			}
		}
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
