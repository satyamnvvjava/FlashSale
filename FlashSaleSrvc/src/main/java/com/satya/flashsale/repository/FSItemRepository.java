package com.satya.flashsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satya.flashsale.entity.ItemDetails;

public interface FSItemRepository extends JpaRepository<ItemDetails, Integer>{
    ItemDetails findByItemId(int itemId);
}
