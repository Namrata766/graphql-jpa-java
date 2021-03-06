package com.dell.dremioclient.service;

import java.util.List;

import com.dell.dremioclient.domain.CommercialAsset;

public interface CommercialAssetService {

	CommercialAsset getAssetById(String assetId) throws Exception;
	
	List<CommercialAsset> getAllAssets() throws Exception;
}
