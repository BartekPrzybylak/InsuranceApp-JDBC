import Service.PrintStatement;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {


        PrintStatement printStatement = new PrintStatement();
        printStatement.printLinkedToUser(2);
        printStatement.printLinkedToUser(1);
        printStatement.printLinkedToUser(3);


    }
}
