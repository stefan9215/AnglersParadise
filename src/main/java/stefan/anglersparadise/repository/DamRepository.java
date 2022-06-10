package stefan.anglersparadise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stefan.anglersparadise.model.entity.DamEntity;

@Repository
public interface DamRepository extends JpaRepository<DamEntity, Long> {
}
