
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Порядковый номер Решения, присваиваемый по журналу регистрации решений о внесении изменений в сведения, содержащиеся в ДТ, после выпуска товаров и корректировке ее электронной копии
 */
public class SolutionNumberType extends GTDIDType
{
    private String code;
    private String solutionInformation;

    /** 
     * Get the 'Code' element value. Код корректировки в соответствии с классификатором типов корректировки ДТ после выпуска товаров
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. Код корректировки в соответствии с классификатором типов корректировки ДТ после выпуска товаров
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'SolutionInformation' element value. Информация о принятом решении на внесение изменений в ДТ
     * 
     * @return value
     */
    public String getSolutionInformation() {
        return solutionInformation;
    }

    /** 
     * Set the 'SolutionInformation' element value. Информация о принятом решении на внесение изменений в ДТ
     * 
     * @param solutionInformation
     */
    public void setSolutionInformation(String solutionInformation) {
        this.solutionInformation = solutionInformation;
    }
}
