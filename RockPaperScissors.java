import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        int player1Move = 0;
        int player2Move = 0;
        int player1Score = 0;
        int player2Score = 0;


        while(true){
            Scanner sc = new Scanner(System.in);

            System.out.println("Player One: Choose your weapon!");
            player1Move = sc.nextInt();

            if(player1Move == 4 || player2Move == 4){
                if(player1Score == player2Score){
                    System.out.println("Player and Player Two are tied with " + player1Score + " points.");
                }else if(player1Score  > player2Score){
                    System.out.println("The winner is Player One with " + player1Score + " points.");
                }
                else if(player1Score  < player2Score ||player1Score  > player2Score){
                    System.out.println("The winner is Player Two with " + player2Score + " points.");
                }
                System.out.println("Quitting");
                break;
            }
            System.out.println("Good Choice!");
            System.out.println("Player Two: Choose your weapon!");
            player2Move = sc.nextInt();
            System.out.println("Good Choice!");

            if(player1Move == 1){
                System.out.println("Player One chose: rock");
            }else if(player1Move == 2){
                System.out.println("Player One chose: paper");
            }else if(player1Move == 3){
                System.out.println("Player One chose: scissors");
            }else{
                System.out.println("Please input value between 1 and 3");
            }

            if(player2Move == 1){
                System.out.println("Player Two chose: rock");
            }else if(player2Move == 2){
                System.out.println("Player Two chose: paper");
            }else if(player2Move == 3){
                System.out.println("Player Two chose: scissors");
            }else{
                System.out.println("Please input value between 1 and 3");
            }

            if(player1Move == player2Move){
                System.out.println("It's a draw");
                System.out.println("The score is now: " + player1Score + " - " + player2Score);
            }
            else if(player1Move == 1 && player2Move == 2){
                player2Score+=1;
                System.out.println("Player Two Wins!");
                System.out.println("The score is now: " + player1Score + " - " + player2Score);
            }
            else if(player1Move == 2 && player2Move == 1){
                player1Score+=1;
                System.out.println("Player One Wins!");
                System.out.println("The score is now: " + player1Score + " - " + player2Score);
            }
            else if(player1Move == 3 && player2Move == 1){
                player2Score+=1;
                System.out.println("Player Two Wins!");
                System.out.println("The score is now: " + player1Score + " - " + player2Score);
            }
            else if(player1Move == 1 && player2Move == 3){
                player1Score+=1;
                System.out.println("Player One Wins!");
                System.out.println("The score is now: " + player1Score + " - " + player2Score);
            }
            else if(player1Move == 3 && player2Move == 2){
                player1Score+=1;
                System.out.println("Player One Wins!");
                System.out.println("The score is now: " + player1Score + " - " + player2Score);
            }
            else if(player1Move == 2 && player2Move == 3){
                player2Score+=1;
                System.out.println("Player Two Wins!");
                System.out.println("The score is now: " + player1Score + " - " + player2Score);
            }
        }


    }
}
