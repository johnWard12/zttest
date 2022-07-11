
// *********************************************************************************************
//
// Automatically Generated Load Test Program
// -----------------------------------------
//
// Source: D1PRDLogin_v03_061522.java
// Date  : 20 Jun 2022 20:59:28 ECT
// Author: Apica ZebraTester V7.0-B / automatically generated
//
// Procedure Copyright by Apica
// All Rights Reserved
//
// https://www.apica.io                                         http://www.zebratester.com
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
public class D1PRDLogin_v03_061522 extends HttpLoadTest implements Runnable, ThreadStepInterface, SetThreadStepInterface, SSLSessionCacheStatisticInterface, VaryingLoadInterface, VaryingTestDurationInterface, SuspendResumeInterface, GetRealTimeUserInputFieldsInterface
{
	public static final String prxVersion = "V7.0-B";
	public static final int    prxCharEncoding = 3;                         // 1 = OS Default, 2 = ISO-8859-1, 3 = UTF-8
	public static final String testDescription = "";

	public static String USER_AGENT_1 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:101.0) Gecko/20100101 Firefox/101.0";

	private static final boolean CONTAINS_PARALLEL_EXECUTED_URLS = true;
	private static final int MAX_PARALLEL_THREADS_PER_USER = 6;                       // default value for max. parallel executed URLs per user
	private static int maxParallelThreadsPerUser = MAX_PARALLEL_THREADS_PER_USER;     // configured value for max. parallel executed URLs per user

	private static final boolean CONTAINS_EXTERNAL_RESOURCES = false;       // note: external resources are typically additional Java library files (*.jar files) invoked by self-developed plug-ins. Consider that Input Files and the Main Class of Plug-Ins are NOT external resources in this context because ZebraTester knows already their declarations.

	public static final String USER_INPUT_FIELD_vThinkTime = "AQAKdlRoaW5rVGltZQEACnRoaW5rIHRpbWUBAAEz";		// internal object-string representation of user input field 'vThinkTime'

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
	private static final String EXTERNAL_PARAM_FILE = "D1PRDLogin_v03_061522ExtParams.dat"; // input file name for very large parameter values
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
	private Map<String,HttpTestURLThreadHandler> httpTestURLThreadHandlerMap = new HashMap<>();
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
	
	private static String vThinkTime = null;                                     // var declaration from web admin var handler: scope = global

	private volatile UserTransactionRuntimeHandler transactionHandler = new UserTransactionRuntimeHandler();		// re-used, support to manage user-defined transactions
	private Map<String,String> transactionContextMap = new HashMap<>();		// used to correctly measure the user-defined transactions

	private Map<String,String> loopVarMap = new HashMap<>();		// used for loop variables
	private String wm_xsrf_token = null;                 // var declaration from web admin var handler: scope = per loop
	
	/**
	 * constructor: called from load test plug-ins (scope = global).
	 */
	public D1PRDLogin_v03_061522()
	{
		super();
	}


	/**
	 * constructor: called when a user is created (per user).
	 */
	public D1PRDLogin_v03_061522(int maxLoops, int requestTimeout, int threadNumber)
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
		
		// initialize context for plug-ins which are executed per loop
		LoadtestPluginContext loopPluginContext = new LoadtestPluginContext(prxVersion, prxCharEncoding, this, threadNumber, socketPool, cookieHandler);
		
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
		if(isNonModularMode())
			wm_xsrf_token = null;
		log();
		log("<<< wm_xsrf_token = " + wm_xsrf_token);
			loopVarMap.put("wm_xsrf_token", wm_xsrf_token);
		log("<<< vThinkTime = " + vThinkTime);
		



		// --- VIRTUAL PAGE #0 ---
		if (!executePage_0(totalLoopCounter, loopPluginContext, new InnerLoopContext(), 0,0, httpLogVectorObject))
			return false;



		// --- PAGE BREAK: Test [0] ---
		log();
		log();
		log("# Page #1: Home Page");
		log("# ------------------");
		threadStep = setPageBreak(performanceData, threadStep, "Page #1: Home Page", 0, 0, -1);		// hint: param #4 is the user's think time in milliseconds, param #5 is randomness of the user's think time in percent (+/- 0..100%), param #6 is the maximum acceptable response time in milliseconds (-1 = not configured)
		pageThreadHandler = new HttpTestURLThreadHandler(threadStep - 1, maxParallelThreadsPerUser, performanceData, this);   // support for parallel processing of http(s) requests within a page. hint: param #2 is the number of parallel threads per user
		log();

		if (!executePage_1(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 1 failed
			synchResponsesParallelRequestsPage_1(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			if(replayMode)
			{
				dumpLog(System.out);
				clearLog();
			}
			return false;
		}
		if (!executePage_1_1(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 1 failed
			synchResponsesParallelRequestsPage_1(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			if(replayMode)
			{
				dumpLog(System.out);
				clearLog();
			}
			return false;
		}
		if (!executePage_1_2(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 1 failed
			synchResponsesParallelRequestsPage_1(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			if(replayMode)
			{
				dumpLog(System.out);
				clearLog();
			}
			return false;
		}
		if (!executePage_1_3(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 1 failed
			synchResponsesParallelRequestsPage_1(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			if(replayMode)
			{
				dumpLog(System.out);
				clearLog();
			}
			return false;
		}
		if (!synchResponsesParallelRequestsPage_1(totalLoopCounter, loopPluginContext, null, httpLogVectorObject))
		{
			return false;		// execution of page 1 failed
		}
		
		// page 1 successfully executed
		pageThreadHandler.addPageResponseTimeToResult(this);
		httpTestURLThreadHandlerMap.put("1", pageThreadHandler);
		if(replayMode)
		{
			dumpLog(System.out);
			clearLog();
		}



		// --- PAGE BREAK: Test [68] ---
		log();
		log();
		log("# Page #2: Login");
		log("# --------------");
		threadStep = setPageBreak(performanceData, threadStep, "Page #2: Login", Long.valueOf(vThinkTime).longValue() * 1000, 0, -1);		// hint: param #4 is the user's think time in milliseconds, param #5 is randomness of the user's think time in percent (+/- 0..100%), param #6 is the maximum acceptable response time in milliseconds (-1 = not configured)
		pageThreadHandler = new HttpTestURLThreadHandler(threadStep - 1, maxParallelThreadsPerUser, performanceData, this);   // support for parallel processing of http(s) requests within a page. hint: param #2 is the number of parallel threads per user
		log();

		if (!executePage_2(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 2 failed
			synchResponsesParallelRequestsPage_2(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			if(replayMode)
			{
				dumpLog(System.out);
				clearLog();
			}
			return false;
		}
		if (!executePage_2_1(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 2 failed
			synchResponsesParallelRequestsPage_2(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			if(replayMode)
			{
				dumpLog(System.out);
				clearLog();
			}
			return false;
		}
		if (!executePage_2_2(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 2 failed
			synchResponsesParallelRequestsPage_2(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			if(replayMode)
			{
				dumpLog(System.out);
				clearLog();
			}
			return false;
		}
		if (!executePage_2_3(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 2 failed
			synchResponsesParallelRequestsPage_2(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			if(replayMode)
			{
				dumpLog(System.out);
				clearLog();
			}
			return false;
		}
		if (!executePage_2_4(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 2 failed
			synchResponsesParallelRequestsPage_2(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			if(replayMode)
			{
				dumpLog(System.out);
				clearLog();
			}
			return false;
		}
		if (!executePage_2_5(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 2 failed
			synchResponsesParallelRequestsPage_2(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			if(replayMode)
			{
				dumpLog(System.out);
				clearLog();
			}
			return false;
		}
		if (!executePage_2_6(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 2 failed
			synchResponsesParallelRequestsPage_2(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			if(replayMode)
			{
				dumpLog(System.out);
				clearLog();
			}
			return false;
		}
		if (!synchResponsesParallelRequestsPage_2(totalLoopCounter, loopPluginContext, null, httpLogVectorObject))
		{
			return false;		// execution of page 2 failed
		}
		
		// page 2 successfully executed
		pageThreadHandler.addPageResponseTimeToResult(this);
		httpTestURLThreadHandlerMap.put("2", pageThreadHandler);
		if(replayMode)
		{
			dumpLog(System.out);
			clearLog();
		}



		// --- PAGE BREAK: Test [200] ---
		log();
		log();
		log("# Page #3: Close Key Features Popup");
		log("# ---------------------------------");
		threadStep = setPageBreak(performanceData, threadStep, "Page #3: Close Key Features Popup", Long.valueOf(vThinkTime).longValue() * 1000, 0, -1);		// hint: param #4 is the user's think time in milliseconds, param #5 is randomness of the user's think time in percent (+/- 0..100%), param #6 is the maximum acceptable response time in milliseconds (-1 = not configured)
		pageThreadHandler = new HttpTestURLThreadHandler(threadStep - 1, maxParallelThreadsPerUser, performanceData, this);   // support for parallel processing of http(s) requests within a page. hint: param #2 is the number of parallel threads per user
		log();

		if (!executePage_3(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 3 failed
			synchResponsesParallelRequestsPage_3(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			if(replayMode)
			{
				dumpLog(System.out);
				clearLog();
			}
			return false;
		}
		if (!synchResponsesParallelRequestsPage_3(totalLoopCounter, loopPluginContext, null, httpLogVectorObject))
		{
			return false;		// execution of page 3 failed
		}
		
		// page 3 successfully executed
		pageThreadHandler.addPageResponseTimeToResult(this);
		httpTestURLThreadHandlerMap.put("3", pageThreadHandler);
		if(replayMode)
		{
			dumpLog(System.out);
			clearLog();
		}



		// --- PAGE BREAK: Test [204] ---
		log();
		log();
		log("# Page #4: Logout");
		log("# ---------------");
		threadStep = setPageBreak(performanceData, threadStep, "Page #4: Logout", Long.valueOf(vThinkTime).longValue() * 1000, 0, -1);		// hint: param #4 is the user's think time in milliseconds, param #5 is randomness of the user's think time in percent (+/- 0..100%), param #6 is the maximum acceptable response time in milliseconds (-1 = not configured)
		pageThreadHandler = new HttpTestURLThreadHandler(threadStep - 1, maxParallelThreadsPerUser, performanceData, this);   // support for parallel processing of http(s) requests within a page. hint: param #2 is the number of parallel threads per user
		log();

		if (!executePage_4(totalLoopCounter, loopPluginContext, new InnerLoopContext(),0,0, httpLogVectorObject))
		{
			// execution of page 4 failed
			synchResponsesParallelRequestsPage_4(totalLoopCounter, loopPluginContext, new InnerLoopContext(), httpLogVectorObject);
			if(replayMode)
			{
				dumpLog(System.out);
				clearLog();
			}
			return false;
		}
		if (!synchResponsesParallelRequestsPage_4(totalLoopCounter, loopPluginContext, null, httpLogVectorObject))
		{
			return false;		// execution of page 4 failed
		}
		
		// page 4 successfully executed
		pageThreadHandler.addPageResponseTimeToResult(this);
		httpTestURLThreadHandlerMap.put("4", pageThreadHandler);
		if(replayMode)
		{
			dumpLog(System.out);
			clearLog();
		}
		
		
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
		// # Page #1: Home Page
		// # ------------------



		// --- HTTP REQUEST: Test [1] <- WEB ADMIN Index 1 ---
		String requestProt0001 = "https";
		String requestHost0001 = "consumer.fis.boh.com";
		int    requestPort0001 = 443;
		String requestFile0001 = "/D1BOHConsumer/";
		String requestHeader0001 = "GET " + requestFile0001 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Upgrade-Insecure-Requests: 1\r\n" + 
				"Sec-Fetch-Dest: document\r\n" + 
				"Sec-Fetch-Mode: navigate\r\n" + 
				"Sec-Fetch-Site: none\r\n" + 
				"Sec-Fetch-User: ?1\r\n" + 
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

		// verify response: status code = 200, content type = "TEXT/HTML", header text fragment = [verification disabled], recorded content size = 1871
		// content test algorithm: search text
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/HTML", null, "LCDDigitalOneConsumer");		// Test [1] <- Index 1
		if(replayMode)
		{
			long proxyDataRecordId =1655106331113L;
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
		String requestHost0002 = "consumer.fis.boh.com";
		int    requestPort0002 = 443;
		String requestFile0002 = "/D1BOHConsumer/yodlee.initialize.js";
		String requestHeader0002 = "GET " + requestFile0002 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0002, requestHost0002, requestPort0002, requestHeader0002, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0002 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [3] <- WEB ADMIN Index 4 ---
		String requestProt0003 = "https";
		String requestHost0003 = "consumer.fis.boh.com";
		int    requestPort0003 = 443;
		String requestFile0003 = "/D1BOHConsumer/mxcardsdk_v2.2.50.js";
		String requestHeader0003 = "GET " + requestFile0003 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0003, requestHost0003, requestPort0003, requestHeader0003, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0003 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [4] <- WEB ADMIN Index 6 ---
		String requestProt0004 = "https";
		String requestHost0004 = "consumer.fis.boh.com";
		int    requestPort0004 = 443;
		String requestFile0004 = "/D1BOHConsumer/core.js";
		String requestHeader0004 = "GET " + requestFile0004 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0004, requestHost0004, requestPort0004, requestHeader0004, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0004 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [5] <- WEB ADMIN Index 7 ---
		String requestProt0005 = "https";
		String requestHost0005 = "consumer.fis.boh.com";
		int    requestPort0005 = 443;
		String requestFile0005 = "/D1BOHConsumer/d1-analytics.js";
		String requestHeader0005 = "GET " + requestFile0005 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0005, requestHost0005, requestPort0005, requestHeader0005, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0005 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [6] <- WEB ADMIN Index 8 ---
		String requestProt0006 = "https";
		String requestHost0006 = "consumer.fis.boh.com";
		int    requestPort0006 = 443;
		String requestFile0006 = "/D1BOHConsumer/d1-sessiontimeout.js";
		String requestHeader0006 = "GET " + requestFile0006 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0006, requestHost0006, requestPort0006, requestHeader0006, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0006 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [7] <- WEB ADMIN Index 9 ---
		String requestProt0007 = "https";
		String requestHost0007 = "consumer.fis.boh.com";
		int    requestPort0007 = 443;
		String requestFile0007 = "/D1BOHConsumer/d1-app.js";
		String requestHeader0007 = "GET " + requestFile0007 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0007, requestHost0007, requestPort0007, requestHeader0007, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0007 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [8] <- WEB ADMIN Index 10 ---
		String requestProt0008 = "https";
		String requestHost0008 = "consumer.fis.boh.com";
		int    requestPort0008 = 443;
		String requestFile0008 = "/D1BOHConsumer/sha256.js";
		String requestHeader0008 = "GET " + requestFile0008 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0008, requestHost0008, requestPort0008, requestHeader0008, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0008 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [9] <- WEB ADMIN Index 12 ---
		String requestProt0009 = "https";
		String requestHost0009 = "consumer.fis.boh.com";
		int    requestPort0009 = 443;
		String requestFile0009 = "/D1BOHConsumer/mxcardsdk_v2.2.50.6c73ad286b2e896cacbb.css";
		String requestHeader0009 = "GET " + requestFile0009 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0009, requestHost0009, requestPort0009, requestHeader0009, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0009 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [10] <- WEB ADMIN Index 14 ---
		String requestProt0010 = "https";
		String requestHost0010 = "consumer.fis.boh.com";
		int    requestPort0010 = 443;
		String requestFile0010 = "/D1BOHConsumer/ng-bundle/styles.9ae08cb7c5bba59957bc.css";
		String requestHeader0010 = "GET " + requestFile0010 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0010, requestHost0010, requestPort0010, requestHeader0010, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0010 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [11] <- WEB ADMIN Index 15 ---
		String requestProt0011 = "https";
		String requestHost0011 = "consumer.fis.boh.com";
		int    requestPort0011 = 443;
		String requestFile0011 = "/D1BOHConsumer/services/application/wmProperties.js";
		String requestHeader0011 = "GET " + requestFile0011 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0011, requestHost0011, requestPort0011, requestHeader0011, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0011 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [12] <- WEB ADMIN Index 16 ---
		String requestProt0012 = "https";
		String requestHost0012 = "consumer.fis.boh.com";
		int    requestPort0012 = 443;
		String requestFile0012 = "/D1BOHConsumer/ng-bundle/runtime-es2015.25065f9b4f324472a676.js";
		String requestHeader0012 = "GET " + requestFile0012 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0012, requestHost0012, requestPort0012, requestHeader0012, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0012 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [13] <- WEB ADMIN Index 17 ---
		String requestProt0013 = "https";
		String requestHost0013 = "consumer.fis.boh.com";
		int    requestPort0013 = 443;
		String requestFile0013 = "/D1BOHConsumer/ng-bundle/polyfills-es2015.09485f0dc8eebd2fad23.js";
		String requestHeader0013 = "GET " + requestFile0013 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0013, requestHost0013, requestPort0013, requestHeader0013, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0013 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [14] <- WEB ADMIN Index 18 ---
		String requestProt0014 = "https";
		String requestHost0014 = "consumer.fis.boh.com";
		int    requestPort0014 = 443;
		String requestFile0014 = "/D1BOHConsumer/ng-bundle/scripts.771647b71b52f0c5f538.js";
		String requestHeader0014 = "GET " + requestFile0014 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0014, requestHost0014, requestPort0014, requestHeader0014, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0014 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [15] <- WEB ADMIN Index 19 ---
		String requestProt0015 = "https";
		String requestHost0015 = "consumer.fis.boh.com";
		int    requestPort0015 = 443;
		String requestFile0015 = "/D1BOHConsumer/ng-bundle/main-es2015.7ec116c79f5fc630f507.js";
		String requestHeader0015 = "GET " + requestFile0015 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0015, requestHost0015, requestPort0015, requestHeader0015, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0015 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [16] <- WEB ADMIN Index 20 ---
		String requestProt0016 = "https";
		String requestHost0016 = "consumer.fis.boh.com";
		int    requestPort0016 = 443;
		String requestFile0016 = "/D1BOHConsumer/ng-bundle/wm-styles.de8aceeeeee4b2e91a4a5f89e97be21b.css";
		String requestHeader0016 = "GET " + requestFile0016 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0016, requestHost0016, requestPort0016, requestHeader0016, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0016 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [17] <- WEB ADMIN Index 21 ---
		String requestProt0017 = "https";
		String requestHost0017 = "consumer.fis.boh.com";
		int    requestPort0017 = 443;
		String requestFile0017 = "/D1BOHConsumer/ng-bundle/UntitledSansWeb-Regular.b18586afdcd0d2a698ba.woff";
		String requestHeader0017 = "GET " + requestFile0017 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: identity\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/ng-bundle/wm-styles.de8aceeeeee4b2e91a4a5f89e97be21b.css\r\n" + 
				"Sec-Fetch-Dest: font\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0017, requestHost0017, requestPort0017, requestHeader0017, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0017 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [18] <- WEB ADMIN Index 22 ---
		String requestProt0018 = "https";
		String requestHost0018 = "consumer.fis.boh.com";
		int    requestPort0018 = 443;
		String requestFile0018 = "/D1BOHConsumer/favicon.png";
		String requestHeader0018 = "GET " + requestFile0018 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: image/avif,image/webp,*/*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: image\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0018, requestHost0018, requestPort0018, requestHeader0018, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0018 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [19] <- WEB ADMIN Index 23 ---
		String requestProt0019 = "https";
		String requestHost0019 = "consumer.fis.boh.com";
		int    requestPort0019 = 443;
		String requestFile0019 = "/D1BOHConsumer/resources/i18n/en.json";
		String requestHeader0019 = "GET " + requestFile0019 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0019, requestHost0019, requestPort0019, requestHeader0019, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0019 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 57844
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [19] <- Index 19
		if(replayMode)
		{
			long proxyDataRecordId =1655106332870L;
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






		// --- HTTP REQUEST: Test [20] <- WEB ADMIN Index 24 ---
		String requestProt0020 = "https";
		String requestHost0020 = "consumer.fis.boh.com";
		int    requestPort0020 = 443;
		String requestFile0020 = "/D1BOHConsumer/services/security/info";
		String requestHeader0020 = "GET " + requestFile0020 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0020, requestHost0020, requestPort0020, requestHeader0020, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0020 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 290
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [20] <- Index 20
		if(replayMode)
		{
			long proxyDataRecordId =1655106332895L;
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
		// ... continuing page #1 (fragment 2 of 4)
		// ----------------------------------------



		// --- HTTP REQUEST: Test [21] <- WEB ADMIN Index 25 ---
		String requestProt0021 = "https";
		String requestHost0021 = "consumer.fis.boh.com";
		int    requestPort0021 = 443;
		String requestFile0021 = "/D1BOHConsumer/print.css";
		String requestHeader0021 = "GET " + requestFile0021 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0021, requestHost0021, requestPort0021, requestHeader0021, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0021 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [22] <- WEB ADMIN Index 26 ---
		String requestProt0022 = "https";
		String requestHost0022 = "consumer.fis.boh.com";
		int    requestPort0022 = 443;
		String requestFile0022 = "/D1BOHConsumer/services/servicedefs";
		String requestHeader0022 = "GET " + requestFile0022 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0022, requestHost0022, requestPort0022, requestHeader0022, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0022 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 4338
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [22] <- Index 22
		if(replayMode)
		{
			long proxyDataRecordId =1655106332911L;
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






		// --- HTTP REQUEST: Test [23] <- WEB ADMIN Index 27 ---
		String requestProt0023 = "https";
		String requestHost0023 = "consumer.fis.boh.com";
		int    requestPort0023 = 443;
		String requestFile0023 = "/D1BOHConsumer/ng-bundle/fontawesome-webfont.20fd1704ea223900efa9.woff2" +
				"?v=4.7.0";
		String requestHeader0023 = "GET " + requestFile0023 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: identity\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/ng-bundle/styles.9ae08cb7c5bba59957bc.css\r\n" + 
				"Sec-Fetch-Dest: font\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0023, requestHost0023, requestPort0023, requestHeader0023, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0023 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [24] <- WEB ADMIN Index 28 ---
		String requestProt0024 = "https";
		String requestHost0024 = "consumer.fis.boh.com";
		int    requestPort0024 = 443;
		String requestFile0024 = "/D1BOHConsumer/ng-bundle/0-es2015.e3e03ed02d73735de268.js";
		String requestHeader0024 = "GET " + requestFile0024 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0024, requestHost0024, requestPort0024, requestHeader0024, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0024 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [25] <- WEB ADMIN Index 29 ---
		String requestProt0025 = "https";
		String requestHost0025 = "consumer.fis.boh.com";
		int    requestPort0025 = 443;
		String requestFile0025 = "/D1BOHConsumer/ng-bundle/2-es2015.712707c479cdf2a21b2c.js";
		String requestHeader0025 = "GET " + requestFile0025 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0025, requestHost0025, requestPort0025, requestHeader0025, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0025 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [26] <- WEB ADMIN Index 30 ---
		String requestProt0026 = "https";
		String requestHost0026 = "consumer.fis.boh.com";
		int    requestPort0026 = 443;
		String requestFile0026 = "/D1BOHConsumer/ng-bundle/1-es2015.93184f94ec62b020e21e.js";
		String requestHeader0026 = "GET " + requestFile0026 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0026, requestHost0026, requestPort0026, requestHeader0026, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0026 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [27] <- WEB ADMIN Index 31 ---
		String requestProt0027 = "https";
		String requestHost0027 = "consumer.fis.boh.com";
		int    requestPort0027 = 443;
		String requestFile0027 = "/D1BOHConsumer/ng-bundle/6-es2015.a0640126f1de489b5f70.js";
		String requestHeader0027 = "GET " + requestFile0027 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0027, requestHost0027, requestPort0027, requestHeader0027, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0027 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [28] <- WEB ADMIN Index 32 ---
		String requestProt0028 = "https";
		String requestHost0028 = "consumer.fis.boh.com";
		int    requestPort0028 = 443;
		String requestFile0028 = "/D1BOHConsumer/ng-bundle/8-es2015.ec1ad51f80479e005dce.js";
		String requestHeader0028 = "GET " + requestFile0028 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0028, requestHost0028, requestPort0028, requestHeader0028, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0028 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [29] <- WEB ADMIN Index 33 ---
		String requestProt0029 = "https";
		String requestHost0029 = "consumer.fis.boh.com";
		int    requestPort0029 = 443;
		String requestFile0029 = "/D1BOHConsumer/ng-bundle/common-es2015.8ae9f3ff720057c74faa.js";
		String requestHeader0029 = "GET " + requestFile0029 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0029, requestHost0029, requestPort0029, requestHeader0029, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0029 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [30] <- WEB ADMIN Index 34 ---
		String requestProt0030 = "https";
		String requestHost0030 = "consumer.fis.boh.com";
		int    requestPort0030 = 443;
		String requestFile0030 = "/D1BOHConsumer/ng-bundle/82-es2015.78d49ac1b80552cb8272.js";
		String requestHeader0030 = "GET " + requestFile0030 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0030, requestHost0030, requestPort0030, requestHeader0030, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0030 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [31] <- WEB ADMIN Index 35 ---
		String requestProt0031 = "https";
		String requestHost0031 = "consumer.fis.boh.com";
		int    requestPort0031 = 443;
		String requestFile0031 = "/D1BOHConsumer/ng-bundle/path_mapping.json";
		String requestHeader0031 = "GET " + requestFile0031 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0031, requestHost0031, requestPort0031, requestHeader0031, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0031 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 461
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [31] <- Index 31
		if(replayMode)
		{
			long proxyDataRecordId =1655106333442L;
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






		// --- HTTP REQUEST: Test [32] <- WEB ADMIN Index 36 ---
		String requestProt0032 = "https";
		String requestHost0032 = "consumer.fis.boh.com";
		int    requestPort0032 = 443;
		String requestFile0032 = "/D1BOHConsumer/ng-bundle/node_modules-jquery-ui-ui-widgets-droppable.828a58fd5ff3d1d7d5f85c4f00a3d938.js";
		String requestHeader0032 = "GET " + requestFile0032 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0032, requestHost0032, requestPort0032, requestHeader0032, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0032 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [33] <- WEB ADMIN Index 37 ---
		String requestProt0033 = "https";
		String requestHost0033 = "consumer.fis.boh.com";
		int    requestPort0033 = 443;
		String requestFile0033 = "/D1BOHConsumer/ng-bundle/node_modules-jquery-ui-ui-widgets-sortable.19a74bc2f0b0401f4871797985327fb0.js";
		String requestHeader0033 = "GET " + requestFile0033 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0033, requestHost0033, requestPort0033, requestHeader0033, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0033 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [34] <- WEB ADMIN Index 38 ---
		String requestProt0034 = "https";
		String requestHost0034 = "consumer.fis.boh.com";
		int    requestPort0034 = 443;
		String requestFile0034 = "/D1BOHConsumer/ng-bundle/4-es2015.7f85a99769ea8bc300c2.js";
		String requestHeader0034 = "GET " + requestFile0034 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0034, requestHost0034, requestPort0034, requestHeader0034, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0034 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [35] <- WEB ADMIN Index 39 ---
		String requestProt0035 = "https";
		String requestHost0035 = "consumer.fis.boh.com";
		int    requestPort0035 = 443;
		String requestFile0035 = "/D1BOHConsumer/ng-bundle/111-es2015.867fb99c594153b0ff49.js";
		String requestHeader0035 = "GET " + requestFile0035 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0035, requestHost0035, requestPort0035, requestHeader0035, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0035 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [36] <- WEB ADMIN Index 40 ---
		String requestProt0036 = "https";
		String requestHost0036 = "consumer.fis.boh.com";
		int    requestPort0036 = 443;
		String requestFile0036 = "/D1BOHConsumer/ng-bundle/5-es2015.44cb62a572598273eea0.js";
		String requestHeader0036 = "GET " + requestFile0036 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0036, requestHost0036, requestPort0036, requestHeader0036, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0036 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [37] <- WEB ADMIN Index 41 ---
		String requestProt0037 = "https";
		String requestHost0037 = "consumer.fis.boh.com";
		int    requestPort0037 = 443;
		String requestFile0037 = "/D1BOHConsumer/ng-bundle/7-es2015.7e1be741b3cd4a03bbb1.js";
		String requestHeader0037 = "GET " + requestFile0037 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0037, requestHost0037, requestPort0037, requestHeader0037, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0037 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [38] <- WEB ADMIN Index 42 ---
		String requestProt0038 = "https";
		String requestHost0038 = "consumer.fis.boh.com";
		int    requestPort0038 = 443;
		String requestFile0038 = "/D1BOHConsumer/ng-bundle/9-es2015.5eb615b0ae97557f8893.js";
		String requestHeader0038 = "GET " + requestFile0038 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0038, requestHost0038, requestPort0038, requestHeader0038, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0038 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [39] <- WEB ADMIN Index 43 ---
		String requestProt0039 = "https";
		String requestHost0039 = "consumer.fis.boh.com";
		int    requestPort0039 = 443;
		String requestFile0039 = "/D1BOHConsumer/ng-bundle/164-es2015.9c4984b1d6e773c4d38e.js";
		String requestHeader0039 = "GET " + requestFile0039 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0039, requestHost0039, requestPort0039, requestHeader0039, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0039 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [40] <- WEB ADMIN Index 44 ---
		String requestProt0040 = "https";
		String requestHost0040 = "consumer.fis.boh.com";
		int    requestPort0040 = 443;
		String requestFile0040 = "/D1BOHConsumer/services/prefabs/LCD_Offers/servicedefs";
		String requestHeader0040 = "GET " + requestFile0040 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0040, requestHost0040, requestPort0040, requestHeader0040, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0040 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 61
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [40] <- Index 40
		if(replayMode)
		{
			long proxyDataRecordId =1655106334319L;
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
	 * Recorded http requests of page #1_2.
	 *
	 * @return  true:  method successful completed.
	 *          false: method/loop failed.
	 */
	boolean executePage_1_2(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext,int innerLoopCounter, int totalInnerLoopCount, Object httpLogVectorObject) throws Exception
	{
		// ... continuing page #1 (fragment 3 of 4)
		// ----------------------------------------



		// --- HTTP REQUEST: Test [41] <- WEB ADMIN Index 45 ---
		String requestProt0041 = "https";
		String requestHost0041 = "consumer.fis.boh.com";
		int    requestPort0041 = 443;
		String requestFile0041 = "/D1BOHConsumer/ng-bundle/HelveticaNeue.367962c2f532dd9bd769.woff";
		String requestHeader0041 = "GET " + requestFile0041 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: identity\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/ng-bundle/wm-styles.de8aceeeeee4b2e91a4a5f89e97be21b.css\r\n" + 
				"Sec-Fetch-Dest: font\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0041, requestHost0041, requestPort0041, requestHeader0041, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0041 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [42] <- WEB ADMIN Index 46 ---
		String requestProt0042 = "https";
		String requestHost0042 = "consumer.fis.boh.com";
		int    requestPort0042 = 443;
		String requestFile0042 = "/D1BOHConsumer/ng-bundle/Zenmonicons.5bf8d8e1f1e6e440d5e7.woff2";
		String requestHeader0042 = "GET " + requestFile0042 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: identity\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/ng-bundle/wm-styles.de8aceeeeee4b2e91a4a5f89e97be21b.css\r\n" + 
				"Sec-Fetch-Dest: font\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0042, requestHost0042, requestPort0042, requestHeader0042, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0042 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [43] <- WEB ADMIN Index 47 ---
		String requestProt0043 = "https";
		String requestHost0043 = "consumer.fis.boh.com";
		int    requestPort0043 = 443;
		String requestFile0043 = "/consumer-sb/service/d1/GetMessageLabelsSVC";
		String requestContent0043 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJOWI5NTg1YTQtMzVjNC00ZDU3LTg3YzQtMzBjOWFlZjVhMjNiCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDYzMzQzOTUJCUdldE1lc3NhZ2VMYWJlbHNTVkMJCWVuCTVmZDdmNDFjLTBkY2EtNDJiMC04MzNkLTcwN2ViNzlhNTNkMAo=\"},\"_operation\":\"GET\",\"_lang\":\"en\",\"_params\":[\"digitalBANKING\"],\"_optionalParams\":null,\"businessContext\":null}";
		String requestHeader0043 = "POST " + requestFile0043 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0043.getBytes().length + "\r\n" + 		// Content-Length: 355
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0043, requestHost0043, requestPort0043, requestHeader0043, requestContent0043.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestContent0043 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 11255
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [43] <- Index 43
		if(replayMode)
		{
			long proxyDataRecordId =1655106334413L;
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






		// --- HTTP REQUEST: Test [44] <- WEB ADMIN Index 48 ---
		String requestProt0044 = "https";
		String requestHost0044 = "consumer.fis.boh.com";
		int    requestPort0044 = 443;
		String requestFile0044 = "/consumer-sb/service/d1/AOFAQsSVC";
		String requestContent0044 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZWMzNGVjMTktYTBhNC00MGY0LThmZGYtM2I4YTM1MTQ2MjAxCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDYzMzQ0MjUJCUFPRkFRc1NWQwkJZW4JOGI1NDdmODYtZmM1MC00ZjAzLWIxODUtMDM1NTU1MTRkYTM1Cg==\"},\"_lang\":\"en\",\"_params\":[\"default-all-all\",\"en\",\"digitalBANKING\",\"digitalBanking\"]}";
		String requestHeader0044 = "POST " + requestFile0044 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0044.getBytes().length + "\r\n" + 		// Content-Length: 318
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0044, requestHost0044, requestPort0044, requestHeader0044, requestContent0044.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestContent0044 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 13012
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [44] <- Index 44
		if(replayMode)
		{
			long proxyDataRecordId =1655106334443L;
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






		// --- HTTP REQUEST: Test [45] <- WEB ADMIN Index 49 ---
		String requestProt0045 = "https";
		String requestHost0045 = "consumer.fis.boh.com";
		int    requestPort0045 = 443;
		String requestFile0045 = "/D1BOHConsumer/services/utils/isDevelopmentEnvironment";
		String requestHeader0045 = "GET " + requestFile0045 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0045, requestHost0045, requestPort0045, requestHeader0045, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0045 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 5
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [45] <- Index 45
		if(replayMode)
		{
			long proxyDataRecordId =1655106334519L;
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






		// --- HTTP REQUEST: Test [46] <- WEB ADMIN Index 50 ---
		String requestProt0046 = "https";
		String requestHost0046 = "consumer.fis.boh.com";
		int    requestPort0046 = 443;
		String requestFile0046 = "/D1BOHConsumer/services/utils/finkey";
		String requestHeader0046 = "GET " + requestFile0046 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0046, requestHost0046, requestPort0046, requestHeader0046, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0046 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 2
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [46] <- Index 46
		if(replayMode)
		{
			long proxyDataRecordId =1655106334537L;
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






		// --- HTTP REQUEST: Test [47] <- WEB ADMIN Index 51 ---
		String requestProt0047 = "https";
		String requestHost0047 = "consumer.fis.boh.com";
		int    requestPort0047 = 443;
		String requestFile0047 = "/D1BOHConsumer/services/utils/sBUrls";
		String requestHeader0047 = "GET " + requestFile0047 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0047, requestHost0047, requestPort0047, requestHeader0047, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0047 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 655
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [47] <- Index 47
		if(replayMode)
		{
			long proxyDataRecordId =1655106334556L;
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






		// --- HTTP REQUEST: Test [48] <- WEB ADMIN Index 52 ---
		String requestProt0048 = "https";
		String requestHost0048 = "consumer.fis.boh.com";
		int    requestPort0048 = 443;
		String requestFile0048 = "/D1BOHConsumer/services/utils/mobileURL";
		String requestHeader0048 = "GET " + requestFile0048 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0048, requestHost0048, requestPort0048, requestHeader0048, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0048 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 40
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [48] <- Index 48
		if(replayMode)
		{
			long proxyDataRecordId =1655106334686L;
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






		// --- HTTP REQUEST: Test [49] <- WEB ADMIN Index 53 ---
		String requestProt0049 = "https";
		String requestHost0049 = "consumer.fis.boh.com";
		int    requestPort0049 = 443;
		String requestFile0049 = "/consumer-sb/service/d1/FeatureGroupConfigSVC";
		String requestContent0049 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJN2Q4ZWIxOGItMzE4OS00ZWZjLTliZDgtYjFmYmMyODVlODgxCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDYzMzQ1MDcJCUZlYXR1cmVHcm91cENvbmZpZ1NWQwkJZW4JZjM2ZGYwNWYtMmZlNC00ZjU2LWFiMmQtZTFiZjIwNmRlNzYyCg==\"},\"_lang\":\"en\",\"_operation\":null,\"_optionalParams\":null,\"_params\":[\"LOGOUT_FEATURE\"]}";
		String requestHeader0049 = "POST " + requestFile0049 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0049.getBytes().length + "\r\n" + 		// Content-Length: 335
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0049, requestHost0049, requestPort0049, requestHeader0049, requestContent0049.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0049 = null;		// support garbage collector to reduce memory
		requestContent0049 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 882
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [49] <- Index 49
		if(replayMode)
		{
			long proxyDataRecordId =1655106334792L;
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






		// --- HTTP REQUEST: Test [50] <- WEB ADMIN Index 54 ---
		String requestProt0050 = "https";
		String requestHost0050 = "consumer.fis.boh.com";
		int    requestPort0050 = 443;
		String requestFile0050 = "/consumer-sb/service/d1/FeatureGroupConfigSVC";
		String requestContent0050 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJNGQ2MTc0NjctNDUxNS00Y2M5LWEwNDMtYzY4OWM2YzlkODA4CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDYzMzQ1MDkJCUZlYXR1cmVHcm91cENvbmZpZ1NWQwkJZW4JMDI4Y2QyZDgtZDljNi00ZGM4LWI2N2EtNGNhYmU2ZjU4NmNlCg==\"},\"_lang\":\"en\",\"_operation\":null,\"_optionalParams\":null,\"_params\":[\"LOGIN_FEATURE\",\"BRANCH_LOCATOR_FEATURE\"]}";
		String requestHeader0050 = "POST " + requestFile0050 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0050.getBytes().length + "\r\n" + 		// Content-Length: 359
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0050, requestHost0050, requestPort0050, requestHeader0050, requestContent0050.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0050 = null;		// support garbage collector to reduce memory
		requestContent0050 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 1849
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [50] <- Index 50
		if(replayMode)
		{
			long proxyDataRecordId =1655106334813L;
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






		// --- HTTP REQUEST: Test [51] <- WEB ADMIN Index 55 ---
		String requestProt0051 = "https";
		String requestHost0051 = "consumer.fis.boh.com";
		int    requestPort0051 = 443;
		String requestFile0051 = "/consumer-sb/service/d1/FeatureGroupConfigSVC";
		String requestContent0051 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMjM3MzFhOGYtOGNkYy00OWU0LWI3ZDAtYzNhNzBjYTM3OTNmCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDYzMzQ1MTQJCUZlYXR1cmVHcm91cENvbmZpZ1NWQwkJZW4JNTAzMjc4MjEtZDFmNC00ODM5LWJhODUtZGY2MDEwNTA5MGRlCg==\"},\"_lang\":\"en\",\"_operation\":null,\"_optionalParams\":null,\"_params\":[\"HELP_WEB_FEATURE\"]}";
		String requestHeader0051 = "POST " + requestFile0051 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0051.getBytes().length + "\r\n" + 		// Content-Length: 337
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0051, requestHost0051, requestPort0051, requestHeader0051, requestContent0051.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0051 = null;		// support garbage collector to reduce memory
		requestContent0051 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 943
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [51] <- Index 51
		if(replayMode)
		{
			long proxyDataRecordId =1655106335012L;
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






		// --- HTTP REQUEST: Test [52] <- WEB ADMIN Index 56 ---
		String requestProt0052 = "https";
		String requestHost0052 = "consumer.fis.boh.com";
		int    requestPort0052 = 443;
		String requestFile0052 = "/D1BOHConsumer/services/prefabs/LCD_COMMONS_HELP/servicedefs";
		String requestHeader0052 = "GET " + requestFile0052 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0052, requestHost0052, requestPort0052, requestHeader0052, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0052 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 61
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [52] <- Index 52
		if(replayMode)
		{
			long proxyDataRecordId =1655106335260L;
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






		// --- HTTP REQUEST: Test [53] <- WEB ADMIN Index 57 ---
		String requestProt0053 = "https";
		String requestHost0053 = "consumer.fis.boh.com";
		int    requestPort0053 = 443;
		String requestFile0053 = "/D1BOHConsumer/services/prefabs/LCD_COMMONS_FOOTER/servicedefs";
		String requestHeader0053 = "GET " + requestFile0053 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0053, requestHost0053, requestPort0053, requestHeader0053, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0053 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 625
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [53] <- Index 53
		if(replayMode)
		{
			long proxyDataRecordId =1655106335325L;
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






		// --- HTTP REQUEST: Test [54] <- WEB ADMIN Index 58 ---
		String requestProt0054 = "https";
		String requestHost0054 = "consumer.fis.boh.com";
		int    requestPort0054 = 443;
		String requestFile0054 = "/D1BOHConsumer/ng-bundle/197-es2015.9eca6751b712cf389679.js";
		String requestHeader0054 = "GET " + requestFile0054 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0054, requestHost0054, requestPort0054, requestHeader0054, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0054 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [55] <- WEB ADMIN Index 59 ---
		String requestProt0055 = "https";
		String requestHost0055 = "consumer.fis.boh.com";
		int    requestPort0055 = 443;
		String requestFile0055 = "/consumer-sb/firesolver";
		String requestHeader0055 = "GET " + requestFile0055 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0055, requestHost0055, requestPort0055, requestHeader0055, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0055 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 1393
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [55] <- Index 55
		if(replayMode)
		{
			long proxyDataRecordId =1655106335385L;
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






		// --- HTTP REQUEST: Test [56] <- WEB ADMIN Index 60 ---
		String requestProt0056 = "https";
		String requestHost0056 = "consumer.fis.boh.com";
		int    requestPort0056 = 443;
		String requestFile0056 = "/D1BOHConsumer/ng-bundle/basis-grotesque-medium-pro.f95ab6344f68dc35e032.woff";
		String requestHeader0056 = "GET " + requestFile0056 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: identity\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/ng-bundle/wm-styles.de8aceeeeee4b2e91a4a5f89e97be21b.css\r\n" + 
				"Sec-Fetch-Dest: font\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0056, requestHost0056, requestPort0056, requestHeader0056, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0056 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [57] <- WEB ADMIN Index 62 ---
		String requestProt0057 = "https";
		String requestHost0057 = "consumer.fis.boh.com";
		int    requestPort0057 = 443;
		String requestFile0057 = "/D1BOHConsumer/ng-bundle/30-es2015.e2edd1594a330cc6a652.js";
		String requestHeader0057 = "GET " + requestFile0057 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0057, requestHost0057, requestPort0057, requestHeader0057, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0057 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [58] <- WEB ADMIN Index 63 ---
		String requestProt0058 = "https";
		String requestHost0058 = "consumer.fis.boh.com";
		int    requestPort0058 = 443;
		String requestFile0058 = "/D1BOHConsumer/ng-bundle/100-es2015.4823f2c7284b29135ce4.js";
		String requestHeader0058 = "GET " + requestFile0058 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0058, requestHost0058, requestPort0058, requestHeader0058, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0058 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [59] <- WEB ADMIN Index 64 ---
		String requestProt0059 = "https";
		String requestHost0059 = "consumer.fis.boh.com";
		int    requestPort0059 = 443;
		String requestFile0059 = "/D1BOHConsumer/ng-bundle/107-es2015.7924bce3d01f43b465d8.js";
		String requestHeader0059 = "GET " + requestFile0059 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0059, requestHost0059, requestPort0059, requestHeader0059, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0059 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [60] <- WEB ADMIN Index 65 ---
		String requestProt0060 = "https";
		String requestHost0060 = "consumer.fis.boh.com";
		int    requestPort0060 = 443;
		String requestFile0060 = "/D1BOHConsumer/services/utils/cDNUrl" +
				"?fiId=140";
		String requestHeader0060 = "GET " + requestFile0060 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0060, requestHost0060, requestPort0060, requestHeader0060, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0060 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 60
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [60] <- Index 60
		if(replayMode)
		{
			long proxyDataRecordId =1655106335820L;
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




		// all http requests of page #1_2 successful done
		return true;
	}


	/**
	 * Recorded http requests of page #1_3.
	 *
	 * @return  true:  method successful completed.
	 *          false: method/loop failed.
	 */
	boolean executePage_1_3(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext,int innerLoopCounter, int totalInnerLoopCount, Object httpLogVectorObject) throws Exception
	{
		// ... continuing page #1 (fragment 4 of 4)
		// ----------------------------------------



		// --- HTTP REQUEST: Test [61] <- WEB ADMIN Index 68 ---
		String requestProt0061 = "https";
		String requestHost0061 = "consumer.fis.boh.com";
		int    requestPort0061 = 443;
		String requestFile0061 = "/D1BOHConsumer/services/utils/syncFIResolver";
		String requestContent0061 = 
				"{\"clientId\":\"D1-Consumer-Studio\",\"finInstKey\":\"140\"}";
		String requestHeader0061 = "POST " + requestFile0061 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0061.getBytes().length + "\r\n" + 		// Content-Length: 52
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0061, requestHost0061, requestPort0061, requestHeader0061, requestContent0061.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0061 = null;		// support garbage collector to reduce memory
		requestContent0061 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = [verification disabled], header text fragment = [verification disabled], recorded content size = 0
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, null, null, null);		// Test [61] <- Index 61
		if(replayMode)
		{
			long proxyDataRecordId =1655106335835L;
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






		// --- HTTP REQUEST: Test [62] <- WEB ADMIN Index 69 ---
		String requestProt0062 = "https";
		String requestHost0062 = "consumer.fis.boh.com";
		int    requestPort0062 = 443;
		String requestFile0062 = "/D1BOHConsumer/build.txt" +
				"?v=0.20680194843183142" +
				"&rnd=611628ef-6e6d-4bca-a9fb-3064cdc14878";
		String requestHeader0062 = "GET " + requestFile0062 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0062, requestHost0062, requestPort0062, requestHeader0062, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0062 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 302, content type = [verification disabled], header text fragment = [verification disabled], recorded content size = 0
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {302}, null, null, null);		// Test [62] <- Index 62
		if(replayMode)
		{
			long proxyDataRecordId =1655106335836L;
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






		// --- HTTP REQUEST: Test [63] <- WEB ADMIN Index 70 ---
		String requestProt0063 = "https";
		String requestHost0063 = "consumer.fis.boh.com";
		int    requestPort0063 = 443;
		String requestFile0063 = "/D1BOHConsumer/ng-bundle/wavicon.82f7054e31313d887abb.woff";
		String requestHeader0063 = "GET " + requestFile0063 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: identity\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/ng-bundle/styles.9ae08cb7c5bba59957bc.css\r\n" + 
				"Sec-Fetch-Dest: font\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0063, requestHost0063, requestPort0063, requestHeader0063, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0063 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [64] <- WEB ADMIN Index 71 ---
		String requestProt0064 = "https";
		String requestHost0064 = "consumer.fis.boh.com";
		int    requestPort0064 = 443;
		String requestFile0064 = "/D1BOHConsumer/resources/images/imagelists/default-image.png";
		String requestHeader0064 = "GET " + requestFile0064 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: image/avif,image/webp,*/*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: image\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0064, requestHost0064, requestPort0064, requestHeader0064, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0064 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [65] <- WEB ADMIN Index 74 ---
		String requestProt0065 = "https";
		String requestHost0065 = "consumer.fis.boh.com";
		int    requestPort0065 = 443;
		String requestFile0065 = "/consumer-sb/service/d1/ConsumerFooterSVC";
		String requestContent0065 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJODU1MDhmZGQtNjI1Ny00ZGE4LTkwNWUtOTNhNzQ2NjIyYzg2CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDYzMzU5ODIJCUNvbnN1bWVyRm9vdGVyU1ZDCQllbgliZDMyMzVjOS04NWMyLTQ5ZjMtODNiNy0xYTFhNmQwZDMwYTQK\"},\"_lang\":\"en\",\"_optionalParams\":null,\"_params\":[\"140-all-all\",\"en\",\"digitalBANKING\",\"consumer\"]}";
		String requestHeader0065 = "POST " + requestFile0065 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0065.getBytes().length + "\r\n" + 		// Content-Length: 339
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0065, requestHost0065, requestPort0065, requestHeader0065, requestContent0065.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0065 = null;		// support garbage collector to reduce memory
		requestContent0065 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 593
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [65] <- Index 65
		if(replayMode)
		{
			long proxyDataRecordId =1655106336008L;
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






		// --- HTTP REQUEST: Test [66] <- WEB ADMIN Index 75 ---
		String requestProt0066 = "https";
		String requestHost0066 = "consumer.fis.boh.com";
		int    requestPort0066 = 443;
		String requestFile0066 = "/D1BOHConsumer/build.txt" +
				"?v=0.2004942899489247" +
				"&rnd=796328ca-b6a6-44c5-bc9f-2090ab20102d";
		String requestHeader0066 = "GET " + requestFile0066 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0066, requestHost0066, requestPort0066, requestHeader0066, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0066 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 302, content type = [verification disabled], header text fragment = [verification disabled], recorded content size = 0
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {302}, null, null, null);		// Test [66] <- Index 66
		if(replayMode)
		{
			long proxyDataRecordId =1655106336174L;
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






		// --- HTTP REQUEST: Test [67] <- WEB ADMIN Index 77 ---
		String requestProt0067 = "https";
		String requestHost0067 = "consumer.fis.boh.com";
		int    requestPort0067 = 443;
		String requestFile0067 = "/D1BOHConsumer/services/tMConfig/tMConfig";
		String requestHeader0067 = "GET " + requestFile0067 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0067, requestHost0067, requestPort0067, requestHeader0067, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0067 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 78
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [67] <- Index 67
		if(replayMode)
		{
			long proxyDataRecordId =1655106336200L;
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




		// all http requests of page #1_3 successful done
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
		// # Page #2: Login
		// # --------------



		// --- HTTP REQUEST: Test [69] <- WEB ADMIN Index 153 ---
		String requestProt0069 = "https";
		String requestHost0069 = "consumer.fis.boh.com";
		int    requestPort0069 = 443;
		String requestFile0069 = "/D1BOHConsumer/j_spring_security_check";
		String requestContent0069 = 
				"j_username=PORTALTEST2023_D1" +
				"&j_password=PASS12345" +
				"&j_remember_me=true" +
				"&browserfootprint=123ACADHGADtyyftyyt12321" +
				"&j_device_id=";
		String requestHeader0069 = "POST " + requestFile0069 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/x-www-form-urlencoded\r\n" + 
				"Content-Length: " + requestContent0069.getBytes().length + "\r\n" + 		// Content-Length: 123
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0069, requestHost0069, requestPort0069, requestHeader0069, requestContent0069.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0069 = null;		// support garbage collector to reduce memory
		requestContent0069 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 95
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [69] <- Index 69
		if(replayMode)
		{
			long proxyDataRecordId =1655106422269L;
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

		// extract variable(s) from response
		try
		{
			jsonHtmlBasedExtractor = new JSONHtmlBasedExtractor(testURL.getContentString(), this);
		}
		catch (Exception e)
		{
			// failure - dump wrong response content and abort current outer loop - after that start next loop
			String errorText = "*** error: malformed XML or JSON data - unable to parse received response content";
			log(errorText);
			threadStep = performanceData.setFailed(threadStep, HttpTestURL.STATUS_TYPE_USER_SPECIFIC_TEST_FAILED, errorText, testURL, this);
		
			endOfExecuteLoop(false, testURL, threadStep, loopPluginContext);
			return false;
		}
		try
		{
			// extract var 'wm_xsrf_token'
			wm_xsrf_token = jsonHtmlBasedExtractor.getNodeValue("$.wm_xsrf_token");		// recorded value = 1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7
			log("<<< wm_xsrf_token = " + wm_xsrf_token);
			loopVarMap.put("wm_xsrf_token", wm_xsrf_token);
			// Replace the value of a variable with a user given value in case of a blank text extracted during the load test
			if (false && wm_xsrf_token!= null && wm_xsrf_token.trim().length() == 0)
			{
				wm_xsrf_token = "";
				log("runtime note: the extraction of a new value for the variable 'wm_xsrf_token' ends up with an empty string - a substitute value was set");
				log("<<< wm_xsrf_token = " + wm_xsrf_token);
				loopVarMap.put("wm_xsrf_token", wm_xsrf_token);
			}
		}
		catch (Exception e) { wm_xsrf_token = null; log(e); }
		if (wm_xsrf_token == null)
		{
			// failure - dump wrong response content and abort current outer loop - after that start next loop
			String errorText = "*** error: unable to extract var 'wm_xsrf_token' from json response data";
			log(errorText);
			terminateFailedUser(testURL);		// set the user to be terminated at end of loop ? - only performed if the URL call has marked before to support that !
			threadStep = performanceData.setFailed(threadStep, HttpTestURL.STATUS_TYPE_USER_SPECIFIC_TEST_FAILED, errorText, testURL, this);
		
			endOfExecuteLoop(false, testURL, threadStep, loopPluginContext);
			return false;
		}

		// update performance data if url call passed
		if (urlCallPassed)
			threadStep = setPassed(performanceData, threadStep, testURL);
		else
			threadStep = threadStep + 1;		// url call failed - performance data already updated






		// --- HTTP REQUEST: Test [70] <- WEB ADMIN Index 155 ---
		String requestProt0070 = "https";
		String requestHost0070 = "consumer.fis.boh.com";
		int    requestPort0070 = 443;
		String requestFile0070 = "/D1BOHConsumer/";
		String requestHeader0070 = "GET " + requestFile0070 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Upgrade-Insecure-Requests: 1\r\n" + 
				"Sec-Fetch-Dest: document\r\n" + 
				"Sec-Fetch-Mode: navigate\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Sec-Fetch-User: ?1\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0070, requestHost0070, requestPort0070, requestHeader0070, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0070 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/HTML", header text fragment = [verification disabled], recorded content size = 1871
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/HTML", null, null);		// Test [70] <- Index 70
		if(replayMode)
		{
			long proxyDataRecordId =1655106424118L;
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






		// --- HTTP REQUEST: Test [71] <- WEB ADMIN Index 156 ---
		String requestProt0071 = "https";
		String requestHost0071 = "consumer.fis.boh.com";
		int    requestPort0071 = 443;
		String requestFile0071 = "/D1BOHConsumer/d1-analytics.js";
		String requestHeader0071 = "GET " + requestFile0071 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0071, requestHost0071, requestPort0071, requestHeader0071, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0071 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [72] <- WEB ADMIN Index 164 ---
		String requestProt0072 = "https";
		String requestHost0072 = "consumer.fis.boh.com";
		int    requestPort0072 = 443;
		String requestFile0072 = "/D1BOHConsumer/services/application/wmProperties.js";
		String requestHeader0072 = "GET " + requestFile0072 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0072, requestHost0072, requestPort0072, requestHeader0072, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0072 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [73] <- WEB ADMIN Index 167 ---
		String requestProt0073 = "https";
		String requestHost0073 = "consumer.fis.boh.com";
		int    requestPort0073 = 443;
		String requestFile0073 = "/D1BOHConsumer/resources/i18n/en.json";
		String requestHeader0073 = "GET " + requestFile0073 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0073, requestHost0073, requestPort0073, requestHeader0073, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0073 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 57844
		// content test algorithm: search text
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, "Welcome,");		// Test [73] <- Index 73
		if(replayMode)
		{
			long proxyDataRecordId =1655106425184L;
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






		// --- HTTP REQUEST: Test [74] <- WEB ADMIN Index 168 ---
		String requestProt0074 = "https";
		String requestHost0074 = "consumer.fis.boh.com";
		int    requestPort0074 = 443;
		String requestFile0074 = "/D1BOHConsumer/services/security/info";
		String requestHeader0074 = "GET " + requestFile0074 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0074, requestHost0074, requestPort0074, requestHeader0074, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0074 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 456
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [74] <- Index 74
		if(replayMode)
		{
			long proxyDataRecordId =1655106425207L;
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






		// --- HTTP REQUEST: Test [75] <- WEB ADMIN Index 169 ---
		String requestProt0075 = "https";
		String requestHost0075 = "consumer.fis.boh.com";
		int    requestPort0075 = 443;
		String requestFile0075 = "/D1BOHConsumer/print.css";
		String requestHeader0075 = "GET " + requestFile0075 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: text/css,*/*;q=0.1\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: style\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0075, requestHost0075, requestPort0075, requestHeader0075, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0075 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [76] <- WEB ADMIN Index 170 ---
		String requestProt0076 = "https";
		String requestHost0076 = "consumer.fis.boh.com";
		int    requestPort0076 = 443;
		String requestFile0076 = "/D1BOHConsumer/services/servicedefs";
		String requestHeader0076 = "GET " + requestFile0076 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0076, requestHost0076, requestPort0076, requestHeader0076, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0076 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 6242
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [76] <- Index 76
		if(replayMode)
		{
			long proxyDataRecordId =1655106425224L;
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






		// --- HTTP REQUEST: Test [77] <- WEB ADMIN Index 171 ---
		String requestProt0077 = "https";
		String requestHost0077 = "consumer.fis.boh.com";
		int    requestPort0077 = 443;
		String requestFile0077 = "/D1BOHConsumer/ng-bundle/path_mapping.json";
		String requestHeader0077 = "GET " + requestFile0077 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0077, requestHost0077, requestPort0077, requestHeader0077, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0077 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 461
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [77] <- Index 77
		if(replayMode)
		{
			long proxyDataRecordId =1655106425573L;
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






		// --- HTTP REQUEST: Test [78] <- WEB ADMIN Index 172 ---
		String requestProt0078 = "https";
		String requestHost0078 = "consumer.fis.boh.com";
		int    requestPort0078 = 443;
		String requestFile0078 = "/D1BOHConsumer/services/prefabs/LCD_Dashboard_AccountListing/servicedefs";
		String requestHeader0078 = "GET " + requestFile0078 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0078, requestHost0078, requestPort0078, requestHeader0078, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0078 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 619
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [78] <- Index 78
		if(replayMode)
		{
			long proxyDataRecordId =1655106425859L;
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






		// --- HTTP REQUEST: Test [79] <- WEB ADMIN Index 173 ---
		String requestProt0079 = "https";
		String requestHost0079 = "consumer.fis.boh.com";
		int    requestPort0079 = 443;
		String requestFile0079 = "/D1BOHConsumer/services/prefabs/LCD_Dashboard_BenefitsWidget/servicedefs";
		String requestHeader0079 = "GET " + requestFile0079 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0079, requestHost0079, requestPort0079, requestHeader0079, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0079 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 639
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [79] <- Index 79
		if(replayMode)
		{
			long proxyDataRecordId =1655106425877L;
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






		// --- HTTP REQUEST: Test [80] <- WEB ADMIN Index 174 ---
		String requestProt0080 = "https";
		String requestHost0080 = "consumer.fis.boh.com";
		int    requestPort0080 = 443;
		String requestFile0080 = "/D1BOHConsumer/services/prefabs/LCD_Dashboard_RecentTransactions/servicedefs";
		String requestHeader0080 = "GET " + requestFile0080 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0080, requestHost0080, requestPort0080, requestHeader0080, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0080 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 523
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [80] <- Index 80
		if(replayMode)
		{
			long proxyDataRecordId =1655106425879L;
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






		// --- HTTP REQUEST: Test [81] <- WEB ADMIN Index 175 ---
		String requestProt0081 = "https";
		String requestHost0081 = "consumer.fis.boh.com";
		int    requestPort0081 = 443;
		String requestFile0081 = "/D1BOHConsumer/services/prefabs/LCD_Dashboard_Announcements/servicedefs";
		String requestHeader0081 = "GET " + requestFile0081 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0081, requestHost0081, requestPort0081, requestHeader0081, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0081 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 544
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [81] <- Index 81
		if(replayMode)
		{
			long proxyDataRecordId =1655106425880L;
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






		// --- HTTP REQUEST: Test [82] <- WEB ADMIN Index 176 ---
		String requestProt0082 = "https";
		String requestHost0082 = "consumer.fis.boh.com";
		int    requestPort0082 = 443;
		String requestFile0082 = "/D1BOHConsumer/services/prefabs/LCD_Dashboard_SCH_Transactions/servicedefs";
		String requestHeader0082 = "GET " + requestFile0082 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0082, requestHost0082, requestPort0082, requestHeader0082, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0082 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 730
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [82] <- Index 82
		if(replayMode)
		{
			long proxyDataRecordId =1655106425881L;
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






		// --- HTTP REQUEST: Test [83] <- WEB ADMIN Index 177 ---
		String requestProt0083 = "https";
		String requestHost0083 = "consumer.fis.boh.com";
		int    requestPort0083 = 443;
		String requestFile0083 = "/D1BOHConsumer/services/prefabs/LCD_Offers/servicedefs";
		String requestHeader0083 = "GET " + requestFile0083 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0083, requestHost0083, requestPort0083, requestHeader0083, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0083 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 61
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [83] <- Index 83
		if(replayMode)
		{
			long proxyDataRecordId =1655106425946L;
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






		// --- HTTP REQUEST: Test [84] <- WEB ADMIN Index 178 ---
		String requestProt0084 = "https";
		String requestHost0084 = "consumer.fis.boh.com";
		int    requestPort0084 = 443;
		String requestFile0084 = "/D1BOHConsumer/services/utils/isDevelopmentEnvironment";
		String requestHeader0084 = "GET " + requestFile0084 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0084, requestHost0084, requestPort0084, requestHeader0084, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0084 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 5
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [84] <- Index 84
		if(replayMode)
		{
			long proxyDataRecordId =1655106426205L;
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






		// --- HTTP REQUEST: Test [85] <- WEB ADMIN Index 179 ---
		String requestProt0085 = "https";
		String requestHost0085 = "consumer.fis.boh.com";
		int    requestPort0085 = 443;
		String requestFile0085 = "/D1BOHConsumer/services/utils/finkey";
		String requestHeader0085 = "GET " + requestFile0085 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0085, requestHost0085, requestPort0085, requestHeader0085, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0085 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 2
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [85] <- Index 85
		if(replayMode)
		{
			long proxyDataRecordId =1655106426224L;
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






		// --- HTTP REQUEST: Test [86] <- WEB ADMIN Index 180 ---
		String requestProt0086 = "https";
		String requestHost0086 = "consumer.fis.boh.com";
		int    requestPort0086 = 443;
		String requestFile0086 = "/D1BOHConsumer/services/utils/sBUrls";
		String requestHeader0086 = "GET " + requestFile0086 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0086, requestHost0086, requestPort0086, requestHeader0086, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0086 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 655
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [86] <- Index 86
		if(replayMode)
		{
			long proxyDataRecordId =1655106426238L;
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






		// --- HTTP REQUEST: Test [87] <- WEB ADMIN Index 181 ---
		String requestProt0087 = "https";
		String requestHost0087 = "consumer.fis.boh.com";
		int    requestPort0087 = 443;
		String requestFile0087 = "/D1BOHConsumer/services/utils/mobileURL";
		String requestHeader0087 = "GET " + requestFile0087 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0087, requestHost0087, requestPort0087, requestHeader0087, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0087 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 40
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [87] <- Index 87
		if(replayMode)
		{
			long proxyDataRecordId =1655106426536L;
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






		// --- HTTP REQUEST: Test [88] <- WEB ADMIN Index 182 ---
		String requestProt0088 = "https";
		String requestHost0088 = "consumer.fis.boh.com";
		int    requestPort0088 = 443;
		String requestFile0088 = "/consumer-sb/service/d1/FeatureGroupConfigSVC";
		String requestContent0088 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJOTczMjYyZWMtOGZhZi00NDEzLTg2MTYtZTZkMTdkNWRiNTRkCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5MDgJCUZlYXR1cmVHcm91cENvbmZpZ1NWQwkJZW4JMDJiN2ZiNWItZGU2ZS00N2VlLWFmMDMtZTk2ZjUzZWMzM2ZmCg==\"},\"_lang\":\"en\",\"_operation\":null,\"_optionalParams\":null,\"_params\":[\"LOGOUT_FEATURE\"]}";
		String requestHeader0088 = "POST " + requestFile0088 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0088.getBytes().length + "\r\n" + 		// Content-Length: 335
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0088, requestHost0088, requestPort0088, requestHeader0088, requestContent0088.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0088 = null;		// support garbage collector to reduce memory
		requestContent0088 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 882
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [88] <- Index 88
		if(replayMode)
		{
			long proxyDataRecordId =1655106426554L;
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


	/**
	 * Recorded http requests of page #2_1.
	 *
	 * @return  true:  method successful completed.
	 *          false: method/loop failed.
	 */
	boolean executePage_2_1(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext,int innerLoopCounter, int totalInnerLoopCount, Object httpLogVectorObject) throws Exception
	{
		// ... continuing page #2 (fragment 2 of 7)
		// ----------------------------------------



		// --- HTTP REQUEST: Test [89] <- WEB ADMIN Index 183 ---
		String requestProt0089 = "https";
		String requestHost0089 = "consumer.fis.boh.com";
		int    requestPort0089 = 443;
		String requestFile0089 = "/consumer-sb/service/d1/FeatureGroupConfigSVC";
		String requestContent0089 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJY2FmNDVkYTQtYTkyYS00NWU2LWI2N2QtOTE0MmFjYzQzZDE1CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5MDkJCUZlYXR1cmVHcm91cENvbmZpZ1NWQwkJZW4JMTBlYjc4NmQtM2Q4OC00M2NhLWJmYTEtMjA5ZDlhMzExM2M4Cg==\"},\"_lang\":\"en\",\"_operation\":null,\"_optionalParams\":null,\"_params\":[\"LOGIN_FEATURE\",\"BRANCH_LOCATOR_FEATURE\"]}";
		String requestHeader0089 = "POST " + requestFile0089 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0089.getBytes().length + "\r\n" + 		// Content-Length: 359
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0089, requestHost0089, requestPort0089, requestHeader0089, requestContent0089.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0089 = null;		// support garbage collector to reduce memory
		requestContent0089 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 1849
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [89] <- Index 89
		if(replayMode)
		{
			long proxyDataRecordId =1655106426583L;
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






		// --- HTTP REQUEST: Test [90] <- WEB ADMIN Index 184 ---
		String requestProt0090 = "https";
		String requestHost0090 = "consumer.fis.boh.com";
		int    requestPort0090 = 443;
		String requestFile0090 = "/consumer-sb/service/d1/FeatureGroupConfigSVC";
		String requestContent0090 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJOTViMjg0NDAtYThmYi00YjBkLWExMjktZTRjZmYwZDgxZTM4CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5MTIJCUZlYXR1cmVHcm91cENvbmZpZ1NWQwkJZW4JOWU3MjcyMWMtZjUxNi00NzBhLTg1MTEtMTNmNzVjMTczNGNmCg==\"},\"_lang\":\"en\",\"_operation\":null,\"_optionalParams\":null,\"_params\":[\"HELP_WEB_FEATURE\"]}";
		String requestHeader0090 = "POST " + requestFile0090 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0090.getBytes().length + "\r\n" + 		// Content-Length: 337
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0090, requestHost0090, requestPort0090, requestHeader0090, requestContent0090.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0090 = null;		// support garbage collector to reduce memory
		requestContent0090 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 943
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [90] <- Index 90
		if(replayMode)
		{
			long proxyDataRecordId =1655106426693L;
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






		// --- HTTP REQUEST: Test [91] <- WEB ADMIN Index 185 ---
		String requestProt0091 = "https";
		String requestHost0091 = "consumer.fis.boh.com";
		int    requestPort0091 = 443;
		String requestFile0091 = "/D1BOHConsumer/services/migration/isMigrationEmulationSession";
		String requestHeader0091 = "GET " + requestFile0091 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0091, requestHost0091, requestPort0091, requestHeader0091, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0091 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 5
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [91] <- Index 91
		if(replayMode)
		{
			long proxyDataRecordId =1655106426736L;
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






		// --- HTTP REQUEST: Test [92] <- WEB ADMIN Index 186 ---
		String requestProt0092 = "https";
		String requestHost0092 = "consumer.fis.boh.com";
		int    requestPort0092 = 443;
		String requestFile0092 = "/consumer-sb/service/d1/CodeLookupSVC";
		String requestContent0092 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJNjk4OWFlZGMtOTc2Ni00Y2VjLTg1OTEtNWJmODYyYWM2NGVlCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5NjYJCUNvZGVMb29rdXBTVkMJCWVuCWI0M2I3MzA4LTE5NGItNDhjZC1iZjIzLWE0YzkyMzY0Mzg2Zgo=\"},\"_p\":\"STOP_PAYMENT_REASON\",\"_op\":null,\"businessContext\":null,\"_lang\":\"en\"}";
		String requestHeader0092 = "POST " + requestFile0092 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0092.getBytes().length + "\r\n" + 		// Content-Length: 314
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0092, requestHost0092, requestPort0092, requestHeader0092, requestContent0092.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0092 = null;		// support garbage collector to reduce memory
		requestContent0092 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 176
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [92] <- Index 92
		if(replayMode)
		{
			long proxyDataRecordId =1655106426868L;
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






		// --- HTTP REQUEST: Test [93] <- WEB ADMIN Index 187 ---
		String requestProt0093 = "https";
		String requestHost0093 = "consumer.fis.boh.com";
		int    requestPort0093 = 443;
		String requestFile0093 = "/consumer-sb/service/d1/CodeLookupSVC";
		String requestContent0093 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMjlhMDljMmMtMDAwNC00OWJkLWIyMTEtYzgxNzZlODFlOTMwCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5NjkJCUNvZGVMb29rdXBTVkMJCWVuCTMzYzllMmFlLTA1N2YtNDU4Yi1hNmM1LTkwMWI0YjRjZTQ1YQo=\"},\"_p\":\"STOP_PAYMENT_TYPE\",\"_op\":null,\"businessContext\":null,\"_lang\":\"en\"}";
		String requestHeader0093 = "POST " + requestFile0093 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0093.getBytes().length + "\r\n" + 		// Content-Length: 312
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0093, requestHost0093, requestPort0093, requestHeader0093, requestContent0093.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0093 = null;		// support garbage collector to reduce memory
		requestContent0093 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 311
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [93] <- Index 93
		if(replayMode)
		{
			long proxyDataRecordId =1655106426962L;
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






		// --- HTTP REQUEST: Test [94] <- WEB ADMIN Index 188 ---
		String requestProt0094 = "https";
		String requestHost0094 = "consumer.fis.boh.com";
		int    requestPort0094 = 443;
		String requestFile0094 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0094 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJNzBiZmVkNTUtODUwYy00MDQzLWExMTMtNWUwNjc3NmE2NDNhCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5NzAJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCTNlZjYxMWYzLWFkOTctNDc0ZS1hZmVkLWVjNWE2MmZiNmVhMAo=\"},\"_lang\":\"en\",\"_params\":[\"\",\"ACCOUNT_DETAILS_FEATURE\"]}";
		String requestHeader0094 = "POST " + requestFile0094 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0094.getBytes().length + "\r\n" + 		// Content-Length: 314
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0094, requestHost0094, requestPort0094, requestHeader0094, requestContent0094.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0094 = null;		// support garbage collector to reduce memory
		requestContent0094 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 118
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [94] <- Index 94
		if(replayMode)
		{
			long proxyDataRecordId =1655106426979L;
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






		// --- HTTP REQUEST: Test [95] <- WEB ADMIN Index 189 ---
		String requestProt0095 = "https";
		String requestHost0095 = "consumer.fis.boh.com";
		int    requestPort0095 = 443;
		String requestFile0095 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0095 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMDg5YjViYjUtMjFiNi00MjdlLWJjMmQtMjEwMDkwODFmMWRmCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5NzIJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWVkNmQ1MThmLTc1MjktNDBlMi05YzE1LWZhMDg2ZmUzNWQ0Ngo=\"},\"_lang\":\"en\",\"businessContext\":null,\"_params\":[\"\",\"LOGIN_DETAILS_FEATURE\"],\"_optionalParams\":null,\"_operation\":null}";
		String requestHeader0095 = "POST " + requestFile0095 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: Application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0095.getBytes().length + "\r\n" + 		// Content-Length: 376
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0095, requestHost0095, requestPort0095, requestHeader0095, requestContent0095.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0095 = null;		// support garbage collector to reduce memory
		requestContent0095 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 118
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [95] <- Index 95
		if(replayMode)
		{
			long proxyDataRecordId =1655106427031L;
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






		// --- HTTP REQUEST: Test [96] <- WEB ADMIN Index 190 ---
		String requestProt0096 = "https";
		String requestHost0096 = "consumer.fis.boh.com";
		int    requestPort0096 = 443;
		String requestFile0096 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0096 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZWY5MjViZWQtODg2Ny00ZmE4LTg0OGMtMTlmYmVjMjZjMDhmCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5ODEJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWQ1NmU3Mzg5LTMzZmEtNDVlNS1hMGI4LTNlZDU2YzE0NzBiNwo=\"},\"_lang\":\"en\",\"businessContext\":null,\"_params\":[\"\",\"PAYMENTS_FEATURE\"]}";
		String requestHeader0096 = "POST " + requestFile0096 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0096.getBytes().length + "\r\n" + 		// Content-Length: 330
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0096, requestHost0096, requestPort0096, requestHeader0096, requestContent0096.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0096 = null;		// support garbage collector to reduce memory
		requestContent0096 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 118
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [96] <- Index 96
		if(replayMode)
		{
			long proxyDataRecordId =1655106427068L;
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






		// --- HTTP REQUEST: Test [97] <- WEB ADMIN Index 191 ---
		String requestProt0097 = "https";
		String requestHost0097 = "consumer.fis.boh.com";
		int    requestPort0097 = 443;
		String requestFile0097 = "/consumer-sb/service/d1/GenericLogEventSVC";
		String requestContent0097 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZDBhOGU2OWQtYjcwYy00NDlhLTk0ZWEtZjMwYmZjMzFhMWFhCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5ODUJCUdlbmVyaWNMb2dFdmVudFNWQwkJZW4JNzY1ZTM0OTUtOTU3Zi00NGYxLWJmZGYtYjRiMDgwOWRjYTM5Cg==\"},\"_operation\":\"POST\"}";
		String requestHeader0097 = "POST " + requestFile0097 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0097.getBytes().length + "\r\n" + 		// Content-Length: 268
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0097, requestHost0097, requestPort0097, requestHeader0097, requestContent0097.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0097 = null;		// support garbage collector to reduce memory
		requestContent0097 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 148
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [97] <- Index 97
		if(replayMode)
		{
			long proxyDataRecordId =1655106427087L;
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






		// --- HTTP REQUEST: Test [98] <- WEB ADMIN Index 192 ---
		String requestProt0098 = "https";
		String requestHost0098 = "consumer.fis.boh.com";
		int    requestPort0098 = 443;
		String requestFile0098 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0098 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJNTdhYTVlMzQtNjllZS00NDRjLThkZDItNTFjYTdjMTdiODhjCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5ODkJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWM3ZjNhNjExLWQ0NzktNDc2Ni05YmI2LTBiZDhmOWQzMGU0NAo=\"},\"_lang\":\"en\",\"_params\":[\"\",\"ACCOUNT_FEATURE\"]}";
		String requestHeader0098 = "POST " + requestFile0098 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0098.getBytes().length + "\r\n" + 		// Content-Length: 306
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0098, requestHost0098, requestPort0098, requestHeader0098, requestContent0098.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0098 = null;		// support garbage collector to reduce memory
		requestContent0098 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 118
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [98] <- Index 98
		if(replayMode)
		{
			long proxyDataRecordId =1655106427201L;
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






		// --- HTTP REQUEST: Test [99] <- WEB ADMIN Index 193 ---
		String requestProt0099 = "https";
		String requestHost0099 = "consumer.fis.boh.com";
		int    requestPort0099 = 443;
		String requestFile0099 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0099 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJODI3Y2Q0YTAtNDI3OC00NThiLTg1ZGMtNGM5MWJhMDM4ZWFkCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5OTAJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWQxZGIwMmNkLTBhZjgtNDBkOS1hOTAwLWIzNGViZTc0ZWY0NAo=\"},\"_lang\":\"en\",\"_params\":[\"Person\",\"ACCOUNT_DETAILS_FEATURE\"],\"businessContext\":null}";
		String requestHeader0099 = "POST " + requestFile0099 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0099.getBytes().length + "\r\n" + 		// Content-Length: 343
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0099, requestHost0099, requestPort0099, requestHeader0099, requestContent0099.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0099 = null;		// support garbage collector to reduce memory
		requestContent0099 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 15877
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [99] <- Index 99
		if(replayMode)
		{
			long proxyDataRecordId =1655106427306L;
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






		// --- HTTP REQUEST: Test [100] <- WEB ADMIN Index 194 ---
		String requestProt0100 = "https";
		String requestHost0100 = "consumer.fis.boh.com";
		int    requestPort0100 = 443;
		String requestFile0100 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0100 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJNjQ0YmIzODQtN2I1Yy00Nzk5LWIyZDEtMzkyMDI2MmE5YmE3CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5OTMJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWRlZTFlYjBjLTBkOGYtNDJmMC1hZTdiLWE2ODcxODEyM2UxMgo=\"},\"_lang\":\"en\",\"_params\":[\"Person\",\"ACCOUNT_TRANSACTION\"],\"businessContext\":null}";
		String requestHeader0100 = "POST " + requestFile0100 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0100.getBytes().length + "\r\n" + 		// Content-Length: 339
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0100, requestHost0100, requestPort0100, requestHeader0100, requestContent0100.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0100 = null;		// support garbage collector to reduce memory
		requestContent0100 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 517
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [100] <- Index 100
		if(replayMode)
		{
			long proxyDataRecordId =1655106427329L;
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






		// --- HTTP REQUEST: Test [101] <- WEB ADMIN Index 195 ---
		String requestProt0101 = "https";
		String requestHost0101 = "consumer.fis.boh.com";
		int    requestPort0101 = 443;
		String requestFile0101 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0101 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJY2RiZTcwOGYtNWM1YS00OGUwLTllODItZmE0MjMyMDYwY2ZjCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5OTQJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCTBlY2FhMGRjLTMzMzMtNGYxYi1hM2QxLWU0MWYwOThlZDZlMAo=\"},\"_lang\":\"en\",\"_params\":[\"Person\",\"MY_NOTIFICATIONS\"],\"businessContext\":null}";
		String requestHeader0101 = "POST " + requestFile0101 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0101.getBytes().length + "\r\n" + 		// Content-Length: 336
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0101, requestHost0101, requestPort0101, requestHeader0101, requestContent0101.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0101 = null;		// support garbage collector to reduce memory
		requestContent0101 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 975
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [101] <- Index 101
		if(replayMode)
		{
			long proxyDataRecordId =1655106427368L;
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






		// --- HTTP REQUEST: Test [102] <- WEB ADMIN Index 196 ---
		String requestProt0102 = "https";
		String requestHost0102 = "consumer.fis.boh.com";
		int    requestPort0102 = 443;
		String requestFile0102 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0102 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJOWZhMTdlNjYtM2M0MC00NDk0LTgwZDItZjJjYWJhOGNkZGNkCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5OTUJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCTNiOTBlMWVmLTFmMjQtNGYyYS04NjJlLTUyMGRmNWY1MGJmNgo=\"},\"_lang\":\"en\",\"_params\":[\"Person\",\"PAYMENTS_FEATURE\"],\"businessContext\":null}";
		String requestHeader0102 = "POST " + requestFile0102 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0102.getBytes().length + "\r\n" + 		// Content-Length: 336
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0102, requestHost0102, requestPort0102, requestHeader0102, requestContent0102.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0102 = null;		// support garbage collector to reduce memory
		requestContent0102 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 2510
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [102] <- Index 102
		if(replayMode)
		{
			long proxyDataRecordId =1655106427400L;
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






		// --- HTTP REQUEST: Test [103] <- WEB ADMIN Index 197 ---
		String requestProt0103 = "https";
		String requestHost0103 = "consumer.fis.boh.com";
		int    requestPort0103 = 443;
		String requestFile0103 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0103 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJYzc0OGExOWMtYzFmZS00YTM0LWI4OTYtZWE3NTI3MTBhNjllCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5OTcJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWIwOTdjYzg3LWVmNDQtNGE0My1hMzM0LTM1NmQ0MmZlNDY2MQo=\"},\"_params\":[\"Person\",\"CARD_MANAGEMENT_FEATURE\"],\"businessContext\":null,\"_lang\":\"en\"}";
		String requestHeader0103 = "POST " + requestFile0103 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0103.getBytes().length + "\r\n" + 		// Content-Length: 343
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0103, requestHost0103, requestPort0103, requestHeader0103, requestContent0103.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0103 = null;		// support garbage collector to reduce memory
		requestContent0103 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 2155
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [103] <- Index 103
		if(replayMode)
		{
			long proxyDataRecordId =1655106427425L;
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






		// --- HTTP REQUEST: Test [104] <- WEB ADMIN Index 198 ---
		String requestProt0104 = "https";
		String requestHost0104 = "consumer.fis.boh.com";
		int    requestPort0104 = 443;
		String requestFile0104 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0104 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJOWFiYzYwOGQtNTI0Ni00ZmU5LWFkZDItZmZmNjQyNjFhNmZkCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjU5OTgJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCTI1ZjBhMzNjLWNjN2UtNDhjOS1hM2VhLWYzN2ExODkxOTc0Mgo=\"},\"_lang\":\"en\",\"businessContext\":null,\"_params\":[\"Person\",\"CREDIT_CARD_PAYMENTS_FEATURE\"]}";
		String requestHeader0104 = "POST " + requestFile0104 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0104.getBytes().length + "\r\n" + 		// Content-Length: 348
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0104, requestHost0104, requestPort0104, requestHeader0104, requestContent0104.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0104 = null;		// support garbage collector to reduce memory
		requestContent0104 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 517
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [104] <- Index 104
		if(replayMode)
		{
			long proxyDataRecordId =1655106427542L;
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






		// --- HTTP REQUEST: Test [105] <- WEB ADMIN Index 199 ---
		String requestProt0105 = "https";
		String requestHost0105 = "consumer.fis.boh.com";
		int    requestPort0105 = 443;
		String requestFile0105 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0105 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJY2U0YzkzZGItMDVlMi00YjkxLTg1YmQtNjk5MDM0MGI1ZjUxCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMDIJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCTRiYmIzMDRiLTg4YWItNDY2ZC1iNjY4LWIxNzg3MzlhOTBhMQo=\"},\"_lang\":\"en\",\"_params\":[\"Person\",\"EDOCUMENTS_FEATURE\"],\"businessContext\":null}";
		String requestHeader0105 = "POST " + requestFile0105 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0105.getBytes().length + "\r\n" + 		// Content-Length: 338
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0105, requestHost0105, requestPort0105, requestHeader0105, requestContent0105.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0105 = null;		// support garbage collector to reduce memory
		requestContent0105 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 1425
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [105] <- Index 105
		if(replayMode)
		{
			long proxyDataRecordId =1655106427653L;
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






		// --- HTTP REQUEST: Test [106] <- WEB ADMIN Index 200 ---
		String requestProt0106 = "https";
		String requestHost0106 = "consumer.fis.boh.com";
		int    requestPort0106 = 443;
		String requestFile0106 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0106 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZTdlZTk5ZmItM2NjYy00ZmE5LTg4NzktN2I1ZjMxMzMxMWY5CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMDMJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWJiODY1MTM3LTQzMWMtNGU0Mi1hNzc4LTM1YWQ1NWMxMmRmMwo=\"},\"_lang\":\"en\",\"_params\":[\"Person\",\"ENROLLMENT_FEATURE\"],\"businessContext\":null}";
		String requestHeader0106 = "POST " + requestFile0106 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0106.getBytes().length + "\r\n" + 		// Content-Length: 338
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0106, requestHost0106, requestPort0106, requestHeader0106, requestContent0106.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0106 = null;		// support garbage collector to reduce memory
		requestContent0106 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 118
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [106] <- Index 106
		if(replayMode)
		{
			long proxyDataRecordId =1655106427686L;
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






		// --- HTTP REQUEST: Test [107] <- WEB ADMIN Index 201 ---
		String requestProt0107 = "https";
		String requestHost0107 = "consumer.fis.boh.com";
		int    requestPort0107 = 443;
		String requestFile0107 = "/consumer-sb/service/d1/GetMessageLabelsSVC";
		String requestContent0107 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZjJiMjViZDEtOTFiNC00NzRjLTlkMzYtOGUwZjM1MGU4NDY4CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMDQJCUdldE1lc3NhZ2VMYWJlbHNTVkMJCWVuCWQyM2NhZWFkLTRlYzAtNGNmOC05YmY3LWE1MWNjZmZkNTRlZAo=\"},\"_operation\":\"GET\",\"_lang\":\"en\",\"_params\":[\"digitalBANKING\"],\"_optionalParams\":null,\"businessContext\":null}";
		String requestHeader0107 = "POST " + requestFile0107 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0107.getBytes().length + "\r\n" + 		// Content-Length: 355
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0107, requestHost0107, requestPort0107, requestHeader0107, requestContent0107.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0107 = null;		// support garbage collector to reduce memory
		requestContent0107 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 11255
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [107] <- Index 107
		if(replayMode)
		{
			long proxyDataRecordId =1655106427706L;
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






		// --- HTTP REQUEST: Test [108] <- WEB ADMIN Index 202 ---
		String requestProt0108 = "https";
		String requestHost0108 = "consumer.fis.boh.com";
		int    requestPort0108 = 443;
		String requestFile0108 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0108 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMDIzMTA5NzAtZmNjZi00M2Q2LTk2MDUtMzIyNmRjZGM5MWFlCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMDUJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWJhZTAzOTY0LTBhM2MtNGEzMS1iNzQ1LWJjMDQ3NDdmODczMwo=\"},\"_lang\":\"en\",\"businessContext\":null,\"_params\":[\"Person\",\"LOGOUT_FEATURE\"]}";
		String requestHeader0108 = "POST " + requestFile0108 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0108.getBytes().length + "\r\n" + 		// Content-Length: 334
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0108, requestHost0108, requestPort0108, requestHeader0108, requestContent0108.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0108 = null;		// support garbage collector to reduce memory
		requestContent0108 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 790
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [108] <- Index 108
		if(replayMode)
		{
			long proxyDataRecordId =1655106427734L;
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




		// all http requests of page #2_1 successful done
		return true;
	}


	/**
	 * Recorded http requests of page #2_2.
	 *
	 * @return  true:  method successful completed.
	 *          false: method/loop failed.
	 */
	boolean executePage_2_2(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext,int innerLoopCounter, int totalInnerLoopCount, Object httpLogVectorObject) throws Exception
	{
		// ... continuing page #2 (fragment 3 of 7)
		// ----------------------------------------



		// --- HTTP REQUEST: Test [109] <- WEB ADMIN Index 203 ---
		String requestProt0109 = "https";
		String requestHost0109 = "consumer.fis.boh.com";
		int    requestPort0109 = 443;
		String requestFile0109 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0109 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJNWYzOGUyODEtZTVkNC00ZDNhLThjMzAtYTJlOGZkNDJiMTRhCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMDYJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWQ0MmMxYjg4LWJiNTktNDMwNS05Y2NkLWRlNjM2NDE3OTQ5ZAo=\"},\"_lang\":\"en\",\"_params\":[\"\",\"MYPROFILE_PREFERENCES_FEATURE\"],\"businessContext\":null}";
		String requestHeader0109 = "POST " + requestFile0109 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0109.getBytes().length + "\r\n" + 		// Content-Length: 343
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0109, requestHost0109, requestPort0109, requestHeader0109, requestContent0109.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0109 = null;		// support garbage collector to reduce memory
		requestContent0109 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 118
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [109] <- Index 109
		if(replayMode)
		{
			long proxyDataRecordId =1655106427766L;
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






		// --- HTTP REQUEST: Test [110] <- WEB ADMIN Index 204 ---
		String requestProt0110 = "https";
		String requestHost0110 = "consumer.fis.boh.com";
		int    requestPort0110 = 443;
		String requestFile0110 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0110 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMWJhM2NjMDktNzY0Ni00NWRiLTlmZTUtOWUwYWQzZmEyZjIwCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMDgJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCTUxMzkwODFmLWU3YjUtNDEzYy1iMzlkLTVjMWZiNWM3NWQwMQo=\"},\"_lang\":\"en\",\"_params\":[\"Person\",\"SECURE_MESSAGES_FEATURE\"],\"businessContext\":null}";
		String requestHeader0110 = "POST " + requestFile0110 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0110.getBytes().length + "\r\n" + 		// Content-Length: 343
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0110, requestHost0110, requestPort0110, requestHeader0110, requestContent0110.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0110 = null;		// support garbage collector to reduce memory
		requestContent0110 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 517
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [110] <- Index 110
		if(replayMode)
		{
			long proxyDataRecordId =1655106427877L;
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






		// --- HTTP REQUEST: Test [111] <- WEB ADMIN Index 205 ---
		String requestProt0111 = "https";
		String requestHost0111 = "consumer.fis.boh.com";
		int    requestPort0111 = 443;
		String requestFile0111 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0111 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMmI3YTg4ZDMtNGEwNS00MmJiLTkzMzAtN2JiZGE1ZGNhNTg2CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMDkJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWI1NTM1NjFlLTY1NzMtNDJiYy1hN2E0LWI1MmI3N2JjMmY5YQo=\"},\"_lang\":\"en\",\"_params\":[\"Person\",\"MYPROFILE_PREFERENCES_FEATURE\"],\"businessContext\":null}";
		String requestHeader0111 = "POST " + requestFile0111 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0111.getBytes().length + "\r\n" + 		// Content-Length: 349
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0111, requestHost0111, requestPort0111, requestHeader0111, requestContent0111.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0111 = null;		// support garbage collector to reduce memory
		requestContent0111 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 5437
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [111] <- Index 111
		if(replayMode)
		{
			long proxyDataRecordId =1655106427993L;
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






		// --- HTTP REQUEST: Test [112] <- WEB ADMIN Index 206 ---
		String requestProt0112 = "https";
		String requestHost0112 = "consumer.fis.boh.com";
		int    requestPort0112 = 443;
		String requestFile0112 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0112 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMWU0ZTRkM2MtZTBhNS00ZWRjLWJiYmEtZmIxOGE3OTIwMzc4CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMTAJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWU1MTI3MTViLTM5MzUtNDdkZi1hMmUzLWIwNGJjYWMxODVhNgo=\"},\"_lang\":\"en\",\"_params\":[\"Person\",\"SCHEDULE_TRANSFER_FEATURE\"],\"businessContext\":null}";
		String requestHeader0112 = "POST " + requestFile0112 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0112.getBytes().length + "\r\n" + 		// Content-Length: 345
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0112, requestHost0112, requestPort0112, requestHeader0112, requestContent0112.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0112 = null;		// support garbage collector to reduce memory
		requestContent0112 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 3592
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [112] <- Index 112
		if(replayMode)
		{
			long proxyDataRecordId =1655106428017L;
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






		// --- HTTP REQUEST: Test [113] <- WEB ADMIN Index 207 ---
		String requestProt0113 = "https";
		String requestHost0113 = "consumer.fis.boh.com";
		int    requestPort0113 = 443;
		String requestFile0113 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0113 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZjQ3OWYxYTktYWIyZi00ZmJlLThkNTQtZTFmYmEwNDViYjA4CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMTEJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCTRjNTJjYzQ0LTIwYzgtNGFmMi04MGE4LTQ1ZDAxN2M3MTQ3Mwo=\"},\"_lang\":\"en\",\"_params\":[\"Person\",\"PAYMENTS_FEATURE\"],\"businessContext\":null}";
		String requestHeader0113 = "POST " + requestFile0113 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0113.getBytes().length + "\r\n" + 		// Content-Length: 336
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0113, requestHost0113, requestPort0113, requestHeader0113, requestContent0113.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0113 = null;		// support garbage collector to reduce memory
		requestContent0113 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 2510
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [113] <- Index 113
		if(replayMode)
		{
			long proxyDataRecordId =1655106428056L;
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






		// --- HTTP REQUEST: Test [114] <- WEB ADMIN Index 208 ---
		String requestProt0114 = "https";
		String requestHost0114 = "consumer.fis.boh.com";
		int    requestPort0114 = 443;
		String requestFile0114 = "/consumer-sb/service/d1/AOFAQsSVC";
		String requestContent0114 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJYmQ5NzUwYzktZGRmMC00NmZkLTk1ZmUtMjA2NmYxYzcxNDQyCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMTMJCUFPRkFRc1NWQwkJZW4JMTNmYWEyOTYtNzIxYS00NWUyLTkxZmYtZGI3YmQ0ODgzZTY5Cg==\"},\"_lang\":\"en\",\"_params\":[\"default-all-all\",\"en\",\"digitalBANKING\",\"digitalBanking\"]}";
		String requestHeader0114 = "POST " + requestFile0114 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0114.getBytes().length + "\r\n" + 		// Content-Length: 318
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0114, requestHost0114, requestPort0114, requestHeader0114, requestContent0114.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0114 = null;		// support garbage collector to reduce memory
		requestContent0114 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 13012
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [114] <- Index 114
		if(replayMode)
		{
			long proxyDataRecordId =1655106428068L;
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






		// --- HTTP REQUEST: Test [115] <- WEB ADMIN Index 209 ---
		String requestProt0115 = "https";
		String requestHost0115 = "consumer.fis.boh.com";
		int    requestPort0115 = 443;
		String requestFile0115 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0115 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJYzg2ODI0ZWQtMzkzYS00ZmVhLWJmOGItMzdlMGNmNTllNGYwCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMTYJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCTAwNmZjNWZiLTUwNTQtNGU5ZC1hMDUyLWQzZDY1NmMxYTgyYgo=\"},\"_lang\":\"en\",\"_params\":[\"\",\"CARD_MANAGEMENT_FEATURE\"],\"businessContext\":null}";
		String requestHeader0115 = "POST " + requestFile0115 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0115.getBytes().length + "\r\n" + 		// Content-Length: 337
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0115, requestHost0115, requestPort0115, requestHeader0115, requestContent0115.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0115 = null;		// support garbage collector to reduce memory
		requestContent0115 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 118
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [115] <- Index 115
		if(replayMode)
		{
			long proxyDataRecordId =1655106428118L;
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






		// --- HTTP REQUEST: Test [116] <- WEB ADMIN Index 210 ---
		String requestProt0116 = "https";
		String requestHost0116 = "consumer.fis.boh.com";
		int    requestPort0116 = 443;
		String requestFile0116 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0116 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZTVkNjY5ZDEtNDk4Ni00NGEyLTgzOTYtMzQwZTVlNDYwNWNkCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMTkJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCTMyMzhkMDgyLTgwMWMtNDk0MC04NGMwLTllYzA1ZDg2ZDlkYwo=\"},\"_lang\":\"en\",\"businessContext\":null,\"_params\":[\"\",\"CONSUMER_DASHBOARD_FEATURE\"]}";
		String requestHeader0116 = "POST " + requestFile0116 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0116.getBytes().length + "\r\n" + 		// Content-Length: 340
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0116, requestHost0116, requestPort0116, requestHeader0116, requestContent0116.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0116 = null;		// support garbage collector to reduce memory
		requestContent0116 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 118
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [116] <- Index 116
		if(replayMode)
		{
			long proxyDataRecordId =1655106428219L;
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






		// --- HTTP REQUEST: Test [117] <- WEB ADMIN Index 211 ---
		String requestProt0117 = "https";
		String requestHost0117 = "consumer.fis.boh.com";
		int    requestPort0117 = 443;
		String requestFile0117 = "/consumer-sb/service/d1/GetConsumerDisclosuresSVC";
		String requestContent0117 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJYzMzNjNkMjUtZDkxYy00NWYwLWExMTQtN2IwNWEyN2Q4OTcyCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMjAJCUdldENvbnN1bWVyRGlzY2xvc3VyZXNTVkMJCWVuCWFmYTkxMjlmLTc2MzgtNDlmNy1hOWNiLWVjNTlhOWIzYTU1Mwo=\"},\"_lang\":\"en\",\"_operation\":\"GET\",\"_optionalParams\":null,\"_params\":[\"digitalBANKING\",\"5\"]}";
		String requestHeader0117 = "POST " + requestFile0117 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0117.getBytes().length + "\r\n" + 		// Content-Length: 344
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0117, requestHost0117, requestPort0117, requestHeader0117, requestContent0117.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0117 = null;		// support garbage collector to reduce memory
		requestContent0117 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 1381
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [117] <- Index 117
		if(replayMode)
		{
			long proxyDataRecordId =1655106428333L;
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






		// --- HTTP REQUEST: Test [118] <- WEB ADMIN Index 212 ---
		String requestProt0118 = "https";
		String requestHost0118 = "consumer.fis.boh.com";
		int    requestPort0118 = 443;
		String requestFile0118 = "/consumer-sb/service/d1/RetrieveUserSVC";
		String requestContent0118 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJYmU4NTUzYjktOTQwMy00NjM5LTgwZGItODQ3MWYxM2M1ZmY3CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMjEJCVJldHJpZXZlVXNlclNWQwkJZW4JZTMyYTlhOTctZjZmZS00OWE3LWE3NjEtYjdhODMxYmFiZmJiCg==\"},\"_lang\":\"en\",\"_params\":[\"&loginName=PORTALTEST2023_D1\"]}";
		String requestHeader0118 = "POST " + requestFile0118 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0118.getBytes().length + "\r\n" + 		// Content-Length: 300
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0118, requestHost0118, requestPort0118, requestHeader0118, requestContent0118.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0118 = null;		// support garbage collector to reduce memory
		requestContent0118 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 891
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [118] <- Index 118
		if(replayMode)
		{
			long proxyDataRecordId =1655106428358L;
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






		// --- HTTP REQUEST: Test [119] <- WEB ADMIN Index 213 ---
		String requestProt0119 = "https";
		String requestHost0119 = "consumer.fis.boh.com";
		int    requestPort0119 = 443;
		String requestFile0119 = "/consumer-sb/service/d1/CodeLookupSVC";
		String requestContent0119 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZjAyYWRhNDQtYmZkZS00YTE4LThiMzQtMzYwZTc4OTQ2ZjA1CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMjIJCUNvZGVMb29rdXBTVkMJCWVuCTVkYmI3ZGI4LTJmYzktNDQ0ZS05ZmQwLWM0NDRlNGVlZGEwMgo=\"},\"_lang\":\"en\",\"_op\":null,\"_p\":\"BILLPAY_PAYEE_CATEGORY\",\"businessContext\":null}";
		String requestHeader0119 = "POST " + requestFile0119 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0119.getBytes().length + "\r\n" + 		// Content-Length: 317
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0119, requestHost0119, requestPort0119, requestHeader0119, requestContent0119.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0119 = null;		// support garbage collector to reduce memory
		requestContent0119 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 199
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [119] <- Index 119
		if(replayMode)
		{
			long proxyDataRecordId =1655106428400L;
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






		// --- HTTP REQUEST: Test [120] <- WEB ADMIN Index 214 ---
		String requestProt0120 = "https";
		String requestHost0120 = "consumer.fis.boh.com";
		int    requestPort0120 = 443;
		String requestFile0120 = "/consumer-sb/service/d1/CodeLookupSVC";
		String requestContent0120 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJYTM1MjFlNzYtZDdjZS00ZjU2LWE3YTUtNGEzOTBhODMwYzI2CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMjMJCUNvZGVMb29rdXBTVkMJCWVuCTg0OTNiYjdlLWMyNTktNGY3Mi04M2UzLTFmZWFkNTZjMDQ4Nwo=\"},\"_lang\":\"en\",\"_p\":\"BILL_PAY_ACTIVITY_SEARCH_STATUS\",\"businessContext\":null,\"_op\":null}";
		String requestHeader0120 = "POST " + requestFile0120 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0120.getBytes().length + "\r\n" + 		// Content-Length: 326
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0120, requestHost0120, requestPort0120, requestHeader0120, requestContent0120.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0120 = null;		// support garbage collector to reduce memory
		requestContent0120 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 372
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [120] <- Index 120
		if(replayMode)
		{
			long proxyDataRecordId =1655106428413L;
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






		// --- HTTP REQUEST: Test [121] <- WEB ADMIN Index 215 ---
		String requestProt0121 = "https";
		String requestHost0121 = "consumer.fis.boh.com";
		int    requestPort0121 = 443;
		String requestFile0121 = "/consumer-sb/service/d1/CodeLookupSVC";
		String requestContent0121 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJNGQ0YWNjOTItNmZlNS00ZGI4LWFlNzMtMzY0ZjVlZDU4ZTcwCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMjUJCUNvZGVMb29rdXBTVkMJCWVuCTFiNjM1ZDJjLTRmNTctNDY1Zi05MDBhLWI2MGViN2U1ZmJiNQo=\"},\"_lang\":\"en\",\"_op\":null,\"_p\":\"CARD_CONTROL_TYPES\",\"businessContext\":null}";
		String requestHeader0121 = "POST " + requestFile0121 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0121.getBytes().length + "\r\n" + 		// Content-Length: 313
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0121, requestHost0121, requestPort0121, requestHeader0121, requestContent0121.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0121 = null;		// support garbage collector to reduce memory
		requestContent0121 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 228
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [121] <- Index 121
		if(replayMode)
		{
			long proxyDataRecordId =1655106428467L;
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






		// --- HTTP REQUEST: Test [122] <- WEB ADMIN Index 216 ---
		String requestProt0122 = "https";
		String requestHost0122 = "consumer.fis.boh.com";
		int    requestPort0122 = 443;
		String requestFile0122 = "/consumer-sb/service/d1/CodeLookupSVC";
		String requestContent0122 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJY2M0Y2Y1ZmUtNjdmNS00NjZiLWI5NWUtZGE1MWMzMjM4YjE3CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMjUJCUNvZGVMb29rdXBTVkMJCWVuCTk2NDFhMThkLWFmMWItNGUzNi05Yjk0LTQ0NGE4MTNiYTRhOQo=\"},\"_lang\":\"en\",\"_op\":null,\"_p\":\"ISO_COUNTRY_CODE\",\"businessContext\":null}";
		String requestHeader0122 = "POST " + requestFile0122 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0122.getBytes().length + "\r\n" + 		// Content-Length: 311
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0122, requestHost0122, requestPort0122, requestHeader0122, requestContent0122.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0122 = null;		// support garbage collector to reduce memory
		requestContent0122 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 2509
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [122] <- Index 122
		if(replayMode)
		{
			long proxyDataRecordId =1655106428552L;
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






		// --- HTTP REQUEST: Test [123] <- WEB ADMIN Index 217 ---
		String requestProt0123 = "https";
		String requestHost0123 = "consumer.fis.boh.com";
		int    requestPort0123 = 443;
		String requestFile0123 = "/consumer-sb/service/d1/CodeLookupSVC";
		String requestContent0123 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMDlhZjQ2NjEtODYyMS00OGNhLThjYTItNDA3ZmZjYzZhYjA1CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMjYJCUNvZGVMb29rdXBTVkMJCWVuCWJmNzIzNjJjLTU4NDUtNGQ0Ny1iNzY5LTI2NDU5NmM0NjIwNAo=\"},\"_lang\":\"en\",\"_op\":null,\"_p\":\"COUNTRY_CODE\",\"businessContext\":null}";
		String requestHeader0123 = "POST " + requestFile0123 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0123.getBytes().length + "\r\n" + 		// Content-Length: 307
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0123, requestHost0123, requestPort0123, requestHeader0123, requestContent0123.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0123 = null;		// support garbage collector to reduce memory
		requestContent0123 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 2264
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [123] <- Index 123
		if(replayMode)
		{
			long proxyDataRecordId =1655106428675L;
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






		// --- HTTP REQUEST: Test [124] <- WEB ADMIN Index 218 ---
		String requestProt0124 = "https";
		String requestHost0124 = "consumer.fis.boh.com";
		int    requestPort0124 = 443;
		String requestFile0124 = "/consumer-sb/service/d1/CodeLookupSVC";
		String requestContent0124 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJN2U3MzRjZjAtNTA0Zi00ODQwLTgyYmEtOGQxZjczZTExMDBmCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMjkJCUNvZGVMb29rdXBTVkMJCWVuCTRiY2FlZjZhLTI1ZDYtNDQwMS1hODBiLWJmNWFkMGZkYjc5Ywo=\"},\"_lang\":\"en\",\"_op\":null,\"businessContext\":null,\"_p\":\"EMAIL_TYPE\"}";
		String requestHeader0124 = "POST " + requestFile0124 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0124.getBytes().length + "\r\n" + 		// Content-Length: 305
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0124, requestHost0124, requestPort0124, requestHeader0124, requestContent0124.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0124 = null;		// support garbage collector to reduce memory
		requestContent0124 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 139
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [124] <- Index 124
		if(replayMode)
		{
			long proxyDataRecordId =1655106428735L;
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






		// --- HTTP REQUEST: Test [125] <- WEB ADMIN Index 219 ---
		String requestProt0125 = "https";
		String requestHost0125 = "consumer.fis.boh.com";
		int    requestPort0125 = 443;
		String requestFile0125 = "/consumer-sb/service/d1/CodeLookupSVC";
		String requestContent0125 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMjUxNGQ5MzMtNGU4My00YjI1LWEwNzUtN2YwYjJlNTliZjRjCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMzEJCUNvZGVMb29rdXBTVkMJCWVuCThjZGMzNjhhLThiOWYtNDAxNS1iMmI5LTYxZmIwNDI0MWRjMgo=\"},\"_p\":\"CARD_MERCHANT_TYPES\",\"_op\":null,\"businessContext\":null,\"_lang\":\"en\"}";
		String requestHeader0125 = "POST " + requestFile0125 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0125.getBytes().length + "\r\n" + 		// Content-Length: 314
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0125, requestHost0125, requestPort0125, requestHeader0125, requestContent0125.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0125 = null;		// support garbage collector to reduce memory
		requestContent0125 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 250
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [125] <- Index 125
		if(replayMode)
		{
			long proxyDataRecordId =1655106428749L;
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






		// --- HTTP REQUEST: Test [126] <- WEB ADMIN Index 220 ---
		String requestProt0126 = "https";
		String requestHost0126 = "consumer.fis.boh.com";
		int    requestPort0126 = 443;
		String requestFile0126 = "/consumer-sb/service/d1/CodeLookupSVC";
		String requestContent0126 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJNDE2ZGZiOTQtNmUwOS00NWFkLTg1ZDgtNjY4NTU4ZTU3NjJjCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMzQJCUNvZGVMb29rdXBTVkMJCWVuCTJhNjNmNDE4LWYyMzMtNGJkZS05NzQ2LTNkYjk0MGE0ZTVlNgo=\"},\"_lang\":\"en\",\"_op\":null,\"_p\":\"PHONE_TYPE\",\"businessContext\":null}";
		String requestHeader0126 = "POST " + requestFile0126 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0126.getBytes().length + "\r\n" + 		// Content-Length: 305
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0126, requestHost0126, requestPort0126, requestHeader0126, requestContent0126.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0126 = null;		// support garbage collector to reduce memory
		requestContent0126 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 158
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [126] <- Index 126
		if(replayMode)
		{
			long proxyDataRecordId =1655106428811L;
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






		// --- HTTP REQUEST: Test [127] <- WEB ADMIN Index 221 ---
		String requestProt0127 = "https";
		String requestHost0127 = "consumer.fis.boh.com";
		int    requestPort0127 = 443;
		String requestFile0127 = "/consumer-sb/service/d1/CodeLookupSVC";
		String requestContent0127 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZDBkMWIwMzQtNGMyZi00NThlLWEzZWQtMjkxNzFlOGZiOGY1CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMzcJCUNvZGVMb29rdXBTVkMJCWVuCTQ5ZTg5NjBlLTk2NzYtNGQzNC1hZjJjLTZlODUzNWQxMjZlYgo=\"},\"_lang\":\"en\",\"businessContext\":null,\"_op\":null,\"_p\":\"BUSINESS_PHONE_TYPE\"}";
		String requestHeader0127 = "POST " + requestFile0127 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0127.getBytes().length + "\r\n" + 		// Content-Length: 314
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0127, requestHost0127, requestPort0127, requestHeader0127, requestContent0127.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0127 = null;		// support garbage collector to reduce memory
		requestContent0127 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 139
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [127] <- Index 127
		if(replayMode)
		{
			long proxyDataRecordId =1655106428894L;
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






		// --- HTTP REQUEST: Test [128] <- WEB ADMIN Index 222 ---
		String requestProt0128 = "https";
		String requestHost0128 = "consumer.fis.boh.com";
		int    requestPort0128 = 443;
		String requestFile0128 = "/consumer-sb/service/d1/CodeLookupSVC";
		String requestContent0128 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJOGYxMTU4ZWEtYWExNS00ZWYwLWJlN2EtMGMwYjg3ZjU2ZWZhCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwMzkJCUNvZGVMb29rdXBTVkMJCWVuCTBjODEzNDNiLWUxYTMtNDE1ZS1hM2IyLWU1NTg5NDE1ZTE4ZQo=\"},\"_lang\":\"en\",\"_op\":null,\"_p\":\"STATE_CODE\",\"businessContext\":null}";
		String requestHeader0128 = "POST " + requestFile0128 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0128.getBytes().length + "\r\n" + 		// Content-Length: 305
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0128, requestHost0128, requestPort0128, requestHeader0128, requestContent0128.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0128 = null;		// support garbage collector to reduce memory
		requestContent0128 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 875
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [128] <- Index 128
		if(replayMode)
		{
			long proxyDataRecordId =1655106429012L;
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




		// all http requests of page #2_2 successful done
		return true;
	}


	/**
	 * Recorded http requests of page #2_3.
	 *
	 * @return  true:  method successful completed.
	 *          false: method/loop failed.
	 */
	boolean executePage_2_3(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext,int innerLoopCounter, int totalInnerLoopCount, Object httpLogVectorObject) throws Exception
	{
		// ... continuing page #2 (fragment 4 of 7)
		// ----------------------------------------



		// --- HTTP REQUEST: Test [129] <- WEB ADMIN Index 223 ---
		String requestProt0129 = "https";
		String requestHost0129 = "consumer.fis.boh.com";
		int    requestPort0129 = 443;
		String requestFile0129 = "/consumer-sb/service/d1/CodeLookupSVC";
		String requestContent0129 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJNDFjZDVjNWYtOGQyNC00ZGRkLWE0YzgtNzAyZDUxNDZjYjI0CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MjYwNDAJCUNvZGVMb29rdXBTVkMJCWVuCWM3YmIyZjhlLWQzM2MtNGVmOC04NTUxLWQyNmFkYjA0MjAwNgo=\"},\"_lang\":\"en\",\"_op\":null,\"_p\":\"CARD_TRANSACTION_TYPES\",\"businessContext\":null}";
		String requestHeader0129 = "POST " + requestFile0129 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0129.getBytes().length + "\r\n" + 		// Content-Length: 317
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0129, requestHost0129, requestPort0129, requestHeader0129, requestContent0129.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0129 = null;		// support garbage collector to reduce memory
		requestContent0129 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 221
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [129] <- Index 129
		if(replayMode)
		{
			long proxyDataRecordId =1655106429065L;
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






		// --- HTTP REQUEST: Test [130] <- WEB ADMIN Index 224 ---
		String requestProt0130 = "https";
		String requestHost0130 = "consumer.fis.boh.com";
		int    requestPort0130 = 443;
		String requestFile0130 = "/D1BOHConsumer/services/prefabs/LCD_Dashboard_Feature_Navigation/servicedefs";
		String requestHeader0130 = "GET " + requestFile0130 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0130, requestHost0130, requestPort0130, requestHeader0130, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0130 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 61
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [130] <- Index 130
		if(replayMode)
		{
			long proxyDataRecordId =1655106429103L;
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






		// --- HTTP REQUEST: Test [131] <- WEB ADMIN Index 225 ---
		String requestProt0131 = "https";
		String requestHost0131 = "consumer.fis.boh.com";
		int    requestPort0131 = 443;
		String requestFile0131 = "/D1BOHConsumer/services/prefabs/LCD_Dashboard_Notifications/servicedefs";
		String requestHeader0131 = "GET " + requestFile0131 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0131, requestHost0131, requestPort0131, requestHeader0131, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0131 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 520
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [131] <- Index 131
		if(replayMode)
		{
			long proxyDataRecordId =1655106429150L;
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






		// --- HTTP REQUEST: Test [132] <- WEB ADMIN Index 226 ---
		String requestProt0132 = "https";
		String requestHost0132 = "consumer.fis.boh.com";
		int    requestPort0132 = 443;
		String requestFile0132 = "/D1BOHConsumer/services/prefabs/LCD_Dashboard_Greeting/servicedefs";
		String requestHeader0132 = "GET " + requestFile0132 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0132, requestHost0132, requestPort0132, requestHeader0132, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0132 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 61
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [132] <- Index 132
		if(replayMode)
		{
			long proxyDataRecordId =1655106429226L;
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






		// --- HTTP REQUEST: Test [133] <- WEB ADMIN Index 227 ---
		String requestProt0133 = "https";
		String requestHost0133 = "consumer.fis.boh.com";
		int    requestPort0133 = 443;
		String requestFile0133 = "/D1BOHConsumer/services/prefabs/LCD_COMMONS_HELP/servicedefs";
		String requestHeader0133 = "GET " + requestFile0133 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0133, requestHost0133, requestPort0133, requestHeader0133, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0133 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 61
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [133] <- Index 133
		if(replayMode)
		{
			long proxyDataRecordId =1655106429337L;
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






		// --- HTTP REQUEST: Test [134] <- WEB ADMIN Index 228 ---
		String requestProt0134 = "https";
		String requestHost0134 = "consumer.fis.boh.com";
		int    requestPort0134 = 443;
		String requestFile0134 = "/D1BOHConsumer/services/prefabs/LCD_COMMONS_FOOTER/servicedefs";
		String requestHeader0134 = "GET " + requestFile0134 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0134, requestHost0134, requestPort0134, requestHeader0134, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0134 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 625
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [134] <- Index 134
		if(replayMode)
		{
			long proxyDataRecordId =1655106429418L;
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






		// --- HTTP REQUEST: Test [135] <- WEB ADMIN Index 229 ---
		String requestProt0135 = "https";
		String requestHost0135 = "consumer.fis.boh.com";
		int    requestPort0135 = 443;
		String requestFile0135 = "/D1BOHConsumer/ng-bundle/80-es2015.a2447449c060e387e937.js";
		String requestHeader0135 = "GET " + requestFile0135 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0135, requestHost0135, requestPort0135, requestHeader0135, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0135 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [136] <- WEB ADMIN Index 230 ---
		String requestProt0136 = "https";
		String requestHost0136 = "consumer.fis.boh.com";
		int    requestPort0136 = 443;
		String requestFile0136 = "/D1BOHConsumer/ng-bundle/158-es2015.a26703e3fc455e59ecbe.js";
		String requestHeader0136 = "GET " + requestFile0136 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0136, requestHost0136, requestPort0136, requestHeader0136, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0136 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [137] <- WEB ADMIN Index 231 ---
		String requestProt0137 = "https";
		String requestHost0137 = "consumer.fis.boh.com";
		int    requestPort0137 = 443;
		String requestFile0137 = "/D1BOHConsumer/ng-bundle/37-es2015.d0c8f6f18da858aef278.js";
		String requestHeader0137 = "GET " + requestFile0137 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0137, requestHost0137, requestPort0137, requestHeader0137, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0137 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [138] <- WEB ADMIN Index 232 ---
		String requestProt0138 = "https";
		String requestHost0138 = "consumer.fis.boh.com";
		int    requestPort0138 = 443;
		String requestFile0138 = "/D1BOHConsumer/ng-bundle/45-es2015.687d8ce05bdbc14c34cc.js";
		String requestHeader0138 = "GET " + requestFile0138 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0138, requestHost0138, requestPort0138, requestHeader0138, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0138 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [139] <- WEB ADMIN Index 233 ---
		String requestProt0139 = "https";
		String requestHost0139 = "consumer.fis.boh.com";
		int    requestPort0139 = 443;
		String requestFile0139 = "/D1BOHConsumer/ng-bundle/266-es2015.80bdae09e427b3bb8d85.js";
		String requestHeader0139 = "GET " + requestFile0139 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0139, requestHost0139, requestPort0139, requestHeader0139, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0139 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [140] <- WEB ADMIN Index 234 ---
		String requestProt0140 = "https";
		String requestHost0140 = "consumer.fis.boh.com";
		int    requestPort0140 = 443;
		String requestFile0140 = "/consumer-sb/firesolver";
		String requestHeader0140 = "GET " + requestFile0140 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0140, requestHost0140, requestPort0140, requestHeader0140, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0140 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 1393
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [140] <- Index 140
		if(replayMode)
		{
			long proxyDataRecordId =1655106429568L;
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






		// --- HTTP REQUEST: Test [141] <- WEB ADMIN Index 235 ---
		String requestProt0141 = "https";
		String requestHost0141 = "consumer.fis.boh.com";
		int    requestPort0141 = 443;
		String requestFile0141 = "/D1BOHConsumer/ng-bundle/108-es2015.316e5d318af6df2b0aff.js";
		String requestHeader0141 = "GET " + requestFile0141 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0141, requestHost0141, requestPort0141, requestHeader0141, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0141 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [142] <- WEB ADMIN Index 236 ---
		String requestProt0142 = "https";
		String requestHost0142 = "consumer.fis.boh.com";
		int    requestPort0142 = 443;
		String requestFile0142 = "/D1BOHConsumer/ng-bundle/203-es2015.64cad4b7defc297503fb.js";
		String requestHeader0142 = "GET " + requestFile0142 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0142, requestHost0142, requestPort0142, requestHeader0142, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0142 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [143] <- WEB ADMIN Index 237 ---
		String requestProt0143 = "https";
		String requestHost0143 = "consumer.fis.boh.com";
		int    requestPort0143 = 443;
		String requestFile0143 = "/D1BOHConsumer/services/utils/convertLastLoginToLocalTimeZone" +
				"?timeZone=Asia%2FManila" +
				"&dateString=2022-06-13T07%3A43%3A49.098Z";
		String requestHeader0143 = "GET " + requestFile0143 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0143, requestHost0143, requestPort0143, requestHeader0143, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0143 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 28
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [143] <- Index 143
		if(replayMode)
		{
			long proxyDataRecordId =1655106429654L;
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






		// --- HTTP REQUEST: Test [144] <- WEB ADMIN Index 238 ---
		String requestProt0144 = "https";
		String requestHost0144 = "consumer.fis.boh.com";
		int    requestPort0144 = 443;
		String requestFile0144 = "/consumer-sb/service/d1/ContactHistoryEventNoFilterInqSVC";
		String requestContent0144 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZDllNmFlZTMtNmVjZC00MjhmLThiNjgtYTBiYjhmNWJjYzU1CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0Mjk0MTgJCUNvbnRhY3RIaXN0b3J5RXZlbnROb0ZpbHRlcklucVNWQwkJZW4JZDgxMzYxZjQtYzJmYS00NzliLTlkZjAtOGU0ZTU0YzQyOTEzCg==\"},\"_lang\":\"en\",\"_operation\":\"GET\",\"_optionalParams\":null}";
		String requestHeader0144 = "POST " + requestFile0144 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0144.getBytes().length + "\r\n" + 		// Content-Length: 323
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0144, requestHost0144, requestPort0144, requestHeader0144, requestContent0144.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0144 = null;		// support garbage collector to reduce memory
		requestContent0144 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 42788
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [144] <- Index 144
		if(replayMode)
		{
			long proxyDataRecordId =1655106429661L;
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






		// --- HTTP REQUEST: Test [145] <- WEB ADMIN Index 239 ---
		String requestProt0145 = "https";
		String requestHost0145 = "consumer.fis.boh.com";
		int    requestPort0145 = 443;
		String requestFile0145 = "/D1BOHConsumer/ng-bundle/269-es2015.157cb77bcfd70f7cce6c.js";
		String requestHeader0145 = "GET " + requestFile0145 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0145, requestHost0145, requestPort0145, requestHeader0145, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0145 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [146] <- WEB ADMIN Index 240 ---
		String requestProt0146 = "https";
		String requestHost0146 = "consumer.fis.boh.com";
		int    requestPort0146 = 443;
		String requestFile0146 = "/D1BOHConsumer/ng-bundle/13-es2015.998b4a82f63e9bdc3746.js";
		String requestHeader0146 = "GET " + requestFile0146 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0146, requestHost0146, requestPort0146, requestHeader0146, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0146 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [147] <- WEB ADMIN Index 241 ---
		String requestProt0147 = "https";
		String requestHost0147 = "consumer.fis.boh.com";
		int    requestPort0147 = 443;
		String requestFile0147 = "/D1BOHConsumer/ng-bundle/38-es2015.28f063b497787b032717.js";
		String requestHeader0147 = "GET " + requestFile0147 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0147, requestHost0147, requestPort0147, requestHeader0147, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0147 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [148] <- WEB ADMIN Index 242 ---
		String requestProt0148 = "https";
		String requestHost0148 = "consumer.fis.boh.com";
		int    requestPort0148 = 443;
		String requestFile0148 = "/D1BOHConsumer/ng-bundle/270-es2015.b48ccb1782b610522ec6.js";
		String requestHeader0148 = "GET " + requestFile0148 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0148, requestHost0148, requestPort0148, requestHeader0148, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0148 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;



		// all http requests of page #2_3 successful done
		return true;
	}


	/**
	 * Recorded http requests of page #2_4.
	 *
	 * @return  true:  method successful completed.
	 *          false: method/loop failed.
	 */
	boolean executePage_2_4(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext,int innerLoopCounter, int totalInnerLoopCount, Object httpLogVectorObject) throws Exception
	{
		// ... continuing page #2 (fragment 5 of 7)
		// ----------------------------------------



		// --- HTTP REQUEST: Test [149] <- WEB ADMIN Index 243 ---
		String requestProt0149 = "https";
		String requestHost0149 = "consumer.fis.boh.com";
		int    requestPort0149 = 443;
		String requestFile0149 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0149 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMTlkNDc3YmMtOGM5OC00NTU2LTllNTctMzJkMjJlNjk4ZDg2CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0Mjk1MjcJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWVjNmYzZmE1LWE5MjMtNDNiYS1iNGVkLTE3ZWM4YzNhZmM0Ngo=\"},\"_lang\":\"en\",\"_params\":[\"Person\",\"ACCOUNT_DETAILS_FEATURE\"]}";
		String requestHeader0149 = "POST " + requestFile0149 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0149.getBytes().length + "\r\n" + 		// Content-Length: 320
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0149, requestHost0149, requestPort0149, requestHeader0149, requestContent0149.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0149 = null;		// support garbage collector to reduce memory
		requestContent0149 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 15877
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [149] <- Index 149
		if(replayMode)
		{
			long proxyDataRecordId =1655106429828L;
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






		// --- HTTP REQUEST: Test [150] <- WEB ADMIN Index 244 ---
		String requestProt0150 = "https";
		String requestHost0150 = "consumer.fis.boh.com";
		int    requestPort0150 = 443;
		String requestFile0150 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0150 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJYTMwM2UwZGItMWRlZC00MzA1LWE2MjItZmM0MDY4MWIzOTJkCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0Mjk1MjkJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCTQwZTExMDA3LTQ5YjEtNDQ5Ni04NDE1LTFhN2VkNzdiYjQzNgo=\"},\"_lang\":\"en\",\"businessContext\":null,\"_params\":[\"Person\",\"LOGIN_DETAILS_FEATURE\"],\"_optionalParams\":null,\"_operation\":null}";
		String requestHeader0150 = "POST " + requestFile0150 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: Application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0150.getBytes().length + "\r\n" + 		// Content-Length: 382
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0150, requestHost0150, requestPort0150, requestHeader0150, requestContent0150.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0150 = null;		// support garbage collector to reduce memory
		requestContent0150 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 1456
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [150] <- Index 150
		if(replayMode)
		{
			long proxyDataRecordId =1655106429858L;
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






		// --- HTTP REQUEST: Test [151] <- WEB ADMIN Index 245 ---
		String requestProt0151 = "https";
		String requestHost0151 = "consumer.fis.boh.com";
		int    requestPort0151 = 443;
		String requestFile0151 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0151 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJOGNlNWJmMWQtOTNlMy00ZjA0LWFlYzMtOWU0MWE0NGQ3MGM5CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0Mjk1MzEJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWYwZDY1MTBhLTk4NjktNDgyNS1hOTQ3LTJhZjUyMTMzOWNhYgo=\"},\"_lang\":\"en\",\"businessContext\":null,\"_params\":[\"Person\",\"PAYMENTS_FEATURE\"]}";
		String requestHeader0151 = "POST " + requestFile0151 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0151.getBytes().length + "\r\n" + 		// Content-Length: 336
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0151, requestHost0151, requestPort0151, requestHeader0151, requestContent0151.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0151 = null;		// support garbage collector to reduce memory
		requestContent0151 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 2510
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [151] <- Index 151
		if(replayMode)
		{
			long proxyDataRecordId =1655106429912L;
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






		// --- HTTP REQUEST: Test [152] <- WEB ADMIN Index 246 ---
		String requestProt0152 = "https";
		String requestHost0152 = "consumer.fis.boh.com";
		int    requestPort0152 = 443;
		String requestFile0152 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0152 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJOTUwMjVlMDYtOTI2My00ZmJkLWEyNTMtMWMyODQ4NjA4MTM1CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0Mjk1MzQJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWJiOTU1MDg4LTNiOGMtNDNhZC04YmU0LWVlODE3MWY3MDNjMQo=\"},\"_lang\":\"en\",\"_params\":[\"Person\",\"ACCOUNT_FEATURE\"]}";
		String requestHeader0152 = "POST " + requestFile0152 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0152.getBytes().length + "\r\n" + 		// Content-Length: 312
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0152, requestHost0152, requestPort0152, requestHeader0152, requestContent0152.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0152 = null;		// support garbage collector to reduce memory
		requestContent0152 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 38795
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [152] <- Index 152
		if(replayMode)
		{
			long proxyDataRecordId =1655106429926L;
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






		// --- HTTP REQUEST: Test [153] <- WEB ADMIN Index 247 ---
		String requestProt0153 = "https";
		String requestHost0153 = "consumer.fis.boh.com";
		int    requestPort0153 = 443;
		String requestFile0153 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0153 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZTJhMDQ1MDUtZjM3NS00YTBhLThhMzUtZjFlNWZkZWJkNzk1CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0Mjk1MzcJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCTdlYTZjZDM2LWEyZGEtNDM0YS1hMWZmLWM1NDhkOWM0OGUyYgo=\"},\"_lang\":\"en\",\"_params\":[\"Person\",\"MYPROFILE_PREFERENCES_FEATURE\"],\"businessContext\":null}";
		String requestHeader0153 = "POST " + requestFile0153 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0153.getBytes().length + "\r\n" + 		// Content-Length: 349
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0153, requestHost0153, requestPort0153, requestHeader0153, requestContent0153.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0153 = null;		// support garbage collector to reduce memory
		requestContent0153 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 5437
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [153] <- Index 153
		if(replayMode)
		{
			long proxyDataRecordId =1655106429975L;
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






		// --- HTTP REQUEST: Test [154] <- WEB ADMIN Index 248 ---
		String requestProt0154 = "https";
		String requestHost0154 = "consumer.fis.boh.com";
		int    requestPort0154 = 443;
		String requestFile0154 = "/consumer-sb/service/d1/GetUserPreferencesSVC";
		String requestContent0154 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJYjI4MTRkOTctMjUwZC00NjVkLTk4N2UtMzc0N2IxMDhiOWZmCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0Mjk1NDAJCUdldFVzZXJQcmVmZXJlbmNlc1NWQwkJZW4JODJlMzlkOGUtOWE2NC00YWIzLWI0ZTUtYmJkMTU1YWJhNjUwCg==\"},\"_lang\":\"en\",\"_params\":[\"220752170\"],\"_optionalParams\":null}";
		String requestHeader0154 = "POST " + requestFile0154 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0154.getBytes().length + "\r\n" + 		// Content-Length: 312
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0154, requestHost0154, requestPort0154, requestHeader0154, requestContent0154.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0154 = null;		// support garbage collector to reduce memory
		requestContent0154 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 289
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [154] <- Index 154
		if(replayMode)
		{
			long proxyDataRecordId =1655106430086L;
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






		// --- HTTP REQUEST: Test [155] <- WEB ADMIN Index 252 ---
		String requestProt0155 = "https";
		String requestHost0155 = "consumer.fis.boh.com";
		int    requestPort0155 = 443;
		String requestFile0155 = "/consumer-sb/service/d1/MenuFeatureConfigSvc";
		String requestContent0155 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJNWE2MGU5NjktMGFhNy00MzA3LWJhZGEtZWZmYTA3ZTRiZDcyCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0Mjk1NDIJCVBhcnR5SW5xdWlyeVNWQwkJZW4JMTgxMTFiZTEtYmU2MS00ZWI0LWJlZWQtZTg1OTJkOWIwNWQ3Cg==\"},\"_requestData\":{\"partyId\":\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\",\"appVersion\":\"digitalBANKING-1.0.0.0\"},\"_lang\":\"en\"}";
		String requestHeader0155 = "POST " + requestFile0155 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0155.getBytes().length + "\r\n" + 		// Content-Length: 365
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0155, requestHost0155, requestPort0155, requestHeader0155, requestContent0155.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0155 = null;		// support garbage collector to reduce memory
		requestContent0155 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 4479
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [155] <- Index 155
		if(replayMode)
		{
			long proxyDataRecordId =1655106430213L;
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






		// --- HTTP REQUEST: Test [156] <- WEB ADMIN Index 253 ---
		String requestProt0156 = "https";
		String requestHost0156 = "consumer.fis.boh.com";
		int    requestPort0156 = 443;
		String requestFile0156 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0156 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJOWI1ZWFkOWItMzY2MS00NTZiLWI2OGItMGNiZmU4NmY2YjgyCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0Mjk1NDQJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCTdmZTM3MmI2LTY5MWItNDYxMC04NWQzLTZlZWQ2MjZkM2IyYQo=\"},\"_lang\":\"en\",\"_params\":[\"Person\",\"CARD_MANAGEMENT_FEATURE\"],\"businessContext\":null}";
		String requestHeader0156 = "POST " + requestFile0156 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0156.getBytes().length + "\r\n" + 		// Content-Length: 343
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0156, requestHost0156, requestPort0156, requestHeader0156, requestContent0156.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0156 = null;		// support garbage collector to reduce memory
		requestContent0156 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 2155
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [156] <- Index 156
		if(replayMode)
		{
			long proxyDataRecordId =1655106430225L;
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






		// --- HTTP REQUEST: Test [157] <- WEB ADMIN Index 254 ---
		String requestProt0157 = "https";
		String requestHost0157 = "consumer.fis.boh.com";
		int    requestPort0157 = 443;
		String requestFile0157 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0157 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJYjYyNzAwOTEtYzViZi00ZjYzLTk1ODgtYjllYjcxZjI0YjJmCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0Mjk1NTAJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCTNkYzI4ZTY5LTQ3NjktNDAyMy04NGRiLWVjMmMwY2IwMDAyMAo=\"},\"_lang\":\"en\",\"businessContext\":null,\"_params\":[\"Person\",\"CONSUMER_DASHBOARD_FEATURE\"]}";
		String requestHeader0157 = "POST " + requestFile0157 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0157.getBytes().length + "\r\n" + 		// Content-Length: 346
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0157, requestHost0157, requestPort0157, requestHeader0157, requestContent0157.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0157 = null;		// support garbage collector to reduce memory
		requestContent0157 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 2016
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [157] <- Index 157
		if(replayMode)
		{
			long proxyDataRecordId =1655106430240L;
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






		// --- HTTP REQUEST: Test [158] <- WEB ADMIN Index 255 ---
		String requestProt0158 = "https";
		String requestHost0158 = "consumer.fis.boh.com";
		int    requestPort0158 = 443;
		String requestFile0158 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0158 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJOWRhNWUyMWUtMDYzOC00NDYzLWFjMDEtNGVlM2ZmNGYwMjZhCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0Mjk1NTEJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCWNmNjhiZDAyLTY0NWUtNDRmYy04M2QwLTU4MWM5YTA5ZTE1Mwo=\"},\"_lang\":\"en\",\"businessContext\":null,\"_params\":[\"Person\",\"ACCOUNT_FEATURE\"]}";
		String requestHeader0158 = "POST " + requestFile0158 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0158.getBytes().length + "\r\n" + 		// Content-Length: 335
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0158, requestHost0158, requestPort0158, requestHeader0158, requestContent0158.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0158 = null;		// support garbage collector to reduce memory
		requestContent0158 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 38795
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [158] <- Index 158
		if(replayMode)
		{
			long proxyDataRecordId =1655106430337L;
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






		// --- HTTP REQUEST: Test [159] <- WEB ADMIN Index 256 ---
		String requestProt0159 = "https";
		String requestHost0159 = "consumer.fis.boh.com";
		int    requestPort0159 = 443;
		String requestFile0159 = "/D1BOHConsumer/ng-bundle/173-es2015.70536c873c0f825fcee2.js";
		String requestHeader0159 = "GET " + requestFile0159 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0159, requestHost0159, requestPort0159, requestHeader0159, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0159 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [160] <- WEB ADMIN Index 260 ---
		String requestProt0160 = "https";
		String requestHost0160 = "consumer.fis.boh.com";
		int    requestPort0160 = 443;
		String requestFile0160 = "/D1BOHConsumer/ng-bundle/node_modules-jquery-ui-ui-widgets-resizable.491568acfcdd0aec3ad66a6476d7eddc.js";
		String requestHeader0160 = "GET " + requestFile0160 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0160, requestHost0160, requestPort0160, requestHeader0160, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0160 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [161] <- WEB ADMIN Index 261 ---
		String requestProt0161 = "https";
		String requestHost0161 = "consumer.fis.boh.com";
		int    requestPort0161 = 443;
		String requestFile0161 = "/D1BOHConsumer/ng-bundle/node_modules-@wavemaker-app-ng-runtime-scripts-datatable-datatable.cee0d18a91e988bdb466b62b8571e582.js";
		String requestHeader0161 = "GET " + requestFile0161 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0161, requestHost0161, requestPort0161, requestHeader0161, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0161 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [162] <- WEB ADMIN Index 263 ---
		String requestProt0162 = "https";
		String requestHost0162 = "consumer.fis.boh.com";
		int    requestPort0162 = 443;
		String requestFile0162 = "/consumer-sb/service/d1/AnnouncementInqSVC";
		String requestContent0162 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZGVjNTc0YjMtNjY5MC00Y2YzLWJmNjYtYmEyNzUyZDMzOWU1CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0Mjk5OTIJCUFubm91bmNlbWVudElucVNWQwkJZW4JMDgxMTQ1NzctM2QzMS00ZDc3LWJlZTAtMjc1MWViYjZlMTIzCg==\"},\"_lang\":\"en\",\"_operation\":\"GET\",\"_params\":[\"Announcement\"],\"businessContext\":\"MglCcm93c2VyCTIJQ2hyb21lCTkxCTEJCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTIwMjEtMDctMjNUMTA6MTI6NDkuNjI3WgkJQWNjb3VudCBMaXN0IElucXVpcnkJCWVuCTg4YmI1MmIwLWViOWUtMTFlYi1hOGYxLWU5MjRkYTkzMGNlNwo\"}";
		String requestHeader0162 = "POST " + requestFile0162 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0162.getBytes().length + "\r\n" + 		// Content-Length: 511
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0162, requestHost0162, requestPort0162, requestHeader0162, requestContent0162.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0162 = null;		// support garbage collector to reduce memory
		requestContent0162 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 467
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [162] <- Index 162
		if(replayMode)
		{
			long proxyDataRecordId =1655106430560L;
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






		// --- HTTP REQUEST: Test [163] <- WEB ADMIN Index 264 ---
		String requestProt0163 = "https";
		String requestHost0163 = "consumer.fis.boh.com";
		int    requestPort0163 = 443;
		String requestFile0163 = "/consumer-sb/service/d1/PartyEnrllmntsInqSVC";
		String requestContent0163 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJYmY1MzI1YTMtZDMwZS00NGM1LWEyMjYtNTI1MTAzYzU5MGQxCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzAwMDUJCVBhcnR5RW5ybGxtbnRzSW5xU1ZDCQllbgkwNDFlYTk1ZC02YmJjLTQxZjQtYTQyOS01OWY5YjkyMzMxYmUK\"},\"_params\":[\"\",\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\"],\"_lang\":\"en\"}";
		String requestHeader0163 = "POST " + requestFile0163 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0163.getBytes().length + "\r\n" + 		// Content-Length: 319
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0163, requestHost0163, requestPort0163, requestHeader0163, requestContent0163.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0163 = null;		// support garbage collector to reduce memory
		requestContent0163 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 91
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [163] <- Index 163
		if(replayMode)
		{
			long proxyDataRecordId =1655106430601L;
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






		// --- HTTP REQUEST: Test [164] <- WEB ADMIN Index 265 ---
		String requestProt0164 = "https";
		String requestHost0164 = "consumer.fis.boh.com";
		int    requestPort0164 = 443;
		String requestFile0164 = "/D1BOHConsumer/services/utils/cDNUrl" +
				"?fiId=140";
		String requestHeader0164 = "GET " + requestFile0164 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0164, requestHost0164, requestPort0164, requestHeader0164, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0164 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 60
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [164] <- Index 164
		if(replayMode)
		{
			long proxyDataRecordId =1655106430617L;
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






		// --- HTTP REQUEST: Test [165] <- WEB ADMIN Index 266 ---
		String requestProt0165 = "https";
		String requestHost0165 = "consumer.fis.boh.com";
		int    requestPort0165 = 443;
		String requestFile0165 = "/D1BOHConsumer/services/utils/sessionTimeout" +
				"?timeoutInSeconds=900";
		String requestHeader0165 = "GET " + requestFile0165 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0165, requestHost0165, requestPort0165, requestHeader0165, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0165 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [166] <- WEB ADMIN Index 267 ---
		String requestProt0166 = "https";
		String requestHost0166 = "consumer.fis.boh.com";
		int    requestPort0166 = 443;
		String requestFile0166 = "/D1BOHConsumer/services/utils/syncFIResolver";
		String requestContent0166 = 
				"{\"clientId\":\"D1-Consumer-Studio\",\"finInstKey\":\"140\"}";
		String requestHeader0166 = "POST " + requestFile0166 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Content-Type: application/json\r\n" + 
				"X-WM-XSRF-TOKEN: 1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7\r\n" + 
				"Content-Length: " + requestContent0166.getBytes().length + "\r\n" + 		// Content-Length: 52
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0166, requestHost0166, requestPort0166, requestHeader0166, requestContent0166.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0166 = null;		// support garbage collector to reduce memory
		requestContent0166 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = [verification disabled], header text fragment = [verification disabled], recorded content size = 0
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, null, null, null);		// Test [166] <- Index 166
		if(replayMode)
		{
			long proxyDataRecordId =1655106430686L;
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






		// --- HTTP REQUEST: Test [167] <- WEB ADMIN Index 268 ---
		String requestProt0167 = "https";
		String requestHost0167 = "consumer.fis.boh.com";
		int    requestPort0167 = 443;
		String requestFile0167 = "/consumer-sb/service/d1/CreditcardPaymentInqSVC";
		String requestContent0167 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZTY3OWZlMjUtMjQ3Ny00NTNlLWI0ZjItNWZjYTk4ZmYyMzQ2CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzAwMjkJCUNyZWRpdGNhcmRQYXltZW50SW5xU1ZDCQllbgkwYmY0ZThiYi1iYTQyLTQ3MjYtYmVhNS0yMjQ5YmUwZjZjZDAK\"},\"_operation\":\"GET\",\"_params\":[\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\"],\"_lang\":\"en\"}";
		String requestHeader0167 = "POST " + requestFile0167 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0167.getBytes().length + "\r\n" + 		// Content-Length: 339
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0167, requestHost0167, requestPort0167, requestHeader0167, requestContent0167.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0167 = null;		// support garbage collector to reduce memory
		requestContent0167 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 118
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [167] <- Index 167
		if(replayMode)
		{
			long proxyDataRecordId =1655106430768L;
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






		// --- HTTP REQUEST: Test [168] <- WEB ADMIN Index 270 ---
		String requestProt0168 = "https";
		String requestHost0168 = "consumer.fis.boh.com";
		int    requestPort0168 = 443;
		String requestFile0168 = "/consumer-sb/service/d1/ExternalAcctInqSVC";
		String requestContent0168 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJYzQyZTA3OGUtZjVjOS00ZThkLWEzNjQtNTAwNzNlMmJlZjFiCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzAxMTYJCUV4dGVybmFsQWNjdElucVNWQwkJZW4JMzlmM2UzMGMtMTdmZS00OTY3LWJiNWMtMGU4Njk0ZTkwZTg5Cg==\"},\"_lang\":\"en\",\"_operation\":\"GET\",\"_params\":[\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\"]}";
		String requestHeader0168 = "POST " + requestFile0168 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0168.getBytes().length + "\r\n" + 		// Content-Length: 335
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0168, requestHost0168, requestPort0168, requestHeader0168, requestContent0168.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0168 = null;		// support garbage collector to reduce memory
		requestContent0168 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 297
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [168] <- Index 168
		if(replayMode)
		{
			long proxyDataRecordId =1655106430961L;
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




		// all http requests of page #2_4 successful done
		return true;
	}


	/**
	 * Recorded http requests of page #2_5.
	 *
	 * @return  true:  method successful completed.
	 *          false: method/loop failed.
	 */
	boolean executePage_2_5(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext,int innerLoopCounter, int totalInnerLoopCount, Object httpLogVectorObject) throws Exception
	{
		// ... continuing page #2 (fragment 6 of 7)
		// ----------------------------------------



		// --- HTTP REQUEST: Test [169] <- WEB ADMIN Index 271 ---
		String requestProt0169 = "https";
		String requestHost0169 = "consumer.fis.boh.com";
		int    requestPort0169 = 443;
		String requestFile0169 = "/consumer-sb/service/d1/ExternalAcctInqSVC";
		String requestContent0169 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJNzhlNWY3NTQtN2Q5My00NDhlLTg4MGItNTljYWMwMzg3MjNjCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzAxMjIJCUV4dGVybmFsQWNjdElucVNWQwkJZW4JM2M4Mjk1M2ItOGVkNi00YTRjLTg5MGEtNzVhZGMxM2NmOWM0Cg==\"},\"_lang\":\"en\",\"_operation\":\"GET\",\"_params\":[\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\"]}";
		String requestHeader0169 = "POST " + requestFile0169 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0169.getBytes().length + "\r\n" + 		// Content-Length: 335
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0169, requestHost0169, requestPort0169, requestHeader0169, requestContent0169.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0169 = null;		// support garbage collector to reduce memory
		requestContent0169 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 337
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [169] <- Index 169
		if(replayMode)
		{
			long proxyDataRecordId =1655106430971L;
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






		// --- HTTP REQUEST: Test [170] <- WEB ADMIN Index 272 ---
		String requestProt0170 = "https";
		String requestHost0170 = "consumer.fis.boh.com";
		int    requestPort0170 = 443;
		String requestFile0170 = "/consumer-sb/service/d1/BenefitEnrllmntsInqSVC";
		String requestContent0170 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJNmYzNzJmMmUtN2FkYi00ZjE0LTllYTQtZjUzMWY1ZDUyNTVhCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzAxMjgJCUJlbmVmaXRFbnJsbG1udHNJbnFTVkMJCWVuCTY2ZjM0YjI1LTZjN2EtNDJhNi1iNDAzLTNjZTRmZGVkNGQxOAo=\"},\"_lang\":\"en\",\"_params\":[\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\"]}";
		String requestHeader0170 = "POST " + requestFile0170 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0170.getBytes().length + "\r\n" + 		// Content-Length: 320
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0170, requestHost0170, requestPort0170, requestHeader0170, requestContent0170.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0170 = null;		// support garbage collector to reduce memory
		requestContent0170 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 184
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [170] <- Index 170
		if(replayMode)
		{
			long proxyDataRecordId =1655106430977L;
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






		// --- HTTP REQUEST: Test [171] <- WEB ADMIN Index 273 ---
		String requestProt0171 = "https";
		String requestHost0171 = "consumer.fis.boh.com";
		int    requestPort0171 = 443;
		String requestFile0171 = "/consumer-sb/service/d1/AddContactHistoryInformationSVC";
		String requestContent0171 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZmMyZjdhMjItNGU4MS00ZTBjLWFmZjAtNWU0ZmVlNzI5ZjQxCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzAxNDIJCUFkZENvbnRhY3RIaXN0b3J5SW5mb3JtYXRpb25TVkMJCWVuCTRjYTFmNTRmLTIwODQtNGEzZS1hNDMyLWY0YjgwNGIwNDIzZQo=\"},\"_operation\":\"POST\",\"_lang\":\"en\",\"_requestData\":{\"event\":{\"name\":\"USER_LOGIN_SUCCESS\"},\"customer\":{\"custId\":\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\",\"lastName\":\"Test Zelle Business\",\"firstNames\":\"Johnny\",\"name\":\"\",\"type\":\"Person\",\"loginIdent\":\"PORTALTEST2023_D1\",\"agentType\":null,\"agent\":\"\"},\"eventDate\":\"2022-06-13T07:47:10.141Z\",\"eventTime\":\"2022-06-13T07:47:10.141Z\",\"duration\":0,\"comment\":\"User Login Success\",\"origSource\":\"digitalBANKING-1.0.0.0\"}}";
		String requestHeader0171 = "POST " + requestFile0171 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0171.getBytes().length + "\r\n" + 		// Content-Length: 719
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0171, requestHost0171, requestPort0171, requestHeader0171, requestContent0171.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0171 = null;		// support garbage collector to reduce memory
		requestContent0171 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 118
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [171] <- Index 171
		if(replayMode)
		{
			long proxyDataRecordId =1655106431038L;
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






		// --- HTTP REQUEST: Test [172] <- WEB ADMIN Index 292 ---
		String requestProt0172 = "https";
		String requestHost0172 = "consumer.fis.boh.com";
		int    requestPort0172 = 443;
		String requestFile0172 = "/consumer-sb/service/d1/CustomerDetailsInqSVC";
		String requestContent0172 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZGJmOTg4MzUtODYwMC00ZWZiLWJjOGMtMmM2ZjExYzE2NTRkCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzAxNTAJCUN1c3RvbWVyRGV0YWlsc0lucVNWQwkJZW4JYmRlZDFmMjAtZGI5MC00ZjlmLTgxZmUtOGNlOTFlY2QwNDM5Cg==\"},\"_lang\":\"en\",\"_params\":[\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\",\"Person\",\"140\"],\"businessContext\":null}";
		String requestHeader0172 = "POST " + requestFile0172 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0172.getBytes().length + "\r\n" + 		// Content-Length: 358
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0172, requestHost0172, requestPort0172, requestHeader0172, requestContent0172.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0172 = null;		// support garbage collector to reduce memory
		requestContent0172 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 156
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [172] <- Index 172
		if(replayMode)
		{
			long proxyDataRecordId =1655106431276L;
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






		// --- HTTP REQUEST: Test [173] <- WEB ADMIN Index 294 ---
		String requestProt0173 = "https";
		String requestHost0173 = "consumer.fis.boh.com";
		int    requestPort0173 = 443;
		String requestFile0173 = "/consumer-sb/service/d1/AccountListInqSVC";
		String requestContent0173 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMzI3ZmM3OWUtMDlkMS00NmVlLTliN2MtOGRmZjA4NjczNDY4CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzAxNDYJCUFjY291bnRMaXN0SW5xU1ZDCQllbgkwMjgwZDg2Ny02NjM3LTQzMzUtYmE1My1lY2IxMjE3MDkwM2YK\"},\"_lang\":\"en\",\"_params\":[\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\",\"Person\",\"140\"],\"_optionalParams\":{\"tranCode\":\"CardDetails\"}}";
		String requestHeader0173 = "POST " + requestFile0173 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0173.getBytes().length + "\r\n" + 		// Content-Length: 372
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0173, requestHost0173, requestPort0173, requestHeader0173, requestContent0173.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0173 = null;		// support garbage collector to reduce memory
		requestContent0173 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 1374
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [173] <- Index 173
		if(replayMode)
		{
			long proxyDataRecordId =1655106431289L;
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






		// --- HTTP REQUEST: Test [174] <- WEB ADMIN Index 316 ---
		String requestProt0174 = "https";
		String requestHost0174 = "consumer.fis.boh.com";
		int    requestPort0174 = 443;
		String requestFile0174 = "/consumer-sb/service/d1/RetrEnrolledFundingAcctDetailsSVC";
		String requestContent0174 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJOWI0NGM4YjMtNzhhNy00YmFjLWEyZDctMjFkMGM4NTkwOTFlCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzAxNTMJCVJldHJFbnJvbGxlZEZ1bmRpbmdBY2N0RGV0YWlsc1NWQwkJZW4JZjQ5OGIyZDAtMzc2MS00ODU4LWEwYWQtZTM5NTg2ZjU3ZDk5Cg==\"},\"_lang\":\"en\",\"_operation\":\"GET\",\"_optionalParams\":{\"&loginName\":\"PORTALTEST2023_D1\"},\"_params\":[\"BillPay\",\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\",\"Person\",\"140\"]}";
		String requestHeader0174 = "POST " + requestFile0174 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0174.getBytes().length + "\r\n" + 		// Content-Length: 433
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0174, requestHost0174, requestPort0174, requestHeader0174, requestContent0174.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0174 = null;		// support garbage collector to reduce memory
		requestContent0174 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 149
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [174] <- Index 174
		if(replayMode)
		{
			long proxyDataRecordId =1655106431508L;
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






		// --- HTTP REQUEST: Test [175] <- WEB ADMIN Index 320 ---
		String requestProt0175 = "https";
		String requestHost0175 = "consumer.fis.boh.com";
		int    requestPort0175 = 443;
		String requestFile0175 = "/consumer-sb/service/d1/RecTransferListInqSVC";
		String requestContent0175 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJNzY2YmE1OTktN2Y0NS00YWQxLWFiMTYtNGM2MzM1ZDhhMTZjCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzAxNTcJCVJlY1RyYW5zZmVyTGlzdElucVNWQwkJZW4JNTE4OGViMTAtNWZlNC00NDQ1LTlhMjAtNmViMDE5NjIxOTA2Cg==\"},\"_operation\":\"GET\",\"_params\":[\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\",\"140\",true],\"_lang\":\"en\"}";
		String requestHeader0175 = "POST " + requestFile0175 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0175.getBytes().length + "\r\n" + 		// Content-Length: 350
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0175, requestHost0175, requestPort0175, requestHeader0175, requestContent0175.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0175 = null;		// support garbage collector to reduce memory
		requestContent0175 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 118
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [175] <- Index 175
		if(replayMode)
		{
			long proxyDataRecordId =1655106431552L;
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






		// --- HTTP REQUEST: Test [176] <- WEB ADMIN Index 322 ---
		String requestProt0176 = "https";
		String requestHost0176 = "consumer.fis.boh.com";
		int    requestPort0176 = 443;
		String requestFile0176 = "/consumer-sb/service/d1/ConsumerFooterSVC";
		String requestContent0176 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMjRmY2YyMGUtODU3Zi00NGNkLTg3Y2QtYzZlNmQ0ZDFlY2UxCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzAxNTgJCUNvbnN1bWVyRm9vdGVyU1ZDCQllbglhNWI0MDFiYi1lYmQ3LTQ0MDctOWFkOS04NTJjOTRjZWVjZGUK\"},\"_lang\":\"en\",\"_optionalParams\":null,\"_params\":[\"140-all-all\",\"en\",\"digitalBANKING\",\"consumer\"]}";
		String requestHeader0176 = "POST " + requestFile0176 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0176.getBytes().length + "\r\n" + 		// Content-Length: 339
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0176, requestHost0176, requestPort0176, requestHeader0176, requestContent0176.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0176 = null;		// support garbage collector to reduce memory
		requestContent0176 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 593
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [176] <- Index 176
		if(replayMode)
		{
			long proxyDataRecordId =1655106431603L;
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






		// --- HTTP REQUEST: Test [177] <- WEB ADMIN Index 331 ---
		String requestProt0177 = "https";
		String requestHost0177 = "consumer.fis.boh.com";
		int    requestPort0177 = 443;
		String requestFile0177 = "/consumer-sb/service/d1/ProfileFeatureGroupConfigSVC";
		String requestContent0177 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZTAxMDQyMjItMmUyZi00ODJmLThmMGQtZDYwNzc4NTNhOGIxCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzA1MDUJCVByb2ZpbGVGZWF0dXJlR3JvdXBDb25maWdTVkMJCWVuCTE4M2ViMWY1LTZmMTctNGU3NS1hMzI4LTYxNmNhMDg2Y2IxMwo=\"},\"_lang\":\"en\",\"businessContext\":null,\"_params\":[\"Person\",\"INTERSTITIAL_FEATURE\"]}";
		String requestHeader0177 = "POST " + requestFile0177 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0177.getBytes().length + "\r\n" + 		// Content-Length: 340
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0177, requestHost0177, requestPort0177, requestHeader0177, requestContent0177.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0177 = null;		// support garbage collector to reduce memory
		requestContent0177 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 1002
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [177] <- Index 177
		if(replayMode)
		{
			long proxyDataRecordId =1655106431887L;
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






		// --- HTTP REQUEST: Test [178] <- WEB ADMIN Index 332 ---
		String requestProt0178 = "https";
		String requestHost0178 = "consumer.fis.boh.com";
		int    requestPort0178 = 443;
		String requestFile0178 = "/consumer-sb/service/d1/BillPayscheduledPayInqSVC";
		String requestContent0178 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJODg1YjYzMjAtNGI1Ni00MjYwLWIyOTgtYmZmOWMwNDIwMjQ3CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzA4OTMJCUJpbGxQYXlzY2hlZHVsZWRQYXlJbnFTVkMJCWVuCTRiYjE2OTQzLWVmMWYtNDc0Zi04MDc3LTgwN2ZhYWZhMjRiZQo=\"},\"_operation\":\"GET\",\"_params\":[\"BillPay\",\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\",\"140\",\"\",\"2022-06-13\",\"2022-06-23\",\"PORTALTEST2023_D1\"],\"_lang\":\"en\"}";
		String requestHeader0178 = "POST " + requestFile0178 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0178.getBytes().length + "\r\n" + 		// Content-Length: 408
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0178, requestHost0178, requestPort0178, requestHeader0178, requestContent0178.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0178 = null;		// support garbage collector to reduce memory
		requestContent0178 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 149
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [178] <- Index 178
		if(replayMode)
		{
			long proxyDataRecordId =1655106431955L;
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






		// --- HTTP REQUEST: Test [179] <- WEB ADMIN Index 333 ---
		String requestProt0179 = "https";
		String requestHost0179 = "consumer.fis.boh.com";
		int    requestPort0179 = 443;
		String requestFile0179 = "/D1BOHConsumer/services/tMConfig/tMConfig";
		String requestHeader0179 = "GET " + requestFile0179 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0179, requestHost0179, requestPort0179, requestHeader0179, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0179 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 78
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [179] <- Index 179
		if(replayMode)
		{
			long proxyDataRecordId =1655106431986L;
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






		// --- HTTP REQUEST: Test [180] <- WEB ADMIN Index 335 ---
		String requestProt0180 = "https";
		String requestHost0180 = "consumer.fis.boh.com";
		int    requestPort0180 = 443;
		String requestFile0180 = "/consumer-sb/service/d1/ExternalAcctInqSVC";
		String requestContent0180 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMzlhZTU5YTctN2NkOC00YzZhLTk1M2QtMTdmNDEyMDRlZTI5CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzE2OTMJCUV4dGVybmFsQWNjdElucVNWQwkJZW4JM2JiYTMwZGYtYjI4MC00MTU2LWIyNzAtOTUzNzY1ZWM1Y2Y1Cg==\"},\"_lang\":\"en\",\"_operation\":\"GET\",\"_params\":[\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\"]}";
		String requestHeader0180 = "POST " + requestFile0180 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0180.getBytes().length + "\r\n" + 		// Content-Length: 335
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0180, requestHost0180, requestPort0180, requestHeader0180, requestContent0180.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0180 = null;		// support garbage collector to reduce memory
		requestContent0180 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 270
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [180] <- Index 180
		if(replayMode)
		{
			long proxyDataRecordId =1655106432012L;
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






		// --- HTTP REQUEST: Test [181] <- WEB ADMIN Index 338 ---
		String requestProt0181 = "https";
		String requestHost0181 = "consumer.fis.boh.com";
		int    requestPort0181 = 443;
		String requestFile0181 = "/consumer-sb/service/d1/PartyEnrllmntsInqSVC";
		String requestContent0181 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJYWUwYWE0ZDMtMTliNS00MjNlLWEwMDktODBlMzAwNThkZjFhCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzE3MDQJCVBhcnR5RW5ybGxtbnRzSW5xU1ZDCQllbgk5NTMwYjU5MC0zMDBlLTRjNWItYWE1Mi1lY2E0NzBjMGFhZjIK\"},\"_params\":[\"140\",\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\"],\"_lang\":\"en\"}";
		String requestHeader0181 = "POST " + requestFile0181 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0181.getBytes().length + "\r\n" + 		// Content-Length: 322
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0181, requestHost0181, requestPort0181, requestHeader0181, requestContent0181.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0181 = null;		// support garbage collector to reduce memory
		requestContent0181 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 91
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [181] <- Index 181
		if(replayMode)
		{
			long proxyDataRecordId =1655106432229L;
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






		// --- HTTP REQUEST: Test [182] <- WEB ADMIN Index 339 ---
		String requestProt0182 = "https";
		String requestHost0182 = "consumer.fis.boh.com";
		int    requestPort0182 = 443;
		String requestFile0182 = "/consumer-sb/service/d1/MoxtraEnrollmentSVC";
		String requestContent0182 = 
				"{\"_optionalParams\":null,\"businessContext\":null,\"_lang\":\"en\",\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZjJiZTgxZGMtNTNlYi00MjE1LTk4MTktN2FlNTdjOGM5MGVjCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzE4OTYJCU1veHRyYUVucm9sbG1lbnRTVkMJCWVuCTM1NzBmODY4LWU2ZTgtNGMwZi1iYzkxLWE5MzYwZjlhMTY1YQo=\"},\"_operation\":\"POST\",\"_requestData\":{\"partyId\":\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\",\"authInfo\":{\"uid\":\"PORTALTEST2023_D1\"},\"personParty\":{}}}";
		String requestHeader0182 = "POST " + requestFile0182 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0182.getBytes().length + "\r\n" + 		// Content-Length: 453
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0182, requestHost0182, requestPort0182, requestHeader0182, requestContent0182.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0182 = null;		// support garbage collector to reduce memory
		requestContent0182 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 156
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [182] <- Index 182
		if(replayMode)
		{
			long proxyDataRecordId =1655106432261L;
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






		// --- HTTP REQUEST: Test [183] <- WEB ADMIN Index 342 ---
		String requestProt0183 = "https";
		String requestHost0183 = "consumer.fis.boh.com";
		int    requestPort0183 = 443;
		String requestFile0183 = "/consumer-sb/service/d1/GetDocsPreferencesSVC";
		String requestContent0183 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMzRjNjYzZmQtYTRhOC00ZDczLTg4NGUtNzdiMmFhYWUzMWJjCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzIyMjkJCUdldERvY3NQcmVmZXJlbmNlc1NWQwkJZW4JYTgyNjIyMzQtNDFlYy00YThiLWExZjktYzkyOTg5ZDBiZDE5Cg==\"},\"_lang\":\"en\",\"_operation\":\"GET\",\"_params\":[\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\"]}";
		String requestHeader0183 = "POST " + requestFile0183 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0183.getBytes().length + "\r\n" + 		// Content-Length: 339
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0183, requestHost0183, requestPort0183, requestHeader0183, requestContent0183.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0183 = null;		// support garbage collector to reduce memory
		requestContent0183 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 286
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [183] <- Index 183
		if(replayMode)
		{
			long proxyDataRecordId =1655106432392L;
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






		// --- HTTP REQUEST: Test [184] <- WEB ADMIN Index 344 ---
		String requestProt0184 = "https";
		String requestHost0184 = "consumer.fis.boh.com";
		int    requestPort0184 = 443;
		String requestFile0184 = "/consumer-sb/service/d1/HideUnhideAccountListInqSVC";
		String requestContent0184 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJYmRlNTVjMWUtMDJlNC00NTM0LWFmZGQtNWM1N2E0NDQ3ZWQ2CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzIyMzQJCUhpZGVVbmhpZGVBY2NvdW50TGlzdElucVNWQwkJZW4JYTM2YTZkZjAtOWQ5NS00OGM0LWE0NTMtN2FkYzMzOTJjYzJjCg==\"},\"_lang\":\"en\",\"_optionalParams\":{\"&tranCode\":\"BillPay\"},\"_params\":[\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\",\"Person\",\"140\"]}";
		String requestHeader0184 = "POST " + requestFile0184 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0184.getBytes().length + "\r\n" + 		// Content-Length: 385
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0184, requestHost0184, requestPort0184, requestHeader0184, requestContent0184.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0184 = null;		// support garbage collector to reduce memory
		requestContent0184 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 1124
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [184] <- Index 184
		if(replayMode)
		{
			long proxyDataRecordId =1655106432562L;
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






		// --- HTTP REQUEST: Test [185] <- WEB ADMIN Index 346 ---
		String requestProt0185 = "https";
		String requestHost0185 = "consumer.fis.boh.com";
		int    requestPort0185 = 443;
		String requestFile0185 = "/consumer-sb/service/d1/HideUnhideAccountListInqSVC";
		String requestContent0185 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMDg3YzI1MGQtZTk2NS00M2QzLWFhZWYtODc0ODBhZGZlNjA1CWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzIyMzUJCUhpZGVVbmhpZGVBY2NvdW50TGlzdElucVNWQwkJZW4JZGRkNTUzMTQtYTRjOS00M2VhLWE2MDMtOTQ1OTJhM2NjMWMxCg==\"},\"_lang\":\"en\",\"_params\":[\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\",\"Person\",\"140\"],\"_optionalParams\":{\"&tranCode\":\"ZellePay\"}}";
		String requestHeader0185 = "POST " + requestFile0185 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0185.getBytes().length + "\r\n" + 		// Content-Length: 386
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0185, requestHost0185, requestPort0185, requestHeader0185, requestContent0185.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0185 = null;		// support garbage collector to reduce memory
		requestContent0185 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 1124
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [185] <- Index 185
		if(replayMode)
		{
			long proxyDataRecordId =1655106432636L;
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






		// --- HTTP REQUEST: Test [186] <- WEB ADMIN Index 348 ---
		String requestProt0186 = "https";
		String requestHost0186 = "consumer.fis.boh.com";
		int    requestPort0186 = 443;
		String requestFile0186 = "/consumer-sb/service/d1/HideUnhideAccountListInqSVC";
		String requestContent0186 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJOWY1ODJhNjQtM2IwNC00YWQyLTk3NGUtZGU5NjI4NjM3YjIzCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzIyMzcJCUhpZGVVbmhpZGVBY2NvdW50TGlzdElucVNWQwkJZW4JZmJjYTg3OTUtOWM4NC00ZDYwLTkyMmYtMTMwMmM1ZGZkOGEzCg==\"},\"_lang\":\"en\",\"_params\":[\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\",\"Person\",\"140\"],\"_optionalParams\":{\"&tranCode\":\"P2P\"}}";
		String requestHeader0186 = "POST " + requestFile0186 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0186.getBytes().length + "\r\n" + 		// Content-Length: 381
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0186, requestHost0186, requestPort0186, requestHeader0186, requestContent0186.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0186 = null;		// support garbage collector to reduce memory
		requestContent0186 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 1124
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [186] <- Index 186
		if(replayMode)
		{
			long proxyDataRecordId =1655106432805L;
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






		// --- HTTP REQUEST: Test [187] <- WEB ADMIN Index 349 ---
		String requestProt0187 = "https";
		String requestHost0187 = "consumer.fis.boh.com";
		int    requestPort0187 = 443;
		String requestFile0187 = "/D1BOHConsumer/services/utils/maskAccountInfoIntoSession" +
				"?isMasked=true";
		String requestHeader0187 = "POST " + requestFile0187 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Content-Type: application/json\r\n" + 
				"X-WM-XSRF-TOKEN: 1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7\r\n" + 
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Content-Length: 0\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0187, requestHost0187, requestPort0187, requestHeader0187, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0187 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = [verification disabled], header text fragment = [verification disabled], recorded content size = 0
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, null, null, null);		// Test [187] <- Index 187
		if(replayMode)
		{
			long proxyDataRecordId =1655106432837L;
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






		// --- HTTP REQUEST: Test [188] <- WEB ADMIN Index 350 ---
		String requestProt0188 = "https";
		String requestHost0188 = "consumer.fis.boh.com";
		int    requestPort0188 = 443;
		String requestFile0188 = "/consumer-sb/service/d1/TransactionInqSVC";
		String requestContent0188 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJMWUyMTIzMjQtNDExNi00Y2M2LWE4NTUtYzBkMDVmY2NhYzVkCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzI3ODQJCVRyYW5zYWN0aW9uSW5xU1ZDCQllbglmYjcxOTM4Ny05MzhhLTQ0ZDMtYTgxMS03YmU1YjkzOTBlZDMK\"},\"_params\":[\"bf473795919b0e30e1a2bf011071f4eb9877b1bb\",\"DDA\",\"140\",5,\"\",\"true\"],\"_lang\":\"en\",\"_optionalParams\":{\"fromDt\":\"2022-05-13\",\"toDt\":\"2022-06-13\"}}";
		String requestHeader0188 = "POST " + requestFile0188 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0188.getBytes().length + "\r\n" + 		// Content-Length: 398
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0188, requestHost0188, requestPort0188, requestHeader0188, requestContent0188.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0188 = null;		// support garbage collector to reduce memory
		requestContent0188 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 192
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [188] <- Index 188
		if(replayMode)
		{
			long proxyDataRecordId =1655106432924L;
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




		// all http requests of page #2_5 successful done
		return true;
	}


	/**
	 * Recorded http requests of page #2_6.
	 *
	 * @return  true:  method successful completed.
	 *          false: method/loop failed.
	 */
	boolean executePage_2_6(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext,int innerLoopCounter, int totalInnerLoopCount, Object httpLogVectorObject) throws Exception
	{
		// ... continuing page #2 (fragment 7 of 7)
		// ----------------------------------------



		// --- HTTP REQUEST: Test [189] <- WEB ADMIN Index 351 ---
		String requestProt0189 = "https";
		String requestHost0189 = "consumer.fis.boh.com";
		int    requestPort0189 = 443;
		String requestFile0189 = "/consumer-sb/service/d1/MoxtraGetAccessTokenSVC";
		String requestContent0189 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJZDI3ZjNhMDgtYzAyNC00MGE3LWE0YWYtMzkzNWFlNGQ0MWRhCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY0MzI4NDgJCU1veHRyYUdldEFjY2Vzc1Rva2VuU1ZDCQllbgk3ZjYxNjZlNC0yOGRjLTRlMWUtOGJmZC1jY2U2YzUxODBhN2IK\"},\"_lang\":\"en\",\"_params\":[\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\",\"Person\",\"140\"],\"_optionalParams\":null}";
		String requestHeader0189 = "POST " + requestFile0189 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0189.getBytes().length + "\r\n" + 		// Content-Length: 358
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0189, requestHost0189, requestPort0189, requestHeader0189, requestContent0189.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0189 = null;		// support garbage collector to reduce memory
		requestContent0189 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 156
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [189] <- Index 189
		if(replayMode)
		{
			long proxyDataRecordId =1655106433079L;
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






		// --- HTTP REQUEST: Test [190] <- WEB ADMIN Index 353 ---
		String requestProt0190 = "https";
		String requestHost0190 = "consumer.fis.boh.com";
		int    requestPort0190 = 443;
		String requestFile0190 = "/D1BOHConsumer/services/utils/maskAccountInfoFromSession";
		String requestHeader0190 = "GET " + requestFile0190 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0190, requestHost0190, requestPort0190, requestHeader0190, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0190 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 4
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [190] <- Index 190
		if(replayMode)
		{
			long proxyDataRecordId =1655106433318L;
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






		// --- HTTP REQUEST: Test [191] <- WEB ADMIN Index 354 ---
		String requestProt0191 = "https";
		String requestHost0191 = "consumer.fis.boh.com";
		int    requestPort0191 = 443;
		String requestFile0191 = "/D1BOHConsumer/services/prefabs/LCD_Interstitial_Main/servicedefs";
		String requestHeader0191 = "GET " + requestFile0191 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0191, requestHost0191, requestPort0191, requestHeader0191, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0191 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 543
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [191] <- Index 191
		if(replayMode)
		{
			long proxyDataRecordId =1655106433669L;
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






		// --- HTTP REQUEST: Test [192] <- WEB ADMIN Index 355 ---
		String requestProt0192 = "https";
		String requestHost0192 = "consumer.fis.boh.com";
		int    requestPort0192 = 443;
		String requestFile0192 = "/D1BOHConsumer/services/prefabs/LCD_Interstitial_Wizard/servicedefs";
		String requestHeader0192 = "GET " + requestFile0192 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0192, requestHost0192, requestPort0192, requestHeader0192, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0192 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 61
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [192] <- Index 192
		if(replayMode)
		{
			long proxyDataRecordId =1655106433686L;
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






		// --- HTTP REQUEST: Test [193] <- WEB ADMIN Index 356 ---
		String requestProt0193 = "https";
		String requestHost0193 = "consumer.fis.boh.com";
		int    requestPort0193 = 443;
		String requestFile0193 = "/D1BOHConsumer/ng-bundle/159-es2015.797d702139630d702e34.js";
		String requestHeader0193 = "GET " + requestFile0193 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0193, requestHost0193, requestPort0193, requestHeader0193, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0193 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [194] <- WEB ADMIN Index 357 ---
		String requestProt0194 = "https";
		String requestHost0194 = "consumer.fis.boh.com";
		int    requestPort0194 = 443;
		String requestFile0194 = "/D1BOHConsumer/ng-bundle/160-es2015.4ad96e522f32b2fac02f.js";
		String requestHeader0194 = "GET " + requestFile0194 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: script\r\n" + 
				"Sec-Fetch-Mode: no-cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0194, requestHost0194, requestPort0194, requestHeader0194, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		testURL.setFailureActionType(HttpTestURL.FAILURE_ACTION_IGNORE_ERROR);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");

		pageThreadHandler.insertInExecutionQueue(testURL, threadStep);
		requestHeader0194 = null;		// support garbage collector to reduce memory
		threadStep = threadStep + 1;





		// --- HTTP REQUEST: Test [195] <- WEB ADMIN Index 358 ---
		String requestProt0195 = "https";
		String requestHost0195 = "consumer.fis.boh.com";
		int    requestPort0195 = 443;
		String requestFile0195 = "/D1BOHConsumer/services/utils/activate";
		String requestHeader0195 = "GET " + requestFile0195 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0195, requestHost0195, requestPort0195, requestHeader0195, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0195 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 4
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [195] <- Index 195
		if(replayMode)
		{
			long proxyDataRecordId =1655106451063L;
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






		// --- HTTP REQUEST: Test [196] <- WEB ADMIN Index 359 ---
		String requestProt0196 = "https";
		String requestHost0196 = "consumer.fis.boh.com";
		int    requestPort0196 = 443;
		String requestFile0196 = "/consumer-sb/ping-server";
		String requestHeader0196 = "GET " + requestFile0196 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0196, requestHost0196, requestPort0196, requestHeader0196, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0196 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 35
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [196] <- Index 196
		if(replayMode)
		{
			long proxyDataRecordId =1655106451073L;
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






		// --- HTTP REQUEST: Test [197] <- WEB ADMIN Index 360 ---
		String requestProt0197 = "https";
		String requestHost0197 = "consumer.fis.boh.com";
		int    requestPort0197 = 443;
		String requestFile0197 = "/D1BOHConsumer/services/utils/activate";
		String requestHeader0197 = "GET " + requestFile0197 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0197, requestHost0197, requestPort0197, requestHeader0197, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0197 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 4
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [197] <- Index 197
		if(replayMode)
		{
			long proxyDataRecordId =1655106462591L;
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






		// --- HTTP REQUEST: Test [198] <- WEB ADMIN Index 361 ---
		String requestProt0198 = "https";
		String requestHost0198 = "consumer.fis.boh.com";
		int    requestPort0198 = 443;
		String requestFile0198 = "/D1BOHConsumer/services/utils/activate";
		String requestHeader0198 = "GET " + requestFile0198 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0198, requestHost0198, requestPort0198, requestHeader0198, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0198 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 4
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [198] <- Index 198
		if(replayMode)
		{
			long proxyDataRecordId =1655106463056L;
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






		// --- HTTP REQUEST: Test [199] <- WEB ADMIN Index 362 ---
		String requestProt0199 = "https";
		String requestHost0199 = "consumer.fis.boh.com";
		int    requestPort0199 = 443;
		String requestFile0199 = "/consumer-sb/ping-server";
		String requestHeader0199 = "GET " + requestFile0199 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0199, requestHost0199, requestPort0199, requestHeader0199, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0199 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 35
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [199] <- Index 199
		if(replayMode)
		{
			long proxyDataRecordId =1655106463067L;
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




		// all http requests of page #2_6 successful done
		return true;
	}


	/**
	 * Recorded http requests of page #3.
	 *
	 * @return  true:  method successful completed.
	 *          false: method/loop failed.
	 */
	boolean executePage_3(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext,int innerLoopCounter, int totalInnerLoopCount, Object httpLogVectorObject) throws Exception
	{
		// # Page #3: Close Key Features Popup
		// # ---------------------------------



		// --- HTTP REQUEST: Test [201] <- WEB ADMIN Index 369 ---
		String requestProt0201 = "https";
		String requestHost0201 = "consumer.fis.boh.com";
		int    requestPort0201 = 443;
		String requestFile0201 = "/D1BOHConsumer/services/utils/activate";
		String requestHeader0201 = "GET " + requestFile0201 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0201, requestHost0201, requestPort0201, requestHeader0201, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0201 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 4
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [201] <- Index 201
		if(replayMode)
		{
			long proxyDataRecordId =1655106494980L;
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






		// --- HTTP REQUEST: Test [202] <- WEB ADMIN Index 370 ---
		String requestProt0202 = "https";
		String requestHost0202 = "consumer.fis.boh.com";
		int    requestPort0202 = 443;
		String requestFile0202 = "/consumer-sb/ping-server";
		String requestHeader0202 = "GET " + requestFile0202 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0202, requestHost0202, requestPort0202, requestHeader0202, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0202 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 35
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [202] <- Index 202
		if(replayMode)
		{
			long proxyDataRecordId =1655106495437L;
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






		// --- HTTP REQUEST: Test [203] <- WEB ADMIN Index 371 ---
		String requestProt0203 = "https";
		String requestHost0203 = "consumer.fis.boh.com";
		int    requestPort0203 = 443;
		String requestFile0203 = "/D1BOHConsumer/services/utils/activate";
		String requestHeader0203 = "GET " + requestFile0203 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0203, requestHost0203, requestPort0203, requestHeader0203, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0203 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 4
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [203] <- Index 203
		if(replayMode)
		{
			long proxyDataRecordId =1655106495454L;
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




		// all http requests of page #3 successful done
		return true;
	}


	/**
	 * Recorded http requests of page #4.
	 *
	 * @return  true:  method successful completed.
	 *          false: method/loop failed.
	 */
	boolean executePage_4(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext,int innerLoopCounter, int totalInnerLoopCount, Object httpLogVectorObject) throws Exception
	{
		// # Page #4: Logout
		// # ---------------



		// --- HTTP REQUEST: Test [205] <- WEB ADMIN Index 376 ---
		String requestProt0205 = "https";
		String requestHost0205 = "consumer.fis.boh.com";
		int    requestPort0205 = 443;
		String requestFile0205 = "/D1BOHConsumer/j_spring_security_logout";
		String requestHeader0205 = "POST " + requestFile0205 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"X-WM-XSRF-TOKEN: 1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7\r\n" + 
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"Content-Length: 0\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0205, requestHost0205, requestPort0205, requestHeader0205, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0205 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 302, content type = [verification disabled], header text fragment = [verification disabled], recorded content size = 0
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {302}, null, null, null);		// Test [205] <- Index 205
		if(replayMode)
		{
			long proxyDataRecordId =1655106509258L;
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






		// --- HTTP REQUEST: Test [206] <- WEB ADMIN Index 380 ---
		String requestProt0206 = "https";
		String requestHost0206 = "consumer.fis.boh.com";
		int    requestPort0206 = 443;
		String requestFile0206 = "/consumer-sb/service/d1/AddContactHistoryInformationSVC";
		String requestContent0206 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJYmQzNjZjZWEtNWE5Ny00NDdhLThjYjgtMjg4ZmRjMDdmZjBkCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY1MDkyMzkJCUFkZENvbnRhY3RIaXN0b3J5SW5mb3JtYXRpb25TVkMJCWVuCTEyM2RkOTVmLWM5YzQtNDdmMi04Yzk3LTBiZDRjZGM2MTRlNQo=\"},\"_operation\":\"POST\",\"_lang\":\"en\",\"_requestData\":{\"event\":{\"name\":\"USER_LOGOUT_REQUESTED\"},\"customer\":{\"custId\":\"9c65b11d8997f1c29ad5f4c398c64097ef05dcb0\",\"lastName\":\"Test Zelle Business\",\"firstNames\":\"Johnny\",\"name\":\"\",\"type\":\"Person\",\"loginIdent\":\"PORTALTEST2023_D1\",\"agentType\":null,\"agent\":\"\"},\"eventDate\":\"2022-06-13T07:48:29.231Z\",\"eventTime\":\"2022-06-13T07:48:29.231Z\",\"duration\":0,\"comment\":\"PORTALTEST2023_D1 requested to logout from online banking\",\"origSource\":\"digitalBANKING-1.0.0.0\"}}";
		String requestHeader0206 = "POST " + requestFile0206 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0206.getBytes().length + "\r\n" + 		// Content-Length: 761
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0206, requestHost0206, requestPort0206, requestHeader0206, requestContent0206.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0206 = null;		// support garbage collector to reduce memory
		requestContent0206 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 118
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [206] <- Index 206
		if(replayMode)
		{
			long proxyDataRecordId =1655106509269L;
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






		// --- HTTP REQUEST: Test [207] <- WEB ADMIN Index 381 ---
		String requestProt0207 = "https";
		String requestHost0207 = "consumer.fis.boh.com";
		int    requestPort0207 = 443;
		String requestFile0207 = "/D1BOHConsumer/";
		String requestHeader0207 = "GET " + requestFile0207 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"X-WM-XSRF-TOKEN: 1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0207, requestHost0207, requestPort0207, requestHeader0207, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		testURL.replaceRequestHeaderFieldTextPattern("1c5ff494-2d25-40de-9c0a-2dfe35e3cdb7", wm_xsrf_token);		// search within all request header fields a text pattern and replace it with a variable value
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
		requestHeader0207 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/HTML", header text fragment = [verification disabled], recorded content size = 1871
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/HTML", null, null);		// Test [207] <- Index 207
		if(replayMode)
		{
			long proxyDataRecordId =1655106509615L;
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






		// --- HTTP REQUEST: Test [208] <- WEB ADMIN Index 382 ---
		String requestProt0208 = "https";
		String requestHost0208 = "consumer.fis.boh.com";
		int    requestPort0208 = 443;
		String requestFile0208 = "/D1BOHConsumer/services/security/info";
		String requestHeader0208 = "GET " + requestFile0208 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0208, requestHost0208, requestPort0208, requestHeader0208, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0208 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 290
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [208] <- Index 208
		if(replayMode)
		{
			long proxyDataRecordId =1655106509967L;
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






		// --- HTTP REQUEST: Test [209] <- WEB ADMIN Index 383 ---
		String requestProt0209 = "https";
		String requestHost0209 = "consumer.fis.boh.com";
		int    requestPort0209 = 443;
		String requestFile0209 = "/D1BOHConsumer/services/servicedefs";
		String requestHeader0209 = "GET " + requestFile0209 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json, text/plain, */*\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"X-Requested-With: XMLHttpRequest\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0209, requestHost0209, requestPort0209, requestHeader0209, null, requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
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
		requestHeader0209 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 4338
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [209] <- Index 209
		if(replayMode)
		{
			long proxyDataRecordId =1655106510364L;
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






		// --- HTTP REQUEST: Test [210] <- WEB ADMIN Index 386 ---
		String requestProt0210 = "https";
		String requestHost0210 = "consumer.fis.boh.com";
		int    requestPort0210 = 443;
		String requestFile0210 = "/consumer-sb/service/d1/ConsumerFooterSVC";
		String requestContent0210 = 
				"{\"_credentials\":{\"_deviceToken\":\"MgkJMglGaXJlZm94CTEwMS4wCTEJOWM3ZThhMWEtY2MxMS00OTZjLWE5NjEtMWMxOGNhOGFmNGEyCWRpZ2l0YWxCQU5LSU5HLTEuMC4wLjAJCTE2NTUxMDY1MTEzMDkJCUNvbnN1bWVyRm9vdGVyU1ZDCQllbglmZDcxMjBhMy03ZDcxLTRiMDktYjJiYy04NDQ5Y2I2YjcyMjAK\"},\"_lang\":\"en\",\"_optionalParams\":null,\"_params\":[\"140-all-all\",\"en\",\"digitalBANKING\",\"consumer\"]}";
		String requestHeader0210 = "POST " + requestFile0210 + " HTTP/" + httpProtocolVersion + "\r\n" + 
				"Host: consumer.fis.boh.com\r\n" + 
				"User-Agent: " + USER_AGENT_1 + "\r\n" + 
				"Accept: application/json\r\n" + 
				"Accept-Language: en-US,en;q=0.5\r\n" + 
				"Accept-Encoding: gzip, deflate, br\r\n" + 
				"Content-Type: application/json\r\n" + 
				"Content-Length: " + requestContent0210.getBytes().length + "\r\n" + 		// Content-Length: 339
				"Origin: https://consumer.fis.boh.com\r\n" + 
				"Connection: Keep-Alive\r\n" + 
				"Referer: https://consumer.fis.boh.com/D1BOHConsumer/\r\n" + 
				"Sec-Fetch-Dest: empty\r\n" + 
				"Sec-Fetch-Mode: cors\r\n" + 
				"Sec-Fetch-Site: same-origin\r\n" + 
				"\r\n";

		// execute request
		testURL = new HttpTestURL(requestProt0210, requestHost0210, requestPort0210, requestHeader0210, requestContent0210.getBytes(), requestTimeout, socketPool, cookieHandler, httpLogVectorObject);
		if (userNextProxyConfig != null)
			testURL.setProxy(userNextProxyConfig);
		testURL.setDNSContext(userDNSContext);
		performanceData.setInfoText(threadStep, testURL, -1);		// hint: param #3 is the maximum acceptable response time in milliseconds (-1 = not configured)
		log("[" + threadStep + "] " + testURL.getRequestInfoText() + " ...");
		if (debugLoops)
		{
			if (Lib.isAsciiContent(testURL.getRequestContent(), 256))
				log(">>> " + new String(testURL.getRequestContent()));
			else
				log(">>> [binary data]");
		}

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
		requestHeader0210 = null;		// support garbage collector to reduce memory
		requestContent0210 = null;		// support garbage collector to reduce memory
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JSON", header text fragment = [verification disabled], recorded content size = 593
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JSON", null, null);		// Test [210] <- Index 210
		if(replayMode)
		{
			long proxyDataRecordId =1655106511320L;
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




		// all http requests of page #4 successful done
		return true;
	}



	boolean synchResponsesParallelRequestsPage_1(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext, Object httpLogVectorObject) throws Exception
	{
		int lastThreadStepInMainThread = threadStep;		// save last executed thread step
		
		// wait for the response of all parallel requests
		threadStep = pageThreadHandler.getLastThreadStep();
		pageThreadHandler.waitForSynch();
		log("Page 1 Time = " + pageThreadHandler.getPageTime() + " ms");
		
		
		threadStep = pageThreadHandler.getFirstThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 3573
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [2] <- Index 2
		if(replayMode)
		{
			long proxyDataRecordId =1655106331691L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 599003
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [3] <- Index 3
		if(replayMode)
		{
			long proxyDataRecordId =1655106331784L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 4351
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [4] <- Index 4
		if(replayMode)
		{
			long proxyDataRecordId =1655106331851L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 1014
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [5] <- Index 5
		if(replayMode)
		{
			long proxyDataRecordId =1655106331852L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 1253
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [6] <- Index 6
		if(replayMode)
		{
			long proxyDataRecordId =1655106331865L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 14631
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [7] <- Index 7
		if(replayMode)
		{
			long proxyDataRecordId =1655106331885L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 1654
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [8] <- Index 8
		if(replayMode)
		{
			long proxyDataRecordId =1655106331886L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 4954
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, null);		// Test [9] <- Index 9
		if(replayMode)
		{
			long proxyDataRecordId =1655106332011L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 59948
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, null);		// Test [10] <- Index 10
		if(replayMode)
		{
			long proxyDataRecordId =1655106332023L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 355
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [11] <- Index 11
		if(replayMode)
		{
			long proxyDataRecordId =1655106332061L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 6227
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [12] <- Index 12
		if(replayMode)
		{
			long proxyDataRecordId =1655106332069L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 22242
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [13] <- Index 13
		if(replayMode)
		{
			long proxyDataRecordId =1655106332098L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 120879
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [14] <- Index 14
		if(replayMode)
		{
			long proxyDataRecordId =1655106332157L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 454154
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [15] <- Index 15
		if(replayMode)
		{
			long proxyDataRecordId =1655106332170L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 49105
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, null);		// Test [16] <- Index 16
		if(replayMode)
		{
			long proxyDataRecordId =1655106332427L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "FONT/WOFF", header text fragment = [verification disabled], recorded content size = 45960
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "FONT/WOFF", null, null);		// Test [17] <- Index 17
		if(replayMode)
		{
			long proxyDataRecordId =1655106332761L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "IMAGE/PNG", header text fragment = [verification disabled], recorded content size = 4196
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "IMAGE/PNG", null, null);		// Test [18] <- Index 18
		if(replayMode)
		{
			long proxyDataRecordId =1655106332857L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 559
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, null);		// Test [21] <- Index 21
		if(replayMode)
		{
			long proxyDataRecordId =1655106332908L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/FONT-WOFF2", header text fragment = [verification disabled], recorded content size = 77160
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/FONT-WOFF2", null, null);		// Test [23] <- Index 23
		if(replayMode)
		{
			long proxyDataRecordId =1655106332940L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 5086
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [24] <- Index 24
		if(replayMode)
		{
			long proxyDataRecordId =1655106333152L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 7373
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [25] <- Index 25
		if(replayMode)
		{
			long proxyDataRecordId =1655106333161L;
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


		
		if (!writeHttpAsyncResponseTabOutput_1(loopPluginContext,lastThreadStepInMainThread, innerLoopContext, totalLoopCounter))
			return false;
		
		// all done
		threadStep = lastThreadStepInMainThread;		// restore last executed thread step
		return true;		// end of asynch response checks for this page
	}
	
	
	private boolean writeHttpAsyncResponseTabOutput_1 (LoadtestPluginContext loopPluginContext, int lastThreadStepInMainThread, InnerLoopContext innerLoopContext, int totalLoopCounter) throws Exception
	{
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 8307
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [26] <- Index 26
		if(replayMode)
		{
			long proxyDataRecordId =1655106333170L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 13909
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [27] <- Index 27
		if(replayMode)
		{
			long proxyDataRecordId =1655106333234L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 22685
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [28] <- Index 28
		if(replayMode)
		{
			long proxyDataRecordId =1655106333258L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 40286
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [29] <- Index 29
		if(replayMode)
		{
			long proxyDataRecordId =1655106333272L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 19454
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [30] <- Index 30
		if(replayMode)
		{
			long proxyDataRecordId =1655106333291L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 1912
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [32] <- Index 32
		if(replayMode)
		{
			long proxyDataRecordId =1655106333815L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 6527
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [33] <- Index 33
		if(replayMode)
		{
			long proxyDataRecordId =1655106333829L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 4248
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [34] <- Index 34
		if(replayMode)
		{
			long proxyDataRecordId =1655106333923L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 11313
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [35] <- Index 35
		if(replayMode)
		{
			long proxyDataRecordId =1655106333938L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 6806
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [36] <- Index 36
		if(replayMode)
		{
			long proxyDataRecordId =1655106333939L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 10055
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [37] <- Index 37
		if(replayMode)
		{
			long proxyDataRecordId =1655106333940L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 6100
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [38] <- Index 38
		if(replayMode)
		{
			long proxyDataRecordId =1655106333942L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 17650
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [39] <- Index 39
		if(replayMode)
		{
			long proxyDataRecordId =1655106334082L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "FONT/WOFF", header text fragment = [verification disabled], recorded content size = 216772
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "FONT/WOFF", null, null);		// Test [41] <- Index 41
		if(replayMode)
		{
			long proxyDataRecordId =1655106334331L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/FONT-WOFF2", header text fragment = [verification disabled], recorded content size = 17536
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/FONT-WOFF2", null, null);		// Test [42] <- Index 42
		if(replayMode)
		{
			long proxyDataRecordId =1655106334367L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 5346
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [54] <- Index 54
		if(replayMode)
		{
			long proxyDataRecordId =1655106335345L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "FONT/WOFF", header text fragment = [verification disabled], recorded content size = 66096
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "FONT/WOFF", null, null);		// Test [56] <- Index 56
		if(replayMode)
		{
			long proxyDataRecordId =1655106335434L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 7706
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [57] <- Index 57
		if(replayMode)
		{
			long proxyDataRecordId =1655106335605L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 9039
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [58] <- Index 58
		if(replayMode)
		{
			long proxyDataRecordId =1655106335614L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 11372
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [59] <- Index 59
		if(replayMode)
		{
			long proxyDataRecordId =1655106335666L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "FONT/WOFF", header text fragment = [verification disabled], recorded content size = 139644
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "FONT/WOFF", null, null);		// Test [63] <- Index 63
		if(replayMode)
		{
			long proxyDataRecordId =1655106335843L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "IMAGE/PNG", header text fragment = [verification disabled], recorded content size = 1435
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "IMAGE/PNG", null, null);		// Test [64] <- Index 64
		if(replayMode)
		{
			long proxyDataRecordId =1655106335892L;
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


		
		return true;		// end of asynch response checks for this page
	}



	boolean synchResponsesParallelRequestsPage_2(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext, Object httpLogVectorObject) throws Exception
	{
		int lastThreadStepInMainThread = threadStep;		// save last executed thread step
		
		// wait for the response of all parallel requests
		threadStep = pageThreadHandler.getLastThreadStep();
		pageThreadHandler.waitForSynch();
		log("Page 2 Time = " + pageThreadHandler.getPageTime() + " ms");
		
		
		threadStep = pageThreadHandler.getFirstThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 1014
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [71] <- Index 71
		if(replayMode)
		{
			long proxyDataRecordId =1655106424614L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 355
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [72] <- Index 72
		if(replayMode)
		{
			long proxyDataRecordId =1655106424789L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "TEXT/CSS", header text fragment = [verification disabled], recorded content size = 559
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "TEXT/CSS", null, null);		// Test [75] <- Index 75
		if(replayMode)
		{
			long proxyDataRecordId =1655106425222L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 19713
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [135] <- Index 135
		if(replayMode)
		{
			long proxyDataRecordId =1655106429431L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 8779
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [136] <- Index 136
		if(replayMode)
		{
			long proxyDataRecordId =1655106429449L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 10003
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [137] <- Index 137
		if(replayMode)
		{
			long proxyDataRecordId =1655106429495L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 6361
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [138] <- Index 138
		if(replayMode)
		{
			long proxyDataRecordId =1655106429542L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 3547
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [139] <- Index 139
		if(replayMode)
		{
			long proxyDataRecordId =1655106429559L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 10588
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [141] <- Index 141
		if(replayMode)
		{
			long proxyDataRecordId =1655106429602L;
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


		
		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 7612
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [142] <- Index 142
		if(replayMode)
		{
			long proxyDataRecordId =1655106429642L;
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


		
		if (!writeHttpAsyncResponseTabOutput_2(loopPluginContext,lastThreadStepInMainThread, innerLoopContext, totalLoopCounter))
			return false;
		
		// all done
		threadStep = lastThreadStepInMainThread;		// restore last executed thread step
		return true;		// end of asynch response checks for this page
	}
	
	
	private boolean writeHttpAsyncResponseTabOutput_2 (LoadtestPluginContext loopPluginContext, int lastThreadStepInMainThread, InnerLoopContext innerLoopContext, int totalLoopCounter) throws Exception
	{
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 6233
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [145] <- Index 145
		if(replayMode)
		{
			long proxyDataRecordId =1655106429714L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 4889
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [146] <- Index 146
		if(replayMode)
		{
			long proxyDataRecordId =1655106429734L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 7670
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [147] <- Index 147
		if(replayMode)
		{
			long proxyDataRecordId =1655106429754L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 7485
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [148] <- Index 148
		if(replayMode)
		{
			long proxyDataRecordId =1655106429822L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 4495
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [159] <- Index 159
		if(replayMode)
		{
			long proxyDataRecordId =1655106430370L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 5272
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [160] <- Index 160
		if(replayMode)
		{
			long proxyDataRecordId =1655106430476L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 15897
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [161] <- Index 161
		if(replayMode)
		{
			long proxyDataRecordId =1655106430487L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = [verification disabled], header text fragment = [verification disabled], recorded content size = 0
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, null, null, null);		// Test [165] <- Index 165
		if(replayMode)
		{
			long proxyDataRecordId =1655106430618L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 9604
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [193] <- Index 193
		if(replayMode)
		{
			long proxyDataRecordId =1655106434005L;
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


		
		threadStep = pageThreadHandler.getNextThreadStep();
		if (threadStep == -1)
		{
			log("[" + threadStep + "] asynch request not executed - loop aborted by checking the result of previous request");
			threadStep = lastThreadStepInMainThread;		// restore last executed thread step
			return true;
		}
		testURL = pageThreadHandler.getHttpTestURL(threadStep);
		log("[" + threadStep + "] check response of asynch request " + testURL.getRequestInfoText() + " ...");
		log("   " + testURL.getShortResultText());

		// verify response: status code = 200, content type = "APPLICATION/JAVASCRIPT", header text fragment = [verification disabled], recorded content size = 6594
		// content test algorithm: none - no content check
		urlCallPassed = httpResponseOk(testURL, threadStep, new int[] {200}, "APPLICATION/JAVASCRIPT", null, null);		// Test [194] <- Index 194
		if(replayMode)
		{
			long proxyDataRecordId =1655106434023L;
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


		
		return true;		// end of asynch response checks for this page
	}



	boolean synchResponsesParallelRequestsPage_3(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext, Object httpLogVectorObject) throws Exception
	{
		int lastThreadStepInMainThread = threadStep;		// save last executed thread step
		
		// wait for the response of all parallel requests
		threadStep = pageThreadHandler.getLastThreadStep();
		pageThreadHandler.waitForSynch();
		log("Page 3 Time = " + pageThreadHandler.getPageTime() + " ms");
		
		if (!writeHttpAsyncResponseTabOutput_3(loopPluginContext,lastThreadStepInMainThread, innerLoopContext, totalLoopCounter))
			return false;
		
		// all done
		threadStep = lastThreadStepInMainThread;		// restore last executed thread step
		return true;		// end of asynch response checks for this page
	}
	
	
	private boolean writeHttpAsyncResponseTabOutput_3 (LoadtestPluginContext loopPluginContext, int lastThreadStepInMainThread, InnerLoopContext innerLoopContext, int totalLoopCounter) throws Exception
	{
		return true;		// end of asynch response checks for this page
	}



	boolean synchResponsesParallelRequestsPage_4(int totalLoopCounter, LoadtestPluginContext loopPluginContext, InnerLoopContext innerLoopContext, Object httpLogVectorObject) throws Exception
	{
		int lastThreadStepInMainThread = threadStep;		// save last executed thread step
		
		// wait for the response of all parallel requests
		threadStep = pageThreadHandler.getLastThreadStep();
		pageThreadHandler.waitForSynch();
		log("Page 4 Time = " + pageThreadHandler.getPageTime() + " ms");
		
		if (!writeHttpAsyncResponseTabOutput_4(loopPluginContext,lastThreadStepInMainThread, innerLoopContext, totalLoopCounter))
			return false;
		
		// all done
		threadStep = lastThreadStepInMainThread;		// restore last executed thread step
		return true;		// end of asynch response checks for this page
	}
	
	
	private boolean writeHttpAsyncResponseTabOutput_4 (LoadtestPluginContext loopPluginContext, int lastThreadStepInMainThread, InnerLoopContext innerLoopContext, int totalLoopCounter) throws Exception
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
				dumpLog(System.out);				// full log
				System.err.println("*** INTERNAL ERROR / LOAD TEST ABORTED *** Please verify the variables/user input fields/user input files/inline scripts");
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
			System.out.println("-vThinkTime <user-input-field>           ->> required argument: think time");
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
		
		// parse -vThinkTime argument or ask --> <user-input-field>: proposed value = "3"
		try
		{
			vThinkTime = UserInputField.readFromObjectString(USER_INPUT_FIELD_vThinkTime).readUserInputValue(args);
			if (vThinkTime.startsWith("\"") && vThinkTime.endsWith("\""))
				vThinkTime = vThinkTime.substring(1, vThinkTime.length() - 1);
		}
		catch (IOException ie)
		{
			System.out.println("*** INTERNAL ERROR: invalid user input field object-string declaration for 'vThinkTime' ***");
			ie.printStackTrace();
			System.exit(-2);
		}
		
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
		
		String genericFileName = PerformanceData.proposeFileName("D1PRDLogin_v03_061522", concurrentUsers, ParseArgs.getString(args, "-executionPlan"));
		
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
		System.out.println("# max. parallel threads per user = " + maxParallelThreadsPerUser);
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
		final int PAGE_BREAKS = 4;  // number of page breaks in execute()  - modify this value if you add or delete some page breaks
		final int MAX_THREAD_STEPS = 207;  // number of URL requests in execute() - modify this value if you add or delete some requests
		performanceData = new PerformanceData(PAGE_BREAKS, MAX_THREAD_STEPS, concurrentUsers, maxParallelThreadsPerUser, plannedTestDuration, maxPlannedLoops, httpProtocolVersion, plannedStartupDelay, plannedRequestTimeout, samplingInterval, percentilePageSampling, percentileUrlSampling, percentileUrlSamplingAddOption);
		performanceData.setInfoText("D1PRDLogin_v03_061522");
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
		performanceData.addUserInputField("think time", vThinkTime);		// add user input field name and value to performance data
		
		
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
		
		// log the initial value of all global vars
		if (debugLoops || debugFailedLoops)
		{
			System.out.println("global var <<< vThinkTime = " + vThinkTime);
			System.out.println();
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
		LoadtestPluginContext globalPluginContext = new LoadtestPluginContext(prxVersion, prxCharEncoding, new D1PRDLogin_v03_061522());
		
		
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
				
				D1PRDLogin_v03_061522 simulatedUser = new D1PRDLogin_v03_061522(maxPlannedLoops, plannedRequestTimeout, getUserContextTable().getUserContextList().size());
				
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
				
				D1PRDLogin_v03_061522 simulatedUser = new D1PRDLogin_v03_061522(maxPlannedLoops, plannedRequestTimeout, getUserContextTable().getUserContextList().size());
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
				
				D1PRDLogin_v03_061522 simulatedUser = new D1PRDLogin_v03_061522(maxPlannedLoops, plannedRequestTimeout, getUserContextTable().getUserContextList().size());
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

