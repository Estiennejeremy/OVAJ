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

    public static boolean devMode = true;

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

    public static String getHoteSsh() {
        if (devMode) {
            return getProp().getProperty("dev.hoteSsh");
        } else {
            return getProp().getProperty("prod.hoteSsh");
        }
    }

    public static String getSvnPath() {
        if (devMode) {
            return getProp().getProperty("dev.svnPath");
        } else {
            return getProp().getProperty("prod.svnPath");
        }
    }

    public static String getmdpSsh() {
        if (devMode) {
            return getProp().getProperty("dev.mdpSsh");
        } else {
            return getProp().getProperty("prod.mdpSsh");
        }
    }

    public static String getUserSsh() {
        if (devMode) {
            return getProp().getProperty("dev.userSsh");
        } else {
            return getProp().getProperty("prod.userSsh");
        }
    }

    public static String getHoteBdd() {
        if (devMode) {
            return getProp().getProperty("dev.hoteBdd");
        } else {
            return getProp().getProperty("prod.hoteBdd");
        }
    }

    public static String getmdpBdd() {
        if (devMode) {
            return getProp().getProperty("dev.mdpBdd");
        } else {
            return getProp().getProperty("prod.mdpBdd");
        }

    }

    public static String getUserBdd() {
        if (devMode) {
            return getProp().getProperty("dev.userBdd");
        } else {
            return getProp().getProperty("prod.userBdd");
        }
    }

    public static String getBddPort() {
        if (devMode) {
            return getProp().getProperty("dev.bddPort");
        } else {
            return getProp().getProperty("prod.bddPort");
        }
    }

}
