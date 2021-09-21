package Gun44;

public class _03_TryCatchFinally {
    public static void main(String[] args) {
        long startTime= 0;
        try{
            startTime= System.currentTimeMillis();
            String str="Bugün";
            System.out.println("Hatadan önceki nokta");
            char ilkHarf=str.charAt(1);
            System.out.println("Hatadan sonraki nokta");
        }
        catch (Exception hata)
        {
            System.out.println("Catch bölümü çalıştı");
        }
        finally {
            System.out.println(System.currentTimeMillis()-startTime);
            // hata olsun veya olmasın çalışacak final bölümü:
            // herzaman çalışır
            System.out.println("Finaly bölümü çalıştı");
            // kullanım sebebi: try catch in içinde yapılmış
            // işlemlerde arta kalan kapama gibi bu bölüme ait işlemler
            // yapılarak kod düzeni sağlanmış olur.
        }

        System.out.println("try-catch bloğundan sonra çalışan kısımlar.");
    }
}
