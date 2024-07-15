package Practice;

import java.util.*;

public class Pattern {

    public static void main(String args[]) {
        // common for all pattern
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Coloums : ");
        int cols = sc.nextInt();

        // 1st pattern (solid rectangle)
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        System.out.println("solid Rectangle");
        System.out.println();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            // for(int i = 0; i < rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // for(int j = 0; j < cols; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        // ======================================================================================
        // 2rd pattern (hollow rectangle)
        /*
         * * * * *
         *       *
         *       *
         * * * * *
         */
        System.out.println("Hollow Rectangle");
        System.out.println();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || j == 1 || j == cols || i == rows) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // ===========================================================================================

        // 3th pattern (half pyramid)
        /*
         *
         * *
         * * *
         * * * *
         */
        System.out.println("Half Pyramid");
        System.out.println();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // =================================================================================

        // 4th pattern (inverted half pyramid)
        /*
         * * * *
         * * *
         * *
         *
         */
        System.out.println("Inverted Half Pyramid");
        System.out.println();
        System.out.println();
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 5th pattern (inverted half pyramid rototed by 180 deg)
        /*
               *
             * *
           * * *
         * * * *
         */
        System.out.println("Inverted Half Pyramid rototed by 180 deg");
        System.out.println();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 6th pattern (half pyramid with number)
        /*
          1
          1 2
          1 2 3
          1 2 3 4
          1 2 3 4 5
         */
        System.out.println("Half Pyramid with Number");
        System.out.println();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 7th pattern (inverted half pyramid with number)
        /*
          1 2 3 4 5
          1 2 3 4
          1 2 3
          1 2
          1
         */
        System.out.println("Inverted Half Pyramid with Number");
        System.out.println();
        System.out.println();
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 8th pattern (floyd's Triangle)
        /*
          1
          2  3
          4  5  6
          7  8  9  10
          11 12 13 14 15
         */
        System.out.println("Floyd's Triangle");
        System.out.println();
        System.out.println();
        int count = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + "   ");
                // count = count + 1;
                count += 1;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 9th pattern (0 & 1 Triangle)
        /*
          1
          0 1
          1 0 1
          0 1 0 1
          1 0 1 0 1
         */ // here we get one combination row and column is even then print 1
        System.out.println("0 & 1 Triangle");
        System.out.println();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (((i + j) % 2) == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 10th pattern (solid rhombus)
        /*
                 * * * * *
               * * * * *
             * * * * *
           * * * * *
         * * * * *
         */
        System.out.println("Solid Rhombus");
        System.out.println();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= cols; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 11th pattern (number pyramid)
        /*
          1
          2 2
          3 3 3
          4 4 4 4
          5 5 5 5 5
         */
        System.out.println("Number Pyramid");
        System.out.println();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 12th pattern (palindromic number pyramid)
        /*
                  1
                2 1 2
              3 2 1 2 3
            4 3 2 1 2 3 4
          5 4 3 2 1 2 3 4 5
         */
        System.out.println("Palindromic number pyramid");
        System.out.println();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" " + " ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 13th pattern (solid butterfly)
        /*
         *             *
         * *         * *
         * * *     * * *
         * * * * * * * *
         * * * * * * * *
         * * *     * * *
         * *         * *
         *             *
         */
        System.out.println("solid butterfly");
        System.out.println();
        System.out.println();
        // uper side
        for (int i = 1; i <= rows; i++) {
            // left star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            // all space
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" " + " ");
            }
            // right star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // lower side
        for (int i = rows; i >= 1; i--) {
            // left star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            // all space
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" " + " ");
            }
            // right star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 14th pattern (Diamond pattern)
        /*
               * 
             * * *
           * * * * *
         * * * * * * *
         * * * * * * *
           * * * * *
             * * *
               * 
         */
        System.out.println("Diamond pattern");
        System.out.println();
        System.out.println();
        // uper side
        for (int i = 1; i <= rows; i++) {
            // space
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // lower side
        for (int i = rows; i >= 1; i--) {
            // space
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 13th pattern (hollow butterfly)
        /*
         *                *
         * *            * *
         *    *      *    *
         *      *  *      *
         *      *  *      *
         *    *      *    *
         * *            * *
         *                *
         */
        System.out.println("hollow butterfly");
        System.out.println();
        System.out.println();
        // uper side
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || j == i) {
                    // if(i == 1 || j == 1 || j == i || i == rows){
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            // space
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || j == i) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        // // lower side
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || j == i) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            // // space
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || j == i) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 13th pattern (Hollow Rectangular with 4 triangle)
        /*
         * * * * * * * *
         * *         * *
         *   *     *   *
         *     * *     *
         *     * *     *
         *   *     *   *
         * *         * *
         * * * * * * * *
         */
        System.out.println("Hollow Rectangular with 4 triangle");
        System.out.println();
        System.out.println();
        // uper side
        for (int i = 1; i <= rows; i++) {
            if (i == 1) {
                for (int j = 1; j <= rows; j++) {
                    System.out.print("*" + " ");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    if (i == 1 || j == 1 || j == i) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print(" " + " ");
                    }
                }
            }
            // space
            if (i != 1) {
                for (int j = 1; j <= 2 * (rows - i); j++) {
                    System.out.print(" " + " ");
                }
            }

            if (i == 1) {
                for (int j = 1; j <= rows; j++) {
                    System.out.print("*" + " ");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    if (i == 1 || j == 1 || j == i) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print(" " + " ");
                    }
                }
            }
            System.out.println();
        }
        // lower side
        for (int i = rows; i >= 1; i--) {
            if (i == 1) {
                for (int j = 1; j <= rows; j++) {
                    System.out.print("*" + " ");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    if (i == 1 || j == 1 || j == i) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print(" " + " ");
                    }
                }
            }
            // space
            if (i != 1) {
                for (int j = 1; j <= 2 * (rows - i); j++) {
                    System.out.print(" " + " ");
                }
            }

            if (i == 1) {
                for (int j = 1; j <= rows; j++) {
                    System.out.print("*" + " ");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    if (i == 1 || j == 1 || j == i) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print(" " + " ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 14th pattern (hollow rhombus)
        /*
              * * * * *
             *       *
            *       *
           *       *
          * * * * *
         */
        System.out.println("hollow rhombus");
        System.out.println();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || j == 1 || j == cols || i == rows) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 15th pattern (Pascal’s Triangle)
        /*
              1
             1 1
            1 2 1
           1 3 3 1
          1 4 6 4 1
         */
        System.out.println("Pascal’s Triangle");
        System.out.println();
        System.out.println();
        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 16th pattern (half Pyramid)
        /*
              1
             1 2
            1 2 3
           1 2 3 4
          1 2 3 4 5
         */
        System.out.println("half Pyramid");
        System.out.println();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // ===================================================================================

        // 17th pattern (Inverted Half Pyramid.)
        /*
          1 1 1 1 1
            2 2 2
             3 3
              4
         */
        System.out.println("Inverted Half Pyramid");
        System.out.println();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            if (i == 1) {
                for (int j = rows + 1; j >= i; j--) {
                    System.out.print(i + " ");
                }
            } else {
                for (int j = rows; j >= i; j--) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
