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
package org.wso2.carbon.identity.webfinger;


public class WebFingerEndPointException extends Exception{
    public static final String ERROR_CODE_NO_WEBFINGER_CONFIG = "webfinger_configurations_not_set";
    public static final String ERROR_CODE_INVALID_RESOURCE = "invalid_resource";
    public static final String ERROR_CODE_JSON_EXCEPTION = "json_exception";
    public static final String ERROR_CODE_INVALID_REQUEST = "invalid_request";

    private static final long serialVersionUID = -4449780649560035452L;
    private final String errorCode;
    private final String errorMessage;

    public WebFingerEndPointException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public WebFingerEndPointException(String errorMessage) {
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
