package com.SpringCrud.SpringAngular.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringCrud.SpringAngular.CustomerRepo.CustomerRepo;
import com.SpringCrud.SpringAngular.DTO.CustomerDTO;
import com.SpringCrud.SpringAngular.DTO.CustomerSaveDTO;
import com.SpringCrud.SpringAngular.DTO.CustomerUpdateDTO;
import com.SpringCrud.SpringAngular.Entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerRepo customerRepo;


    @Override
    public List<CustomerDTO> getAllCustomers() {
       List<Customer> getCustomers = customerRepo.findAll();
       List<CustomerDTO> customerDTOList = new ArrayList<>();
       for(Customer a:getCustomers)
       {
           CustomerDTO customerDTO = new CustomerDTO(

                   a.getCustomerId(),
                   a.getCustomerName(),
                   a.getCustomerAddress(),
                   a.getMobile()
           );
           customerDTOList.add(customerDTO);
       }

       return  customerDTOList;
    }

    @Override
    public boolean deleteCustomer(int id) {

        if(customerRepo.existsById(id))
        {
            customerRepo.deleteById(id);
        }
        else
        {
            System.out.println("customer id not found");
        }

        return true;
    }

	@Override
	public String addCustomer(CustomerSaveDTO customerSaveDTO) {
		 Customer customer = new Customer(
	                customerSaveDTO.getCustomername(),
	                customerSaveDTO.getCustomeraddress(),
	                customerSaveDTO.getMobile()
	        );
	        customerRepo.save(customer);
	        return customer.getCustomerName();
	}

	@Override
	public String updateCustomers(CustomerUpdateDTO customerUpdateDTO) {
		 if (customerRepo.existsById(customerUpdateDTO.getCustomerid())) {
	            Customer customer = customerRepo.getById(customerUpdateDTO.getCustomerid());


	            customer.setCustomerName(customerUpdateDTO.getCustomername());
	            customer.setCustomerAddress(customerUpdateDTO.getCustomeraddress());
	            customer.setMobile(customerUpdateDTO.getMobile());
	            customerRepo.save(customer);
	        }
	            else
	            {
	                System.out.println("Customer ID do not Exist");
	            }

	                return null;
	}
}