import java.util.Scanner;

public class UImenu {

    public void mainMenu() {
        Operation logic = new Operation();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Movie[] films = logic.createMoviesList();
        System.out.println("Добрый день! Приветсвуем вас в нашем каталоге фильмов! ");
        while (flag) {
            System.out.printf("Выберите действие, которые хотите выполнить:\n");
            System.out.printf("1 - вывести весь список фильмов\n");
            System.out.printf("2 - найти фильм по названию/части названия \n");
            System.out.printf("3 - выход из приложения\n");
            System.out.printf("Ваш выбор: ");
            char action = sc.next().charAt(0);
            switch (action) {
                case '1': {
                    for (Movie i : films) {
                        System.out.print(i.info());
                    }
                    break;
                }
                case '2': {
                    logic.findByName(films);
                    break;
                }
                case '3': {
                    System.out.println("Спасибо, что выбрали нас! До встречи!");
                    flag = false;
                    break;
                }
                default: {
                    System.out.println("Пункта меню с таким номером нет, проверьте правильность вводимого числа ");
                    break;
                }
            }
        }
        sc.close();
    }
}
