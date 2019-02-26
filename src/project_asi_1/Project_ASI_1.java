
package project_asi_1;

import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JFrame;
import project_asi_1.Classes.DAO.EleveDAO;
import project_asi_1.Classes.Eleve;
import project_asi_1.Classes.Groupe;

/**
 *
 * @author ESTIENNE
 */
public class Project_ASI_1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws IOException, SQLException {

        // TODO code application logic here
        JFrame myFrame = new JFrame("frame");
        myFrame.setSize(1080, 720);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.add(new project_asi_1.Views.accueil());
        myFrame.setVisible(true);

        Eleve e = new Eleve("test", "test2", "test3", "test4");
        Groupe g = new Groupe("yes");
        EleveDAO d = new EleveDAO();
        d.saveEleve(e);

    }
}

