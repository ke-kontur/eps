
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * Сведения о количестве принятой и переданной электроэнергии за отчетный период
 */
public class CUElectricalEnergyType
{
    private String electricalEnergyQuantity;
    private String qualifierCode;

    /** 
     * Get the 'ElectricalEnergyQuantity' element value. Количество электроэнергии
     * 
     * @return value
     */
    public String getElectricalEnergyQuantity() {
        return electricalEnergyQuantity;
    }

    /** 
     * Set the 'ElectricalEnergyQuantity' element value. Количество электроэнергии
     * 
     * @param electricalEnergyQuantity
     */
    public void setElectricalEnergyQuantity(String electricalEnergyQuantity) {
        this.electricalEnergyQuantity = electricalEnergyQuantity;
    }

    /** 
     * Get the 'QualifierCode' element value. Код единицы измерения
     * 
     * @return value
     */
    public String getQualifierCode() {
        return qualifierCode;
    }

    /** 
     * Set the 'QualifierCode' element value. Код единицы измерения
     * 
     * @param qualifierCode
     */
    public void setQualifierCode(String qualifierCode) {
        this.qualifierCode = qualifierCode;
    }
}
