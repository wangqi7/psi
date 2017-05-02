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
 * Generated on Oct 13, 2016 for  psi-portal on package org.muhia.app.psi.portal.service.impl
 */
package org.muhia.app.psi.portal.service.orm.impl;

import org.muhia.app.psi.portal.service.orm.IPasswordResetTokenService;
import org.muhia.app.psi.orm.model.PasswordResetTokens;
import org.muhia.app.psi.orm.repo.PasswordResetTokensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author Kenneth Muhia <muhia@muhia.org>
 *
 */
@Service
@Transactional
public class PasswordResetTokenService implements IPasswordResetTokenService {

    @Autowired
    private PasswordResetTokensRepository repository;

    @Override
    public PasswordResetTokens getPasswordResetToken(String token) {
        return repository.findPasswordResetTokensByToken(token);
    }

}