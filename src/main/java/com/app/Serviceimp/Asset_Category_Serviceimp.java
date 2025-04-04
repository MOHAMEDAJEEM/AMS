package com.app.Serviceimp;

import java.util.List;

//import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

import com.app.Execption.ResourceNotFoundException;
import com.app.Repository.Asset_Category_repository;
import com.app.Service.Asset_Category_Service;
import com.app.dto.Asset_Category_dto;
import com.app.entity.Asset_Category;

public class Asset_Category_Serviceimp implements Asset_Category_Service {
	
	private final Asset_Category_repository assetRepository ;
	
	public Asset_Category_Serviceimp(Asset_Category_repository assetRepository)
	{
		this.assetRepository=assetRepository;
	}

	@Override
	public Asset_Category createAsset(Asset_Category_dto assetDto) {
		Asset_Category asset=new Asset_Category();
		assetDto.setName(assetDto.getName());
		assetDto.setCategory(assetDto.getCategory());
		assetDto.setPurchaseDate(assetDto.getPurchaseDate());
		assetDto.setExpirationDate(assetDto.getExpirationDate());
		assetDto.setRenewalDate(assetDto.getRenewalDate());
		assetDto.setDescription(assetDto.getDescription());
		return assetRepository.save(asset);
		
	}

	@Override
	public List<Asset_Category> getAllAssets() {
		
		return assetRepository.findAll();
	}

	@Override
	public Asset_Category getAsset_CategoryById(Long id) {
		
		return assetRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("Asset not found with Id"));
	}
	
@Override
	  public Asset_Category updateAsset(Long id, Asset_Category_dto assetDTO) {
	        Asset_Category asset = getAsset_CategoryById(id);
	        asset.setName(assetDTO.getName());
	        asset.setCategory(assetDTO.getCategory());
	        asset.setPurchasedDate(assetDTO.getPurchaseDate());
	        asset.setExpirationDate(assetDTO.getExpirationDate());
	        asset.setRenewalDate(assetDTO.getRenewalDate());
	        asset.setDescription(assetDTO.getDescription());
	        return assetRepository.save(asset);
	    }

//	@Override
//	public void deleteAsset(Long id) {
//		Asset_Category asset =getAsset_CategoryById(id);
//		assetRepository.delete(asset);
//	}
	  
//	  @Override
//	    public void deleteAsset(Long id) {
//	        Asset_Category_dto asset = getAssetById(id);
//	        assetRepository.delete(asset);
//	    }

	@Override
	public Asset_Category updateAsset(Long id) {
		
		return null;
	}

	@Override
	public Asset_Category deleteAsset(Long id) {
		
		return null;
	}

}
