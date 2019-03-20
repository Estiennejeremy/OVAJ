package project_asi_1;

import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JFrame;
import project_asi_1.Classes.Bdd;
import project_asi_1.Classes.DAO.BddDAO;
import project_asi_1.Classes.DAO.EleveDAO;
import project_asi_1.Classes.DAO.GroupeDAO;
import project_asi_1.Classes.DAO.RepoDAO;
import project_asi_1.Classes.Eleve;
import project_asi_1.Classes.Groupe;
import project_asi_1.Classes.Repo;
import project_asi_1.Classes.utils.RepoUtils;

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
    public static void main(String[] args) throws IOException, SQLException, InterruptedException {

        // TODO code application logic here
        JFrame myFrame = new JFrame("frame");
        myFrame.setSize(1080, 720);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.add(new project_asi_1.Views.accueil());
        myFrame.setVisible(true);

        Eleve e = new Eleve("Lucas", "Roux", "lucas@roux.com");
        Eleve e1 = new Eleve("Jeremy", "Estienne", "jeremy@estienne");
        Groupe g = new Groupe("ASI1");
        Groupe g1 = new Groupe("ASI2");

        Repo r = new Repo("Test", g);

        RepoUtils.AddEleveOnSvn(e1);

        RepoUtils.addEleveOnRepo(e1, r);
        g.addEleve(e);
        g.addEleve(e1);
        EleveDAO eleveDao = new EleveDAO();
        GroupeDAO groupeDao = new GroupeDAO();
        RepoDAO repoDao = new RepoDAO();
        BddDAO bddDao = new BddDAO();
        eleveDao.saveEleve(e);
        eleveDao.saveEleve(e1);
        groupeDao.saveGroupe(g);
        groupeDao.saveGroupe(g1);
        repoDao.saveRepo(r);
        Bdd bd = new Bdd("bddASI1", g);
        Bdd bd1 = new Bdd("bddASI2", g1);
        bddDao.saveBdd(bd);
        bddDao.saveBdd(bd1);

        // System.exit(0);
    }
}
