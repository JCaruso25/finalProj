import java.util.Scanner;




public class Test{
	
	public static List<String> keys = new ArrayList<>();
      static Scanner input = new Scanner(System.in);
      public static boolean hasRed = false;
      public static  boolean hasOrange = false;
      public static boolean hasYellow = false;
      public static boolean hasGreen = false;
      public static boolean hasBlue = false;
      public static boolean hasPurple = false;
      public static boolean hasWhite = false;
      
      
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
      

      
		String place = " ";     //where you start
		
		Scanner input = new Scanner(System.in);
      System.out.println("Your objective is to find all 7 keys hidden throughout the map");
		System.out.println("You are in front of the gate There is a path to the mansion entrance.");
		System.out.println("Options: mansion entrance");
      place = input.nextLine();
   		if(place.equals("mansion entrance")){
   			System.out.println("You are at the mansion entrance. You found a purple key on the door. There is a path to the mansion foyer.");
   			keys.add("purple");
            hasPurple = true;
   			System.out.println("Options: foyer");
            place = input.nextLine();
   			if(place.equals("foyer")){
   		      foyer(place);
            }else{
               System.out.println("Invalid command, try again.");
            }
        }
           


		
	}
	
		
	public static void foyer(String place){
		System.out.println("You are at the foyer. There is a door to the basement, upstairs, kitchen, and living room.");	
		while(!place.equals("basement") || !place.equals("upstairs") || !place.equals("kitchen") || !place.equals("living room")){ 
         place = input.nextLine();
			switch(place)
			{
				case "basement" : 
               place = " ";
   				basement(place);
               break;
				case "upstairs" : 
               place = " ";
   				upstairs(place);
               break;
   			case "living room" : 
               place = " ";
   				livingRoom(place);
               break;
   			case "kitchen" : 
               place = " ";
   				kitchen(place);
               break;
            default:
               System.out.println("Invalid Command. Enter again:");
               
			}
		}			
	}
   
   public static void basement(String place){
		System.out.println("You are in the basement. There is a door to the furnace room.");
		System.out.println("furnace room?");
		while(!place.equals("furnace room")){
			place = input.nextLine();
			if(place.equals("furnace room")){
				System.out.println("You are at the furnace room. You found a red key on the floor. You've reached a dead end");
				System.out.println("You head back to the foyer");
				if(hasRed == false){
					keys.add("red");
					hasRed = true;
				}     //end of red key check
				else if(hasRed == true){
					System.out.println("You remember you already grabbed the key so you head back to the foyer.");
				} 
				foyer(place);    //return to foyer
			}
			else{
				System.out.println("invalid");
			}  //end of else
		}  //end of furnace room test						
	
    }    //end of basement
           
        
   public static void upstairs(String place){
   System.out.println("upstairs");
   }
   
   public static void livingRoom(String place){
   
      System.out.println("Going into the living room you see a modest setup of couches and a coffee table in the center. Looking around, you see two doors. One that leads to a theater room and the other that leads to what appears to be an art gallery. The door to the foyer locks behind you ");
			System.out.println ("theater or gallery?");
		while(!place.equals("theater") || !place.equals("gallery")){    //theater or gallery
			place = input.nextLine();
         
           if(place.equals("theater")){      //theater path
      			System.out.println ("You enter the theater room and you see three rows of recliners. All of which face a large projector screen where films are played. In the corner is a popcorn machine and looking at the popcorn machine you can see a blue key hanging off the handle. You walk over and grab the key");	
      			System.out.println ("The room is a dead end so you head back to the living room.");
      				if(hasBlue == false){
      					keys.add("blue");
      					hasBlue = true;
      				}     //end of blue key check
      				else if(hasBlue == true){
      					System.out.println("You remember you already grabbed the key so you head back to the living room.");
      				}  //if have blue
               System.out.println("Going into the living room you see a modest setup of couches and a coffee table in the center. Looking around, you see two doors. One that leads to a theater room and the other that leads to what appears to be an art gallery. The door to the foyer locks behind you ");
      			System.out.println ("theater or gallery?");
               place = input.nextLine();
                if(place.equals("gallery")){    //then to gallery
                  System.out.println ("This room is a room full of elegant statues and paintings from various eras. On one pedestal near the center, you notice a yellow key and decide to pick it up.");
      				System.out.println ("You've reached a dead end so you head back to the living room.");
      				if(hasYellow == false){
      					keys.add("yellow");
      					hasYellow = true;
      				}     //end of yellow key check
      				else if(hasYellow == true){
      					System.out.println("You remember you already grabbed the key so you head back to the foyer.");
      				} // end of yellow check       
               }  else{
                     System.out.println("Wrong input"); 
                  }  //end of gallery in theater
      				foyer(place);    //return to foyer
      	   }//end of theater
         
         
       else if(place.equals("gallery")){
            System.out.println ("This room is a room full of elegant statues and paintings from various eras. On one pedestal near the center, you notice a yellow key and decide to pick it up.");
				System.out.println ("You've reached a dead end so you head back to the living room.");
				if(hasYellow == false){
					keys.add("yellow");
					hasYellow = true;
				}     //end of yellow key check
				else if(hasYellow == true){
					System.out.println("You remember you already grabbed the key so you head back to the foyer.");
				} // end of yellow check  
            
         System.out.println("Going into the living room you see a modest setup of couches and a coffee table in the center. Looking around, you see two doors. One that leads to a theater room and the other that leads to what appears to be an art gallery. The door to the foyer locks behind you ");
			System.out.println ("theater or gallery?");
         place = input.nextLine();
         
         if(place.equals("theater")){
   			System.out.println ("You enter the theater room and you see three rows of recliners. All of which face a large projector screen where films are played. In the corner is a popcorn machine and looking at the popcorn machine you can see a blue key hanging off the handle. You walk over and grab the key");	
   			System.out.println ("The room is a dead end so you head back to the living room.");
   				if(hasBlue == false){
   					keys.add("blue");
   					hasBlue = true;
   				}     //end of blue key check
   				else if(hasBlue == true){
   					System.out.println("You remember you already grabbed the key so you head back to the living room.");
   				}  //if have blue

         }     //end of gallery
         foyer(place);    //return to foyer
         
		}  //end of gallery room test	
         else{
				System.out.println("invalid");
			}  //end of else	
      
      }  //end of while loop
  }
  
  
   public static void kitchen(String place){
		System.out.println("Going into the kitchen, you see large refrigerator, oven, grill, freezer with a large island in the center and a door to the dining room.")
		System.out.println("dining room?");
		while(!place.equals("dining room")){
			place = input.nextLine();
			if(place.equals("dining room")){
				System.out.println ("You enter the dining room and in the center you see an orange key on a silver platter. You grab the key");
            System.out.println("You head back to the foyer");
				if(hasOrange == false){
					keys.add("orange");
					hasOrange = true;
				}     //end of red key check
				else if(hasOrange == true){
					System.out.println("You remember you already grabbed the key so you head back to the foyer.");
				} 
				foyer(place);    //return to foyer
			}
			else{
				System.out.println("invalid");
			}  //end of else
		}  //end of kitchen room test		
   }
		
}