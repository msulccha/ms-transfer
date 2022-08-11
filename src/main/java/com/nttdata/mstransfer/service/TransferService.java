package com.nttdata.mstransfer.service;

import com.nttdata.mstransfer.entity.BankAccount;
import com.nttdata.mstransfer.entity.Transfer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface TransferService {

    Mono<Transfer> create(Transfer transfer);

    Flux<Transfer> findAll();

    Mono<Transfer> findById(String id);

    Mono<Transfer> update(Transfer transfer);

    Mono<Boolean> delete(String transfer);

    Mono<Optional<BankAccount>> findBankAccount(String cardNumber);

    Mono<BankAccount> updateBankAccountBalance(BankAccount numberAccount);
}
