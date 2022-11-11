public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 66;
        if (age >=18){
            System.out.println("Поздравляю вас с совершеннолетием");
        }
        if (age <18){
            System.out.println("Возраст совершеннолетие еще не наступил, нужно подождать");
        }
        //задание 2
        System.out.println("Задание 2");
        if (age >= 7 && age <18){
            System.out.println("Ребенок ходит в школу");
        }
        if (age >18 && age <=24){
            System.out.println("Человек ходит в университет");
        }
        if (age > 24){
            System.out.println("Человек ходит на работу");
        }
        // Задание 3
        System.out.println("Задание 3");
        int wagonCapacity = 102;
        int seatPlace = 60;
        int otherPlaces = wagonCapacity-seatPlace;

        int seatedPassengers = 7;
        int otherPassengers = 30;
        if (seatedPassengers < seatPlace){
            System.out.println("Есть еще " + (seatPlace-seatedPassengers) + " сидячих мест");
        }
        if (otherPassengers<otherPlaces){
            System.out.println("Есть еще " + (otherPlaces - otherPassengers) + " стоячих мест" );
        }



    }
}