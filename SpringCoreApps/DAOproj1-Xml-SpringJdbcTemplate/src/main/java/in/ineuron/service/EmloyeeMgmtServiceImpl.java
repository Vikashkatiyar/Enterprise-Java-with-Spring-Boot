package in.ineuron.service;

import in.ineuron.dao.IEmployeeDAO;

public class EmloyeeMgmtServiceImpl implements IEmployeeManagementService {

	private IEmployeeDAO dao;
	
	

	public EmloyeeMgmtServiceImpl(IEmployeeDAO dao) {
		
		this.dao = dao;
	}



	@Override
	public int fetchCount() {
		System.out.println("DAO name is:: "+dao.getClass().getName());
		return 0;
	}



	@Override
	public String toString() {
		return "EmloyeeMgmtServiceImpl [dao=" + dao + "]";
	}
	

}
