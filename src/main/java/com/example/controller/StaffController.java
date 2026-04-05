package com.example.controller;

import com.example.model.Room;
import com.example.model.Staff;
import com.example.model.StaffMember;
import com.example.repository.StaffRepository;
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
