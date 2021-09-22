package movies;

import java.util.Scanner;
public class Movie {
    private String name;
    private String category;



    Movie(String movieName, String movieCategory) {
        this.name = movieName;
        this.category = movieCategory;
    }

    Movie() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void movieSearch () {
       Scanner sc = new Scanner(System.in);
        String userInput;
        int user;


       do {
           System.out.println("What would you you like to do? ");
           System.out.println("0 - exit");
           System.out.println("1 - view movies");
           System.out.println("2 - view animated category");
           System.out.println("3 - view drama category");
           System.out.println("4 - view musical category");
           System.out.println("5 - view horror category");
           System.out.println("6 - view sci-fi category");

           System.out.println("Enter your choice: ");
           user = Integer.parseInt(sc.next());



           for(Movie movies : MoviesArray.findAll()) {
               if (user == 0) break;
               else if (user == 1) {
                   System.out.println(movies.getName() + "__" + movies.getCategory());
               } else if (user == 2) {
                   System.out.println(movies.getName() + "__" + movies.getCategory());
               } else if (user == 3) {
                   System.out.println(movies.getName() + "__" + movies.getCategory());
               } else if (user == 4) {
                   System.out.println(movies.getName() + "__" + movies.getCategory());
               } else if (user == 5) {
                   System.out.println(movies.getName() + "__" + movies.getCategory());
               } else if (user == 6){
                   System.out.println(movies.getName() + "__" + movies.getCategory());
               }
           }

           System.out.println("Continue?");
            userInput = sc.next();


       }while(userInput.equals("y") || userInput.equals("yes"));
    }
}
