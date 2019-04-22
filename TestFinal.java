import java.util.Scanner;



public class Test{
	
	public static List<String> keys = new ArrayList<>();

	public static void main(String[] args){
		Queue<String> vault = new ArrayQueue<>();
		Queue<String> answer = new ArrayQueue<>();
		answer.add("red");
		answer.add("orange");
		answer.add("yellow");
		answer.add("green");
		answer.add("blue");
		answer.add("purple");
		answer.add("white");
		boolean hasRedkey = false;
		boolean hasOrangekey = false;
		boolean has
		
	
		
		String place;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Your objective is to find all 7 keys hidden throughout the map");
		//ask if want to load?
		System.out.println("You are in front of the gate There is a path to the mansion entrance.");
		System.out.println("mansion entrance?");
		place = input.nextLine();
		if(place.equals("mansion entrance")){
			System.out.println("You are at the mansion entrance. You found a purple key on the door. There is a path to the mansion foyer.");
			keys.add("purple");
			//you picked up key would you like to save?
			//save
			System.out.println("foyer?");
			while(!place.equals("foyer");
			{
				place = input.nextLine();
				if(place.equals("foyer")){
					foyer(place);
				}
				else{
					"invalid place"			
				}
			}
		}
			
			
			
			
			
			
	public static void foyer(String place){
		System.out.println("You are at the foyer. There is a door to the basement, upstairs, kitchen, and living room.");	
		while(!place.equals("basement") || !place.equals("upstairs") || !place.equals("kitchen") || !place.equals("living room")){ 
			place = input.nextLine();
			switch(place)
			{
				case "basement" : place = " ";
				basement();
				break;
				case "upstairs" : place = " ";
				upstairs();
				break;
				case "living room" : place = " ";
				livingRoom();
				break;
				case "kitchen" : place = " ";
				kitchen();
				break;
				default : "invalid";
			}
		}			
	}
	
	
	public static void basement(){
		System.out.println("You are in the basement. There is a door to the furnace room.");
		System.out.println("furnace room?");
		while(!place.equals("furnace room"){
			place = input.nextLine();
			if(place.equals("furnace room")){
				System.out.println("You are at the furnace room. You found a red key on the floor. You've reached a dead end");
				System.out.println("You head back to the foyer");
				if(hasRedKey == false){
					keys.add("red");
					hasRedKey = true;
				}
				foyer();
			}
			else{
				System.out.println("invalid");
			}
		}						
	}
	
	public static void upstairs(String place){
		System.out.println("You are in upstairs. There are doors to the bathroom and bedroom.");
		System.out.println("bathroom or bedroom?");
		while(!place.equals("bathroom") || !place.equals("bedroom"){
			place = input.nextLine();
			if(place.equals("bathroom")){
				System.out.println("You are in bathroom. You found a green key on the sink. There is a door back to the upstairs");
				if(hasGreen == false){
					keys.add("green");
					hasGreen = true;
				}
				else{
					System.out.println("You already have the green key");
				}
				System.out.println("upstairs?");
				place = input.nextLine();
				if(place.equals("upstairs")){
					System.out.println("You are in upstairs. There are doors to the bathroom and bedroom. The bedroom door is now unlocked");
					System.out.println("bathroom or bedroom?");
					place = input.nextLine();
					if(place.equals("bedroom")){
						System.out.println("You are in bedroom. You found a white key on the bed. You've reached a dead end.");
						System.out.println("You head back to the foyer");
						if(hasWhite == false){
							keys.add("white");
							hasWhite = true;
						}
						else{
							System.out.println("you already have the white key");
						}
						foyer(place);
					}
				}
			}
			else if(place.equals"bedroom"){
				System.out.println("You are in bedroom. You found a white key on the bed.");
				if(hasWhite == false){
					keys.add("white");
					hasWhite = true;
				}
				else{
					System.out.println("you already have the white key");
				}
				System.out.println("back to upstairs?");
				place = input.nextLine();
				if(place.equals("upstairs")){
					System.out.println("You are in upstairs. There are doors to the bathroom and bedroom.");
					System.out.println("bathroom or bedroom?");
					if(place.equals("bathroom")){
						System.out.println("You are in bathroom. You found a green key on the sink. You've reached a dead end.");
						System.out.println("You head back to the foyer");
						if(hasGreen == fasle){
							keys.add("green");
							hasGreen = true;
						}
						else{
							System.out.println("You already have the green key");
						}
						foyer(place);
					}
				}
			}
			else{
				System.out.println("invalid");
			}
		}
	}		
	public static void livingRoom(){
		
	}
	
	public static void kitchen(){
		
	}
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			