package Gun43._02_JavaException;

public class _01_JavaRuntimeException {
    public static void main(String[] args) {

        System.out.println("program çalıştı");
        String kelime="";

        kelime.charAt(3);
    }
}

// Derleme Zamanı hatası denir : Compile Error,  Exception // programin calismasina müsade etmez
// Çalışma Zamanı hatası denir : Runtime Error, Exception .StringIndexOutOfBounds Exception . Program calisir
