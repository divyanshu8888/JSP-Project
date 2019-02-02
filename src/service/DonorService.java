package service;

import dao.DonorDAO;

import model.DonorBean;

import service.DonorService;

import java.util.List;



public class DonorService {
	
	
	public static int insertDonor(DonorBean don){
		DonorDAO dao = new DonorDAO();
		int count = dao.insertEmployee(don);
		return count;
	}
	
	public static List<DonorBean> readDonor(String id1) {
			DonorDAO dao = new DonorDAO();
			return dao.selectDonor(id1);
		}

	public static int updateDonor(String id,String name){
		DonorDAO dao = new DonorDAO();
		int count = dao.updateDonor(id, name);
		return count;
	}
	
	public static int deleteDonor(String don){
		DonorDAO dao = new DonorDAO();
		int  count = dao.deleteEmployee(don);
		return count;
	}
	
}
