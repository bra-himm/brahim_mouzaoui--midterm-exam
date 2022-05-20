package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        int n =20;
        for (int line = 1; line <= n; line++){
            for (int i = 1; i<=n-line ; i++){
                System.out.print(" ");
            }
            for (int j = 1; j <=line; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        }
  }
