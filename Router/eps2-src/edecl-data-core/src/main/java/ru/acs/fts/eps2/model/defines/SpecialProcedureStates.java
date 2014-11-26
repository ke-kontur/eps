package ru.acs.fts.eps2.model.defines;

public class SpecialProcedureStates
{
	/**
	 * Константа представляет статусное состояние "Процедура не открыта".
	 */
	public static final String PROC_NOT_OPEN_STATE = "Decl_ProcNotOpen";

	public static final String PROC_OPEN_STATE = "Decl_ProcOpen";
	public static final String PROC_UD_OPEN_STATE = "UD_Decl_ProcOpen";
	public static final String PROC_PP_OPEN_STATE = "PP_ProcOpen";
	
	/**
	 * Удаленный выпуск.
	 */
	public static final String IMP_UD = "Imp_UD";
	
	/**
	 * Статусная модель для удаленного выпуска. РТУ приграничного ТО.
	 */
	public static final String IMP_UD_EXT = "Imp_UD_Ext";
	
	/**
	 * Предварительная процедура декларирования
	 */
	public static final String PRE_PROC = "PreProc"; // NO_UCD (unused code)
	
	/**
	 * 
	 */
	public static final String UD_TR_ARRIVE_CH_FINISH = "UD_Tr_Arrive_Ch_Finish";

	public static final String UD_DECL_DUBLICATION_REQ_CH = "UD_Decl_DuplicationReq_Ch";
	
	/**
	 * Статусы при решении о корректировке таможенной стоимости после выпуска товаров 
	 */
	public static final String DECL_CORREC_CC = "Decl_CorrecCC";
	public static final String PTD_DECL_CORREC_CC = "PTD_Decl_CorrecCC";
	public static final String AEO_DECL_CORREC_CC = "AEO_Decl_CorrecCC";
	public static final String EXP_DECL_CORREC_CC = "Exp_Decl_CorrecCC";
	
	public static String getDefaultState( )
	{
		return PROC_NOT_OPEN_STATE;
	}
	
	public static boolean isSuchState( String test, String need )
	{
		if ( null == test || 0 == test.length( ) )
			return false;
		if ( null == need || 0 == need.length( ) )
			return false;
		
		return test.equalsIgnoreCase( need );
	}
}
