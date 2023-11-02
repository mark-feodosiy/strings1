public class Main {
    public static void main(String[] args) {


        // Задача № 1
        {
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + ' ' + firstName + ' ' + middleName;
            System.out.println("Ф. И. О. сотрудника — " + fullName);
        }
        System.out.println();
        // Задача № 2
        {
            String fullName = "Ivanov Ivan Ivanovich";
            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        }
        System.out.println();
        // Задача № 3
        {
            String fullName = "Иванов Семён Семёнович";
            String fullNameTrue = fullName.replace("ё", "е");
            System.out.println("Данные Ф. И. О. сотрудника — " + fullNameTrue);
        }

    }

}