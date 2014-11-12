package ru.acs.monitoring.common.utils;

/**
 * RandomGUID
 * @version 1.2.1 11/05/02
 * @author Marc A. Mnich
 *
 * From www.JavaExchange.com, Open Software licensing
 * @@see http://www.javaexchange.com/aboutRandomGUID.html
 *
 * 11/05/02 -- Performance enhancement from Mike Dubman.  
 *             Moved InetAddr.getLocal to static block.  Mike has measured
 *             a 10 fold improvement in run time.
 * 01/29/02 -- Bug fix: Improper seeding of nonsecure Random object
 *             caused duplicate GUIDs to be produced.  Random object
 *             is now only created once per JVM.
 * 01/19/02 -- Modified random seeding and added new constructor
 *             to allow secure random feature.
 * 01/14/02 -- Added random function seeding with JVM run time
 *
 */

import java.net.InetAddress;
import java.security.SecureRandom;

/**
 * <h1>RandomGUID</h1>
 * <p>
 * @version 1.2.1 11/05/02
 * @author Marc A. Mnich
 *</p>
 * <br>From www.JavaExchange.com, Open Software licensing
 * <br>
 * <pre>
 * In the multitude of java GUID generators, I found none that
 * guaranteed randomness.  GUIDs are guaranteed to be globally unique
 * by using ethernet MACs, IP addresses, time elements, and sequential
 * numbers.  GUIDs are not expected to be random and most often are
 * easy/possible to guess given a sample from a given generator.
 * SQL Server, for example generates GUID that are unique but
 * sequencial within a given instance.
 *
 * GUIDs can be used as security devices to hide things such as
 * files within a filesystem where listings are unavailable (e.g. files
 * that are served up from a Web server with indexing turned off).
 * This may be desireable in cases where standard authentication is not
 * appropriate. In this scenario, the RandomGUIDs are used as directories.
 * Another example is the use of GUIDs for primary keys in a database
 * where you want to ensure that the keys are secret.  Random GUIDs can
 * then be used in a URL to prevent hackers (or users) from accessing
 * records by guessing or simply by incrementing sequential numbers.
 *
 * There are many other possiblities of using GUIDs in the realm of
 * security and encryption where the element of randomness is important.
 * This class was written for these purposes but can also be used as a
 * general purpose GUID generator as well.
 *
 * RandomGUID generates truly random GUIDs by using the system's
 * IP address (name/IP), system time in milliseconds (as an integer),
 * and a very large random number joined together in a single String
 * that is passed through an MD5 hash.  The IP address and system time
 * make the MD5 seed globally unique and the random number guarantees
 * that the generated GUIDs will have no discernable pattern and
 * cannot be guessed given any number of previously generated GUIDs.
 * It is generally not possible to access the seed information (IP, time,
 * random number) from the resulting GUIDs as the MD5 hash algorithm
 * provides one way encryption.
 *
 * ----> Security of RandomGUID: <-----
 * RandomGUID can be called one of two ways -- with the basic java Random
 * number generator or a cryptographically strong random generator
 * (SecureRandom).  The choice is offered because the secure random
 * generator takes about 3.5 times longer to generate its random numbers
 * and this performance hit may not be worth the added security
 * especially considering the basic generator is seeded with a
 * cryptographically strong random seed.
 *
 * Seeding the basic generator in this way effectively decouples
 * the random numbers from the time component making it virtually impossible
 * to predict the random number component even if one had absolute knowledge
 * of the System time.  Thanks to Ashutosh Narhari for the suggestion
 * of using the static method to prime the basic random generator.
 *
 * Using the secure random option, this class compies with the statistical
 * random number generator tests specified in FIPS 140-2, Security
 * Requirements for Cryptographic Modules, secition 4.9.1.
 *
 * I converted all the pieces of the seed to a String before handing
 * it over to the MD5 hash so that you could print it out to make
 * sure it contains the data you expect to see and to give a nice
 * warm fuzzy.  If you need better performance, you may want to stick
 * to byte[] arrays.
 *
 * I believe that it is important that the algorithm for
 * generating random GUIDs be open for inspection and modification.
 * This class is free for all uses.
 *
 *
 * - Marc
 * </pre>
 * @see <a href=http://www.javaexchange.com/aboutRandomGUID.html>aboutRandomGUID</a>
 */

public class RandomGUID extends Object {
    /*
     * Convert to the standard format for GUID
     * (Useful for SQL Server UniqueIdentifiers, etc.)
     * Example: C2FEEEAC-CFCD-11D1-8B05-00600806D9B6
     */
	private String guidValue;
	
	public RandomGUID(){
		guidValue = generateGUID(this);
	}
	
    @Override
    public String toString() {  
        String raw = guidValue.toUpperCase();
        StringBuffer sb = new StringBuffer();
        sb.append(raw.substring(0, 8));
        sb.append("-");
        sb.append(raw.substring(8, 12));
        sb.append("-");
        sb.append(raw.substring(12, 16));
        sb.append("-");
        sb.append(raw.substring(16, 20));
        sb.append("-");
        sb.append(raw.substring(20));
    	return sb.toString();
    }
    
    /* ****************************************************************************************** */
    

    /**
     * <p> UUIDpea. </p>
     *
     * @version ������ 1.0
     * @author ������������ ����, ����� ���
     */
    
    /** Cached per JVM server IP. */
    private static String hexServerIP = null;

    // initialise the secure random instance
    private static final SecureRandom seeder = new SecureRandom();

    /**
     * A 32 byte GUID generator (Globally Unique ID).
     * These artificial keys SHOULD <strong>NOT</strong> be seen by the user,
     * not even touched by the DBA but with very rare exceptions, just
     * manipulated by the database and the programs.
     *
     * Usage: Add an id field (type java.lang.String) to your EJB,
     * and add setId(XXXUtil.generateGUID(this)); to the ejbCreate method.
     */
    public static synchronized final String generateGUID(Object o)
    {
        StringBuffer tmpBuffer = new StringBuffer(16);

        if(hexServerIP == null)
        {
            InetAddress localInetAddress = null;
            try
            {
                // get the inet address
                localInetAddress = InetAddress.getLocalHost();
             }
             catch(java.net.UnknownHostException uhe)
             {
                System.err.println(
                    "Could not get local IP address" +
                    " using InetAddress.getLocalHost()!");
                // need to find better way to get around this
                // (get local IP address)...

                uhe.printStackTrace();

                return null;
             }

            byte serverIP[] = localInetAddress.getAddress();
            hexServerIP = hexFormat(getInt(serverIP), 8);
        }

        String hashcode = hexFormat(System.identityHashCode(o), 8);
        tmpBuffer.append(hexServerIP);
        tmpBuffer.append(hashcode);

        long timeNow      = System.currentTimeMillis();
        int timeLow       = (int)timeNow & 0xFFFFFFFF;
        int node          = seeder.nextInt();

        StringBuffer guid = new StringBuffer(32);
        guid.append(hexFormat(timeLow, 8));
        guid.append(tmpBuffer.toString());
        guid.append(hexFormat(node, 8));
        return guid.toString();
    }
    //---------------------------------------------------------------------------------------------
    private static int getInt(byte bytes[])
    {
        int i = 0;
        int j = 24;
        for (int k = 0; j >= 0; k++)
        {
            int l = bytes[k] & 0xff;
            i += l << j;
            j -= 8;
        }
        return i;
    }
    //---------------------------------------------------------------------------------------------
    private static String hexFormat(int i, int j)
    {
        String s = Integer.toHexString(i);
        return padHex(s, j) + s;
    }
    //---------------------------------------------------------------------------------------------
    private static String padHex(String s, int i)
    {
        StringBuffer tmpBuffer = new StringBuffer();
        if (s.length() < i)
        {
            for (int j = 0; j < i - s.length(); j++)
            {
                tmpBuffer.append('0');
            }
        }
        return tmpBuffer.toString();
    }
}