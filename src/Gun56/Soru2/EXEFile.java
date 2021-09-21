package Gun56.Soru2;

public class EXEFile implements IReadFile{
    @Override
    public String open() {
        return "Opeing.exe";
    }

    @Override
    public String read() {
        return "Reading.exe";
    }

    @Override
    public String save() {
        return "Saving.exe";
    }

    @Override
    public String close() {
        return "Clossing.exe";
    }
}
