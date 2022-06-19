package ibm.reg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistController {
	@Autowired
	RegistBean registBean;
	@Autowired
	RegServices regServices;
	@RequestMapping(value = "saveregis", method = RequestMethod.POST)
	public String saveDetail(@ModelAttribute("r") RegistBean registBean)
	{
		if(regServices.getDetails(registBean)>0)
		{
			return "S";
		}
		else
		{
			return "E";
		}
	}

}
