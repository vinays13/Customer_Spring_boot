package com.SpringCrud.SpringAngular.Service;

import java.util.List;

import com.SpringCrud.SpringAngular.DTO.CustomerDTO;
import com.SpringCrud.SpringAngular.DTO.CustomerSaveDTO;
import com.SpringCrud.SpringAngular.DTO.CustomerUpdateDTO;

public interface CustomerService {

	String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getAllCustomers();

    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

    boolean deleteCustomer(int id);

}
