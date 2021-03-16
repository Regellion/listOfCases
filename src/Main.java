
import java.util.Scanner;

public class Main
{
    // TODO  ниже разместите регулярки для определения комманд и работы с текстом

    // TODO ниже разместите основные переменные программы.
    private static boolean isContinue = true;
    private static String command;


    public static void main(String[] args) {

        System.out.println("Добро пожалывать в программу по составлению списка дел.\n" +
                "Вам доступны следующие команды:\n" +
                "\t\"LIST\" - распечатать список дел.\n" +
                "\t\"ADD название дела\" - добавить какое то дело в конец списка.\n" +
                "\t\"ADD 4 название дела\" - добавить новое дело на заданное место.\n" +
                "\t\"EDIT 3 название дела\" - изменить старое дело под указаным номером на новое.\n" +
                "\t\"DELETE 7\" - удалить дело под указаным номером.\n" +
                "\t\"EXIT\" - выйти из программы.\n" +
                "Все команды должны быть в указаном формате и без ковычек.\n\n" +
                "Введите комманду: ");


        do{
            Scanner in = new Scanner(System.in);
            command = in.nextLine();

            //TODO Напишите код для обработки комманд в данном месте

        } while(isContinue);
    }

    private static void showList() {
        // TODO реализуйте метод вывода всех дел в списке.
    }

    private static void addIndexList() {
        // TODO реализуйте метод добавления дела по номеру.
    }

    private static void addList() {
        // TODO реализуйте метод добавления дела без номера в конец списка.
    }

    private static void deleteList(){
        // TODO реализуйте метод удаления дела по номеру.
    }

    private static void editList(){
        // TODO реализуйте метод изменения дела по номеру.
    }

    private static void exitList(){
        isContinue = false;
        System.out.println("Всего доброго!");
    }
}

