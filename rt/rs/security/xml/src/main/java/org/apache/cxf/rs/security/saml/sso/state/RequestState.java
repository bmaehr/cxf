/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cxf.rs.security.saml.sso.state;

public class RequestState {

    private String targetAddress;
    private String idpServiceAddress;
    private String samlRequestId;
    private String issuerId;
    private long createdAt;
 
    public RequestState(String targetAddress,
                        String idpServiceAddress,
                        String samlRequestId,
                        String issuerId,
                        long createdAt) {
        this.targetAddress = targetAddress;
        this.idpServiceAddress = idpServiceAddress;
        this.samlRequestId = samlRequestId;
        this.issuerId = issuerId;
        this.createdAt = createdAt;
    }

    public String getTargetAddress() {
        return targetAddress;
    }

    public String getIdpServiceAddress() {
        return idpServiceAddress;
    }

    public String getSamlRequestId() {
        return samlRequestId;
    }

    public String getIssuerId() {
        return issuerId;
    }

    public long getCreatedAt() {
        return createdAt;
    }
}
