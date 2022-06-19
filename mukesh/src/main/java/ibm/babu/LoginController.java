package ibm.babu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ibm.babu.mst.LocationDAO;
import ibm.babu.mst.StateBean;
import ibm.reg.RegistBean;

@Controller
public class LoginController {
	@Autowired
	LoginBean loginBean;
	@Autowired
	RegistBean registBean;
	@Autowired
	LocationDAO locationDAO;
	//@GetMapping("/")
	@RequestMapping(value = "open", method = RequestMethod.GET)
	public ModelAndView loginJSP()
	{
		System.out.println("in");
		return new ModelAndView("login","ln",loginBean);
	}
  @RequestMapping(value = "lgn" , method = RequestMethod.POST)
	public String getDeatils(@ModelAttribute("ln") LoginBean loginBean,ModelMap m)
	{
		if(!loginBean.getUid().equalsIgnoreCase(loginBean.getPass()))
		{
			m.addAttribute("r", registBean);
			
			return "reg";
		}
		else
		{
			return "E";
		}
	}
	
	@ModelAttribute("statelist")
  public List<StateBean> getStateList()
  {
		List<StateBean> list = locationDAO.getStateList();
		return list;
  }
  
  
}
