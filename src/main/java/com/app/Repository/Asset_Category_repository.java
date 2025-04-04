package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Asset_Category;

@Repository
public interface Asset_Category_repository  extends JpaRepository<Asset_Category, Long>{
	

}
