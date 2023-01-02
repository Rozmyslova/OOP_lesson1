public class Movie {
    String name;
    String director;
    String genre;
    String releaseYear;
    String country;
    

    Operation operation = new Operation();

    Movie() {
        this.name = operation.getName();
        this.director = operation.getDirector();
        this.genre = operation.getGenre();
        this.releaseYear = operation.getYear();
        this.country = operation.getCountry();   
    }

    public String info() {
        StringBuilder strBuilder = new StringBuilder();
        return strBuilder.append(String.format(
                "Название: %s\nРежиссер: %s\nЖанр: %s\nГод выпуска: %s\nСтрана: %s\n________________\n",
                name, director, genre, releaseYear, country)).toString();
    }
}