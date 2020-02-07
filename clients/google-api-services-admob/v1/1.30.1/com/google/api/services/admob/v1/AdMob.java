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

package com.google.api.services.admob.v1;

/**
 * Service definition for AdMob (v1).
 *
 * <p>
 * The Google AdMob API lets you programmatically get reports on earnings.

 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/admob/api/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link AdMobRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class AdMob extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.8 of the AdMob API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://admob.googleapis.com/";

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
  public AdMob(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  AdMob(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Accounts collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code AdMob admob = new AdMob(...);}
   *   {@code AdMob.Accounts.List request = admob.accounts().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Accounts accounts() {
    return new Accounts();
  }

  /**
   * The "accounts" collection of methods.
   */
  public class Accounts {

    /**
     * Gets information about the specified AdMob publisher account.
     *
     * Create a request for the method "accounts.get".
     *
     * This request holds the parameters needed by the admob server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param name Resource name of the publisher account to retrieve.
    Example: accounts/pub-9876543210987654
     * @return the request
     */
    public Get get(java.lang.String name) throws java.io.IOException {
      Get result = new Get(name);
      initialize(result);
      return result;
    }

    public class Get extends AdMobRequest<com.google.api.services.admob.v1.model.PublisherAccount> {

      private static final String REST_PATH = "v1/{+name}";

      private final java.util.regex.Pattern NAME_PATTERN =
          java.util.regex.Pattern.compile("^accounts/[^/]+$");

      /**
       * Gets information about the specified AdMob publisher account.
       *
       * Create a request for the method "accounts.get".
       *
       * This request holds the parameters needed by the the admob server.  After setting any optional
       * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
       * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param name Resource name of the publisher account to retrieve.
    Example: accounts/pub-9876543210987654
       * @since 1.13
       */
      protected Get(java.lang.String name) {
        super(AdMob.this, "GET", REST_PATH, null, com.google.api.services.admob.v1.model.PublisherAccount.class);
        this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^accounts/[^/]+$");
        }
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
      public Get set$Xgafv(java.lang.String $Xgafv) {
        return (Get) super.set$Xgafv($Xgafv);
      }

      @Override
      public Get setAccessToken(java.lang.String accessToken) {
        return (Get) super.setAccessToken(accessToken);
      }

      @Override
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setCallback(java.lang.String callback) {
        return (Get) super.setCallback(callback);
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
      public Get setUploadType(java.lang.String uploadType) {
        return (Get) super.setUploadType(uploadType);
      }

      @Override
      public Get setUploadProtocol(java.lang.String uploadProtocol) {
        return (Get) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Resource name of the publisher account to retrieve. Example: accounts/pub-9876543210987654
       */
      @com.google.api.client.util.Key
      private java.lang.String name;

      /** Resource name of the publisher account to retrieve. Example: accounts/pub-9876543210987654
       */
      public java.lang.String getName() {
        return name;
      }

      /**
       * Resource name of the publisher account to retrieve. Example: accounts/pub-9876543210987654
       */
      public Get setName(java.lang.String name) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^accounts/[^/]+$");
        }
        this.name = name;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }
    /**
     * Lists the AdMob publisher account accessible with the client credential. Currently, all
     * credentials have access to at most one AdMob account.
     *
     * Create a request for the method "accounts.list".
     *
     * This request holds the parameters needed by the admob server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public List list() throws java.io.IOException {
      List result = new List();
      initialize(result);
      return result;
    }

    public class List extends AdMobRequest<com.google.api.services.admob.v1.model.ListPublisherAccountsResponse> {

      private static final String REST_PATH = "v1/accounts";

      /**
       * Lists the AdMob publisher account accessible with the client credential. Currently, all
       * credentials have access to at most one AdMob account.
       *
       * Create a request for the method "accounts.list".
       *
       * This request holds the parameters needed by the the admob server.  After setting any optional
       * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
       * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected List() {
        super(AdMob.this, "GET", REST_PATH, null, com.google.api.services.admob.v1.model.ListPublisherAccountsResponse.class);
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

      /** Maximum number of accounts to return. */
      @com.google.api.client.util.Key
      private java.lang.Integer pageSize;

      /** Maximum number of accounts to return.
       */
      public java.lang.Integer getPageSize() {
        return pageSize;
      }

      /** Maximum number of accounts to return. */
      public List setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
        return this;
      }

      /**
       * The value returned by the last `ListPublisherAccountsResponse`; indicates that this is a
       * continuation of a prior `ListPublisherAccounts` call, and that the system should return the
       * next page of data.
       */
      @com.google.api.client.util.Key
      private java.lang.String pageToken;

      /** The value returned by the last `ListPublisherAccountsResponse`; indicates that this is a
     continuation of a prior `ListPublisherAccounts` call, and that the system should return the next
     page of data.
       */
      public java.lang.String getPageToken() {
        return pageToken;
      }

      /**
       * The value returned by the last `ListPublisherAccountsResponse`; indicates that this is a
       * continuation of a prior `ListPublisherAccounts` call, and that the system should return the
       * next page of data.
       */
      public List setPageToken(java.lang.String pageToken) {
        this.pageToken = pageToken;
        return this;
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }

    /**
     * An accessor for creating requests from the MediationReport collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code AdMob admob = new AdMob(...);}
     *   {@code AdMob.MediationReport.List request = admob.mediationReport().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public MediationReport mediationReport() {
      return new MediationReport();
    }

    /**
     * The "mediationReport" collection of methods.
     */
    public class MediationReport {

      /**
       * Generates an AdMob Mediation report based on the provided report specification.
       *
       * Create a request for the method "mediationReport.generate".
       *
       * This request holds the parameters needed by the admob server.  After setting any optional
       * parameters, call the {@link Generate#execute()} method to invoke the remote operation.
       *
       * @param parent Resource name of the account to generate the report for.
      Example: accounts/pub-9876543210987654
       * @param content the {@link com.google.api.services.admob.v1.model.GenerateMediationReportRequest}
       * @return the request
       */
      public Generate generate(java.lang.String parent, com.google.api.services.admob.v1.model.GenerateMediationReportRequest content) throws java.io.IOException {
        Generate result = new Generate(parent, content);
        initialize(result);
        return result;
      }

      public class Generate extends AdMobRequest<com.google.api.services.admob.v1.model.GenerateMediationReportResponse> {

        private static final String REST_PATH = "v1/{+parent}/mediationReport:generate";

        private final java.util.regex.Pattern PARENT_PATTERN =
            java.util.regex.Pattern.compile("^accounts/[^/]+$");

        /**
         * Generates an AdMob Mediation report based on the provided report specification.
         *
         * Create a request for the method "mediationReport.generate".
         *
         * This request holds the parameters needed by the the admob server.  After setting any optional
         * parameters, call the {@link Generate#execute()} method to invoke the remote operation. <p>
         * {@link
         * Generate#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
         * must be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param parent Resource name of the account to generate the report for.
      Example: accounts/pub-9876543210987654
         * @param content the {@link com.google.api.services.admob.v1.model.GenerateMediationReportRequest}
         * @since 1.13
         */
        protected Generate(java.lang.String parent, com.google.api.services.admob.v1.model.GenerateMediationReportRequest content) {
          super(AdMob.this, "POST", REST_PATH, content, com.google.api.services.admob.v1.model.GenerateMediationReportResponse.class);
          this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^accounts/[^/]+$");
          }
        }

        @Override
        public Generate set$Xgafv(java.lang.String $Xgafv) {
          return (Generate) super.set$Xgafv($Xgafv);
        }

        @Override
        public Generate setAccessToken(java.lang.String accessToken) {
          return (Generate) super.setAccessToken(accessToken);
        }

        @Override
        public Generate setAlt(java.lang.String alt) {
          return (Generate) super.setAlt(alt);
        }

        @Override
        public Generate setCallback(java.lang.String callback) {
          return (Generate) super.setCallback(callback);
        }

        @Override
        public Generate setFields(java.lang.String fields) {
          return (Generate) super.setFields(fields);
        }

        @Override
        public Generate setKey(java.lang.String key) {
          return (Generate) super.setKey(key);
        }

        @Override
        public Generate setOauthToken(java.lang.String oauthToken) {
          return (Generate) super.setOauthToken(oauthToken);
        }

        @Override
        public Generate setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Generate) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Generate setQuotaUser(java.lang.String quotaUser) {
          return (Generate) super.setQuotaUser(quotaUser);
        }

        @Override
        public Generate setUploadType(java.lang.String uploadType) {
          return (Generate) super.setUploadType(uploadType);
        }

        @Override
        public Generate setUploadProtocol(java.lang.String uploadProtocol) {
          return (Generate) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Resource name of the account to generate the report for. Example:
         * accounts/pub-9876543210987654
         */
        @com.google.api.client.util.Key
        private java.lang.String parent;

        /** Resource name of the account to generate the report for. Example: accounts/pub-9876543210987654
         */
        public java.lang.String getParent() {
          return parent;
        }

        /**
         * Resource name of the account to generate the report for. Example:
         * accounts/pub-9876543210987654
         */
        public Generate setParent(java.lang.String parent) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^accounts/[^/]+$");
          }
          this.parent = parent;
          return this;
        }

        @Override
        public Generate set(String parameterName, Object value) {
          return (Generate) super.set(parameterName, value);
        }
      }

    }
    /**
     * An accessor for creating requests from the NetworkReport collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code AdMob admob = new AdMob(...);}
     *   {@code AdMob.NetworkReport.List request = admob.networkReport().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public NetworkReport networkReport() {
      return new NetworkReport();
    }

    /**
     * The "networkReport" collection of methods.
     */
    public class NetworkReport {

      /**
       * Generates an AdMob Network report based on the provided report specification.
       *
       * Create a request for the method "networkReport.generate".
       *
       * This request holds the parameters needed by the admob server.  After setting any optional
       * parameters, call the {@link Generate#execute()} method to invoke the remote operation.
       *
       * @param parent Resource name of the account to generate the report for.
      Example: accounts/pub-9876543210987654
       * @param content the {@link com.google.api.services.admob.v1.model.GenerateNetworkReportRequest}
       * @return the request
       */
      public Generate generate(java.lang.String parent, com.google.api.services.admob.v1.model.GenerateNetworkReportRequest content) throws java.io.IOException {
        Generate result = new Generate(parent, content);
        initialize(result);
        return result;
      }

      public class Generate extends AdMobRequest<com.google.api.services.admob.v1.model.GenerateNetworkReportResponse> {

        private static final String REST_PATH = "v1/{+parent}/networkReport:generate";

        private final java.util.regex.Pattern PARENT_PATTERN =
            java.util.regex.Pattern.compile("^accounts/[^/]+$");

        /**
         * Generates an AdMob Network report based on the provided report specification.
         *
         * Create a request for the method "networkReport.generate".
         *
         * This request holds the parameters needed by the the admob server.  After setting any optional
         * parameters, call the {@link Generate#execute()} method to invoke the remote operation. <p>
         * {@link
         * Generate#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
         * must be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param parent Resource name of the account to generate the report for.
      Example: accounts/pub-9876543210987654
         * @param content the {@link com.google.api.services.admob.v1.model.GenerateNetworkReportRequest}
         * @since 1.13
         */
        protected Generate(java.lang.String parent, com.google.api.services.admob.v1.model.GenerateNetworkReportRequest content) {
          super(AdMob.this, "POST", REST_PATH, content, com.google.api.services.admob.v1.model.GenerateNetworkReportResponse.class);
          this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^accounts/[^/]+$");
          }
        }

        @Override
        public Generate set$Xgafv(java.lang.String $Xgafv) {
          return (Generate) super.set$Xgafv($Xgafv);
        }

        @Override
        public Generate setAccessToken(java.lang.String accessToken) {
          return (Generate) super.setAccessToken(accessToken);
        }

        @Override
        public Generate setAlt(java.lang.String alt) {
          return (Generate) super.setAlt(alt);
        }

        @Override
        public Generate setCallback(java.lang.String callback) {
          return (Generate) super.setCallback(callback);
        }

        @Override
        public Generate setFields(java.lang.String fields) {
          return (Generate) super.setFields(fields);
        }

        @Override
        public Generate setKey(java.lang.String key) {
          return (Generate) super.setKey(key);
        }

        @Override
        public Generate setOauthToken(java.lang.String oauthToken) {
          return (Generate) super.setOauthToken(oauthToken);
        }

        @Override
        public Generate setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Generate) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Generate setQuotaUser(java.lang.String quotaUser) {
          return (Generate) super.setQuotaUser(quotaUser);
        }

        @Override
        public Generate setUploadType(java.lang.String uploadType) {
          return (Generate) super.setUploadType(uploadType);
        }

        @Override
        public Generate setUploadProtocol(java.lang.String uploadProtocol) {
          return (Generate) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Resource name of the account to generate the report for. Example:
         * accounts/pub-9876543210987654
         */
        @com.google.api.client.util.Key
        private java.lang.String parent;

        /** Resource name of the account to generate the report for. Example: accounts/pub-9876543210987654
         */
        public java.lang.String getParent() {
          return parent;
        }

        /**
         * Resource name of the account to generate the report for. Example:
         * accounts/pub-9876543210987654
         */
        public Generate setParent(java.lang.String parent) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^accounts/[^/]+$");
          }
          this.parent = parent;
          return this;
        }

        @Override
        public Generate set(String parameterName, Object value) {
          return (Generate) super.set(parameterName, value);
        }
      }

    }
  }

  /**
   * Builder for {@link AdMob}.
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

    /** Builds a new instance of {@link AdMob}. */
    @Override
    public AdMob build() {
      return new AdMob(this);
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
     * Set the {@link AdMobRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setAdMobRequestInitializer(
        AdMobRequestInitializer admobRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(admobRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
