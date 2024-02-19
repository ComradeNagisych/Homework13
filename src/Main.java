public class Main {
    public static void main(String[] args) {
        HogwartsMethods hogwarts = new HogwartsMethods();
        Gryffindor harry = new Gryffindor("Harry", "Potter", 39, 5, 33, 64, 18);
        Gryffindor hermione = new Gryffindor("Hermione", "Granger", 54, 73, 41, 56, 47);
        Gryffindor ron = new Gryffindor("Ron", "Weasley", 14, 58, 22, 56, 58);
        Slytherin draco = new Slytherin("Draco", "Malfoy", 99, 23, 76, 64, 77, 67, 97);
        Slytherin graham = new Slytherin("Graham", "Montague", 41, 58, 81, 20, 42, 35, 63);
        Slytherin gregory = new Slytherin("Gregory", "Goyle", 70, 81, 47, 19, 38, 17, 94);
        Hufflepuff zacharias = new Hufflepuff("Zacharias", "Smith", 1, 89, 71, 89, 71);
        Hufflepuff cedric = new Hufflepuff("Cedric", "Diggory", 48, 34, 97, 47, 93);
        Hufflepuff justin = new Hufflepuff("Justin", "Finch-Fletchley", 6, 67, 34, 62, 67);
        Ravenclaw cho = new Ravenclaw("Cho", "Chang", 3, 75, 72, 92, 85, 91);
        Ravenclaw padma = new Ravenclaw("Padma", "Patil", 42, 86, 94, 81, 18, 42);
        Ravenclaw marcus = new Ravenclaw("Marcus", "Belby", 64, 78, 100, 67, 17, 93);
        hogwarts.printStudent(harry);
        hogwarts.printStudent(hermione);
        hogwarts.printStudent(ron);
        hogwarts.printStudent(draco);
        hogwarts.printStudent(graham);
        hogwarts.printStudent(gregory);
        hogwarts.printStudent(zacharias);
        hogwarts.printStudent(cedric);
        hogwarts.printStudent(justin);
        hogwarts.printStudent(cho);
        hogwarts.printStudent(padma);
        hogwarts.printStudent(marcus);
        hogwarts.compareGryffindorStudents(harry, hermione);
        hogwarts.compareSlytherinStudents(draco, gregory);
        hogwarts.compareHufflepuffStudents(cedric, zacharias);
        hogwarts.compareRavenclawStudents(marcus, padma);
        hogwarts.compareAnyStudents(harry, draco);
    }
}