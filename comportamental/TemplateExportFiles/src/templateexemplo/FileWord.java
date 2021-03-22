package templateexemplo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author eduarda
 */
public class FileWord extends ExportFiles {

    protected XWPFDocument document;
    protected FileOutputStream out = null;

    public FileWord() {
        try {
            current = new java.io.File(".").getCanonicalPath();
            out = new FileOutputStream(new File(current + "/" + "word.docx"));
            document = new XWPFDocument();
            //Blank Document
        } catch (IOException ex) {
            Logger.getLogger(FileWord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void printLine(String linha) {
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(linha);
    }

    @Override
    protected void save() {
        try {
            document.write(out);
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
