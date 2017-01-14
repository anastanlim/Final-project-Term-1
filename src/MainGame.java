
import character.Character;
import java.util.Scanner;
import character.RpgUtil;
import java.util.InputMismatchException;
import load.FileUtilV4;

public class MainGame extends Character {

    public static void main(String[] args) {

        boolean successEntry = false;
        boolean characEntry = false;
        boolean menuEntry = false;
        boolean finish = false;
        boolean Waiter = false;
        Character charac = new Character();

        int x = 0;
        while (successEntry == false) {
            try {
                Scanner entry = new Scanner(System.in);
                System.out.println("");
                System.out.println("");
                System.out.println("\t\t\t                 _ _");
                System.out.println("\t\t\t                ( Y )");
                System.out.println("\t\t\t                 \\ /  ");
                System.out.println("\t\t\t                  \\          /^\\");
                System.out.println("\t\t\t                    )       //^\\\\");
                System.out.println("\t\t\t                 (         //   \\\\");
                System.out.println("\t\t\t                   )      //     \\\\");
                System.out.println("\t\t\t                  __     //       \\\\");
                System.out.println("\t\t\t                 |=^|   //    _    \\\\");
                System.out.println("\t\t\t               __|= |__//    (+)    \\\\");
                System.out.println("\t\t\t              /LLLLLLL//      ~      \\\\");
                System.out.println("\t\t\t             /LLLLLLL//               \\\\");
                System.out.println("\t\t\t            /LLLLLLL//                 \\\\");
                System.out.println("\t\t\t           /LLLLLLL//  |~[|]~| |~[|]~|  \\\\");
                System.out.println("\t\t\t           ^| [|] //   | [|] | | [|] |   \\\\");
                System.out.println("\t\t\t            | [|] ^|   |_[|]_| |_[|]_|   |^");
                System.out.println("\t\t\t         ___|______|                     |");
                System.out.println("\t\t\t        /LLLLLLLLLL|_____________________|");
                System.out.println("\t\t\t       /LLLLLLLLLLL/LLLLLLLLLLLLLLLLLLLLLL\\");
                System.out.println("\t\t\t      /LLLLLLLLLLL/LLLLLLLLLLLLLLLLLLLLLLLL\\");
                System.out.println("\t\t\t      ^||^^^^^^^^/LLLLLLLLLLLLLLLLLLLLLLLLLL\\");
                System.out.println("\t\t\t       || |~[|]~|^^||^^^^^^^^^^||^|~[|]~|^||^^");
                System.out.println("\t\t\t       || | [|] |  ||  |~~~~|  || | [|] | ||");
                System.out.println("\t\t\t       || |_[|]_|  ||  | [] |  || |_[|]_| ||");
                System.out.println("\t\t\t       ||__________||  |   o|  ||_________||");
                System.out.println("\t\t\t     .'||][][][][][||  | [] |  ||[][][][][||.'.");
                System.out.println("\t\t\t    .\"'||[][][][][]||_-`----'-_||][][][][]||\".\"");
                System.out.println("\t\t\t  .(')^(.)(').( )'^@/-- -- - --\\@( )'( ).(( )^(.)^");
                System.out.println("\t\t\t '( )^(`)'.(').( )@/-- -- - -- -\\@ (.)'(.),( ).(').");
                System.out.println("\t\t\t \".'.'.\" .\" '.\". @/- - --- -- - -\\@ '.\".'.\".'.\".'.\"");
                RpgUtil.delay(500);
                System.out.println("\t\t\t                @/__1. NEW  GAME__\\@");
                RpgUtil.delay(500);
                System.out.println("\t\t\t               @/___2. LOAD GAME___\\@");
                RpgUtil.delay(500);
                System.out.println("\t\t\t              @/____  3. ABOUT  ____\\@");
                RpgUtil.delay(500);
                System.out.println("\t\t\t             @/_____4. QUIT GAME_____\\@");

                System.out.print("\n\t\t\t\t\t     COMMAND : ");
                x = entry.nextInt();
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
                if (x > 5) { // harus lebih kecil dari emoat.
                    throw new IllegalArgumentException("choose 1-4 ");
                }
                successEntry = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Must be enter with numeric");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e);
            }
        }

        RpgUtil.clearScreen();

        if (x == 1) { //new game
            while (characEntry == false) {
                try {
                    charac.newChar();
                    characEntry = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Must be enter with numeric");
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getLocalizedMessage());
                }
            }
        } else if (x == 2) { //load game 
            FileUtilV4 futil = new FileUtilV4();
            String s1 = futil.openReadFile("rpg.txt");
            System.out.println(s1);
            String firstname = "";
            String lastname = "";
            int age = 0;
            int gender = 0;
            int stamina = 0;
            int money = 0;
            int hours = 0;
            int clean = 100;
            int interact = 0;
            int hungry = 0;
            int level = 0;
            int experience = 0;
            int days = 1;
            int mood = 0;
            int bore = 0;

            while (futil.getReadScanner().hasNext()) {
                // read line per line, split line by comma delimiter
                String[] readLine = futil.getReadScanner().next().split(",");

                // printout per line
                firstname = readLine[0];
                lastname = readLine[1];
                age = Integer.parseInt(readLine[2]);
                gender = Integer.parseInt(readLine[3]);
                level = Integer.parseInt(readLine[4]);
                experience = Integer.parseInt(readLine[5]);
                money = Integer.parseInt(readLine[6]);
                mood = Integer.parseInt(readLine[7]);
                days = Integer.parseInt(readLine[8]);
                hours = Integer.parseInt(readLine[9]);
                bore = Integer.parseInt(readLine[10]);
                clean = Integer.parseInt(readLine[11]);
                interact = Integer.parseInt(readLine[12]);
                hungry = Integer.parseInt(readLine[13]);
                stamina = Integer.parseInt(readLine[14]);

                System.out.println("reading name             = " + firstname + " " + lastname);
                System.out.println("reading age              = " + age);
                System.out.println("reading gender           = " + gender);
                System.out.println("reading level            = " + level);
                System.out.println("reading experience       = " + experience);
                System.out.println("reading money            = " + money);
                System.out.println("reading mood             = " + mood);
                System.out.println("reading days             = " + days);
                System.out.println("reading hours            = " + hours);
                System.out.println("reading bore             = " + bore);
                System.out.println("reading clean            = " + clean);
                System.out.println("reading interact         = " + interact);
                System.out.println("reading hungry           = " + hungry);
                System.out.println("reading stamina          = " + stamina);

            }
            // close opening read file
            String s3 = futil.closeReadFile();
            System.out.println(s3);
            System.out.println("Game loaded . . .\n");

            charac.getCharacter(firstname, lastname, age, gender, level, experience, money, mood, days, hours, bore, clean, interact, hungry, stamina);
        } else if (x == 3) {
            System.out.println("\t   Created By : \n\n");
            System.out.println("\t   Name   : Audian Taslim\n");
            System.out.println("\t   ID Num : 00000026418\n");
            System.out.println("\t   Class  : 16 IS 2\n\n");
            System.out.println("\t   Fav Quote : \"At some point, you just pull off the Band-Aid,\n\t                and it hurts, but then it's over and you're relieved.\"");

            System.out.println("\t   Name   : Anaz Venessa Tanlim\n");
            System.out.println("\t   ID Num : 00000022858\n");
            System.out.println("\t   Class  : 16 IS 2\n\n");
            System.out.println("\t   Fav Quote : \"What is the point of being alive \n\t                if you don't at least try to do something remarkable?\"\n\n");
            System.out.println("\t  \"This Game tell us that it is tough to START Struggling, until you fight for it.\"");
            System.out.println("\t   Life LOAD you like a bullet and Aim you to the way of Succeed,");
            System.out.println("\t   Until you become a topic that everybody talks ABOUT.");
            System.out.println("\t   And there comes a time when you need to QUIT. But you quit with dignity\"");
            System.out.println("\t                                                           - Audian Taslim");
        }

        do {
            int menu;

            while (menuEntry == false) {
                try {
                    Scanner entry = new Scanner(System.in);
                    do {
                        //Pembatas

                        System.out.print("\n" + RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");

                        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");

                        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");

                        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");

                        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");

                        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");

                        System.out.println(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");

                        System.out.println(RpgUtil.ANSI_GREEN + "\t\t\t\t _ __ ___   ___   _ __    _   _");
                        RpgUtil.delay(300);
                        System.out.println(RpgUtil.ANSI_GREEN + "\t\t\t\t| '_ ` _  \\/ _ \\ | '_ \\  | | | |");
                        RpgUtil.delay(300);
                        System.out.println(RpgUtil.ANSI_GREEN + "\t\t\t\t| | | | | |  __/ | | | | | |_| |");
                        RpgUtil.delay(300);
                        System.out.println(RpgUtil.ANSI_GREEN + "\t\t\t\t|_| |_| |_|\\___| |_| |_| \\_____|");
                        RpgUtil.delay(300);

                        //Pembatas
                        System.out.print("\n" + RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");

                        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");

                        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");

                        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");

                        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");

                        System.out.print(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");

                        System.out.println(RpgUtil.ANSI_RED + "\".'.'.\" .\" '.\".");
                        System.out.println(RpgUtil.ANSI_BLACK);

                        System.out.println("\n\n\t\t\t\t   Hi " + charac.firstname + " " + charac.lastname + "!");
                        System.out.println("\n\t\t\t\t   What do you want to do?  ");
                        System.out.println("\t\t\t\t   1 . Status ");
                        System.out.println("\t\t\t\t   2 . Activity ");
                        System.out.println("\t\t\t\t   3 . Entertainment ");
                        System.out.println("\t\t\t\t   4 . Take a rest ");
                        System.out.println("\t\t\t\t   5 . Refreshing ");
                        System.out.println("\t\t\t\t   6 . Save Game ");
                        System.out.println("\t\t\t\t   0 . Exit Game \n");
                        System.out.print("\t\t\t\t   Your Choice  : ");

                        menu = entry.nextInt();
                        System.out.println("\n");
                        if (menu == 1) {
                            charac.getStatus();
                        } else if (menu == 2) {

                            System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                            System.out.println(RpgUtil.ANSI_BLACK);

                            System.out.println("\n\n\t\t\t\t   Choose your activity ");
                            System.out.println("\t\t\t\t   1 . Eat ");
                            System.out.println("\t\t\t\t   2 . Shower");
                            System.out.println("\t\t\t\t   3 . Hobbies");
                            System.out.println("\t\t\t\t   4 . Work \n\n");
                            System.out.println("\n\t\t\t\t   What activity do you want to do?");
                            System.out.print("\t\t\t\t   Your Choice : ");

                            int a = entry.nextInt();
                            if (a == 1) {
//                        Eat();

                                System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                System.out.println(RpgUtil.ANSI_BLACK);

                                System.out.println("\n\n\t\t\t\t   Hi " + charac.firstname + " " + charac.lastname + "!");
                                System.out.println("\t\t\t\t   What Menus do you want to try? ");

                                Scanner Eat = new Scanner(System.in);
//                        Character charac = new Character();
                                int food;

                                System.out.println(RpgUtil.ANSI_PURPLE + "\t     __                 _                   _       _      _       _        ");
                                System.out.println(RpgUtil.ANSI_PURPLE + "\t    / _| ___   ___   __| |   __ _ _ __   __| |   __| |_ __(_)_ __ | | _____ ");
                                System.out.println(RpgUtil.ANSI_PURPLE + "\t   | |_ / _ \\ / _ \\ / _` |  / _` | '_ \\ / _` |  / _` | '__| | '_ \\| |/ / __|");
                                System.out.println(RpgUtil.ANSI_PURPLE + "\t   |  _| (_) | (_) | (_| | | (_| | | | | (_| | | (_| | |  | | | | |   <\\__ \\");
                                System.out.println(RpgUtil.ANSI_PURPLE + "\t   |_|  \\___/ \\___/ \\__,_|  \\__,_|_| |_|\\__,_|  \\__,_|_|  |_|_| |_|_|\\_\\___/" + RpgUtil.ANSI_BLACK);

                                System.out.println("\n\t\t\t\t\t[1] Appetizer\n\t\t\t\t\t[2] MainCourse\n\t\t\t\t\t[3] Dessert");
                                System.out.print("\n\n\t\t\t\t\tYour Choice : ");
                                food = Eat.nextInt();
                                if (food == 1) {

                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\n\t\t\t\t   Hi " + charac.firstname + " " + charac.lastname + "!");
                                    System.out.println("\t\t\t\t   What Menus do you want to try? ");

                                    Scanner App = new Scanner(System.in);

                                    System.out.println("\n\t\t\t\t\t      Appetizers Menu");

                                    System.out.println("\t\t\t      ____                                    ?~~bL");
                                    System.out.println("\t\t\t     z@~ b                                    |  `U,");
                                    System.out.println("\t\t\t    ]@[  |                                   ]'  z@'");
                                    System.out.println("\t\t\t    d@~' `|, .__     _----L___----, __, .  _t'   `@j");
                                    System.out.println("\t\t\t   `@L_,   \"-~ `--\"~-a,           `C.  ~\"\"O_    ._`@");
                                    System.out.println("\t\t\t    q@~'   ]P       ]@[            `Y=,   `H+z_  `a@");
                                    System.out.println("\t\t\t    `@L  _z@        d@               Ya     `-@b,_a'");
                                    System.out.println("\t\t\t     `-@d@a'       )@[               `VL      `a@@'");
                                    System.out.println("\t\t\t       aa~'   ],  .a@'                qqL  ), ./~");
                                    System.out.println("\t\t\t       @@_  _z~  _d@[                 .V@  .L_d'");
                                    System.out.println("\t\t\t        \"~@@@'  ]@@@'        __      )@n@bza@-\"");
                                    System.out.println("\t\t\t          `-@zzz@@@L        )@@z     ]@@=%-\"");
                                    System.out.println("\t\t\t            \"~~@@@@@bz_    _a@@@@z___a@K");
                                    System.out.println("\t\t\t                \"~-@@@@@@@@@@@@@@@@@@~\"");
                                    System.out.println("\t\t\t                   `~~~-@~~-@@~~~~~'");

                                    System.out.println("\n\t\t\t\t   [1] Salad (Stamina + 3) : $ 5");
                                    System.out.println("\n\t\t\t\t   [2] Omelet (Stamina + 5) : $ 10");
                                    System.out.println("\n\t\t\t\t   [3] Saussage (Stamina + 7) : $ 15");
                                    System.out.println("\n\t\t\t\t   [4] Buns (Stamina + 10 : $ 20");

                                    System.out.print("\n\t\t\t\t   Choose one : ");
                                    int Appetizer = App.nextInt();
                                    System.out.println("");

                                    switch (Appetizer) {
                                        case 1: //salad
                                            System.out.print("\t\t\t\t   Eating");
                                            RpgUtil.delay(2000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\t\t\t\t   Done\n");
                                            System.out.println("\t\t\t\t   Stamina + 3  >> " + charac.upStamina(3));
                                            System.out.println("\t\t\t\t   Money   - 5  >> " + charac.downMoney(5));
                                            System.out.println("\t\t\t\t   Hungry Point >> " + charac.upHungry(15));
                                            break;
                                        case 2: //omelet
                                            System.out.print("\t\t\t\t   Eating");
                                            RpgUtil.delay(2000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\t\t\t\t   Done\n");
                                            System.out.println("\t\t\t\t   Stamina + 5  >> " + charac.upStamina(5));
                                            System.out.println("\t\t\t\t   Money   - 10 >> " + charac.downMoney(10));
                                            System.out.println("\t\t\t\t   Hungry Point >> " + charac.upHungry(20));

                                            break;
                                        case 3: //sausage
                                            System.out.print("\t\t\t\t   Eating");
                                            RpgUtil.delay(2000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\t\t\t\t   Done\n");
                                            System.out.println("\t\t\t\t   Stamina + 7  >> " + charac.upStamina(7));
                                            System.out.println("\t\t\t\t   Money   - 15 >> " + charac.downMoney(15));
                                            System.out.println("\t\t\t\t   Hungry Point >> " + charac.upHungry(25));
                                            break;
                                        case 4: // buns
                                            System.out.print("\t\t\t\t   Eating");
                                            RpgUtil.delay(2000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\t\t\t\t   Done\n");
                                            System.out.println("\t\t\t\t   Stamina + 5  >> " + charac.upStamina(10));
                                            System.out.println("\t\t\t\t   Money   - 20 >> " + charac.downMoney(20));
                                            System.out.println("\t\t\t\t   Hungry Point >> " + charac.upHungry(25));
                                            break;
                                        default:
                                            break;
                                    }

                                } else if (food == 2) {
                                    Scanner mc = new Scanner(System.in);
                                    int Course;

                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\n\t\t\t\t   Hi " + charac.firstname + " " + charac.lastname + "!");
                                    System.out.println("\t\t\t\t   What Menus do you want to try? ");
                                    System.out.println("\n\t\t\t\t   Main Course Menu");
                                    System.out.println("\n\t\t\t\t   [1] Steak  (Stamina + 35) : $ 50");
                                    System.out.println("\n\t\t\t\t   [2] Pasta (Stamina + 20) : $ 30");
                                    System.out.println("\n\t\t\t\t   [3] Fried rice  (Stamina + 40) : $ 80");

                                    System.out.print("\t\t\t\t   Your Choice : ");
                                    Course = mc.nextInt();
                                    System.out.println("");

                                    if (Course == 1) {

                                        System.out.print("\t\t\t\t   Eating");
                                        RpgUtil.delay(2000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.println(".");
                                        System.out.println("\t\t\t\t   Done\n");
                                        System.out.println("\t\t\t\t   Stamina + 5  >> " + charac.upStamina(35));
                                        System.out.println("\t\t\t\t   Money   - 40 >> " + charac.downMoney(40));
                                        System.out.println("\t\t\t\t   Hungry Point >> " + charac.upHungry(40));

                                    } else if (Course == 2) {

                                        System.out.print("\t\t\t\t   Eating");
                                        RpgUtil.delay(2000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.println(".");
                                        System.out.println("\t\t\t\t   Done\n");
                                        System.out.println("\t\t\t\t   Stamina + 5  >> " + charac.upStamina(25));
                                        System.out.println("\t\t\t\t   Money   - 30 >> " + charac.downMoney(30));
                                        System.out.println("\t\t\t\t   Hungry Point >> " + charac.upHungry(45));

                                    } else if (Course == 3) {

                                        System.out.print("\t\t\t\t   Eating");
                                        RpgUtil.delay(2000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.println(".");
                                        System.out.println("\t\t\t\t   Done\n");
                                        System.out.println("\t\t\t\t   Stamina + 5  >> " + charac.upStamina(45));
                                        System.out.println("\t\t\t\t   Money   - 80 >> " + charac.downMoney(80));
                                        System.out.println("\t\t\t\t   Hungry Point >> " + charac.upHungry(50));
                                    }

                                } else if (food == 3) {
                                    Scanner des = new Scanner(System.in);
                                    int Dessert;

                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\n\t\t\t\t   Hi " + charac.firstname + " " + charac.lastname + "!");
                                    System.out.println("\t\t\t\t   What Menus do you want to try? ");

                                    System.out.println("\n\n" + RpgUtil.ANSI_PURPLE + "\t\t\t\t               .oo.");
                                    System.out.println(RpgUtil.ANSI_PURPLE + "\t\t\t\t             oGGGGGGo");
                                    System.out.println(RpgUtil.ANSI_PURPLE + "\t\t\t\t            GGGGGGGGGG");
                                    System.out.println(RpgUtil.ANSI_PURPLE + "\t\t\t\t     .mMMMMMMGGGGGGEEEE=");
                                    System.out.println(RpgUtil.ANSI_PURPLE + "\t\t\t\t    MMMMMMMMMMMGGEEEEEEEE");
                                    System.out.println(RpgUtil.ANSI_PURPLE + "\t\t\t\t   MMMMMMMMMMMNICKEEEEEEEE");
                                    System.out.println(RpgUtil.ANSI_PURPLE + "\t\t\t\t   MMMMMMMMMMMMMEEEEEEEEEE");
                                    System.out.println(RpgUtil.ANSI_PURPLE + "\t\t\t\t   !MMMMMMMMMMMOOEEEEEEEE");
                                    System.out.println(RpgUtil.ANSI_PURPLE + "\t\t\t\t    MMM!MMMMMMOOOOOOE!=");
                                    System.out.println("\t\t\t\t     MM!!!!!!!!!!!!!!!");
                                    System.out.println("\t\t\t\t      MM!!!!!!!!!!!!!'");
                                    System.out.println("\t\t\t\t      !M!!!!!!!!!!!!!");
                                    System.out.println("\t\t\t\t       MM!!!!!!!!!!!'");
                                    System.out.println("\t\t\t\t       MM!!!!!!!!!!!");
                                    System.out.println("\t\t\t\t       ! `!!!!!!!!!'");
                                    System.out.println("\t\t\t\t       .  !!!!!!!!!");
                                    System.out.println("\t\t\t\t          `!!!!!!!'");
                                    System.out.println("\t\t\t\t           !!!!!!!");
                                    System.out.println("\t\t\t\t          `!!!!!'");
                                    System.out.println("\t\t\t\t            !!!!!");
                                    System.out.println("\t\t\t\t            `!!!'");
                                    System.out.println("\t\t\t\t             !!!");
                                    System.out.println("\t\t\t\t             `!'");
                                    System.out.println("\t\t\t\t              ! ");

                                    System.out.println("\n\t\t\t\t   Dessert Menu");
                                    System.out.println("\n\t\t\t\t   [1] Ice Cream  (Mood + 15) : $ 15");
                                    System.out.println("\n\t\t\t\t   [2] Puding     (Mood + 20) : $ 20");
                                    System.out.println("\n\t\t\t\t   [3] Fruit      (Stamina + 7) : $ 25");

                                    System.out.print("\t\t\t\t   Your Choice : ");
                                    Dessert = des.nextInt();
                                    System.out.println("");

                                    if (Dessert == 1) {

                                        System.out.print("\t\t\t\t   Eating");
                                        RpgUtil.delay(2000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.println(".");
                                        System.out.println("\t\t\t\t   Done\n");
                                        System.out.println("\t\t\t\t   Mood  + 15  >> " + charac.upMood(15));
                                        System.out.println("\t\t\t\t   Money - 10  >> " + charac.downMoney(10));

                                    } else if (Dessert == 2) {

                                        System.out.print("\t\t\t\t   Eating");
                                        RpgUtil.delay(2000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.println(".");
                                        System.out.println("\t\t\t\t   Done\n");
                                        System.out.println("\t\t\t\t   Mood  + 20  >> " + charac.upMood(20));
                                        System.out.println("\t\t\t\t   Money - 20  >> " + charac.downMoney(20));

                                    } else if (Dessert == 3) {

                                        System.out.print("\t\t\t\t   Eating");
                                        RpgUtil.delay(2000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.print(".");
                                        RpgUtil.delay(1000);
                                        System.out.println(".");
                                        System.out.println("\t\t\t\t   Done\n");
                                        System.out.println("\t\t\t\t   Mood  + 25  >> " + charac.upMood(25));
                                        System.out.println("\t\t\t\t   Money - 25  >> " + charac.downMoney(30));
                                    }
                                }
                            } else if (a == 2) {
                                // Pembatas
                                System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                System.out.println(RpgUtil.ANSI_BLACK);

                                System.out.println("\n\n\t\t\t\t   Shower Menus ");
                                System.out.println("\n\t\t\t\t   1 . Shower");
                                System.out.println("\n\t\t\t\t   2 . Pee");
                                System.out.println("\n\t\t\t\t   3 . Defecate");
                                System.out.println("\n\t\t\t\t   \n\n\t\t\t\t   Hi " + charac.firstname + " " + charac.lastname + "!");
                                System.out.println("\t\t\t\t   Your Clean Point is : " + charac.clean);
                                System.out.println("\t\t\t\t   What activity do you choose to clean up yourself?  ");
                                System.out.print("\t\t\t\t   Activity : ");
                                int b = entry.nextInt();

                                charac.downMood(10);
                                charac.downBore(10);

                                if (b == 1) {
                                    // Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\t\t\t        o    .   _     .");
                                    System.out.println("\t\t\t          .     (_)         o");
                                    System.out.println("\t\t\t   o      ____            _       o");
                                    System.out.println("\t\t\t  _   ,-/   /)))  .   o  (_)   .");
                                    System.out.println("\t\t\t (_)  \\_\\  ( e(     O             _");
                                    System.out.println("\t\t\t o       \\/' _/   ,_ ,  o   o    (_)");
                                    System.out.println("\t\t\t  . O    _/ (_   / _/      .  ,        o");
                                    System.out.println("\t\t\t     o8o/    \\\\_/ / ,-.  ,oO8/( -TT");
                                    System.out.println("\t\t\t    o8o8O | } }  / /   \\Oo8OOo8Oo||     O");
                                    System.out.println("\t\t\t   Oo(\"\"o8\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"8oo\"\"\"\"\"\"\")");
                                    System.out.println("\t\t\t  _   `\\`'                  `'   /'   o");
                                    System.out.println("\t\t\t (_)    \\                       /    _   .");
                                    System.out.println("\t\t\t      O  \\           _         /    (_)");
                                    System.out.println("\t\t\to   .     `-. .----<(o)_--. .-'");
                                    System.out.println("\t\t\t   --------(_/------(_<_/--\\_)--------");

                                    System.out.println("\n\n\t\t\t\t   You Choose Shower....");
                                    System.out.println("\t\t\t\t   Please Wait A minute ");
                                    System.out.println("\t\t\t\t   Showering....");

                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    //top
                                    RpgUtil.delay(2000);
                                    System.out.println("\t\t\t\t   Top Parts Cleaned!");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    //middle 
                                    RpgUtil.delay(2000);
                                    System.out.println("\t\t\t\t   Middle Parts Cleaned!");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");

                                    //Low
                                    RpgUtil.delay(2000);
                                    System.out.println("\t\t\t\t   Low Parts Cleaned!");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");

                                    System.out.println("");
                                    System.out.println("\t\t\t\t   DONE! \n\t\t\t\t   You were already cleaned!");
                                    System.out.println("\t\t\t\t   Clean Point + 60\n\t\t\t\t   Hungry Point - 5\n\n");
                                    charac.upClean(60);
                                    charac.downHungry(5);
                                    charac.upHours(2);

                                } else if (b == 2) {
                                    // Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\n\n\t\t\t\t   You Choose Pee....");
                                    System.out.println("\t\t\t\t   Please Wait A minute ..");
                                    System.out.println("\t\t\t\t   Peeing....");
                                    RpgUtil.delay(2000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("");
                                    System.out.println("\t\t\t\t   DONE! You are ready to out .");
                                    System.out.println("\t\t\t\t   Clean Point + 10\n\t\t\t\t   Hungry Point - 5\n\n");
                                    charac.upClean(10);
                                    charac.upExperience(5);

                                } else if (b == 3) {
                                    // Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\n\n\t\t\t\t   You Choose Defecate....");
                                    System.out.println("\t\t\t\t   Please Wait A minute ..");
                                    System.out.println("\t\t\t\t   Defecating....");
                                    RpgUtil.delay(2000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    RpgUtil.delay(2000);
                                    System.out.println("\t\t\t\t   Clean Yourself Up");
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(500);
                                    System.out.print(".");
                                    RpgUtil.delay(500);
                                    System.out.print(".");
                                    RpgUtil.delay(500);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   DONE! You were already done defecating.");
                                    System.out.println("\t\t\t\t   Clean Point + 15\n\t\t\t\t   Hungry Point - 5\n\n");
                                    charac.upClean(15);
                                    charac.upExperience(5);
                                }
                            } else if (a == 3) { //hobbies

                                // Pembatas
                                System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                System.out.println(RpgUtil.ANSI_BLACK);

                                System.out.println("\n\n\t\t\t\t   HOBBIES menu : \n");
                                System.out.println("\t\t\t\t   1 . Singing");
                                System.out.println("\t\t\t\t   2 . Dancing");
                                System.out.println("\t\t\t\t   3 . Playing Piano ");
                                System.out.println("\t\t\t\t   4 . Gaming ");
                                System.out.println("\t\t\t\t   5 . Drawing");
                                System.out.print("\n\n\t\t\t\t   Choose Your Hobbies :");
                                int h = entry.nextInt();

                                if (h == 1) {
                                    //sing

                                    // Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\t\t\t\t   Singingg...");
                                    RpgUtil.delay(1000);
                                    System.out.println("\t\t\t\t   Warming Up");
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   Hit the first Song");

                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   Hit the second Song");

                                    System.out.println("\t\t    ___|)________________________________________________________");
                                    System.out.println("\t\t   |___/____________________________|___________________________||");
                                    System.out.println("\t\t   |__/|_______/|____/|_____/|______|___________________________||");
                                    System.out.println("\t\t   |_/(|,\\____/_|___/_|____/_|______|___________________________||");
                                    System.out.println("\t\t   |_\\_|_/___|__|__|__|___|__|___|__|___________________________||");
                                    System.out.println("\t\t   |   |     | ()  | ()   | ()   |  |                           ||");
                                    System.out.println("\t\t   | (_|   -()-  -()-   -()-   -()- | -()-  -()-  -()-   -()-   ||");
                                    System.out.println("\t\t   |________________________________|__|__()_|__()_|__()__|_____||");
                                    System.out.println("\t\t   |__/___\\_._______________________|__|__|__|__|__|__|___|_____||");
                                    System.out.println("\t\t   |__\\___|_._______________________|___\\_|___\\_|___\\_|___|_____||");
                                    System.out.println("\t\t   |_____/__________________________|____\\|____\\|____\\|_________||");
                                    System.out.println("\t\t   |____/___________________________|___________________________||");

                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   You were done singing. You're a Good Singer.\n\n");
                                    charac.upMood(20);
                                    charac.downStamina(10);
                                    charac.upExperience(20);
                                    charac.upHours(2);
                                    //dancing
                                } else if (h == 2) {

                                    // Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\t\t\t\t   Dancingg...");

                                    System.out.println("\t   |-----------------------------------------------------------------------|");
                                    System.out.println("\t   |    o   \\ o /  _ o         __|    \\ /     |__        o _  \\ o /   o    |");
                                    System.out.println("\t   |   /|\\    |     /\\   ___\\o   \\o    |    o/    o/__   /\\     |    /|\\   |");
                                    System.out.println("\t   |   / \\   / \\   | \\  /)  |    ( \\  /o\\  / )    |  (\\  / |   / \\   / \\   |");
                                    System.out.println("\t   |-----------------------------------------------------------------------|");

                                    RpgUtil.delay(1000);
                                    System.out.println("\t\t\t\t   Warming Up");
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   Dance the waltz");

                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   Salsa Dancing");

                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   You were done dancing. You danced with your soul.\n\n ");
                                    charac.upMood(20);
                                    charac.downStamina(30);
                                    charac.upExperience(30);
                                    charac.upHours(3);
                                    //Piano
                                } else if (h == 3) {

                                    // Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\t\t\t\t   Playing Piano ...");
                                    RpgUtil.delay(1000);
                                    System.out.println("\t\t\t\t   Beginning!");
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   Refrain!");

                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   Bridge!");

                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   You played a dynamic changing notes well!\n\n ");
                                    charac.upMood(30);
                                    charac.downStamina(5);
                                    charac.upExperience(30);
                                    charac.upHours(3);
                                    //Gaming
                                } else if (h == 4) {

                                    // Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\t\t\t\t      Gamingg...");

                                    System.out.println("\t\t      _=====_                               _=====_");
                                    System.out.println("\t\t   +.-'_____'-.---------------------------.-'_____'-.+");
                                    System.out.println("\t\t  /   |     |  '.        S O N Y        .'  |  _  |   \\");
                                    System.out.println("\t\t / ___| /|\\ |___ \\                     / ___| /_\\ |___ \\");
                                    System.out.println("\t\t; |      |      | ;  __           _   ; | _         _ | ;");
                                    System.out.println("\t\t| | <---   ---> | | |__|         |_:> | ||_|       (_)| |");
                                    System.out.println("\t\t| |___   |   ___| ;SELECT       START ; |___       ___| ;");
                                    System.out.println("\t\t|\\    | \\|/ |    /  _     ___      _   \\    | (X) |    /|");
                                    System.out.println("\t\t| \\   |_____|  .','\" \"', |___|  ,'\" \"', '.  |_____|  .' |");
                                    System.out.println("\t\t|  '-.______.-' /       \\ANALOG/       \\  '-._____.-'   |");
                                    System.out.println("\t\t|               |       |------|       |                |");
                                    System.out.println("\t\t|              /\\       /      \\       /\\               |");
                                    System.out.println("\t\t|             /  '.___.'        '.___.'  \\              |");
                                    System.out.println("\t\t|            /                            \\             |");
                                    System.out.println("\t\t \\          /                              \\           /");
                                    System.out.println("\t\t  \\________/                                \\_________/");

                                    RpgUtil.delay(1000);
                                    System.out.println("\t\t\t\t      Warming Up");
                                    System.out.print("\t\t\t\t      .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t      Finished the first Game");

                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t      .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t      Achieving the rewards");

                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t      .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t      Eyes sucked but your were bloody Glad! Lol\n\n ");

                                    charac.upMood(50);
                                    charac.downStamina(5);
                                    charac.upExperience(5);
                                    charac.upHours(5);

                                    //Drawing
                                } else if (h == 5) {

                                    // Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\t\t\t\t   Drawingg...");
                                    RpgUtil.delay(1000);
                                    System.out.println("\t\t\t\t   Sketching....");
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   Focusing....");

                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   Coloring....");

                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   Nice Drawing! ");
                                    charac.upMood(20);
                                    charac.downStamina(10);
                                    charac.upExperience(20);
                                    charac.upHours(2);
                                }
                            } else if (a == 4) { // work

                                // Pembatas
                                System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                System.out.println(RpgUtil.ANSI_BLACK);

                                System.out.println("\t\t\t\t   JOB MENU");
                                switch (charac.level) {
                                    case 1:
                                        System.out.println("1 . Waiters ");
                                        break;
                                    case 2:
                                        System.out.println("1 . Waiters ");
                                        System.out.println("2 . Cashier");
                                        break;
                                    case 3:
                                        System.out.println("1 . Waiters ");
                                        System.out.println("2 . Cashier");
                                        System.out.println("3 . Police");
                                        System.out.println("4 . Fireman");
                                        break;
                                    case 4:
                                        System.out.println("1 . Waiters ");
                                        System.out.println("2 . Cashier");
                                        System.out.println("3 . Police");
                                        System.out.println("4 . Fireman");
                                        System.out.println("5 . Lawyer / CEO");
                                        break;
                                    case 5:
                                        System.out.println("1 . Waiters ");
                                        System.out.println("2 . Cashier");
                                        System.out.println("3 . Police");
                                        System.out.println("4 . Fireman");
                                        System.out.println("5 . Lawyer / CEO");
                                        System.out.println("6 . Web Developer");
                                        break;
                                    default:
                                        break;
                                }

                                System.out.print("choose one ");
                                int w = entry.nextInt();

                                if (w == 1) { //waiters
                                    int Quantity;
                                    // Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\n\n\t\t\t\t   Part Time Job Waiter ");
                                    System.out.println("\n\t\t\t\t\t   Your Customer Wanted you to make : ");
                                    System.out.println("\t\t\t\t   - 2 Cheese Burgers");
                                    System.out.println("\t\t\t\t   - 1 Cheese Macaroni");
                                    System.out.println("\t\t\t\t   - 1 Baby Ribs");
                                    System.out.println("\t\t\t\t   - 4 Squash");

                                    while (Waiter = false) {
                                        do {
                                            System.out.println("\n\n\n\t\t\t\t   Cheese Burger");
                                            System.out.println("\n\n\t\t\t\t   Quantity of Cheese Burger   : ");
                                            System.out.println("\t\t\t\t   1. One ");
                                            System.out.println("\t\t\t\t   2. Two");
                                            System.out.println("\t\t\t\t   3. Three");
                                            System.out.println("\t\t\t\t   4. Four");
                                            System.out.println("\t\t\t\t   5. Five");
                                            System.out.println("\n\t\t\t\t   How Many ? : ");
                                            Quantity = entry.nextInt();

                                            if (Quantity == 2) {
                                                System.out.println("\n\n\t\t\t\t   Cooking the Cheese Burger");
                                                RpgUtil.delay(500);
                                                System.out.println("\t\t\t\t   Preparing the Ingredients");
                                                RpgUtil.delay(500);
                                                System.out.print("\t\t\t\t   .");
                                                RpgUtil.delay(500);
                                                System.out.print(".");
                                                RpgUtil.delay(500);
                                                System.out.print(".");
                                                RpgUtil.delay(500);
                                                System.out.println(".");
                                                System.out.println("\n\t\t\t\t   Start Cooking ");
                                                RpgUtil.delay(500);
                                                System.out.print("\t\t\t\t   .");
                                                RpgUtil.delay(500);
                                                System.out.print(".");
                                                RpgUtil.delay(500);
                                                System.out.print(".");
                                                RpgUtil.delay(500);
                                                System.out.print(".");
                                                System.out.println("\n\t\t\t\t   Done Cooking");
                                                System.out.println("\t\t\t\t   Serving");
                                                RpgUtil.delay(500);
                                                System.out.print("\t\t\t\t   .");
                                                RpgUtil.delay(500);
                                                System.out.print(".");
                                                RpgUtil.delay(500);
                                                System.out.print(".");
                                                RpgUtil.delay(500);
                                                System.out.print(".");
                                            }

                                        } while (Quantity != 2);
                                    }
                                    Waiter = true;

                                    charac.upMoney(400);
                                    charac.upExperience(100);
                                    charac.upHours(6);
                                    charac.downHungry(60);
                                    charac.downClean(40);
                                    charac.downMood(20);
                                    charac.downStamina(20);
                                } else if (w == 2) { //cashier

                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    charac.upMoney(700);
                                    charac.upExperience(200);
                                    charac.upHours(6);
                                    charac.downHungry(60);
                                    charac.downClean(30);
                                    charac.downMood(20);
                                    charac.downStamina(20);
                                } else if (w == 3) { //police

                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    charac.upMoney(1200);
                                    charac.upExperience(350);
                                    charac.upHours(8);
                                    charac.downHungry(70);
                                    charac.downClean(50);
                                    charac.downMood(30);
                                    charac.downStamina(30);
                                } else if (w == 4) { //Fireman

                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    charac.upMoney(1200);
                                    charac.upExperience(350);
                                    charac.upHours(8);
                                    charac.downHungry(70);
                                    charac.downClean(60);
                                    charac.downMood(30);
                                    charac.downStamina(40);
                                } else if (w == 5) { //Lawyer/ceo

                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    charac.upMoney(2500);
                                    charac.upExperience(550);
                                    charac.upHours(6);
                                    charac.downHungry(40);
                                    charac.downClean(20);
                                    charac.downMood(25);
                                    charac.downStamina(10);
                                } else if (w == 6) { //WEBdeveloper

                                    System.out.print("\n" + RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_BLUE + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    charac.upMoney(3000);
                                    charac.upExperience(500);
                                    charac.upHours(8);
                                    charac.downHungry(20);
                                    charac.downClean(5);
                                    charac.downMood(10);
                                    charac.downStamina(10);
                                }
                            }

                        } else if (menu == 3) { // entertainment menu 

                            //Pembatas
                            System.out.print("\n" + RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.println(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                            System.out.println(RpgUtil.ANSI_BLACK);

                            System.out.println("\t\t\t\t   Entertainment Menus \n");
                            System.out.println("\t\t\t\t   1 . Watching Tv ");
                            System.out.println("\t\t\t\t   2 . Listening Music");
                            System.out.println("\t\t\t\t   3 . Cinema");
                            System.out.println("\t\t\t\t   4 . Karaoke");
                            System.out.println("\t\t\t\t   5 . Cooking Class\n");
                            System.out.println("\t\t\t\t   What kind of Entertainment do you want to do? ");
                            System.out.print("\t\t\t\t   Your Choice : ");
                            int e = entry.nextInt();
                            charac.upHours(3);

                            if (e == 1) {

                                //Pembatas
                                System.out.print("\n" + RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.println(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                System.out.println(RpgUtil.ANSI_BLACK);

                                System.out.println("\t\t\t\t\t   Watching TV");
                                System.out.println("\t\t   .---..-----------------------------------------------..---.");
                                System.out.println("\t\t   |   ||.---------------------------------------------.||   |");
                                System.out.println("\t\t   | o ||| _0_o O/oo  _0_ \\O/ _   _0_  O_0_o_O/ooO _0_ ||| o |");
                                System.out.println("\t\t   | _ |||O oo _0_ _0_o\\O  _O/~'       O oo__0_ _0_o\\O ||| _ |");
                                System.out.println("\t\t   |(_)|||_0_ \\O oo        /)    _0_ \\O_0_ \\O oo       |||(_)|");
                                System.out.println("\t\t   |   |||---------------------------------------------|||   |");
                                System.out.println("\t\t   |.-.|||     __....------------------------....___   |||.-.|");
                                System.out.println("\t\t   | o |||---''                         _.--._      `  ||| o |");
                                System.out.println("\t\t   |`-'|||             _.--._          'O---O-'        |||`-'|");
                                System.out.println("\t\t   |   |||     _.--._ 'O---O-'_.--._  _.--._           |||   |");
                                System.out.println("\t\t   |.-.|||    'O---O-'       'O---O-''O---O-'          |||.-.|");
                                System.out.println("\t\t   | O |||__,,...,----------------------....___        ||| O |");
                                System.out.println("\t\t   |`-'||`---------------------------------------------'||`-'|");
                                System.out.println("\t\t   `---'`-----------------------------------------------'`---'");
                                System.out.println("\t\t          _||_                                     _||_");
                                System.out.println("\t\t         /____\\                                   /____\\");

                                RpgUtil.delay(1000);
                                System.out.println("\t\t\t\t\t   Live Racing!");
                                System.out.print("\t\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                System.out.println("\t\t\t\t\t   Walking Dead!");

                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                System.out.println("\t\t\t\t\t   Lullaby Story...");

                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");

                                charac.upMood(20);
                                charac.upBore(20);
                                charac.upExperience(40);

                                System.out.println("\t\t\t\t\t   Your mood is increased ^_^ \n\n");

                            } else if (e == 2) {

                                //Pembatas
                                System.out.print("\n" + RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.println(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                System.out.println(RpgUtil.ANSI_BLACK);

                                System.out.println("\t\t\t\t    Listening Music ");

                                System.out.println("\t        ;               ");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;;              ");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;';.            ;");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;  ;;           ;");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;   ;;          ;  .;                   ,               ,;'''';.");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;    ;;         ;.;';               ;   ;              ;;      ;;");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;    ;;         ;'  ;               ;  .;              ;:;,,,,;:");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;   ;'          ;  .;               ;.;';              ;");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;  '            ;  .;               ;.;';              ;");
                                RpgUtil.delay(200);
                                System.out.println("\t   ,;;;,;               ;'  ;               ;  .;              ;");
                                RpgUtil.delay(200);
                                System.out.println("\t   ;;;;;;               ;'  ;               ;  .;              ;");
                                RpgUtil.delay(200);
                                System.out.println("\t   `;;;;'               ;'  ;               ;  .;              ;");
                                RpgUtil.delay(200);
                                System.out.println("\t                        ;'  ;               ;  .;              ;");
                                RpgUtil.delay(200);
                                System.out.println("\t                                            ;  .;              ;");
                                RpgUtil.delay(200);
                                System.out.println("\t                                                               ;");

                                System.out.println("\n\n\t\t\t\t    Your mood is increased ^_^ \n\n");
                                charac.upMood(20);
                                charac.upBore(20);
                                charac.upExperience(40);

                            } else if (e == 3) {

                                //Pembatas
                                System.out.print("\n" + RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.println(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                System.out.println(RpgUtil.ANSI_BLACK);

                                System.out.println("\n\n\t\t\t\t   Cinema ");

                                System.out.println("\t\t\t\t   But the ticket");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                System.out.println("\t\t\t\t   Watching Movie");

                                RpgUtil.delay(500);
                                System.out.println("\t\t\t\t   Finding Nemo.....");
                                RpgUtil.delay(1000);
                                System.out.println("\t\t                                    ,-----.");
                                System.out.println("\t\t                                   ,'       `-.");
                                System.out.println("\t\t                                  /            `.");
                                System.out.println("\t\t                                 /         _.----_o.");
                                System.out.println("\t\t                                __   ,---''    ,8888b.");
                                System.out.println("\t\t                               d88;-'         d888j\"' `---.");
                                System.out.println("\t\t                         ,----,Y8888.        ,888'         `-.");
                                System.out.println("\t\t                       ,'     / d8888.       888             ,\\");
                                System.out.println("\t\t   ,----.             ;      /  d88888bo.   J888       ,,.  ('@\\");
                                System.out.println("\t\t ,'      `---.        :    ,'   :88888888[  d88;     ,' `8)  \\  :");
                                System.out.println("\t\t;             `-----oooi.-'      `8888888;  d88     (      )  `-:");
                                System.out.println("\t\t|                  d8888.     ,--_888od8P  ,88P      `----'      :");
                                System.out.println("\t\t|                  88888.  ,-'     `Y8P'   d88;                  |");
                                System.out.println("\t\t:                  88M888 (           \\    d8b          _____,.--P");
                                System.out.println("\t\t  \\                888888L :            |   Y88b_           `;''");
                                System.out.println("\t\t   \\               `Y88J8P;-\\           ;    `Y888L        ,'");
                                System.out.println("\t\t    \\        _.---'  `\"\";'   `-.       //\\_    `\"\"'`-_.---'");
                                System.out.println("\t\t     `-----''            \\      `.----'/   \\__,----''");
                                System.out.println("\t\t                          `-----'      \\_    / ");
                                System.out.println("\t\t                                         `--'");

                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                System.out.println("\t\t\t\t   Finished Movie");
                                System.out.println("\t\t\t\t   Walking out of cinema");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");

                                System.out.println("\n\t\t\t\t   Your mood is increased ^_^ \n\n");
                                charac.upMood(50);
                                charac.upBore(40);
                                charac.upExperience(60);
                                charac.downMoney(10);

                            } else if (e == 4) {

                                //Pembatas
                                System.out.print("\n" + RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.println(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                System.out.println(RpgUtil.ANSI_BLACK);

                                System.out.println("\t\t\t\t\t   Karaoke ");

                                System.out.println("\t        ;               ");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;;              ");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;';.            ;");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;  ;;           ;");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;   ;;          ;  .;                   ,               ,;'''';.");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;    ;;         ;.;';               ;   ;              ;;      ;;");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;    ;;         ;'  ;               ;  .;              ;:;,,,,;:");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;   ;'          ;  .;               ;.;';              ;");
                                RpgUtil.delay(200);
                                System.out.println("\t        ;  '            ;  .;               ;.;';              ;");
                                RpgUtil.delay(200);
                                System.out.println("\t   ,;;;,;               ;'  ;               ;  .;              ;");
                                RpgUtil.delay(200);
                                System.out.println("\t   ;;;;;;               ;'  ;               ;  .;              ;");
                                RpgUtil.delay(200);
                                System.out.println("\t   `;;;;'               ;'  ;               ;  .;              ;");
                                RpgUtil.delay(200);
                                System.out.println("\t                        ;'  ;               ;  .;              ;");
                                RpgUtil.delay(200);
                                System.out.println("\t                                            ;  .;              ;");
                                RpgUtil.delay(200);
                                System.out.println("\t                                                               ;");

                                System.out.println("\t\t\t\t\t   Happy Singing....");

                                System.out.println("\n\t\t\t\t   James Arthur - Say You Won't Let Go");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                System.out.println("\n\n\t\t\t\t   Little Mix - Secret Love Song");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                System.out.println("\n\n\t\t\t\t   Jasmine Thompson - I Try");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                System.out.println("\t\t\t\t   You were done singing.");

                                System.out.println("\n\t\t\t\t   Your mood is increased ^_^ \n\n");
                                charac.upMood(50);
                                charac.upBore(40);
                                charac.upExperience(60);
                                charac.downMoney(10);

                            } else if (e == 5) {

                                //Pembatas
                                System.out.print("\n" + RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.println(RpgUtil.ANSI_PURPLE + "\".'.'.\" .\" '.\".");
                                System.out.println(RpgUtil.ANSI_BLACK);

                                System.out.println("\t\t\t\t   Buy the Ingredients");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");

                                System.out.println("\t\t\t\t         _________");
                                System.out.println("\t\t\t\t        | _______ |");
                                System.out.println("\t\t\t\t       / \\         \\");
                                System.out.println("\t\t\t\t      /___\\_________\\");
                                System.out.println("\t\t\t\t      |   | \\       |");
                                System.out.println("\t\t\t\t      |   |  \\      |");
                                System.out.println("\t\t\t\t      |   |   \\     |");
                                System.out.println("\t\t\t\t      |   | M  \\    |");
                                System.out.println("\t\t\t\t      |   |     \\   |");
                                System.out.println("\t\t\t\t      |   |\\  I  \\  |");
                                System.out.println("\t\t\t\t      |   | \\     \\ |");
                                System.out.println("\t\t\t\t      |   |  \\  L  \\|");
                                System.out.println("\t\t\t\t      |   |   \\     |");
                                System.out.println("\t\t\t\t      |   |    \\  K |");
                                System.out.println("\t\t\t\t      |   |     \\   |");
                                System.out.println("\t\t\t\t      |   |      \\  |");
                                System.out.println("\t\t\t\t      |___|_______\\_|");

                                System.out.println("\t\t\t\t   Preparing the Ingredients");

                                System.out.println("\n\n\t\t                             ___");
                                System.out.println("\t\t                           .' _ '.");
                                System.out.println("\t\t                          / /` `\\ \\");
                                System.out.println("\t\t                          | |   [__]");
                                System.out.println("\t\t                          | |    {{");
                                System.out.print("\t\t                          | |");
                                RpgUtil.delay(500);
                                System.out.println("    }}");
                                System.out.print("\t\t                       _  | |");
                                RpgUtil.delay(500);
                                System.out.println("  _ {{");
                                System.out.println("\t\t           ___________<_>_| |_<_>}}________");
                                System.out.println("\t\t               .=======^=(___)=^={{====.");
                                System.out.println("\t\t              / .----------------}}---. \\");
                                System.out.println("\t\t             / /                 {{    \\ \\");
                                System.out.println("\t\t            / /                  }}     \\ \\");
                                System.out.println("\t\t           (  '========================='  )");
                                System.out.println("\t\t            '-----------------------------'");

                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                System.out.println("\t\t\t\t   Start Cooking");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println("\t\t\t\t   .");
                                System.out.println("\t\t\t\t   Finished Cooking!");
                                System.out.println("\t\t\t\t   Plating");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                System.out.println("\t\t\t\t   You cooked a Creme Brule!");

                                System.out.println("\t\t\t\t   Your mood is increased ^_^ \n\n");
                                System.out.println("\t\t\t\t   Cooking Class  ");
                                charac.upMood(50);
                                charac.upBore(40);
                                charac.upExperience(60);
                                charac.downMoney(15);

                            }

                        } else if (menu == 4) { //take a rest 

                            //Pembatas
                            System.out.print("\n" + RpgUtil.ANSI_CYAN + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_CYAN + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_CYAN + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_CYAN + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_CYAN + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_CYAN + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.println(RpgUtil.ANSI_CYAN + "\".'.'.\" .\" '.\".");
                            System.out.println(RpgUtil.ANSI_BLACK);

                            System.out.println("\n\t\t\t\t   Take A Rest Menu ");
                            System.out.println("\n\t\t\t\t   1 . Take A Nap ");
                            System.out.println("\n\n\t\t\t\t   2 . Deep Sleep");
                            System.out.print("\n\t\t\t\t   Choose your Resting Activity : ");
                            int sleep = entry.nextInt();

                            if (sleep == 1) {

                                System.out.println("\t\t\t\t   Take a Nap \n\n");
                                System.out.println("\t\t\t\t   Changing clothes to pajama");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                System.out.println("\t\t\t\t   Preparing to Take a Nap");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");

                                System.out.println("\t\t\t                  .----.");
                                System.out.println("\t\t\t                  |    |");
                                System.out.println("\t\t\t                  |____|");
                                System.out.println("\t\t\t   _.-------------._()_.-------------._");
                                System.out.println("\t\t\t  / |             | )( |             | \\");
                                System.out.println("\t\t\t  ( |             | () |             | )");
                                System.out.println("\t\t\t  _\\|_____________| )( |_____________|/_");
                                System.out.println("\t\t\t.=. /             /(__)\\             \\ .=.");
                                System.out.println("\t\t\t|U|/_____________/______\\_____________\\|U|");
                                System.out.println("\t\t\t| |====================================| |");
                                System.out.println("\t\t\t| |                                    | |");
                                System.out.println("\t\t\t|_|LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL|_|");

                                System.out.println("\t\t\t\t   Take a Nap");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                System.out.println("\t\t\t\t   Wake up lightly minded!");
                                charac.upStamina(20);
                                charac.upMood(10);
                                charac.upHours(4);
                                charac.downBore(20);

                            } else if (sleep == 2) {

                                System.out.println("\t\t\t\t   Cleaning up yourself");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                System.out.println("\t\t\t\t   Changing clothes to pajama");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                System.out.println("\t\t\t\t   Preparing to sleep");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                System.out.println("\t\t\t\t   Take a Deep Sleep");
                                RpgUtil.delay(1000);
                                System.out.print("\t\t\t\t   .");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.print(".");
                                RpgUtil.delay(1000);
                                System.out.println(".");
                                if (charac.upStamina(0) >= 40) {

                                    System.out.println("\t\t\t                         --.");
                                    System.out.println("\t\t\t          @@@           /  ))");
                                    System.out.println("\t\t\t         (( }           7_ /");
                                    System.out.println("\t\t\t         ``)             / \\");
                                    System.out.println("\t\t\t        ``( \\           |<| |");
                                    System.out.println("\t\t\t       ```\\`.\\__     __/|/| |");
                                    System.out.println("\t\t\t      ```` )|---~o_)|___| | |");
                                    System.out.println("\t\t\t     ~~~~~/ \\`          | |_|");
                                    System.out.println("\t\t\t         / ' \\`         |__>)");
                                    System.out.println("\t\t\t        /  '  \\`        || |");
                                    System.out.println("\t\t\t       /   '    `       |\\ \\");
                                    System.out.println("\t\t\t      /   _!__.-._`     | \\ \\");
                                    System.out.println("\t\t\t     /_.-'  ( |         | |\\ \\");
                                    System.out.println("\t\t\t        /    `|         |_| \\_\\");
                                    System.out.println("\t\t\t       |`_   |`_      __'_)__.-'");

                                    System.out.println("\t\t\t\t   Day Dreaming");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   Wake up feeling light hearted.");
                                } else if (charac.upStamina(0) < 40) {
                                    System.out.println("\t\t\t\t   Nightmare");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   Wake up feeling heavy hearted");
                                }

                                charac.upStamina(90);
                                charac.upMood(30);
                                charac.upHours(15);
                                charac.downBore(50);
                            }

                        } else if (menu == 5) { //refreshing

                            //Pembatas
                            System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                            RpgUtil.delay(300);
                            System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                            System.out.println(RpgUtil.ANSI_BLACK);

                            System.out.println("\n\n\t\t\t\t   Refreshing Menu ");
                            System.out.println("\n\t\t\t\t   1 . Sports");
                            System.out.println("\n\t\t\t\t   2 . Interaction Social ");
                            System.out.print("\n\t\t\t\t   Your Choice : ");
                            int re = entry.nextInt();

                            if (re == 1) {
                                charac.upHours(3);

                                //Pembatas
                                System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                System.out.println(RpgUtil.ANSI_BLACK);

                                System.out.println("\n\t\t\t\t   Sports Menu ");
                                System.out.println("\n\t\t\t\t   1 . Jogging");
                                System.out.println("\n\t\t\t\t   2 . Yoga");
                                System.out.println("\n\t\t\t\t   3 . Swimming");
                                System.out.println("\n\t\t\t\t   4 . Badminton");
                                System.out.println("\n\t\t\t\t   5 . Sprint");
                                System.out.print("\n\t\t\t\t   Choose your Sport Activity : ");
                                int sport = entry.nextInt();

                                if (sport == 1) {

                                    //Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\n\t\t\t                        ,////,");
                                    System.out.println("\t\t\t                          /// 6|");
                                    System.out.println("\t\t\t                          //  _|");
                                    System.out.println("\t\t\t                         _/_,-'");
                                    System.out.println("\t\t\t                    _.-/'/   \\   ,/;,");
                                    System.out.println("\t\t\t                 ,-' /'  \\_   \\ / _/");
                                    System.out.println("\t\t\t                 `\\ /     _/\\  ` /");
                                    System.out.println("\t\t\t                   |     /,  `\\_/");
                                    System.out.println("\t\t\t                   |     \\'");
                                    System.out.println("\t\t\t       /\\_        /`      /\\");
                                    System.out.println("\t\t\t     /' /_``--.__/\\  `,. /  \\");
                                    System.out.println("\t\t\t    |_/`  `-._     `\\/  `\\   `.");
                                    System.out.println("\t\t\t              `-.__/'     `\\   |");
                                    System.out.println("\t\t\t                            `\\  \\");
                                    System.out.println("\t\t\t                              `\\ \\");
                                    System.out.println("\t\t\t                                \\_\\__");
                                    System.out.println("\t\t\t                                 \\___)");

                                    System.out.println("\n\n\t\t\t\t   1 miles jogging");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   2 miles jogging");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   1 miles jogging back way");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\t\t\t\t   2 miles jogging back way");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   Finished Jogging");
                                    System.out.println("\t\t\t\t   You were much healthier");

                                    charac.downStamina(15);
                                    charac.upMood(30);
                                    charac.downHungry(15);

                                } else if (sport == 2) {

                                    //Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\n\n\t\t                                                   ..");
                                    System.out.println("\t\t                                                 .-'  \\");
                                    System.out.println("\t\t                                               .':...::L");
                                    System.out.println("\t\t                                             .':...::::|");
                                    System.out.println("\t\t                                            /:::.:=:::::L");
                                    System.out.println("\t\t                                          .':::...:./:::|");
                                    System.out.println("\t\t                                         /:::..::::/.\\:::L");
                                    System.out.println("\t\t                                        /:::.:....':::L::|");
                                    System.out.println("\t\t                                  .-'::::...:/d8888b::|");
                                    System.out.println("\t\t                                ..dMP=:::::...:d88888Nb.|");
                                    System.out.println("\t\t                          ..odMMMP.:.'::=:...'d888888888::L");
                                    System.out.println("\t\t                        .dMMMMMP..: .:':::.d888888888888I:|");
                                    System.out.println("\t\t                      .dMMMMMM@b: ` ...:::d8888888888888::|");
                                    System.out.println("\t\t                     dMMMMMMMMNM.. ..:::d88888888888888P|||");
                                    System.out.println("\t\t                    dMMMMMMMMMMMboooodP\" `?888888888P'``||");
                                    System.out.println("\t\t                  .dMMMMMMMMMMMMMMMP'        `\"\"\"''  /  |`");
                                    System.out.println("\t\t                  dMMMMMMMMMMMMMMP'                .'   |");
                                    System.out.println("\t\t   .mggm..        MMMMMMMMMMMMMP'                .'     |");
                                    System.out.println("\t\t .dMMMMMMMNNb,    ?MMMMMMMMMMMM|                 |:.. ` |");
                                    System.out.println("\t\t .MMMMMMMMMMMMMb, .MMMMMMMMMMM(                  `-::   |");
                                    System.out.println("\t\t .MMMMMMMMMMMMMMMMmdMMMMMMMMMMM.                   \\::  |");
                                    System.out.println("\t\t  ?MMMMMMMMMMMMMMMMMMMMMMMMMMMMb                    |:..|");
                                    System.out.println("\t\t  `?MMMMMMMMMMMMMMMMMMMMMMMMMMMMbo.,               .MMMMb.");
                                    System.out.println("\t\t   `MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMb,             dMMMMM:");
                                    System.out.println("\t\t    ?MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMb           .MMMMMMb");
                                    System.out.println("\t\t     ?MMMMMMb ?MMMMMMMMMMMMMMMMMMMMMMMMb          .MMMMMMM");
                                    System.out.println("\t\t      ?MMMMMM  `?MMMMMMMMMMMMMMMMMMMMMMP          dMMMMMMM,");
                                    System.out.println("\t\t      `?MMMMM     `?WMMMMMMMMMMMMMMMMMMbo,       .MMMMMMMM|");
                                    System.out.println("\t\t       `MMMMM.         `?MMMMMMMMMMMMMMMMMbo,.   .MMMMMMMMb");
                                    System.out.println("\t\t        ?MMMMb            `?MMMMMMMMMMMMMMMMMMb, dMMMMMMMMM");
                                    System.out.println("\t\t        :::::|               `?MMMMMMMMMMMMMMMMMMNMMMMMMMMM");
                                    System.out.println("\t\t        ::::.|                 `?MMMMMMMMMMMMMMMMMMMMMMMNMN.");
                                    System.out.println("\t\t     .-:::::.\\                    `?MMMMMMMMMMMMMMMMMMMMMHM`");
                                    System.out.println("\t\t  _.:::::::   |                      `?MMMMMMMMMMMMMMMMMMMM");
                                    System.out.println("\t\t (_.__________/                         `?MMMM#MMMMMMMMMMMP");
                                    System.out.println("\t\t                                             `\"?MMMMMMMMP'");
                                    System.out.println("\t\t                                                  `?MMMP");

                                    System.out.println("\n\t\t\t\t   Take a deep breathe");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   Focusing yourself on point");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   Balancing your soul and body");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   Close your eyes and breathe");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   Finished yoga");
                                    System.out.println("\t\t\t   Your Soul Inteligent increased significantly");

                                    charac.downStamina(10);
                                    charac.upMood(30);
                                    charac.downHungry(15);
                                    charac.downMoney(15);

                                } else if (sport == 3) {

                                    //Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\n\n\t\t\t                      .-\"\"\"-.");
                                    System.out.println("\t\t\t                     /       \\");
                                    System.out.println("\t\t\t                    ;_.-\"\"\"-._;");
                                    System.out.println("\t\t\t .,_       __,.---.-(=(o)-(o)=)-.---.,__       _,.");
                                    System.out.println("\t\t\t '._'--\"```          \\   ^   /          ```\"--'_.'");
                                    System.out.println("\t\t\t    ``\"''~---~~%^%^.%.`._0_.'%,^%^%^~~---~''\"``");
                                    System.out.println("\t\t\t    ~^~- `^-% ^~.%~%.^~-%-~.%-^.% ~`% ~-`%^`-~^~");
                                    System.out.println("\t\t\t       ~^- ~^- `~.^- %`~.%~-'%~^- %~^- ~^");

                                    System.out.println("\n\t\t\t\t   Swim 50m");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   Swim 150m");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   Swimback 200m");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   Finished swimming");
                                    System.out.println("\t\t\t\t   It was nice to knew that you kept your health well.");

                                    charac.downStamina(30);
                                    charac.upMood(40);
                                    charac.downHungry(30);
                                    charac.downMoney(10);

                                } else if (sport == 4) {

                                    //Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\n\t\t\t\t   Warming Up");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   Take the first set");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   SetGame Break");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   Take the second set");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   Win the match and shake opponent's hands");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   Finished Badminton");
                                    System.out.println("\t\t\t\t   Your competitive soul significantly increased.");

                                    charac.downStamina(20);
                                    charac.upMood(40);
                                    charac.downHungry(25);
                                    charac.downMoney(20);

                                } else if (sport == 5) {

                                    //Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("\n\t\t\t\t   1 minute Sprint");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   3 minutes Sprint");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   6 minutes SprintBack");
                                    RpgUtil.delay(1000);
                                    System.out.print("\t\t\t\t   .");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.print(".");
                                    RpgUtil.delay(1000);
                                    System.out.println(".");
                                    System.out.println("\n\t\t\t\t   Finished Sprint");
                                    System.out.println("\t\t\t\t   Leg muscled significantly growed");

                                    charac.downStamina(30);
                                    charac.upMood(25);
                                    charac.downHungry(35);

                                }

                            } else if (re == 2) {

                                //Pembatas
                                System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                RpgUtil.delay(300);
                                System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                System.out.println(RpgUtil.ANSI_BLACK);

                                System.out.println("\t                                               ^^");
                                System.out.println("\t          ^^      ..                                       ..");
                                System.out.println("\t                  []                                       []");
                                System.out.println("\t                .:[]:_          ^^                       ,:[]:.");
                                System.out.println("\t              .: :[]: :-.                             ,-: :[]: :.");
                                System.out.println("\t            .: : :[]: : :`._                       ,.': : :[]: : :.");
                                System.out.println("\t          .: : : :[]: : : : :-._               _,-: : : : :[]: : : :.");
                                System.out.println("\t      _..: : : : :[]: : : : : : :-._________.-: : : : : : :[]: : : : :-._");
                                System.out.println("\t      _:_:_:_:_:_:[]:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:[]:_:_:_:_:_:_");
                                System.out.println("\t      !!!!!!!!!!!![]!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!![]!!!!!!!!!!!!!");
                                System.out.println("\t      ^^^^^^^^^^^^[]^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^[]^^^^^^^^^^^^^");
                                System.out.println("\t                  []                                       []");
                                System.out.println("\t                  []                                       []");
                                System.out.println("\t                  []                                       []");
                                System.out.println("\t       ~~^-~^_~^~/  \\~^-~^~_~^-~_^~-^~_^~~-^~_~^~-~_~-^~_^/  \\~^-~_~^-~~-");
                                System.out.println("\t      ~ _~~- ~^-^~-^~~- ^~_^-^~~_ -~^_ -~_-~~^- _~~_~-^_ ~^-^~~-_^-~ ~^");
                                System.out.println("\t         ~ ^- _~~_-  ~~ _ ~  ^~  - ~~^ _ -  ^~-  ~ _  ~~^  - ~_   - ~^_~");
                                System.out.println("\t           ~-  ^_  ~^ -  ^~ _ - ~^~ _   _~^~-  _ ~~^ - _ ~ - _ ~~^ -");
                                System.out.println("\t              ~^ -_ ~^^ -_ ~ _ - _ ~^~-  _~ -_   ~- _ ~^ _ -  ~ ^-");
                                System.out.println("\t                  ~^~ - _ ^ - ~~~ _ - _ ~-^ ~ __- ~_ - ~  ~^_-");

                                System.out.println("\n\n\t\t\t\t   Interaction Social menu ");
                                System.out.println("\n\t\t\t\t   1 . Say hi to Neighbours ");
                                System.out.println("\n\t\t\t\t   2 . Night Life Clubbing");
                                System.out.println("\n\t\t\t\t   3 . Cinema with Friends");
                                System.out.println("\n\t\t\t\t   4 . Neighbors Fishing Club ");
                                System.out.println("\n\t\t\t\t   5 . Neighbors Planting Clubs ");
                                System.out.println("\n\t\t\t\t   6 . Neighbors Cooking Club ");
                                System.out.print("\n\n\t\t\t\t   Choose your Interact Activity : ");
                                int is = entry.nextInt();

                                if (is == 1) {

                                    int Neighbours;

                                    //Pembatas
                                    System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);
                                    System.out.println("\n\t\t\t\t   Say hi to Neighbours ");

                                    System.out.println("\n\t\t\t\t   Neighbours : ");
                                    System.out.println("\n\t\t\t\t   1. Brandon Roberts");
                                    System.out.println("\n\t\t\t\t   2. Zac Rome Sullivan");
                                    System.out.println("\n\t\t\t\t   3. Mary Jane Pines");
                                    System.out.println("\n\t\t\t\t   4. Jo Smith");
                                    System.out.println("\n\t\t\t\t   5. Bernice lynn Moretz");
                                    System.out.println("\n\t\t\t\t   Who do you wanna talk to?");
                                    System.out.print("\n\n\t\t\t\t   Your Choice : ");
                                    Neighbours = entry.nextInt();
                                    int TalkMat;
                                    if (Neighbours == 1) {

                                        //Pembatas
                                        System.out.print("\n\".'.'.\" .\" '.\".");
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

                                        System.out.println("\t\t\t                              .     .");
                                        System.out.println("\t\t\t                                !!!!!!!");
                                        System.out.println("\t\t\t                        .       [[[|]]]    .");
                                        System.out.println("\t\t\t                        !!!!!!!!|--_--|!!!!!");
                                        System.out.println("\t\t\t                        [[[[[[[[\\_(X)_/]]]]]");
                                        System.out.println("\t\t\t                .-.     /-_--__-/_--_-\\-_--\\");
                                        System.out.println("\t\t\t                |=|    /-_---__/__-__-_\\__-_\\");
                                        System.out.println("\t\t\t            . . |=| ._/-__-__\\===========/-__\\_");
                                        System.out.println("\t\t\t            !!!!!!!!!\\========[ /]]|[[\\ ]=====/");
                                        System.out.println("\t\t\t           /-_--_-_-_[[[[[[[[[||==  == ||]]]]]]");
                                        System.out.println("\t\t\t          /-_--_--_--_|=  === ||=/^|^\\ ||== =|");
                                        System.out.println("\t\t\t         /-_-/^|^\\-_--| /^|^\\=|| | | | ||^\\= |");
                                        System.out.println("\t\t\t        /_-_-| | |-_--|=| | | ||=|_|_|=||\"|==|");
                                        System.out.println("\t\t\t       /-__--|_|_|_-_-| |_|_|=||______=||_| =|");
                                        System.out.println("\t\t\t      /_-__--_-__-___-|_=__=_.`---------'._=_|__");
                                        System.out.println("\t\t\t     /-----------------------\\===========/-----/");
                                        System.out.println("\t\t\t    ^^^\\^^^^^^^^^^^^^^^^^^^^^^[[|]]|[[|]]=====/");
                                        System.out.println("\t\t\t        |.' ..==::'\"'::==.. '.[ /~~~~~\\ ]]]]]]]");
                                        System.out.println("\t\t\t        | .'=[[[|]]|[[|]]]=`._||==  =  || =\\ ]");
                                        System.out.println("\t\t\t        ||== =|/ _____ \\|== = ||=/^|^\\=||^\\ ||");
                                        System.out.println("\t\t\t        || == `||-----||' = ==|| | | |=|| |=||");
                                        System.out.println("\t\t\t        ||= == ||:^s^:|| = == ||=| | | || |=||");
                                        System.out.println("\t\t\t        || = = ||:___:||= == =|| |_|_| ||_|=||");
                                        System.out.println("\t\t\t       _||_ = =||o---.|| = ==_||_= == =||==_||_");
                                        System.out.println("\t\t\t       \\__/= = ||:   :||= == \\__/[][][][][]\\__/");
                                        System.out.println("\t\t\t       [||]= ==||:___:|| = = [||]\\\\//\\\\//\\\\[||]");
                                        System.out.println("\t\t\t       }  {---'\"'-----'\"'- --}  {//\\\\//\\\\//}  {");
                                        System.out.println("\t\t\t     __[==]__________________[==]\\\\//\\\\//\\\\[==]_");
                                        System.out.println("\t\t\t    |`|~~~~|================|~~~~|~~~~~~~~|~~~~||");
                                        RpgUtil.delay(300);
                                        System.out.println("\t\t\t    |^| ^  |================|^   | ^ ^^ ^ |  ^ ||");
                                        RpgUtil.delay(300);
                                        System.out.println("\t\t\t   \\|//\\\\/^|/==============\\|/^\\\\\\^/^.\\^///\\\\//|///");
                                        RpgUtil.delay(300);
                                        System.out.println("\t\t\t  \"\"'\"\"'\"\"\".'..'. ' '. ''..'.\"\"'\"\"'\"\"'\"\"''\"''\"''\"\"");

                                        System.out.println("\n\n\t\t\t\t   You are chattering with Brandon\n");
                                        System.out.println("\n\t\t\t\t   What topic do you wanted to talk about?\n");
                                        System.out.println("\n\t\t\t\t   1. Donald Trump Being America's President");
                                        System.out.println("\n\t\t\t\t   2. The new Macbook Pro with TouchBar");
                                        System.out.println("\n\t\t\t\t   3. Family's Creme Brule Fine Formulas");
                                        System.out.println("\n\t\t\t\t   4. The Walking Dead Season 7 ");
                                        System.out.print("\n\n\t\t\t\t   Choose Your Topics : ");
                                        TalkMat = entry.nextInt();

                                        if (TalkMat == 1) {
                                            System.out.println("\n\tBrandon : I was goddamn surprised to heard that Donald Trump being The US President!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe      : So do I. We can't help but hope that he could be nice someday.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tBrandon : I don't think so. He was so racist and rude.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe      : Don't be that rude Don, just deal with it. There's nothing we can change lol.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Brandon.");

                                        } else if (TalkMat == 2) {
                                            System.out.println("\n\tMe      : Have you seen the New Macbook Pro Retina with TouchBar? Incredibly amazed me.  ");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tBrandon : Yeah I already took a look at it. But it cost too Expensive.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe      : That's Pathetic. $1900 is too expensive for a 13inch Mac.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tBrandon : Hope someday we could be a Millionare lol.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Brandon.");

                                        } else if (TalkMat == 3) {
                                            System.out.println("\n\tMe      : Have you tried our family's Creme Brule Formulas? Tasted so good!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tBrandon : Oh yeah? Please share that formulas to us on Neighbours cooking club please.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe      : Exactly Yay Don!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Brandon.");

                                        } else if (TalkMat == 4) {
                                            System.out.println("\n\tBrandon : I was so sad to saw Glenn's dead in 7th Season Walking dead ");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe      : I'll Find you Maggie. His last words broke me into tears.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tBrandon : Didn't know why but the misfortunes always came to Maggie.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe      : Glenn's Death was her most hurting misery.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Brandon.");

                                        }
                                    } else if (Neighbours == 2) {

                                        //Pembatas
                                        System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        System.out.println(RpgUtil.ANSI_BLACK);

                                        System.out.println("\t\t\t                 ..'''::::...");
                                        System.out.println("\t\t\t               .::'      `'''':::..");
                                        System.out.println("\t\t\t         '...::'               `.----.");
                                        System.out.println("\t\t\t                               /_.--._\\");
                                        System.out.println("\t\t\t                             ,  |=   |");
                                        System.out.println("\t\t\t                           ,/ \\,|  =-|");
                                        System.out.println("\t\t\t                         ,/ /`\\ \\,   |");
                                        System.out.println("\t\t\t                       ,/ /`___`\\ \\,-|");
                                        System.out.println("\t\t\t                     ,/ /'.-:\";-.`\\ \\|");
                                        System.out.println("\t\t\t                   ,/ /` //_|_|_\\\\ `\\ \\, ,/\\,");
                                        System.out.println("\t\t\t                 ,/ /`   ||_|_|_||   `\\;/ /\\ \\,");
                                        System.out.println("\t\t\t               ,/ /`     ||_|_|_||   ,/ /`/\\`\\ \\,");
                                        System.out.println("\t\t\t             ,/ /`    ==_`-------' ,/ /` ~\\/~ `\\ \\,");
                                        System.out.println("\t\t\t           ,/ /` __|     _       ,/ /`         =`\\ \\,");
                                        System.out.println("\t\t\t         ,/ /`==_     __|___-  ,/ /` ==-=|__|     `\\ \\,");
                                        System.out.println("\t\t\t       ,/ /`        --=      ,/ /`            __|-- `\\ \\,");
                                        System.out.println("\t\t\t     ,/ /`  |__ ..----.. = ,/ /`()    .-\"\"\"\"\"-.     ()`\\ \\,");
                                        System.out.println("\t\t\t    / /`|     .'_.-;;-._'./ /; {__} .'.-\"\"\"\"\"-.'.  {__} ;\\ \\");
                                        System.out.println("\t\t\t   |/`  |_| =/.; | || | ;|/` | |::|/.'  _____  '.\\ |::| | `\\|");
                                        System.out.println("\t\t\t        |   |/_|_|_||_|_|_\\| |=\\::/||  /|_|_|\\  || \\::/ |");
                                        System.out.println("\t\t\t        | -=|| | | || | | || |  || || |_|_|_|_| ||  |||_|");
                                        System.out.println("\t\t\t        | , ||-|-|-||-|-|-||=|  JL || |_|_|_|_| ||  JL  |");
                                        System.out.println("\t\t\t        |/_\\||_|_|_||_|_|_||-|'    ||   .:::.   ||=_   _|");
                                        System.out.println("\t\t\t        /_ (|| | | || | | || |  ==_|| /:::::::\\ || __P__|");
                                        System.out.println("\t\t\t        /_\\ \\|-|-|-||-|-|-|| |     || |::(`)::| ||/\\ |  `\\");
                                        System.out.println("\t\t\t       `>/ _\\\\_|_|_||_|_|_||-|-'|__|| \\/`\\+/`\\/ ||||_____|");
                                        System.out.println("\t\t\t       /_/   <-------------' |     ||()\\_/Y\\_/  ||/  || |");
                                        System.out.println("\t\t\t      /  ` \\_ ( ==_  __|-    |_|_  ||   / / \\   || =_|| |");
                                        System.out.println("\t\t\t     `/_) | _ <`   __        |   = ||  /_/ \\_\\  ||   || |");
                                        System.out.println("\t\t\t      >  /     \\ == _  ==_   | -   ||           ||=  || |");
                                        System.out.println("\t\t\t     /_/   ( \\  `\\ _| =__   =|-__|_||-----------||_| || |");
                                        RpgUtil.delay(300);
                                        System.out.println("\t\t\t    )-._/ _\\ _,-('    __.;-'-;__     `\"\"\"\"\"\"\"\"\"\"\"    ||`\"-._");
                                        RpgUtil.delay(300);
                                        System.out.println("\t\t\t   '-,._   \\__.-`-;''`          ``--'`\"\"'\"\"\"`\"\"\"``-- `--'--. '");
                                        RpgUtil.delay(300);
                                        System.out.println("\t\t\t        ```             ``         `\"\"\"\"'\"\"\"\"'\"`\"\"\".--------'");

                                        System.out.println("\n\n\tYou are chattering with Zac\n");
                                        System.out.println("\tWhat topic do you wanted to talk about?\n");
                                        System.out.println("\t1. Donald Trump Being America's President");
                                        System.out.println("\t2. The new Macbook Pro with TouchBar");
                                        System.out.println("\t3. Family's Creme Brule Fine Formulas");
                                        System.out.println("\t4. The Walking Dead Season 7 ");
                                        System.out.print("\n\tChoose Your Topics : ");
                                        TalkMat = entry.nextInt();

                                        if (TalkMat == 1) {
                                            System.out.println("\n\tZac : I was goddamn surprised to heard that Donald Trump being The US President!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe  : So do I. We can't help but hope that he could be nice someday.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tZac : I don't think so. He was so racist and rude.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe  : Don't be that rude Zac, just deal with it. There's nothing we can change lol.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Zac.");

                                        } else if (TalkMat == 2) {
                                            System.out.println("\n\tMe  : Have you seen the New Macbook Pro Retina with TouchBar? Incredibly amazed me.  ");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tZac : Yeah I already took a look at it. But it cost too Expensive.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe  : That's Pathetic. $1900 is too expensive for a 13inch Mac.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tZac : Hope someday we could be a Millionare lol.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Zac.");

                                        } else if (TalkMat == 3) {
                                            System.out.println("\n\tMe  : Have you tried our family's Creme Brule Formulas? Tasted so good!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tZac : Oh yeah? Please share that formulas to us on Neighbours cooking club please.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe  : Exactly Yay Zac!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Zac.");

                                        } else if (TalkMat == 4) {
                                            System.out.println("\n\tZac : I was so sad to saw Glenn's dead in 7th Season Walking dead ");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe  : I'll Find you Maggie. His last words broke me into tears.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tZac : Didn't know why but the misfortunes always came to Maggie.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe  : Glenn's Death was her most hurting misery.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Zac.");

                                        }
                                    } else if (Neighbours == 3) {

                                        //Pembatas
                                        System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        System.out.println(RpgUtil.ANSI_BLACK);

                                        System.out.println("\n\n\t                                      /\\");
                                        System.out.println("\t                                      /\\");
                                        System.out.println("\t                                      /\\");
                                        System.out.println("\t                                      /\\");
                                        System.out.println("\t                                    _`=='_");
                                        System.out.println("\t                                 _-~......~-_");
                                        System.out.println("\t                             _--~............~--_");
                                        System.out.println("\t                       __--~~....................~~--__");
                                        System.out.println("\t           .___..---~~~................................~~~---..___,");
                                        System.out.println("\t            `=.________________________________________________,='");
                                        System.out.println("\t               @^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^@");
                                        System.out.println("\t                        |  |  I   I   II   I   I  |  |");
                                        System.out.println("\t                        |  |__I___I___II___I___I__|  |");
                                        System.out.println("\t                        | /___I_  I   II   I  _I___\\ |");
                                        System.out.println("\t                        |'_     ~~~~~~~~~~~~~~     _`|");
                                        System.out.println("\t                    __-~...~~~~~--------------~~~~~...~-__");
                                        System.out.println("\t            ___---~~......................................~~---___");
                                        System.out.println("\t.___..---~~~......................................................~~~---..___,");
                                        System.out.println("\t `=.______________________________________________________________________,='");
                                        System.out.println("\t    @^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^@");
                                        System.out.println("\t              |   |    | |    |  |    ||    |  |    | |    |   |");
                                        System.out.println("\t              |   |____| |____|  |    ||    |  |____| |____|   |");
                                        System.out.println("\t              |__________________|____||____|__________________|");
                                        System.out.println("\t            _-|_____|_____|_____|__|------|__|_____|_____|_____|-_  ");

                                        System.out.println("\n\n\tYou are chattering with Mary\n");
                                        System.out.println("\tWhat topic do you wanted to talk about?\n");
                                        System.out.println("\t1. Donald Trump Being America's President");
                                        System.out.println("\t2. The new Macbook Pro with TouchBar");
                                        System.out.println("\t3. Family's Creme Brule Fine Formulas");
                                        System.out.println("\t4. The Walking Dead Season 7 ");
                                        System.out.print("\tChoose Your Topics : ");
                                        TalkMat = entry.nextInt();

                                        if (TalkMat == 1) {
                                            System.out.println("\n\tMary : I was goddamn surprised to heard that Donald Trump being The US President!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe   : So do I. We can't help but hope that he could be nice someday.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMary : I don't think so. He was so racist and rude.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe   : Don't be that rude Mary, just deal with it. There's nothing we can change lol.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Mary.");

                                        } else if (TalkMat == 2) {
                                            System.out.println("\n\tMe   : Have you seen the New Macbook Pro Retina with TouchBar? Incredibly amazed me.  ");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMary : Yeah I already took a look at it. But it cost too Expensive.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe   : That's Pathetic. $1900 is too expensive for a 13inch Mac.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMary : Hope someday we could be a Millionare lol.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Mary.");

                                        } else if (TalkMat == 3) {
                                            System.out.println("\n\tMe   : Have you tried our family's Creme Brule Formulas? Tasted so good!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMary : Oh yeah? Please share that formulas to us on Neighbours cooking club please.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe   : Exactly Yay Mary!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Mary.");

                                        } else if (TalkMat == 4) {
                                            System.out.println("\n\tMary : I was so sad to saw Glenn's dead in 7th Season Walking dead ");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe   : I'll Find you Maggie. His last words broke me into tears.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMary : Didn't know why but the misfortunes always came to Maggie.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe   : Glenn's Death was her most hurting misery.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Mary.");
                                        }
                                    } else if (Neighbours == 4) {

                                        //Pembatas
                                        System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        System.out.println(RpgUtil.ANSI_BLACK);

                                        System.out.println("\n\t\t                 :              _   _");
                                        System.out.println("\n\t\t         `.       ;       .'                 ,~-.");
                                        System.out.println("\n\t\t           `.  .-'''-.  .',~')       _ _    (    )~.");
                                        System.out.println("\n\t\t             ;'       `; (    `-.   ' V `  ,'       )~.  _ _");
                                        System.out.println("\n\t\t            /           ;-`      )        (          __)' v `");
                                        System.out.println("\n\t\t            |           (_         )~./\\    `~'--~'`~' _");
                                        System.out.println("\n\t\t       '''''|            (_    __    /##\\            ,' )_");
                                        System.out.println("\n\t\t                 \\           /(   _HH_,~/#/\\#\\          ( c'  `._");
                                        System.out.println("\n\t\t              `.       .'  `~[____]/#/==\\#\\       ,-' -' (_c )");
                                        System.out.println("\n\t\t             .' `-,,,-' `.    |=_|/#/= _=\\#\\      `>o  ~    '-.");
                                        System.out.println("\n\t\t           .'      ;      `.  |-=/#/=____=\\#\\     ( ~ ,~.~.,`-'),");
                                        System.out.println("\n\t\t            _  _   :        ` |=/#/=/,~~.\\=\\#\\    ,' (\\\\||,' `-'),");
                                        System.out.println("\n\t\t          .' \\/ `. :          |/#/=(/_)(_\\)=\\#\\  (`~ (_\\`|)o ~   )");
                                        System.out.println("\n\t\t                              /#/_= |_\\/_|  _\\#\\  >(   `~' ._,~ '-.");
                                        System.out.println("\n\t\t                             /#/ _=[______]= _\\#\\(' `~,  c    ~. c)");
                                        System.out.println("\n\t\t                            /#/=,---. _ = ___ =\\#\\`( (  ~ _.'   <'");
                                        System.out.println("\n\t\t                           /#/ /_____\\ ==/,-.\\ =\\#\\(  c   c___ ) )");
                                        System.out.println("\n\t\t                           `|=(/_|_|_\\) //.-.\\\\=_|' `-.__,' //`-'");
                                        System.out.println("\n\t\t                       `v@'~|= |_;_;_| =|     | =|       \\ |");
                                        System.out.println("\n\t\t               _/\\_/\\_,(c`@'|=[_______]=|  =()|==|_/\\_/\\_| |/\\_");
                                        System.out.println("\n\t\t              _,@`v-@'~ c@._|_['%8o&8']_|_____|__| || || | )||");

                                        System.out.println("\n\n\tYou are chattering with Jo\n");
                                        System.out.println("\tWhat topic do you wanted to talk about?\n");
                                        System.out.println("\t1. Donald Trump Being America's President");
                                        System.out.println("\t2. The new Macbook Pro with TouchBar");
                                        System.out.println("\t3. Family's Creme Brule Fine Formulas");
                                        System.out.println("\t4. The Walking Dead Season 7 ");
                                        System.out.print("\n\tChoose Your Topics : ");
                                        TalkMat = entry.nextInt();

                                        if (TalkMat == 1) {
                                            System.out.println("\n\tJo : I was goddamn surprised to heard that Donald Trump being The US President!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe : So do I. We can't help but hope that he could be nice someday.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tJo : I don't think so. He was so racist and rude.");
                                            RpgUtil.delay(2000);
                                            System.out.println("vMe : Don't be that rude Jo, just deal with it. There's nothing we can change lol.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Jo.");

                                        } else if (TalkMat == 2) {
                                            System.out.println("\n\tMe : Have you seen the New Macbook Pro Retina with TouchBar? Incredibly amazed me.  ");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tJo : Yeah I already took a look at it. But it cost too Expensive.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe : That's Pathetic. $1900 is too expensive for a 13inch Mac.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tJo : Hope someday we could be a Millionare lol.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("v.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Jo.");

                                        } else if (TalkMat == 3) {
                                            System.out.println("\n\tMe : Have you tried our family's Creme Brule Formulas? Tasted so good!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tJo : Oh yeah? Please share that formulas to us on Neighbours cooking club please.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe : Exactly Yay Jo!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Jo.");

                                        } else if (TalkMat == 4) {
                                            System.out.println("\n\tJo : I was so sad to saw Glenn's dead in 7th Season Walking dead ");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe : I'll Find you Maggie. His last words broke me into tears.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tJo : Didn't know why but the misfortunes always came to Maggie.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe : Glenn's Death was her most hurting misery.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Jo.");

                                        }
                                    } else if (Neighbours == 5) {

                                        //Pembatas
                                        System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        RpgUtil.delay(300);
                                        System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                        System.out.println(RpgUtil.ANSI_BLACK);

                                        System.out.println("\t\t\t                              .-----.");
                                        System.out.println("\t\t\t                            .'       `.");
                                        System.out.println("\t\t\t                           :      ^v^  :");
                                        System.out.println("\t\t\t                           :           :");
                                        System.out.println("\t\t\t                           '           '");
                                        System.out.println("\t\t\t            |~        www   `.       .'");
                                        System.out.println("\t\t\t           /.\\       /#^^\\_   `-/\\--'");
                                        System.out.println("\t\t\t          /#  \\     /#%    \\   /# \\");
                                        System.out.println("\t\t\t         /#%   \\   /#%______\\ /#%__\\");
                                        System.out.println("\t\t\t        /#%     \\   |= I I ||  |- |");
                                        System.out.println("\t\t\t        ~~|~~~|~~   |_=_-__|'  |[]|");
                                        System.out.println("\t\t\t          |[] |_______\\__|/_ _ |= |`.");
                                        System.out.println("\t\t\t   ^V^    |-  /= __   __    /-\\|= | :;");
                                        System.out.println("\t\t\t          |= /- /\\/  /\\/   /=- \\.-' :;");
                                        System.out.println("\t\t\t          | /_.=========._/_.-._\\  .:'");
                                        System.out.println("\t\t\t          |= |-.'.- .'.- |  /|\\ |.:'");
                                        System.out.println("\t\t\t          \\  |=|:|= |:| =| |~|~||'|");
                                        System.out.println("\t\t\t           |~|-|:| -|:|  |-|~|~||=|      ^V^");
                                        System.out.println("\t\t\t           |=|=|:|- |:|- | |~|~|| |");
                                        System.out.println("\t\t\t           | |-_~__=_~__=|_^^^^^|/___");
                                        System.out.println("\t\t\t           |-(=-=-=-=-=-(|=====/=_-=/\\");
                                        System.out.println("\t\t\t           | |=_-= _=- _=| -_=/=_-_/__\\ ");
                                        System.out.println("\t\t\t           | |- _ =_-  _-|=_- |]#| I II");
                                        System.out.println("\t\t\t           |=|_/ \\_-_= - |- = |]#| I II");
                                        System.out.println("\t\t\t           | /  _/ \\. -_=| =__|]!!!I_II!!");
                                        System.out.println("\t\t\t          _|/-'/  ` \\_/ \\|/' _ ^^^^`.==_^.");
                                        System.out.println("\t\t\t        _/  _/`-./`-; `-.\\_ / \\_'\\`. `. ===`.");
                                        System.out.println("\t\t\t       / .-'  __/_   `.   _/.' .-' `-. ; ====;\\");

                                        System.out.println("\n\n\tYou are chattering with Bernice\n");
                                        System.out.println("\tWhat topic do you wanted to talk about?\n");
                                        System.out.println("\t1. Donald Trump Being America's President");
                                        System.out.println("\t2. The new Macbook Pro with TouchBar");
                                        System.out.println("\t3. Family's Creme Brule Fine Formulas");
                                        System.out.println("\t4. The Walking Dead Season 7 ");
                                        System.out.print("\n\tChoose Your Topics : ");
                                        TalkMat = entry.nextInt();

                                        if (TalkMat == 1) {
                                            System.out.println("\n\tBernice : I was goddamn surprised to heard that Donald Trump being The US President!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe      : So do I. We can't help but hope that he could be nice someday.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tBernice : I don't think so. He was so racist and rude.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe      : Don't be that rude Lynn, just deal with it. There's nothing we can change lol.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(2000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Bernice.");

                                        } else if (TalkMat == 2) {
                                            System.out.println("\n\tMe      : Have you seen the New Macbook Pro Retina with TouchBar? Incredibly amazed me.  ");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tBernice : Yeah I already took a look at it. But it cost too Expensive.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe      : That's Pathetic. $1900 is too expensive for a 13inch Mac.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tBernice : Hope someday we could be a Millionare lol.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Bernice.");

                                        } else if (TalkMat == 3) {
                                            System.out.println("\n\tMe      : Have you tried our family's Creme Brule Formulas? Tasted so good!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tBernice : Oh yeah? Please share that formulas to us on Neighbours cooking club please.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe      : Exactly Yay Bernice!");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Bernice.");

                                        } else if (TalkMat == 4) {
                                            System.out.println("\n\tBernice : I was so sad to saw Glenn's dead in 7th Season Walking dead ");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe      : I'll Find you Maggie. His last words broke me into tears.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tBernice : Didn't know why but the misfortunes always came to Maggie.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tMe      : Glenn's Death was her most hurting misery.");
                                            RpgUtil.delay(2000);
                                            System.out.println("\tSo on");
                                            RpgUtil.delay(1000);
                                            System.out.print("\t.");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.print(".");
                                            RpgUtil.delay(1000);
                                            System.out.println(".");
                                            System.out.println("\tFinished Talking with Bernice.");
                                        }

                                    }

                                    charac.upInteract(20);
                                    charac.downStamina(5);
                                    charac.downHungry(5);
                                    charac.upExperience(5);
                                    charac.upBore(5);
                                } else if (is == 2) {
                                    System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("Night Life Clubbing ");

                                    charac.upInteract(30);
                                    charac.downStamina(20);
                                    charac.downHungry(20);
                                    charac.upExperience(10);
                                    charac.upBore(20);
                                    charac.upHours(3);
                                    charac.downMoney(10);
                                } else if (is == 3) {
                                    System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("Cinema with Friends ");

                                    charac.upInteract(50);
                                    charac.downStamina(20);
                                    charac.downHungry(20);
                                    charac.upExperience(10);
                                    charac.upBore(20);
                                    charac.upHours(3);
                                    charac.downMoney(10);
                                } else if (is == 4) {
                                    System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("Neighbors Fishing Club ");

                                    charac.upInteract(50);
                                    charac.downStamina(30);
                                    charac.downHungry(25);
                                    charac.upExperience(20);
                                    charac.upBore(20);
                                    charac.upHours(6);
                                    charac.downMoney(30);
                                } else if (is == 5) {
                                    System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("Neighbors Planting Club ");

                                    charac.upInteract(50);
                                    charac.downStamina(30);
                                    charac.downHungry(25);
                                    charac.upExperience(20);
                                    charac.upBore(20);
                                    charac.upHours(6);
                                    charac.downMoney(30);
                                } else if (is == 4) {
                                    System.out.print("\n" + RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.print(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    RpgUtil.delay(300);
                                    System.out.println(RpgUtil.ANSI_GREEN + "\".'.'.\" .\" '.\".");
                                    System.out.println(RpgUtil.ANSI_BLACK);

                                    System.out.println("Neighbors Cooking Club ");

                                    charac.upInteract(50);
                                    charac.downStamina(30);
                                    charac.downHungry(25);
                                    charac.upExperience(20);
                                    charac.upBore(20);
                                    charac.upHours(6);
                                    charac.downMoney(30);
                                }
                            }

                        } else if (menu == 6) // save game 
                        {
                            FileUtilV4 futil = new FileUtilV4();

                            // open existing file
                            String s1 = futil.openWriteFile("rpg.txt");
                            System.out.println(s1);

                            // define text formatting
                            String txtFormat = "%s,%s,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d";

                            // add record 1
                            String name1 = charac.firstname;
                            String name2 = charac.lastname;
                            int age1 = charac.age;
                            int gender1 = charac.gender;
                            int stamina1 = charac.stamina;
                            int money1 = charac.money;
                            int hours1 = charac.hours;
                            int clean1 = charac.clean;
                            int interact1 = charac.interact;
                            int hungry1 = charac.hungry;
                            int level1 = charac.level;
                            int experience1 = charac.experience;
                            int days1 = charac.days;
                            int mood1 = charac.mood;
                            int bore1 = charac.bore;
                            String s2 = futil.addWriteRecord(txtFormat, name1, name2, age1, gender1, level1, experience1, money1, mood1, days1, hours1, bore1, clean1, interact1, hungry1, stamina1);
                            System.out.println(s2);

                            // close opening file
                            String s4 = futil.closeWriteFile();
                            System.out.println(s4);

                        }
                    } while (menu != 0);
                    menuEntry = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Must be enter with numeric");
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getLocalizedMessage());
                }

            }
            
            if (charac.upMoney(0)>=100000) {
               
                System.out.println("");
                 finish = true;
            } else if (charac.upLevel() >= 7 ) {
                System.out.println("bye bye ");
                System.out.println("Finish game ");
                finish = true ;
            } else if (charac.upDays() >=500 ) {
                finish = true;
            }
        } while (finish == false);

    }

}
