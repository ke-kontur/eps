package ru.acs.fts.eps2.router.defines;

public class ProcedureUdFlags
{
	private ProcedureUdFlags( ) { }
	
	/**
	 * Нет удаленки совсем
	 */
	public static final int NO_REMOTENESS = 0; // NO_UCD (use private)
	
	/**
	 * Удаленка в рамках одного РТУ
	 */
	public static final int LOCAL_REMOTENESS = 1;
	
	/**
	 * Удаленка в рамках многих РТУ
	 */
	public static final int REMOTE_REMOTENESS = 2;
	
	/**
	 * 
	 */
	public static final int ECONOMIC_OPERATORS = 3;
	
	/**
	 * Оформление транзита товаров при обмене с РЖД (Russian RailWays)
	 */
	public static final int RRW_TRANSIT = 4;

	public static final int UPI_TRANSIT = 5;
	
	public static boolean isNoRemoteness( int flag )
	{
		return NO_REMOTENESS == flag;
	}	
	
	public static boolean isEconomicOperator( int flag )
	{
		return ECONOMIC_OPERATORS == flag;
	}
	
	public static boolean isLocalRemoteness( int flag )
	{
		return LOCAL_REMOTENESS == flag;
	}
	
	public static boolean isRemoteRemoteness( int flag )
	{
		return REMOTE_REMOTENESS == flag;
	}
	
	public static boolean isRrwTransit( int flag )
	{
		return RRW_TRANSIT == flag;
	}

	public static boolean isUPITransit( int flag )
	{
		return UPI_TRANSIT == flag;
	}
	
	public static boolean isTrivialRemoteness( int flag )
	{
		return isLocalRemoteness( flag ) || isRemoteRemoteness( flag );
	}
}
