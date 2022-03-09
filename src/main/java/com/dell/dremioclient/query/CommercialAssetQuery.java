package com.dell.dremioclient.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.dell.dremioclient.domain.CommercialAsset;
import com.dell.dremioclient.service.CommercialAssetService;

/**
 * @author Namrata_Kumari
 *
 */
@Component
public class CommercialAssetQuery implements GraphQLQueryResolver {

	@Autowired
	CommercialAssetService caService;
	
	public List<CommercialAsset> getCommercialAssets() throws Exception {
        return this.caService.getAllAssets();
    }

    public CommercialAsset getCommercialAsset(String assetId) throws Exception {
        return this.caService.getAssetById(assetId);
    }
}
