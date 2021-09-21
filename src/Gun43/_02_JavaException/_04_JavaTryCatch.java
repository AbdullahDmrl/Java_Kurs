package Gun43._02_JavaException;

public class _04_JavaTryCatch {
    public static void main(String[] args) {

        String str="Bugün";
        int a=5;
        int b=0;
        int c=0;

        // Catch bloklarında hangi hata önce geliyorsa ona uygun hata adı yazılır, genel Eception en sona yazılır.
        try {
            System.out.println("1.Adım");
            char ilkHarf = str.charAt(0); // burda hata oluşacak
            System.out.println("2.Adım");
            c = a / b; // Artimetik hata noktası
            System.out.println("3.Adım");
        }
        catch (StringIndexOutOfBoundsException ex)// burada özel hata ismi yazılırsa; ilgili hata gelirse catch kısmı çalışır
        // ilgili hatanın dışında başka hata gelirse bunun için başka bölüm olmadığından program kırlır.
        {
            System.out.println("4.Adım");
            System.out.println("Hata: String dizisi sınırı aşıldı.");
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Hata: Aritmetik işlem hatası.");
        }
        catch (Exception ex) // hangi hata olursa olsun hata olduğunda Exception catch çalışır
        {
            System.out.println("Hata: Genel Hata oluştu.");
        }


        System.out.println("Program sonu");

    }
}
