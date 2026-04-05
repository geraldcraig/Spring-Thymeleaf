package com.example.roomwebapp.controller;

import com.example.roomwebapp.model.Room;
import com.example.roomwebapp.model.Staff;
import com.example.roomwebapp.model.StaffMember;
import com.example.roomwebapp.repository.StaffRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private final StaffRepository staffRepository;

    public StaffController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @GetMapping
    public String getStaffPage(Model model) {
        List<StaffMember> staffMembers = staffRepository.findAll();
        List<Staff> staff = new ArrayList<>(staffMembers.size());
        staffMembers.forEach(s -> staff.add(new Staff(s.getEmployeeId(), s.getFirstName(), s.getLastName(), s.getPosition().toString())));
        model.addAttribute("staff", staff);
        return "staff";
    }
}
