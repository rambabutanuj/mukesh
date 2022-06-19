package ibm.reg;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegServices {
	@Autowired
	RegDTO regDTO;
	@Autowired
	RegDAO regDAO;
	public int getDetails(RegistBean registBean)
	{
		BeanUtils.copyProperties(registBean, regDTO);
		return regDAO.saveRegistDetail(regDTO);
	}
	

}
