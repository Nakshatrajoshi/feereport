
// package ;
import java.util.ArrayList;
import java.util.Scanner;

class sign {
    public void s() {
        System.out.println("========== SIGN UP PAGE ==========");
        name();
        gender();
        caste();
        semister();
        mobile();
    }

    void name() {
        System.out.println("Enter your first name: ");
        Scanner sc = new Scanner(System.in);
        String f = sc.next();
        System.out.println("Enter your last name: ");
        String l = sc.next();
        System.out.println("you enter the : " + f + l);
    }

    void gender() {
        System.out.println("select  your gender:\n " + "1). male  = \n" + "2). female =\n" + "3). transgender = \n");
        Scanner sc = new Scanner(System.in);
        int ge = sc.nextInt();
        System.out.println("please select your gender  : " + ge);
        switch (ge) {
            case 1:
                System.out.println("you select male");
                break;
            case 2:
                System.out.println("you select female");
                break;
            case 3:
                System.out.println("you select transgender");
                break;
        }
    }

    void caste() {
        System.out.println("Enter your caste: " + "Genral" + "OBC " + " ST/SC ");
        Scanner sc = new Scanner(System.in);
        int ca = sc.nextInt();
        System.out.println("you enter the: " + ca);
        switch (ca) {
            case 1:
                System.out.println("you select the genral caste");
                break;
            case 2:
                System.out.println("you select the OBC caste");
                break;
            case 3:
                System.out.println("you select the ST/SC caste");
                break;
        }
    }

    void mobile() {
        System.out.println("Enter your mobile number: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("your Enter the : " + m);
    }

    void semister() {
        System.out.println("Enter your semister : ");
        Scanner i = new Scanner(System.in);
        int s = i.nextInt();
        System.out.println("you enter the : " + s);
        switch (s) {
            case 1:
                System.out.println("you are from 1st semister ");
                break;
            case 2:
                System.out.println("you are from 2st semister ");
                break;
            case 3:
                System.out.println("you are from 3st semister ");
                break;
            case 4:
                System.out.println("you are from 4st semister ");
                break;
            case 5:
                System.out.println("you are from 5st semister ");
                break;
            case 6:
                System.out.println("you are from 6st semister ");
                break;
            case 7:
                System.out.println("you are from 7st semister ");
                break;
            case 8:
                System.out.println("you are from 8st semister ");
                break;
        }
    }
}

class log {
    void logo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your mobile number");
        long mb = s.nextLong();
        System.out.println("Enetr your password");
        String pass = s.next();
        System.out.println("you Enetr   " + mb);
        System.out.println("you Enetr   " + pass);

    }
}

class star {
}

class tution {

}

 class page_2 { 

    void tut() {
        System.out.println("***************************tution == FEE **********************************") ;
        System.out.println("you are in the semister ") ;
        System.out.println("or in this year " );
        
    }
}
 class hostel {
    void host() {
        System.out.println("                  Room Type & Sharing            ");
        System.out.println("which type of rooms do you want \n" + " 1). Ac-with attached washroom 3 sharing \n"
                + " 2). Ac-with attached washroom 2 sharing\n" + "3). Non Ac - with attached washroom 3 sharing \n"
                + "4) .Non Ac - with atttached wahroom 2 sharing \n"
                + " 5). Non Ac-with common washroom 3 & 4 sharing \n" + "6). Non Ac with common washroom 3 sharing\n"
                + "7). Non Ac - with attached washroom 2 sharing" + "8). Ac- with seperate washroom no sharing \n"
                + "9). Non Ac-with seperate washroom no sharing \n");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println(". you choose :-Ac-with attached washroom 3 sharing ");
                System.out.println("1). if you want to pay your fees yearly \n"
                        + "2). if you want pay fees semesiter wise and Mess fees included\n");
                int year = sc.nextInt();
                if (year == 1) {
                    System.out.println("you to have selected to pay fees yearly and Mess fees included");
                    System.out.println("Total Amount for 4 year = 1,93,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 1,35,000");
                }
                if (year == 2) {
                    System.out.println("you to have selected to pay fees semesiter wise and Mess fees included");
                    System.out.println("Total Amount for 4 year semister wise = 2,13,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 1,55,000");
                    break;
                }

            case 2:
                System.out.println("you choose :-  Ac-with attached washroom 2 sharing");
                System.out.println("1). if you want to pay your fees yearly \n"
                        + "2). if you want pay fees semesiter wise and Mess fees included \n");
                int e = sc.nextInt();
                if (e == 1) {
                    System.out.println("you to have selected to pay fees yearly and Mess fees included");
                    System.out.println("Total Amount for 4 year = 2,58,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 2,35,000");
                }
                if (e == 2) {
                    System.out.println("you to have selected to pay fees semesiter wise and Mess fees included");
                    System.out.println("Total Amount for 4 year semister wise = 2,58,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 2,00,000");
                    break;
                }
            case 3:
                System.out.println("you choose :- Non Ac - with attached washroom 3 sharing");
                System.out.println("1). if you want to pay your fees yearly \n"
                        + "2). if you want pay fees semesiter wise and Mess fees included \n");
                int a = sc.nextInt();
                if (a == 1) {
                    System.out.println("you to have selected to pay fees yearly and Mess fees included");
                    System.out.println("Total Amount for 4 year = 1,08,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 50,000");
                }
                if (a == 2) {
                    System.out.println("you to have selected to pay fees semesiter wise and Mess fees included");
                    System.out.println("Total Amount for 4 year semister wise = 1,14,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 56,500");
                    break;
                }
            case 4:
                System.out.println("you choose :-.Non Ac - with atttached wahroom 2 sharing");
                System.out.println("1). if you want to pay your fees yearly \n"
                        + "2). if you want pay fees semesiter wise and Mess fees included \n");
                int r = sc.nextInt();
                if (r == 1) {
                    System.out.println("you to have selected to pay fees yearly and Mess fees included");
                    System.out.println("Total Amount for 4 year = 1,34,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 76,000");

                }
                if (r == 2) {
                    System.out.println("you to have selected to pay fees semesiter wise and Mess fees included");
                    System.out.println("Total Amount for 4 year semister wise = 1,43,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 85,000");
                    break;
                }
            case 5:
                System.out.println("you choose :- Non Ac-with common washroom 3 & 4 sharing");
                System.out.println("1). if you want to pay your fees yearly \n"
                        + "2). if you want pay fees semesiter wise and Mess fees included \n");
                int y = sc.nextInt();
                if (y == 1) {
                    System.out.println("you to have selected to pay fees yearly and Mess fees included");
                    System.out.println("Total Amount for 4 year = 1,00,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 42,000");

                }
                if (y == 2) {
                    System.out.println("you to have selected to pay fees semesiter wise and Mess fees included");
                    System.out.println("Total Amount for 4 year semister wise = 1,04,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 46,000");
                    break;
                }
            case 6:
                System.out.println("you choose :- Non Ac with common washroom 3 sharing");
                System.out.println("1). if you want to pay your fees yearly \n"
                        + "2). if you want pay fees semesiter wise and Mess fees included \n");
                int z = sc.nextInt();
                if (z == 1) {
                    System.out.println("you to have selected to pay fees yearly and Mess fees included");
                    System.out.println("Total Amount for 4 year = 1,00,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 42,000");

                }
                if (z == 2) {
                    System.out.println("you to have selected to pay fees semesiter wise and Mess fees included");
                    System.out.println("Total Amount for 4 year semister wise = 1,04,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 46,000");
                    break;
                }
            case 7:
                System.out.println("you choose :-Non Ac - with attached washroom 2 sharing");
                System.out.println("1). if you want to pay your fees yearly \n"
                        + "2). if you want pay fees semesiter wise and Mess fees included \n");
                int d = sc.nextInt();
                if (d == 1) {
                    System.out.println("you to have selected to pay fees yearly and Mess fees included");
                    System.out.println("Total Amount for 4 year = 1,14,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 56,000");

                }
                if (d == 2) {
                    System.out.println("you to have selected to pay fees semesiter wise and Mess fees included");
                    System.out.println("Total Amount for 4 year semister wise = 1,28,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 70,000");
                    break;
                }
            case 8:
                System.out.println("you choose :-Ac- with seperate washroom no sharing");
                System.out.println("1). if you want to pay your fees yearly \n"
                        + "2). if you want pay fees semesiter wise and Mess fees included \n");
                int p = sc.nextInt();
                if (p == 1) {
                    System.out.println("you to have selected to pay fees yearly and Mess fees included");
                    System.out.println("Total Amount for 4 year = 1,24,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 56,000");

                }
                if (p == 2) {
                    System.out.println("you to have selected to pay fees semesiter wise and Mess fees included");
                    System.out.println("Total Amount for 4 year semister wise = 1,34,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 70,000");
                    break;
                }
            case 9:
                System.out.println("you choose :- Non Ac-with seperate washroom no sharing ");
                System.out.println("1). if you want to pay your fees yearly \n"
                        + "2). if you want pay fees semesiter wise and Mess fees included \n");
                int g = sc.nextInt();
                if (g == 1) {
                    System.out.println("you to have selected to pay fees yearly and Mess fees included");
                    System.out.println("Total Amount for 4 year = 1,14,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 56,000");

                }
                if (g == 2) {
                    System.out.println("you to have selected to pay fees semesiter wise and Mess fees included");
                    System.out.println("Total Amount for 4 year semister wise = 1,24,000");
                    System.out.println(" Mess Fees = 58,000");
                    System.out.println("Hostel Fees = 70,000");
                    break;
                }

        }
    }
}


public class feereport {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("Please select no :- " + "1). signup   \n" + "2). login \n");
        Scanner i = new Scanner(System.in);
        a = i.nextInt();
        if (a == 1) {
            // System.out.println("=====sign up ======");
            sign sa = new sign();
            sa.s();

        } else {
            System.out.println("======LOGIN======");
            log l = new log();
            l.logo();

        }
        hostel hos = new hostel() ;
        hos.host();
    }
}