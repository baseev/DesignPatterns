package patterns.structural.facade;

import java.sql.Connection;

public class OracleHelper
{
    public static Connection getDbConnaction() {
        return null;
    }

    public void generatePDFReport() {
        System.out.println("generatePDFReport");
    }
    
    public void generateHTMLReport() {
        System.out.println("generateHTMLReport");
    }
}
