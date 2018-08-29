package br.com.projeto.fidemax.repository;

import br.com.projeto.fidemax.domain.RedemptionTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedemptionTransactionRepository extends JpaRepository<RedemptionTransaction, Long> {

}
