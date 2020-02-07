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

package com.google.api.services.oauth2;

/**
 * Service definition for Oauth2 (v2).
 *
 * <p>
 * Obtains end-user authorization grants for use with other Google APIs.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/accounts/docs/OAuth2" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link Oauth2RequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Oauth2 extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.8 of the Google OAuth2 API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://www.googleapis.com/";

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
  public static final String DEFAULT_BATCH_PATH = "batch/oauth2/v2";

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
  public Oauth2(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Oauth2(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Userinfo collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Oauth2 oauth2 = new Oauth2(...);}
   *   {@code Oauth2.Userinfo.List request = oauth2.userinfo().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Userinfo userinfo() {
    return new Userinfo();
  }

  /**
   * The "userinfo" collection of methods.
   */
  public class Userinfo {

    /**
     * Create a request for the method "userinfo.get".
     *
     * This request holds the parameters needed by the oauth2 server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public Get get() throws java.io.IOException {
      Get result = new Get();
      initialize(result);
      return result;
    }

    public class Get extends Oauth2Request<com.google.api.services.oauth2.model.Userinfoplus> {

      private static final String REST_PATH = "oauth2/v2/userinfo";

      /**
       * Create a request for the method "userinfo.get".
       *
       * This request holds the parameters needed by the the oauth2 server.  After setting any optional
       * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
       * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected Get() {
        super(Oauth2.this, "GET", REST_PATH, null, com.google.api.services.oauth2.model.Userinfoplus.class);
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
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUserIp(java.lang.String userIp) {
        return (Get) super.setUserIp(userIp);
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }

    /**
     * An accessor for creating requests from the V2 collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code Oauth2 oauth2 = new Oauth2(...);}
     *   {@code Oauth2.V2.List request = oauth2.v2().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public V2 v2() {
      return new V2();
    }

    /**
     * The "v2" collection of methods.
     */
    public class V2 {

      /**
       * An accessor for creating requests from the Me collection.
       *
       * <p>The typical use is:</p>
       * <pre>
       *   {@code Oauth2 oauth2 = new Oauth2(...);}
       *   {@code Oauth2.Me.List request = oauth2.me().list(parameters ...)}
       * </pre>
       *
       * @return the resource collection
       */
      public Me me() {
        return new Me();
      }

      /**
       * The "me" collection of methods.
       */
      public class Me {

        /**
         * Create a request for the method "me.get".
         *
         * This request holds the parameters needed by the oauth2 server.  After setting any optional
         * parameters, call the {@link Get#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public Get get() throws java.io.IOException {
          Get result = new Get();
          initialize(result);
          return result;
        }

        public class Get extends Oauth2Request<com.google.api.services.oauth2.model.Userinfoplus> {

          private static final String REST_PATH = "userinfo/v2/me";

          /**
           * Create a request for the method "me.get".
           *
           * This request holds the parameters needed by the the oauth2 server.  After setting any optional
           * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
           * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
           * called to initialize this instance immediately after invoking the constructor. </p>
           *
           * @since 1.13
           */
          protected Get() {
            super(Oauth2.this, "GET", REST_PATH, null, com.google.api.services.oauth2.model.Userinfoplus.class);
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
          public Get setAlt(java.lang.String alt) {
            return (Get) super.setAlt(alt);
          }

          @Override
          public Get setFields(java.lang.String fields) {
            return (Get) super.setFields(fields);
          }

          @Override
          public Get setKey(java.lang.String key) {
            return (Get) super.setKey(key);
          }

          @Override
          public Get setOauthToken(java.lang.String oauthToken) {
            return (Get) super.setOauthToken(oauthToken);
          }

          @Override
          public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
            return (Get) super.setPrettyPrint(prettyPrint);
          }

          @Override
          public Get setQuotaUser(java.lang.String quotaUser) {
            return (Get) super.setQuotaUser(quotaUser);
          }

          @Override
          public Get setUserIp(java.lang.String userIp) {
            return (Get) super.setUserIp(userIp);
          }

          @Override
          public Get set(String parameterName, Object value) {
            return (Get) super.set(parameterName, value);
          }
        }

      }
    }
  }

  /**
   * Create a request for the method "getCertForOpenIdConnect".
   *
   * This request holds the parameters needed by the oauth2 server.  After setting any optional
   * parameters, call the {@link GetCertForOpenIdConnect#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public GetCertForOpenIdConnect getCertForOpenIdConnect() throws java.io.IOException {
    GetCertForOpenIdConnect result = new GetCertForOpenIdConnect();
    initialize(result);
    return result;
  }

  public class GetCertForOpenIdConnect extends Oauth2Request<com.google.api.services.oauth2.model.Jwk> {

    private static final String REST_PATH = "oauth2/v2/certs";

    /**
     * Create a request for the method "getCertForOpenIdConnect".
     *
     * This request holds the parameters needed by the the oauth2 server.  After setting any optional
     * parameters, call the {@link GetCertForOpenIdConnect#execute()} method to invoke the remote
     * operation. <p> {@link GetCertForOpenIdConnect#initialize(com.google.api.client.googleapis.servi
     * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetCertForOpenIdConnect() {
      super(Oauth2.this, "GET", REST_PATH, null, com.google.api.services.oauth2.model.Jwk.class);
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
    public GetCertForOpenIdConnect setAlt(java.lang.String alt) {
      return (GetCertForOpenIdConnect) super.setAlt(alt);
    }

    @Override
    public GetCertForOpenIdConnect setFields(java.lang.String fields) {
      return (GetCertForOpenIdConnect) super.setFields(fields);
    }

    @Override
    public GetCertForOpenIdConnect setKey(java.lang.String key) {
      return (GetCertForOpenIdConnect) super.setKey(key);
    }

    @Override
    public GetCertForOpenIdConnect setOauthToken(java.lang.String oauthToken) {
      return (GetCertForOpenIdConnect) super.setOauthToken(oauthToken);
    }

    @Override
    public GetCertForOpenIdConnect setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetCertForOpenIdConnect) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetCertForOpenIdConnect setQuotaUser(java.lang.String quotaUser) {
      return (GetCertForOpenIdConnect) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetCertForOpenIdConnect setUserIp(java.lang.String userIp) {
      return (GetCertForOpenIdConnect) super.setUserIp(userIp);
    }

    @Override
    public GetCertForOpenIdConnect set(String parameterName, Object value) {
      return (GetCertForOpenIdConnect) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "tokeninfo".
   *
   * This request holds the parameters needed by the oauth2 server.  After setting any optional
   * parameters, call the {@link Tokeninfo#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public Tokeninfo tokeninfo() throws java.io.IOException {
    Tokeninfo result = new Tokeninfo();
    initialize(result);
    return result;
  }

  public class Tokeninfo extends Oauth2Request<com.google.api.services.oauth2.model.Tokeninfo> {

    private static final String REST_PATH = "oauth2/v2/tokeninfo";

    /**
     * Create a request for the method "tokeninfo".
     *
     * This request holds the parameters needed by the the oauth2 server.  After setting any optional
     * parameters, call the {@link Tokeninfo#execute()} method to invoke the remote operation. <p>
     * {@link
     * Tokeninfo#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected Tokeninfo() {
      super(Oauth2.this, "POST", REST_PATH, null, com.google.api.services.oauth2.model.Tokeninfo.class);
    }

    @Override
    public Tokeninfo setAlt(java.lang.String alt) {
      return (Tokeninfo) super.setAlt(alt);
    }

    @Override
    public Tokeninfo setFields(java.lang.String fields) {
      return (Tokeninfo) super.setFields(fields);
    }

    @Override
    public Tokeninfo setKey(java.lang.String key) {
      return (Tokeninfo) super.setKey(key);
    }

    @Override
    public Tokeninfo setOauthToken(java.lang.String oauthToken) {
      return (Tokeninfo) super.setOauthToken(oauthToken);
    }

    @Override
    public Tokeninfo setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Tokeninfo) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Tokeninfo setQuotaUser(java.lang.String quotaUser) {
      return (Tokeninfo) super.setQuotaUser(quotaUser);
    }

    @Override
    public Tokeninfo setUserIp(java.lang.String userIp) {
      return (Tokeninfo) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key("access_token")
    private java.lang.String accessToken;

    /**

     */
    public java.lang.String getAccessToken() {
      return accessToken;
    }

    public Tokeninfo setAccessToken(java.lang.String accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    @com.google.api.client.util.Key("id_token")
    private java.lang.String idToken;

    /**

     */
    public java.lang.String getIdToken() {
      return idToken;
    }

    public Tokeninfo setIdToken(java.lang.String idToken) {
      this.idToken = idToken;
      return this;
    }

    @com.google.api.client.util.Key("token_handle")
    private java.lang.String tokenHandle;

    /**

     */
    public java.lang.String getTokenHandle() {
      return tokenHandle;
    }

    public Tokeninfo setTokenHandle(java.lang.String tokenHandle) {
      this.tokenHandle = tokenHandle;
      return this;
    }

    @Override
    public Tokeninfo set(String parameterName, Object value) {
      return (Tokeninfo) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Oauth2}.
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

    /** Builds a new instance of {@link Oauth2}. */
    @Override
    public Oauth2 build() {
      return new Oauth2(this);
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
     * Set the {@link Oauth2RequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setOauth2RequestInitializer(
        Oauth2RequestInitializer oauth2RequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(oauth2RequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
