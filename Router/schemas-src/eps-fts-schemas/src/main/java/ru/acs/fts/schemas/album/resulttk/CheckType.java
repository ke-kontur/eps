
package ru.acs.fts.schemas.album.resulttk;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Квитанция
 */
public class CheckType extends DocumentBaseType
{
    private String sum;

    /** 
     * Get the 'Sum' element value. Сумма дорожных сборов/штрафа
     * 
     * @return value
     */
    public String getSum() {
        return sum;
    }

    /** 
     * Set the 'Sum' element value. Сумма дорожных сборов/штрафа
     * 
     * @param sum
     */
    public void setSum(String sum) {
        this.sum = sum;
    }
}
