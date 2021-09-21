package Gun36._02_JavaConsructer;

import java.util.ArrayList;

public class Book {

    String name;
    int publishYear;
    String autor;

    public Book(String name, int publishYear, String autor) {
        this.name = name;
        this.publishYear = publishYear;
        this.autor = autor;
    }

    public Book(String name, int publishYear) {
        this(name, publishYear, "");
    }

    public Book(String name) {
        this(name, 0, "");
    }

    public void goster()
    {
        System.out.println(name+" "+publishYear+" "+autor);
    }

    // genel metod adı , string hali
    public String toString(){

        return name+" "+publishYear+" "+autor;
    }
}
