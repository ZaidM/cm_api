// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.cloudera.api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "healthCheck")
public class ApiHealthCheck {
  private String name;
  private ApiHealthSummary summary;

  public ApiHealthCheck() {
    // For JAX-B
  }

  public ApiHealthCheck(String name, ApiHealthSummary summary) {
    this.name = name;
    this.summary = summary;
  }

  /** Unique name of this health check. */
  @XmlElement
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /** The summary status of this check. */
  @XmlElement
  public ApiHealthSummary getSummary() {
    return summary;
  }

  public void setSummary(ApiHealthSummary summary) {
    this.summary = summary;
  }
}