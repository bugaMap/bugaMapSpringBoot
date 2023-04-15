package de.hhn.se.labswp.bugaMap.controller;

import de.hhn.se.labswp.bugaMap.crudRepos.AdminRepository;
import de.hhn.se.labswp.bugaMap.jpa.Admin;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

  public UserController(AdminRepository adminRepository) {
    this.adminRepository = adminRepository;
  }

  private final AdminRepository adminRepository;

  @GetMapping("/users")
  public List<Admin> getUsers() {
    return (List<Admin>) adminRepository.findAll();
  }



  @PostMapping("/users")
  public void addUser(@RequestBody Admin admin) {
    adminRepository.save(admin);
  }



}