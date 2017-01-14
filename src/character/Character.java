package character;

import java.util.Scanner;

public class Character {

    Scanner entry = new Scanner(System.in);
   
    public String firstname;
    public String lastname;
    public int age;
    public int gender;
    public int level;
    public int experience;
    public int money;
    public int mood;
    public int days;
    public int hours;
    public int bore;
    public int clean;
    public int interact;
    public int hungry;
    public int stamina;

    public Character() {
        this.stamina = 100;
        this.money = 1000;
        this.hours = 0;
        this.clean = 100;
        this.interact = 0;
        this.hungry = 0;
        this.level = 1;
        this.experience = 0;
        this.days = 1;
        this.mood = 100;
        this.bore = 100;

    }

    public void getCharacter(String firstname, String lastname, int age, int gender, int level, int experience, int money, int mood, int days, int hours, int bore, int clean, int interact, int hungry, int stamina) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.level = level;
        this.experience = experience;
        this.money = money;
        this.mood = mood;
        this.days = days;
        this.hours = hours;
        this.bore = bore;
        this.clean = clean;
        this.interact = interact;
        this.hungry = hungry;
        this.stamina = stamina;
    }

    public int upMoney(int m) {

        money = money + m;
        
        if (money<=0) {
            money = 0;
        }
        return money;
    }

    public int upStamina(int s) {
        stamina = stamina + s;
        if (stamina <= 0) {
            stamina = 0 ;
        }
        return stamina;
    }

    public int upLevel() {

        if (experience <= 100) {
            level = 1;
        } else if (experience > 100 && experience <= 250) {
            level = 2;
        } else if (experience > 250 && experience <= 500) {
            level = 3;
        } else if (experience > 500 && experience <= 800) {
            level = 4;
        } else if (experience > 800 && experience <= 1150) {
            level = 5;
        } else if (experience > 1150 && experience <= 1500) {
            level = 6;
        }

        return level;
    }

    public int upExperience(int e) {
        experience = experience + e;
        return experience;
    }

    public int upMood(int m) {
        mood = mood + m;
        if (mood == 100) {
            System.out.println("\t\t\t\t   Mood         : Best");
        } else if (mood <= 100 && mood > 80) {
            System.out.println("\t\t\t\t   Mood         : Great");
        } else if (mood <= 80 && mood > 50) {
            System.out.println("\t\t\t\t   Mood         : Good");
        } else if (mood <= 50 && mood > 20) {
            System.out.println("\t\t\t\t   Mood         : Bad");
        } else if (mood <= 20) {
            System.out.println("\t\t\t\t   Mood         : Worst");
        }
        return mood;
    }

    public int upDays() {
        days = hours / 15;
        if (days == 0) {
            days = 1;
        }
        return days;
    }

    public int upHours(int h) {
        hours = hours + h;
        return hours;
    }

    public int upBore(int b) {
        bore = bore + b;
        if (bore <= 0) {
            bore=0;
        }
        return bore;
    }

    public int upClean(int c) {
        clean = clean + c;
        if (clean <= 0) {
            clean = 0;
        } else if (clean >= 100) {
            clean = 100;
        }
        return clean;
    }

    public int upInteract(int i) {
        interact = interact + i;
        return interact;
    }

    public int upHungry(int hu) {

        hungry = hungry + hu;
        if (hungry <= 0) {
            hungry = 0;
        } else if (hungry >= 100) {
            hungry = 100;
        }
        return hungry;
    }

    public int downMoney(int m) {
        money = money - m;
        if (money<=0) {
            money = 0;
        }
        return money;
    }

    public int downMood(int m) {
        mood = mood - m;
        if (mood == 100) {
            System.out.println("\t\t\t\t   Mood         : Best");
        } else if (mood <= 100 && mood > 80) {
            System.out.println("\t\t\t\t   Mood         : Great");
        } else if (mood <= 80 && mood > 50) {
            System.out.println("\t\t\t\t   Mood         : Good");
        } else if (mood <= 50 && mood > 20) {
            System.out.println("\t\t\t\t   Mood         : Bad");
        } else if (mood <= 20) {
            System.out.println("\t\t\t\t   Mood         : Worst");
        }
        return mood;
    }

    public int downBore(int b) {
        bore = bore - b;
        if (bore <=0) bore=0;
        return bore;
    }

    public int downClean(int c) {
        clean = clean - c;
        if (clean <= 0) clean=0;
        return clean;
    }

    public int downHungry(int h) {
        hungry = hungry - h;
        if (hungry <= 0) hungry=0;
        return hungry;
    }

    public int downStamina(int s) {
        stamina = stamina - s;
        if (stamina <= 0 ) stamina=0;
        return stamina;
    }

    public void getStatus() {

        //Pembatas
        System.out.print("\n" + RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");
        RpgUtil.delay(300);
        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");
        RpgUtil.delay(300);
        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");
        RpgUtil.delay(300);
        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");
        RpgUtil.delay(300);
        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");
        RpgUtil.delay(300);
        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");
        RpgUtil.delay(300);
        System.out.println(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");
        System.out.println(RpgUtil.ANSI_BLACK);

        System.out.println("\n\t\t\t\t   Hi " + firstname + " " + lastname+ "!");
        System.out.println("\t\t\t\t   Your Status : \n");
        System.out.println("\t\t\t\t   Level " + level);
        System.out.println("\t\t\t\t   Days  " + upDays());
        System.out.println("\t\t\t\t   Experience   : " + upExperience(0));
        System.out.println("\t\t\t\t   Name         : " + firstname + " " + lastname);
        System.out.println("\t\t\t\t   Age          : " + age);
        System.out.println("\t\t\t\t   Money        : " + upMoney(0));
        System.out.println("\t\t\t\t   Stamina      : " + upStamina(0));
        System.out.println("\t\t\t\t   Hungry Point : " + upHungry(0));
        System.out.println("\t\t\t\t   Clean Point  : " + upClean(0));
        System.out.println("\t\t\t\t   Bore Level   : " + upBore(0));
        System.out.println("\t\t\t\t   Mood         : " + upMood(0));
        System.out.println("\t\t\t\t   Clean Point  : " + upClean(0));
        System.out.println("\t\t\t\t   Interact Point: " + upInteract(0));
        System.out.println("\n");

    }

    public void newChar() {
        System.out.println("");
        System.out.print("\t\t\t\t   Character First Name : ");
        firstname = entry.nextLine();
        System.out.print("\t\t\t\t   Character Last Name : ");
        lastname = entry.nextLine();
        // age
        System.out.print("\n\t\t\t\t   Character Age  : ");
        age = entry.nextInt();

        // gender
        System.out.println("\n\t\t\t\t   Gender (1. Male/ 2. Female) ");
        System.out.print("\t\t\t\t   Your Gender Choice : ");

        gender = entry.nextInt();
        if (gender == 1) {
            System.out.println("\t\t\t\t   Your Gender : Male");
        }
        if (gender == 2) {
            System.out.println("\t\t\t\t\t   Your Gender :Female");
        }

        // done
        System.out.println("\n\t\t\t\t   Done? (1. Yes / 2. No)");
        System.out.print("\t\t\t\t   Your Choice  :");

        int done = entry.nextInt();
        if (done == 1) {

            System.out.print("\t\t\t\t   Creating Character");
            RpgUtil.delay(1000);
            System.out.print(".");
            RpgUtil.delay(1000);
            System.out.print(".");
            RpgUtil.delay(1000);
            System.out.print(".");
            RpgUtil.delay(1000);
            System.out.println(".");
            System.out.println("\t\t\t\t   Done!\n");
            System.out.println("\n\t\t\t\t   New Character Built!\n");
            //Pembatas

            System.out.print("\".'.'.\" .\" '.\".");
            RpgUtil.delay(300);
            System.out.print("\".'.'.\" .\" '.\".");
            RpgUtil.delay(300);
            System.out.print("\".'.'.\" .\" '.\".");
            RpgUtil.delay(300);
            System.out.print("\".'.'.\" .\" '.\".");
            RpgUtil.delay(300);
            System.out.print("\".'.'.\" .\" '.\".");
            RpgUtil.delay(300);
            System.out.print("\".'.'.\" .\" '.\".");
            RpgUtil.delay(300);
            System.out.println("\".'.'.\" .\" '.\".");

        }
        System.out.println("\n\t\t\t\t   New Character : " + firstname + " " + lastname);
        // level

        System.out.println("\t\t\t\t   Level " + level);

        // days
        System.out.println("\t\t\t\t   Day " + days);

        // experience
        System.out.println("\t\t\t\t   Experience     : " + experience);

        //Stamina
        System.out.println("\t\t\t\t   Stamina        : ( " + stamina + " / 100) ");

        // mood
        if (mood == 100) {
            System.out.println("\t\t\t\t   Mood           : Best");
        } else if (mood <= 100 && mood > 80) {
            System.out.println("\t\t\t\t   Mood           : Great");
        } else if (mood <= 80 && mood > 50) {
            System.out.println("\t\t\t\t   Mood           : Good");
        } else if (mood <= 50 && mood > 20) {
            System.out.println("\t\t\t\t   Mood           : Bad");
        } else if (mood <= 20) {
            System.out.println("\t\t\t\t   Mood           : Worst");
        }

        // bore
        if (bore == 100) {
            System.out.println("\t\t\t\t   Bore Level     : High");
        } else if (bore <= 100 && bore > 80) {
            System.out.println("\t\t\t\t   Bore Level     : Middle");
        } else if (bore <= 80 && bore > 50) {
            System.out.println("\t\t\t\t   Bore Level     : Middle");
        } else if (bore <= 50 && bore > 20) {
            System.out.println("\t\t\t\t   Bore Level     : Low");
        } else if (bore <= 20) {
            System.out.println("\t\t\t\t   Bore Level     : Low");
        }

        // money
        System.out.println("\t\t\t\t   Money          : $ " + money + "");

        System.out.println("\t\t\t\t   Clean Point    : " + clean);
        System.out.println("\t\t\t\t   Interact Point : " + interact);
        System.out.println("\t\t\t\t   Hungry point   : " + hungry + "\n\n");

        getCharacter(firstname,lastname, age, gender, level, experience, money, mood, days, hours, bore, clean, interact, hungry, stamina);

    }

}
