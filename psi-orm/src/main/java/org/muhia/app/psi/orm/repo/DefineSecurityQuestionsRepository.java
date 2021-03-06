/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.muhia.app.psi.orm.repo;

import java.util.Collection;
import java.util.Optional;
import org.muhia.app.psi.orm.model.DefineSecurityQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kenneth Muhia <muhia@muhia.org>
 */
@Repository
public interface DefineSecurityQuestionsRepository extends JpaRepository<DefineSecurityQuestions, Long> {

    Collection<DefineSecurityQuestions> findDefineSecurityQuestionsByStatus(int status);

    Optional<DefineSecurityQuestions> findDefineSecurityQuestionsById(Long id);

}
