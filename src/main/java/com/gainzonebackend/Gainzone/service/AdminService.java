package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> getAllAdmins();
    Admin getAdminByUsername(String username);
    Admin saveAdmin(Admin admin);

    Admin updateAdmin(String username, Admin admin);

    void removeByUsername(String username);
}
