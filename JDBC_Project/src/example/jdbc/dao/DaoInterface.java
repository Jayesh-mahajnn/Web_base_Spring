package example.jdbc.dao;

import java.util.Collection;

public interface DaoInterface<ENTITY_TYPE , ID_TYPE> {
	
   Collection<ENTITY_TYPE> retrieveAll();
   
   ENTITY_TYPE retrieveById(ID_TYPE id);
   
   void create(ENTITY_TYPE newEntityObj);
   
   void update(ENTITY_TYPE modifiedEntityObj);
   
   void deleteById(ID_TYPE id);
	

}
