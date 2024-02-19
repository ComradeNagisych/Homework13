public class HogwartsMethods {
    public void printStudent(Hogwarts student) {
        System.out.println(student);
    }
    public void compareGryffindorStudents (Gryffindor first, Gryffindor second) {
        int firstTotal = first.getBravery() + first.getHonor() + first.getNobility();
        int secondTotal = second.getBravery() + second.getHonor() + second.getNobility();
        if (firstTotal > secondTotal) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " лучший гриффиндорец, чем " + second.getName() + " " + second.getSurname());
        } else if (firstTotal == secondTotal) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " такой же гриффиндорец, как и " + second.getName() + " " + second.getSurname());
        } else if (firstTotal < secondTotal) {
            System.out.println("Студент " + second.getName() + " " + second.getSurname() + " лучший гриффиндорец, чем " + first.getName() + " " + first.getSurname());
        }
    }
    public void compareSlytherinStudents (Slytherin first, Slytherin second) {
        int firstTotal = first.getCunning() + first.getDetermination() + first.getAmbitions() + first.getInventiveness() + first.getPowerHungry();
        int secondTotal = second.getCunning() + second.getDetermination() + second.getAmbitions() + second.getInventiveness() + second.getPowerHungry();
        if (firstTotal > secondTotal) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " лучший слизеринец, чем " + second.getName() + " " + second.getSurname());
        } else if (firstTotal == secondTotal) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " такой же слизеринец, как и " + second.getName() + " " + second.getSurname());
        } else if (firstTotal < secondTotal) {
            System.out.println("Студент " + second.getName() + " " + second.getSurname() + " лучший слизеринец, чем " + first.getName() + " " + first.getSurname());
        }
    }
    public void compareHufflepuffStudents (Hufflepuff first, Hufflepuff second) {
        int firstTotal = first.getHardWork() + first.getLoyalty() + first.getHonesty();
        int secondTotal = second.getHardWork() + second.getLoyalty() + second.getHonesty();
        if (firstTotal > secondTotal) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " лучший пуффендуец, чем " + second.getName() + " " + second.getSurname());
        } else if (firstTotal == secondTotal) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " такой же пуффендуец, как и " + second.getName() + " " + second.getSurname());
        } else if (firstTotal < secondTotal) {
            System.out.println("Студент " + second.getName() + " " + second.getSurname() + " лучший пуффендуец, чем " + first.getName() + " " + first.getSurname());
        }
    }
    public void compareRavenclawStudents (Ravenclaw first, Ravenclaw second) {
        int firstTotal = first.getIntelligence() + first.getWisdom() + first.getWit() + first.getArt();
        int secondTotal = second.getIntelligence() + second.getIntelligence() + second.getWit() + second.getArt();
        if (firstTotal > secondTotal) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " лучший когтевранец, чем " + second.getName() + " " + second.getSurname());
        } else if (firstTotal == secondTotal) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " такой же когтевранец, как и " + second.getName() + " " + second.getSurname());
        } else if (firstTotal < secondTotal) {
            System.out.println("Студент " + second.getName() + " " + second.getSurname() + " лучший когтевранец, чем " + first.getName() + " " + first.getSurname());
        }
    }
    public void compareAnyStudents (Hogwarts first, Hogwarts second) {
        if (first.getMagicPower() > second.getMagicPower()) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " обладает большей силой магии, чем студент "+ second.getName() + " " + second.getSurname());
        } else if (first.getMagicPower() == second.getMagicPower()) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " и студент " + second.getName() + " " + second.getSurname() + " равны по силе магии");
        } else if (first.getMagicPower() < second.getMagicPower()) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " обладает меньшей силой магии, чем студент " + second.getName() + " " + second.getSurname());
        }
        if (first.getTransgression() > second.getTransgression()) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " может трансгрессировать дальше, чем студент "+ second.getName() + " " + second.getSurname());
        } else if (first.getTransgression() == second.getTransgression()) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " и студент " + second.getName() + " " + second.getSurname() + " равны по расстоянию трансгрессии");
        } else if (first.getTransgression() < second.getTransgression()) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " может трансгрессировать ближе, чем студент " + second.getName() + " " + second.getSurname());
        }
    }
}
