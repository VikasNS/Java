class Game
{
    String team_name;
    Game(String team_name)
    {
        this.team_name=team_name;
    }
}

class IndoorGame extends Game
{
    String game_name;
    IndoorGame(String team_name,String game_name)
    {
        super(team_name);
        this.game_name=game_name;
    }
}

public class Main
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	    
    	String team_name;
        String game_name;
        
	    System.out.println("Enter the Team name");
    	team_name=sc.next();
    	    
        System.out.println("Enter the Game name");
    	game_name=sc.next();
    	    
    	
    	Game game;
    	IndoorGame indoor_game=new IndoorGame(team_name,game_name);
    	game=indoor_game;
    	System.out.println("I think this question is wrong,We cant access child variable from parent reference,it will give an error");
    	//System.out.println(game.game_name);
    	
    	
	    
	    }
}
