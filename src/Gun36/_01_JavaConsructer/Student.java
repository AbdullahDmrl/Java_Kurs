package Gun36._01_JavaConsructer;

public class Student {
    int id;  // this ile gösterilir ki karışmasın
    String name;
    String surName;
    int classroom;

    // constructor : yapıcı metod
    // new olduğu and çalışan METOD
    public Student()
    {
        System.out.println("nesne oluşturuldu");
    }

    public Student(int id, String name, String surName, int classroom)
    {
        // 1.id clasın kendi değişkeni
        // 2.id metoda gelen değişken.
        // isimler aynı olunca karışmasın diye
        // burdaki manasında classı işaret etmek için
        // this kelimesi kullanılır.
        this.id=id;
        this.name = name;
        this.surName = surName;
        this.classroom = classroom;
    }

    public Student(int id, String name, String surName)
    {
        this(id, name, surName,0);
    }

    public Student(int id, String name)
    {
        this(id, name, "",0);
    }

    public Student(int id)
    {
        this(id, "", "",0);
    }



    public static Student createStudent(int id, String name, String surName, int classroom)
    {
        Student ogr=new Student();
        ogr.id = id;
        ogr.name=name;
        ogr.surName=surName;
        ogr.classroom=classroom;

        return ogr;
    }
}