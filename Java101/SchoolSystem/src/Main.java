public class Main {
    public static void main(String[] args) {

        Course math = new Course("Matematik", "MAT101", "MAT");
        Course phy = new Course("Fizik", "FZK101", "FZK");
        Course chem = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        math.addTeacher(t1);
        math.printTeacher();
        phy.addTeacher(t2);
        phy.printTeacher();
        chem.addTeacher(t3);
        chem.printTeacher();

        Student student1 = new Student("Berke", "4373", "11-A", math, chem, phy);
        student1.addBulkExamNote(70, 60, 55, 45, 90, 100);
        student1.printNote();
        student1.calcAverage();
        student1.isPass();
    }
}