import java.util.Random;
import java.util.Scanner;

public class Operation {
    Random randomeEnt = new Random();

    public String getName() {
        String[] names = new String[] { "Рoждественские приключения", "Елочный базар", "Говорят под Новый год",
                "Санта Клаус и все-все-все", "Новогодний обмен", "Рождественская симфония", "Зимние истории", 
                "Рождество для нас", "Зима.2", "Я тебе обещаю" };
        return names[randomeEnt.nextInt(names.length)];
    }

    public String getDirector() {
        String[] directors = new String[] { "Роберт Земекис", "Тимур Бекмамбетов", "Илья Перов", "Крис Коламбус",
                "Нэнси Майерс", "Андрей Кончаловский", "Шэрон Магуайр", "Александр Серый", "Владимир Попов" };
        return directors[randomeEnt.nextInt(directors.length)];
    }

    public String getGenre() {
        String[] genres = new String[] { "Мультфильм", "Комедия", "Мелодрама", "Фэнтези", "Драма", "Криминал"};
        return genres[randomeEnt.nextInt(genres.length)];
    }

    public String getYear() {
        String releaseYear = Integer.toString(randomeEnt.nextInt(1950, 2022));
        return releaseYear;
    }
    
    public String getCountry() {
        String[] countries = new String[] { "США", "Россия", "Великобритания", "Франция"};
        return countries[randomeEnt.nextInt(countries.length)];
    }

        public Movie[] createMoviesList() {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();
        Movie movie3 = new Movie();
        Movie movie4 = new Movie();
        Movie movie5 = new Movie();


        Movie[] movies = new Movie[] {movie1, movie2, movie3, movie4, movie5};
        return movies;
    }

    public void findByName(Movie[] movies) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        System.out.print("Введите название или часть названия фильма: ");
        String partOfName = sc.nextLine();
        for (Movie objectFilm : movies) {
            if (objectFilm.name.contains(partOfName)) {
                System.out.print(objectFilm.info());
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Фильм с таким названием не найден :( ");
        }
        //sc.close();
    }
}