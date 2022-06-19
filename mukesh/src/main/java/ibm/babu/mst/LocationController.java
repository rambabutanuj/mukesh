package ibm.babu.mst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

	@Autowired
	LocationDAO locationDAO;
	@RequestMapping(value = "dist", method = RequestMethod.GET)
	public List<DistBean> getDistList(@RequestParam("stCode") String stCode)
	{
		List<DistBean> list = locationDAO.getDistList(stCode);
		System.out.println("list--- "+list.size());
		return list;
	}
	
}
