package Gun56.Soru2;

public class TextFile implements IReadFile{
    @Override
    public String open() {
        return "Opening.text";
    }

    @Override
    public String read() {
        return "Reading.text";
    }

    @Override
    public String save() {
        return "Saving.text";
    }

    @Override
    public String close() {
        return "Closing.text";
    }
}
