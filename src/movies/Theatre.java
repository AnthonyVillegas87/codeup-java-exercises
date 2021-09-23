package movies;

public class Theatre {
    private String name;
    private String writer;

    Theatre(String name, String writer) throws IllegalArgumentException{
        this.name = name;
        this.writer = writer;
        if(name == null || writer == null) {
            throw new IllegalArgumentException("Not a valid entry!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

}
