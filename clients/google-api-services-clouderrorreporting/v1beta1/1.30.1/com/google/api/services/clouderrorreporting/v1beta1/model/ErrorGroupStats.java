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
 * Data extracted for a specific group based on certain filter criteria, such as a given time period
 * and/or service filter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Error Reporting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ErrorGroupStats extends com.google.api.client.json.GenericJson {

  /**
   * Service contexts with a non-zero error count for the given filter criteria. This list can be
   * truncated if multiple services are affected. Refer to `num_affected_services` for the total
   * count.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ServiceContext> affectedServices;

  /**
   * Approximate number of affected users in the given group that match the filter criteria. Users
   * are distinguished by data in the `ErrorContext` of the individual error events, such as their
   * login name or their remote IP address in case of HTTP requests. The number of affected users
   * can be zero even if the number of errors is non-zero if no data was provided from which the
   * affected user could be deduced. Users are counted based on data in the request context that was
   * provided in the error report. If more users are implicitly affected, such as due to a crash of
   * the whole service, this is not reflected here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long affectedUsersCount;

  /**
   * Approximate total number of events in the given group that match the filter criteria.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long count;

  /**
   * Approximate first occurrence that was ever seen for this group and which matches the given
   * filter criteria, ignoring the time_range that was specified in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String firstSeenTime;

  /**
   * Group data that is independent of the filter criteria.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ErrorGroup group;

  /**
   * Approximate last occurrence that was ever seen for this group and which matches the given
   * filter criteria, ignoring the time_range that was specified in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastSeenTime;

  /**
   * The total number of services with a non-zero error count for the given filter criteria.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numAffectedServices;

  /**
   * An arbitrary event that is chosen as representative for the whole group. The representative
   * event is intended to be used as a quick preview for the whole group. Events in the group are
   * usually sufficiently similar to each other such that showing an arbitrary representative
   * provides insight into the characteristics of the group as a whole.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ErrorEvent representative;

  /**
   * Approximate number of occurrences over time. Timed counts returned by ListGroups are guaranteed
   * to be:
   *
   * - Inside the requested time interval - Non-overlapping, and - Ordered by ascending time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TimedCount> timedCounts;

  /**
   * Service contexts with a non-zero error count for the given filter criteria. This list can be
   * truncated if multiple services are affected. Refer to `num_affected_services` for the total
   * count.
   * @return value or {@code null} for none
   */
  public java.util.List<ServiceContext> getAffectedServices() {
    return affectedServices;
  }

  /**
   * Service contexts with a non-zero error count for the given filter criteria. This list can be
   * truncated if multiple services are affected. Refer to `num_affected_services` for the total
   * count.
   * @param affectedServices affectedServices or {@code null} for none
   */
  public ErrorGroupStats setAffectedServices(java.util.List<ServiceContext> affectedServices) {
    this.affectedServices = affectedServices;
    return this;
  }

  /**
   * Approximate number of affected users in the given group that match the filter criteria. Users
   * are distinguished by data in the `ErrorContext` of the individual error events, such as their
   * login name or their remote IP address in case of HTTP requests. The number of affected users
   * can be zero even if the number of errors is non-zero if no data was provided from which the
   * affected user could be deduced. Users are counted based on data in the request context that was
   * provided in the error report. If more users are implicitly affected, such as due to a crash of
   * the whole service, this is not reflected here.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAffectedUsersCount() {
    return affectedUsersCount;
  }

  /**
   * Approximate number of affected users in the given group that match the filter criteria. Users
   * are distinguished by data in the `ErrorContext` of the individual error events, such as their
   * login name or their remote IP address in case of HTTP requests. The number of affected users
   * can be zero even if the number of errors is non-zero if no data was provided from which the
   * affected user could be deduced. Users are counted based on data in the request context that was
   * provided in the error report. If more users are implicitly affected, such as due to a crash of
   * the whole service, this is not reflected here.
   * @param affectedUsersCount affectedUsersCount or {@code null} for none
   */
  public ErrorGroupStats setAffectedUsersCount(java.lang.Long affectedUsersCount) {
    this.affectedUsersCount = affectedUsersCount;
    return this;
  }

  /**
   * Approximate total number of events in the given group that match the filter criteria.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * Approximate total number of events in the given group that match the filter criteria.
   * @param count count or {@code null} for none
   */
  public ErrorGroupStats setCount(java.lang.Long count) {
    this.count = count;
    return this;
  }

  /**
   * Approximate first occurrence that was ever seen for this group and which matches the given
   * filter criteria, ignoring the time_range that was specified in the request.
   * @return value or {@code null} for none
   */
  public String getFirstSeenTime() {
    return firstSeenTime;
  }

  /**
   * Approximate first occurrence that was ever seen for this group and which matches the given
   * filter criteria, ignoring the time_range that was specified in the request.
   * @param firstSeenTime firstSeenTime or {@code null} for none
   */
  public ErrorGroupStats setFirstSeenTime(String firstSeenTime) {
    this.firstSeenTime = firstSeenTime;
    return this;
  }

  /**
   * Group data that is independent of the filter criteria.
   * @return value or {@code null} for none
   */
  public ErrorGroup getGroup() {
    return group;
  }

  /**
   * Group data that is independent of the filter criteria.
   * @param group group or {@code null} for none
   */
  public ErrorGroupStats setGroup(ErrorGroup group) {
    this.group = group;
    return this;
  }

  /**
   * Approximate last occurrence that was ever seen for this group and which matches the given
   * filter criteria, ignoring the time_range that was specified in the request.
   * @return value or {@code null} for none
   */
  public String getLastSeenTime() {
    return lastSeenTime;
  }

  /**
   * Approximate last occurrence that was ever seen for this group and which matches the given
   * filter criteria, ignoring the time_range that was specified in the request.
   * @param lastSeenTime lastSeenTime or {@code null} for none
   */
  public ErrorGroupStats setLastSeenTime(String lastSeenTime) {
    this.lastSeenTime = lastSeenTime;
    return this;
  }

  /**
   * The total number of services with a non-zero error count for the given filter criteria.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumAffectedServices() {
    return numAffectedServices;
  }

  /**
   * The total number of services with a non-zero error count for the given filter criteria.
   * @param numAffectedServices numAffectedServices or {@code null} for none
   */
  public ErrorGroupStats setNumAffectedServices(java.lang.Integer numAffectedServices) {
    this.numAffectedServices = numAffectedServices;
    return this;
  }

  /**
   * An arbitrary event that is chosen as representative for the whole group. The representative
   * event is intended to be used as a quick preview for the whole group. Events in the group are
   * usually sufficiently similar to each other such that showing an arbitrary representative
   * provides insight into the characteristics of the group as a whole.
   * @return value or {@code null} for none
   */
  public ErrorEvent getRepresentative() {
    return representative;
  }

  /**
   * An arbitrary event that is chosen as representative for the whole group. The representative
   * event is intended to be used as a quick preview for the whole group. Events in the group are
   * usually sufficiently similar to each other such that showing an arbitrary representative
   * provides insight into the characteristics of the group as a whole.
   * @param representative representative or {@code null} for none
   */
  public ErrorGroupStats setRepresentative(ErrorEvent representative) {
    this.representative = representative;
    return this;
  }

  /**
   * Approximate number of occurrences over time. Timed counts returned by ListGroups are guaranteed
   * to be:
   *
   * - Inside the requested time interval - Non-overlapping, and - Ordered by ascending time.
   * @return value or {@code null} for none
   */
  public java.util.List<TimedCount> getTimedCounts() {
    return timedCounts;
  }

  /**
   * Approximate number of occurrences over time. Timed counts returned by ListGroups are guaranteed
   * to be:
   *
   * - Inside the requested time interval - Non-overlapping, and - Ordered by ascending time.
   * @param timedCounts timedCounts or {@code null} for none
   */
  public ErrorGroupStats setTimedCounts(java.util.List<TimedCount> timedCounts) {
    this.timedCounts = timedCounts;
    return this;
  }

  @Override
  public ErrorGroupStats set(String fieldName, Object value) {
    return (ErrorGroupStats) super.set(fieldName, value);
  }

  @Override
  public ErrorGroupStats clone() {
    return (ErrorGroupStats) super.clone();
  }

}
