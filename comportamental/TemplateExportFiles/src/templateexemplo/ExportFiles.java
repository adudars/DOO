package templateexemplo;

/**
 *
 * @author eduarda
 */
public abstract class ExportFiles {

    protected String current;

    public ExportFiles() {
        this.current = null;
    }

    public void export(String txt) {
        String[] txtLinhas = txt.split("\n");
        for (Object linhas : txtLinhas) {
            printLine((String) linhas);
        }
        save();
    }

    private void printLine(String linha) {}

    protected void save() {}
}
