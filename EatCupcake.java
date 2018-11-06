import java.util.Scanner;

public class EatCupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Did anyone see you?");
        String seen = sc.next().toUpperCase();
        if(seen.equals("YES.")){
            System.out.println("Was it a boss/lover/parent?");
            String who = sc.next().toUpperCase();

            if(who.equals("YES.")){
                System.out.println("Was it expensive?");
                String value = sc.next().toUpperCase();
                if (value.equals("YES.")){
                    System.out.println("Can you cut off the part that touched the floor?");
                    String can = sc.next().toUpperCase();
                    if(value.equals("YES.")){
                        System.out.println("EAT IT.");
                    }
                }else if(value.equals("NO.")){
                    System.out.println("Is it chocolate?");
                    String choc = sc.next().toUpperCase();
                    if(choc.equals("YES.")){
                        System.out.println("EAT IT");
                    }
                    else if(choc.equals("NO.")){
                        System.out.println("DON’T EAT IT");
                    }
                }

            }if(who.equals("NO.")){
                System.out.println("EAT IT");


            }

        }else if (seen.equals("NO.")) {
            System.out.println("Was it sticky?");
            String sticky = sc.next().toUpperCase();
            if (sticky.equals("NO.")) {
                System.out.println("Is it an Emausaurus?");
                String isIt = sc.next().toUpperCase();
                if(isIt.equals("NO.")){
                    System.out.println("Did the cat lick it?");
                    String lick = sc.next().toUpperCase();
                    if(lick.equals("NO.")){
                        System.out.println("EAT IT.");
                    }else if (lick.equals("YES.")){
                        System.out.println("Is your cat healthy?");
                        String health = sc.next().toUpperCase();
                        if (health.equals("YES")){
                            System.out.println("EAT IT.");
                        }else if (health.equals("NO.")){
                            System.out.println("YOUR CALL");
                        }


                    }

                }else if (isIt.equals("YES.")){
                    System.out.println("Are you a Megalosaurus");
                    String mega = sc.next().toUpperCase();
                    if(mega.equals("YES.")){
                        System.out.println("EAT IT.");
                    }else if(mega.equals("NO.")){
                        System.out.println("DON'T EAT IT.");
                    }
                }
            }else if (sticky.equals("YES.")){
                System.out.println("Is it a raw steak?");
                String steak = sc.next().toUpperCase();
                if (steak.equals("YES.")){
                    System.out.println("Are you a puma?");
                    String puma = sc.next().toUpperCase();
                    if(puma.equals("YES.")){
                        System.out.println("EAT IT.");
                    }else if(puma.equals("NO.")){
                        System.out.println("DON'T EAT IT");
                    }
                }else if(sticky.equals("NO.")){
                    System.out.println("Is it a raw steak?");
                    String steak = sc.next().toUpperCase();
                }
            }
        }

    }}