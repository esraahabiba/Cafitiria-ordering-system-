/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;

import java.util.List;

/**
 *
 * @author laban
 */
public interface ManagerDAO {
	Manager getManagerById(int id);
        Manager getManagerByName(String name);
	List<Manager> getAllManagers();
	boolean insertManager(Manager manager);
	boolean updateManager(Manager manager);
	boolean deleteManagerById(int id);
	boolean deleteManagerByName(String name);
}

