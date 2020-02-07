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

package com.google.api.services.datatransfer.model;

/**
 * The JSON template for an Application resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin Data Transfer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Application extends com.google.api.client.json.GenericJson {

  /**
   * Etag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The application's ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Identifies the resource as a DataTransfer Application Resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The application's name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The list of all possible transfer parameters for this application. These parameters can be used
   * to select the data of the user in this application to be transferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ApplicationTransferParam> transferParams;

  /**
   * Etag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of the resource.
   * @param etag etag or {@code null} for none
   */
  public Application setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The application's ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * The application's ID.
   * @param id id or {@code null} for none
   */
  public Application setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies the resource as a DataTransfer Application Resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies the resource as a DataTransfer Application Resource.
   * @param kind kind or {@code null} for none
   */
  public Application setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The application's name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The application's name.
   * @param name name or {@code null} for none
   */
  public Application setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The list of all possible transfer parameters for this application. These parameters can be used
   * to select the data of the user in this application to be transferred.
   * @return value or {@code null} for none
   */
  public java.util.List<ApplicationTransferParam> getTransferParams() {
    return transferParams;
  }

  /**
   * The list of all possible transfer parameters for this application. These parameters can be used
   * to select the data of the user in this application to be transferred.
   * @param transferParams transferParams or {@code null} for none
   */
  public Application setTransferParams(java.util.List<ApplicationTransferParam> transferParams) {
    this.transferParams = transferParams;
    return this;
  }

  @Override
  public Application set(String fieldName, Object value) {
    return (Application) super.set(fieldName, value);
  }

  @Override
  public Application clone() {
    return (Application) super.clone();
  }

}
