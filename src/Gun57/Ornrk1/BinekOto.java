package Gun57.Ornrk1;

public abstract class BinekOto {

    private String marka;
    private int uretimYili;
    private int vitesSayisi;

    // implemente edilmek zorunda
    public abstract String getMarka();

    // ister override yapılabilir,
    // istenirse yapılmayabilir.
    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesSayisi() {
        return vitesSayisi;
    }

    public void setVitesSayisi(int vitesSayisi) {
        this.vitesSayisi = vitesSayisi;
    }
}
