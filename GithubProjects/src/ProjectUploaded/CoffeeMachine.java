package ProjectUploaded;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		 
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        
        int origWater = 200;
		int origMilk = 50;
		int origBean = 15;
    
    
        
        
        System.out.println( "Starting to make a coffee" );
        System.out.println( "Grinding coffee beans" );
        System.out.println( "Boiling water" );
        System.out.println( "Mixing boiled water with crushed coffee beans" );
        System.out.println( "Pouring coffee into the cup" );
        System.out.println( "Pouring some milk into the cup" );
        System.out.println( "Coffee is ready!" );
        
        
       
        
       // System.out.println("Write how many cups of coffee you will need: ");
       // int value = scanner.nextInt();
        
        //System.out.println("for " + value + "cups of coffee you will need:");
        
       // System.out.println(value * origWater + " ml of water");
        //System.out.println(value * origMilk + " ml of milk");
        //System.out.println(value * origBean + " g of coffee beans");
        
        
	    System.out.println("Write how many ml of water the coffee machine has:");
        int waters = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milks = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beanss = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int n = scanner.nextInt();

        waters /= 200;
        milks /= 50;
        beanss /= 15;

        int min = Math.min(waters, milks);
        min = Math.min(beanss, min);

        if (n == min) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (n < min) {
            System.out.println("Yes, I can make that amount of coffee (and even " +
                    (min - n) + " more than that)");
        } else {
            System.out.println("No, I can make only " + min + " cup(s) of coffee");
        }
		
		/*System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println();*/
      while(true) {  
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String option=scanner.nextLine();
        switch (option) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String buyOption = scanner.next();

                    switch (buyOption) {
                        case "1":
                            if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (beans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 250;
                            beans -= 16;
                            cups--;
                            money += 4;
                            break;
                        case "2":
                            if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (beans < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 350;
                            milk -= 75;
                            beans -= 20;
                            cups--;
                            money += 7;
                            break;
                        case "3":
                            if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (beans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 200;
                            milk -= 100;
                            beans -= 12;
                            cups--;
                            money += 6;
                            break;
                        case "back":
                            break;
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cups += scanner.nextInt();
                    break;

                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;

                case "remaining":
                    state(water, milk, beans, cups, money);
                    break;
                case "exit":
                    return;
            }
        }
    }

    private static void state(int water, int milk, int beans, int cups, int money) {
        System.out.println("At the moment, the coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of beans\n" +
                cups + " of disposable cups\n" +
                money + " of money\n");

	}

}
