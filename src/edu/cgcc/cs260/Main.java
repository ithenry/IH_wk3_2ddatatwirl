
//HEADER
//Program Name: 2D Data Twirl
//Author: Collaborative between class, Isaak Henry participating
//Class: CS260 Fall 2019
//Date: 10/14/2019
//Description: This program transposes a 2d array to print an image rotated in increments of 90 degrees counterclockwise
package edu.cgcc.cs260;

public class Main {

    public static void main(String[] args) {
        //create and fill 2D array to print image
        TwoDArray arr = new TwoDArray();
        arr.printArray();
        System.out.println();
        arr.printArray90();
        System.out.println();
        arr.printArray180();
        System.out.println();
        arr.printArray270();

    }

}
/*
 When the code is ran, an image that looks like:
 *       ********
**       ******
***       ****
****       **
*****      **
******     **
*******    **
********  ****

********
*******
******
*****
****
***
**
*
       *
      **
*    ***
********
********
*    ***
      **
       *

  ****  ********
   **    *******
   **     ******
   **      *****
   **       ****
  ****       ***
 ******       **
********       *

*
**
***    *
********
********
***    *
**
*
       *
      **
     ***
    ****
   *****
  ******
 *******
********

will print.
 */