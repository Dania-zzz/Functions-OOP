public static void main(String[] args) {
    Student std1 = new Student("Dania Ramadan", 22, 3.7);
    Student std2 = new Student("Khadija Saleh", 23, 4);
    Student std3 = new Student("Esra Elmahdi", 22, 3.9);

    System.out.println("Student 1: ");
    std1.introduce();
    System.out.println("Student 2: ");
    std2.introduce();
    System.out.println("Student 3: ");
    std3.introduce();
}