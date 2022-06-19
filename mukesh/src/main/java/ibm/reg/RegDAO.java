package ibm.reg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegDAO {
	@Autowired
	RegInterface regInterface;
	public int saveRegistDetail(RegDTO regDTO)
	{
	   return  regInterface.save(regDTO).getRid();
		
	}

}
