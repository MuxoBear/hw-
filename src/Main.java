public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 8;
        if (age >=18){
            System.out.println("Поздравляю вас с совершеннолетием");
        }else {
            System.out.println("Возраст совершеннолетие еще не наступил, нужно подождать");
        }

        //задание 2
        System.out.println("Задание 2");
        if (age >= 7 && age <18){
            System.out.println("Ребенок ходит в школу");
        }
        else if (age >18 && age <=24){
            System.out.println("Человек ходит в университет");
        }
        else if (age > 24){
            System.out.println("Человек ходит на работу");
        }

        // Задание 3
        System.out.println("Задание 3");
        int wagonCapacity = 102;
        int seatPlace = 60;
        int otherPlaces = wagonCapacity-seatPlace;

        int seatedPassengers = 45;
        int otherPassengers = 42;
        if (seatedPassengers < seatPlace){
            System.out.println("Есть еще " + (seatPlace-seatedPassengers) + " сидячих мест");
        }
        else if (seatedPassengers == seatPlace){
            System.out.println("Сидячих мест нет");
        }
        if (otherPassengers<otherPlaces){
            System.out.println("Есть еще " + (otherPlaces - otherPassengers) + " стоячих мест" );
        }
        else  if (otherPassengers==otherPlaces){
            System.out.println("Стоячих мест нет");
        }

        // Задание 4
        System.out.println("Задание 4");






    }
}