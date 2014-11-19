
package ru.acs.fts.schemas.album.dealpassport;

import org.joda.time.LocalDate;

/** 
 * Номер паспорта сделки
 */
public class DPNumberType
{
    private String part1;
    private String part2;
    private String part3;
    private String part4;
    private String part5;
    private LocalDate issueDate;

    /** 
     * Get the 'Part1' element value. Номер ПС - часть 1. 2 знака - две последние цифры года, в котором оформлен ПС, 2 знака - номер месяца в котором оформлен ПС, 4 знака - порядковый номер оформленного банком ПС в течение календарного месяца по виду контракта, код которого указан в третьей части номера ПС.
     * 
     * @return value
     */
    public String getPart1() {
        return part1;
    }

    /** 
     * Set the 'Part1' element value. Номер ПС - часть 1. 2 знака - две последние цифры года, в котором оформлен ПС, 2 знака - номер месяца в котором оформлен ПС, 4 знака - порядковый номер оформленного банком ПС в течение календарного месяца по виду контракта, код которого указан в третьей части номера ПС.
     * 
     * @param part1
     */
    public void setPart1(String part1) {
        this.part1 = part1;
    }

    /** 
     * Get the 'Part2' element value. Номер ПС - часть 2. Регистрационный номер банка.
     * 
     * @return value
     */
    public String getPart2() {
        return part2;
    }

    /** 
     * Set the 'Part2' element value. Номер ПС - часть 2. Регистрационный номер банка.
     * 
     * @param part2
     */
    public void setPart2(String part2) {
        this.part2 = part2;
    }

    /** 
     * Get the 'Part3' element value. Номер ПС - часть 3. Регистрационный номер филиала банка. При отсутствии филиала выставляется "0000".
     * 
     * @return value
     */
    public String getPart3() {
        return part3;
    }

    /** 
     * Set the 'Part3' element value. Номер ПС - часть 3. Регистрационный номер филиала банка. При отсутствии филиала выставляется "0000".
     * 
     * @param part3
     */
    public void setPart3(String part3) {
        this.part3 = part3;
    }

    /** 
     * Get the 'Part4' element value. Номер ПС - часть 4. Вид контракта (кредитного договора) - согласно инструкции ЦБ РФ от 15.06.2004 г.  N 117-И.
     * 
     * @return value
     */
    public String getPart4() {
        return part4;
    }

    /** 
     * Set the 'Part4' element value. Номер ПС - часть 4. Вид контракта (кредитного договора) - согласно инструкции ЦБ РФ от 15.06.2004 г.  N 117-И.
     * 
     * @param part4
     */
    public void setPart4(String part4) {
        this.part4 = part4;
    }

    /** 
     * Get the 'Part5' element value. Номер ПС - часть 5.
     * 
     * @return value
     */
    public String getPart5() {
        return part5;
    }

    /** 
     * Set the 'Part5' element value. Номер ПС - часть 5.
     * 
     * @param part5
     */
    public void setPart5(String part5) {
        this.part5 = part5;
    }

    /** 
     * Get the 'IssueDate' element value. Дата подписания Паспорта сделки ответственным лицом банка
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата подписания Паспорта сделки ответственным лицом банка
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }
}
