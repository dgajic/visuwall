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

package net.awired.visuwall.plugin.jenkins;

import com.google.common.base.Preconditions;

/**
 * Must find jenkins version like "Jenkins ver. 1.407"
 */
public class JenkinsVersionExtractor {

    private String content;

    public JenkinsVersionExtractor(String content) {
        Preconditions.checkNotNull(content, "content is mandatory");
        this.content = content;
    }

    public String version() {
        String right = content.split("Jenkins ver\\.")[1].trim();
        String version = right.split("<")[0];
        return version;
    }

}