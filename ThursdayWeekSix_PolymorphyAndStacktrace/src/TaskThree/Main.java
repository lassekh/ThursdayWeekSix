package TaskThree;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Math");
        courses.add("Biology");
        courses.add("Geography");
        courses.add("Cooking");
        courses.add("Java 1.0");

        //Students ---------------------
        ArrayList<String> s1c = new ArrayList<>();
        s1c.add(courses.get(0));
        s1c.add(courses.get(4));
        Student s1 = new Student("Hans",s1c);

        ArrayList<String> s2c = new ArrayList<>();
        s2c.add(courses.get(3));
        Student s2 = new Student("Lone",s2c);

        ArrayList<String> s3c = new ArrayList<>();
        s3c.add(courses.get(2));
        Student s3 = new Student("Ibrahim",s3c);

        //Teachers ------------------------
        ArrayList<String> t1c = new ArrayList<>();
        t1c.add(courses.get(1));
        t1c.add(courses.get(4));
        Student t1 = new Student("Helen",s1c);

        ArrayList<String> t2c = new ArrayList<>();
        t2c.add(courses.get(0));
        Student t2 = new Student("Mohammed",s2c);

        ArrayList<String> t3c = new ArrayList<>();
        t3c.add(courses.get(3));
        Student t3 = new Student("Jens",s3c);

        //Saving all student and teachers in ArrayList<Person>
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(t1);
        persons.add(t2);
        persons.add(t3);

        for(Person p : persons){
            boolean added = p.addCourse("Java 1.0");
            if(added == false){
                if(p instanceof Student) {
                    System.out.println(p.getName()+" har allerede bestået dette kursus.");
                } else if (p instanceof Teacher){
                    System.out.println(p.getName()+"  kan ikke undervise i dette fag.");
                }
            }
        }
    }
}
