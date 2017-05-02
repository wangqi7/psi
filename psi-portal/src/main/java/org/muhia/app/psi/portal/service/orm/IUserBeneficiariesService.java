/**
 * Copyright 2015-2017 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * <p>
 * Generated on Oct 13, 2016 for  psi-portal on package org.muhia.app.psi.portal.service
 */
package org.muhia.app.psi.portal.service.orm;

import org.muhia.app.psi.orm.model.UserBeneficiaries;

import java.util.Collection;
import java.util.Optional;
import org.muhia.app.psi.orm.model.Principals;

/**
 * @author Kenneth Muhia <muhia@muhia.org>
 *
 */
public interface IUserBeneficiariesService {

    UserBeneficiaries saveUserBeneficiaries(UserBeneficiaries beneficiaries);

    void deleteUserBeneficiary(UserBeneficiaries beneficiaries);

    UserBeneficiaries updateUserBeneficiaries(UserBeneficiaries beneficiaries);

    UserBeneficiaries findUserBeneficiariesById(Long id);

    Collection<UserBeneficiaries> findUserBeneficiariesByBeneficiaryStartsWithIgnoreCase(String text);
    
    Collection<UserBeneficiaries> findByPrincipalsAndStatus(Principals principals,String status);

    Optional<UserBeneficiaries> findByPrincipalsAndId(Principals principals,int status);
}