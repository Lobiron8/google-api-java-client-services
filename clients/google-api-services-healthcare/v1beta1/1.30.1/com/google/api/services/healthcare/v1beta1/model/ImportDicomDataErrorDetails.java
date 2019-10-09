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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Returns the errors encountered during DICOM store import.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportDicomDataErrorDetails extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. Use only for debugging purposes.
   *
   * Contains sample errors encountered in imports of individual resources. For example, a Cloud
   * Storage object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ErrorDetail> sampleErrors;

  static {
    // hack to force ProGuard to consider ErrorDetail used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ErrorDetail.class);
  }

  /**
   * Deprecated. Use only for debugging purposes.
   *
   * Contains sample errors encountered in imports of individual resources. For example, a Cloud
   * Storage object.
   * @return value or {@code null} for none
   */
  public java.util.List<ErrorDetail> getSampleErrors() {
    return sampleErrors;
  }

  /**
   * Deprecated. Use only for debugging purposes.
   *
   * Contains sample errors encountered in imports of individual resources. For example, a Cloud
   * Storage object.
   * @param sampleErrors sampleErrors or {@code null} for none
   */
  public ImportDicomDataErrorDetails setSampleErrors(java.util.List<ErrorDetail> sampleErrors) {
    this.sampleErrors = sampleErrors;
    return this;
  }

  @Override
  public ImportDicomDataErrorDetails set(String fieldName, Object value) {
    return (ImportDicomDataErrorDetails) super.set(fieldName, value);
  }

  @Override
  public ImportDicomDataErrorDetails clone() {
    return (ImportDicomDataErrorDetails) super.clone();
  }

}
