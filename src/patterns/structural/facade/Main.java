package patterns.structural.facade;

import patterns.structural.facade.HelperFacade.DB_TYPES;
import patterns.structural.facade.HelperFacade.REPORT_TYPES;

public class Main
{

    static String tableName = "user";
    /**
     * @param args
     */
    public static void main(String[] args)
    {
       HelperFacade.generateReport(DB_TYPES.MYSQL, REPORT_TYPES.HTML, tableName);
       HelperFacade.generateReport(DB_TYPES.ORACLE, REPORT_TYPES.PDF, tableName);
    }

}
