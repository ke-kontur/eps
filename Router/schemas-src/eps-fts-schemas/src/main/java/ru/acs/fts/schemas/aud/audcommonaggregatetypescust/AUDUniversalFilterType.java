
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Параметры фильтра (оператор указан в каждом фильтре).
 */
public class AUDUniversalFilterType
{
    private int choiceSelect = -1;
    private static final int STRING_FILTER_PARAMS_CHOICE = 0;
    private static final int BOOLEAN_FILTER_PARAMS_CHOICE = 1;
    private static final int TIME_FILTER_PARAMS_CHOICE = 2;
    private static final int DATE_FILTER_PARAMS_CHOICE = 3;
    private static final int DATE_TIME_FILTER_PARAMS_CHOICE = 4;
    private static final int DURATION_FILTER_PARAMS_CHOICE = 5;
    private static final int REAL_NUMBER_FILTER_PARAMS_CHOICE = 6;
    private static final int INTEGER_NUMBER_FILTER_PARAMS_CHOICE = 7;
    private AUDStringFilterParamsType stringFilterParams;
    private AUDBooleanFilterParamsType booleanFilterParams;
    private AUDTimeFilterParamsType timeFilterParams;
    private AUDDateFilterParamsType dateFilterParams;
    private AUDDateTimeFilterParamsType dateTimeFilterParams;
    private AUDDurationFilterParamsType durationFilterParams;
    private AUDRealNumberFilterParamsType realNumberFilterParams;
    private AUDIntegerNumberFilterParamsType integerNumberFilterParams;

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if StringFilterParams is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifStringFilterParams() {
        return choiceSelect == STRING_FILTER_PARAMS_CHOICE;
    }

    /** 
     * Get the 'StringFilterParams' element value. Параметры фильтра для значения типа "string" (строка). Допустимые операторы: empty, not_empty, equal, not_equal, like.
     * 
     * @return value
     */
    public AUDStringFilterParamsType getStringFilterParams() {
        return stringFilterParams;
    }

    /** 
     * Set the 'StringFilterParams' element value. Параметры фильтра для значения типа "string" (строка). Допустимые операторы: empty, not_empty, equal, not_equal, like.
     * 
     * @param stringFilterParams
     */
    public void setStringFilterParams(
            AUDStringFilterParamsType stringFilterParams) {
        setChoiceSelect(STRING_FILTER_PARAMS_CHOICE);
        this.stringFilterParams = stringFilterParams;
    }

    /** 
     * Check if BooleanFilterParams is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifBooleanFilterParams() {
        return choiceSelect == BOOLEAN_FILTER_PARAMS_CHOICE;
    }

    /** 
     * Get the 'BooleanFilterParams' element value. Параметры фильтра для значения типа "boolean" (булевое). Допустимые операторы: empty, not_empty, equal, not_equal.
     * 
     * @return value
     */
    public AUDBooleanFilterParamsType getBooleanFilterParams() {
        return booleanFilterParams;
    }

    /** 
     * Set the 'BooleanFilterParams' element value. Параметры фильтра для значения типа "boolean" (булевое). Допустимые операторы: empty, not_empty, equal, not_equal.
     * 
     * @param booleanFilterParams
     */
    public void setBooleanFilterParams(
            AUDBooleanFilterParamsType booleanFilterParams) {
        setChoiceSelect(BOOLEAN_FILTER_PARAMS_CHOICE);
        this.booleanFilterParams = booleanFilterParams;
    }

    /** 
     * Check if TimeFilterParams is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTimeFilterParams() {
        return choiceSelect == TIME_FILTER_PARAMS_CHOICE;
    }

    /** 
     * Get the 'TimeFilterParams' element value. Параметры фильтра для значения типа "time" (время). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
     * 
     * @return value
     */
    public AUDTimeFilterParamsType getTimeFilterParams() {
        return timeFilterParams;
    }

    /** 
     * Set the 'TimeFilterParams' element value. Параметры фильтра для значения типа "time" (время). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
     * 
     * @param timeFilterParams
     */
    public void setTimeFilterParams(AUDTimeFilterParamsType timeFilterParams) {
        setChoiceSelect(TIME_FILTER_PARAMS_CHOICE);
        this.timeFilterParams = timeFilterParams;
    }

    /** 
     * Check if DateFilterParams is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDateFilterParams() {
        return choiceSelect == DATE_FILTER_PARAMS_CHOICE;
    }

    /** 
     * Get the 'DateFilterParams' element value. Параметры фильтра для значения типа "date" (дата). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
     * 
     * @return value
     */
    public AUDDateFilterParamsType getDateFilterParams() {
        return dateFilterParams;
    }

    /** 
     * Set the 'DateFilterParams' element value. Параметры фильтра для значения типа "date" (дата). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
     * 
     * @param dateFilterParams
     */
    public void setDateFilterParams(AUDDateFilterParamsType dateFilterParams) {
        setChoiceSelect(DATE_FILTER_PARAMS_CHOICE);
        this.dateFilterParams = dateFilterParams;
    }

    /** 
     * Check if DateTimeFilterParams is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDateTimeFilterParams() {
        return choiceSelect == DATE_TIME_FILTER_PARAMS_CHOICE;
    }

    /** 
     * Get the 'DateTimeFilterParams' element value. Параметры фильтра для значения типа "datetime" (дата и время). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
     * 
     * @return value
     */
    public AUDDateTimeFilterParamsType getDateTimeFilterParams() {
        return dateTimeFilterParams;
    }

    /** 
     * Set the 'DateTimeFilterParams' element value. Параметры фильтра для значения типа "datetime" (дата и время). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
     * 
     * @param dateTimeFilterParams
     */
    public void setDateTimeFilterParams(
            AUDDateTimeFilterParamsType dateTimeFilterParams) {
        setChoiceSelect(DATE_TIME_FILTER_PARAMS_CHOICE);
        this.dateTimeFilterParams = dateTimeFilterParams;
    }

    /** 
     * Check if DurationFilterParams is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDurationFilterParams() {
        return choiceSelect == DURATION_FILTER_PARAMS_CHOICE;
    }

    /** 
     * Get the 'DurationFilterParams' element value. Параметры фильтра для значения типа "duration" (длительность). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
     * 
     * @return value
     */
    public AUDDurationFilterParamsType getDurationFilterParams() {
        return durationFilterParams;
    }

    /** 
     * Set the 'DurationFilterParams' element value. Параметры фильтра для значения типа "duration" (длительность). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
     * 
     * @param durationFilterParams
     */
    public void setDurationFilterParams(
            AUDDurationFilterParamsType durationFilterParams) {
        setChoiceSelect(DURATION_FILTER_PARAMS_CHOICE);
        this.durationFilterParams = durationFilterParams;
    }

    /** 
     * Check if RealNumberFilterParams is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifRealNumberFilterParams() {
        return choiceSelect == REAL_NUMBER_FILTER_PARAMS_CHOICE;
    }

    /** 
     * Get the 'RealNumberFilterParams' element value. Параметры фильтра для значения типа "real" (вещественное число). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
     * 
     * @return value
     */
    public AUDRealNumberFilterParamsType getRealNumberFilterParams() {
        return realNumberFilterParams;
    }

    /** 
     * Set the 'RealNumberFilterParams' element value. Параметры фильтра для значения типа "real" (вещественное число). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
     * 
     * @param realNumberFilterParams
     */
    public void setRealNumberFilterParams(
            AUDRealNumberFilterParamsType realNumberFilterParams) {
        setChoiceSelect(REAL_NUMBER_FILTER_PARAMS_CHOICE);
        this.realNumberFilterParams = realNumberFilterParams;
    }

    /** 
     * Check if IntegerNumberFilterParams is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifIntegerNumberFilterParams() {
        return choiceSelect == INTEGER_NUMBER_FILTER_PARAMS_CHOICE;
    }

    /** 
     * Get the 'IntegerNumberFilterParams' element value. Параметры фильтра для значения типа "integer" (целое число). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
     * 
     * @return value
     */
    public AUDIntegerNumberFilterParamsType getIntegerNumberFilterParams() {
        return integerNumberFilterParams;
    }

    /** 
     * Set the 'IntegerNumberFilterParams' element value. Параметры фильтра для значения типа "integer" (целое число). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
     * 
     * @param integerNumberFilterParams
     */
    public void setIntegerNumberFilterParams(
            AUDIntegerNumberFilterParamsType integerNumberFilterParams) {
        setChoiceSelect(INTEGER_NUMBER_FILTER_PARAMS_CHOICE);
        this.integerNumberFilterParams = integerNumberFilterParams;
    }
}
