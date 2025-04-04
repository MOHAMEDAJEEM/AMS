package com.app.dto;


import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Asset_Category_dto {
	
	private String name;
	private String category;
	private LocalDate purchaseDate;
	private LocalDate expirationDate;
	private LocalDate renewalDate;
	private String description;
	
	

}
