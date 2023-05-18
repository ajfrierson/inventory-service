package com.programmingtechie.inventoryservice.repository;

import com.programmingtechie.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepository  extends JpaRepository<Inventory, Integer> {
    Optional<Inventory> findBySkuCode(String skuCode);
}
