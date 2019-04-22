import java.util.Scanner;



public class FinalProj{

	public static void main(String[] args){
		List<String> keys = new ArrayList<>();
		Queue<String> vault = new ArrayQueue<>();
		Queue<String> answer = new ArrayQueue<>();
		answer.add("red");
		answer.add("orange");
		answer.add("yellow");
		answer.add("green");
		answer.add("blue");
		answer.add("purple");
		answer.add("white");
	
		
		String place;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Your objective is to find all 7 keys hidden throughout the map");
		System.out.println("You are in front of the gate There is a path to the mansion entrance.");
		System.out.println("Options: mansion entrance");
		place = input.nextLine();
		if(place.equals("mansion entrance")){
			System.out.println("You are at the mansion entrance. You found a purple key on the door. There is a path to the mansion foyer.");
			keys.add("purple");
			System.out.println("Options: foyer");
			place = input.nextLine();
			if(place.equals("foyer")){
				System.out.println("You are at the foyer. There is a door to the basement, upstairs, kitchen, and living room. The dining room is the only room unlocked");
				System.out.println("Options: foyer");
				place = input.nextLine();
				if(place.equals("basement")){
					System.out.println("You are in the basement. There is a door to the furnace room.");
					System.out.println("furnace room?");
					place = input.nextLine();
					if(place.equals("furnace room")){
						System.out.println("You are at the furnace room. You found a red key on the floor. You've reached a dead end move back to the foyer?");
						keys.add("red");
						place = input.nextLine();
						if(place.equals("foyer")){
							System.out.println("You are at the foyer. There is a door to the basement, upstairs, kitchen, and living room. The upstairs is now unlocked");
							System.out.println("upstairs?");
							place = input.nextLine();
							if(place.equals("upstairs")){
								System.out.println("You are in upstairs. There are doors to the bathroom and bedroom. The bedroom is locked");
								System.out.println("bathroom?");
								place = input.nextLine();
								if(place.equals("bathroom")){
									System.out.println("You are in bathroom. You found a green key on the sink. There is a door back to the upstairs");
									keys.add("green");
									System.out.println("upstairs?");
									place = input.nextLine();
									if(place.equals("upstairs")){
										System.out.println("You are in upstairs. There are doors to the bathroom and bedroom. The bedroom door is now unlocked");
										System.out.println("Options: bedroom");
										place = input.nextLine();
										if(place.equals("bedroom")){
											System.out.println("You are in bedroom. You found a white key on the bed. You've reached a dead end move back to the foyer?");
											keys.add("white");
											place = input.nextLine();
											if(place.equals("foyer")){
												System.out.println("You are at the foyer. There is a door to the basement, upstairs, kitchen, and living room. The living room door is now unlocked");
												System.out.println("living room?");
												place = input.nextLine();
												if(place.equals("living room")){
													System.out.println("Going into the living room you see a modest setup of couches and a coffee table in the center. Looking around, you see two doors. One that leads to a theater room and the other that leads to what appears to be an art gallery. The door to the foyer locks behind you ");
													System.out.println ("theater or gallery?");
													place=input.nextLine();
													if(place.equals("theater")){		//theater path
														System.out.println ("You enter the theater room and you see three rows of recliners. All of which face a large projector screen where films are played. In the corner is a popcorn machine and looking at the popcorn machine you can see a blue key hanging off the handle. You walk over and grab the key");
														keys.add("blue");
														System.out.println ("The room is a dead end so you head back to the living room.");
														System.out.println("Going into the living room you see a modest setup of couches and a coffee table in the center. Looking around, you see two doors. One that leads to a theater room and the other that leads to what appears to be an art gallery. Having already been in the theater you can head to gallery.");
														System.out.println ("gallery?");
														place=input.nextLine();
														if(place.equals("gallery")){
															System.out.println ("This room is a room full of elegant statues and paintings from various eras. On one pedestal near the center, you notice a yellow key and decide to pick it up.");
															keys.add("yellow");
															System.out.println ("You've reached a dead end so you head back to the foyer.");
															System.out.println("You are at the foyer. There is a door to the basement, upstairs, kitchen, and living room. The kitchen door is now unlocked");
															System.out.println ("kitchen?");
															place=input.nextLine();
															if(place.equals("kitchen")){
																System.out.println("Going into the kitchen, you see large refrigerator, oven, grill, freezer with a large island in the center. On the island there are a couple pieces of leftover meat from an abandoned meal along with some chopped vegtables. You see a door that leads to the dining room.");
																System.out.println ("Go to dining room?");
																place=input.nextLine();
																if(place.equals("dining room")){
																	System.out.println ("You enter the dining room and in the center you see an orange key on a silver platter. You grab the key");
																	keys.add("orange");
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
																	for(i = 0; i <= 6; i++){		//some values are returning null
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
																		}
																	}
																}
															}
														}
													}
													else if(place.equals("gallery")){		//gallery path
															System.out.println ("This room is a room full of elegant statues and paintings from various eras. On one pedestal near the center, you notice a yellow key and decide to pick it up.");
															keys.add("yellow");
															System.out.println ("The room is a dead end so you head back to the living room.");
															System.out.println("Going into the living room you see a modest setup of couches and a coffee table in the center. Looking around, you see two doors. One that leads to a theater room and the other that leads to what appears to be an art gallery. Having already been in the gallery you head to the theater");
															place=input.nextLine();
															if(place.equals("theater")){
																System.out.println ("You enter the theater room and you see three rows of recliners. All of which face a large projector screen where films are played. In the corner is a popcorn machine and looking at the popcorn machine you can see a blue key hanging off the handle. You walk over and grab the key");
																keys.add("blue");
																System.out.println ("The room is a dead end so you head back to the living room.");
																System.out.println("reaching a dead end you head back to the foyer.");
																System.out.println("You are at the foyer. There is a door to the basement, upstairs, kitchen, and living room. The kitchen door is now unlocked");
																System.out.println ("kitchen?");
																place=input.nextLine();
																if(place.equals("kitchen")){
																	System.out.println("Going into the kitchen, you see large refrigerator, oven, grill, freezer with a large island in the center. On the island there are a couple pieces of leftover meat from an abandoned meal along with some chopped vegtables. You see a door that leads to the dining room.");
																	System.out.println ("Go to dining room?");
																	place=input.nextLine();
																		if(place.equals("dining room")){
																			System.out.println ("You enter the dining room and in the center you see an orange key on a silver platter. You grab the key");
																			keys.add("orange");
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
																	for(i = 0; i <= 6; i++){		//some values are returning null
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
																		}
																	}
																		}
																}
															}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}	
	
	
}
		
		
		
		
		
		

		
		
		
