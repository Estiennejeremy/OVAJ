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

        Bdd bd = new Bdd("bddASI1", g);
        Bdd bd1 = new Bdd("bddASI2", g1);
        GroupeDAO grd = new GroupeDAO();
        EleveDAO d = new EleveDAO();
        RepoDAO rdao = new RepoDAO();
        Repo r = new Repo();

//        RepoUtils.AddEleveOnSvn(e1);
//
//        RepoUtils.createRepo(g, r);
//        RepoUtils.addEleveOnRepo(e1, g);
        BddDAO bdddao = new BddDAO();
        g.addEleve(e);
        g.addEleve(e1);

        d.saveEleve(e);
        d.saveEleve(e1);
        grd.saveGroupe(g);
        grd.saveGroupe(g1);
        rdao.saveRepo(r);
        bdddao.saveBdd(bd);
        bdddao.saveBdd(bd1);

        System.out.println(d.getEleves());

        System.exit(0);
    }
}
