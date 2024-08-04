
import java.util.*;
class Main {
    String name;
    int UID;
    float phy;
    float che;
    float bio;
    float mal;
    float geo;
    float his;
    float maths;
    float gra;
    float lit;
    float comp;
    int gt = 1000;
    float tot;
    float pt;
    int choice;
    String test;
    String captcha;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your UID Number: ");
        UID = sc.nextInt();
        System.out.println("Enter your Exam Name:");
        test = sc.nextLine();
        test = sc.nextLine();
        System.out.println("Read this CAPTCHA to prove you are not a Robot:");
        System.out.println("C12n78oP");
        captcha = sc.nextLine();
        if (captcha.equals("C12n78oP")) {

            System.out.println("Enter your Marks Scored as Below out of 100: ");
            System.out.println("Example: PHYSICS : 78 ");
            System.out.println("PHYSICS");
            phy = sc.nextFloat();
            System.out.println("CHEMISTRY");
            che = sc.nextFloat();
            System.out.println("BIOLOGY");
            bio = sc.nextFloat();
            System.out.println("MALAYALAM (Opted)");
            mal = sc.nextFloat();
            System.out.println("GEOGRAPHY");
            geo = sc.nextFloat();
            System.out.println("HISTORY");
            his = sc.nextFloat();
            System.out.println("MATHEMATICS");
            maths = sc.nextFloat();
            System.out.println("ENGLISH 1 (Grammar)");
            gra = sc.nextFloat();
            System.out.println("ENGLISH 2 (Literature)");
            lit = sc.nextFloat();
            System.out.println("COMPUTER SCIENCE");
            comp = sc.nextFloat();
            System.out.println("Enter your previous total:");
            pt = sc.nextFloat();
        } else {
            System.out.println("Wrong CAPTCHA. Try Again");
        }
    }
    public void compute() {
        tot = phy + che + bio + mal + geo + his + maths + gra + lit + comp;

    }

    public void display() {
        System.out.println("SHORT COMPUTER ANALYSIS");
        System.out.println("😀 Have Patience. We will get you right away...");
        try {
            Thread.sleep(6000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(test);
        System.out.println("Name: " + name);
        System.out.println("UID: " + UID);
        System.out.println("");
        System.out.println("Total : " + tot);
        System.out.println("Average : " + tot / 10);
        System.out.println("Percentage : " + (tot / 1000) * 100 + "%");
        if (tot >= 800) {
            System.out.println("Grade :D(Distinction):🤩 Excellent!");
        } else if (tot >= 700) {
            System.out.println("Grade :F(First Class):😀 Better. ");
        } else if (tot >= 600) {
            System.out.println("Grade :S(Second Class): 😊Good. Try Harder ");
        } else if (tot >= 500) {
            System.out.println("Grade :T(Third Class). 😥Needs attention");
        } else {
            System.out.println("FAILED.⚠️ Try again hard next time.");
        }
        System.out.println("Previous Exam Total : "+pt);
        System.out.println("");
        System.out.println("COMPUTER's REMARK");
        if (pt < tot) {
            System.out.println("EXCELLENT. YOU HAVE IMPROVED A LOT.😊⭐");
        }
        else if(tot==0.0){
            System.out.println("📸 It seems you have entered wrong CAPTCHA.");
        }
        else if (pt==tot) {
            System.out.println("What a coincidence! Same mark😀");
        }

        else{
            System.out.println("You have came a bit down from your previous total. You could Improve.😥");

        }
        System.out.println("Thank you for using IntelliJ");
        System.out.println("");
        System.out.println("Let us know your kind feedback:");
        Scanner sc = new Scanner(System.in);
        String feedback = sc.nextLine();
        sc.close();
        System.out.println("THANK YOU!");

    }
    public static void main(String[]Args){
        Main m = new Main();
        m.input();
        m.compute();
        m.display();

    }
}