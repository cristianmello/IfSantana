/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Radaelli
 */
public class Conexao {
    public Connection conectaBD() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1/poo","root","CrisRafa100%");
    }
}
