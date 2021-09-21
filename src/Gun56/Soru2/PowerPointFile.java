package Gun56.Soru2;

public class PowerPointFile implements IReadFile{
    @Override
    public String open() {
        return "Opening ppt";
    }

    @Override
    public String read() {
        return "Reading ppt";
    }

    @Override
    public String save() {
        return "Saving ppt";
    }

    @Override
    public String close() {
        return "Closing ppt";
    }
}
