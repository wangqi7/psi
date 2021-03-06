package org.muhia.app.psi.portal.service.orm;

/*
  Copyright 2015-2017 the original author or authors.
  <p>
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
  <p>
  http://www.apache.org/licenses/LICENSE-2.0
  <p>
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
  
*/

import org.muhia.app.psi.orm.model.SiteStatistics;

import java.util.Collection;
import java.util.Optional;

/*
    Created by Kenneth Muhia <muhia@muhia.org> 
    Project: psi
    Package: org.muhia.app.psi.portal.service.orm
    Date: 02-Jan-17.
*/
public interface ISiteStatisticsService {
    SiteStatistics saveSiteStatistics(SiteStatistics statistics);

    void deleteSiteStatistics(SiteStatistics statistics);

    Optional<Collection<SiteStatistics>> findSiteStatisticsByIpAddressAndStatus(String ipAddress, int status);

}
