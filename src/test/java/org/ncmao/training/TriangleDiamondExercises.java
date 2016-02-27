package org.ncmao.training;

import org.junit.Before;
import org.junit.Test;

public class TriangleDiamondExercises {

    @Before
    public void printSplitLine(){
        System.out.print("-----------------");
        System.out.println();
    }


    @Test
    public void shouldPrintOneAsterisk() {
        printOneAsterisk();
        System.out.println();
    }

    @Test
    public void shouldPrintHorizontalLine(){
        printHorizontalLine(8);
    }

    @Test
    public void shouldPrintVerticalLine(){
        printVerticalLine(3);
    }

    @Test
    public void shouldPrintRightTriangle(){
        printRightTriangle(3);
    }

    @Test
    public void shouldPrintIsoscelesTriangle(){
        printIsoscelesTriangle(3, 0);
    }

    @Test
    public void shouldPrintDiamond(){
        printDiamond(4);
    }

    @Test
    public void shouldPrintDiamondWithYourName(){
        printIsoscelesTriangle(2, 0);
        System.out.println("maoningchuan");
        printReverseCenteredTriangle(2, -1);
    }

    private void printOneAsterisk() {
        System.out.printf("*");
    }



    private void printHorizontalLine(int n) {
        for (int i=0;i<n;i++) {
            printOneAsterisk();
        }
        System.out.println();
    }

    private void printVerticalLine(int n){
        for (int i=0;i<n;i++) {
            printOneAsterisk();
            System.out.println();
        }
    }
    private void printRightTriangle(int n) {
        for (int i = 0; i < n; ++i) {
            printHorizontalLine(i + 1);
        }
    }

    private void printIsoscelesTriangle(int n, int position) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<=n-i + position;j++) {
                printBlank();
            }
            for (int k=0;k<=2*i;k++) {
               printOneAsterisk();
            }
            System.out.println();
        }
    }

    private void printDiamond(int n) {
        printIsoscelesTriangle(n, 0);
        printReverseCenteredTriangle(n-1, 0);
    }

    private void printBlank(){
        System.out.print(" ");

    }

    private void printReverseCenteredTriangle(int n, int position) {
        for (int i=n;i>=0;i--) {
            for (int k=0;k<n-i+3 + position;k++) {
                printBlank();
            }
            for (int j=0;j<2*i-1;j++) {
                printOneAsterisk();
            }
            System.out.println();
        }
    }
}
