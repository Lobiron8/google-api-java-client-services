/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.clouderrorreporting.v1beta1.model;

/**
 * A description of the context in which an error occurred. This data should be provided by the
 * application when reporting an error, unless the error report has been generated automatically
 * from Google App Engine logs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Error Reporting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ErrorContext extends com.google.api.client.json.GenericJson {

  /**
   * The HTTP request which was processed when the error was triggered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRequestContext httpRequest;

  /**
   * The location in the source code where the decision was made to report the error, usually the
   * place where it was logged. For a logged exception this would be the source line where the
   * exception is logged, usually close to the place where it was caught.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceLocation reportLocation;

  /**
   * Source code that was used to build the executable which has caused the given error message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SourceReference> sourceReferences;

  /**
   * The user who caused or was affected by the crash. This can be a user ID, an email address, or
   * an arbitrary token that uniquely identifies the user. When sending an error report, leave this
   * field empty if the user was not logged in. In this case the Error Reporting system will use
   * other data, such as remote IP address, to distinguish affected users. See
   * `affected_users_count` in `ErrorGroupStats`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String user;

  /**
   * The HTTP request which was processed when the error was triggered.
   * @return value or {@code null} for none
   */
  public HttpRequestContext getHttpRequest() {
    return httpRequest;
  }

  /**
   * The HTTP request which was processed when the error was triggered.
   * @param httpRequest httpRequest or {@code null} for none
   */
  public ErrorContext setHttpRequest(HttpRequestContext httpRequest) {
    this.httpRequest = httpRequest;
    return this;
  }

  /**
   * The location in the source code where the decision was made to report the error, usually the
   * place where it was logged. For a logged exception this would be the source line where the
   * exception is logged, usually close to the place where it was caught.
   * @return value or {@code null} for none
   */
  public SourceLocation getReportLocation() {
    return reportLocation;
  }

  /**
   * The location in the source code where the decision was made to report the error, usually the
   * place where it was logged. For a logged exception this would be the source line where the
   * exception is logged, usually close to the place where it was caught.
   * @param reportLocation reportLocation or {@code null} for none
   */
  public ErrorContext setReportLocation(SourceLocation reportLocation) {
    this.reportLocation = reportLocation;
    return this;
  }

  /**
   * Source code that was used to build the executable which has caused the given error message.
   * @return value or {@code null} for none
   */
  public java.util.List<SourceReference> getSourceReferences() {
    return sourceReferences;
  }

  /**
   * Source code that was used to build the executable which has caused the given error message.
   * @param sourceReferences sourceReferences or {@code null} for none
   */
  public ErrorContext setSourceReferences(java.util.List<SourceReference> sourceReferences) {
    this.sourceReferences = sourceReferences;
    return this;
  }

  /**
   * The user who caused or was affected by the crash. This can be a user ID, an email address, or
   * an arbitrary token that uniquely identifies the user. When sending an error report, leave this
   * field empty if the user was not logged in. In this case the Error Reporting system will use
   * other data, such as remote IP address, to distinguish affected users. See
   * `affected_users_count` in `ErrorGroupStats`.
   * @return value or {@code null} for none
   */
  public java.lang.String getUser() {
    return user;
  }

  /**
   * The user who caused or was affected by the crash. This can be a user ID, an email address, or
   * an arbitrary token that uniquely identifies the user. When sending an error report, leave this
   * field empty if the user was not logged in. In this case the Error Reporting system will use
   * other data, such as remote IP address, to distinguish affected users. See
   * `affected_users_count` in `ErrorGroupStats`.
   * @param user user or {@code null} for none
   */
  public ErrorContext setUser(java.lang.String user) {
    this.user = user;
    return this;
  }

  @Override
  public ErrorContext set(String fieldName, Object value) {
    return (ErrorContext) super.set(fieldName, value);
  }

  @Override
  public ErrorContext clone() {
    return (ErrorContext) super.clone();
  }

}
