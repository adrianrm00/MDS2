/**
 * Licensee: jaime(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS1GarciaRodriguezDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(basededatos.MDS1GarciaRodriguezPersistentManager.instance());
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
