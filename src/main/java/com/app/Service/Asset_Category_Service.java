package com.app.Service;

import java.util.List;

import com.app.dto.Asset_Category_dto;
import com.app.entity.Asset_Category;

public interface Asset_Category_Service {
	
	Asset_Category createAsset (Asset_Category_dto assetDto);
	
	List<Asset_Category>getAllAssets();
	
	Asset_Category getAsset_CategoryById(Long id);
	
	Asset_Category updateAsset(Long id);
	
	Asset_Category deleteAsset(Long id);

	Asset_Category updateAsset(Long id, Asset_Category_dto assetDTO);
	
	
	

}
