package ibm.babu.mst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class LocationDAO {
	@Autowired
	StateInterface stateInterface;
	@Autowired
	DistInterface distInterface;
	public List<StateBean> getStateList()
	{   List<StateBean> list=(List<StateBean>)stateInterface.findAll();
		return list;
	}
	
	public List<DistBean> getDistList(String stCode)
	{
		return distInterface.getDistBeanListByStCode(stCode);
	}
	
	public void distNameByCode(String distCode)
	{
		DistBean d = distInterface.getDistBeanDistNameByDistCode(distCode);
		System.out.println("dit name "+d.getDistName());
	}
	
}
