import java.util.Scanner;




public class FinalProjFinal{
	
	public static List<String> keys = new PersistantArrayList<>();
      static Scanner input = new Scanner(System.in);
      public static boolean hasRed = false;
      public static  boolean hasOrange = false;
      public static boolean hasYellow = false;
      public static boolean hasGreen = false;
      public static boolean hasBlue = false;
      public static boolean hasPurple = false;
      public static boolean hasWhite = false;
      
      
	public static void main(String[] args){
		String place = " ";     //where you start
		
		Scanner input = new Scanner(System.in);
      System.out.println("Your objective is to find all 7 keys hidden throughout the map");
		System.out.println("You are in front of the gate There is a path to the mansion entrance.");
		System.out.println("Options: mansion entrance");
      while(!place.equals("mansion entrance")){
            place = input.nextLine();
   		if(place.equals("mansion entrance")){
   			System.out.println("You are at the mansion entrance. You found a purple key on the door. There is a path to the mansion foyer.");
   			keys.add("purple");
            hasPurple = true;
             System.out.println("Options: foyer");
              while(!place.equals("foyer")){
                  place = input.nextLine();
         			if(place.equals("foyer")){
         		      foyer(place);
                  }else{
                     System.out.println("Invalid command, try again.");
                  }
              }
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
               if(keys.size()==7){
                  vault();
                  }
				}     //end of red key check
				else if(hasRed == true){
					System.out.println("You remember you already grabbed the key so you head back to the foyer.");
				} 
				foyer(place);    //return to foyer
			}
			else{
				System.out.println("Invalid command, try again.");
			}  //end of else
		}  //end of furnace room test						
	
    }    //end of basement
           
        
	public static void upstairs(String place){
		System.out.println("You are in upstairs. There are doors to the bathroom and bedroom.");
		System.out.println("bathroom or bedroom?");
		while(!place.equals("bathroom") || !place.equals("bedroom")){
			place = input.nextLine();
			if(place.equals("bathroom")){
				System.out.println("You are in bathroom. You found a green key on the sink. There is a door back to the upstairs");
				if(hasGreen == false){
					keys.add("green");
					hasGreen = true;
               if(keys.size()==7){
                  vault();
                  }               
				}
				else{
					System.out.println("You already have the green key");
				}
				System.out.println("upstairs?");
            while(!place.equals("upstairs")){
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
                              if(keys.size()==7){
                                 vault();
                                 }                     
      						}
      						else{
      							System.out.println("you already have the white key");
      						}
      						foyer(place);
      					}
      				}
                  else{
                  System.out.println("Invalid command, try again.");
                  }
			}
       }
         
			else if(place.equals("bedroom")){
				System.out.println("You are in bedroom. You found a white key on the bed.");
				if(hasWhite == false){
					keys.add("white");
					hasWhite = true;
                  if(keys.size()==7){
                     vault();
                     }               
				}
				else{
					System.out.println("you already have the white key");
				}
				System.out.println("back to upstairs?");
                  while(!place.equals("upstairs")){
      				place = input.nextLine();
      				if(place.equals("upstairs")){
      					System.out.println("You are in upstairs. There are doors to the bathroom and bedroom.");
      					System.out.println("bathroom or bedroom?");
      					if(place.equals("bathroom")){
      						System.out.println("You are in bathroom. You found a green key on the sink. You've reached a dead end.");
      						System.out.println("You head back to the foyer");
      						if(hasGreen == false){
      							keys.add("green");
      							hasGreen = true;
                            if(keys.size()==7){
                              vault();
                              }      
      						}
      						else{
      							System.out.println("You already have the green key");
      						}
      						foyer(place);
      					}
      				}
                  else{
                     System.out.println("Invalid command, try again.");
                  }
      			}
		   }
            else{
				   System.out.println("Invalid command, try again.");
			   }
	      }
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
                        if(keys.size()==7){
                           vault();
                           }                     
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
                        if(keys.size()==7){
                           vault();
                           }
      				}     //end of yellow key check
      				else if(hasYellow == true){
      					System.out.println("You remember you already grabbed the key so you head back to the foyer.");
      				} // end of yellow check       
                        				foyer(place);    //return to foyer
               }  else{
                    System.out.println("Invalid command, try again.");
                  }  //end of gallery in theater

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
                    if(keys.size()==7){
                        vault();
                        }
   				}     //end of blue key check
   				else if(hasBlue == true){
   					System.out.println("You remember you already grabbed the key so you head back to the living room.");
   				}  //if have blue
      				foyer(place);    //return to foyer
         }     //end of gallery

         
		}  //end of gallery room test	
         else{
				System.out.println("Invalid command, try again.");
			}  //end of else	
      
      }  //end of while loop
  }
  
  
   public static void kitchen(String place){
		System.out.println("Going into the kitchen, you see large refrigerator, oven, grill, freezer with a large island in the center and a door to the dining room.");
		System.out.println("dining room?");
		while(!place.equals("dining room")){
			place = input.nextLine();
			if(place.equals("dining room")){
				System.out.println ("You enter the dining room and in the center you see an orange key on a silver platter. You grab the key");
            System.out.println("You head back to the foyer");
				if(hasOrange == false){
					keys.add("orange");
					hasOrange = true;
                if(keys.size()==7){
                  vault();
                  }
				}     //end of red key check
				else if(hasOrange == true){
					System.out.println("You remember you already grabbed the key so you head back to the foyer.");
				} 
				foyer(place);    //return to foyer
			}
			else{
				System.out.println("Invalid command, try again.");
			}  //end of else
		}  //end of kitchen room test		
   }
   
   
   public static void vault(){
      Queue<String> vault = new ArrayQueue<>();
		Queue<String> answer = new ArrayQueue<>();
	
		answer.add("red");
		answer.add("orange");
		answer.add("yellow");
		answer.add("green");
		answer.add("blue");
		answer.add("purple");
		answer.add("white");
      
      System.out.println ("You head to vault.");
		System.out.println("You find a door with empty colored keyholes.");
		System.out.println("[0]Red [1]Orange [2]Yellow [3]Green [4]Blue [5]Purple [6]White");
		System.out.println("Your inventory:");
		int i = 0;
		for (String s : keys) {
				System.out.print("[" + i + "]" + s + " ");
						i++;
			}
		System.out.println("What key index would you like to put in the first slot of the door?");
   	i = input.nextInt();
     	vault.add(keys.get(i));
			for(int j = 0; j < 6; j++){
				System.out.println("What key index would you like to put in the next slot of the door?");
				i = input.nextInt();
				vault.add(keys.get(i));
			}
         
	   Object[] arr = vault.toArray();
		Object[] ans = answer.toArray();
		
      for(i = 0; i <= 6; i++){		
			System.out.println(arr[i] + " " + ans[i]);
		}
      
	   for(i = 0; i < 7; i++){
			if(arr[i] == ans[i]){
				if(i == 6){
					System.out.println("You win");
							break;
				}
				else{
					continue;
			   }
			}
			else{
			   System.out.println("wrong answer you fail game over");
            break;
			}
		}
      
      System.exit(0);
   }
   
}