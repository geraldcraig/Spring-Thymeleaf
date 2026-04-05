package com.example.roomwebapp.repository;

import com.example.roomwebapp.model.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StaffRepository extends JpaRepository<StaffMember, UUID> {
}
