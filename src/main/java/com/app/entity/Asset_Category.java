package com.app.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "assets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Asset_Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String category;
    private String name;
    private String assignedUser;
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate purchasedDate;
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate expirationDate;
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate renewalDate;
    
    private String licenseStatus;
    private String description;
}
