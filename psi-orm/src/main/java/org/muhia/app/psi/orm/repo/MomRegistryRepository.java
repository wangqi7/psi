/**
 * Aug 14, 2016
 */
package org.muhia.app.psi.orm.repo;

import org.muhia.app.psi.orm.model.MomRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Kenneth Muhia <muhia@muhia.org>
 */
@Repository
public interface MomRegistryRepository extends JpaRepository<MomRegistry, Long> {
    Optional<MomRegistry> findMomRegistryByAccountid(String accountid);

    Optional<MomRegistry> findMomRegistryById(Long id);

}
