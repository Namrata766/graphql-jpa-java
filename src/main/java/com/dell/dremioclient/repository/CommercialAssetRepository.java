package com.dell.dremioclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dell.dremioclient.domain.CommercialAsset;

/**
 * @author Namrata_Kumari
 *
 */
@Repository
public interface CommercialAssetRepository extends JpaRepository<CommercialAsset, String> {

}
