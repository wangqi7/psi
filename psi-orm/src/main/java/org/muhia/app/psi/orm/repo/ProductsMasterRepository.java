/**
 * 
 * Aug 14, 2016
 */
package org.muhia.app.psi.orm.repo;

import org.muhia.app.psi.orm.model.ProductsMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kenneth Muhia <muhia@muhia.org>
 *
 */
@Repository
public interface ProductsMasterRepository extends JpaRepository<ProductsMaster, Long> {


//	$(echo ${i%Repository.*}) findbyOrganizationAndStatus(String organization, int status);
}
