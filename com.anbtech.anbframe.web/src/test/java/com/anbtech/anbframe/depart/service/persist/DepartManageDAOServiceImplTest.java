package com.anbtech.anbframe.depart.service.persist;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.anbtech.anbframe.anbweb.vo.DeptManageVO;
import com.anbtech.anbframe.depart.service.DepartManageDAOService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath*:/spring/context-*.xml")
@TransactionConfiguration(defaultRollback=true)
@Transactional
public class DepartManageDAOServiceImplTest {

	private static final Logger LOG = LoggerFactory.getLogger(DepartManageDAOServiceImplTest.class);
	
	@Autowired
	private DepartManageDAOService service;
	
	@Test
	public void testR() throws Exception {
		List list = service.findDept(new DeptManageVO());
		assertNotNull(list);
	}
	
}
