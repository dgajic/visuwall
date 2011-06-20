/**
 *     Copyright (C) 2010 Julien SMADJA <julien dot smadja at gmail dot com> - Arnaud LEMAIRE <alemaire at norad dot fr>
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *             http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package net.awired.visuwall.plugin.jenkins.builder;

import java.util.HashSet;
import java.util.Set;

import net.awired.visuwall.api.domain.Build;
import net.awired.visuwall.api.domain.Commiter;
import net.awired.visuwall.api.domain.State;
import net.awired.visuwall.api.domain.TestResult;
import net.awired.visuwall.hudsonclient.domain.HudsonBuild;
import net.awired.visuwall.hudsonclient.domain.HudsonCommiter;
import net.awired.visuwall.hudsonclient.domain.HudsonTestResult;
import net.awired.visuwall.plugin.jenkins.States;

import com.google.common.base.Preconditions;

public class BuildBuilder {

	private HudsonBuild jenkinsBuild;
	private Build build;

	public Build createBuildFrom(HudsonBuild jenkinsBuild) {
		Preconditions.checkNotNull(jenkinsBuild, "jenkinsBuild is mandatory");
		this.jenkinsBuild = jenkinsBuild;
		build();
		return this.build;
	}

	private void build() {
		build = new Build();
		build.setDuration(jenkinsBuild.getDuration());
		build.setStartTime(jenkinsBuild.getStartTime());
		build.setBuildNumber(jenkinsBuild.getBuildNumber());
		addUnitTestResults();
		addIntegrationTestResults();
		addCommiters();
		addState();
	}

	private void addState() {
		String jenkinsBuildState = jenkinsBuild.getState();
		if (jenkinsBuildState == null) {
			build.setState(State.UNKNOWN);
		} else {
			build.setState(States.asVisuwallState(jenkinsBuildState));
		}
	}

	private void addCommiters() {
		Set<HudsonCommiter> hudsonCommiters = jenkinsBuild.getCommiters();
		Set<Commiter> commiters = createCommiters(hudsonCommiters);
		build.setCommiters(commiters);
	}

	private void addIntegrationTestResults() {
		HudsonTestResult hudsonIntegrationTestResult = jenkinsBuild.getIntegrationTestResult();
		if (hudsonIntegrationTestResult != null) {
			TestResult integrationTestResult = createTestResult(hudsonIntegrationTestResult);
			build.setIntegrationTestResult(integrationTestResult);
		}
	}

	private HudsonTestResult addUnitTestResults() {
		HudsonTestResult hudsonUnitTestResult = jenkinsBuild.getUnitTestResult();
		if (hudsonUnitTestResult != null) {
			TestResult unitTestResult = createTestResult(hudsonUnitTestResult);
			build.setUnitTestResult(unitTestResult);
		}
		return hudsonUnitTestResult;
	}

	private Set<Commiter> createCommiters(Set<HudsonCommiter> hudsonCommiters) {
		Set<Commiter> commiters = new HashSet<Commiter>();
		for (HudsonCommiter hudsonCommiter : hudsonCommiters) {
			commiters.add(createCommiter(hudsonCommiter));
		}
		return commiters;
	}

	private Commiter createCommiter(HudsonCommiter hudsonCommiter) {
		Commiter commiter = new Commiter(hudsonCommiter.getId());
		commiter.setEmail(hudsonCommiter.getEmail());
		commiter.setName(hudsonCommiter.getName());
		return commiter;
	}

	private TestResult createTestResult(HudsonTestResult hudsonTestResult) {
		TestResult testResult = new TestResult();
		testResult.setFailCount(hudsonTestResult.getFailCount());
		testResult.setPassCount(hudsonTestResult.getPassCount());
		testResult.setSkipCount(hudsonTestResult.getSkipCount());
		return testResult;
	}

}