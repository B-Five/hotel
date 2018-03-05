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
		Customer customer = new Customer();
		customer.setcLastname("小");
		customer.setcFirstname("焉");
		customer.setcEmail("12345@123.com");
		customer.setcPassword("1");
		System.out.println(customerMapper.insert(customer));
		
	}
	
}
