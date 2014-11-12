
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

/** 
 * Информация о реквизите документа и значение реквизита.
 */
public class AUDDocumentAttributeInfoAndValueType
        extends
            AUDDocumentAttributeInfoType
{
    private int choiceSelect = -1;
    private static final int STRING_VALUE_CHOICE = 0;
    private static final int TIME_VALUE_CHOICE = 1;
    private static final int DATE_VALUE_CHOICE = 2;
    private static final int DATE_TIME_VALUE_CHOICE = 3;
    private static final int DURATION_VALUE_CHOICE = 4;
    private static final int REAL_NUMBER_VALUE_CHOICE = 5;
    private static final int INTEGER_NUMBER_VALUE_CHOICE = 6;
    private static final int BOOLEAN_VALUE_CHOICE = 7;
    private String stringValue;
    private LocalTime timeValue;
    private LocalDate dateValue;
    private DateTime dateTimeValue;
    private String durationValue;
    private BigDecimal realNumberValue;
    private BigInteger integerNumberValue;
    private boolean booleanValue;

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
     * Check if StringValue is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifStringValue() {
        return choiceSelect == STRING_VALUE_CHOICE;
    }

    /** 
     * Get the 'StringValue' element value. Значение типа "string" (строка).
     * 
     * @return value
     */
    public String getStringValue() {
        return stringValue;
    }

    /** 
     * Set the 'StringValue' element value. Значение типа "string" (строка).
     * 
     * @param stringValue
     */
    public void setStringValue(String stringValue) {
        setChoiceSelect(STRING_VALUE_CHOICE);
        this.stringValue = stringValue;
    }

    /** 
     * Check if TimeValue is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTimeValue() {
        return choiceSelect == TIME_VALUE_CHOICE;
    }

    /** 
     * Get the 'TimeValue' element value. Значение типа "time" (время).
     * 
     * @return value
     */
    public LocalTime getTimeValue() {
        return timeValue;
    }

    /** 
     * Set the 'TimeValue' element value. Значение типа "time" (время).
     * 
     * @param timeValue
     */
    public void setTimeValue(LocalTime timeValue) {
        setChoiceSelect(TIME_VALUE_CHOICE);
        this.timeValue = timeValue;
    }

    /** 
     * Check if DateValue is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDateValue() {
        return choiceSelect == DATE_VALUE_CHOICE;
    }

    /** 
     * Get the 'DateValue' element value. Значение типа "date" (дата).
     * 
     * @return value
     */
    public LocalDate getDateValue() {
        return dateValue;
    }

    /** 
     * Set the 'DateValue' element value. Значение типа "date" (дата).
     * 
     * @param dateValue
     */
    public void setDateValue(LocalDate dateValue) {
        setChoiceSelect(DATE_VALUE_CHOICE);
        this.dateValue = dateValue;
    }

    /** 
     * Check if DateTimeValue is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDateTimeValue() {
        return choiceSelect == DATE_TIME_VALUE_CHOICE;
    }

    /** 
     * Get the 'DateTimeValue' element value. Значение типа "datetime" (дата и время).
     * 
     * @return value
     */
    public DateTime getDateTimeValue() {
        return dateTimeValue;
    }

    /** 
     * Set the 'DateTimeValue' element value. Значение типа "datetime" (дата и время).
     * 
     * @param dateTimeValue
     */
    public void setDateTimeValue(DateTime dateTimeValue) {
        setChoiceSelect(DATE_TIME_VALUE_CHOICE);
        this.dateTimeValue = dateTimeValue;
    }

    /** 
     * Check if DurationValue is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDurationValue() {
        return choiceSelect == DURATION_VALUE_CHOICE;
    }

    /** 
     * Get the 'DurationValue' element value. Значение типа "duration" (длительность).
     * 
     * @return value
     */
    public String getDurationValue() {
        return durationValue;
    }

    /** 
     * Set the 'DurationValue' element value. Значение типа "duration" (длительность).
     * 
     * @param durationValue
     */
    public void setDurationValue(String durationValue) {
        setChoiceSelect(DURATION_VALUE_CHOICE);
        this.durationValue = durationValue;
    }

    /** 
     * Check if RealNumberValue is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifRealNumberValue() {
        return choiceSelect == REAL_NUMBER_VALUE_CHOICE;
    }

    /** 
     * Get the 'RealNumberValue' element value. Значение типа "real" (вещественное число)
     * 
     * @return value
     */
    public BigDecimal getRealNumberValue() {
        return realNumberValue;
    }

    /** 
     * Set the 'RealNumberValue' element value. Значение типа "real" (вещественное число)
     * 
     * @param realNumberValue
     */
    public void setRealNumberValue(BigDecimal realNumberValue) {
        setChoiceSelect(REAL_NUMBER_VALUE_CHOICE);
        this.realNumberValue = realNumberValue;
    }

    /** 
     * Check if IntegerNumberValue is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifIntegerNumberValue() {
        return choiceSelect == INTEGER_NUMBER_VALUE_CHOICE;
    }

    /** 
     * Get the 'IntegerNumberValue' element value. Значение типа "integer" (целое число).
     * 
     * @return value
     */
    public BigInteger getIntegerNumberValue() {
        return integerNumberValue;
    }

    /** 
     * Set the 'IntegerNumberValue' element value. Значение типа "integer" (целое число).
     * 
     * @param integerNumberValue
     */
    public void setIntegerNumberValue(BigInteger integerNumberValue) {
        setChoiceSelect(INTEGER_NUMBER_VALUE_CHOICE);
        this.integerNumberValue = integerNumberValue;
    }

    /** 
     * Check if BooleanValue is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifBooleanValue() {
        return choiceSelect == BOOLEAN_VALUE_CHOICE;
    }

    /** 
     * Get the 'BooleanValue' element value. Значение типа "boolean" (булевое).
     * 
     * @return value
     */
    public boolean isBooleanValue() {
        return booleanValue;
    }

    /** 
     * Set the 'BooleanValue' element value. Значение типа "boolean" (булевое).
     * 
     * @param booleanValue
     */
    public void setBooleanValue(boolean booleanValue) {
        setChoiceSelect(BOOLEAN_VALUE_CHOICE);
        this.booleanValue = booleanValue;
    }
}
