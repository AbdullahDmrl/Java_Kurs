package Gun56.Soru2;

public class DMGFile implements IReadFile{
    @Override
    public String open() {
        return "Opening.dmg";
    }

    @Override
    public String read() {
        return "Reading.dmg";
    }

    @Override
    public String save() {
        return "Saving.dmg";
    }

    @Override
    public String close() {
        return "Closing.dmg";
    }
}
