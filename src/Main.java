//Описати класи Man і Woman, що наслідують клас Person.
////        Обидва класи мають властивості:
////        firstName
////        lastName
////        age
////        partner
////        інші властивості, які ви вважаєте необхідними
////      Обидва класи мають методи:
////        конструктор, який включає всі поля
////        сеттер і геттер на полі age, та інші властивості, де це необхідно
////        isRetired (повертає true, якщо вік більше пенсійного порогу 60 для жінок та 65 для чоловіків)
////        registerPartnership (мається на увазі, що дружина приймає прізвище чоловіка)
////        deregisterPartnership (як вхідний параметр приймає boolean: повернення до попереднього прізвища)
////      За бажанням доповнити один або обидва класи будь-якими властивостями та/або методами.
public class Main {
    public static void main(String[] args) {
        Man man = new Man("Mykola", "Jonsoniuk", 35);

        System.out.println("His name is " + man.firstName + " " + man.lastName + ", and he is " + man.age + " years old , retired: " + man.isRetired());

        Woman woman = new Woman("Anna", "Gogo", 30);
        System.out.println("Her name is " + woman.firstName + " " + woman.lastName + ", and he is " + woman.age + " years old , retired: " + woman.isRetired());

        man.registerPartnership(woman);
        System.out.println(man.firstName + " " + man.lastName + ", age: " + man.age);
        System.out.println(woman.firstName + " " + woman.lastName + ", age: " + woman.age);

        man.deregisterPartnership(true);
        System.out.println(man.firstName + " " + man.lastName + ", age: " + man.age);
        System.out.println(woman.firstName + " " + woman.lastName + ", age: " + woman.age);
    }
}