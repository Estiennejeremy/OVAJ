package project_asi_1;

import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JFrame;

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

//        Eleve e = new Eleve("Lucas", "Roux", "lucas@roux.com");
//        Eleve e1 = new Eleve("Jeremy", "Estienne", "jeremy@estienne");
//        Groupe g = new Groupe("ASI1");
//        Groupe g1 = new Groupe("ASI2");
//
//        //Repository r = new Repository("Test", g);
////        RepoUtils.AddEleveOnSvn(e1);
//        //      RepoUtils.addEleveOnRepo(e1, r);
//        //      g.addEleve(e);
//        //    g.addEleve(e1);
//        GroupeDAO groupeDao = new GroupeDAO();
//        groupeDao.saveGroupe(g);
//        groupeDao.saveGroupe(g1);
//
//        e.addGroupes(g);
//        e1.addGroupes(g);
//        EleveDAO eleveDao = new EleveDAO();
//        RepoDAO repoDao = new RepoDAO();
//        BddDAO bddDao = new BddDAO();
//
//        eleveDao.saveEleve(e);
//        eleveDao.saveEleve(e1);
//        // repoDao.saveRepo(r);
//        Bdd bd = new Bdd("bddASI1", g);
//        Bdd bd1 = new Bdd("bddASI2", g1);
//        System.out.println(bddDao.getBddByGroupe(g1));
        // System.exit(0);
    }
}
