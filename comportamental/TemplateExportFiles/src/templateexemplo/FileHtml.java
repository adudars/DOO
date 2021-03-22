package templateexemplo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduarda
 */
public class FileHtml extends ExportFiles {

    protected BufferedWriter out = null;

    public FileHtml() {
        try {
            current = new java.io.File(".").getCanonicalPath();
            File file = new File(current + "/" + "index1.html");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            this.out = new BufferedWriter(fw);
            this.out.write("<HTML>\n<BODY>\n");
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void printLine(String linha) {
        try {
            this.out.write("<BR>" + linha);
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void save() {
        try {
            this.out.write("\n</BODY>");
            this.out.write("\n</HTML>");
            this.out.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
