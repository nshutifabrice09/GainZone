package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImplementation implements AdminService{

    @Override
    public List<Admin> getAllAdmins() {
        return null;
    }

    @Override
    public Admin getAdminByUsername(String username) {
        return null;
    }

    @Override
    public Admin saveAdmin(Admin admin) {
        return null;
    }

    @Override
    public Admin updateAdmin(String username, Admin admin) {
        return null;
    }

    @Override
    public void removeByUsername(String username) {

    }
}
