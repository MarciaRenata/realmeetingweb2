/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import factoryDAO.Factory;
import factoryDAO.JDBCFactory;


public class factoryDatabase {
    
    public static Factory createFactory(String type){
        if(type.equals("JDBC"))
            return new JDBCFactory();
        else
            return null;
    }
}
