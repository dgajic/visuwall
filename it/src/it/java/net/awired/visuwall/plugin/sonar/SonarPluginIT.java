/**
 * Copyright (C) 2010 Julien SMADJA <julien dot smadja at gmail dot com> - Arnaud LEMAIRE <alemaire at norad dot fr>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.awired.visuwall.plugin.sonar;

import static net.awired.visuwall.IntegrationTestData.SONAR_URL;
import static net.awired.visuwall.IntegrationTestData.STRUTS_ARTIFACT_ID;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Map.Entry;
import java.util.Set;

import net.awired.visuwall.api.domain.ProjectId;
import net.awired.visuwall.api.domain.quality.QualityMeasure;
import net.awired.visuwall.api.domain.quality.QualityResult;
import net.awired.visuwall.api.exception.ProjectNotFoundException;
<<<<<<< HEAD:sonar-plugin/src/test/java/net/awired/visuwall/plugin/sonar/it/service/SonarServiceIT.java
import net.awired.visuwall.plugin.sonar.SonarConnectionPlugin;
=======
>>>>>>> d1e18665bbedc8f7ed1fe0a53acb4e91bb188f97:it/src/it/java/net/awired/visuwall/plugin/sonar/SonarPluginIT.java

import org.junit.BeforeClass;
import org.junit.Test;


public class SonarPluginIT {

<<<<<<< HEAD:sonar-plugin/src/test/java/net/awired/visuwall/plugin/sonar/it/service/SonarServiceIT.java
    private static SonarConnectionPlugin sonarService;

    private static final String SONAR_ID = "SONAR_ID";

    @BeforeClass
    public static void init() {
        sonarService = new SonarConnectionPlugin();
        sonarService.setUrl(SONAR_URL);
        sonarService.init();
=======
    private static SonarPlugin sonarPlugin;

    @BeforeClass
    public static void init() {
        sonarPlugin = new SonarPlugin();
        sonarPlugin.setUrl(SONAR_URL);
        sonarPlugin.init();
>>>>>>> d1e18665bbedc8f7ed1fe0a53acb4e91bb188f97:it/src/it/java/net/awired/visuwall/plugin/sonar/SonarPluginIT.java
    }

    @Test
    public void should_populate_quality() {
        ProjectId projectId = new ProjectId();
        projectId.setArtifactId(STRUTS_ARTIFACT_ID);
        QualityResult quality = sonarPlugin.populateQuality(projectId, "violations_density");
        QualityMeasure measure = quality.getMeasure("violations_density");
        assertEquals("Rules compliance", measure.getName());
        assertEquals("77.2%", measure.getFormattedValue());
        assertEquals(77.2, measure.getValue(), 0);
    }

    @Test
    public void should_have_a_lot_of_quality_metrics() {
        ProjectId projectId = new ProjectId();
        projectId.setArtifactId(STRUTS_ARTIFACT_ID);
        QualityResult quality = sonarPlugin.populateQuality(projectId);
        Set<Entry<String, QualityMeasure>> measures = quality.getMeasures();
        for (Entry<String, QualityMeasure> measure : measures) {
            assertNotNull(measure.getValue().getValue());
        }
    }

    @Test
    public void should_not_fail_if_measure_does_not_exist() throws ProjectNotFoundException {
        ProjectId projectId = new ProjectId();
        projectId.setArtifactId(STRUTS_ARTIFACT_ID);
        sonarPlugin.populateQuality(projectId, "inexistant_measure");
    }
}
