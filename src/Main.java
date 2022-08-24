public class Main {
    public static void main(String[] args) {

        // Домашнее задание 1 Задача 1
var dog = 8;
var cat = 3.6;
var paper = 763789;
System.out.println(dog);
System.out.println(cat);
System.out.println(paper);

// Домашнее задание 1 Задача 2
dog = dog + 4;
cat = cat + 4;
paper = paper + 4;
System.out.println(dog);
System.out.println(cat);
System.out.println(paper);

// Домашнее задание 1 Задача 3
var dogPip = 8.0;
dogPip = dogPip - 3.5;
cat = cat - 1.6;
paper = paper - 7639;
System.out.println(dogPip);
System.out.println(cat);
System.out.println(paper);

// Домашнее задание 2 Задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Домашнее задание 2 Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Домашнее задание 3 Задание 6
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightAllBoxer = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес двух боксеров составляет " + weightAllBoxer + " килограмма.");
        var weightDiffAllBoxer = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе боксеров составляет " + weightDiffAllBoxer + " килограмма.");

        // Домашнее задание 3 Задание 7
            var weightSportsmen1 = 78.2;
            var weightSportsmen2 = 82.7;
            var weightDiffSportsmen = weightSportsmen2 - weightSportsmen1;
            System.out.println("Разница в весе спортсменов составляет " + weightDiffSportsmen + " килограмма.");
            var overweight = weightSportsmen2 % weightSportsmen1;
            System.out.println("Превышение веса второго спортсмена над весом первого спортсмена составляет " + overweight + " килограмма.");

            // Домашнее задание 3 Задание 8
            var workingHours = 630;
            var workingHoursOneWorker = 8;
            var amountOfWorkers = workingHours / workingHoursOneWorker;
            System.out.println("Всего работников в компании - " + amountOfWorkers + " человек.");
            var amountOfWorkersNew = amountOfWorkers + 94;
            var workingHoursNew = amountOfWorkersNew * workingHoursOneWorker;
            System.out.println("Если в компании работает " + amountOfWorkersNew + " человека, то всего " + workingHoursNew + " часов работы может поделено между сотрудниками.");
    }
}
