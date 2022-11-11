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
        int age1 = 8;
        if (age1 >=2 && age1 < 6){
            System.out.println("Если возраст человека " + age1+ " то ему нужно ходить в садик");
        } else if (age1 >6 && age1 <=18){
            System.out.println("Если возраст человека " + age1+ " то ему нужно ходить в школу");
        } else if (age1 >18 && age1 <= 24){
            System.out.println("Если возраст человека " + age1+ " то ему нужно ходить в универ");
        } else if (age1 >24){
            System.out.println("Если возраст человека " + age1+ " то ему нужно ходить на работу");
        }

        // задание 5
        System.out.println("Задание 5");
        if (age1 <5){
            System.out.println("Ребенок не может кататься на отракционе");
        } else if (age1 >5 && age1 <14){
            System.out.println("ребенок может кактаться в присутствии взрослого");
        } else if (age1 >14){
            System.out.println("Ребенок может кататься на отракционе сам");
        }

        // Задание 6
        System.out.println("Задание 6");
        int one = 15;
        int two = 25;
        int three = 99;
        if (one > two){
            if (one >= three){
                System.out.println("Большее число " + one);
            } else {System.out.println("Большее число " + three);
            }
        }else if (two > one) {
            if (two >=three){
                System.out.println("Большее число " + two);
            } else {System.out.println("Большее число " + three);}
        }else {
                if (one > three) {
                    System.out.println("Большее число " + one);
                }else if (three > one){
                    System.out.println("Большее число " + three);
                }else {
                    System.out.println("Все числа ровны");
                }
            }








    }
}