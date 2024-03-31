package com.inventoryservice;

import com.inventoryservice.model.Inventory;
import com.inventoryservice.repo.InventoryRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepo inventoryRepo){
		return args -> {

					Inventory inventory = new Inventory();
					inventory.setSkuCode("iphone_13");
					inventory.setQuantity(100);

					Inventory inventory1 = new Inventory();
					inventory1.setSkuCode("iphone_13_red");
					inventory1.setQuantity(100);

					inventoryRepo.save(inventory);
					inventoryRepo.save(inventory1);
				};
			}
		}
