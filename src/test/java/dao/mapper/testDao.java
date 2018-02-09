package dao.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lllllw.hotel.dao.CustomerMapper;
import com.lllllw.hotel.model.Customer;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration({ "classpath:/com/lllllw/hotel/config/applicationContext.xml"})
public class testDao {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@Test
	public void testcustomerMapper(){
		Customer customer = customerMapper.selectByPrimaryKey(1);
		System.out.println(customer.getcName());
	}
	
}
