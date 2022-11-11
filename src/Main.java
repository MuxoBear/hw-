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
    }
}