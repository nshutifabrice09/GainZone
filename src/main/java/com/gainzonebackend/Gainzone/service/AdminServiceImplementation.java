package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Admin;
import com.gainzonebackend.Gainzone.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImplementation implements AdminService{

    private final AdminRepository adminRepository;

    public AdminServiceImplementation(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }


    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public Admin getAdminByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin updateAdmin(String username, Admin admin) {
        Admin existAdmin = adminRepository.findByUsername(username);
        if(existAdmin !=null){
            existAdmin.setUsername(admin.getUsername());
            existAdmin.setPassword(admin.getPassword());
        }
        return null;
    }

    @Override
    public void removeByUsername(String username) {
        adminRepository.removeByUsername(username);
    }
}
