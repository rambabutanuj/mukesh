package ibm.babu.mst;

import org.springframework.data.repository.CrudRepository;

public interface StateInterface extends CrudRepository<StateBean, String>{

	StateBean getStateBeanStateNameByStCode(String stCode);
	
	
}
