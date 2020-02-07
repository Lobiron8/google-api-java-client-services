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

package com.google.api.services.reports.model;

/**
 * JSON template for a usage report.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin Reports API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UsageReport extends com.google.api.client.json.GenericJson {

  /**
   * The date of the report request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String date;

  /**
   * Information about the type of the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Entity entity;

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The type of API resource. For a usage report, the value is admin#reports#usageReport.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Parameter value pairs for various applications. For the Customers usage report parameters and
   * values, see the customer usage parameters reference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Parameters> parameters;

  static {
    // hack to force ProGuard to consider Parameters used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Parameters.class);
  }

  /**
   * The date of the report request.
   * @return value or {@code null} for none
   */
  public java.lang.String getDate() {
    return date;
  }

  /**
   * The date of the report request.
   * @param date date or {@code null} for none
   */
  public UsageReport setDate(java.lang.String date) {
    this.date = date;
    return this;
  }

  /**
   * Information about the type of the item.
   * @return value or {@code null} for none
   */
  public Entity getEntity() {
    return entity;
  }

  /**
   * Information about the type of the item.
   * @param entity entity or {@code null} for none
   */
  public UsageReport setEntity(Entity entity) {
    this.entity = entity;
    return this;
  }

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public UsageReport setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The type of API resource. For a usage report, the value is admin#reports#usageReport.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of API resource. For a usage report, the value is admin#reports#usageReport.
   * @param kind kind or {@code null} for none
   */
  public UsageReport setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Parameter value pairs for various applications. For the Customers usage report parameters and
   * values, see the customer usage parameters reference.
   * @return value or {@code null} for none
   */
  public java.util.List<Parameters> getParameters() {
    return parameters;
  }

  /**
   * Parameter value pairs for various applications. For the Customers usage report parameters and
   * values, see the customer usage parameters reference.
   * @param parameters parameters or {@code null} for none
   */
  public UsageReport setParameters(java.util.List<Parameters> parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public UsageReport set(String fieldName, Object value) {
    return (UsageReport) super.set(fieldName, value);
  }

  @Override
  public UsageReport clone() {
    return (UsageReport) super.clone();
  }

  /**
   * Information about the type of the item.
   */
  public static final class Entity extends com.google.api.client.json.GenericJson {

    /**
     * The unique identifier of the customer's account.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String customerId;

    /**
     * Object key. Only relevant if entity.type = "OBJECT" Note: external-facing name of report is
     * "Entities" rather than "Objects".
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String entityId;

    /**
     * The user's immutable G Suite profile identifier.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String profileId;

    /**
     * The type of item. The value is customer.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String type;

    /**
     * The user's email address. Only relevant if entity.type = "USER"
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String userEmail;

    /**
     * The unique identifier of the customer's account.
     * @return value or {@code null} for none
     */
    public java.lang.String getCustomerId() {
      return customerId;
    }

    /**
     * The unique identifier of the customer's account.
     * @param customerId customerId or {@code null} for none
     */
    public Entity setCustomerId(java.lang.String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * Object key. Only relevant if entity.type = "OBJECT" Note: external-facing name of report is
     * "Entities" rather than "Objects".
     * @return value or {@code null} for none
     */
    public java.lang.String getEntityId() {
      return entityId;
    }

    /**
     * Object key. Only relevant if entity.type = "OBJECT" Note: external-facing name of report is
     * "Entities" rather than "Objects".
     * @param entityId entityId or {@code null} for none
     */
    public Entity setEntityId(java.lang.String entityId) {
      this.entityId = entityId;
      return this;
    }

    /**
     * The user's immutable G Suite profile identifier.
     * @return value or {@code null} for none
     */
    public java.lang.String getProfileId() {
      return profileId;
    }

    /**
     * The user's immutable G Suite profile identifier.
     * @param profileId profileId or {@code null} for none
     */
    public Entity setProfileId(java.lang.String profileId) {
      this.profileId = profileId;
      return this;
    }

    /**
     * The type of item. The value is customer.
     * @return value or {@code null} for none
     */
    public java.lang.String getType() {
      return type;
    }

    /**
     * The type of item. The value is customer.
     * @param type type or {@code null} for none
     */
    public Entity setType(java.lang.String type) {
      this.type = type;
      return this;
    }

    /**
     * The user's email address. Only relevant if entity.type = "USER"
     * @return value or {@code null} for none
     */
    public java.lang.String getUserEmail() {
      return userEmail;
    }

    /**
     * The user's email address. Only relevant if entity.type = "USER"
     * @param userEmail userEmail or {@code null} for none
     */
    public Entity setUserEmail(java.lang.String userEmail) {
      this.userEmail = userEmail;
      return this;
    }

    @Override
    public Entity set(String fieldName, Object value) {
      return (Entity) super.set(fieldName, value);
    }

    @Override
    public Entity clone() {
      return (Entity) super.clone();
    }

  }

  /**
   * Model definition for UsageReportParameters.
   */
  public static final class Parameters extends com.google.api.client.json.GenericJson {

    /**
     * Boolean value of the parameter.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean boolValue;

    /**
     * The RFC 3339 formatted value of the parameter, for example 2010-10-28T10:26:35.000Z.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime datetimeValue;

    /**
     * Integer value of the parameter.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key @com.google.api.client.json.JsonString
    private java.lang.Long intValue;

    /**
     * Nested message value of the parameter.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.util.Map<String, java.lang.Object>> msgValue;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * String value of the parameter.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String stringValue;

    /**
     * Boolean value of the parameter.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getBoolValue() {
      return boolValue;
    }

    /**
     * Boolean value of the parameter.
     * @param boolValue boolValue or {@code null} for none
     */
    public Parameters setBoolValue(java.lang.Boolean boolValue) {
      this.boolValue = boolValue;
      return this;
    }

    /**
     * The RFC 3339 formatted value of the parameter, for example 2010-10-28T10:26:35.000Z.
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getDatetimeValue() {
      return datetimeValue;
    }

    /**
     * The RFC 3339 formatted value of the parameter, for example 2010-10-28T10:26:35.000Z.
     * @param datetimeValue datetimeValue or {@code null} for none
     */
    public Parameters setDatetimeValue(com.google.api.client.util.DateTime datetimeValue) {
      this.datetimeValue = datetimeValue;
      return this;
    }

    /**
     * Integer value of the parameter.
     * @return value or {@code null} for none
     */
    public java.lang.Long getIntValue() {
      return intValue;
    }

    /**
     * Integer value of the parameter.
     * @param intValue intValue or {@code null} for none
     */
    public Parameters setIntValue(java.lang.Long intValue) {
      this.intValue = intValue;
      return this;
    }

    /**
     * Nested message value of the parameter.
     * @return value or {@code null} for none
     */
    public java.util.List<java.util.Map<String, java.lang.Object>> getMsgValue() {
      return msgValue;
    }

    /**
     * Nested message value of the parameter.
     * @param msgValue msgValue or {@code null} for none
     */
    public Parameters setMsgValue(java.util.List<java.util.Map<String, java.lang.Object>> msgValue) {
      this.msgValue = msgValue;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getName() {
      return name;
    }

    /**
     * @param name name or {@code null} for none
     */
    public Parameters setName(java.lang.String name) {
      this.name = name;
      return this;
    }

    /**
     * String value of the parameter.
     * @return value or {@code null} for none
     */
    public java.lang.String getStringValue() {
      return stringValue;
    }

    /**
     * String value of the parameter.
     * @param stringValue stringValue or {@code null} for none
     */
    public Parameters setStringValue(java.lang.String stringValue) {
      this.stringValue = stringValue;
      return this;
    }

    @Override
    public Parameters set(String fieldName, Object value) {
      return (Parameters) super.set(fieldName, value);
    }

    @Override
    public Parameters clone() {
      return (Parameters) super.clone();
    }

  }

}
