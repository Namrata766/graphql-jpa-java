package com.dell.dremioclient.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dell.dremioclient.domain.CommercialAsset;
import com.dell.dremioclient.repository.CommercialAssetRepository;
import com.dell.dremioclient.service.CommercialAssetService;

/**
 * @author Namrata_Kumari
 *
 */
@Service
public class CommercialAssetServiceImpl implements CommercialAssetService {

	@Autowired
	CommercialAssetRepository caRepo;
	
	@Override
	@Transactional
	public CommercialAsset getAssetById(String assetId) throws Exception {
		return caRepo.findById(assetId).get();
	}

	@Override
	@Transactional
	public List<CommercialAsset> getAllAssets() throws Exception {
		return caRepo.findAll(
				  PageRequest.of(0, 10, Sort.by(Sort.Direction.ASC, "assetId"))).getContent();
	}
}
