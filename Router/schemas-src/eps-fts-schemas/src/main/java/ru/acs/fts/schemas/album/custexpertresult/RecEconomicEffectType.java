
package ru.acs.fts.schemas.album.custexpertresult;

/** 
 * ���������� ������������� ������
 */
public class RecEconomicEffectType extends SumType
{
    private String economicEffect;

    /** 
     * Get the 'EconomicEffect' element value. ���������� ������������� ������ ��������: 1- ���������� �������; 2- ���; 3- ������; 4-������; 5- ����� �������� �������, ���������� ��  ���������� �������, ���������� � ����������� �������������; 6-�����, ��������������� ������
     * 
     * @return value
     */
    public String getEconomicEffect() {
        return economicEffect;
    }

    /** 
     * Set the 'EconomicEffect' element value. ���������� ������������� ������ ��������: 1- ���������� �������; 2- ���; 3- ������; 4-������; 5- ����� �������� �������, ���������� ��  ���������� �������, ���������� � ����������� �������������; 6-�����, ��������������� ������
     * 
     * @param economicEffect
     */
    public void setEconomicEffect(String economicEffect) {
        this.economicEffect = economicEffect;
    }
}
