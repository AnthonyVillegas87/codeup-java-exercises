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


           label:
           for(Movie movies : MoviesArray.findAll()) {
               switch (user) {
                   case 0:
                       break label;
                   case 1:
                       System.out.println(movies.getName() + "__" + movies.getCategory());
                       break;
                   case 2:
                       System.out.println(movies.getName() + "__" + movies.getCategory());
                       break;
                   case 3:
                       System.out.println(movies.getName() + "__" + movies.getCategory());
                       break;
                   case 4:
                       System.out.println(movies.getName() + "__" + movies.getCategory());
                       break;
                   case 5:
                       System.out.println(movies.getName() + "__" + movies.getCategory());
                       break;
                   case 6:
                       System.out.println(movies.getName() + "__" + movies.getCategory());
                       break;
               }
           }

           System.out.println("Continue?");
            userInput = sc.next();


       }while(userInput.equals("y") || userInput.equals("yes"));
    }
}
