import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeatherCalendar calendar = new WeatherCalendar();
        calendar.month = "Октябрь";
        calendar.numberOfDays = 31;
        calendar.rainyDays = 0;
        calendar.isRainyMonth = false;

        String[] octoberWeather = new String[]{
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Дождь",
                "Дождь",
                "Облачно",
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Солнечно",
                "Солнечно",
                "Облачно",
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Солнечно",
                "Солнечно",
                "Облачно",
                "Облачно",
                "Облачно",
                "Облачно",
                "Дождь",
                "Дождь",
                "Облачно",
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Дождь",
                "Солнечно",
                "Солнечно",
                "Солнечно",
                "Солнечно",
                "Облачно"
        };

        for (int i = 0; i < calendar.numberOfDays; i++) {
            if (octoberWeather[i].equals("Дождь")) {
                calendar.addRainyDay();
            }
        }

        // Проверить, был ли месяц дождливым. Если да - установить значение isRainyMonth
        if (calendar.rainyDays > 15){
            calendar.isRainyMonth = true;
        }

        System.out.println(calendar.month + " " + calendar.year + " года. "
                + calendar.rainyDays + " дней шёл дождь.");

        // Проверить значение isRainyMonth
        if (calendar.isRainyMonth){
            System.out.println("Это был дождливый месяц.");
        } else{
            System.out.println("Этот месяц был довольно сухим.");
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Сколько самокатов доступно для аренды?");
//        int availableScooters = scanner.nextInt(); // Считайте количество доступных самокатов с клавиатуры
//
//        System.out.println("Сколько самокатов арендовано?");
//        int scootersInUse = scanner.nextInt(); // Считайте число арендованных самокатов с клавиатуры
//
//        Scooter scooter = new Scooter(availableScooters, scootersInUse); // Создайте новый объект класса Scooter
//
//        System.out.println("Что вы хотите сделать?");
//        System.out.println("1 -- Узнать текущую стоимость проката");
//        System.out.println("2 -- Выдать самокат");
//        System.out.println("3 -- Принять самокат");
//        System.out.println("4 -- Завершить работу");
//
//        while (true) { // реализуйте непрерывный ввод команд
//            System.out.println("Введите команду:");
//            int command = scanner.nextInt(); // Считайте команду с клавиатуры
//
//            if (command == 1) {
//                scooter.getPrice(); // Вызовите нужный метод класса Scooter
//            } else if (command == 2) {
//                scooter.rentScooter(); // Вызовите нужный метод класса Scooter
//            } else if (command == 3) {
//                scooter.returnScooter(); // Вызовите нужный метод класса Scooter
//            } else if (command == 4) {
//                System.out.println("Сеанс работы завершён!");
//                break; // Завершите ввод команд и работу программы
//            } else {
//                System.out.println("Введён неверный код команды.");
//            }
//        }
//    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int monthNumber;
//
//        while (true) {
//            System.out.println("Когда планируется путешествие? Введите номер месяца от 1 до 12.");
//            monthNumber = scanner.nextInt();
//
//            if (monthNumber > 12) { // Инвертируйте условие
//                System.out.println("Некорректный номер месяца. Введите ещё раз.");
//            } else {
//                break;
//            }
//        }
//        String season = getSeasonByNumber(monthNumber);
//
//        if (season.equals("Лето")) {
//            System.out.println("Летом лучше остаться в Астане.");
//            return;
//        } /* Допишите ветвление, которое будет печатать строку:
//            System.out.println("Летом лучше остаться в Астане.");
//              и завершать выполнение программы */
//
//
//        System.out.println("Укажите стоимость прямых билетов из Астаны в Париж:");
//        int ticketAstanaParis = scanner.nextInt();
//        System.out.println("Укажите стоимость билетов из Астаны в Париж с пересадкой в Лондоне:");
//        int ticketAstanaLondonParis = scanner.nextInt();
//        System.out.println("У вас есть британская виза?");
//        System.out.println("1 - да, виза есть");
//        System.out.println("0 - визы нет");
//        int britainVisa = scanner.nextInt();
//
//
//        // В этом ветвлении что-то напутано с условиями - исправьте это
//        // Перенесите проверку на "Лето" в ветвление выше
//            if (ticketAstanaLondonParis > ticketAstanaParis) {
//                if (!(britainVisa == 0)) { // Упростите это условие
//                    System.out.println("Летим через Лондон!");
//                } else {
//                    System.out.println("Летим напрямую в Париж!");
//                }
//            } else {
//                System.out.println("Летим напрямую в Париж!");
//            }
//        }
//
//
//    private static String getSeasonByNumber(int monthNumber) {
//        // Допишите условия ветвления в виде утверждений
//        if (monthNumber == 12 || monthNumber <= 2) {
//            return "Зима";
//        } else if (monthNumber >= 3 && monthNumber <= 5) {
//            return "Весна";
//        } else if (monthNumber >= 6 && monthNumber <= 8) {
//            return "Лето";
//        } else if (monthNumber >= 9 && monthNumber <= 11) {
//            return "Осень";
//        } else {
//            return "Зима";
//        }
//    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
