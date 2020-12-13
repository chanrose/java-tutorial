package oldPack;

public class NQueens {



    int t[] = new int[4]; //declaration of array under name t[] for the placement of 'q';

//Arrays.fill(t[],-1);



    int sol = 1; //setting the var to print number at the end of program when solution is found



    public static void main(String[] args) {

        NQueens nq = new NQueens();

        nq.queens(0);

    }



    void printsol(){ //function to print the chessboard and chesspiece

        int i,j;

        char crossboard[][] = new char[4][4]; //declaration of array to print the chessboard.



        for(i=0;i<4;i++){

            for(j=0;j<4;j++){

                crossboard[i][j]='0'; //var i and j is set with char ''.

            }

        }



        for(i=0;i<4;i++){

            crossboard[i][t[i]]='Q'; //char 'q' is set to print at var i in array t[].

        }



        for(i=0;i<4;i++){

            for(j=0;j<4;j++)

            {

                System.out.print(crossboard[i][j]+" "); //print the space with char '_' set in previous loop. i col, j row.

            }

            System.out.println(" "); //print each row in next line after col filled up.

        }

    }

    boolean empty(int i) //to ensure recursion should continue or backtrack

    {

        int j=0;

        while ((t[i]!=t[j]) && (Math.abs(t[i]-t[j]) != (i-j))&&j<4)j++;

        //to ensure the queen does not meet in vertical, diagonal, and horizontal,

        //if all three condition is met within while lopp, then proceed to next row until j less than 4.

        return ((i==j)?true:false); //if true, continue recursion, if false, backtrack

    }



    void queens(int i) //printing and ensuring the amount of queen has reached limit.

    {

        for(t[i] = 0;t[i]<4;t[i]++) //looping the queen to print in each column increment by 1 per loop until less than 4.

        {

            if(empty(i))

            {

                if(i==3){ //to check if Queen already filled to limit

                    printsol(); //if already limit, then print the solution

                    System.out.print("\n solution "+sol++ +"\n"); //print the solution and increase by 1 for the next sol

                }

                else

                    queens(i+1); //if limit not reached, then continue to run queens() function with increase by 1

            }

        }

    }

}