/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.submit.registeration;

/**
 *
 * @author Malchiel
 */
public interface userDAO {
    
    public int insertUser(user c);
    public user getUser(String username, String password);
}
