
// *********************************************************************************************
//
// Automatically Generated Load Test Program
// -----------------------------------------
//
// Source: PropertyAddressSearch.java
// Date  : 15 Jun 2021 19:23:04 ECT
// Author: Apica ZebraTester V5.5-Z / automatically generated
//
// Procedure Copyright by Apica
// All Rights Reserved
//
// http://www.apicasystem.com                                         http://www.zebratester.com
// *********************************************************************************************


import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.atomic.*;
import org.apache.commons.lang3.StringUtils;
import dfischer.utils.AbstractInputFileReader;
import dfischer.utils.Base64Decoder;
import dfischer.utils.Base64Encoder;
import dfischer.utils.ConvertToDoubleNumber;
import dfischer.utils.ContentTokenExtractor;
import dfischer.utils.ContentTokenExtractorItem;
import dfischer.utils.Cookie;
import dfischer.utils.CookieHandler;
import dfischer.utils.DigestAuthContext;
import dfischer.utils.DNSCache;
import dfischer.utils.DNSTranslationTable;
import dfischer.utils.DynamicProtobufContentParser;
import dfischer.utils.ExternalParamFile;
import dfischer.utils.FileCache;
import dfischer.utils.GenericPluginInterface;
import dfischer.utils.GetRealTimeUserInputFieldsInterface;
import dfischer.utils.HtmlContentParser;
import dfischer.utils.HtmlHeaderCookieExtractor;
import dfischer.utils.HttpLoadTest;
import dfischer.utils.HttpLoadTestIncrementUserThread;
import dfischer.utils.HttpLoadTestUserContext;
import dfischer.utils.HttpSocketPool;
import dfischer.utils.HttpTestURL;
import dfischer.utils.HttpTestURLDNSContext;
import dfischer.utils.HttpTestURLThreadHandler;
import dfischer.utils.InlineScriptExecutionException;
import dfischer.utils.InlineScriptExecutor;
import dfischer.utils.InnerLoopContext;
import dfischer.utils.JSONHtmlBasedExtractor;
import dfischer.utils.JSONPathBasedExtractor;
import dfischer.utils.JSONPathBasedExtractorItem;
import dfischer.utils.Lib;
import dfischer.utils.LoadtestInlineScriptContext;
import dfischer.utils.LoadtestInlineScriptVar;
import dfischer.utils.LoadtestPluginClassLoader;
import dfischer.utils.LoadtestPluginContext;
import dfischer.utils.NextProxyConfig;
import dfischer.utils.ParseArgs;
import dfischer.utils.ParseUrl;
import dfischer.utils.PerformanceData;
import dfischer.utils.PerformanceDataTickExtension;
import dfischer.utils.ProtobufFieldAndValueElement;
import dfischer.utils.ProtobufLib;
import dfischer.utils.RealTimeUserInputField;
import dfischer.utils.ScreenshotImage;
import dfischer.utils.SetThreadStepInterface;
import dfischer.utils.SSLInit;
import dfischer.utils.SSLSessionCacheStatistic;
import dfischer.utils.SSLSessionCacheStatisticInterface;
import dfischer.utils.SuspendResumeInterface;
import dfischer.utils.SymmetricEncrypt;
import dfischer.utils.SymmetricEncryptContext;
import dfischer.utils.TextLineTokenExtractor;
import dfischer.utils.TextLineTokenExtractorItem;
import dfischer.utils.ThreadStepInterface;
import dfischer.utils.UserInputField;
import dfischer.utils.UserTransactionContext;
import dfischer.utils.UserTransactionRuntimeHandler;
import dfischer.utils.VarInputFileReader;
import dfischer.utils.VarRandomInputFileReader;
import dfischer.utils.VaryingLoadInterface;
import dfischer.utils.VaryingTestDurationInterface;
import dfischer.utils.XmlContentParser;
import dfischer.utils.XmlDoctypeCommentParser;
import dfischer.utils.ZoneTime;
import dfischer.proxysniffer.ProxySnifferVarSourceInlineScript;
import dfischer.utils.WebSocketPluginInterface;
import dfischer.utils.BoundaryBasedExtractor;
import dfischer.utils.BoundaryBasedExtractorItem;
import dfischer.utils.RegExpBasedExtractor;
import dfischer.utils.RegExpBasedExtractorItem;
import dfischer.utils.XpathBasedExtractor;
import dfischer.utils.XpathBasedExtractorItem;
import dfischer.proxysniffer.WebSocketData;
import dfischer.utils.HttpTestWebsocketContext;
import dfischer.websocket.*;
import dfischer.utils.DataCollectionSequence;
import dfischer.proxysniffer.ProxyDataRecordActionUserDefinedDataPoint;
import replay.ReplaySnapShotsDump;
import dfischer.utils.BrowserCacheStatistic;
import dfischer.generator.ReplaceVarPattern;


/**
 * Automatically generated load test program.
 */
public class PropertyAddressSearch extends HttpLoadTest implements Runnable, ThreadStepInterface, SetThreadStepInterface, SSLSessionCacheStatisticInterface, VaryingLoadInterface, VaryingTestDurationInterface, SuspendResumeInterface, GetRealTimeUserInputFieldsInterface
{
	public static final String prxVersion = "V5.5-Z";
	public static final int    prxCharEncoding = 3;                         // 1 = OS Default, 2 = ISO-8859-1, 3 = UTF-8
	public static final String testDescription = "Test Property address";

	public static String USER_AGENT_1 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.77 Safari/537.36";

	private static final boolean CONTAINS_PARALLEL_EXECUTED_URLS = false;
	private static final int MAX_PARALLEL_THREADS_PER_USER = 6;                       // default value for max. parallel executed URLs per user
	private static int maxParallelThreadsPerUser = MAX_PARALLEL_THREADS_PER_USER;     // configured value for max. parallel executed URLs per user

	private static final boolean CONTAINS_EXTERNAL_RESOURCES = false;       // note: external resources are typically additional Java library files (*.jar files) invoked by self-developed plug-ins. Consider that Input Files and the Main Class of Plug-Ins are NOT external resources in this context because ZebraTester knows already their declarations.

	// --- WebSocket Object ---
	WebSocketData webSocketData = null;                                     // WebSocket Object that contains data of recorded WebSocket frames.
	WebSocketPluginInterface[] webSocketPluginsForURL = null;               // all assiciated web socket plugins for specific URL.

	// --- proxy configuration ---
	private static boolean proxyEnabled = false;                             // if false: do not use a proxy server
	private static boolean proxyCacheDisabled = true;
	private static String  proxyHttpHost = "";
	private static int     proxyHttpPort = -1;
	private static String  proxyHttpsHost = "";
	private static int     proxyHttpsPort = -1;
	private static String  noProxyFor = "";
	private static String  proxyAuthorization = null;
	private static NextProxyConfig commonNextProxyConfig = null;
	private NextProxyConfig userNextProxyConfig = null;
	
	private static int plannedStartupDelay = 200;                           // startup delay between concurrent users in milliseconds, see main argument "-sdelay"
	private static int plannedTestDuration = -1;                            // planned load test duration in seconds, 0 = unlimited, see main argument "-d"
	private static int maxPlannedLoops = 0;  								// maximum planned loops per user, 0 = unlimited, see main argument "-maxloops"
	private static int pacing = 0;  								        // pacing for loops per user, 0 = no pacing, see main argument "-pacing"
	private static int plannedRequestTimeout = 0;                           // planned request timeout in seconds, see main argument "-t"
	private static int plannedConnectTimeout = 0;                           // planned TCP/IP socket connect timeout in seconds (default = use plannedRequestTimeout), see main argument "-tconnect"
	
	private static String defaultTimeZone = "ECT";                          // use main argument -tz <timezone> to alter
	private static char defaultNumberGroupingSeparator = '\'';              // use main argument -dgs a|c to alter
	private static String sslProtocolVersion = "all";                     // applied ssl protocol version: "all" = v3/tls/tls11/tls12/tls13, use main argument -ssl to set a fixed protocol version
	private static boolean sslcmode = false;                                // support of deficient ssl servers, use main argument -sslcmode to enable
	private static boolean sslECC = true;                                   // elliptic curve cryptography (ECC) is enabled by default, use main argument -noECC to disable
	private static boolean sslSNI = true;                                   // server name indication (SNI) is enabled by default, use main argument -nosni to disable
	private static boolean sslSNICirical = false;                           // the SNI TLS extension is by default set as non-critical, use main argument -snicritical to set as critical
	private static boolean useTlsSessionTickets = false;                    // Session Tickets can only be used with TLS, use main argument -tlssessiontickets to set to use
	private static final long loopErrorDelay = 20;                          // error delay (in milliseconds) applied if a loop of a virtual user has failed
	private static final String THREAD_NAME = "T000000";                    // internal
	private static Integer dumpLock = new Integer(0);                       // internal
	private static Integer inputFileLock = new Integer(0);                  // internal
	private volatile int threadStep = ThreadStepInterface.THREAD_NO_STEP;   // internal
	private boolean urlCallPassed = false;                                  // internal
	private String localIpAddress = null;                                   // internal
	private static long downlinkBandwidth = 0;                              // max. downlink bandwidth per user. 0 = unlimited. use main argument -downlink <kbps> to alter
	private static long uplinkBandwidth = 0;                                // max. uplink bandwidth per user. 0 = unlimited. use main argument -uplink <kbps> to alter
	private static boolean dnsPerLoop = false;								// true if main argument "-dnsperloop" is set = perform new DNS resolves for each executed loop. normally false
	private HttpTestURLDNSContext userDNSContext = null;                    // user specific DNS context - normally null when no special DNS servers are used
	
	private static volatile boolean debugFailedLoops = false;               // true if main argument "-dfl" is set
	private static volatile boolean debugLoops = false;                     // true if main argument "-dl" is set
	private static volatile boolean debugHttp = false;                      // true if main argument "-dh" is set
	private static volatile boolean debugContent = false;                   // true if main argument "-dc" is set
	private static volatile boolean debugCookies = false;                   // true if main argument "-dC" is set
	private static volatile boolean debugKeepAlive = false;                 // true if main argument "-dK" is set
	private static volatile boolean debugSsl = false;                       // true if main argument "-dssl" is set
	
	private static String resultFile = null;                                // name of binary test result file or null
	private static String browserLanguage = null;                           // name of browser language, argument -browserlang <text>
	private static boolean replayMode = false;                              // indicated the replay mode of the load test, use main argument -replay to enable it
	
	private final static String httpProtocolVersion = "1.1";      // applied HTTP protocol version V1.1
	
	private static ExternalParamFile externalParamFile = null;                              // used only for very large parameter values (commonly unused)
	private static final String EXTERNAL_PARAM_FILE = "PropertyAddressSearchExtParams.dat"; // input file name for very large parameter values
	private static FileCache requestFileCache = new FileCache();  // file cache for large XML, SOAP and ASCII requests
	
	private int requestTimeout = -1;                              // thread input data from constructor, timeout per url request in seconds
	private boolean checkLoopCount = false;                       // thread input data from constructor, number of loops per thread (optional)
	private int threadNumber = -1;                                // thread input data from constructor, internal thread number
	private int threadLoopCounter = 0;                            // internal loop counter per thread
	private volatile int userResumeStartWaitDelay = 0;            // internal, user specific delay when the load test execution is resumed
	private volatile boolean decrementEndOfLoopFlag = false;	  // internal flag to decrement the simulated user at runtime
	private volatile boolean incrementUserFlag = false;           // internal flag to increment the simulated user at runtime
	private volatile long incrementUserStartTime = -1;            // internal start time when increment the simulated user at runtime
	private static AtomicInteger totalLoopCounter = new AtomicInteger(0);    // internal overall loop counter

	private LoadtestPluginContext userPluginContext = null;       // plug-in context per user
	private LoadtestInlineScriptContext inlineScriptContext = null;          // re-used, scratch, the returned context of an inline script that runs at item or URL exec scope

	private Object sslSessionCache = null;                        // internal ssl session cache per thread
	private SSLSessionCacheStatistic sslStatistic = null;         // internal ssl session cache statistic per thread
	private static int sslSessionCacheTimeout = 300;              // timeout of ssl session cache in seconds, 0 = session cache disabled
	private static int sslHandshakeRandomGeneratorType = -1;      // invalid initial value, use the default secure random generator for SSL handshakes
	private HttpSocketPool socketPool = null;                     // re-used, scratch, internal socket pool per thread and loop
	private CookieHandler cookieHandler = null;                   // re-used, scratch, internal cookie handler per thread and loop

	private HttpTestURL testURL = null;                           // re-used, scratch, http request and response
	private HttpTestURLThreadHandler pageThreadHandler = null;    // re-used, scratch, support for parallel processing of http request within a page
	private int httpStatus = -1;                                  // re-used, scratch, http response status code from webserver
	private HtmlContentParser htmlContentParser = null;           // re-used, scratch, used to extract vars from http response
	private XmlContentParser xmlContentParser = null;             // re-used, scratch, used to extract vars from http response
	private JSONHtmlBasedExtractor jsonHtmlBasedExtractor = null; // re-used, scratch, used to extract vars from http response
	private DynamicProtobufContentParser protobufContentParser = null;  // re-used, scratch, used to extract vars from http response
	private TextLineTokenExtractor textLineTokenExtractor = null; // re-used, scratch, used to extract vars from http response
	private ContentTokenExtractor contentTokenExtractor = null;   // re-used, scratch, used to extract vars from http response
	private BoundaryBasedExtractor boundaryBasedExtractor = null;   // re-used, scratch, used to extract vars from http response
	private RegExpBasedExtractor regExpBasedExtractor = null;   // re-used, scratch, used to extract vars from http response
	private XpathBasedExtractor xpathBasedExtractor = null;   // re-used, scratch, used to extract vars from http response
	private JSONPathBasedExtractor jsonPathBasedExtractor = null;   // re-used, scratch, used to extract vars from http response
	
	private volatile UserTransactionRuntimeHandler transactionHandler = new UserTransactionRuntimeHandler();		// re-used, support to manage user-defined transactions
	private Map<String,String> transactionContextMap = new HashMap<>();		// used to correctly measure the user-defined transactions

	private Map<String,String> loopVarMap = new HashMap<>();		// used for loop variables
	/**
	 * constructor: called from load test plug-ins (scope = global).
	 */
	public PropertyAddressSearch()
	{
		super();
	}


	/**
	 * constructor: called when a user is created (per user).
	 */
	public PropertyAddressSearch(int maxLoops, int requestTimeout, int threadNumber)
	{
		super();
		this.requestTimeout = requestTimeout;
		this.remainingLoops = maxLoops;
		this.checkLoopCount = (maxLoops > 0);
		this.threadNumber = threadNumber;
		this.sslSessionCache = SSLInit.getNewSslSessionCache(sslSessionCacheTimeout);
		this.sslStatistic = new SSLSessionCacheStatistic();
		if (isMultihomed() && (!ipPerLoop()))
			this.localIpAddress = getNextMultihomedIpAddress();
		if (dnsCache != null)
			userDNSContext = new HttpTestURLDNSContext(dnsCache, threadNumber);
		
		applyNextProxySettingsFromFileIfExists();
		
		if (commonNextProxyConfig != null)
			// set proxy configuration data per user 
			userNextProxyConfig = new NextProxyConfig(commonNextProxyConfig);
		
		// initialize context for plug-ins which are executed per user
		userPluginContext = new LoadtestPluginContext(prxVersion, prxCharEncoding, this, threadNumber);
		if(replayMode)
		{
			replaySnapShotsDump = new ReplaySnapShotsDump();
		}
	}


	/**
	 * internal method: called when a user starts a loop.
	 * contains the recorded session which is called by users x loops.
	 * 
	 * @param totalLoopCounter total number of loops (0..n-1) counted overall threads. This value is unique per loop.
	 * 
	 * @return  true:  loop successful completed.
	 *          false: loop failed.
	 */
	private boolean execute(int totalLoopCounter) throws Exception
	{
		markStartOfLoop();
		threadStep = 0;                 // internal - start loop at thread step 0
		
		// enable DNS resolves per loop?
		if (dnsPerLoop)
			userDNSContext = new HttpTestURLDNSContext(dnsCache.clone(false), threadNumber);
		
		// debug http headers?
		Object httpLogVectorObject = null;
		if (debugHttp)
			httpLogVectorObject = this;
		
		// create socket pool per loop
		sslSessionCache = SSLInit.getNewSslSessionCache(sslSessionCacheTimeout);		// reset the SSL session cache to get new SSL session IDs for this loop
		socketPool = new HttpSocketPool(this, sslProtocolVersion, sslSessionCache, sslStatistic, sslcmode);
		if (plannedConnectTimeout > 0)
			socketPool.setConnectTimeout(plannedConnectTimeout);
		if (sslHandshakeRandomGeneratorType != -1)
			socketPool.setSslHandshakeRandomGeneratorType(sslHandshakeRandomGeneratorType);
		socketPool.setSupportEllipticCurves(sslECC);
		socketPool.setHintUseSNI(sslSNI);
		socketPool.setSniCritical(sslSNICirical);
		socketPool.setUseTlsSessionTickets(useTlsSessionTickets);
		if (debugKeepAlive)
		{
			socketPool.setlogVectorObject(this);
			if (debugSsl)
				socketPool.enableSslLog();
		}
		
		if (downlinkBandwidth > 0)
			socketPool.setDownlinkBandwidth(downlinkBandwidth);
		if (uplinkBandwidth > 0)
			socketPool.setUplinkBandwidth(uplinkBandwidth);
		
		if (isMultihomed())
		{
			if (ipPerLoop())
				localIpAddress = getNextMultihomedIpAddress();
			socketPool.setClientIpAddress(localIpAddress);
			log();
			log("multihomed client ip address = " + localIpAddress);
		}
		
		if(isNonModularMode())
		{
			// setup cookie handler per loop
			cookieHandler = new CookieHandler();
			if (debugCookies)
				cookieHandler.setLogVectorInterface(this);
		}
		
		// customised vars from web admin var handler: scope = per loop
		htmlContentParser = null;
		xmlContentParser = null;
		jsonHtmlBasedExtractor = null;
		protobufContentParser = null;
		
		// initialize context for plug-ins which are executed per loop
		LoadtestPluginContext loopPluginContext = new LoadtestPluginContext(prxVersion, prxCharEncoding, this, threadNumber, socketPool, cookieHandler);
		



		// --- VIRTUAL PAGE #0 ---
		if (!executePage_0(totalLoopCounter, loopPluginContext, new InnerLoopContext(), 0,0, httpLogVectorObject))
			return false;



		// --- PAGE BREAK: Test [0] ---
		log();
		log();
		log("# Page #1: start");
		log("# --------------");
		threadStep = setPageBreak(performanceData, threadStep, "Page #1: start", 3000, 35, -1);		// hint: param #4 is the user's think time in milliseconds, param #5 is randomness of the user's think time in percent (+/- 0..100%), param #6 is the maximum acceptable response time in milliseconds (-1 = not configured)
		pageThreadHandler = new HttpTestURLThreadHandler(threadStep - 1, maxParallelThreadsPerUser, performanceData, this);   // support for parallel processing of http(s) requests within a page. hint: param #2 is the number of parallel threads per user
		log();

		if (!executePage_1(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 1 failed
			synchResponsesParallelRequestsPage_1(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			return false;
		}
		if (!executePage_1_1(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 1 failed
			synchResponsesParallelRequestsPage_1(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			return false;
		}
		if (!synchResponsesParallelRequestsPage_1(totalLoopCounter, loopPluginContext, null, httpLogVectorObject))
		{
			return false;		// execution of page 1 failed
		}
		
		// page 1 successfully executed
		pageThreadHandler.addPageResponseTimeToResult(this);



		// --- PAGE BREAK: Test [37] ---
		log();
		log();
		log("# Page #2: address");
		log("# ----------------");
		threadStep = setPageBreak(performanceData, threadStep, "Page #2: address", 3000, 35, -1);		// hint: param #4 is the user's think time in milliseconds, param #5 is randomness of the user's think time in percent (+/- 0..100%), param #6 is the maximum acceptable response time in milliseconds (-1 = not configured)
		pageThreadHandler = new HttpTestURLThreadHandler(threadStep - 1, maxParallelThreadsPerUser, performanceData, this);   // support for parallel processing of http(s) requests within a page. hint: param #2 is the number of parallel threads per user
		log();

		if (!executePage_2(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 2 failed
			synchResponsesParallelRequestsPage_2(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			return false;
		}
		if (!synchResponsesParallelRequestsPage_2(totalLoopCounter, loopPluginContext, null, httpLogVectorObject))
		{
			return false;		// execution of page 2 failed
		}
		
		// page 2 successfully executed
		pageThreadHandler.addPageResponseTimeToResult(this);
		
		
		// loop successful done
		// --------------------
		
		markEndOfPage(performanceData);
		
		endOfExecuteLoop(true, null, -1, loopPluginContext);
		log();
		return true;
	}		// end of execute()
		
		
		
	/**
	 * internal method: called when a user has completed a loop.
	 */
	private void endOfExecuteLoop(boolean loopPassed, HttpTestURL testURL, int threadStep, LoadtestPluginContext loopPluginContext) throws Exception
	{
		// log URL if last call has failed
		if ((!loopPassed) && (testURL != null))
			log(testURL);
		
		// create browser cache per loop if simulate user per loop is enabled in the browser cache settings
		createBrowserCachePerLoop();
		
		// update plugin context
		loopPluginContext.setLoopPassed(loopPassed);
		if ((testURL != null) && (loopPluginContext.getHttpTestURL() == null))
			loopPluginContext.setHttpTestURL(testURL);
		if ((threadStep != -1) && (loopPluginContext.getThreadStep() == -1))
			loopPluginContext.setThreadStep(threadStep);
	}


	/**
	 * Recorded http requests of page #0.
	 *
	 * @return  true:  method successful completed.
	 *          false: method/loop failed.
	 */
	boolean executePage_0(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext,int innerLoopCounter, int totalInnerLoopCount, Object httpLogVectorObject) throws Exception
	{

		// all http requests of page #0 successful done
		return true;
	}


	/**
	 * Recorded http requests of page #1.
	 *
	 * @return  true:  method successful completed.
	 *          false: method/loop failed.
	 */
	boolean executePage_1(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext,int innerLoopCounter, int totalInnerLoopCount, Object httpLogVectorObject) throws Exception
	{
		// # Page #1: start
		// # --------------



		// --- HTTP REQUEST: Test [1] <- WEB ADMIN Index 1 ---
		log();
		log("# title: Denver Property Taxation and Assessment System | Search");
		String requestProt0001 = "https";
		String requestHost0001 = "qa.denvergov.org";
		int    requestPort0001 = 443;
		String requestFile0001 = "/property";
		String requestHeader0001 = "GET " + requestFile0001 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"Upgrade-Insecure-Requests: 1\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\r\n" + 
				"Sec-Fetch-Site: none\r\n" + 
				"Sec-Fetch-Mode: navigate\r\n" + 
				"Sec-Fetch-User: ?1\r\n" + 
				"Sec-Fetch-Dest: document\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0001, requestHost0001, requestPort0001, requestHeader0001, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0001 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/HTML", header text fragment = [verification disabled], recorded content size = 40889
		// content test algorithm: search text
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/HTML", null, "Failure to receive a tax statement or an electronic statement does not excuse");		// Test [1] <- Index 1
		if(replayMode)
		{
			long proxyDataRecordId =1623701725375L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure - dump wrong content to thread log and abort current loop
			terminateFailedUser(testURL);		// set the user to be terminated at end of loop ? - only performed if the URL call has marked before to support that !
			endOfExecuteLoop(false, testURL, threadStep, loopPluginContext);
			return false;
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [2] <- WEB ADMIN Index 2 ---
		String requestProt0002 = "https";
		String requestHost0002 = "qa.denvergov.org";
		int    requestPort0002 = 443;
		String requestFile0002 = "/static/CCD.Bootstrap/3.2.10/css/bootstrap.min.css";
		String requestHeader0002 = "GET " + requestFile0002 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0002, requestHost0002, requestPort0002, requestHeader0002, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0002 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 118091
		// content test algorithm: check size +/- 5%, defined content size = 118091
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, 118091, 5);		// Test [2] <- Index 2
		if(replayMode)
		{
			long proxyDataRecordId =1623701725442L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [3] <- WEB ADMIN Index 4 ---
		String requestProt0003 = "https";
		String requestHost0003 = "qa.denvergov.org";
		int    requestPort0003 = 443;
		String requestFile0003 = "/static/CCD.FontAwesome/4.2.1/css/fontawesome.min.css";
		String requestHeader0003 = "GET " + requestFile0003 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0003, requestHost0003, requestPort0003, requestHeader0003, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0003 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 21984
		// content test algorithm: check size +/- 5%, defined content size = 21984
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, 21984, 5);		// Test [3] <- Index 3
		if(replayMode)
		{
			long proxyDataRecordId =1623701725481L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [4] <- WEB ADMIN Index 5 ---
		String requestProt0004 = "https";
		String requestHost0004 = "qa.denvergov.org";
		int    requestPort0004 = 443;
		String requestFile0004 = "/property/Content/Pager.css";
		String requestHeader0004 = "GET " + requestFile0004 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0004, requestHost0004, requestPort0004, requestHeader0004, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0004 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 521
		// content test algorithm: check size +/- 5%, defined content size = 521
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, 521, 5);		// Test [4] <- Index 4
		if(replayMode)
		{
			long proxyDataRecordId =1623701725499L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [5] <- WEB ADMIN Index 6 ---
		String requestProt0005 = "https";
		String requestHost0005 = "qa.denvergov.org";
		int    requestPort0005 = 443;
		String requestFile0005 = "/static/CCD.PublicAppSkin/1.1.11/css/publicappskin.min.css";
		String requestHeader0005 = "GET " + requestFile0005 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0005, requestHost0005, requestPort0005, requestHeader0005, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0005 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 537
		// content test algorithm: check size +/- 5%, defined content size = 537
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, 537, 5);		// Test [5] <- Index 5
		if(replayMode)
		{
			long proxyDataRecordId =1623701725501L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [6] <- WEB ADMIN Index 7 ---
		String requestProt0006 = "https";
		String requestHost0006 = "qa.denvergov.org";
		int    requestPort0006 = 443;
		String requestFile0006 = "/property/Content/mats_styles.css";
		String requestHeader0006 = "GET " + requestFile0006 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0006, requestHost0006, requestPort0006, requestHeader0006, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0006 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 11518
		// content test algorithm: check size +/- 5%, defined content size = 11518
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, 11518, 5);		// Test [6] <- Index 6
		if(replayMode)
		{
			long proxyDataRecordId =1623701725504L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [7] <- WEB ADMIN Index 8 ---
		String requestProt0007 = "https";
		String requestHost0007 = "qa.denvergov.org";
		int    requestPort0007 = 443;
		String requestFile0007 = "/property/Content/responsive.css";
		String requestHeader0007 = "GET " + requestFile0007 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0007, requestHost0007, requestPort0007, requestHeader0007, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0007 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 3541
		// content test algorithm: check size +/- 5%, defined content size = 3541
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, 3541, 5);		// Test [7] <- Index 7
		if(replayMode)
		{
			long proxyDataRecordId =1623701725506L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [8] <- WEB ADMIN Index 9 ---
		String requestProt0008 = "https";
		String requestHost0008 = "qa.denvergov.org";
		int    requestPort0008 = 443;
		String requestFile0008 = "/property/Content/themes/redmond/jquery-ui-1.8.16.custom.css";
		String requestHeader0008 = "GET " + requestFile0008 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0008, requestHost0008, requestPort0008, requestHeader0008, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0008 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 34031
		// content test algorithm: check size +/- 5%, defined content size = 34031
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, 34031, 5);		// Test [8] <- Index 8
		if(replayMode)
		{
			long proxyDataRecordId =1623701725509L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [9] <- WEB ADMIN Index 11 ---
		String requestProt0009 = "https";
		String requestHost0009 = "qa.denvergov.org";
		int    requestPort0009 = 443;
		String requestFile0009 = "/property/Scripts/jquery-1.9.1.min.js";
		String requestHeader0009 = "GET " + requestFile0009 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0009, requestHost0009, requestPort0009, requestHeader0009, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0009 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 111672
		// content test algorithm: check size +/- 5%, defined content size = 111672
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 111672, 5);		// Test [9] <- Index 9
		if(replayMode)
		{
			long proxyDataRecordId =1623701725526L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [10] <- WEB ADMIN Index 12 ---
		String requestProt0010 = "https";
		String requestHost0010 = "qa.denvergov.org";
		int    requestPort0010 = 443;
		String requestFile0010 = "/property/Scripts/jquery.MultiFile.pack.js";
		String requestHeader0010 = "GET " + requestFile0010 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0010, requestHost0010, requestPort0010, requestHeader0010, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0010 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 4752
		// content test algorithm: check size +/- 5%, defined content size = 4752
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 4752, 5);		// Test [10] <- Index 10
		if(replayMode)
		{
			long proxyDataRecordId =1623701725544L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [11] <- WEB ADMIN Index 13 ---
		String requestProt0011 = "https";
		String requestHost0011 = "qa.denvergov.org";
		int    requestPort0011 = 443;
		String requestFile0011 = "/property/Scripts/jquery-ui-1.9.2.js";
		String requestHeader0011 = "GET " + requestFile0011 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0011, requestHost0011, requestPort0011, requestHeader0011, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0011 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 237741
		// content test algorithm: check size +/- 5%, defined content size = 237741
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 237741, 5);		// Test [11] <- Index 11
		if(replayMode)
		{
			long proxyDataRecordId =1623701725557L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [12] <- WEB ADMIN Index 14 ---
		String requestProt0012 = "https";
		String requestHost0012 = "qa.denvergov.org";
		int    requestPort0012 = 443;
		String requestFile0012 = "/property/Scripts/jquery.watermark.min.js";
		String requestHeader0012 = "GET " + requestFile0012 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0012, requestHost0012, requestPort0012, requestHeader0012, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0012 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 4629
		// content test algorithm: check size +/- 5%, defined content size = 4629
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 4629, 5);		// Test [12] <- Index 12
		if(replayMode)
		{
			long proxyDataRecordId =1623701725565L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [13] <- WEB ADMIN Index 15 ---
		String requestProt0013 = "https";
		String requestHost0013 = "qa.denvergov.org";
		int    requestPort0013 = 443;
		String requestFile0013 = "/property/Scripts/jquery.history.js";
		String requestHeader0013 = "GET " + requestFile0013 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0013, requestHost0013, requestPort0013, requestHeader0013, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0013 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 24932
		// content test algorithm: check size +/- 5%, defined content size = 24932
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 24932, 5);		// Test [13] <- Index 13
		if(replayMode)
		{
			long proxyDataRecordId =1623701725567L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [14] <- WEB ADMIN Index 16 ---
		String requestProt0014 = "https";
		String requestHost0014 = "qa.denvergov.org";
		int    requestPort0014 = 443;
		String requestFile0014 = "/property/Scripts/jquery.tipTip.minified.js";
		String requestHeader0014 = "GET " + requestFile0014 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0014, requestHost0014, requestPort0014, requestHeader0014, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0014 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 5271
		// content test algorithm: check size +/- 5%, defined content size = 5271
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 5271, 5);		// Test [14] <- Index 14
		if(replayMode)
		{
			long proxyDataRecordId =1623701725568L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [15] <- WEB ADMIN Index 17 ---
		String requestProt0015 = "https";
		String requestHost0015 = "qa.denvergov.org";
		int    requestPort0015 = 443;
		String requestFile0015 = "/property/Scripts/knockout-2.1.0.debug.js";
		String requestHeader0015 = "GET " + requestFile0015 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0015, requestHost0015, requestPort0015, requestHeader0015, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0015 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 174188
		// content test algorithm: check size +/- 5%, defined content size = 174188
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 174188, 5);		// Test [15] <- Index 15
		if(replayMode)
		{
			long proxyDataRecordId =1623701725578L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [16] <- WEB ADMIN Index 18 ---
		String requestProt0016 = "https";
		String requestHost0016 = "qa.denvergov.org";
		int    requestPort0016 = 443;
		String requestFile0016 = "/property/Scripts/jquery.tablesorter.js";
		String requestHeader0016 = "GET " + requestFile0016 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0016, requestHost0016, requestPort0016, requestHeader0016, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0016 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 49835
		// content test algorithm: check size +/- 5%, defined content size = 49835
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 49835, 5);		// Test [16] <- Index 16
		if(replayMode)
		{
			long proxyDataRecordId =1623701725579L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [17] <- WEB ADMIN Index 19 ---
		String requestProt0017 = "https";
		String requestHost0017 = "qa.denvergov.org";
		int    requestPort0017 = 443;
		String requestFile0017 = "/property/Scripts/app/ko.protected.js";
		String requestHeader0017 = "GET " + requestFile0017 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0017, requestHost0017, requestPort0017, requestHeader0017, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0017 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 5152
		// content test algorithm: check size +/- 5%, defined content size = 5152
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 5152, 5);		// Test [17] <- Index 17
		if(replayMode)
		{
			long proxyDataRecordId =1623701725621L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [18] <- WEB ADMIN Index 20 ---
		String requestProt0018 = "https";
		String requestHost0018 = "qa.denvergov.org";
		int    requestPort0018 = 443;
		String requestFile0018 = "/property/Scripts/app/ko.dialog.js";
		String requestHeader0018 = "GET " + requestFile0018 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0018, requestHost0018, requestPort0018, requestHeader0018, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0018 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 1044
		// content test algorithm: check size +/- 5%, defined content size = 1044
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 1044, 5);		// Test [18] <- Index 18
		if(replayMode)
		{
			long proxyDataRecordId =1623701725631L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [19] <- WEB ADMIN Index 22 ---
		String requestProt0019 = "https";
		String requestHost0019 = "qa.denvergov.org";
		int    requestPort0019 = 443;
		String requestFile0019 = "/property/Scripts/jquery.maskedinput-1.3.1.min.js";
		String requestHeader0019 = "GET " + requestFile0019 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0019, requestHost0019, requestPort0019, requestHeader0019, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0019 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 3574
		// content test algorithm: check size +/- 5%, defined content size = 3574
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 3574, 5);		// Test [19] <- Index 19
		if(replayMode)
		{
			long proxyDataRecordId =1623701725690L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [20] <- WEB ADMIN Index 23 ---
		String requestProt0020 = "https";
		String requestHost0020 = "qa.denvergov.org";
		int    requestPort0020 = 443;
		String requestFile0020 = "/property/Scripts/jquery.maskMoney.js";
		String requestHeader0020 = "GET " + requestFile0020 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0020, requestHost0020, requestPort0020, requestHeader0020, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0020 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 11706
		// content test algorithm: check size +/- 5%, defined content size = 11706
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 11706, 5);		// Test [20] <- Index 20
		if(replayMode)
		{
			long proxyDataRecordId =1623701725691L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated




		// all http requests of page #1 successful done
		return true;
	}


	/**
	 * Recorded http requests of page #1_1.
	 *
	 * @return  true:  method successful completed.
	 *          false: method/loop failed.
	 */
	boolean executePage_1_1(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext,int innerLoopCounter, int totalInnerLoopCount, Object httpLogVectorObject) throws Exception
	{
		// ... continuing page #1 (fragment 2 of 2)
		// ----------------------------------------



		// --- HTTP REQUEST: Test [21] <- WEB ADMIN Index 24 ---
		String requestProt0021 = "https";
		String requestHost0021 = "qa.denvergov.org";
		int    requestPort0021 = 443;
		String requestFile0021 = "/property/Scripts/moment.js";
		String requestHeader0021 = "GET " + requestFile0021 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0021, requestHost0021, requestPort0021, requestHeader0021, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0021 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 76001
		// content test algorithm: check size +/- 5%, defined content size = 76001
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 76001, 5);		// Test [21] <- Index 21
		if(replayMode)
		{
			long proxyDataRecordId =1623701725693L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [22] <- WEB ADMIN Index 26 ---
		String requestProt0022 = "https";
		String requestHost0022 = "qa.denvergov.org";
		int    requestPort0022 = 443;
		String requestFile0022 = "/property/Scripts/knockout.validation.js";
		String requestHeader0022 = "GET " + requestFile0022 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0022, requestHost0022, requestPort0022, requestHeader0022, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0022 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 11729
		// content test algorithm: check size +/- 5%, defined content size = 11729
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 11729, 5);		// Test [22] <- Index 22
		if(replayMode)
		{
			long proxyDataRecordId =1623701725717L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [23] <- WEB ADMIN Index 27 ---
		String requestProt0023 = "https";
		String requestHost0023 = "qa.denvergov.org";
		int    requestPort0023 = 443;
		String requestFile0023 = "/property/Scripts/mats.js";
		String requestHeader0023 = "GET " + requestFile0023 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0023, requestHost0023, requestPort0023, requestHeader0023, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0023 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 41477
		// content test algorithm: check size +/- 5%, defined content size = 41477
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 41477, 5);		// Test [23] <- Index 23
		if(replayMode)
		{
			long proxyDataRecordId =1623701725719L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [24] <- WEB ADMIN Index 28 ---
		String requestProt0024 = "https";
		String requestHost0024 = "qa.denvergov.org";
		int    requestPort0024 = 443;
		String requestFile0024 = "/property/Scripts/Analytics/DenverApps.Analytics.js";
		String requestHeader0024 = "GET " + requestFile0024 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0024, requestHost0024, requestPort0024, requestHeader0024, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0024 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 2811
		// content test algorithm: check size +/- 5%, defined content size = 2811
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 2811, 5);		// Test [24] <- Index 24
		if(replayMode)
		{
			long proxyDataRecordId =1623701725722L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [25] <- WEB ADMIN Index 29 ---
		String requestProt0025 = "https";
		String requestHost0025 = "qa.denvergov.org";
		int    requestPort0025 = 443;
		String requestFile0025 = "/property/Scripts/jquery.pager.js";
		String requestHeader0025 = "GET " + requestFile0025 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0025, requestHost0025, requestPort0025, requestHeader0025, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0025 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 4992
		// content test algorithm: check size +/- 5%, defined content size = 4992
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 4992, 5);		// Test [25] <- Index 25
		if(replayMode)
		{
			long proxyDataRecordId =1623701725725L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [26] <- WEB ADMIN Index 30 ---
		String requestProt0026 = "https";
		String requestHost0026 = "qa.denvergov.org";
		int    requestPort0026 = 443;
		String requestFile0026 = "/property/Scripts/jquery.blockUI.js";
		String requestHeader0026 = "GET " + requestFile0026 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0026, requestHost0026, requestPort0026, requestHeader0026, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0026 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 16611
		// content test algorithm: check size +/- 5%, defined content size = 16611
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 16611, 5);		// Test [26] <- Index 26
		if(replayMode)
		{
			long proxyDataRecordId =1623701725728L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [27] <- WEB ADMIN Index 31 ---
		String requestProt0027 = "https";
		String requestHost0027 = "qa.denvergov.org";
		int    requestPort0027 = 443;
		String requestFile0027 = "/property/Scripts/jquery.tmpl.min.js";
		String requestHeader0027 = "GET " + requestFile0027 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0027, requestHost0027, requestPort0027, requestHeader0027, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0027 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 6007
		// content test algorithm: check size +/- 5%, defined content size = 6007
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 6007, 5);		// Test [27] <- Index 27
		if(replayMode)
		{
			long proxyDataRecordId =1623701725734L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [28] <- WEB ADMIN Index 36 ---
		String requestProt0028 = "https";
		String requestHost0028 = "qa.denvergov.org";
		int    requestPort0028 = 443;
		String requestFile0028 = "/property/Content/print.css";
		String requestHeader0028 = "GET " + requestFile0028 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0028, requestHost0028, requestPort0028, requestHeader0028, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0028 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 2120
		// content test algorithm: check size +/- 5%, defined content size = 2120
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, 2120, 5);		// Test [28] <- Index 28
		if(replayMode)
		{
			long proxyDataRecordId =1623701725824L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [29] <- WEB ADMIN Index 38 ---
		String requestProt0029 = "https";
		String requestHost0029 = "qa.denvergov.org";
		int    requestPort0029 = 443;
		String requestFile0029 = "/maps/api/js/v2" +
				"?_=1623701725696";
		String requestHeader0029 = "GET " + requestFile0029 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"Accept: text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0029, requestHost0029, requestPort0029, requestHeader0029, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0029 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/X-JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 176433
		// content test algorithm: check size +/- 5%, defined content size = 176433
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/X-JAVASCRIPT", null, 176433, 5);		// Test [29] <- Index 29
		if(replayMode)
		{
			long proxyDataRecordId =1623701725947L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [30] <- WEB ADMIN Index 39 ---
		String requestProt0030 = "https";
		String requestHost0030 = "qa.denvergov.org";
		int    requestPort0030 = 443;
		String requestFile0030 = "/maps/content/js/JQueryPlugins.js";
		String requestHeader0030 = "GET " + requestFile0030 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0030, requestHost0030, requestPort0030, requestHeader0030, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0030 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 41146
		// content test algorithm: check size +/- 5%, defined content size = 41146
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 41146, 5);		// Test [30] <- Index 30
		if(replayMode)
		{
			long proxyDataRecordId =1623701726019L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [31] <- WEB ADMIN Index 40 ---
		String requestProt0031 = "https";
		String requestHost0031 = "qa.denvergov.org";
		int    requestPort0031 = 443;
		String requestFile0031 = "/maps/Content/OpenLayers/OpenLayers.js";
		String requestHeader0031 = "GET " + requestFile0031 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0031, requestHost0031, requestPort0031, requestHeader0031, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0031 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 331809
		// content test algorithm: check size +/- 5%, defined content size = 331809
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, 331809, 5);		// Test [31] <- Index 31
		if(replayMode)
		{
			long proxyDataRecordId =1623701726027L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [32] <- WEB ADMIN Index 44 ---
		String requestProt0032 = "https";
		String requestHost0032 = "qa.denvergov.org";
		int    requestPort0032 = 443;
		String requestFile0032 = "/maps/content/DenverMaps.css";
		String requestHeader0032 = "GET " + requestFile0032 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0032, requestHost0032, requestPort0032, requestHeader0032, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0032 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 30091
		// content test algorithm: check size +/- 5%, defined content size = 30091
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, 30091, 5);		// Test [32] <- Index 32
		if(replayMode)
		{
			long proxyDataRecordId =1623701726055L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [33] <- WEB ADMIN Index 45 ---
		String requestProt0033 = "https";
		String requestHost0033 = "qa.denvergov.org";
		int    requestPort0033 = 443;
		String requestFile0033 = "/maps/content/openlayers/theme/default/style.css";
		String requestHeader0033 = "GET " + requestFile0033 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0033, requestHost0033, requestPort0033, requestHeader0033, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0033 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 8651
		// content test algorithm: check size +/- 5%, defined content size = 8651
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, 8651, 5);		// Test [33] <- Index 33
		if(replayMode)
		{
			long proxyDataRecordId =1623701726058L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [34] <- WEB ADMIN Index 46 ---
		String requestProt0034 = "https";
		String requestHost0034 = "qa.denvergov.org";
		int    requestPort0034 = 443;
		String requestFile0034 = "/maps/content/fancybox/jquery.fancybox-2.1.5.css";
		String requestHeader0034 = "GET " + requestFile0034 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0034, requestHost0034, requestPort0034, requestHeader0034, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0034 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 5168
		// content test algorithm: check size +/- 5%, defined content size = 5168
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, 5168, 5);		// Test [34] <- Index 34
		if(replayMode)
		{
			long proxyDataRecordId =1623701726060L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [35] <- WEB ADMIN Index 47 ---
		String requestProt0035 = "https";
		String requestHost0035 = "qa.denvergov.org";
		int    requestPort0035 = 443;
		String requestFile0035 = "/maps/content/TipTip/tipTip.css";
		String requestHeader0035 = "GET " + requestFile0035 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0035, requestHost0035, requestPort0035, requestHeader0035, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0035 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 2589
		// content test algorithm: check size +/- 5%, defined content size = 2589
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, 2589, 5);		// Test [35] <- Index 35
		if(replayMode)
		{
			long proxyDataRecordId =1623701726062L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [36] <- WEB ADMIN Index 49 ---
		log();
		log("# title: 403 Forbidden");
		String requestProt0036 = "https";
		String requestHost0036 = "qa.denvergov.org";
		int    requestPort0036 = 443;
		String requestFile0036 = "/favicon.ico";
		String requestHeader0036 = "GET " + requestFile0036 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: image\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0036, requestHost0036, requestPort0036, requestHeader0036, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0036 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 403, content type = [verification disabled], header text fragment = [verification disabled], recorded content size = 548
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {403}, null, null, null);		// Test [36] <- Index 36
		if(replayMode)
		{
			long proxyDataRecordId =1623701726157L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure - dump wrong content to thread log and abort current loop
			terminateFailedUser(testURL);		// set the user to be terminated at end of loop ? - only performed if the URL call has marked before to support that !
			endOfExecuteLoop(false, testURL, threadStep, loopPluginContext);
			return false;
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated




		// all http requests of page #1_1 successful done
		return true;
	}


	/**
	 * Recorded http requests of page #2.
	 *
	 * @return  true:  method successful completed.
	 *          false: method/loop failed.
	 */
	boolean executePage_2(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext,int innerLoopCounter, int totalInnerLoopCount, Object httpLogVectorObject) throws Exception
	{
		// # Page #2: address
		// # ----------------



		// --- HTTP REQUEST: Test [38] <- WEB ADMIN Index 54 ---
		String requestProt0038 = "https";
		String requestHost0038 = "qa.denvergov.org";
		int    requestPort0038 = 443;
		String requestFile0038 = "/denvermapsservices/FindAutoSuggestResults/" +
				"?callback=jQuery19105216142702942441_1623701725697" +
				"&stem=2" +
				"&types=realpropertyaddress,realpropertypin,realpropertyschednum" +
				"&_=1623701725698";
		String requestHeader0038 = "GET " + requestFile0038 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"Accept: text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0038, requestHost0038, requestPort0038, requestHeader0038, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0038 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/X-JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 309
		// content test algorithm: check size +/- 5%, defined content size = 309
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/X-JAVASCRIPT", null, 309, 5);		// Test [38] <- Index 38
		if(replayMode)
		{
			long proxyDataRecordId =1623701749532L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [39] <- WEB ADMIN Index 55 ---
		String requestProt0039 = "https";
		String requestHost0039 = "qa.denvergov.org";
		int    requestPort0039 = 443;
		String requestFile0039 = "/denvermapsservices/FindAutoSuggestResults/" +
				"?callback=jQuery19105216142702942441_1623701725697" +
				"&stem=211" +
				"&types=realpropertyaddress,realpropertypin,realpropertyschednum" +
				"&_=1623701725699";
		String requestHeader0039 = "GET " + requestFile0039 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"Accept: text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0039, requestHost0039, requestPort0039, requestHeader0039, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0039 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/X-JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 318
		// content test algorithm: check size +/- 5%, defined content size = 318
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/X-JAVASCRIPT", null, 318, 5);		// Test [39] <- Index 39
		if(replayMode)
		{
			long proxyDataRecordId =1623701750042L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [40] <- WEB ADMIN Index 56 ---
		String requestProt0040 = "https";
		String requestHost0040 = "qa.denvergov.org";
		int    requestPort0040 = 443;
		String requestFile0040 = "/denvermapsservices/FindAutoSuggestResults/" +
				"?callback=jQuery19105216142702942441_1623701725697" +
				"&stem=211%20" +
				"&types=realpropertyaddress,realpropertypin,realpropertyschednum" +
				"&_=1623701725700";
		String requestHeader0040 = "GET " + requestFile0040 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"Accept: text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0040, requestHost0040, requestPort0040, requestHeader0040, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0040 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/X-JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 319
		// content test algorithm: check size +/- 5%, defined content size = 319
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/X-JAVASCRIPT", null, 319, 5);		// Test [40] <- Index 40
		if(replayMode)
		{
			long proxyDataRecordId =1623701751109L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [41] <- WEB ADMIN Index 57 ---
		String requestProt0041 = "https";
		String requestHost0041 = "qa.denvergov.org";
		int    requestPort0041 = 443;
		String requestFile0041 = "/denvermapsservices/FindAutoSuggestResults/" +
				"?callback=jQuery19105216142702942441_1623701725697" +
				"&stem=211%20n%20" +
				"&types=realpropertyaddress,realpropertypin,realpropertyschednum" +
				"&_=1623701725701";
		String requestHeader0041 = "GET " + requestFile0041 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"Accept: text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0041, requestHost0041, requestPort0041, requestHeader0041, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0041 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/X-JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 315
		// content test algorithm: check size +/- 5%, defined content size = 315
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/X-JAVASCRIPT", null, 315, 5);		// Test [41] <- Index 41
		if(replayMode)
		{
			long proxyDataRecordId =1623701751699L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [42] <- WEB ADMIN Index 58 ---
		String requestProt0042 = "https";
		String requestHost0042 = "qa.denvergov.org";
		int    requestPort0042 = 443;
		String requestFile0042 = "/denvermapsservices/FindAutoSuggestResults/" +
				"?callback=jQuery19105216142702942441_1623701725697" +
				"&stem=211%20n%20king" +
				"&types=realpropertyaddress,realpropertypin,realpropertyschednum" +
				"&_=1623701725702";
		String requestHeader0042 = "GET " + requestFile0042 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"Accept: text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0042, requestHost0042, requestPort0042, requestHeader0042, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0042 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/X-JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 128
		// content test algorithm: check size +/- 5%, defined content size = 128
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/X-JAVASCRIPT", null, 128, 5);		// Test [42] <- Index 42
		if(replayMode)
		{
			long proxyDataRecordId =1623701752736L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure but continue current loop: mark pending transactions as defective and dump URL content to thread log
			transactionHandler.setPendingTransactionsAsDefective();
			log(testURL);
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [43] <- WEB ADMIN Index 60 ---
		String requestProt0043 = "https";
		String requestHost0043 = "qa.denvergov.org";
		int    requestPort0043 = 443;
		String requestFile0043 = "/property/realproperty/search/search/0/" +
				"?searchText=211%20n%20king" +
				"&page=1";
		String requestHeader0043 = "GET " + requestFile0043 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"Accept: application/json, text/javascript, */*; q=0.01\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Referer: https://qa.denvergov.org/property\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0043, requestHost0043, requestPort0043, requestHeader0043, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0043 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 416
		// content test algorithm: check size +/- 5%, defined content size = 416
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, 416, 5);		// Test [43] <- Index 43
		if(replayMode)
		{
			long proxyDataRecordId =1623701754499L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure - dump wrong content to thread log and abort current loop
			terminateFailedUser(testURL);		// set the user to be terminated at end of loop ? - only performed if the URL call has marked before to support that !
			endOfExecuteLoop(false, testURL, threadStep, loopPluginContext);
			return false;
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [44] <- WEB ADMIN Index 61 ---
		log();
		log("# title: 403 Forbidden");
		String requestProt0044 = "https";
		String requestHost0044 = "qa.denvergov.org";
		int    requestPort0044 = 443;
		String requestFile0044 = "/favicon.ico";
		String requestHeader0044 = "GET " + requestFile0044 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: qa.denvergov.org\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"\r\n" + 
				"sec-ch-ua-mobile: ?0\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Dest: image\r\n" + 
				"Referer: https://qa.denvergov.org/property?q=211%20n%20king\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Accept-Language: en-US,en;q=0.9\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0044, requestHost0044, requestPort0044, requestHeader0044, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		// Check for browse cache
		if(enableBrowserCache)
		{
			testURL = isInCache(testURL, threadStep);
			if(!testURL.isCached())
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
			else if(conditionalGet)
			{
				testURL.execute(performanceData);
				testURL = getFromCache(testURL, performanceData, threadStep);
			}
			else
			{
				testURL.execute(performanceData);
				storeToCache(testURL, performanceData);
			}
		}
		else
		{
			testURL.execute(performanceData);
		}
		requestHeader0044 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 403, content type = [verification disabled], header text fragment = [verification disabled], recorded content size = 548
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {403}, null, null, null);		// Test [44] <- Index 44
		if(replayMode)
		{
			long proxyDataRecordId =1623701754503L;
			createReplaySnapShotRecord(threadLoopCounter, proxyDataRecordId, testURL, replaySnapShotsDump);
		}
		if (!urlCallPassed)
		{
			// failure - dump wrong content to thread log and abort current loop
			terminateFailedUser(testURL);		// set the user to be terminated at end of loop ? - only performed if the URL call has marked before to support that !
			endOfExecuteLoop(false, testURL, threadStep, loopPluginContext);
			return false;
		}
		if (debugContent && urlCallPassed)
			log(testURL);

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated




		// all http requests of page #2 successful done
		return true;
	}



	boolean synchResponsesParallelRequestsPage_1(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext, Object httpLogVectorObject) throws Exception
	{
		int lastThreadStepInMainThread = threadStep;		// save last executed thread step
		
		// wait for the response of all parallel requests
		threadStep = pageThreadHandler.getLastThreadStep();
		pageThreadHandler.waitForSynch();
		log("Page 1 Time = " + pageThreadHandler.getPageTime() + " ms");
		
		if (!writeHttpAsyncResponseTabOutput_1(loopPluginContext,lastThreadStepInMainThread, innerLoopContext))
			return false;
		
		// all done
		threadStep = lastThreadStepInMainThread;		// restore last executed thread step
		return true;		// end of asynch response checks for this page
	}
	
	
	private boolean writeHttpAsyncResponseTabOutput_1 (LoadtestPluginContext loopPluginContext, int lastThreadStepInMainThread, InnerLoopContext innerLoopContext) throws Exception
	{
		return true;		// end of asynch response checks for this page
	}



	boolean synchResponsesParallelRequestsPage_2(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext, Object httpLogVectorObject) throws Exception
	{
		int lastThreadStepInMainThread = threadStep;		// save last executed thread step
		
		// wait for the response of all parallel requests
		threadStep = pageThreadHandler.getLastThreadStep();
		pageThreadHandler.waitForSynch();
		log("Page 2 Time = " + pageThreadHandler.getPageTime() + " ms");
		
		if (!writeHttpAsyncResponseTabOutput_2(loopPluginContext,lastThreadStepInMainThread, innerLoopContext))
			return false;
		
		// all done
		threadStep = lastThreadStepInMainThread;		// restore last executed thread step
		return true;		// end of asynch response checks for this page
	}
	
	
	private boolean writeHttpAsyncResponseTabOutput_2 (LoadtestPluginContext loopPluginContext, int lastThreadStepInMainThread, InnerLoopContext innerLoopContext) throws Exception
	{
		return true;		// end of asynch response checks for this page
	}



	/**
	 * implement GetRealTimeUserInputFieldsInterface: get the definition and the value of all real-time user input fields.
	 */
	public ArrayList<RealTimeUserInputField> getRealTimeUserInputFields()
	{
		try
		{
			ArrayList<RealTimeUserInputField> realTimeUserInputFieldList = new ArrayList<RealTimeUserInputField>();
			return realTimeUserInputFieldList;
		}
		catch (Exception e)
		{
			log(e);
			return null;
		}
	}



	/**
	 * implement ThreadStepInterface: get the current execution step (current URL call or page break) of a simulated user.
	 */
	public int getExecutionStep()
	{
		return threadStep;
	}



	/**
	 * implement SetThreadStepInterface: set the current execution step (current URL call or page break) of a simulated user.
	 */
	public void setExecutionStep(int threadStep)
	{
		this.threadStep = threadStep;
	}



	/**
	 * implement SSLSessionCacheStatisticInterface: get statistic data about the SSL session cache behavior of a simulated user.
	 */
	public SSLSessionCacheStatistic getSSLSessionCacheStatistic()
	{
		return sslStatistic;
	}



	/**
	 * implement VaryingTestDurationInterface: support to extend or to reduce the planned test duration.
	 */
	public int getPlannedTestDuration()
	{
		return plannedTestDuration;
	}
	
	public void setExtendTestDuration(int deltaSeconds)
	{
		if (plannedTestDuration == 0)
		{
			plannedTestDuration = deltaSeconds;		// the old planned test duration was unlimited but is now limited
			return;
		}
		if (deltaSeconds == 0)
		{
			plannedTestDuration = 0;		// the new planned test duration is now unlimited
			return;
		}
		plannedTestDuration = plannedTestDuration + deltaSeconds;
	}



	/**
	 * implement SuspendResumeInterface: support to suspend and to resume the test execution.
	 */
	public int getPlannedStartupDelay()
	{
		return plannedStartupDelay;
	}
	
	public void setUserResumeStartWaitDelay(int millis)
	{
		userResumeStartWaitDelay = millis;
	}



	/**
	 * implement VaryingLoadInterface: support to decrement the number of simulated users at runtime.
	 */
	public void setDecrementEndOfLoopFlag(boolean decrementEndOfLoopFlag)
	{
		this.decrementEndOfLoopFlag = decrementEndOfLoopFlag;
	}

	public boolean isDecrementEndOfLoopFlag()
	{
		return decrementEndOfLoopFlag;
	}



	/**
	 * internal method: execute the loops for one simulated user as a thread.
	 * controls the thread and displays the (thread-)log if one loop has been completed.
	 */
	public void run()
	{
		// user terminated by inline script, at start of user ?
		if (isTerminateUser())
		{
			System.out.println("# --- thread " + Thread.currentThread().getName() + " aborted --- " + ZoneTime.dateToShortString() + " ---");
			return;
		}
		try
		{
			while (true)
			{
				threadStep = ThreadStepInterface.THREAD_NO_STEP;
				clearLog();
				
				// execute loop
				log("--- loop started --- " + ZoneTime.dateToShortString() + " ---");
				long loopStartTime = System.nanoTime();
				if(replayMode)
				{
					createReplaySnapShot(threadLoopCounter, replaySnapShotsDump);
				}
				boolean loopPassed = this.execute(totalLoopCounter.getAndIncrement());
				if(isNonModularMode())
				{
					performanceData.addUserTransactionMeasuredSamples(transactionHandler.getPendingTransactions());
					ArrayList<UserTransactionContext> nonExecutedTransactions = transactionHandler.getNotExecutedTransactions();

					for (UserTransactionContext nonExecutedTransaction : new ArrayList<>(nonExecutedTransactions))
					{
						if(transactionContextMap.containsKey(nonExecutedTransaction.getTransactionId()+"") && transactionContextMap.get(nonExecutedTransaction.getTransactionId()+"") == null)
						{
							transactionContextMap.remove(nonExecutedTransaction.getTransactionId()+"");
							nonExecutedTransactions.remove(nonExecutedTransaction);
						}
					}

					performanceData.addUserTransactionNotExecutedSamples(nonExecutedTransactions);
				}
				performanceData.addSocktPoolStatistic(socketPool);
				socketPool.closePool();
				performanceData.addSSLCacheStatistic(sslStatistic.getSSLSessionCacheStatisticResult());
				sslStatistic.reset();
				
				// eof of input file or out of values for an unique number ?
				if (abortedByEofInputFile() || abortedByUniqueNumberVar())
					return;		// endOfRun() not called in such a case
				
				// check loop result
				String remainingLoopInfo = "";
				if (checkLoopCount)
					remainingLoopInfo = " [remaining loops = " + (remainingLoops - 1) + "]";
				if (loopPassed)
				{
					performanceData.addPassedLoop();
					log("--- loop passed ---  " + ZoneTime.dateToShortString() + " ---" + remainingLoopInfo);
				}
				else
				{
					performanceData.addFailedLoop();
					log("--- loop failed ---  " + ZoneTime.dateToShortString() + " ---" + remainingLoopInfo);
				}
					if (!loopVarMap.isEmpty())
					{
						log();
						log("+----------------------------------------------------------------+");
						log("Loop Variables Values");
						log("----------------------------------------------------");
						for(Map.Entry<String, String> entry : loopVarMap.entrySet())
						{
							log("|" + entry.getKey() + " = " + entry.getValue()+"|");
							log("");
						}
						log("+----------------------------------------------------------------+");
					}
				threadStep = ThreadStepInterface.THREAD_NO_STEP;
				
				// display thread log to standard output
				if (debugLoops || (debugFailedLoops && (!loopPassed)))
				{
					synchronized (dumpLock)
					{
						dumpLog(System.out);				// full log
					}
				}
				
				// check if max loops reached
				if (checkLoopCount)
				{
					// all done ?
					remainingLoops--;
					if (remainingLoops <= 0)
					{
						endOfRun();
						return;
					}
				}
				
				// check if simulated user must be decremented
				if (decrementEndOfLoopFlag && (getOwnLoadTestUserContext().getDecrementEndOfLoopPointInTime() <= System.currentTimeMillis()))
				{
					return;
				}
				
				// check if max test duration reached
				if ((plannedTestDuration > 0) && (((System.currentTimeMillis() - testDurationStart) / 1000) >= plannedTestDuration))
				{
					endOfRun();
					return;
				}
				
				// check if this specific user is terminated earlier than planned by a HTTP content verification or by a plug-in
				if (isTerminateUser())
				{
					endOfRun();
					System.out.println("# --- thread " + Thread.currentThread().getName() + " terminate failed user --- " + ZoneTime.dateToShortString() + " ---");
					return;
				}
				
				// check if load test execution is temporary suspended
				boolean wasSuspended = false;
				while (isSuspend())
				{
					wasSuspended = true;
					try { Thread.currentThread().sleep(20); } catch (InterruptedException ie) {}
					if (abortedByRemote() || abortedByEofInputFile() || abortedByUniqueNumberVar())
					{
						endOfRun();
						return;
					}
					
					// check if max test duration reached during suspend
					if ((plannedTestDuration > 0) && (((System.currentTimeMillis() - testDurationStart) / 1000) >= plannedTestDuration))
					{
						endOfRun();
						return;
					}
				}
				// check if load test execution is resumed
				if (wasSuspended)
				{
					try { sleepRemoteInterruptable(userResumeStartWaitDelay); } catch (InterruptedException ie) {}
				}
				
				// wait 20 milliseconds if loop has failed
				if (!loopPassed)
					try { Thread.currentThread().sleep(loopErrorDelay); } catch (InterruptedException ie) {}
				
				// enable pacing for the loop
				if(pacing > 0)
				{
					long loopElaspedTime = (System.nanoTime() - loopStartTime) / 1000000l;
					long loopPacingValue = Long.valueOf(pacing).longValue() * 1000l;
					if (loopElaspedTime < loopPacingValue)
					{
						threadStep = threadStep - 1;
						log(" - loop pacing: sleeping for "+ (loopPacingValue - loopElaspedTime)+" ms ...");
						Thread.currentThread().sleep(loopPacingValue - loopElaspedTime);
						threadStep++;
					}
				}
				// execute next loop
				threadLoopCounter++;
			}	// end: while (true)
		}
		catch (Throwable tex)
		{
			log("*** INTERNAL ERROR / LOAD TEST ABORTED ***");
			log(tex);
			log();
			synchronized (dumpLock)
			{
				if(replayMode)
				{
					saveReplaySnapShots("ZTReplay.snapshot");
				}
				saveATSTablesData();
				dumpLog(System.out);				// full log
				System.err.println("*** INTERNAL ERROR / LOAD TEST ABORTED ***");
				tex.printStackTrace(System.err);
				System.exit(-2);
			}
		}
		finally
		{
			// remove the reference to this load test instance and the reference to the thread that runs this instance
			try
			{
				if (!decrementEndOfLoopFlag)
				{
					getUserContextTable().getWriteLock().lock();
					getOwnLoadTestUserContext().setLoadTestUserFinallyEnded();
					getUserContextTable().getWriteLock().unlock();
				}
				else
					decrementEndOfLoopFlag = false;
			}
			catch (Throwable texFinal)
			{
				System.err.println("*** INTERNAL FINALLY ERROR / LOAD TEST ABORTED ***");
				texFinal.printStackTrace(System.err);
				System.exit(-2);
			}
		}
	}



	/**
	 * internal method: called when a user has completed the test-run.
	 */
	public void endOfRun()
	{
		clearLog();
		
		if (debugLoops && (getLog().size() > 0))
		{
			synchronized (dumpLock)
			{
				dumpLog(System.out);		// dump log of inline scripts and load test plug-ins which are executed at end of user
			}
		}
	}



	/**
	 * Main program. Starts the test and waits until all have been done.
	 */
	public static void main(String[] args)
	{
		// check command line argument -h or -help
		if ((ParseArgs.hasOption(args, "-h")) || (ParseArgs.hasOption(args, "-help")))
		{
			System.out.println();
			System.out.println("Help - Proxy Sniffer Load Test Program:");
			System.out.println();
			System.out.println("-u <number>              ->> required argument: number of concurrent users");
			System.out.println("-d <seconds>             ->> required argument: planned test duration in seconds (default: 30, 0 = unlimited)");
			System.out.println("-t <seconds>             ->> required argument: request timeout per url in seconds");
			System.out.println();
			System.out.println("-tconnect <seconds>      ->> TCP/IP socket connect timeout in seconds (default: use value of -t <seconds>)");
			System.out.println();
			System.out.println("-sdelay <milliseconds>   ->> startup delay time between concurrent users in milliseconds (default: 200)");
			System.out.println("-mtpu <number>           ->> maximum number of parallel threads per user (default: " + MAX_PARALLEL_THREADS_PER_USER + ")");
			System.out.println("-maxloops <number>       ->> maximum number of loops per user (default: 0 = unlimited)");
			System.out.println("-pacing <seconds>        ->> sets a minimum time for all in the loop executed page breaks and url calls which must be elapsed before the next loop starts (default: 0 = no pacing)");
			System.out.println("-downlink <kbps>         ->> maximum downlink network bandwidth per user in kilobits per second (default: 0 = unlimited)");
			System.out.println("-uplink <kbps>           ->> maximum uplink network bandwidth per user in kilobits per second (default: 0 = unlimited)");
			System.out.println("-multihomed <filename>   ->> use serveral client ip addresses - file format: <addr1>, <addr2>, ... (all on the same line)");
			System.out.println("-sampling <seconds>      ->> statistic sampling interval in seconds (default: 15)");
			System.out.println("-percpage <percent>      ->> additional sampling rate per web page call in percent (default: 100)");
			System.out.println("-percurl <percent>       ->> additional sampling rate per url call in percent (default: 0)");
			System.out.println("-percurlopt <level>      ->> extended sampling level per url call, see application reference manual (default: 0 = disabled)");
			System.out.println("-maxerrsnap <number>     ->> maximum number of error snapshots per url (default: 0 = unlimited)");
			System.out.println("-maxerrmem <megabytes>   ->> maximum size of memory in megabytes which can be used for error snapshots (default: 20, -1 = unlimited)");
			System.out.println("-nosdelayCluster         ->> apply startup delay time between concurrent users per exec agent, but not per cluster job (default: apply per cluster job)");
			System.out.println("-setuseragent \"<text>\"   ->> replace the recorded value of the HTTP request header field User-Agent with a new value");
			System.out.println("-collect <host>[:<port>] ->> collect additional data from external measuring agents (data collectors)");
			System.out.println("-res <filename>          ->> overrides the default name of the binary output file");
			System.out.println("-nores                   ->> disables to create the binary output file");
			System.out.println();
			System.out.println("-ssl <version>           ->> set SSL version: possible options are \"all\" (default), \"v3\", \"tls\", \"tls11\", \"tls12\" or \"tls13\"");
			System.out.println("-sslcache <seconds>      ->> timeout of user-related SSL session cache (default: 300, 0 = cache disabled)");
			System.out.println("-sslrandom <type>        ->> set the type of the random generator used for SSL handshakes: possible options are \"fast\", \"iaik\" (default) or \"java\"");
			System.out.println("-sslcmode                ->> apply SSL/HTTPS compatibility workarounds for deficient SSL servers");
			System.out.println("-noECC                   ->> disable support of elliptic curve cryptography (ECC)");
			System.out.println("-nosni                   ->> disable support of server name indication (SNI)");
			System.out.println("-snicritical             ->> set the TLS SNI extension as critical (default: non-critical)");
			System.out.println("-tlssessiontickets       ->> set the TLS to use Session Tickets (non-critical)");
			System.out.println("-iaikLast                ->> adds the IAIK security provider at the last position (instead of default: IAIK at first position)");
			System.out.println();
			System.out.println("-dnssrv <IP-1>[,IP-N])   ->> use specific DNS server(s) to resolve DNS host names (default: use OS to resolve host names)");
			System.out.println("-dnshosts <filename>     ->> use specific DNS hosts file (default: use OS to resolve host names)");
			System.out.println("-dnstranslation <filename> ->> use a DNS translation file that converts DNS names. It might be needed to disable TLS SNI if this option is used");
			System.out.println("-dnsenattl               ->> enable consideration of DNS TTL by using the received TTL-values from the DNS Server(s) (default: TTL disabled)");
			System.out.println("-dnsfixttl <seconds>     ->> enable DNS TTL by using a fixed TTL-value of seconds for all DNS resolves");
			System.out.println("-dnsperloop              ->> perform new DNS resolves for each executed loop. All resolves are stable within the same loop (no consideration of DNS TTL within a loop)");
			System.out.println("-dnsstatistic            ->> collect statistical data about DNS resolutions. Note: use this option only if not any other, more specific DNS option is enabled");
			System.out.println("-dnsdebug                ->> debug DNS resolves and the DNS cache");
			System.out.println("-enableIPv6 <networkinterface-name>  ->> enable only IPv6 support for recording, also can provide the IPv6 network interface of the load generator");
			System.out.println("-enableIPv6v4 <networkinterface-name> ->> enable both IPv6 and IPv4 (first will try with IPv6 ,if fails will try with IPv4 support for recording),also can provide the IPv6 network interface of the load generator");
			System.out.println();
			System.out.println("-dfl                     ->> debug execution steps of all failed loops to standard output");
			System.out.println("-dl                      ->> debug execution steps of all loops to standard output");
			System.out.println("-dh                      ->> debug HTTP protocol headers to standard output, includes the -dl option");
			System.out.println("-dc                      ->> debug HTTP content data to standard output, includes the -dl option");
			System.out.println("-dhc                     ->> debug HTTP protocol headers and HTTP content data to standard output, includes the -dl option");
			System.out.println("-dC                      ->> debug cookies to standard output, includes the -dl option");
			System.out.println("-dK                      ->> debug keep-alive (socket pool) to standard output, includes the -dl option");
			System.out.println("-dssl                    ->> debug SSL handshake (https) to standard output, includes the -dl and the -dK option");
			System.out.println();
			System.out.println("-tz <timezone>           ->> set time zone (see Application Reference Manual: supported time zones)");
			System.out.println("-dgs a|c                 ->> set number format (decimal group separator) a = '  c = ,");
			System.out.println("-browserlang <text>      ->> set the browser language for the test");
			System.out.println("-enablebrowcache         ->> set the browser cache mode on");
			System.out.println("-checknewpageversion     ->> set the conditional GET mode on");
			System.out.println("-cachehtml               ->> set the cache html resources flag");
			System.out.println("-newvuperloop            ->> simulate new VU per loop");
			System.out.println("-replay                  ->> Indicates the replay mode");
			System.out.println("-annotation <text>       ->> adds an annotation for this test run");
			System.out.println();
			System.out.println("-execAgentHost <ip address or dns name>      ->> set the ip address or the dns name of the exec agent from which the license is used (default: 127.0.0.1)");
			System.out.println("-execAgentPort <port>                        ->> set the tcp/ip port of the exec agent (default: 7993)");
			System.out.println("-execAgentProtocol <plain | http | https>    ->> set the protocol of the exec agent (default: plain)");
			System.out.println("-execAgentUsername <string>                  ->> set the auth. username for the exec agent (default: [no username])");
			System.out.println("-execAgentPassword <string>                  ->> set the auth. password for the exec agent (default: [no password])");
			System.out.println();
			System.out.println("-h                       ->> display this help text");
			System.out.println("-help                    ->> display this help text");
			System.out.println();
			System.exit(-1);
		}
		
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("| Welcome to the ZebraTester Load Test Program.                  |");
		System.out.println("| Additional help available with program argument \"-help\"        |");
		System.out.println("| Procedure Copyright by Apica. |");
		System.out.println("| All rights reserved.             |");
		System.out.println("+----------------------------------------------------------------+");
		
		
		if (commonNextProxyConfig != null)
		{
			System.out.println();
			System.out.println("*** Warning: Loadtest over HTTP(S) Proxy ***");
		}
		
		// check command line argument -tz <timezone>
		String timeZoneString = ParseArgs.getString(args, "-tz");
		if (timeZoneString != null)
			defaultTimeZone = timeZoneString; // set time zone?
		ZoneTime.setDefaultTimeZone(defaultTimeZone);
		
		// check command line argument -noECC
		sslECC = (!ParseArgs.hasOption(args, "-noECC"));       // disable ssl ecc ?
		
		// initialize ssl/https support
		SSLInit.execute(!ParseArgs.hasOption(args, "-iaikLast"), true);
		if (sslECC)
			SSLInit.enableECC();
		
		// check command line argument -nosni
		if (ParseArgs.hasOption(args, "-nosni"))            // disable ssl sni ?
			sslSNI = false;
		
		// check command line argument -snicritical
		if (ParseArgs.hasOption(args, "-snicritical"))      // set ssl sni as critical tls extension ?
			sslSNICirical = true;
		
		// check command line argument -tlssessiontickets
		if (ParseArgs.hasOption(args, "-tlssessiontickets"))      // set tls extension session tickets?
			useTlsSessionTickets = true;
		
		// set default character set for response content tests
		setCharEncoding(prxCharEncoding);
		
		// check command line argument -dgs a|c
		String dgs = ParseArgs.getString(args, "-dgs");
		if (dgs != null)
		{
			if (dgs.equalsIgnoreCase("a"))
				defaultNumberGroupingSeparator = '\'';
			if (dgs.equalsIgnoreCase("c"))
				defaultNumberGroupingSeparator = ',';
		}
		Lib.setDefaultNumberGroupingSeparator(defaultNumberGroupingSeparator);
		
		// check command line argument -browserlang <text>
		browserLanguage = ParseArgs.getString(args, "-browserlang");
		
		// check command line argument -enablebrowcache
		if (ParseArgs.hasOption(args, "-enablebrowcache"))
		{
			enableBrowserCache = true;
			browserCacheStatistic = new BrowserCacheStatistic();
		}
		
		// check command line argument -checknewpageversion
		if (ParseArgs.hasOption(args, "-checknewpageversion"))
		{
			conditionalGet = true;
		}
		
		// check command line argument -replay
		if (ParseArgs.hasOption(args, "-replay"))
		{
			replayMode = true;
		}
		
		// check command line argument -annotation <text>
		String testRunAnnotation = ParseArgs.getString(args, "-annotation");
		if (testRunAnnotation != null)
		{
			if (testRunAnnotation.startsWith("\"") && testRunAnnotation.endsWith("\""))
				testRunAnnotation = testRunAnnotation.substring(1, testRunAnnotation.length() - 1);
		}
		
		// check command line argument -ssl
		String newSslProtocolVersion = ParseArgs.getString(args, "-ssl");
		if (newSslProtocolVersion != null)
		{
			if (newSslProtocolVersion.equalsIgnoreCase("v2"))
				sslProtocolVersion = "v2";
			if (newSslProtocolVersion.equalsIgnoreCase("v3"))
				sslProtocolVersion = "v3";
			if (newSslProtocolVersion.equalsIgnoreCase("tls"))
				sslProtocolVersion = "tls";
			if (newSslProtocolVersion.equalsIgnoreCase("tls11"))
				sslProtocolVersion = "tls11";
			if (newSslProtocolVersion.equalsIgnoreCase("tls12"))
				sslProtocolVersion = "tls12";
			if (newSslProtocolVersion.equalsIgnoreCase("tls13"))
				sslProtocolVersion = "tls13";
		}
		
		// check command line argument -sslcache <seconds>
		Integer newSslSessionCacheTimeout = ParseArgs.getInteger(args, "-sslcache");
		if (newSslSessionCacheTimeout != null)
			sslSessionCacheTimeout = newSslSessionCacheTimeout.intValue();
		
		// check command line argument -sslrandom
		String sslHandshakeRandomGeneratorTypeStr = ParseArgs.getString(args, "-sslrandom");
		if (sslHandshakeRandomGeneratorTypeStr != null)
		{
			if (sslHandshakeRandomGeneratorTypeStr.equalsIgnoreCase("java"))
				sslHandshakeRandomGeneratorType = HttpSocketPool.SSL_HANDSHAKE_RANDOM_GENERATOR_TYPE_JAVA_DEFAULT;
			if (sslHandshakeRandomGeneratorTypeStr.equalsIgnoreCase("iaik"))
				sslHandshakeRandomGeneratorType = HttpSocketPool.SSL_HANDSHAKE_RANDOM_GENERATOR_TYPE_IAIK_DEFAULT;
			if (sslHandshakeRandomGeneratorTypeStr.equalsIgnoreCase("fast"))
				sslHandshakeRandomGeneratorType = HttpSocketPool.SSL_HANDSHAKE_RANDOM_GENERATOR_TYPE_FAST;
		}
		
		// check command line argument -sslcmode
		sslcmode = ParseArgs.hasOption(args, "-sslcmode");  // enable ssl/https compatibility workarounds?
		
		// check command line argument -dfl
		debugFailedLoops = ParseArgs.hasOption(args, "-dfl"); // debug failed loops?
		
		// check command line argument -dl
		debugLoops = ParseArgs.hasOption(args, "-dl");      // debug loops?
		
		// check command line argument -dh
		debugHttp = ParseArgs.hasOption(args, "-dh");       // debug http?
		if (debugHttp)
			debugLoops = true;
		
		// check command line argument -dc
		debugContent = ParseArgs.hasOption(args, "-dc");    // debug content?
		if (debugContent)
			debugLoops = true;
		
		// check command line argument -dhc
		if (ParseArgs.hasOption(args, "-dhc"))				// debug http and content
		{
			debugLoops = true;
			debugHttp = true;
			debugContent = true;
		}
		
		// check command line argument -dC
		debugCookies = ParseArgs.hasOption(args, "-dC");    // debug cookies?
		if (debugCookies)
			debugLoops = true;
		
		// check command line argument -dK
		debugKeepAlive = ParseArgs.hasOption(args, "-dK");  // debug keep.alive (socket pool)?
		if (debugKeepAlive)
			debugLoops = true;
		
		// check command line argument -dssl
		debugSsl = ParseArgs.hasOption(args, "-dssl");      // debug keep.alive (socket pool)?
		if (debugSsl)
		{
			debugLoops = true;
			debugKeepAlive = true;
		}
		
		// get startup delay
		Integer newStartupDelay = ParseArgs.getInteger(args, "-sdelay");
		if (newStartupDelay != null)
			plannedStartupDelay = newStartupDelay.intValue();
		
		// get max. parallel threads per user - note: only valid if CONTAINS_PARALLEL_EXECUTED_URLS = true
		Integer newMaxParallelThreadsPerUser = ParseArgs.getInteger(args, "-mtpu");
		if (newMaxParallelThreadsPerUser != null)
		{
			if (newMaxParallelThreadsPerUser.intValue() > 0)
				maxParallelThreadsPerUser = newMaxParallelThreadsPerUser.intValue();
		}
		// get maximum number of loops per user
		maxPlannedLoops = 0;  // maximum loops per user, 0 = unlimited
		Integer newLoops = ParseArgs.getInteger(args, "-maxloops");
		if (newLoops != null)
			maxPlannedLoops = newLoops.intValue();
		
		// pacing of loops per user
		Integer pacingObj = ParseArgs.getInteger(args, "-pacing");
		if (pacingObj != null)
			pacing = pacingObj.intValue();
		
		// get maximum downlink network bandwidth per user (default = unlimited)
		Integer newDownlinkBandwidth = ParseArgs.getInteger(args, "-downlink");
		if (newDownlinkBandwidth != null)
			downlinkBandwidth = newDownlinkBandwidth.intValue();
		
		// get maximum uplink network bandwidth per user (default = unlimited)
		Integer newUplinkBandwidth = ParseArgs.getInteger(args, "-uplink");
		if (newUplinkBandwidth != null)
			uplinkBandwidth = newUplinkBandwidth.intValue();
		
		// get statistic sampling interval
		int samplingInterval = 15;  // statistic sampling interval in seconds
		Integer newSamplingInterval = ParseArgs.getInteger(args, "-sampling");
		if (newSamplingInterval != null)
			samplingInterval = newSamplingInterval.intValue();
		
		// get additional sampling rate per web page call
		int percentilePageSampling = 100;  // additional sampling rate per web page call in percent
		Integer newPercentilePageSampling = ParseArgs.getInteger(args, "-percpage");
		if (newPercentilePageSampling != null)
			percentilePageSampling = newPercentilePageSampling.intValue();
		
		// get additional sampling rate per url call
		int percentileUrlSampling = 0;  // additional sampling rate per url call in percent
		Integer newPercentileUrlSampling = ParseArgs.getInteger(args, "-percurl");
		if (newPercentileUrlSampling != null)
			percentileUrlSampling = newPercentileUrlSampling.intValue();
		
		// get extended sampling level per url call
		int percentileUrlSamplingAddOption = 0;  // extended sampling level per url call, 0 = disabled
		Integer newPercentileUrlSamplingAddOption = ParseArgs.getInteger(args, "-percurlopt");
		if (newPercentileUrlSamplingAddOption != null)
			percentileUrlSamplingAddOption = newPercentileUrlSamplingAddOption.intValue();
		
		// get maximum number of error snapshots per URL (0 = unlimited)
		int maxErrorSnapshots = 0;
		Integer newMaxErrorSnapshots = ParseArgs.getInteger(args, "-maxerrsnap");
		if (newMaxErrorSnapshots != null)
			maxErrorSnapshots = newMaxErrorSnapshots.intValue();
		
		// get maximum memory in megabytes which can be used for error snapshots (-1 = unlimited, default = 10)
		long maxErrorSnapshotMemory = 20;
		Long newMaxErrorSnapshotMemory = ParseArgs.getLong(args, "-maxerrmem");
		if (newMaxErrorSnapshotMemory != null)
			maxErrorSnapshotMemory = newMaxErrorSnapshotMemory.longValue();
		
		// single user mode ?
		boolean singleUserMode = ParseArgs.hasOption(args, "-singleuser");
		
		// override value for http user agent field ?
		String setUserAgentStr = ParseArgs.getIgnoreCaseString(args, "-setuseragent");
		if (setUserAgentStr != null)
		{
			USER_AGENT_1 = setUserAgentStr;
		}
		// get required input arguments
		int concurrentUsers = 0;     // number of concurrent users
		plannedRequestTimeout = 0;   // request timeout in seconds
		
		System.out.println();
		
		// parse -u argument or ask --> <number of concurrent users>
		Integer i = ParseArgs.getIntegerOrAsk(args, "-u", "Concurrent Users, <RETURN>=1 : ", new Integer(1));
		if (i == null)
			System.exit(-1);
		else
			concurrentUsers = i.intValue();
		
		// parse -d argument or ask --> <test duration in seconds>
		i = ParseArgs.getIntegerOrAsk(args, "-d", "Test Duration in Seconds, <RETURN>=30 : ", new Integer(30));
		if (i == null)
			System.exit(-1);
		else
			plannedTestDuration = i.intValue();
		
		// parse -t argument or ask --> <request timeout in seconds>
		i = ParseArgs.getIntegerOrAsk(args, "-t", "HTTP Request Timeout per URL in Seconds, <RETURN>=60 : ", new Integer(60));
		if (i == null)
			System.exit(-1);
		else
			plannedRequestTimeout = i.intValue();
		
		// parse optional -tconnect argument (TCP/IP socket connect timeout in seconds)
		i = ParseArgs.getInteger(args, "-tconnect");
		if (i != null)
			plannedConnectTimeout = i.intValue();
		
		String genericFileName = PerformanceData.proposeFileName("PropertyAddressSearch", concurrentUsers, ParseArgs.getString(args, "-executionPlan"));
		
		// auto-configure binary result file
		if (!ParseArgs.hasOption(args, "-nores"))
		{
			String newResultFile = ParseArgs.getString(args, "-res");
			if (newResultFile == null)
				resultFile = genericFileName + ".prxres";
			else
				resultFile = newResultFile;
			System.out.println("Result File : " + resultFile);
		}
		
		// display common arguments at console output
		System.out.println();
		System.out.println("# concurrent users = " + concurrentUsers);
		System.out.println("# max. parallel threads per user = [serial execution order for all URLs]");
		System.out.print("# planned test duration = ");
		if (plannedTestDuration == 0 || plannedTestDuration == -1)
			System.out.println("unlimited");
		else
			System.out.println("" + plannedTestDuration + " seconds");
		System.out.println("# http request timeout = " + plannedRequestTimeout + " seconds");
		if (plannedConnectTimeout != 0)
			System.out.println("# tcp/ip socket connect timeout = " + plannedConnectTimeout + " seconds");
		System.out.println("# startup delay = " + plannedStartupDelay + " milliseconds");
		System.out.println("# statistic sampling interval = " + samplingInterval + " seconds");
		System.out.println("# additional sampling rate per web page call = " + percentilePageSampling + " %");
		System.out.println("# additional sampling rate per url call = " + percentileUrlSampling + " %");
		System.out.println("# extended sampling per url call = " + PerformanceDataTickExtension.extTypeToString(percentileUrlSamplingAddOption).toLowerCase());
		System.out.print("# max loops per user = ");
		if (maxPlannedLoops == 0)
			System.out.println("unlimited");
		else
			System.out.println("" + maxPlannedLoops + " loops");
		System.out.print("# pacing for loops = ");
		if (pacing == 0)
			System.out.println("no pacing");
		else
			System.out.println("" + pacing + " seconds");
		if (downlinkBandwidth > 0)
			System.out.println("# max downlink bandwidth per user = " + downlinkBandwidth + " kbps");
		if (uplinkBandwidth > 0)
			System.out.println("# max uplink bandwidth per user = " + uplinkBandwidth + " kbps");
		System.out.println("# http protocol version = v" + httpProtocolVersion);
		System.out.println("# ssl protocol version = " + sslProtocolVersion);
		if (sslSessionCacheTimeout != 0)
			System.out.println("# ssl session cache timeout = " + sslSessionCacheTimeout + " seconds");
		else
			System.out.println("# ssl session cache disabled");
		if (resultFile != null)
			System.out.println("# result file = " + resultFile);
		else
			System.out.println("# no result file");
		if (debugFailedLoops)
			System.out.println("# debug failed loops");
		if (debugLoops)
			System.out.println("# debug loops");
		if (debugHttp)
			System.out.println("# debug http protocol headers");
		if (debugContent)
			System.out.println("# debug http content data");
		if (debugCookies)
			System.out.println("# debug cookies");
		if (debugKeepAlive)
			System.out.println("# debug keep-alive (socket pool)");
		if (debugSsl)
			System.out.println("# debug ssl (https)");
		if (enableBrowserCache)
		{
			if (conditionalGet)
			System.out.println("# browser cache - conditional GET is enabled");
		}
		
		
		// ----------------------------
		// *** initialize load test ***
		// ----------------------------
		
		
		// initialize performance data
		// ---------------------------
		final int PAGE_BREAKS = 2;  // number of page breaks in execute()  - modify this value if you add or delete some page breaks
		final int MAX_THREAD_STEPS = 43;  // number of URL requests in execute() - modify this value if you add or delete some requests
		performanceData = new PerformanceData(PAGE_BREAKS, MAX_THREAD_STEPS, concurrentUsers, -1, plannedTestDuration, maxPlannedLoops, httpProtocolVersion, plannedStartupDelay, plannedRequestTimeout, samplingInterval, percentilePageSampling, percentileUrlSampling, percentileUrlSamplingAddOption);
		performanceData.setInfoText("PropertyAddressSearch");
		performanceData.setExecutorsAnnotation(testRunAnnotation);
		if (commonNextProxyConfig != null)
		{
			performanceData.setProxyInfo(proxyHttpHost, proxyHttpPort, proxyHttpsHost, proxyHttpsPort);
			performanceData.addTestDescription("*** Warning: Load test executed via outbound proxy ***");
		}
		performanceData.setResultFileName(resultFile);
		performanceData.setDumpStream(System.out, "# ");
		performanceData.setMaxErrorSnapshots(maxErrorSnapshots);		// 0 = unlimited
		if (maxErrorSnapshotMemory >= 0)
			performanceData.setMaxErrorSnapshotsMemory(maxErrorSnapshotMemory * 1048576l);		// value in bytes
		
		if (sslECC)
			performanceData.addTestDescription("*** SSL/TLS ECC is enabled ***");
		
		if ((downlinkBandwidth != 0) || (uplinkBandwidth != 0))
		{
			String downlinkBandwidthStr = "unlimited";
			String uplinkBandwidthStr = "unlimited";
			
			if (downlinkBandwidth != 0)
				downlinkBandwidthStr = "" + downlinkBandwidth + " kbps";
			if (uplinkBandwidth != 0)
				uplinkBandwidthStr = "" + uplinkBandwidth + " kbps";
			
			performanceData.addTestDescription("*** Warning: Max. network bandwidth per user limited. downlink = " + downlinkBandwidthStr + ", uplink = " + uplinkBandwidthStr + " ***");
		}
		
		if ((percentileUrlSamplingAddOption != PerformanceDataTickExtension.EXT_TYPE_NOTYPE) && (percentileUrlSampling > 0))
			performanceData.addTestDescription("*** Warning: Option \"" + PerformanceDataTickExtension.extTypeToString(percentileUrlSamplingAddOption).toLowerCase() + "\" enabled for additional sampling rate per URL call ***");
		if (debugFailedLoops)
			performanceData.addTestDescription("*** Warning: Debug failed loops enabled ***");
		if (debugLoops)
			performanceData.addTestDescription("*** Warning: Debug loops enabled ***");
		if (debugHttp)
			performanceData.addTestDescription("*** Warning: Debug HTTP protocol headers enabled ***");
		if (debugContent)
			performanceData.addTestDescription("*** Warning: Debug HTTP content data enabled ***");
		if (debugCookies)
			performanceData.addTestDescription("*** Warning: Debug cookies enabled ***");
		if (debugKeepAlive)
			performanceData.addTestDescription("*** Warning: Debug keep-alive enabled ***");
		if (debugSsl)
			performanceData.addTestDescription("*** Warning: Debug SSL/TLS enabled ***");
		if (!sslProtocolVersion.equalsIgnoreCase("all"))
			performanceData.addTestDescription("*** Warning: SSL/TLS protocol version fixed to " + sslProtocolVersion.toUpperCase() + " ***");
		if (sslSessionCacheTimeout == 0)
			performanceData.addTestDescription("*** Warning: SSL/TLS session cache disabled ***");
		if (singleUserMode)
		{
			String singleUserModeWarning = "*** Warning: Single user mode enabled ***";
			System.out.println(singleUserModeWarning);
			performanceData.addTestDescription(singleUserModeWarning);
		}
		if (setUserAgentStr != null)
		{
			String overrideUserAgentWarning = "*** Warning: User agent set to \"" + setUserAgentStr + "\" ***";
			System.out.println(overrideUserAgentWarning);
			performanceData.addTestDescription(overrideUserAgentWarning);
		}
		
		
		// ready to start load test...
		initNull(concurrentUsers);
		performanceData.setUserContextTable(getUserContextTable());
		
		// ... but init first remote interface ...
		initRemote(args);
		
		// ... and init plug-in class loader ...
		try
		{
			if (getPluginClassLoader() == null)
				setPluginClassLoader(new LoadtestPluginClassLoader(getSymmetricEncryptContext(), getEncryptedClasspathList()));
		}
		catch (Throwable pluginClassLoaderThrowable)
		{
			System.out.println("*** ERROR: Unable to load encrypted files ***");
			pluginClassLoaderThrowable.printStackTrace();
			System.exit(-1);
		}
		
		// ... and check multihomed option ...
		initMultihomed(args);
		
		// ... and add dynaTrace session ID to load test result - if available ...
		initDynaTrace();
		
		
		// use test-specific DNS hosts file (optional) ?
		String dnsHostsFile = ParseArgs.getIgnoreCaseString(args, "-dnshosts");
		if (dnsHostsFile != null)
		{
			try
			{
				dnsCache = new DNSCache(getSymmetricEncryptContext(), dnsHostsFile);
			}
			catch (IOException ie)
			{
				System.out.println("*** ERROR: unable to read DNS hosts file " + dnsHostsFile + " ***");
				System.out.println("*** Hint: you have to ZIP " + dnsHostsFile + " together with the compiled class of the load test program ***");
				ie.printStackTrace();
				System.exit(-1);
			}
		}
		
		// use test-specific DNS translation table (optional) ?
		String dnsTranslationTableFile = ParseArgs.getIgnoreCaseString(args, "-dnstranslation");
		if (dnsTranslationTableFile != null)
		{
			try
			{
				DNSTranslationTable dnsTranslationTable = new DNSTranslationTable(getSymmetricEncryptContext(), new File(dnsTranslationTableFile));
				if (dnsCache == null)
					dnsCache = new DNSCache();
				dnsCache.setDNSTranslationTable(dnsTranslationTable);
			}
			catch (IOException ie)
			{
				System.out.println("*** ERROR: unable to read DNS translation table file " + dnsTranslationTableFile + " ***");
				System.out.println("*** Hint: you have to ZIP " + dnsTranslationTableFile + " together with the compiled class of the load test program ***");
				ie.printStackTrace();
				System.exit(-1);
			}
		}
		
		// use test-specific DNS servers (optional) ?
		String dnsSrvStr = ParseArgs.getIgnoreCaseString(args, "-dnssrv");
		if (dnsSrvStr != null)
		{
			ArrayList<String> dnsSrvList = new ArrayList<String>();
			StringTokenizer dnsTok = new StringTokenizer(dnsSrvStr, ",;");
			while (dnsTok.hasMoreTokens())
				dnsSrvList.add(dnsTok.nextToken());
			if (dnsCache == null)
				dnsCache = new DNSCache(dnsSrvList);
			else
				dnsCache.setDnsServers(dnsSrvList);
		}
		
		// enable DNS TTL ?
		if (ParseArgs.hasOption(args, "-dnsenattl"))
		{
			if (dnsCache == null)
				dnsCache = new DNSCache();
			dnsCache.enableTTL();
		}
		
		// set fixed DNS TTL ?
		Integer dnsFixTTL = ParseArgs.getInteger(args, "-dnsfixttl");
		{
			if (dnsFixTTL != null)
			{
				if (dnsCache == null)
					dnsCache = new DNSCache();
				dnsCache.setFixedTTL(dnsFixTTL.intValue());
			}
		}
		
		// enable DNS resolves per loop ?
		if (ParseArgs.hasOption(args, "-dnsperloop"))
		{
			if (dnsCache == null)
				dnsCache = new DNSCache();
			dnsPerLoop = true;
		}
		
		// enable DNS statistic ?   // note: use this option only if not any other, more specific DNS option is enabled.
		if (ParseArgs.hasOption(args, "-dnsstatistic"))
		{
			if (dnsCache == null)
				dnsCache = new DNSCache();
		}
		
		// debug DNS resolver ?
		if (ParseArgs.hasOption(args, "-dnsdebug"))
		{
			if (dnsCache == null)
				dnsCache = new DNSCache();
			dnsCache.setDebugToStdout(true);
		}
		
		// enable IPv6 
		if (ParseArgs.hasIgnoreCaseOption(args, "-enableIPv6"))
		{
			if (dnsCache == null)
				dnsCache = new DNSCache();
			dnsCache.setEnableIPv6(true);
			String networkInterfaceName = ParseArgs.getString(args, "-enableIPv6");
			if(null != networkInterfaceName && !networkInterfaceName.startsWith("-"))
				dnsCache.setNetworkInterfaceName(networkInterfaceName);
		}
		
		// enable IPv6 and V4 
		if (ParseArgs.hasIgnoreCaseOption(args, "-enableIPv6v4"))
		{
			if (dnsCache == null)
				dnsCache = new DNSCache();
			dnsCache.setEnableIPv6v4(true);
			String networkInterfaceName = ParseArgs.getString(args, "-enableIPv6v4");
			if(null != networkInterfaceName && !networkInterfaceName.startsWith("-"))
				dnsCache.setNetworkInterfaceName(networkInterfaceName);
		}
		
		if (dnsCache != null)
		{
			// update performance data with DNS settings
			performanceData.addDNSCacheStatistic(dnsCache.getCacheStatistic());
			performanceData.addTestDescription("*** Warning: OS-independent DNS access enabled. " + dnsCache.getConfigInfoText() + " ***");
			if (dnsPerLoop)
				performanceData.addTestDescription("*** Warning: DNS option -dnsperloop enabled ***");
			
			// log DNS settings
			System.out.println("# OS-independent DNS access enabled. " + dnsCache.getConfigInfoText());
			if (dnsPerLoop)
				System.out.println("# DNS option -dnsperloop enabled");
		}
		
		// calculate sampling offset and virtual user startup offset for cluster jobs (time shift per cluster member)
		int samplingTimeshift = 0;	// value in seconds
		if (!ParseArgs.hasOption(args, "-nosdelayCluster"))
		{
			if ((getClusterTotalMemberCount() > 1) && (getClusterMemberLocalId() > 0))
			{
				samplingTimeshift = Math.round(((float) samplingInterval / (float) getClusterTotalMemberCount()) * (float) getClusterMemberLocalId());
				System.out.println("# samplingTimeshift = " + samplingTimeshift + " seconds");
				
				long startupDelayOffset = (plannedStartupDelay / ((long) getClusterTotalMemberCount())) * ((long) getClusterMemberLocalId());
				System.out.println("# startupDelayTimeshift = " + startupDelayOffset + " milliseconds");
				System.out.println();
				if (startupDelayOffset > 0)
				{
					try { sleepRemoteInterruptable(startupDelayOffset); } catch (InterruptedException ie) {}
				}
			}
		}
		
		
		// Add user defined data point sequences to performance data
		// -----------------------
		initializeDataCollectionSequences();
		
		
		// update performance data
		// -----------------------
		testDurationStart = System.currentTimeMillis();
		performanceData.setStartDate();
		performanceData.addSnapshot(getCpuUsagePercent());
		performanceData.setSnapshotsTimeshift(samplingTimeshift);
		performanceData.setEndDate();
		if(browserCacheStatistic != null)
		{
			performanceData.setBrowserCacheStatistic(browserCacheStatistic);
		}
		
		// initialize global context for plug-ins  
		LoadtestPluginContext globalPluginContext = new LoadtestPluginContext(prxVersion, prxCharEncoding, new PropertyAddressSearch());
		
		
		// --------------------------
		// *** start of load test ***
		// ---------------------------
		
		
		// special case for execution plans - start test with zero virtual users
		// ---------------------------------------------------------------------
		if (hasExecutionPlan())
		{
			if (concurrentUsers != 0)
			{
				System.out.println("*** Fatal Error: Load test with execution plan must start with zero number of virtual users - Load test program aborted ***");
				System.exit(1);
			}
			try
			{
				getUserContextTable().getWriteLock().lock();
				
				PropertyAddressSearch simulatedUser = new PropertyAddressSearch(maxPlannedLoops, plannedRequestTimeout, getUserContextTable().getUserContextList().size());
				
				HttpLoadTestUserContext userContext = new HttpLoadTestUserContext(simulatedUser, null);
				userContext.setLoadTestUserExecutionPlanPlaceholder();
				getUserContextTable().getUserContextList().add(userContext);
				simulatedUser.setOwnLoadTestUserContext(userContext);
			}
			finally
			{
				getUserContextTable().getWriteLock().unlock();
			}
		}
		
		
		// start virtual users as threads (normal case)
		// --------------------------------------------
		usersToBeIncreasedAtStartupOffset.set(concurrentUsers);
		for (int x = 0; x < concurrentUsers; x++)
		{
			if (cancelIncrementDecrementUser || cancelInitialIncrementUser)
			{
				usersToBeIncreasedAtStartupOffset.set(0);
				break;
			}
			
			// start load test thread
			// ----------------------
			Thread t = null;
			try
			{
				getUserContextTable().getWriteLock().lock();
				
				PropertyAddressSearch simulatedUser = new PropertyAddressSearch(maxPlannedLoops, plannedRequestTimeout, getUserContextTable().getUserContextList().size());
				t = new Thread(simulatedUser);
				String threadName = "" + getUserContextTable().getUserContextList().size();
				threadName = THREAD_NAME.substring(0, 7 - threadName.length()) + threadName;
				t.setName(threadName);
				if (debugLoops && (simulatedUser.getLog().size() > 0))
				{
					synchronized (dumpLock)
					{
						simulatedUser.dumpLog(threadName + " ", System.out);		// dump log of constructor
					}
				}
				HttpLoadTestUserContext userContext = new HttpLoadTestUserContext(simulatedUser, t);
				getUserContextTable().getUserContextList().add(userContext);
				simulatedUser.setOwnLoadTestUserContext(userContext);
			}
			finally
			{
				getUserContextTable().getWriteLock().unlock();
			}
			t.start();
			usersToBeIncreasedAtStartupOffset.decrementAndGet();
			System.out.println("# --- thread " + t.getName() + " created --- " + ZoneTime.dateToShortString() + " ---");
			
			while (isSuspend())
			{
				try { Thread.currentThread().sleep(100); } catch (InterruptedException ie) { break; }
				if (abortedByRemote() || abortedByEofInputFile() || abortedByUniqueNumberVar())
					break;
				
				// check if max test duration reached during suspend
				if ((plannedTestDuration > 0) && (((System.currentTimeMillis() - testDurationStart) / 1000) >= plannedTestDuration))
					break;
				
				// display and sample temporary performance data all "sampling interval" seconds - also during suspend
				if (((System.currentTimeMillis() - performanceData.getLastSnapshotTime()) / 1000) >= samplingInterval)
				{
					performanceData.addSnapshot(getCpuUsagePercent());
					performanceData.setEndDate();
				}
			}
			
			if (abortedByRemote() || abortedByEofInputFile() || abortedByUniqueNumberVar())
				break;
			
			if ((plannedTestDuration > 0) && (((System.currentTimeMillis() - testDurationStart) / 1000) >= plannedTestDuration))
				break;
			
			// startup delay for next thread
			// -----------------------------
			try
			{
				if (!singleUserMode)   // create concurrent users
				{
					if (plannedStartupDelay <= 3000)
						sleepRemoteInterruptable(plannedStartupDelay);
					else
					{
						long startupDelayStartTime = System.currentTimeMillis();
						while (true)
						{
							if (abortedByRemote() || abortedByEofInputFile() || abortedByUniqueNumberVar())
								break;
							if ((System.currentTimeMillis() - startupDelayStartTime) >= plannedStartupDelay)
								break;
							
							Thread.currentThread().sleep(100);
							
							// display and sample temporary performance data all "sampling interval" seconds
							if (((System.currentTimeMillis() - performanceData.getLastSnapshotTime()) / 1000) >= samplingInterval)
							{
								performanceData.addSnapshot(getCpuUsagePercent());
								performanceData.setEndDate();
							}
						}
						while (isSuspend())
						{
							try { Thread.currentThread().sleep(100); } catch (InterruptedException ie) { break; }
							if (abortedByRemote() || abortedByEofInputFile() || abortedByUniqueNumberVar())
								break;
							
							// check if max test duration reached during suspend
							if ((plannedTestDuration > 0) && (((System.currentTimeMillis() - testDurationStart) / 1000) >= plannedTestDuration))
								break;
							
							// display and sample temporary performance data all "sampling interval" seconds - also during suspend
							if (((System.currentTimeMillis() - performanceData.getLastSnapshotTime()) / 1000) >= samplingInterval)
							{
								performanceData.addSnapshot(getCpuUsagePercent());
								performanceData.setEndDate();
							}
						}
						
					}
				}
				else
					t.join();   // single user mode
			}
			catch (InterruptedException ie) { break; }
			if (abortedByRemote() || abortedByEofInputFile() || abortedByUniqueNumberVar())
				break;
			
			
			// display and sample temporary performance data all "sampling interval" seconds
			if (((System.currentTimeMillis() - performanceData.getLastSnapshotTime()) / 1000) >= samplingInterval)
			{
				performanceData.addSnapshot(getCpuUsagePercent());
				performanceData.setEndDate();
				if (!isRemote())
				{
					synchronized (dumpLock)
					{
						performanceData.dump(false);
					}
				}
			}
		}
		usersToBeIncreasedAtStartupOffset.set(0);	// just in case that a thread is not started for any reason
		
		
		// wait for test-end in a loop
		// ---------------------------
		boolean allDone = false;
		while (!allDone)
		{
			// test aborted ?
			if (abortedByRemote() || abortedByEofInputFile() || abortedByUniqueNumberVar())
			{
				nearRemoteEnd();
				String abort = "";
				if (abortedByRemote())
					abort = "*** test aborted by remote command ***";
				if (abortedByEofInputFile())
				{
					abort = "*** test aborted at eof of input file ***";
					performanceData.addTestDescription(abort);
				}
				if (abortedByUniqueNumberVar())
				{
					abort = "*** test aborted as an unique number is out of values ***";
					performanceData.addTestDescription(abort);
				}
				synchronized (dumpLock)
				{
					addSSLCacheStatistic();
					performanceData.addSnapshot(getCpuUsagePercent());
					performanceData.setEndDate();
					
					if (!isRemote())
						performanceData.dump(false);
					if (resultFile != null)
						try { performanceData.writeObjectToFile(getSymmetricEncryptContext(), resultFile); } catch (IOException ie) { ie.printStackTrace(); }
					
					if(replayMode)
					{
						saveReplaySnapShots("ZTReplay.snapshot");
					}
					
					saveATSTablesData();
					System.out.println();
					System.out.println(abort);
					System.out.println();
					System.out.flush();
					try { Thread.currentThread().sleep(10000); } catch (InterruptedException ie) {}
					System.exit(0);
				}
			}
			
			// display and sample temporary performance data all "sampling interval" seconds
			if (((System.currentTimeMillis() - performanceData.getLastSnapshotTime()) / 1000) >= samplingInterval)
			{
				performanceData.addSnapshot(getCpuUsagePercent());
				performanceData.setEndDate();
				if (!isRemote())
				{
					synchronized (dumpLock)
					{
						performanceData.dump(false);
					}
				}
			}
			
			// check if test has been done in case of decrement users to zero
			if ((decrementUser) && (plannedTestDuration > 0) && (((System.currentTimeMillis() - testDurationStart) / 1000) >= plannedTestDuration))
				decrementUser = false;
			// check if test has been done
			if (!hasExecutionPlan())
				allDone = isTestDone();
			else
			{
				if ((plannedTestDuration > 0) && (((System.currentTimeMillis() - testDurationStart) / 1000) >= plannedTestDuration))
				{
					performanceData.addTestDescription("*** Warning: Load test aborted. Execution plan time limit exceeded after " + plannedTestDuration + " seconds ***");
					triggerAbort();
				}
			}
			
			// if not all is done: sleep one second
			if (!allDone)
				try { sleepRemoteInterruptable(1000); } catch (InterruptedException ie) { break; }
		} // end of wait loop
		
		
		// mark near end of test - only if a remote interface has been used
		nearRemoteEnd();
		
		
		
		// final test result - test completed
		// ----------------------------------
		performanceData.addSnapshot(getCpuUsagePercent());
		performanceData.setEndDate();
		if(replayMode)
		{
			saveReplaySnapShots("ZTReplay.snapshot");
		}
		saveATSTablesData();
		
		// save test result
		performanceData.dump(true);
		if (resultFile != null)
			try { performanceData.writeObjectToFile(getSymmetricEncryptContext(), resultFile); } catch (IOException ie) { ie.printStackTrace(); }
		
		// all done
		System.out.flush();
		
		// wait for official end of test - only if a remote interface has been used
		waitRemoteEnd();
		
		System.out.println();
		System.out.println("Result File: " + resultFile);
		
		// now dead
		System.exit(0);
	}


	/**
	 * implement VaryingLoadInterface: support to increment the number of simulated users at runtime.
	 */
	public void setIncrementUser(long startTime)
	{
		incrementUserStartTime = startTime;
		incrementUserFlag = true;
	}

	public boolean isIncrementUser()
	{
		return incrementUserFlag;
	}

	public long getIncrementUserStartTime()
	{
		return incrementUserStartTime;
	}

	public void setIncrementUserStartTime(long startTime)
	{
		incrementUserStartTime = startTime;
	}

	public void clearIncrementUser()
	{
		incrementUserFlag = false;
	}

	public int incrementUsers(int numAddUsers, long startupDelay)
	{
		if (startupDelay < 0)
			startupDelay = plannedStartupDelay;
		return incrementUsersImplementation(numAddUsers, startupDelay, this);
	}

	static int incrementUsersImplementation(int numAddUsers, long startupDelay, HttpLoadTest httpLoadTest)
	{
		long startupDelayOffset = 0;
		if ((getClusterTotalMemberCount() > 1) && (getClusterMemberLocalId() > 0))
			startupDelayOffset = (startupDelay / ((long) getClusterTotalMemberCount())) * ((long) getClusterMemberLocalId());
		
		ArrayList<HttpLoadTestUserContext> addUserContextList = new ArrayList<HttpLoadTestUserContext>(numAddUsers);
		for (int x = 0; x < numAddUsers; x++)
		{
			if (abortedByRemote() || abortedByEofInputFile() || abortedByUniqueNumberVar())
				return x;
			
			// initialize load test thread
			// ---------------------------
			try
			{
				getUserContextTable().getWriteLock().lock();
				
				PropertyAddressSearch simulatedUser = new PropertyAddressSearch(maxPlannedLoops, plannedRequestTimeout, getUserContextTable().getUserContextList().size());
				HttpLoadTestUserContext userContext = prepareIncrementUser(simulatedUser, System.currentTimeMillis() + startupDelayOffset + (x * startupDelay));
				addUserContextList.add(userContext);
				simulatedUser.setOwnLoadTestUserContext(userContext);
				if (debugLoops && (simulatedUser.getLog().size() > 0))
				{
					synchronized (dumpLock)
					{
						simulatedUser.dumpLog(userContext.getLoadTestThread().getName() + " ", System.out);		// dump log of constructor
					}
				}
			}
			finally
			{
				getUserContextTable().getWriteLock().unlock();
			}
		}
		
		// start load test threads by a thread
		// -----------------------------------
		HttpLoadTestIncrementUserThread incrementUserThread = new HttpLoadTestIncrementUserThread(httpLoadTest, addUserContextList);
		incrementUserThread.start();
		return numAddUsers;
	}


	/**
	 * Internal method used to load and apply next proxy settings from ZBAProxySettings.properties file.
	 * Settings are applied only if file exists and nextProxyIsActive is set to true in the file.
	 * Note that settings stored with the session, will be ineffective.
	 *
	 * @since V5.5-D
	 */
	private void applyNextProxySettingsFromFileIfExists()
	{
		
		String filename = "ZBAProxySettings.properties";
		BufferedReader bin = null;
		SymmetricEncryptContext decryptContext = getSymmetricEncryptContext();
		File file = new File(filename);
		
		if (file.exists())
		// open input file
		try
		{
			if (decryptContext == null)
			{
				bin = new BufferedReader(new InputStreamReader(new FileInputStream(filename), Charset.forName("UTF-8")));
			}
			else
			{
				// create a reader stream that decrypts the data on the fly
				bin = new BufferedReader(new InputStreamReader(SymmetricEncrypt.getCipherInputStream(new FileInputStream(filename), decryptContext), Charset.forName("UTF-8")));
			}
			
			if (bin != null)
			{
				Properties nextProxyConfigProperties = new Properties();
				nextProxyConfigProperties.load(bin);
				NextProxyConfig nextProxyConfig = new NextProxyConfig();
				nextProxyConfig.setActive(Boolean.valueOf(nextProxyConfigProperties.getProperty("nextProxyIsActive")));
				proxyEnabled = nextProxyConfig.isActive();                             // if false: do not use a proxy server
				
				if (proxyEnabled)
				{
					nextProxyConfig.disableHttpProxyCache(Boolean.valueOf(nextProxyConfigProperties.getProperty("nextProxyHttpCacheDisabled")));
					proxyCacheDisabled = nextProxyConfig.isDisabledHttpProxyCache();
					nextProxyConfig.setHttpHost(nextProxyConfigProperties.getProperty("nextProxyHttpHost"));
					proxyHttpHost = nextProxyConfig.getHttpHost();
					nextProxyConfig.setHttpPort(Integer.valueOf(nextProxyConfigProperties.getProperty("nextProxyHttpPort")));
					proxyHttpPort = nextProxyConfig.getHttpPort();
					nextProxyConfig.setHttpsHost(nextProxyConfigProperties.getProperty("nextProxyHttpsHost"));
					proxyHttpsHost = nextProxyConfig.getHttpsHost();
					nextProxyConfig.setHttpsPort(Integer.valueOf(nextProxyConfigProperties.getProperty("nextProxyHttpsPort")));
					proxyHttpsPort = nextProxyConfig.getHttpsPort();
					nextProxyConfig.setAuthUsername(nextProxyConfigProperties.getProperty("nextProxyAuthUsername"));
					nextProxyConfig.setAuthPassword(nextProxyConfigProperties.getProperty("nextProxyAuthPassword"));
					nextProxyConfig.setNoNextProxy(nextProxyConfigProperties.getProperty("noNextProxy"));
					noProxyFor = nextProxyConfig.getNoNextProxy();
					
					String proxyAuth = "";
					
					if (nextProxyConfig.getAuthUsername() != null)
					{
						proxyAuth = nextProxyConfig.getAuthUsername() + ":";
						if (nextProxyConfig.getAuthPassword() != null)
							proxyAuth = proxyAuth + nextProxyConfig.getAuthPassword();
					}
					
					String  proxyAuthorization = null;
					
					if (proxyAuth.length() > 1)
						proxyAuthorization = Base64Encoder.encode(proxyAuth);		// Base 64 encoded - used for basic authentication only
					
					commonNextProxyConfig = new NextProxyConfig(proxyEnabled, proxyCacheDisabled, proxyHttpHost, proxyHttpPort, proxyHttpsHost, proxyHttpsPort, proxyAuthorization, noProxyFor);
					
					log("*** Warning: Applying proxy configuration from file " + filename + " ***");
				}
				
			}
		}
		catch (Throwable tr)
		{
			log("*** Unable to load proxy configuration from properties file " + filename + " ***");
			tr.printStackTrace();
		}
		finally
		{
			if (bin != null)
			{
				try { bin.close(); } catch (Exception e) {}
			}
		}
		
	}
		
	/**
	 * Internal method used to initialize all data collection sequences for user defined data points.
	 * @since V6.0-A
	 */
	private static void initializeDataCollectionSequences()
	{
		int newSequenceId = performanceData.getDataCollectionSet().getNewSequenceId();
		
		
	}
		

}	// end of class

