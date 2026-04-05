package com.example.roomwebapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="ROOMS")
//@Getter
//@Setter
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="ROOM_ID")
    private UUID roomId;

    @Column(name="NAME")
    private String name;

    @Column(name="NUMBER")
    private String number;

    @Column(name="BED_INFO")
    private String bedInfo;

    public UUID getRoomId() {
        return roomId;
    }

    public void setRoomId(UUID roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }

    @Override
    public String toString() {
        return "RoomEntity{" +
                "roomId=" + roomId +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", bedInfo='" + bedInfo + '\'' +
                '}';
    }
}
