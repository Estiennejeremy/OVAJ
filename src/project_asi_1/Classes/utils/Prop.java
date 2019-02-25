/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Objects;
import java.util.Properties;

/**
 *
 * @author ESTIENNE
 */
public abstract class Prop {

    private static Properties getProp() {
        Properties prop = new Properties();
        try {
            // the configuration file name
            String fileName = "project_asi_1/ressources/app.config";
            ClassLoader classLoader = Prop.class.getClassLoader();

            // Make sure that the configuration file exists
            URL res = Objects.requireNonNull(classLoader.getResource(fileName),
                    "Can't find configuration file app.config");

            InputStream is = new FileInputStream(res.getFile());

            // load the properties file
            prop.load(is);

            // get the value for app.name key
            return prop;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public static String getHote() {
        return getProp().getProperty("app.hote");
    }

    public static String getmdp() {
        return getProp().getProperty("app.mdp");
    }

    public static String getUser() {
        return getProp().getProperty("app.user");
    }

}
