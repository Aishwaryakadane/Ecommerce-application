package com.test.Ecommerce.Service;

import com.test.Ecommerce.Model.Address;
import com.test.Ecommerce.Repos.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iaddressRepo;

    public String addAddress(Address address){
        iaddressRepo.save(address);
        return "Address added ";
    }

    public List<Address> getAddresses(){
        return (List<Address>) iaddressRepo.findAll();
    }

    public Optional<Address> getAddress(Integer id){
        return iaddressRepo.findById(id);
    }

    public String addListOfUsers(List<Address> addresses){
        iaddressRepo.saveAll(addresses);
        return "Addresses Added";
    }

    public String deleteAddressById(Integer id){
        iaddressRepo.deleteById(id);

        return "Address removed";
    }


}