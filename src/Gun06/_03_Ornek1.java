package Gun06;

public class _03_Ornek1 {
    public static void main(String[] args) {
        // 3 farklı(char,int, boolean) tip de değişken tanımlayınız,
        // değer atayınız ve ekrana yazdırınız.

        int sayi=5;

        System.out.println("sayi = " + sayi);

        char ilkHarf = 'A'; // char tipinde veri saklandı.Nasıl saklandı ?
        char basHarf = 65;  // yukarıdaki işlemler aynı.
        // A=65,B,C.....a=97,b,c

        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("basHarf = " + basHarf);

        String ilkHarf2="A"; // -> bilgisayarı kelimelerin bitişini saklama zorunda
        // hafızaya yerleştirirken.Bunun için "A" -> 'A'+'\n' burası kelime sonu işareti
        String isim="ahmet"; // ahmet+'\n' sınırını gösteren kelimenin sonunu gösteren
        // işaret var.

        ilkHarf ='C';
        // (65) ben buna 32 eklersem bu harfin küçük halini bulurum doğru mu ?

        char kucukHarf= (char)(ilkHarf + 32); // int -> char a atıyoruz
        System.out.println("kucukHarf = " + kucukHarf); // kucukHarf = c
        
        boolean acikMi= true;
        System.out.println("acikMi = " + acikMi); // acikMi = true
        
        
    }
}
