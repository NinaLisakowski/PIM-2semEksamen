/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersistenceTest;

import org.junit.Test;
import static org.junit.Assert.*;
import persistence.DataSourceFacade;

/**
 *
 * @author allan
 */
public class DataSourceFacadeTest {
    
    public DataSourceFacadeTest() {
    }

    @Test
    public void getConnectionTest(){
        DataSourceFacade dsfacade = new DataSourceFacade(true);
        assertNotNull(DataSourceFacade.getConnection());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
