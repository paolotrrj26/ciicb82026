package chapter2.examples;

public class IfSwitchStatementLesson {
    
    public static void main(String[] args) {
        int hourOfDay = 19;

        // if(hourOfDay < 11)
        //     System.out.println("Good Morning");
        //     System.out.println("Good Morning");

        // if(hourOfDay < 11) {
        //     System.out.println("Good Morning");
        // }else {
        //     System.out.println("Good Afternoon 1");
        //     System.out.println("Good Afternoon 2");
        // }

        //if, else if, else

        if(hourOfDay >= 18) {
            System.out.println("Good Evening");
        }else if(hourOfDay >= 12) {
            System.out.println("Good Afternoon");
        }else {
            System.out.println("Good Morning");
        }

        //ternary operator ?
        //System.out.println((hourOfDay < 12) ? "Good Morning" : "Good Afternoon");

        //switch
        int dayOfWeek = 6;
        switch(dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekends");
                break;
        }
    }
}
