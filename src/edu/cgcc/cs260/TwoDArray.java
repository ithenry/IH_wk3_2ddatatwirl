package edu.cgcc.cs260;

/** This class creates a 2D array and fills it to make
 *  a picture of a triangle and glass
 * @author CS260 Class
 */
public class TwoDArray {

    /**
     * 2D array to hold image of triangle and glass
     */
    char[][] arr = new char[8][16];

    /**
     * Constructor to fill array
     */
    public TwoDArray() {
        fillTriangle();
        fillGlass();
    }

    /**
     * fills triangle into 2D array
     */
    private void fillTriangle() {
        for(int r = 0; r < arr.length; r++) {
            for(int c = 0; c < 8; c++) {
                if(r < c) {
                    arr[r][c] = ' ';
                }
                else {
                    arr[r][c] = '*';
                }
            }
        }
    }

    /**
     * fills glass into 2D array
     */
    private void fillGlass() {
        for(int r = 0; r < arr.length; r++) {
            for(int c = 8; c < arr[r].length; c++) {
                if(r == 0) {
                    arr[r][c] = '*';
                }
                else if(r == 1 && c > 8 && c < 15) {
                    arr[r][c] = '*';
                }
                else if(r == 2 && c > 9 && c < 14) {
                    arr[r][c] = '*';
                }
                else if( r > 2 && r < 8 && c > 10 && c < 13) {
                    arr[r][c] = '*';
                }
                else if(r == 7 && c > 9 && c < 14) {
                    arr[r][c] = '*';
                }
                else {
                    arr[r][c] = ' ';
                }
            }
        }
    }

    /**
     * Rotates an array 90 degrees and stores it into temporary memory
     * @return the temporary array
     */
    private char[][] transpose(){
        char[][] temp = new char[16][8];

        for(int r = 0; r < 16; r++) {
            for(int c = 0; c < 8; c++) {
                temp[r][c] = arr[c][r];
            }
        }

        return temp;
    }

    /**
     * prints 2D array to console
     */
    public void printArray() {
        for(int r = 0; r < 8; r++) {
            for(int c = 0; c < 16; c++) {
                System.out.print(arr[r][c]);
            }
            System.out.println();
        }
    }

    /**
     * print 2D array rotated by 90 degrees using the temporary array that's been flipped
     */
    public void printArray90() {
        char[][] temp = transpose();
        for(int r = 0; r < 16; r++) {
            for(int c = 7; c >= 0; c--) {
                System.out.print(temp[r][c]);
            }
            System.out.println();
        }
    }

    /**
     * prints 2D array rotated 180 degrees by going through the initial array backwards
     */
    public void printArray180() {
        for(int r = 7; r >= 0; r--) {
            for(int c = 8; c < 16; c++) {
                System.out.print(arr[r][c]);
            }

            for(int c = 7; c >= 0; c--) {
                System.out.print(arr[r][c]);
            }
            System.out.println();
        }
    }

    /**
     * print 2D array rotated by 270 degrees by printing the temporary array backwards
     */
    public void printArray270() {
        char[][] temp = transpose();
        for(int r = 15; r >= 0; r--) {
            for(int c = 0; c < 8; c++) {
                System.out.print(temp[r][c]);
            }
            System.out.println();
        }
    }

}