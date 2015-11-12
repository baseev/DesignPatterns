package patterns.structural.facade;

import java.sql.Connection;

public class HelperFacade
{
    public static void generateReport(DB_TYPES dbTypes, REPORT_TYPES reportType, String tableName) {
        Connection con = null;
        switch(dbTypes) {
            case MYSQL :
                    con = MysqlHelper.getDbConnaction();
                    MysqlHelper mysqlHelper = new MysqlHelper();
                    switch(reportType) {
                        case HTML :
                                mysqlHelper.generateHTMLReport();
                            break;
                        case PDF :       
                                mysqlHelper.generateHTMLReport();
                    }
                break;
            case ORACLE :
                    con = MysqlHelper.getDbConnaction();
                    OracleHelper oracleHelper = new OracleHelper();
                    switch(reportType) {
                        case HTML :
                                oracleHelper.generateHTMLReport();
                            break;
                        case PDF :                            
                                oracleHelper.generatePDFReport();
                    }
                break;
            default: 
                //should throw exception
        }
        
        
    }
    
    public enum DB_TYPES{
        MYSQL, ORACLE
    }
    
    public enum REPORT_TYPES{
        HTML, PDF
    }
}
