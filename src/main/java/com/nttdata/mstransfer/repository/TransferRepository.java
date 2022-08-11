package com.nttdata.mstransfer.repository;

import com.nttdata.mstransfer.entity.Transfer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TransferRepository extends ReactiveMongoRepository<Transfer, String> {


}
