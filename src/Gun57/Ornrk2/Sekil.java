package Gun57.Ornrk2;

public abstract class Sekil {
    private String name;

  //  public Sekil() {        Bos kosructer koysakda koymasakda extend edilen class da calisir
  //  }
//
  //  public Sekil(String name) {  Consructer yaparsak mutlaka extend edilmesi gerekir
  //      this.name = name;
  //  }

    abstract double Alan();     //Abstrackt metotlar
    abstract double Cevre();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Ciz(){       //Concrete metot
        System.out.println(name+" isimli sekil cizildi");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "Alan='" + Math.round(Alan()) + '\'' +
                "Cevre='" + Math.round(Cevre()) + '\'' +
                '}';
    }
}
