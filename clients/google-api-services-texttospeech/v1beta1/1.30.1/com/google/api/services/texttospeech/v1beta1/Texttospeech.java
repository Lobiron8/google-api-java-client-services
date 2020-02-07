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

package com.google.api.services.texttospeech.v1beta1;

/**
 * Service definition for Texttospeech (v1beta1).
 *
 * <p>
 * Synthesizes natural-sounding speech by applying powerful neural network models.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/text-to-speech/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link TexttospeechRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Texttospeech extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.8 of the Cloud Text-to-Speech API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://texttospeech.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Texttospeech(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Texttospeech(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Text collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Texttospeech texttospeech = new Texttospeech(...);}
   *   {@code Texttospeech.Text.List request = texttospeech.text().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Text text() {
    return new Text();
  }

  /**
   * The "text" collection of methods.
   */
  public class Text {

    /**
     * Synthesizes speech synchronously: receive results after all text input has been processed.
     *
     * Create a request for the method "text.synthesize".
     *
     * This request holds the parameters needed by the texttospeech server.  After setting any optional
     * parameters, call the {@link Synthesize#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.texttospeech.v1beta1.model.SynthesizeSpeechRequest}
     * @return the request
     */
    public Synthesize synthesize(com.google.api.services.texttospeech.v1beta1.model.SynthesizeSpeechRequest content) throws java.io.IOException {
      Synthesize result = new Synthesize(content);
      initialize(result);
      return result;
    }

    public class Synthesize extends TexttospeechRequest<com.google.api.services.texttospeech.v1beta1.model.SynthesizeSpeechResponse> {

      private static final String REST_PATH = "v1beta1/text:synthesize";

      /**
       * Synthesizes speech synchronously: receive results after all text input has been processed.
       *
       * Create a request for the method "text.synthesize".
       *
       * This request holds the parameters needed by the the texttospeech server.  After setting any
       * optional parameters, call the {@link Synthesize#execute()} method to invoke the remote
       * operation. <p> {@link
       * Synthesize#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.texttospeech.v1beta1.model.SynthesizeSpeechRequest}
       * @since 1.13
       */
      protected Synthesize(com.google.api.services.texttospeech.v1beta1.model.SynthesizeSpeechRequest content) {
        super(Texttospeech.this, "POST", REST_PATH, content, com.google.api.services.texttospeech.v1beta1.model.SynthesizeSpeechResponse.class);
      }

      @Override
      public Synthesize set$Xgafv(java.lang.String $Xgafv) {
        return (Synthesize) super.set$Xgafv($Xgafv);
      }

      @Override
      public Synthesize setAccessToken(java.lang.String accessToken) {
        return (Synthesize) super.setAccessToken(accessToken);
      }

      @Override
      public Synthesize setAlt(java.lang.String alt) {
        return (Synthesize) super.setAlt(alt);
      }

      @Override
      public Synthesize setCallback(java.lang.String callback) {
        return (Synthesize) super.setCallback(callback);
      }

      @Override
      public Synthesize setFields(java.lang.String fields) {
        return (Synthesize) super.setFields(fields);
      }

      @Override
      public Synthesize setKey(java.lang.String key) {
        return (Synthesize) super.setKey(key);
      }

      @Override
      public Synthesize setOauthToken(java.lang.String oauthToken) {
        return (Synthesize) super.setOauthToken(oauthToken);
      }

      @Override
      public Synthesize setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Synthesize) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Synthesize setQuotaUser(java.lang.String quotaUser) {
        return (Synthesize) super.setQuotaUser(quotaUser);
      }

      @Override
      public Synthesize setUploadType(java.lang.String uploadType) {
        return (Synthesize) super.setUploadType(uploadType);
      }

      @Override
      public Synthesize setUploadProtocol(java.lang.String uploadProtocol) {
        return (Synthesize) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Synthesize set(String parameterName, Object value) {
        return (Synthesize) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Voices collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Texttospeech texttospeech = new Texttospeech(...);}
   *   {@code Texttospeech.Voices.List request = texttospeech.voices().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Voices voices() {
    return new Voices();
  }

  /**
   * The "voices" collection of methods.
   */
  public class Voices {

    /**
     * Returns a list of Voice supported for synthesis.
     *
     * Create a request for the method "voices.list".
     *
     * This request holds the parameters needed by the texttospeech server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public List list() throws java.io.IOException {
      List result = new List();
      initialize(result);
      return result;
    }

    public class List extends TexttospeechRequest<com.google.api.services.texttospeech.v1beta1.model.ListVoicesResponse> {

      private static final String REST_PATH = "v1beta1/voices";

      /**
       * Returns a list of Voice supported for synthesis.
       *
       * Create a request for the method "voices.list".
       *
       * This request holds the parameters needed by the the texttospeech server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected List() {
        super(Texttospeech.this, "GET", REST_PATH, null, com.google.api.services.texttospeech.v1beta1.model.ListVoicesResponse.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public List set$Xgafv(java.lang.String $Xgafv) {
        return (List) super.set$Xgafv($Xgafv);
      }

      @Override
      public List setAccessToken(java.lang.String accessToken) {
        return (List) super.setAccessToken(accessToken);
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setCallback(java.lang.String callback) {
        return (List) super.setCallback(callback);
      }

      @Override
      public List setFields(java.lang.String fields) {
        return (List) super.setFields(fields);
      }

      @Override
      public List setKey(java.lang.String key) {
        return (List) super.setKey(key);
      }

      @Override
      public List setOauthToken(java.lang.String oauthToken) {
        return (List) super.setOauthToken(oauthToken);
      }

      @Override
      public List setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (List) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public List setQuotaUser(java.lang.String quotaUser) {
        return (List) super.setQuotaUser(quotaUser);
      }

      @Override
      public List setUploadType(java.lang.String uploadType) {
        return (List) super.setUploadType(uploadType);
      }

      @Override
      public List setUploadProtocol(java.lang.String uploadProtocol) {
        return (List) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Optional. Recommended. [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
       * If specified, the ListVoices call will only return voices that can be used to synthesize
       * this language_code. E.g. when specifying "en-NZ", you will get supported "en-*" voices;
       * when specifying "no", you will get supported "no-*" (Norwegian) and "nb-*" (Norwegian
       * Bokmal) voices; specifying "zh" will also get supported "cmn-*" voices; specifying "zh-hk"
       * will also get supported "yue-*" voices.
       */
      @com.google.api.client.util.Key
      private java.lang.String languageCode;

      /** Optional. Recommended. [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If
     specified, the ListVoices call will only return voices that can be used to synthesize this
     language_code. E.g. when specifying "en-NZ", you will get supported "en-*" voices; when specifying
     "no", you will get supported "no-*" (Norwegian) and "nb-*" (Norwegian Bokmal) voices; specifying
     "zh" will also get supported "cmn-*" voices; specifying "zh-hk" will also get supported "yue-*"
     voices.
       */
      public java.lang.String getLanguageCode() {
        return languageCode;
      }

      /**
       * Optional. Recommended. [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
       * If specified, the ListVoices call will only return voices that can be used to synthesize
       * this language_code. E.g. when specifying "en-NZ", you will get supported "en-*" voices;
       * when specifying "no", you will get supported "no-*" (Norwegian) and "nb-*" (Norwegian
       * Bokmal) voices; specifying "zh" will also get supported "cmn-*" voices; specifying "zh-hk"
       * will also get supported "yue-*" voices.
       */
      public List setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
        return this;
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Texttospeech}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Texttospeech}. */
    @Override
    public Texttospeech build() {
      return new Texttospeech(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link TexttospeechRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setTexttospeechRequestInitializer(
        TexttospeechRequestInitializer texttospeechRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(texttospeechRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
