// מחלקה ראשית
// מחלקה - class מחלקה היא מבנה שמכיל משתנים ופונקציות שקשורות לאובייקט מסויים
public class Main {
    public static void main(String[] args) {
        // יצירת משתנים
        int age1 = 20;
        int age2 = 15;
        // משתנה שמכיל מספר שלם
        double height1 = 1.95;
        double height2 = 1.75;
        // משתנה שמכיל מספר ממשי
        String name1 = "Alice";
        String name2 = "shlomi";

        Person moshe = new Person("alice", age1, height1);
        Person meow = new Person(name2,age2,height2);
        // משתנה שמכיל מחרוזת טקסט

        // (בפייתון print כמו) הדפסת המשתנים למסך
        System.out.println("Name: " + name1);
        System.out.println("Age: " + age1);
        System.out.println("Height: " + height1);

        //(שקיים( שימוש בקונסטרקטור person יצירת משתנה מסוג
        

        // הדפסת פרטי האובייקט
        moshe.printDetails();
        meow.printDetails();

        // שימוש בפעולות ה-Getter וה-Setter
        // Get-  פונקצייה שמחזירה את הערכים של המשתנים הפרטיים במחלקה
        // Set- פונקצייה שמעדכנת את הערכים של המשתנים הפרטיים במחלקה
        System.out.println("old name:" + moshe.getName());
        moshe.setName("Bob");
        System.out.println("Updated Name: " + moshe.getName());
    }
}
