/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
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

package org.wso2.carbon.identity.oidcdiscovery;

public class OIDCDiscoveryEndPointException extends Exception {
    //This error occurs due to a bad request
    public static final String ERROR_CODE_NO_WELL_KNOWN_PATH = "no_well_known_path";

    //These error are internal server errorrs
    public static final String ERROR_CODE_INVALID_HOST = "invalid_host";
    public static final String ERROR_CODE_INVALID_PATH = "invalid_path";
    public static final String ERROR_CODE_NO_OPENID_PROVIDER_FOUND = "no_configuration_found";
    public static final String ERROR_CODE_JSON_EXCEPTION = "json_error";

    private static final long serialVersionUID = -4449780649560053452L;
    private final String errorCode;
    private final String errorMessage;

    public OIDCDiscoveryEndPointException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public OIDCDiscoveryEndPointException(String errorMessage) {
        super(errorMessage);
        this.errorCode = null;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
