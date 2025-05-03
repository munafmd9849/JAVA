import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Umpire u=new Umpire();
	    u.guess();
	    u.predict();
	    u.declare();
		
	}
}
class Guesser{
    int guessing(){
        System.out.println("guess a number 0-9");
        Scanner scan= new Scanner(System.in);
        return scan.nextInt();
    }
    
}
class Player{
    int predicting(){
        System.out.println("predict a number 0-9");
        Scanner scan= new Scanner(System.in);
        return scan.nextInt();
    }
}

class Umpire{
    int gusserNum;
    int player1Num;
    int player2Num;
    int player3Num;
    void guess(){
        Guesser g=new Guesser();
        gusserNum=g.guessing();
    }
    void predict(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        player1Num=p1.predicting();
        player2Num=p2.predicting();
        player3Num=p3.predicting();
    }
    void declare(){
        if(gusserNum==player1Num){
            System.out.println("player1 won");
        }
        else if(gusserNum==player2Num){
            System.out.println("player2 won");
        }
        else if(gusserNum==player3Num){
            System.out.println("player3 won");
        }
        else{
            System.out.println("game lost");
        }
    }
}





