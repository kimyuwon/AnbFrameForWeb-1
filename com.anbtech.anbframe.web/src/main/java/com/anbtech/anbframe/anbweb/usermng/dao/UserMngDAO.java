package com.anbtech.anbframe.anbweb.usermng.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.anbtech.anbframe.anbweb.usermng.vo.UserMngVO;

@Repository
public class UserMngDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 직원 조회
	 *  
	 * @return 직원 리스트
	 */
	public ArrayList getListUser(UserMngVO param){
		String sql = "SELECT EMP_ID empId"
					     + ",EMP_NAME  empName"
				         + ", EMP_EMAIL empEmail"
				         + ", EMP_NAME_ENG empNameEng"
				         + ", EMP_PHONE  empPhone"
				         + ", EMP_HANDPHONE empHandphone"
				         + ", EMP_ADDRESS empAddress"
				         + ", IN_DATE inDate"
				         + ", MAR_DATE marDate"
				         + ", POST_CODE postCode"
				         + ", MAR_YN marYn"
				         + ", CAR_YN carYn"
				         + ", EMP_TYPE empType"
				         + " FROM ANB_EMPLOYEE";
		return (ArrayList)jdbcTemplate.query(sql,new BeanPropertyRowMapper(UserMngVO.class));
	}
	
	/**
	 * 직원 수정
	 *  
	 * @return 수정된 row 수
	 */
	public int updateUser(UserMngVO param){
		int cnt = 0;
		return cnt;
	}
	
	/**
	 * 직원 삭제
	 *  
	 * @return 삭제된 row 수
	 */
	public int deleteUser(UserMngVO param){
		int cnt = 0;
		return cnt;
	}
	
	/**
	 * 직원 신규 등록
	 *  
	 * @return N/A
	 */
	public void insertUser(UserMngVO param){
		
	}
	
}
